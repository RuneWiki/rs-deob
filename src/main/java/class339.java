import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class339 {

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "Z")
    public boolean field5079 = false;

    @OriginalMember(owner = "client!cr", name = "f", descriptor = "Z")
    private boolean field5082 = false;

    @OriginalMember(owner = "client!cr", name = "k", descriptor = "I")
    public int field5087 = 0;

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "Z")
    private boolean field5078 = false;

    @OriginalMember(owner = "client!cr", name = "l", descriptor = "Z")
    public boolean field5088 = true;

    @OriginalMember(owner = "client!cr", name = "g", descriptor = "[I")
    public int[] field5083 = new int[4096];

    @OriginalMember(owner = "client!cr", name = "j", descriptor = "Lwb;")
    private class127 field5086;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "[I")
    private int[] field5077;

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "I")
    private int field5081;

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "I")
    public int field5080;

    @OriginalMember(owner = "client!cr", name = "h", descriptor = "I")
    public int field5084;

    @OriginalMember(owner = "client!cr", name = "i", descriptor = "I")
    public int field5085;

    @OriginalMember(owner = "client!cr", name = "m", descriptor = "I")
    public int field5089;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "([I[IIIIIIIIFFFFFF)V")
    private final void method2070(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, float arg9, float arg10, float arg11, float arg12, float arg13, float arg14) {
        if (this.field5079) {
            if (arg6 > this.field5084) {
                arg6 = this.field5084;
            }
            if (arg5 < 0) {
                arg5 = 0;
            }
        }
        if (arg5 >= arg6) {
            return;
        }
        int var16 = arg4 + arg5;
        int var17 = arg5 * arg8 + arg7;
        int var18 = arg6 - arg5;
        int var10000;
        if (this.field5087 == 0) {
            if (this.field5082) {
                int var19 = arg5 - this.field5089;
                float var20 = arg12 / 8.0F * (float) var19 + arg9;
                float var21 = arg13 / 8.0F * (float) var19 + arg10;
                float var22 = arg14 / 8.0F * (float) var19 + arg11;
                int var23;
                int var24;
                if (var22 == 0.0F) {
                    var23 = 0;
                    var24 = 0;
                } else {
                    var23 = (int) (var20 * 4096.0F / var22);
                    var24 = (int) (var21 * 4096.0F / var22);
                }
                float var25 = arg12 + var20;
                float var26 = arg13 + var21;
                float var27 = arg14 + var22;
                int var28;
                int var29;
                if (var27 == 0.0F) {
                    var28 = 0;
                    var29 = 0;
                } else {
                    var28 = (int) (var25 * 4096.0F / var27);
                    var29 = (int) (var26 * 4096.0F / var27);
                }
                int var30 = (var23 << 20) + var24;
                int var31 = (var28 - var23 >> 3 << 20) + (var29 - var24 >> 3);
                int var32 = var18 >> 3;
                int var33 = arg8 << 3;
                int var34 = var17 >> 8;
                if (this.field5078) {
                    if (var32 > 0) {
                        do {
                            int var35 = arg1[(var30 >>> 26) + (var30 & 0xFC0)];
                            arg0[var16++] = ((var35 & 0xFF00FF) * var34 & 0xFF00FF00) + ((var35 & 0xFF00) * var34 & 0xFF0000) >> 8;
                            int var36 = var30 + var31;
                            int var37 = arg1[(var36 >>> 26) + (var36 & 0xFC0)];
                            arg0[var16++] = ((var37 & 0xFF00FF) * var34 & 0xFF00FF00) + ((var37 & 0xFF00) * var34 & 0xFF0000) >> 8;
                            int var38 = var31 + var36;
                            int var39 = arg1[(var38 >>> 26) + (var38 & 0xFC0)];
                            arg0[var16++] = ((var39 & 0xFF00FF) * var34 & 0xFF00FF00) + ((var39 & 0xFF00) * var34 & 0xFF0000) >> 8;
                            int var40 = var31 + var38;
                            int var41 = arg1[(var40 >>> 26) + (var40 & 0xFC0)];
                            arg0[var16++] = ((var41 & 0xFF00FF) * var34 & 0xFF00FF00) + ((var41 & 0xFF00) * var34 & 0xFF0000) >> 8;
                            int var42 = var31 + var40;
                            int var43 = arg1[(var42 >>> 26) + (var42 & 0xFC0)];
                            arg0[var16++] = ((var43 & 0xFF00FF) * var34 & 0xFF00FF00) + ((var43 & 0xFF00) * var34 & 0xFF0000) >> 8;
                            int var44 = var31 + var42;
                            int var45 = arg1[(var44 >>> 26) + (var44 & 0xFC0)];
                            arg0[var16++] = ((var45 & 0xFF00FF) * var34 & 0xFF00FF00) + ((var45 & 0xFF00) * var34 & 0xFF0000) >> 8;
                            int var46 = var31 + var44;
                            int var47 = arg1[(var46 >>> 26) + (var46 & 0xFC0)];
                            arg0[var16++] = ((var47 & 0xFF00FF) * var34 & 0xFF00FF00) + ((var47 & 0xFF00) * var34 & 0xFF0000) >> 8;
                            int var48 = var31 + var46;
                            int var49 = arg1[(var48 >>> 26) + (var48 & 0xFC0)];
                            arg0[var16++] = ((var49 & 0xFF00FF) * var34 & 0xFF00FF00) + ((var49 & 0xFF00) * var34 & 0xFF0000) >> 8;
                            var10000 = var31 + var48;
                            int var51 = var28;
                            int var52 = var29;
                            var25 += arg12;
                            var26 += arg13;
                            var27 += arg14;
                            if (var27 == 0.0F) {
                                var28 = 0;
                                var29 = 0;
                            } else {
                                var28 = (int) (var25 * 4096.0F / var27);
                                var29 = (int) (var26 * 4096.0F / var27);
                            }
                            var30 = (var51 << 20) + var52;
                            var31 = (var28 - var51 >> 3 << 20) + (var29 - var52 >> 3);
                            var17 += var33;
                            var34 = var17 >> 8;
                            var32--;
                        } while (var32 > 0);
                    }
                    int var53 = arg6 - arg5 & 0x7;
                    if (var53 > 0) {
                        do {
                            int var54 = arg1[(var30 >>> 26) + (var30 & 0xFC0)];
                            arg0[var16++] = ((var54 & 0xFF00FF) * var34 & 0xFF00FF00) + ((var54 & 0xFF00) * var34 & 0xFF0000) >> 8;
                            var30 += var31;
                            var53--;
                        } while (var53 > 0);
                        return;
                    }
                    return;
                }
                if (var32 > 0) {
                    do {
                        int var55;
                        if ((var55 = arg1[(var30 >>> 26) + (var30 & 0xFC0)]) != 0) {
                            arg0[var16] = ((var55 & 0xFF00FF) * var34 & 0xFF00FF00) + ((var55 & 0xFF00) * var34 & 0xFF0000) >> 8;
                        }
                        var16++;
                        int var56 = var30 + var31;
                        int var57;
                        if ((var57 = arg1[(var56 >>> 26) + (var56 & 0xFC0)]) != 0) {
                            arg0[var16] = ((var57 & 0xFF00FF) * var34 & 0xFF00FF00) + ((var57 & 0xFF00) * var34 & 0xFF0000) >> 8;
                        }
                        var16++;
                        int var58 = var31 + var56;
                        int var59;
                        if ((var59 = arg1[(var58 >>> 26) + (var58 & 0xFC0)]) != 0) {
                            arg0[var16] = ((var59 & 0xFF00FF) * var34 & 0xFF00FF00) + ((var59 & 0xFF00) * var34 & 0xFF0000) >> 8;
                        }
                        var16++;
                        int var60 = var31 + var58;
                        int var61;
                        if ((var61 = arg1[(var60 >>> 26) + (var60 & 0xFC0)]) != 0) {
                            arg0[var16] = ((var61 & 0xFF00FF) * var34 & 0xFF00FF00) + ((var61 & 0xFF00) * var34 & 0xFF0000) >> 8;
                        }
                        var16++;
                        int var62 = var31 + var60;
                        int var63;
                        if ((var63 = arg1[(var62 >>> 26) + (var62 & 0xFC0)]) != 0) {
                            arg0[var16] = ((var63 & 0xFF00FF) * var34 & 0xFF00FF00) + ((var63 & 0xFF00) * var34 & 0xFF0000) >> 8;
                        }
                        var16++;
                        int var64 = var31 + var62;
                        int var65;
                        if ((var65 = arg1[(var64 >>> 26) + (var64 & 0xFC0)]) != 0) {
                            arg0[var16] = ((var65 & 0xFF00FF) * var34 & 0xFF00FF00) + ((var65 & 0xFF00) * var34 & 0xFF0000) >> 8;
                        }
                        var16++;
                        int var66 = var31 + var64;
                        int var67;
                        if ((var67 = arg1[(var66 >>> 26) + (var66 & 0xFC0)]) != 0) {
                            arg0[var16] = ((var67 & 0xFF00FF) * var34 & 0xFF00FF00) + ((var67 & 0xFF00) * var34 & 0xFF0000) >> 8;
                        }
                        var16++;
                        int var68 = var31 + var66;
                        int var69;
                        if ((var69 = arg1[(var68 >>> 26) + (var68 & 0xFC0)]) != 0) {
                            arg0[var16] = ((var69 & 0xFF00FF) * var34 & 0xFF00FF00) + ((var69 & 0xFF00) * var34 & 0xFF0000) >> 8;
                        }
                        var16++;
                        var10000 = var31 + var68;
                        int var71 = var28;
                        int var72 = var29;
                        var25 += arg12;
                        var26 += arg13;
                        var27 += arg14;
                        if (var27 == 0.0F) {
                            var28 = 0;
                            var29 = 0;
                        } else {
                            var28 = (int) (var25 * 4096.0F / var27);
                            var29 = (int) (var26 * 4096.0F / var27);
                        }
                        var30 = (var71 << 20) + var72;
                        var31 = (var28 - var71 >> 3 << 20) + (var29 - var72 >> 3);
                        var17 += var33;
                        var34 = var17 >> 8;
                        var32--;
                    } while (var32 > 0);
                }
                int var73 = arg6 - arg5 & 0x7;
                if (var73 > 0) {
                    do {
                        int var74;
                        if ((var74 = arg1[(var30 >>> 26) + (var30 & 0xFC0)]) != 0) {
                            arg0[var16] = ((var74 & 0xFF00FF) * var34 & 0xFF00FF00) + ((var74 & 0xFF00) * var34 & 0xFF0000) >> 8;
                        }
                        var16++;
                        var30 += var31;
                        var73--;
                    } while (var73 > 0);
                    return;
                }
                return;
            }
            int var75 = arg5 - this.field5089;
            float var76 = arg12 / 8.0F * (float) var75 + arg9;
            float var77 = arg13 / 8.0F * (float) var75 + arg10;
            float var78 = arg14 / 8.0F * (float) var75 + arg11;
            int var79;
            int var80;
            if (var78 == 0.0F) {
                var79 = 0;
                var80 = 0;
            } else {
                var79 = (int) (var76 * 16384.0F / var78);
                var80 = (int) (var77 * 16384.0F / var78);
            }
            float var81 = arg12 + var76;
            float var82 = arg13 + var77;
            float var83 = arg14 + var78;
            int var84;
            int var85;
            if (var83 == 0.0F) {
                var84 = 0;
                var85 = 0;
            } else {
                var84 = (int) (var81 * 16384.0F / var83);
                var85 = (int) (var82 * 16384.0F / var83);
            }
            int var86 = (var79 << 18) + var80;
            int var87 = (var84 - var79 >> 3 << 18) + (var85 - var80 >> 3);
            int var88 = var18 >> 3;
            int var89 = arg8 << 3;
            int var90 = var17 >> 8;
            if (this.field5078) {
                if (var88 > 0) {
                    do {
                        int var91 = arg1[(var86 >>> 25) + (var86 & 0x3F80)];
                        arg0[var16++] = ((var91 & 0xFF00FF) * var90 & 0xFF00FF00) + ((var91 & 0xFF00) * var90 & 0xFF0000) >> 8;
                        int var92 = var86 + var87;
                        int var93 = arg1[(var92 >>> 25) + (var92 & 0x3F80)];
                        arg0[var16++] = ((var93 & 0xFF00FF) * var90 & 0xFF00FF00) + ((var93 & 0xFF00) * var90 & 0xFF0000) >> 8;
                        int var94 = var87 + var92;
                        int var95 = arg1[(var94 >>> 25) + (var94 & 0x3F80)];
                        arg0[var16++] = ((var95 & 0xFF00FF) * var90 & 0xFF00FF00) + ((var95 & 0xFF00) * var90 & 0xFF0000) >> 8;
                        int var96 = var87 + var94;
                        int var97 = arg1[(var96 >>> 25) + (var96 & 0x3F80)];
                        arg0[var16++] = ((var97 & 0xFF00FF) * var90 & 0xFF00FF00) + ((var97 & 0xFF00) * var90 & 0xFF0000) >> 8;
                        int var98 = var87 + var96;
                        int var99 = arg1[(var98 >>> 25) + (var98 & 0x3F80)];
                        arg0[var16++] = ((var99 & 0xFF00FF) * var90 & 0xFF00FF00) + ((var99 & 0xFF00) * var90 & 0xFF0000) >> 8;
                        int var100 = var87 + var98;
                        int var101 = arg1[(var100 >>> 25) + (var100 & 0x3F80)];
                        arg0[var16++] = ((var101 & 0xFF00FF) * var90 & 0xFF00FF00) + ((var101 & 0xFF00) * var90 & 0xFF0000) >> 8;
                        int var102 = var87 + var100;
                        int var103 = arg1[(var102 >>> 25) + (var102 & 0x3F80)];
                        arg0[var16++] = ((var103 & 0xFF00FF) * var90 & 0xFF00FF00) + ((var103 & 0xFF00) * var90 & 0xFF0000) >> 8;
                        int var104 = var87 + var102;
                        int var105 = arg1[(var104 >>> 25) + (var104 & 0x3F80)];
                        arg0[var16++] = ((var105 & 0xFF00FF) * var90 & 0xFF00FF00) + ((var105 & 0xFF00) * var90 & 0xFF0000) >> 8;
                        var10000 = var87 + var104;
                        int var107 = var84;
                        int var108 = var85;
                        var81 += arg12;
                        var82 += arg13;
                        var83 += arg14;
                        if (var83 == 0.0F) {
                            var84 = 0;
                            var85 = 0;
                        } else {
                            var84 = (int) (var81 * 16384.0F / var83);
                            var85 = (int) (var82 * 16384.0F / var83);
                        }
                        var86 = (var107 << 18) + var108;
                        var87 = (var84 - var107 >> 3 << 18) + (var85 - var108 >> 3);
                        var17 += var89;
                        var90 = var17 >> 8;
                        var88--;
                    } while (var88 > 0);
                }
                int var109 = arg6 - arg5 & 0x7;
                if (var109 > 0) {
                    do {
                        int var110 = arg1[(var86 >>> 25) + (var86 & 0x3F80)];
                        arg0[var16++] = ((var110 & 0xFF00FF) * var90 & 0xFF00FF00) + ((var110 & 0xFF00) * var90 & 0xFF0000) >> 8;
                        var86 += var87;
                        var109--;
                    } while (var109 > 0);
                    return;
                }
                return;
            }
            if (var88 > 0) {
                do {
                    int var111;
                    if ((var111 = arg1[(var86 >>> 25) + (var86 & 0x3F80)]) != 0) {
                        arg0[var16] = ((var111 & 0xFF00FF) * var90 & 0xFF00FF00) + ((var111 & 0xFF00) * var90 & 0xFF0000) >> 8;
                    }
                    var16++;
                    int var112 = var86 + var87;
                    int var113;
                    if ((var113 = arg1[(var112 >>> 25) + (var112 & 0x3F80)]) != 0) {
                        arg0[var16] = ((var113 & 0xFF00FF) * var90 & 0xFF00FF00) + ((var113 & 0xFF00) * var90 & 0xFF0000) >> 8;
                    }
                    var16++;
                    int var114 = var87 + var112;
                    int var115;
                    if ((var115 = arg1[(var114 >>> 25) + (var114 & 0x3F80)]) != 0) {
                        arg0[var16] = ((var115 & 0xFF00FF) * var90 & 0xFF00FF00) + ((var115 & 0xFF00) * var90 & 0xFF0000) >> 8;
                    }
                    var16++;
                    int var116 = var87 + var114;
                    int var117;
                    if ((var117 = arg1[(var116 >>> 25) + (var116 & 0x3F80)]) != 0) {
                        arg0[var16] = ((var117 & 0xFF00FF) * var90 & 0xFF00FF00) + ((var117 & 0xFF00) * var90 & 0xFF0000) >> 8;
                    }
                    var16++;
                    int var118 = var87 + var116;
                    int var119;
                    if ((var119 = arg1[(var118 >>> 25) + (var118 & 0x3F80)]) != 0) {
                        arg0[var16] = ((var119 & 0xFF00FF) * var90 & 0xFF00FF00) + ((var119 & 0xFF00) * var90 & 0xFF0000) >> 8;
                    }
                    var16++;
                    int var120 = var87 + var118;
                    int var121;
                    if ((var121 = arg1[(var120 >>> 25) + (var120 & 0x3F80)]) != 0) {
                        arg0[var16] = ((var121 & 0xFF00FF) * var90 & 0xFF00FF00) + ((var121 & 0xFF00) * var90 & 0xFF0000) >> 8;
                    }
                    var16++;
                    int var122 = var87 + var120;
                    int var123;
                    if ((var123 = arg1[(var122 >>> 25) + (var122 & 0x3F80)]) != 0) {
                        arg0[var16] = ((var123 & 0xFF00FF) * var90 & 0xFF00FF00) + ((var123 & 0xFF00) * var90 & 0xFF0000) >> 8;
                    }
                    var16++;
                    int var124 = var87 + var122;
                    int var125;
                    if ((var125 = arg1[(var124 >>> 25) + (var124 & 0x3F80)]) != 0) {
                        arg0[var16] = ((var125 & 0xFF00FF) * var90 & 0xFF00FF00) + ((var125 & 0xFF00) * var90 & 0xFF0000) >> 8;
                    }
                    var16++;
                    var10000 = var87 + var124;
                    int var127 = var84;
                    int var128 = var85;
                    var81 += arg12;
                    var82 += arg13;
                    var83 += arg14;
                    if (var83 == 0.0F) {
                        var84 = 0;
                        var85 = 0;
                    } else {
                        var84 = (int) (var81 / var83 * 16384.0F);
                        var85 = (int) (var82 / var83 * 16384.0F);
                    }
                    var86 = (var127 << 18) + var128;
                    var87 = (var84 - var127 >> 3 << 18) + (var85 - var128 >> 3);
                    var17 += var89;
                    var90 = var17 >> 8;
                    var88--;
                } while (var88 > 0);
            }
            int var129 = arg6 - arg5 & 0x7;
            if (var129 > 0) {
                do {
                    int var130;
                    if ((var130 = arg1[(var86 >>> 25) + (var86 & 0x3F80)]) != 0) {
                        arg0[var16] = ((var130 & 0xFF00FF) * var90 & 0xFF00FF00) + ((var130 & 0xFF00) * var90 & 0xFF0000) >> 8;
                    }
                    var16++;
                    var86 += var87;
                    var129--;
                } while (var129 > 0);
                return;
            }
            return;
        }
        int var131 = this.field5087;
        int var132 = 256 - this.field5087;
        if (!this.field5082) {
            int var225 = arg5 - this.field5089;
            float var226 = arg12 / 8.0F * (float) var225 + arg9;
            float var227 = arg13 / 8.0F * (float) var225 + arg10;
            float var228 = arg14 / 8.0F * (float) var225 + arg11;
            int var229;
            int var230;
            if (var228 == 0.0F) {
                var229 = 0;
                var230 = 0;
            } else {
                var229 = (int) (var226 * 16384.0F / var228);
                var230 = (int) (var227 * 16384.0F / var228);
            }
            float var231 = arg12 + var226;
            float var232 = arg13 + var227;
            float var233 = arg14 + var228;
            int var234;
            int var235;
            if (var233 == 0.0F) {
                var234 = 0;
                var235 = 0;
            } else {
                var234 = (int) (var231 * 16384.0F / var233);
                var235 = (int) (var232 * 16384.0F / var233);
            }
            int var236 = (var229 << 18) + var230;
            int var237 = (var234 - var229 >> 3 << 18) + (var235 - var230 >> 3);
            int var238 = var18 >> 3;
            int var239 = arg8 << 3;
            int var240 = var17 >> 8;
            if (this.field5078) {
                if (var238 > 0) {
                    do {
                        int var241 = arg1[(var236 >>> 25) + (var236 & 0x3F80)];
                        int var242 = arg0[var16];
                        int var243 = ((var241 & 0xFF00FF) * var240 & 0xFF00FF00) + ((var241 & 0xFF00) * var240 & 0xFF0000) >> 8;
                        arg0[var16++] = ((var242 & 0xFF00FF) * var131 + (var243 & 0xFF00FF) * var132 & 0xFF00FF00) + ((var242 & 0xFF00) * var131 + (var243 & 0xFF00) * var132 & 0xFF0000) >> 8;
                        int var244 = var236 + var237;
                        int var245 = arg1[(var244 >>> 25) + (var244 & 0x3F80)];
                        int var246 = arg0[var16];
                        int var247 = ((var245 & 0xFF00FF) * var240 & 0xFF00FF00) + ((var245 & 0xFF00) * var240 & 0xFF0000) >> 8;
                        arg0[var16++] = ((var246 & 0xFF00FF) * var131 + (var247 & 0xFF00FF) * var132 & 0xFF00FF00) + ((var246 & 0xFF00) * var131 + (var247 & 0xFF00) * var132 & 0xFF0000) >> 8;
                        int var248 = var237 + var244;
                        int var249 = arg1[(var248 >>> 25) + (var248 & 0x3F80)];
                        int var250 = arg0[var16];
                        int var251 = ((var249 & 0xFF00FF) * var240 & 0xFF00FF00) + ((var249 & 0xFF00) * var240 & 0xFF0000) >> 8;
                        arg0[var16++] = ((var250 & 0xFF00FF) * var131 + (var251 & 0xFF00FF) * var132 & 0xFF00FF00) + ((var250 & 0xFF00) * var131 + (var251 & 0xFF00) * var132 & 0xFF0000) >> 8;
                        int var252 = var237 + var248;
                        int var253 = arg1[(var252 >>> 25) + (var252 & 0x3F80)];
                        int var254 = arg0[var16];
                        int var255 = ((var253 & 0xFF00FF) * var240 & 0xFF00FF00) + ((var253 & 0xFF00) * var240 & 0xFF0000) >> 8;
                        arg0[var16++] = ((var254 & 0xFF00FF) * var131 + (var255 & 0xFF00FF) * var132 & 0xFF00FF00) + ((var254 & 0xFF00) * var131 + (var255 & 0xFF00) * var132 & 0xFF0000) >> 8;
                        int var256 = var237 + var252;
                        int var257 = arg1[(var256 >>> 25) + (var256 & 0x3F80)];
                        int var258 = arg0[var16];
                        int var259 = ((var257 & 0xFF00FF) * var240 & 0xFF00FF00) + ((var257 & 0xFF00) * var240 & 0xFF0000) >> 8;
                        arg0[var16++] = ((var258 & 0xFF00FF) * var131 + (var259 & 0xFF00FF) * var132 & 0xFF00FF00) + ((var258 & 0xFF00) * var131 + (var259 & 0xFF00) * var132 & 0xFF0000) >> 8;
                        int var260 = var237 + var256;
                        int var261 = arg1[(var260 >>> 25) + (var260 & 0x3F80)];
                        int var262 = arg0[var16];
                        int var263 = ((var261 & 0xFF00FF) * var240 & 0xFF00FF00) + ((var261 & 0xFF00) * var240 & 0xFF0000) >> 8;
                        arg0[var16++] = ((var262 & 0xFF00FF) * var131 + (var263 & 0xFF00FF) * var132 & 0xFF00FF00) + ((var262 & 0xFF00) * var131 + (var263 & 0xFF00) * var132 & 0xFF0000) >> 8;
                        int var264 = var237 + var260;
                        int var265 = arg1[(var264 >>> 25) + (var264 & 0x3F80)];
                        int var266 = arg0[var16];
                        int var267 = ((var265 & 0xFF00FF) * var240 & 0xFF00FF00) + ((var265 & 0xFF00) * var240 & 0xFF0000) >> 8;
                        arg0[var16++] = ((var266 & 0xFF00FF) * var131 + (var267 & 0xFF00FF) * var132 & 0xFF00FF00) + ((var266 & 0xFF00) * var131 + (var267 & 0xFF00) * var132 & 0xFF0000) >> 8;
                        int var268 = var237 + var264;
                        int var269 = arg1[(var268 >>> 25) + (var268 & 0x3F80)];
                        int var270 = arg0[var16];
                        int var271 = ((var269 & 0xFF00FF) * var240 & 0xFF00FF00) + ((var269 & 0xFF00) * var240 & 0xFF0000) >> 8;
                        arg0[var16++] = ((var270 & 0xFF00FF) * var131 + (var271 & 0xFF00FF) * var132 & 0xFF00FF00) + ((var270 & 0xFF00) * var131 + (var271 & 0xFF00) * var132 & 0xFF0000) >> 8;
                        var10000 = var237 + var268;
                        int var273 = var234;
                        int var274 = var235;
                        var231 += arg12;
                        var232 += arg13;
                        var233 += arg14;
                        if (var233 == 0.0F) {
                            var234 = 0;
                            var235 = 0;
                        } else {
                            var234 = (int) (var231 * 16384.0F / var233);
                            var235 = (int) (var232 * 16384.0F / var233);
                        }
                        var236 = (var273 << 18) + var274;
                        var237 = (var234 - var273 >> 3 << 18) + (var235 - var274 >> 3);
                        var17 += var239;
                        var240 = var17 >> 8;
                        var238--;
                    } while (var238 > 0);
                }
                int var275 = arg6 - arg5 & 0x7;
                if (var275 > 0) {
                    do {
                        int var276 = arg1[(var236 >>> 25) + (var236 & 0x3F80)];
                        int var277 = arg0[var16];
                        int var278 = ((var276 & 0xFF00FF) * var240 & 0xFF00FF00) + ((var276 & 0xFF00) * var240 & 0xFF0000) >> 8;
                        arg0[var16++] = ((var277 & 0xFF00FF) * var131 + (var278 & 0xFF00FF) * var132 & 0xFF00FF00) + ((var277 & 0xFF00) * var131 + (var278 & 0xFF00) * var132 & 0xFF0000) >> 8;
                        var236 += var237;
                        var275--;
                    } while (var275 > 0);
                    return;
                }
            } else {
                if (var238 > 0) {
                    do {
                        int var279;
                        if ((var279 = arg1[(var236 >>> 25) + (var236 & 0x3F80)]) != 0) {
                            int var280 = arg0[var16];
                            int var281 = ((var279 & 0xFF00FF) * var240 & 0xFF00FF00) + ((var279 & 0xFF00) * var240 & 0xFF0000) >> 8;
                            arg0[var16] = ((var280 & 0xFF00FF) * var131 + (var281 & 0xFF00FF) * var132 & 0xFF00FF00) + ((var280 & 0xFF00) * var131 + (var281 & 0xFF00) * var132 & 0xFF0000) >> 8;
                        }
                        var16++;
                        int var282 = var236 + var237;
                        int var283;
                        if ((var283 = arg1[(var282 >>> 25) + (var282 & 0x3F80)]) != 0) {
                            int var284 = arg0[var16];
                            int var285 = ((var283 & 0xFF00FF) * var240 & 0xFF00FF00) + ((var283 & 0xFF00) * var240 & 0xFF0000) >> 8;
                            arg0[var16] = ((var284 & 0xFF00FF) * var131 + (var285 & 0xFF00FF) * var132 & 0xFF00FF00) + ((var284 & 0xFF00) * var131 + (var285 & 0xFF00) * var132 & 0xFF0000) >> 8;
                        }
                        var16++;
                        int var286 = var237 + var282;
                        int var287;
                        if ((var287 = arg1[(var286 >>> 25) + (var286 & 0x3F80)]) != 0) {
                            int var288 = arg0[var16];
                            int var289 = ((var287 & 0xFF00FF) * var240 & 0xFF00FF00) + ((var287 & 0xFF00) * var240 & 0xFF0000) >> 8;
                            arg0[var16] = ((var288 & 0xFF00FF) * var131 + (var289 & 0xFF00FF) * var132 & 0xFF00FF00) + ((var288 & 0xFF00) * var131 + (var289 & 0xFF00) * var132 & 0xFF0000) >> 8;
                        }
                        var16++;
                        int var290 = var237 + var286;
                        int var291;
                        if ((var291 = arg1[(var290 >>> 25) + (var290 & 0x3F80)]) != 0) {
                            int var292 = arg0[var16];
                            int var293 = ((var291 & 0xFF00FF) * var240 & 0xFF00FF00) + ((var291 & 0xFF00) * var240 & 0xFF0000) >> 8;
                            arg0[var16] = ((var292 & 0xFF00FF) * var131 + (var293 & 0xFF00FF) * var132 & 0xFF00FF00) + ((var292 & 0xFF00) * var131 + (var293 & 0xFF00) * var132 & 0xFF0000) >> 8;
                        }
                        var16++;
                        int var294 = var237 + var290;
                        int var295;
                        if ((var295 = arg1[(var294 >>> 25) + (var294 & 0x3F80)]) != 0) {
                            int var296 = arg0[var16];
                            int var297 = ((var295 & 0xFF00FF) * var240 & 0xFF00FF00) + ((var295 & 0xFF00) * var240 & 0xFF0000) >> 8;
                            arg0[var16] = ((var296 & 0xFF00FF) * var131 + (var297 & 0xFF00FF) * var132 & 0xFF00FF00) + ((var296 & 0xFF00) * var131 + (var297 & 0xFF00) * var132 & 0xFF0000) >> 8;
                        }
                        var16++;
                        int var298 = var237 + var294;
                        int var299;
                        if ((var299 = arg1[(var298 >>> 25) + (var298 & 0x3F80)]) != 0) {
                            int var300 = arg0[var16];
                            int var301 = ((var299 & 0xFF00FF) * var240 & 0xFF00FF00) + ((var299 & 0xFF00) * var240 & 0xFF0000) >> 8;
                            arg0[var16] = ((var300 & 0xFF00FF) * var131 + (var301 & 0xFF00FF) * var132 & 0xFF00FF00) + ((var300 & 0xFF00) * var131 + (var301 & 0xFF00) * var132 & 0xFF0000) >> 8;
                        }
                        var16++;
                        int var302 = var237 + var298;
                        int var303;
                        if ((var303 = arg1[(var302 >>> 25) + (var302 & 0x3F80)]) != 0) {
                            int var304 = arg0[var16];
                            int var305 = ((var303 & 0xFF00FF) * var240 & 0xFF00FF00) + ((var303 & 0xFF00) * var240 & 0xFF0000) >> 8;
                            arg0[var16] = ((var304 & 0xFF00FF) * var131 + (var305 & 0xFF00FF) * var132 & 0xFF00FF00) + ((var304 & 0xFF00) * var131 + (var305 & 0xFF00) * var132 & 0xFF0000) >> 8;
                        }
                        var16++;
                        int var306 = var237 + var302;
                        int var307;
                        if ((var307 = arg1[(var306 >>> 25) + (var306 & 0x3F80)]) != 0) {
                            int var308 = arg0[var16];
                            int var309 = ((var307 & 0xFF00FF) * var240 & 0xFF00FF00) + ((var307 & 0xFF00) * var240 & 0xFF0000) >> 8;
                            arg0[var16] = ((var308 & 0xFF00FF) * var131 + (var309 & 0xFF00FF) * var132 & 0xFF00FF00) + ((var308 & 0xFF00) * var131 + (var309 & 0xFF00) * var132 & 0xFF0000) >> 8;
                        }
                        var16++;
                        var10000 = var237 + var306;
                        int var311 = var234;
                        int var312 = var235;
                        var231 += arg12;
                        var232 += arg13;
                        var233 += arg14;
                        if (var233 == 0.0F) {
                            var234 = 0;
                            var235 = 0;
                        } else {
                            var234 = (int) (var231 * 16384.0F / var233);
                            var235 = (int) (var232 * 16384.0F / var233);
                        }
                        var236 = (var311 << 18) + var312;
                        var237 = (var234 - var311 >> 3 << 18) + (var235 - var312 >> 3);
                        var17 += var239;
                        var240 = var17 >> 8;
                        var238--;
                    } while (var238 > 0);
                }
                int var313 = arg6 - arg5 & 0x7;
                if (var313 > 0) {
                    do {
                        int var314;
                        if ((var314 = arg1[(var236 >>> 25) + (var236 & 0x3F80)]) != 0) {
                            int var315 = arg0[var16];
                            int var316 = ((var314 & 0xFF00FF) * var240 & 0xFF00FF00) + ((var314 & 0xFF00) * var240 & 0xFF0000) >> 8;
                            arg0[var16] = ((var315 & 0xFF00FF) * var131 + (var316 & 0xFF00FF) * var132 & 0xFF00FF00) + ((var315 & 0xFF00) * var131 + (var316 & 0xFF00) * var132 & 0xFF0000) >> 8;
                        }
                        var16++;
                        var236 += var237;
                        var313--;
                    } while (var313 > 0);
                }
            }
            return;
        }
        int var133 = arg5 - this.field5089;
        float var134 = arg12 / 8.0F * (float) var133 + arg9;
        float var135 = arg13 / 8.0F * (float) var133 + arg10;
        float var136 = arg14 / 8.0F * (float) var133 + arg11;
        int var137;
        int var138;
        if (var136 == 0.0F) {
            var137 = 0;
            var138 = 0;
        } else {
            var137 = (int) (var134 * 4096.0F / var136);
            var138 = (int) (var135 * 4096.0F / var136);
        }
        float var139 = arg12 + var134;
        float var140 = arg13 + var135;
        float var141 = arg14 + var136;
        int var142;
        int var143;
        if (var141 == 0.0F) {
            var142 = 0;
            var143 = 0;
        } else {
            var142 = (int) (var139 * 4096.0F / var141);
            var143 = (int) (var140 * 4096.0F / var141);
        }
        int var144 = (var137 << 20) + var138;
        int var145 = (var142 - var137 >> 3 << 20) + (var143 - var138 >> 3);
        int var146 = var18 >> 3;
        int var147 = arg8 << 3;
        int var148 = var17 >> 8;
        if (this.field5078) {
            if (var146 > 0) {
                do {
                    int var149 = arg0[var16];
                    int var150 = arg1[(var144 >>> 26) + (var144 & 0xFC0)];
                    int var151 = ((var150 & 0xFF00FF) * var148 & 0xFF00FF00) + ((var150 & 0xFF00) * var148 & 0xFF0000) >> 8;
                    arg0[var16++] = ((var149 & 0xFF00FF) * var131 + (var151 & 0xFF00FF) * var132 & 0xFF00FF00) + ((var149 & 0xFF00) * var131 + (var151 & 0xFF00) * var132 & 0xFF0000) >> 8;
                    int var152 = var144 + var145;
                    int var153 = arg0[var16];
                    int var154 = arg1[(var152 >>> 26) + (var152 & 0xFC0)];
                    int var155 = ((var154 & 0xFF00FF) * var148 & 0xFF00FF00) + ((var154 & 0xFF00) * var148 & 0xFF0000) >> 8;
                    arg0[var16++] = ((var153 & 0xFF00FF) * var131 + (var155 & 0xFF00FF) * var132 & 0xFF00FF00) + ((var153 & 0xFF00) * var131 + (var155 & 0xFF00) * var132 & 0xFF0000) >> 8;
                    int var156 = var145 + var152;
                    int var157 = arg0[var16];
                    int var158 = arg1[(var156 >>> 26) + (var156 & 0xFC0)];
                    int var159 = ((var158 & 0xFF00FF) * var148 & 0xFF00FF00) + ((var158 & 0xFF00) * var148 & 0xFF0000) >> 8;
                    arg0[var16++] = ((var157 & 0xFF00FF) * var131 + (var159 & 0xFF00FF) * var132 & 0xFF00FF00) + ((var157 & 0xFF00) * var131 + (var159 & 0xFF00) * var132 & 0xFF0000) >> 8;
                    int var160 = var145 + var156;
                    int var161 = arg0[var16];
                    int var162 = arg1[(var160 >>> 26) + (var160 & 0xFC0)];
                    int var163 = ((var162 & 0xFF00FF) * var148 & 0xFF00FF00) + ((var162 & 0xFF00) * var148 & 0xFF0000) >> 8;
                    arg0[var16++] = ((var161 & 0xFF00FF) * var131 + (var163 & 0xFF00FF) * var132 & 0xFF00FF00) + ((var161 & 0xFF00) * var131 + (var163 & 0xFF00) * var132 & 0xFF0000) >> 8;
                    int var164 = var145 + var160;
                    int var165 = arg0[var16];
                    int var166 = arg1[(var164 >>> 26) + (var164 & 0xFC0)];
                    int var167 = ((var166 & 0xFF00FF) * var148 & 0xFF00FF00) + ((var166 & 0xFF00) * var148 & 0xFF0000) >> 8;
                    arg0[var16++] = ((var165 & 0xFF00FF) * var131 + (var167 & 0xFF00FF) * var132 & 0xFF00FF00) + ((var165 & 0xFF00) * var131 + (var167 & 0xFF00) * var132 & 0xFF0000) >> 8;
                    int var168 = var145 + var164;
                    int var169 = arg0[var16];
                    int var170 = arg1[(var168 >>> 26) + (var168 & 0xFC0)];
                    int var171 = ((var170 & 0xFF00FF) * var148 & 0xFF00FF00) + ((var170 & 0xFF00) * var148 & 0xFF0000) >> 8;
                    arg0[var16++] = ((var169 & 0xFF00FF) * var131 + (var171 & 0xFF00FF) * var132 & 0xFF00FF00) + ((var169 & 0xFF00) * var131 + (var171 & 0xFF00) * var132 & 0xFF0000) >> 8;
                    int var172 = var145 + var168;
                    int var173 = arg0[var16];
                    int var174 = arg1[(var172 >>> 26) + (var172 & 0xFC0)];
                    int var175 = ((var174 & 0xFF00FF) * var148 & 0xFF00FF00) + ((var174 & 0xFF00) * var148 & 0xFF0000) >> 8;
                    arg0[var16++] = ((var173 & 0xFF00FF) * var131 + (var175 & 0xFF00FF) * var132 & 0xFF00FF00) + ((var173 & 0xFF00) * var131 + (var175 & 0xFF00) * var132 & 0xFF0000) >> 8;
                    int var176 = var145 + var172;
                    int var177 = arg0[var16];
                    int var178 = arg1[(var176 >>> 26) + (var176 & 0xFC0)];
                    int var179 = ((var178 & 0xFF00FF) * var148 & 0xFF00FF00) + ((var178 & 0xFF00) * var148 & 0xFF0000) >> 8;
                    arg0[var16++] = ((var177 & 0xFF00FF) * var131 + (var179 & 0xFF00FF) * var132 & 0xFF00FF00) + ((var177 & 0xFF00) * var131 + (var179 & 0xFF00) * var132 & 0xFF0000) >> 8;
                    var10000 = var145 + var176;
                    int var181 = var142;
                    int var182 = var143;
                    var139 += arg12;
                    var140 += arg13;
                    var141 += arg14;
                    if (var141 == 0.0F) {
                        var142 = 0;
                        var143 = 0;
                    } else {
                        var142 = (int) (var139 * 4096.0F / var141);
                        var143 = (int) (var140 * 4096.0F / var141);
                    }
                    var144 = (var181 << 20) + var182;
                    var145 = (var142 - var181 >> 3 << 20) + (var143 - var182 >> 3);
                    var17 += var147;
                    var148 = var17 >> 8;
                    var146--;
                } while (var146 > 0);
            }
            int var183 = arg6 - arg5 & 0x7;
            if (var183 > 0) {
                do {
                    int var184 = arg0[var16];
                    int var185 = arg1[(var144 >>> 26) + (var144 & 0xFC0)];
                    int var186 = ((var185 & 0xFF00FF) * var148 & 0xFF00FF00) + ((var185 & 0xFF00) * var148 & 0xFF0000) >> 8;
                    arg0[var16++] = ((var184 & 0xFF00FF) * var131 + (var186 & 0xFF00FF) * var132 & 0xFF00FF00) + ((var184 & 0xFF00) * var131 + (var186 & 0xFF00) * var132 & 0xFF0000) >> 8;
                    var144 += var145;
                    var183--;
                } while (var183 > 0);
                return;
            }
            return;
        }
        if (var146 > 0) {
            do {
                int var187;
                if ((var187 = arg1[(var144 >>> 26) + (var144 & 0xFC0)]) != 0) {
                    int var188 = arg0[var16];
                    int var189 = ((var187 & 0xFF00FF) * var148 & 0xFF00FF00) + ((var187 & 0xFF00) * var148 & 0xFF0000) >> 8;
                    arg0[var16] = ((var188 & 0xFF00FF) * var131 + (var189 & 0xFF00FF) * var132 & 0xFF00FF00) + ((var188 & 0xFF00) * var131 + (var189 & 0xFF00) * var132 & 0xFF0000) >> 8;
                }
                var16++;
                int var190 = var144 + var145;
                int var191;
                if ((var191 = arg1[(var190 >>> 26) + (var190 & 0xFC0)]) != 0) {
                    int var192 = arg0[var16];
                    int var193 = ((var191 & 0xFF00FF) * var148 & 0xFF00FF00) + ((var191 & 0xFF00) * var148 & 0xFF0000) >> 8;
                    arg0[var16] = ((var192 & 0xFF00FF) * var131 + (var193 & 0xFF00FF) * var132 & 0xFF00FF00) + ((var192 & 0xFF00) * var131 + (var193 & 0xFF00) * var132 & 0xFF0000) >> 8;
                }
                var16++;
                int var194 = var145 + var190;
                int var195;
                if ((var195 = arg1[(var194 >>> 26) + (var194 & 0xFC0)]) != 0) {
                    int var196 = arg0[var16];
                    int var197 = ((var195 & 0xFF00FF) * var148 & 0xFF00FF00) + ((var195 & 0xFF00) * var148 & 0xFF0000) >> 8;
                    arg0[var16] = ((var196 & 0xFF00FF) * var131 + (var197 & 0xFF00FF) * var132 & 0xFF00FF00) + ((var196 & 0xFF00) * var131 + (var197 & 0xFF00) * var132 & 0xFF0000) >> 8;
                }
                var16++;
                int var198 = var145 + var194;
                int var199;
                if ((var199 = arg1[(var198 >>> 26) + (var198 & 0xFC0)]) != 0) {
                    int var200 = arg0[var16];
                    int var201 = ((var199 & 0xFF00FF) * var148 & 0xFF00FF00) + ((var199 & 0xFF00) * var148 & 0xFF0000) >> 8;
                    arg0[var16] = ((var200 & 0xFF00FF) * var131 + (var201 & 0xFF00FF) * var132 & 0xFF00FF00) + ((var200 & 0xFF00) * var131 + (var201 & 0xFF00) * var132 & 0xFF0000) >> 8;
                }
                var16++;
                int var202 = var145 + var198;
                int var203;
                if ((var203 = arg1[(var202 >>> 26) + (var202 & 0xFC0)]) != 0) {
                    int var204 = arg0[var16];
                    int var205 = ((var203 & 0xFF00FF) * var148 & 0xFF00FF00) + ((var203 & 0xFF00) * var148 & 0xFF0000) >> 8;
                    arg0[var16] = ((var204 & 0xFF00FF) * var131 + (var205 & 0xFF00FF) * var132 & 0xFF00FF00) + ((var204 & 0xFF00) * var131 + (var205 & 0xFF00) * var132 & 0xFF0000) >> 8;
                }
                var16++;
                int var206 = var145 + var202;
                int var207;
                if ((var207 = arg1[(var206 >>> 26) + (var206 & 0xFC0)]) != 0) {
                    int var208 = arg0[var16];
                    int var209 = ((var207 & 0xFF00FF) * var148 & 0xFF00FF00) + ((var207 & 0xFF00) * var148 & 0xFF0000) >> 8;
                    arg0[var16] = ((var208 & 0xFF00FF) * var131 + (var209 & 0xFF00FF) * var132 & 0xFF00FF00) + ((var208 & 0xFF00) * var131 + (var209 & 0xFF00) * var132 & 0xFF0000) >> 8;
                }
                var16++;
                int var210 = var145 + var206;
                int var211;
                if ((var211 = arg1[(var210 >>> 26) + (var210 & 0xFC0)]) != 0) {
                    int var212 = arg0[var16];
                    int var213 = ((var211 & 0xFF00FF) * var148 & 0xFF00FF00) + ((var211 & 0xFF00) * var148 & 0xFF0000) >> 8;
                    arg0[var16] = ((var212 & 0xFF00FF) * var131 + (var213 & 0xFF00FF) * var132 & 0xFF00FF00) + ((var212 & 0xFF00) * var131 + (var213 & 0xFF00) * var132 & 0xFF0000) >> 8;
                }
                var16++;
                int var214 = var145 + var210;
                int var215;
                if ((var215 = arg1[(var214 >>> 26) + (var214 & 0xFC0)]) != 0) {
                    int var216 = arg0[var16];
                    int var217 = ((var215 & 0xFF00FF) * var148 & 0xFF00FF00) + ((var215 & 0xFF00) * var148 & 0xFF0000) >> 8;
                    arg0[var16] = ((var216 & 0xFF00FF) * var131 + (var217 & 0xFF00FF) * var132 & 0xFF00FF00) + ((var216 & 0xFF00) * var131 + (var217 & 0xFF00) * var132 & 0xFF0000) >> 8;
                }
                var16++;
                var10000 = var145 + var214;
                int var219 = var142;
                int var220 = var143;
                var139 += arg12;
                var140 += arg13;
                var141 += arg14;
                if (var141 == 0.0F) {
                    var142 = 0;
                    var143 = 0;
                } else {
                    var142 = (int) (var139 * 4096.0F / var141);
                    var143 = (int) (var140 * 4096.0F / var141);
                }
                var144 = (var219 << 20) + var220;
                var145 = (var142 - var219 >> 3 << 20) + (var143 - var220 >> 3);
                var17 += var147;
                var148 = var17 >> 8;
                var146--;
            } while (var146 > 0);
        }
        int var221 = arg6 - arg5 & 0x7;
        if (var221 <= 0) {
            return;
        }
        do {
            int var222;
            if ((var222 = arg1[(var144 >>> 26) + (var144 & 0xFC0)]) != 0) {
                int var223 = arg0[var16];
                int var224 = ((var222 & 0xFF00FF) * var148 & 0xFF00FF00) + ((var222 & 0xFF00) * var148 & 0xFF0000) >> 8;
                arg0[var16] = ((var223 & 0xFF00FF) * var131 + (var224 & 0xFF00FF) * var132 & 0xFF00FF00) + ((var223 & 0xFF00) * var131 + (var224 & 0xFF00) * var132 & 0xFF0000) >> 8;
            }
            var16++;
            var144 += var145;
            var221--;
        } while (var221 > 0);
        return;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "([IIIIIIII)V")
    private final void method2071(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (this.field5079) {
            if (arg5 > this.field5084) {
                arg5 = this.field5084;
            }
            if (arg4 < 0) {
                arg4 = 0;
            }
        }
        if (arg4 >= arg5) {
            return;
        }
        int var9 = arg4 + arg1 - 1;
        int var10 = arg4 * arg7 + arg6;
        if (!this.field5088) {
            int var28 = arg5 - arg4;
            if (this.field5087 == 0) {
                do {
                    var9++;
                    arg0[var9] = class81.field1140[var10 >> 8];
                    var10 += arg7;
                    var28--;
                } while (var28 > 0);
            } else {
                int var29 = this.field5087;
                int var30 = 256 - this.field5087;
                do {
                    int var31 = class81.field1140[var10 >> 8];
                    var10 += arg7;
                    int var32 = ((var31 & 0xFF00FF) * var30 >> 8 & 0xFF00FF) + ((var31 & 0xFF00) * var30 >> 8 & 0xFF00);
                    var9++;
                    int var33 = arg0[var9];
                    arg0[var9] = ((var33 & 0xFF00) * var29 >> 8 & 0xFF00) + ((var33 & 0xFF00FF) * var29 >> 8 & 0xFF00FF) + var32;
                    var28--;
                } while (var28 > 0);
            }
            return;
        }
        int var11 = arg5 - arg4 >> 2;
        int var12 = arg7 << 2;
        if (this.field5087 == 0) {
            if (var11 > 0) {
                do {
                    int var13 = class81.field1140[var10 >> 8];
                    var10 += var12;
                    var9++;
                    arg0[var9] = var13;
                    var9++;
                    arg0[var9] = var13;
                    var9++;
                    arg0[var9] = var13;
                    var9++;
                    arg0[var9] = var13;
                    var11--;
                } while (var11 > 0);
            }
            int var14 = arg5 - arg4 & 0x3;
            if (var14 > 0) {
                int var15 = class81.field1140[var10 >> 8];
                do {
                    var9++;
                    arg0[var9] = var15;
                    var14--;
                } while (var14 > 0);
                return;
            }
            return;
        }
        int var16 = this.field5087;
        int var17 = 256 - this.field5087;
        if (var11 > 0) {
            do {
                int var18 = class81.field1140[var10 >> 8];
                var10 += var12;
                int var19 = ((var18 & 0xFF00FF) * var17 >> 8 & 0xFF00FF) + ((var18 & 0xFF00) * var17 >> 8 & 0xFF00);
                var9++;
                int var20 = arg0[var9];
                arg0[var9] = ((var20 & 0xFF00) * var16 >> 8 & 0xFF00) + ((var20 & 0xFF00FF) * var16 >> 8 & 0xFF00FF) + var19;
                var9++;
                int var21 = arg0[var9];
                arg0[var9] = ((var21 & 0xFF00) * var16 >> 8 & 0xFF00) + ((var21 & 0xFF00FF) * var16 >> 8 & 0xFF00FF) + var19;
                var9++;
                int var22 = arg0[var9];
                arg0[var9] = ((var22 & 0xFF00) * var16 >> 8 & 0xFF00) + ((var22 & 0xFF00FF) * var16 >> 8 & 0xFF00FF) + var19;
                var9++;
                int var23 = arg0[var9];
                arg0[var9] = ((var23 & 0xFF00) * var16 >> 8 & 0xFF00) + ((var23 & 0xFF00FF) * var16 >> 8 & 0xFF00FF) + var19;
                var11--;
            } while (var11 > 0);
        }
        int var24 = arg5 - arg4 & 0x3;
        if (var24 <= 0) {
            return;
        }
        int var25 = class81.field1140[var10 >> 8];
        int var26 = ((var25 & 0xFF00FF) * var17 >> 8 & 0xFF00FF) + ((var25 & 0xFF00) * var17 >> 8 & 0xFF00);
        do {
            var9++;
            int var27 = arg0[var9];
            arg0[var9] = ((var27 & 0xFF00) * var16 >> 8 & 0xFF00) + ((var27 & 0xFF00FF) * var16 >> 8 & 0xFF00FF) + var26;
            var24--;
        } while (var24 > 0);
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method2072(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = arg4 - arg3;
        int var11 = arg1 - arg0;
        int var12 = arg5 - arg3;
        int var13 = arg2 - arg0;
        int var14 = (arg7 & 0xFF0000) - (arg6 & 0xFF0000) >> 8;
        int var15 = (arg8 & 0xFF0000) - (arg6 & 0xFF0000) >> 8;
        int var16 = (arg7 & 0xFF00) - (arg6 & 0xFF00);
        int var17 = (arg8 & 0xFF00) - (arg6 & 0xFF00);
        int var18 = (arg7 & 0xFF) - (arg6 & 0xFF);
        int var19 = (arg8 & 0xFF) - (arg6 & 0xFF);
        int var20;
        if (arg1 == arg2) {
            var20 = 0;
        } else {
            var20 = (arg5 - arg4 << 16) / (arg2 - arg1);
        }
        int var21;
        if (arg0 == arg1) {
            var21 = 0;
        } else {
            var21 = (var10 << 16) / var11;
        }
        int var22;
        if (arg0 == arg2) {
            var22 = 0;
        } else {
            var22 = (var12 << 16) / var13;
        }
        int var23 = var10 * var13 - var11 * var12;
        if (var23 == 0) {
            return;
        }
        int var24 = (var13 * var14 - var11 * var15) / var23;
        int var25 = (var10 * var15 - var12 * var14) / var23;
        int var26 = (var13 * var16 - var11 * var17) / var23;
        int var27 = (var10 * var17 - var12 * var16) / var23;
        int var28 = (var13 * var18 - var11 * var19 << 8) / var23;
        int var29 = (var10 * var19 - var12 * var18 << 8) / var23;
        if (arg0 <= arg1 && arg0 <= arg2) {
            if (arg0 < this.field5080) {
                if (arg1 > this.field5080) {
                    arg1 = this.field5080;
                }
                if (arg2 > this.field5080) {
                    arg2 = this.field5080;
                }
                int var30 = ((arg6 & 0xFF0000) >> 8) + var24 - arg3 * var24;
                int var31 = (arg6 & 0xFF00) + var26 - arg3 * var26;
                int var32 = ((arg6 & 0xFF) << 8) + var28 - arg3 * var28;
                if (arg1 < arg2) {
                    int var33;
                    int var34 = var33 = arg3 << 16;
                    if (arg0 < 0) {
                        var34 -= arg0 * var22;
                        var33 -= arg0 * var21;
                        var30 -= arg0 * var25;
                        var31 -= arg0 * var27;
                        var32 -= arg0 * var29;
                        arg0 = 0;
                    }
                    int var35 = arg4 << 16;
                    if (arg1 < 0) {
                        var35 -= arg1 * var20;
                        arg1 = 0;
                    }
                    if ((arg0 == arg1 || var22 >= var21) && (arg0 != arg1 || var22 <= var20)) {
                        int var39 = arg2 - arg1;
                        int var40 = arg1 - arg0;
                        int var41 = this.field5083[arg0];
                        while (true) {
                            var40--;
                            if (var40 < 0) {
                                while (true) {
                                    var39--;
                                    if (var39 < 0) {
                                        return;
                                    }
                                    this.method2084(this.field5077, var41, 0, 0, var35 >> 16, var34 >> 16, var30, var24, var31, var26, var32, var28);
                                    var34 += var22;
                                    var35 += var20;
                                    var30 += var25;
                                    var31 += var27;
                                    var32 += var29;
                                    var41 += this.field5081;
                                }
                            }
                            this.method2084(this.field5077, var41, 0, 0, var33 >> 16, var34 >> 16, var30, var24, var31, var26, var32, var28);
                            var34 += var22;
                            var33 += var21;
                            var30 += var25;
                            var31 += var27;
                            var32 += var29;
                            var41 += this.field5081;
                        }
                    } else {
                        int var36 = arg2 - arg1;
                        int var37 = arg1 - arg0;
                        int var38 = this.field5083[arg0];
                        while (true) {
                            var37--;
                            if (var37 < 0) {
                                while (true) {
                                    var36--;
                                    if (var36 < 0) {
                                        return;
                                    }
                                    this.method2084(this.field5077, var38, 0, 0, var34 >> 16, var35 >> 16, var30, var24, var31, var26, var32, var28);
                                    var34 += var22;
                                    var35 += var20;
                                    var30 += var25;
                                    var31 += var27;
                                    var32 += var29;
                                    var38 += this.field5081;
                                }
                            }
                            this.method2084(this.field5077, var38, 0, 0, var34 >> 16, var33 >> 16, var30, var24, var31, var26, var32, var28);
                            var34 += var22;
                            var33 += var21;
                            var30 += var25;
                            var31 += var27;
                            var32 += var29;
                            var38 += this.field5081;
                        }
                    }
                } else {
                    int var42;
                    int var43 = var42 = arg3 << 16;
                    if (arg0 < 0) {
                        var43 -= arg0 * var22;
                        var42 -= arg0 * var21;
                        var30 -= arg0 * var25;
                        var31 -= arg0 * var27;
                        var32 -= arg0 * var29;
                        arg0 = 0;
                    }
                    int var44 = arg5 << 16;
                    if (arg2 < 0) {
                        var44 -= arg2 * var20;
                        arg2 = 0;
                    }
                    if (arg0 != arg2 && var22 < var21 || arg0 == arg2 && var20 > var21) {
                        int var45 = arg1 - arg2;
                        int var46 = arg2 - arg0;
                        int var47 = this.field5083[arg0];
                        while (true) {
                            var46--;
                            if (var46 < 0) {
                                while (true) {
                                    var45--;
                                    if (var45 < 0) {
                                        return;
                                    }
                                    this.method2084(this.field5077, var47, 0, 0, var44 >> 16, var42 >> 16, var30, var24, var31, var26, var32, var28);
                                    var44 += var20;
                                    var42 += var21;
                                    var30 += var25;
                                    var31 += var27;
                                    var32 += var29;
                                    var47 += this.field5081;
                                }
                            }
                            this.method2084(this.field5077, var47, 0, 0, var43 >> 16, var42 >> 16, var30, var24, var31, var26, var32, var28);
                            var43 += var22;
                            var42 += var21;
                            var30 += var25;
                            var31 += var27;
                            var32 += var29;
                            var47 += this.field5081;
                        }
                    } else {
                        int var48 = arg1 - arg2;
                        int var49 = arg2 - arg0;
                        int var50 = this.field5083[arg0];
                        while (true) {
                            var49--;
                            if (var49 < 0) {
                                while (true) {
                                    var48--;
                                    if (var48 < 0) {
                                        return;
                                    }
                                    this.method2084(this.field5077, var50, 0, 0, var42 >> 16, var44 >> 16, var30, var24, var31, var26, var32, var28);
                                    var44 += var20;
                                    var42 += var21;
                                    var30 += var25;
                                    var31 += var27;
                                    var32 += var29;
                                    var50 += this.field5081;
                                }
                            }
                            this.method2084(this.field5077, var50, 0, 0, var42 >> 16, var43 >> 16, var30, var24, var31, var26, var32, var28);
                            var43 += var22;
                            var42 += var21;
                            var30 += var25;
                            var31 += var27;
                            var32 += var29;
                            var50 += this.field5081;
                        }
                    }
                }
            }
        } else if (arg1 <= arg2) {
            if (arg1 < this.field5080) {
                if (arg2 > this.field5080) {
                    arg2 = this.field5080;
                }
                if (arg0 > this.field5080) {
                    arg0 = this.field5080;
                }
                int var51 = ((arg7 & 0xFF0000) >> 8) + var24 - arg4 * var24;
                int var52 = (arg7 & 0xFF00) + var26 - arg4 * var26;
                int var53 = ((arg7 & 0xFF) << 8) + var28 - arg4 * var28;
                if (arg2 < arg0) {
                    int var54;
                    int var55 = var54 = arg4 << 16;
                    if (arg1 < 0) {
                        var55 -= arg1 * var21;
                        var54 -= arg1 * var20;
                        var51 -= arg1 * var25;
                        var52 -= arg1 * var27;
                        var53 -= arg1 * var29;
                        arg1 = 0;
                    }
                    int var56 = arg5 << 16;
                    if (arg2 < 0) {
                        var56 -= arg2 * var22;
                        arg2 = 0;
                    }
                    if ((arg1 == arg2 || var21 >= var20) && (arg1 != arg2 || var21 <= var22)) {
                        int var60 = arg0 - arg2;
                        int var61 = arg2 - arg1;
                        int var62 = this.field5083[arg1];
                        while (true) {
                            var61--;
                            if (var61 < 0) {
                                while (true) {
                                    var60--;
                                    if (var60 < 0) {
                                        return;
                                    }
                                    this.method2084(this.field5077, var62, 0, 0, var56 >> 16, var55 >> 16, var51, var24, var52, var26, var53, var28);
                                    var55 += var21;
                                    var56 += var22;
                                    var51 += var25;
                                    var52 += var27;
                                    var53 += var29;
                                    var62 += this.field5081;
                                }
                            }
                            this.method2084(this.field5077, var62, 0, 0, var54 >> 16, var55 >> 16, var51, var24, var52, var26, var53, var28);
                            var55 += var21;
                            var54 += var20;
                            var51 += var25;
                            var52 += var27;
                            var53 += var29;
                            var62 += this.field5081;
                        }
                    } else {
                        int var57 = arg0 - arg2;
                        int var58 = arg2 - arg1;
                        int var59 = this.field5083[arg1];
                        while (true) {
                            var58--;
                            if (var58 < 0) {
                                while (true) {
                                    var57--;
                                    if (var57 < 0) {
                                        return;
                                    }
                                    this.method2084(this.field5077, var59, 0, 0, var55 >> 16, var56 >> 16, var51, var24, var52, var26, var53, var28);
                                    var55 += var21;
                                    var56 += var22;
                                    var51 += var25;
                                    var52 += var27;
                                    var53 += var29;
                                    var59 += this.field5081;
                                }
                            }
                            this.method2084(this.field5077, var59, 0, 0, var55 >> 16, var54 >> 16, var51, var24, var52, var26, var53, var28);
                            var55 += var21;
                            var54 += var20;
                            var51 += var25;
                            var52 += var27;
                            var53 += var29;
                            var59 += this.field5081;
                        }
                    }
                } else {
                    int var63;
                    int var64 = var63 = arg4 << 16;
                    if (arg1 < 0) {
                        var64 -= arg1 * var21;
                        var63 -= arg1 * var20;
                        var51 -= arg1 * var25;
                        var52 -= arg1 * var27;
                        var53 -= arg1 * var29;
                        arg1 = 0;
                    }
                    int var65 = arg3 << 16;
                    if (arg0 < 0) {
                        var65 -= arg0 * var22;
                        arg0 = 0;
                    }
                    if (var21 < var20) {
                        int var66 = arg2 - arg0;
                        int var67 = arg0 - arg1;
                        int var68 = this.field5083[arg1];
                        while (true) {
                            var67--;
                            if (var67 < 0) {
                                while (true) {
                                    var66--;
                                    if (var66 < 0) {
                                        return;
                                    }
                                    this.method2084(this.field5077, var68, 0, 0, var65 >> 16, var63 >> 16, var51, var24, var52, var26, var53, var28);
                                    var65 += var22;
                                    var63 += var20;
                                    var51 += var25;
                                    var52 += var27;
                                    var53 += var29;
                                    var68 += this.field5081;
                                }
                            }
                            this.method2084(this.field5077, var68, 0, 0, var64 >> 16, var63 >> 16, var51, var24, var52, var26, var53, var28);
                            var64 += var21;
                            var63 += var20;
                            var51 += var25;
                            var52 += var27;
                            var53 += var29;
                            var68 += this.field5081;
                        }
                    } else {
                        int var69 = arg2 - arg0;
                        int var70 = arg0 - arg1;
                        int var71 = this.field5083[arg1];
                        while (true) {
                            var70--;
                            if (var70 < 0) {
                                while (true) {
                                    var69--;
                                    if (var69 < 0) {
                                        return;
                                    }
                                    this.method2084(this.field5077, var71, 0, 0, var63 >> 16, var65 >> 16, var51, var24, var52, var26, var53, var28);
                                    var65 += var22;
                                    var63 += var20;
                                    var51 += var25;
                                    var52 += var27;
                                    var53 += var29;
                                    var71 += this.field5081;
                                }
                            }
                            this.method2084(this.field5077, var71, 0, 0, var63 >> 16, var64 >> 16, var51, var24, var52, var26, var53, var28);
                            var64 += var21;
                            var63 += var20;
                            var51 += var25;
                            var52 += var27;
                            var53 += var29;
                            var71 += this.field5081;
                        }
                    }
                }
            }
        } else if (arg2 < this.field5080) {
            if (arg0 > this.field5080) {
                arg0 = this.field5080;
            }
            if (arg1 > this.field5080) {
                arg1 = this.field5080;
            }
            int var72 = ((arg8 & 0xFF0000) >> 8) + var24 - arg5 * var24;
            int var73 = (arg8 & 0xFF00) + var26 - arg5 * var26;
            int var74 = ((arg8 & 0xFF) << 8) + var28 - arg5 * var28;
            if (arg0 < arg1) {
                int var75;
                int var76 = var75 = arg5 << 16;
                if (arg2 < 0) {
                    var76 -= arg2 * var20;
                    var75 -= arg2 * var22;
                    var72 -= arg2 * var25;
                    var73 -= arg2 * var27;
                    var74 -= arg2 * var29;
                    arg2 = 0;
                }
                int var77 = arg3 << 16;
                if (arg0 < 0) {
                    var77 -= arg0 * var21;
                    arg0 = 0;
                }
                if (var20 < var22) {
                    int var78 = arg1 - arg0;
                    int var79 = arg0 - arg2;
                    int var80 = this.field5083[arg2];
                    while (true) {
                        var79--;
                        if (var79 < 0) {
                            while (true) {
                                var78--;
                                if (var78 < 0) {
                                    return;
                                }
                                this.method2084(this.field5077, var80, 0, 0, var76 >> 16, var77 >> 16, var72, var24, var73, var26, var74, var28);
                                var76 += var20;
                                var77 += var21;
                                var72 += var25;
                                var73 += var27;
                                var74 += var29;
                                var80 += this.field5081;
                            }
                        }
                        this.method2084(this.field5077, var80, 0, 0, var76 >> 16, var75 >> 16, var72, var24, var73, var26, var74, var28);
                        var76 += var20;
                        var75 += var22;
                        var72 += var25;
                        var73 += var27;
                        var74 += var29;
                        var80 += this.field5081;
                    }
                } else {
                    int var81 = arg1 - arg0;
                    int var82 = arg0 - arg2;
                    int var83 = this.field5083[arg2];
                    while (true) {
                        var82--;
                        if (var82 < 0) {
                            while (true) {
                                var81--;
                                if (var81 < 0) {
                                    return;
                                }
                                this.method2084(this.field5077, var83, 0, 0, var77 >> 16, var76 >> 16, var72, var24, var73, var26, var74, var28);
                                var76 += var20;
                                var77 += var21;
                                var72 += var25;
                                var73 += var27;
                                var74 += var29;
                                var83 += this.field5081;
                            }
                        }
                        this.method2084(this.field5077, var83, 0, 0, var75 >> 16, var76 >> 16, var72, var24, var73, var26, var74, var28);
                        var76 += var20;
                        var75 += var22;
                        var72 += var25;
                        var73 += var27;
                        var74 += var29;
                        var83 += this.field5081;
                    }
                }
            } else {
                int var84;
                int var85 = var84 = arg5 << 16;
                if (arg2 < 0) {
                    var85 -= arg2 * var20;
                    var84 -= arg2 * var22;
                    var72 -= arg2 * var25;
                    var73 -= arg2 * var27;
                    var74 -= arg2 * var29;
                    arg2 = 0;
                }
                int var86 = arg4 << 16;
                if (arg1 < 0) {
                    var86 -= arg1 * var21;
                    arg1 = 0;
                }
                if (var20 < var22) {
                    int var87 = arg0 - arg1;
                    int var88 = arg1 - arg2;
                    int var89 = this.field5083[arg2];
                    while (true) {
                        var88--;
                        if (var88 < 0) {
                            while (true) {
                                var87--;
                                if (var87 < 0) {
                                    return;
                                }
                                this.method2084(this.field5077, var89, 0, 0, var86 >> 16, var84 >> 16, var72, var24, var73, var26, var74, var28);
                                var86 += var21;
                                var84 += var22;
                                var72 += var25;
                                var73 += var27;
                                var74 += var29;
                                var89 += this.field5081;
                            }
                        }
                        this.method2084(this.field5077, var89, 0, 0, var85 >> 16, var84 >> 16, var72, var24, var73, var26, var74, var28);
                        var85 += var20;
                        var84 += var22;
                        var72 += var25;
                        var73 += var27;
                        var74 += var29;
                        var89 += this.field5081;
                    }
                } else {
                    int var90 = arg0 - arg1;
                    int var91 = arg1 - arg2;
                    int var92 = this.field5083[arg2];
                    while (true) {
                        var91--;
                        if (var91 < 0) {
                            while (true) {
                                var90--;
                                if (var90 < 0) {
                                    return;
                                }
                                this.method2084(this.field5077, var92, 0, 0, var84 >> 16, var86 >> 16, var72, var24, var73, var26, var74, var28);
                                var86 += var21;
                                var84 += var22;
                                var72 += var25;
                                var73 += var27;
                                var74 += var29;
                                var92 += this.field5081;
                            }
                        }
                        this.method2084(this.field5077, var92, 0, 0, var84 >> 16, var85 >> 16, var72, var24, var73, var26, var74, var28);
                        var85 += var20;
                        var84 += var22;
                        var72 += var25;
                        var73 += var27;
                        var74 += var29;
                        var92 += this.field5081;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIIIIII)V")
    public final void method2073(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21, int arg22) {
        int[] var24 = this.field5086.method883(arg22);
        if (var24 == null) {
            int var25 = this.field5086.method888(arg22);
            this.method2072(arg0, arg1, arg2, arg3, arg4, arg5, class230.method1511(arg6 | arg7 << 24, var25, 16711935), class230.method1511(arg6 | arg8 << 24, var25, 16711935), class230.method1511(arg6 | arg9 << 24, var25, 16711935));
            return;
        }
        this.field5082 = this.field5086.method885(arg22);
        this.field5078 = this.field5086.method879(arg22);
        int var26 = arg4 - arg3;
        int var27 = arg1 - arg0;
        int var28 = arg5 - arg3;
        int var29 = arg2 - arg0;
        int var30 = 0;
        if (arg0 != arg1) {
            var30 = (arg4 - arg3 << 16) / (arg1 - arg0);
        }
        int var31 = 0;
        if (arg1 != arg2) {
            var31 = (arg5 - arg4 << 16) / (arg2 - arg1);
        }
        int var32 = 0;
        if (arg0 != arg2) {
            var32 = (arg3 - arg5 << 16) / (arg0 - arg2);
        }
        int var33 = var26 * var29 - var27 * var28;
        if (var33 == 0) {
            return;
        }
        int var34 = arg8 - arg7;
        int var35 = arg9 - arg7;
        int var36 = (var29 * var34 - var27 * var35 << 16) / var33;
        int var37 = (var26 * var35 - var28 * var34 << 16) / var33;
        int var38 = arg11 - arg10;
        int var39 = arg12 - arg10;
        int var40 = (var29 * var38 - var27 * var39 << 9) / var33;
        int var41 = (var26 * var39 - var28 * var38 << 9) / var33;
        float var42 = 8.0F / (float) this.field5086.field1729;
        float var43 = (float) this.field5086.field1759;
        int var44 = arg13 - arg14;
        int var45 = arg16 - arg17;
        int var46 = arg19 - arg20;
        int var47 = arg15 - arg13;
        int var48 = arg18 - arg16;
        int var49 = arg21 - arg19;
        float var50 = (float) (arg16 * var47 - arg13 * var48);
        float var51 = (float) (arg19 * var48 - arg16 * var49) * var42;
        float var52 = (float) (arg13 * var49 - arg19 * var47) / var43;
        float var53 = (float) (arg16 * var44 - arg13 * var45);
        float var54 = (float) (arg19 * var45 - arg16 * var46) * var42;
        float var55 = (float) (arg13 * var46 - arg19 * var44) / var43;
        float var56 = (float) (var45 * var47 - var44 * var48);
        float var57 = (float) (var46 * var48 - var45 * var49) * var42;
        float var58 = (float) (var44 * var49 - var46 * var47) / var43;
        if (arg0 <= arg1 && arg0 <= arg2) {
            if (arg0 < this.field5080) {
                if (arg1 > this.field5080) {
                    arg1 = this.field5080;
                }
                if (arg2 > this.field5080) {
                    arg2 = this.field5080;
                }
                int var59 = (arg7 << 16) + var36 - arg3 * var36;
                int var60 = (arg10 << 9) + var40 - arg3 * var40;
                if (arg1 < arg2) {
                    int var61;
                    int var62 = var61 = arg3 << 16;
                    if (arg0 < 0) {
                        var62 -= arg0 * var32;
                        var61 -= arg0 * var30;
                        var59 -= arg0 * var37;
                        var60 -= arg0 * var41;
                        arg0 = 0;
                    }
                    int var63 = arg4 << 16;
                    if (arg1 < 0) {
                        var63 -= arg1 * var31;
                        arg1 = 0;
                    }
                    int var64 = arg0 - this.field5085;
                    float var65 = (float) var64 * var52 + var50;
                    float var66 = (float) var64 * var55 + var53;
                    float var67 = (float) var64 * var58 + var56;
                    if (arg0 != arg1 && var32 < var30 || arg0 == arg1 && var32 > var31) {
                        int var68 = arg2 - arg1;
                        int var69 = arg1 - arg0;
                        int var70 = this.field5083[arg0];
                        while (true) {
                            var69--;
                            if (var69 < 0) {
                                while (true) {
                                    var68--;
                                    if (var68 < 0) {
                                        return;
                                    }
                                    this.method2083(this.field5077, var24, 0, 0, var70, var62 >> 16, var63 >> 16, var59, var36, arg6, var60, var40, var65, var66, var67, var51, var54, var57);
                                    var62 += var32;
                                    var63 += var31;
                                    var59 += var37;
                                    var60 += var41;
                                    var70 += this.field5081;
                                    var65 += var52;
                                    var66 += var55;
                                    var67 += var58;
                                }
                            }
                            this.method2083(this.field5077, var24, 0, 0, var70, var62 >> 16, var61 >> 16, var59, var36, arg6, var60, var40, var65, var66, var67, var51, var54, var57);
                            var62 += var32;
                            var61 += var30;
                            var59 += var37;
                            var60 += var41;
                            var70 += this.field5081;
                            var65 += var52;
                            var66 += var55;
                            var67 += var58;
                        }
                    } else {
                        int var71 = arg2 - arg1;
                        int var72 = arg1 - arg0;
                        int var73 = this.field5083[arg0];
                        while (true) {
                            var72--;
                            if (var72 < 0) {
                                while (true) {
                                    var71--;
                                    if (var71 < 0) {
                                        return;
                                    }
                                    this.method2083(this.field5077, var24, 0, 0, var73, var63 >> 16, var62 >> 16, var59, var36, arg6, var60, var40, var65, var66, var67, var51, var54, var57);
                                    var62 += var32;
                                    var63 += var31;
                                    var59 += var37;
                                    var60 += var41;
                                    var73 += this.field5081;
                                    var65 += var52;
                                    var66 += var55;
                                    var67 += var58;
                                }
                            }
                            this.method2083(this.field5077, var24, 0, 0, var73, var61 >> 16, var62 >> 16, var59, var36, arg6, var60, var40, var65, var66, var67, var51, var54, var57);
                            var62 += var32;
                            var61 += var30;
                            var59 += var37;
                            var60 += var41;
                            var73 += this.field5081;
                            var65 += var52;
                            var66 += var55;
                            var67 += var58;
                        }
                    }
                } else {
                    int var74;
                    int var75 = var74 = arg3 << 16;
                    if (arg0 < 0) {
                        var75 -= arg0 * var32;
                        var74 -= arg0 * var30;
                        var59 -= arg0 * var37;
                        var60 -= arg0 * var41;
                        arg0 = 0;
                    }
                    int var76 = arg5 << 16;
                    if (arg2 < 0) {
                        var76 -= arg2 * var31;
                        arg2 = 0;
                    }
                    int var77 = arg0 - this.field5085;
                    float var78 = (float) var77 * var52 + var50;
                    float var79 = (float) var77 * var55 + var53;
                    float var80 = (float) var77 * var58 + var56;
                    if ((arg0 == arg2 || var32 >= var30) && (arg0 != arg2 || var31 <= var30)) {
                        int var84 = arg1 - arg2;
                        int var85 = arg2 - arg0;
                        int var86 = this.field5083[arg0];
                        while (true) {
                            var85--;
                            if (var85 < 0) {
                                while (true) {
                                    var84--;
                                    if (var84 < 0) {
                                        return;
                                    }
                                    this.method2083(this.field5077, var24, 0, 0, var86, var74 >> 16, var76 >> 16, var59, var36, arg6, var60, var40, var78, var79, var80, var51, var54, var57);
                                    var76 += var31;
                                    var74 += var30;
                                    var59 += var37;
                                    var60 += var41;
                                    var86 += this.field5081;
                                    var78 += var52;
                                    var79 += var55;
                                    var80 += var58;
                                }
                            }
                            this.method2083(this.field5077, var24, 0, 0, var86, var74 >> 16, var75 >> 16, var59, var36, arg6, var60, var40, var78, var79, var80, var51, var54, var57);
                            var75 += var32;
                            var74 += var30;
                            var59 += var37;
                            var60 += var41;
                            var86 += this.field5081;
                            var78 += var52;
                            var79 += var55;
                            var80 += var58;
                        }
                    } else {
                        int var81 = arg1 - arg2;
                        int var82 = arg2 - arg0;
                        int var83 = this.field5083[arg0];
                        while (true) {
                            var82--;
                            if (var82 < 0) {
                                while (true) {
                                    var81--;
                                    if (var81 < 0) {
                                        return;
                                    }
                                    this.method2083(this.field5077, var24, 0, 0, var83, var76 >> 16, var74 >> 16, var59, var36, arg6, var60, var40, var78, var79, var80, var51, var54, var57);
                                    var76 += var31;
                                    var74 += var30;
                                    var59 += var37;
                                    var60 += var41;
                                    var83 += this.field5081;
                                    var78 += var52;
                                    var79 += var55;
                                    var80 += var58;
                                }
                            }
                            this.method2083(this.field5077, var24, 0, 0, var83, var75 >> 16, var74 >> 16, var59, var36, arg6, var60, var40, var78, var79, var80, var51, var54, var57);
                            var75 += var32;
                            var74 += var30;
                            var59 += var37;
                            var60 += var41;
                            var83 += this.field5081;
                            var78 += var52;
                            var79 += var55;
                            var80 += var58;
                        }
                    }
                }
            }
        } else if (arg1 <= arg2) {
            if (arg1 < this.field5080) {
                if (arg2 > this.field5080) {
                    arg2 = this.field5080;
                }
                if (arg0 > this.field5080) {
                    arg0 = this.field5080;
                }
                int var87 = (arg8 << 16) + var36 - arg4 * var36;
                int var88 = (arg11 << 9) + var40 - arg4 * var40;
                if (arg2 < arg0) {
                    int var89;
                    int var90 = var89 = arg4 << 16;
                    if (arg1 < 0) {
                        var90 -= arg1 * var30;
                        var89 -= arg1 * var31;
                        var87 -= arg1 * var37;
                        var88 -= arg1 * var41;
                        arg1 = 0;
                    }
                    int var91 = arg5 << 16;
                    if (arg2 < 0) {
                        var91 -= arg2 * var32;
                        arg2 = 0;
                    }
                    int var92 = arg1 - this.field5085;
                    float var93 = (float) var92 * var52 + var50;
                    float var94 = (float) var92 * var55 + var53;
                    float var95 = (float) var92 * var58 + var56;
                    if (arg1 != arg2 && var30 < var31 || arg1 == arg2 && var30 > var32) {
                        int var96 = arg0 - arg2;
                        int var97 = arg2 - arg1;
                        int var98 = this.field5083[arg1];
                        while (true) {
                            var97--;
                            if (var97 < 0) {
                                while (true) {
                                    var96--;
                                    if (var96 < 0) {
                                        return;
                                    }
                                    this.method2083(this.field5077, var24, 0, 0, var98, var90 >> 16, var91 >> 16, var87, var36, arg6, var88, var40, var93, var94, var95, var51, var54, var57);
                                    var90 += var30;
                                    var91 += var32;
                                    var87 += var37;
                                    var88 += var41;
                                    var98 += this.field5081;
                                    var93 += var52;
                                    var94 += var55;
                                    var95 += var58;
                                }
                            }
                            this.method2083(this.field5077, var24, 0, 0, var98, var90 >> 16, var89 >> 16, var87, var36, arg6, var88, var40, var93, var94, var95, var51, var54, var57);
                            var90 += var30;
                            var89 += var31;
                            var87 += var37;
                            var88 += var41;
                            var98 += this.field5081;
                            var93 += var52;
                            var94 += var55;
                            var95 += var58;
                        }
                    } else {
                        int var99 = arg0 - arg2;
                        int var100 = arg2 - arg1;
                        int var101 = this.field5083[arg1];
                        while (true) {
                            var100--;
                            if (var100 < 0) {
                                while (true) {
                                    var99--;
                                    if (var99 < 0) {
                                        return;
                                    }
                                    this.method2083(this.field5077, var24, 0, 0, var101, var91 >> 16, var90 >> 16, var87, var36, arg6, var88, var40, var93, var94, var95, var51, var54, var57);
                                    var90 += var30;
                                    var91 += var32;
                                    var87 += var37;
                                    var88 += var41;
                                    var101 += this.field5081;
                                    var93 += var52;
                                    var94 += var55;
                                    var95 += var58;
                                }
                            }
                            this.method2083(this.field5077, var24, 0, 0, var101, var89 >> 16, var90 >> 16, var87, var36, arg6, var88, var40, var93, var94, var95, var51, var54, var57);
                            var90 += var30;
                            var89 += var31;
                            var87 += var37;
                            var88 += var41;
                            var101 += this.field5081;
                            var93 += var52;
                            var94 += var55;
                            var95 += var58;
                        }
                    }
                } else {
                    int var102;
                    int var103 = var102 = arg4 << 16;
                    if (arg1 < 0) {
                        var103 -= arg1 * var30;
                        var102 -= arg1 * var31;
                        var87 -= arg1 * var37;
                        var88 -= arg1 * var41;
                        arg1 = 0;
                    }
                    int var104 = arg3 << 16;
                    if (arg0 < 0) {
                        var104 -= arg0 * var32;
                        arg0 = 0;
                    }
                    int var105 = arg1 - this.field5085;
                    float var106 = (float) var105 * var52 + var50;
                    float var107 = (float) var105 * var55 + var53;
                    float var108 = (float) var105 * var58 + var56;
                    if (var30 < var31) {
                        int var109 = arg2 - arg0;
                        int var110 = arg0 - arg1;
                        int var111 = this.field5083[arg1];
                        while (true) {
                            var110--;
                            if (var110 < 0) {
                                while (true) {
                                    var109--;
                                    if (var109 < 0) {
                                        return;
                                    }
                                    this.method2083(this.field5077, var24, 0, 0, var111, var104 >> 16, var102 >> 16, var87, var36, arg6, var88, var40, var106, var107, var108, var51, var54, var57);
                                    var104 += var32;
                                    var102 += var31;
                                    var87 += var37;
                                    var88 += var41;
                                    var111 += this.field5081;
                                    var106 += var52;
                                    var107 += var55;
                                    var108 += var58;
                                }
                            }
                            this.method2083(this.field5077, var24, 0, 0, var111, var103 >> 16, var102 >> 16, var87, var36, arg6, var88, var40, var106, var107, var108, var51, var54, var57);
                            var103 += var30;
                            var102 += var31;
                            var87 += var37;
                            var88 += var41;
                            var111 += this.field5081;
                            var106 += var52;
                            var107 += var55;
                            var108 += var58;
                        }
                    } else {
                        int var112 = arg2 - arg0;
                        int var113 = arg0 - arg1;
                        int var114 = this.field5083[arg1];
                        while (true) {
                            var113--;
                            if (var113 < 0) {
                                while (true) {
                                    var112--;
                                    if (var112 < 0) {
                                        return;
                                    }
                                    this.method2083(this.field5077, var24, 0, 0, var114, var102 >> 16, var104 >> 16, var87, var36, arg6, var88, var40, var106, var107, var108, var51, var54, var57);
                                    var104 += var32;
                                    var102 += var31;
                                    var87 += var37;
                                    var88 += var41;
                                    var114 += this.field5081;
                                    var106 += var52;
                                    var107 += var55;
                                    var108 += var58;
                                }
                            }
                            this.method2083(this.field5077, var24, 0, 0, var114, var102 >> 16, var103 >> 16, var87, var36, arg6, var88, var40, var106, var107, var108, var51, var54, var57);
                            var103 += var30;
                            var102 += var31;
                            var87 += var37;
                            var88 += var41;
                            var114 += this.field5081;
                            var106 += var52;
                            var107 += var55;
                            var108 += var58;
                        }
                    }
                }
            }
        } else if (arg2 < this.field5080) {
            if (arg0 > this.field5080) {
                arg0 = this.field5080;
            }
            if (arg1 > this.field5080) {
                arg1 = this.field5080;
            }
            int var115 = (arg9 << 16) + var36 - arg5 * var36;
            int var116 = (arg12 << 9) + var40 - arg5 * var40;
            if (arg0 < arg1) {
                int var117;
                int var118 = var117 = arg5 << 16;
                if (arg2 < 0) {
                    var118 -= arg2 * var31;
                    var117 -= arg2 * var32;
                    var115 -= arg2 * var37;
                    var116 -= arg2 * var41;
                    arg2 = 0;
                }
                int var119 = arg3 << 16;
                if (arg0 < 0) {
                    var119 -= arg0 * var30;
                    arg0 = 0;
                }
                int var120 = arg2 - this.field5085;
                float var121 = (float) var120 * var52 + var50;
                float var122 = (float) var120 * var55 + var53;
                float var123 = (float) var120 * var58 + var56;
                if (var31 < var32) {
                    int var124 = arg1 - arg0;
                    int var125 = arg0 - arg2;
                    int var126 = this.field5083[arg2];
                    while (true) {
                        var125--;
                        if (var125 < 0) {
                            while (true) {
                                var124--;
                                if (var124 < 0) {
                                    return;
                                }
                                this.method2083(this.field5077, var24, 0, 0, var126, var118 >> 16, var119 >> 16, var115, var36, arg6, var116, var40, var121, var122, var123, var51, var54, var57);
                                var118 += var31;
                                var119 += var30;
                                var115 += var37;
                                var116 += var41;
                                var126 += this.field5081;
                                var121 += var52;
                                var122 += var55;
                                var123 += var58;
                            }
                        }
                        this.method2083(this.field5077, var24, 0, 0, var126, var118 >> 16, var117 >> 16, var115, var36, arg6, var116, var40, var121, var122, var123, var51, var54, var57);
                        var118 += var31;
                        var117 += var32;
                        var115 += var37;
                        var116 += var41;
                        var126 += this.field5081;
                        var121 += var52;
                        var122 += var55;
                        var123 += var58;
                    }
                } else {
                    int var127 = arg1 - arg0;
                    int var128 = arg0 - arg2;
                    int var129 = this.field5083[arg2];
                    while (true) {
                        var128--;
                        if (var128 < 0) {
                            while (true) {
                                var127--;
                                if (var127 < 0) {
                                    return;
                                }
                                this.method2083(this.field5077, var24, 0, 0, var129, var119 >> 16, var118 >> 16, var115, var36, arg6, var116, var40, var121, var122, var123, var51, var54, var57);
                                var118 += var31;
                                var119 += var30;
                                var115 += var37;
                                var116 += var41;
                                var129 += this.field5081;
                                var121 += var52;
                                var122 += var55;
                                var123 += var58;
                            }
                        }
                        this.method2083(this.field5077, var24, 0, 0, var129, var117 >> 16, var118 >> 16, var115, var36, arg6, var116, var40, var121, var122, var123, var51, var54, var57);
                        var118 += var31;
                        var117 += var32;
                        var115 += var37;
                        var116 += var41;
                        var129 += this.field5081;
                        var121 += var52;
                        var122 += var55;
                        var123 += var58;
                    }
                }
            } else {
                int var130;
                int var131 = var130 = arg5 << 16;
                if (arg2 < 0) {
                    var131 -= arg2 * var31;
                    var130 -= arg2 * var32;
                    var115 -= arg2 * var37;
                    var116 -= arg2 * var41;
                    arg2 = 0;
                }
                int var132 = arg4 << 16;
                if (arg1 < 0) {
                    var132 -= arg1 * var30;
                    arg1 = 0;
                }
                int var133 = arg2 - this.field5085;
                float var134 = (float) var133 * var52 + var50;
                float var135 = (float) var133 * var55 + var53;
                float var136 = (float) var133 * var58 + var56;
                if (var31 < var32) {
                    int var137 = arg0 - arg1;
                    int var138 = arg1 - arg2;
                    int var139 = this.field5083[arg2];
                    while (true) {
                        var138--;
                        if (var138 < 0) {
                            while (true) {
                                var137--;
                                if (var137 < 0) {
                                    return;
                                }
                                this.method2083(this.field5077, var24, 0, 0, var139, var132 >> 16, var130 >> 16, var115, var36, arg6, var116, var40, var134, var135, var136, var51, var54, var57);
                                var132 += var30;
                                var130 += var32;
                                var115 += var37;
                                var116 += var41;
                                var139 += this.field5081;
                                var134 += var52;
                                var135 += var55;
                                var136 += var58;
                            }
                        }
                        this.method2083(this.field5077, var24, 0, 0, var139, var131 >> 16, var130 >> 16, var115, var36, arg6, var116, var40, var134, var135, var136, var51, var54, var57);
                        var131 += var31;
                        var130 += var32;
                        var115 += var37;
                        var116 += var41;
                        var139 += this.field5081;
                        var134 += var52;
                        var135 += var55;
                        var136 += var58;
                    }
                } else {
                    int var140 = arg0 - arg1;
                    int var141 = arg1 - arg2;
                    int var142 = this.field5083[arg2];
                    while (true) {
                        var141--;
                        if (var141 < 0) {
                            while (true) {
                                var140--;
                                if (var140 < 0) {
                                    return;
                                }
                                this.method2083(this.field5077, var24, 0, 0, var142, var130 >> 16, var132 >> 16, var115, var36, arg6, var116, var40, var134, var135, var136, var51, var54, var57);
                                var132 += var30;
                                var130 += var32;
                                var115 += var37;
                                var116 += var41;
                                var142 += this.field5081;
                                var134 += var52;
                                var135 += var55;
                                var136 += var58;
                            }
                        }
                        this.method2083(this.field5077, var24, 0, 0, var142, var130 >> 16, var131 >> 16, var115, var36, arg6, var116, var40, var134, var135, var136, var51, var54, var57);
                        var131 += var31;
                        var130 += var32;
                        var115 += var37;
                        var116 += var41;
                        var142 += this.field5081;
                        var134 += var52;
                        var135 += var55;
                        var136 += var58;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "([IIIIII)V")
    private final void method2074(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field5079) {
            if (arg5 > this.field5084) {
                arg5 = this.field5084;
            }
            if (arg4 < 0) {
                arg4 = 0;
            }
        }
        if (arg4 >= arg5) {
            return;
        }
        int var7 = arg1 + arg4;
        int var8 = arg5 - arg4 >> 2;
        if (this.field5087 == 0) {
            while (true) {
                var8--;
                if (var8 < 0) {
                    int var9 = arg5 - arg4 & 0x3;
                    while (true) {
                        var9--;
                        if (var9 < 0) {
                            return;
                        }
                        arg0[var7++] = arg2;
                    }
                }
                arg0[var7++] = arg2;
                arg0[var7++] = arg2;
                arg0[var7++] = arg2;
                arg0[var7++] = arg2;
            }
        } else if (this.field5087 != 254) {
            int var11 = this.field5087;
            int var12 = 256 - this.field5087;
            int var13 = ((arg2 & 0xFF00FF) * var12 >> 8 & 0xFF00FF) + ((arg2 & 0xFF00) * var12 >> 8 & 0xFF00);
            while (true) {
                var8--;
                if (var8 < 0) {
                    int var14 = arg5 - arg4 & 0x3;
                    while (true) {
                        var14--;
                        if (var14 < 0) {
                            return;
                        }
                        int var15 = arg0[var7];
                        arg0[var7++] = ((var15 & 0xFF00) * var11 >> 8 & 0xFF00) + ((var15 & 0xFF00FF) * var11 >> 8 & 0xFF00FF) + var13;
                    }
                }
                int var16 = arg0[var7];
                arg0[var7++] = ((var16 & 0xFF00) * var11 >> 8 & 0xFF00) + ((var16 & 0xFF00FF) * var11 >> 8 & 0xFF00FF) + var13;
                int var17 = arg0[var7];
                arg0[var7++] = ((var17 & 0xFF00) * var11 >> 8 & 0xFF00) + ((var17 & 0xFF00FF) * var11 >> 8 & 0xFF00FF) + var13;
                int var18 = arg0[var7];
                arg0[var7++] = ((var18 & 0xFF00) * var11 >> 8 & 0xFF00) + ((var18 & 0xFF00FF) * var11 >> 8 & 0xFF00FF) + var13;
                int var19 = arg0[var7];
                arg0[var7++] = ((var19 & 0xFF00) * var11 >> 8 & 0xFF00) + ((var19 & 0xFF00FF) * var11 >> 8 & 0xFF00FF) + var13;
            }
        } else if (arg5 <= this.field5084 - 1) {
            while (true) {
                var8--;
                if (var8 < 0) {
                    int var10 = arg5 - arg4 & 0x3;
                    while (true) {
                        var10--;
                        if (var10 < 0) {
                            return;
                        }
                        arg0[var7++] = arg0[var7];
                    }
                }
                arg0[var7++] = arg0[var7];
                arg0[var7++] = arg0[var7];
                arg0[var7++] = arg0[var7];
                arg0[var7++] = arg0[var7];
            }
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(II)I")
    private static final int method2075(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIII)V")
    public final void method2076(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
        int[] var20 = this.field5086.method883(arg18);
        if (var20 == null) {
            int var21 = this.field5086.method888(arg18);
            this.method2078(arg0, arg1, arg2, arg3, arg4, arg5, method2075(var21, arg6), method2075(var21, arg7), method2075(var21, arg8));
            return;
        }
        this.field5082 = this.field5086.method885(arg18);
        this.field5078 = this.field5086.method879(arg18);
        int var22 = arg4 - arg3;
        int var23 = arg1 - arg0;
        int var24 = arg5 - arg3;
        int var25 = arg2 - arg0;
        int var26 = arg7 - arg6;
        int var27 = arg8 - arg6;
        int var28 = 0;
        if (arg0 != arg1) {
            var28 = (arg4 - arg3 << 16) / (arg1 - arg0);
        }
        int var29 = 0;
        if (arg1 != arg2) {
            var29 = (arg5 - arg4 << 16) / (arg2 - arg1);
        }
        int var30 = 0;
        if (arg0 != arg2) {
            var30 = (arg3 - arg5 << 16) / (arg0 - arg2);
        }
        int var31 = var22 * var25 - var23 * var24;
        if (var31 == 0) {
            return;
        }
        int var32 = (var25 * var26 - var23 * var27 << 9) / var31;
        int var33 = (var22 * var27 - var24 * var26 << 9) / var31;
        float var34 = 1.0F / (float) this.field5086.field1729;
        float var35 = (float) this.field5086.field1759;
        int var36 = arg9 - arg10;
        int var37 = arg12 - arg13;
        int var38 = arg15 - arg16;
        int var39 = arg11 - arg9;
        int var40 = arg14 - arg12;
        int var41 = arg17 - arg15;
        float var42 = (float) (arg12 * var39 - arg9 * var40);
        float var43 = (float) (arg15 * var40 - arg12 * var41) * var34;
        float var44 = (float) (arg9 * var41 - arg15 * var39) / var35;
        float var45 = (float) (arg12 * var36 - arg9 * var37);
        float var46 = (float) (arg15 * var37 - arg12 * var38) * var34;
        float var47 = (float) (arg9 * var38 - arg15 * var36) / var35;
        float var48 = (float) (var37 * var39 - var36 * var40);
        float var49 = (float) (var38 * var40 - var37 * var41) * var34;
        float var50 = (float) (var36 * var41 - var38 * var39) / var35;
        if (arg0 <= arg1 && arg0 <= arg2) {
            if (arg0 < this.field5080) {
                if (arg1 > this.field5080) {
                    arg1 = this.field5080;
                }
                if (arg2 > this.field5080) {
                    arg2 = this.field5080;
                }
                int var51 = (arg6 << 9) + var32 - arg3 * var32;
                if (arg1 < arg2) {
                    int var52;
                    int var53 = var52 = arg3 << 16;
                    if (arg0 < 0) {
                        var53 -= arg0 * var30;
                        var52 -= arg0 * var28;
                        var51 -= arg0 * var33;
                        arg0 = 0;
                    }
                    int var54 = arg4 << 16;
                    if (arg1 < 0) {
                        var54 -= arg1 * var29;
                        arg1 = 0;
                    }
                    int var55 = arg0 - this.field5085;
                    float var56 = (float) var55 * var44 + var42;
                    float var57 = (float) var55 * var47 + var45;
                    float var58 = (float) var55 * var50 + var48;
                    if (arg0 != arg1 && var30 < var28 || arg0 == arg1 && var30 > var29) {
                        int var59 = arg2 - arg1;
                        int var60 = arg1 - arg0;
                        int var61 = this.field5083[arg0];
                        while (true) {
                            var60--;
                            if (var60 < 0) {
                                while (true) {
                                    var59--;
                                    if (var59 < 0) {
                                        return;
                                    }
                                    this.method2080(this.field5077, var20, 0, 0, var61, var53 >> 16, var54 >> 16, var51, var32, var56, var57, var58, var43, var46, var49);
                                    var53 += var30;
                                    var54 += var29;
                                    var51 += var33;
                                    var61 += this.field5081;
                                    var56 += var44;
                                    var57 += var47;
                                    var58 += var50;
                                }
                            }
                            this.method2080(this.field5077, var20, 0, 0, var61, var53 >> 16, var52 >> 16, var51, var32, var56, var57, var58, var43, var46, var49);
                            var53 += var30;
                            var52 += var28;
                            var51 += var33;
                            var61 += this.field5081;
                            var56 += var44;
                            var57 += var47;
                            var58 += var50;
                        }
                    } else {
                        int var62 = arg2 - arg1;
                        int var63 = arg1 - arg0;
                        int var64 = this.field5083[arg0];
                        while (true) {
                            var63--;
                            if (var63 < 0) {
                                while (true) {
                                    var62--;
                                    if (var62 < 0) {
                                        return;
                                    }
                                    this.method2080(this.field5077, var20, 0, 0, var64, var54 >> 16, var53 >> 16, var51, var32, var56, var57, var58, var43, var46, var49);
                                    var53 += var30;
                                    var54 += var29;
                                    var51 += var33;
                                    var64 += this.field5081;
                                    var56 += var44;
                                    var57 += var47;
                                    var58 += var50;
                                }
                            }
                            this.method2080(this.field5077, var20, 0, 0, var64, var52 >> 16, var53 >> 16, var51, var32, var56, var57, var58, var43, var46, var49);
                            var53 += var30;
                            var52 += var28;
                            var51 += var33;
                            var64 += this.field5081;
                            var56 += var44;
                            var57 += var47;
                            var58 += var50;
                        }
                    }
                } else {
                    int var65;
                    int var66 = var65 = arg3 << 16;
                    if (arg0 < 0) {
                        var66 -= arg0 * var30;
                        var65 -= arg0 * var28;
                        var51 -= arg0 * var33;
                        arg0 = 0;
                    }
                    int var67 = arg5 << 16;
                    if (arg2 < 0) {
                        var67 -= arg2 * var29;
                        arg2 = 0;
                    }
                    int var68 = arg0 - this.field5085;
                    float var69 = (float) var68 * var44 + var42;
                    float var70 = (float) var68 * var47 + var45;
                    float var71 = (float) var68 * var50 + var48;
                    if ((arg0 == arg2 || var30 >= var28) && (arg0 != arg2 || var29 <= var28)) {
                        int var75 = arg1 - arg2;
                        int var76 = arg2 - arg0;
                        int var77 = this.field5083[arg0];
                        while (true) {
                            var76--;
                            if (var76 < 0) {
                                while (true) {
                                    var75--;
                                    if (var75 < 0) {
                                        return;
                                    }
                                    this.method2080(this.field5077, var20, 0, 0, var77, var65 >> 16, var67 >> 16, var51, var32, var69, var70, var71, var43, var46, var49);
                                    var67 += var29;
                                    var65 += var28;
                                    var51 += var33;
                                    var77 += this.field5081;
                                    var69 += var44;
                                    var70 += var47;
                                    var71 += var50;
                                }
                            }
                            this.method2080(this.field5077, var20, 0, 0, var77, var65 >> 16, var66 >> 16, var51, var32, var69, var70, var71, var43, var46, var49);
                            var66 += var30;
                            var65 += var28;
                            var51 += var33;
                            var77 += this.field5081;
                            var69 += var44;
                            var70 += var47;
                            var71 += var50;
                        }
                    } else {
                        int var72 = arg1 - arg2;
                        int var73 = arg2 - arg0;
                        int var74 = this.field5083[arg0];
                        while (true) {
                            var73--;
                            if (var73 < 0) {
                                while (true) {
                                    var72--;
                                    if (var72 < 0) {
                                        return;
                                    }
                                    this.method2080(this.field5077, var20, 0, 0, var74, var67 >> 16, var65 >> 16, var51, var32, var69, var70, var71, var43, var46, var49);
                                    var67 += var29;
                                    var65 += var28;
                                    var51 += var33;
                                    var74 += this.field5081;
                                    var69 += var44;
                                    var70 += var47;
                                    var71 += var50;
                                }
                            }
                            this.method2080(this.field5077, var20, 0, 0, var74, var66 >> 16, var65 >> 16, var51, var32, var69, var70, var71, var43, var46, var49);
                            var66 += var30;
                            var65 += var28;
                            var51 += var33;
                            var74 += this.field5081;
                            var69 += var44;
                            var70 += var47;
                            var71 += var50;
                        }
                    }
                }
            }
        } else if (arg1 <= arg2) {
            if (arg1 < this.field5080) {
                if (arg2 > this.field5080) {
                    arg2 = this.field5080;
                }
                if (arg0 > this.field5080) {
                    arg0 = this.field5080;
                }
                int var78 = (arg7 << 9) + var32 - arg4 * var32;
                if (arg2 < arg0) {
                    int var79;
                    int var80 = var79 = arg4 << 16;
                    if (arg1 < 0) {
                        var80 -= arg1 * var28;
                        var79 -= arg1 * var29;
                        var78 -= arg1 * var33;
                        arg1 = 0;
                    }
                    int var81 = arg5 << 16;
                    if (arg2 < 0) {
                        var81 -= arg2 * var30;
                        arg2 = 0;
                    }
                    int var82 = arg1 - this.field5085;
                    float var83 = (float) var82 * var44 + var42;
                    float var84 = (float) var82 * var47 + var45;
                    float var85 = (float) var82 * var50 + var48;
                    if (arg1 != arg2 && var28 < var29 || arg1 == arg2 && var28 > var30) {
                        int var86 = arg0 - arg2;
                        int var87 = arg2 - arg1;
                        int var88 = this.field5083[arg1];
                        while (true) {
                            var87--;
                            if (var87 < 0) {
                                while (true) {
                                    var86--;
                                    if (var86 < 0) {
                                        return;
                                    }
                                    this.method2080(this.field5077, var20, 0, 0, var88, var80 >> 16, var81 >> 16, var78, var32, var83, var84, var85, var43, var46, var49);
                                    var80 += var28;
                                    var81 += var30;
                                    var78 += var33;
                                    var88 += this.field5081;
                                    var83 += var44;
                                    var84 += var47;
                                    var85 += var50;
                                }
                            }
                            this.method2080(this.field5077, var20, 0, 0, var88, var80 >> 16, var79 >> 16, var78, var32, var83, var84, var85, var43, var46, var49);
                            var80 += var28;
                            var79 += var29;
                            var78 += var33;
                            var88 += this.field5081;
                            var83 += var44;
                            var84 += var47;
                            var85 += var50;
                        }
                    } else {
                        int var89 = arg0 - arg2;
                        int var90 = arg2 - arg1;
                        int var91 = this.field5083[arg1];
                        while (true) {
                            var90--;
                            if (var90 < 0) {
                                while (true) {
                                    var89--;
                                    if (var89 < 0) {
                                        return;
                                    }
                                    this.method2080(this.field5077, var20, 0, 0, var91, var81 >> 16, var80 >> 16, var78, var32, var83, var84, var85, var43, var46, var49);
                                    var80 += var28;
                                    var81 += var30;
                                    var78 += var33;
                                    var91 += this.field5081;
                                    var83 += var44;
                                    var84 += var47;
                                    var85 += var50;
                                }
                            }
                            this.method2080(this.field5077, var20, 0, 0, var91, var79 >> 16, var80 >> 16, var78, var32, var83, var84, var85, var43, var46, var49);
                            var80 += var28;
                            var79 += var29;
                            var78 += var33;
                            var91 += this.field5081;
                            var83 += var44;
                            var84 += var47;
                            var85 += var50;
                        }
                    }
                } else {
                    int var92;
                    int var93 = var92 = arg4 << 16;
                    if (arg1 < 0) {
                        var93 -= arg1 * var28;
                        var92 -= arg1 * var29;
                        var78 -= arg1 * var33;
                        arg1 = 0;
                    }
                    int var94 = arg3 << 16;
                    if (arg0 < 0) {
                        var94 -= arg0 * var30;
                        arg0 = 0;
                    }
                    int var95 = arg1 - this.field5085;
                    float var96 = (float) var95 * var44 + var42;
                    float var97 = (float) var95 * var47 + var45;
                    float var98 = (float) var95 * var50 + var48;
                    if (var28 < var29) {
                        int var99 = arg2 - arg0;
                        int var100 = arg0 - arg1;
                        int var101 = this.field5083[arg1];
                        while (true) {
                            var100--;
                            if (var100 < 0) {
                                while (true) {
                                    var99--;
                                    if (var99 < 0) {
                                        return;
                                    }
                                    this.method2080(this.field5077, var20, 0, 0, var101, var94 >> 16, var92 >> 16, var78, var32, var96, var97, var98, var43, var46, var49);
                                    var94 += var30;
                                    var92 += var29;
                                    var78 += var33;
                                    var101 += this.field5081;
                                    var96 += var44;
                                    var97 += var47;
                                    var98 += var50;
                                }
                            }
                            this.method2080(this.field5077, var20, 0, 0, var101, var93 >> 16, var92 >> 16, var78, var32, var96, var97, var98, var43, var46, var49);
                            var93 += var28;
                            var92 += var29;
                            var78 += var33;
                            var101 += this.field5081;
                            var96 += var44;
                            var97 += var47;
                            var98 += var50;
                        }
                    } else {
                        int var102 = arg2 - arg0;
                        int var103 = arg0 - arg1;
                        int var104 = this.field5083[arg1];
                        while (true) {
                            var103--;
                            if (var103 < 0) {
                                while (true) {
                                    var102--;
                                    if (var102 < 0) {
                                        return;
                                    }
                                    this.method2080(this.field5077, var20, 0, 0, var104, var92 >> 16, var94 >> 16, var78, var32, var96, var97, var98, var43, var46, var49);
                                    var94 += var30;
                                    var92 += var29;
                                    var78 += var33;
                                    var104 += this.field5081;
                                    var96 += var44;
                                    var97 += var47;
                                    var98 += var50;
                                }
                            }
                            this.method2080(this.field5077, var20, 0, 0, var104, var92 >> 16, var93 >> 16, var78, var32, var96, var97, var98, var43, var46, var49);
                            var93 += var28;
                            var92 += var29;
                            var78 += var33;
                            var104 += this.field5081;
                            var96 += var44;
                            var97 += var47;
                            var98 += var50;
                        }
                    }
                }
            }
        } else if (arg2 < this.field5080) {
            if (arg0 > this.field5080) {
                arg0 = this.field5080;
            }
            if (arg1 > this.field5080) {
                arg1 = this.field5080;
            }
            int var105 = (arg8 << 9) + var32 - arg5 * var32;
            if (arg0 < arg1) {
                int var106;
                int var107 = var106 = arg5 << 16;
                if (arg2 < 0) {
                    var107 -= arg2 * var29;
                    var106 -= arg2 * var30;
                    var105 -= arg2 * var33;
                    arg2 = 0;
                }
                int var108 = arg3 << 16;
                if (arg0 < 0) {
                    var108 -= arg0 * var28;
                    arg0 = 0;
                }
                int var109 = arg2 - this.field5085;
                float var110 = (float) var109 * var44 + var42;
                float var111 = (float) var109 * var47 + var45;
                float var112 = (float) var109 * var50 + var48;
                if (var29 < var30) {
                    int var113 = arg1 - arg0;
                    int var114 = arg0 - arg2;
                    int var115 = this.field5083[arg2];
                    while (true) {
                        var114--;
                        if (var114 < 0) {
                            while (true) {
                                var113--;
                                if (var113 < 0) {
                                    return;
                                }
                                this.method2080(this.field5077, var20, 0, 0, var115, var107 >> 16, var108 >> 16, var105, var32, var110, var111, var112, var43, var46, var49);
                                var107 += var29;
                                var108 += var28;
                                var105 += var33;
                                var115 += this.field5081;
                                var110 += var44;
                                var111 += var47;
                                var112 += var50;
                            }
                        }
                        this.method2080(this.field5077, var20, 0, 0, var115, var107 >> 16, var106 >> 16, var105, var32, var110, var111, var112, var43, var46, var49);
                        var107 += var29;
                        var106 += var30;
                        var105 += var33;
                        var115 += this.field5081;
                        var110 += var44;
                        var111 += var47;
                        var112 += var50;
                    }
                } else {
                    int var116 = arg1 - arg0;
                    int var117 = arg0 - arg2;
                    int var118 = this.field5083[arg2];
                    while (true) {
                        var117--;
                        if (var117 < 0) {
                            while (true) {
                                var116--;
                                if (var116 < 0) {
                                    return;
                                }
                                this.method2080(this.field5077, var20, 0, 0, var118, var108 >> 16, var107 >> 16, var105, var32, var110, var111, var112, var43, var46, var49);
                                var107 += var29;
                                var108 += var28;
                                var105 += var33;
                                var118 += this.field5081;
                                var110 += var44;
                                var111 += var47;
                                var112 += var50;
                            }
                        }
                        this.method2080(this.field5077, var20, 0, 0, var118, var106 >> 16, var107 >> 16, var105, var32, var110, var111, var112, var43, var46, var49);
                        var107 += var29;
                        var106 += var30;
                        var105 += var33;
                        var118 += this.field5081;
                        var110 += var44;
                        var111 += var47;
                        var112 += var50;
                    }
                }
            } else {
                int var119;
                int var120 = var119 = arg5 << 16;
                if (arg2 < 0) {
                    var120 -= arg2 * var29;
                    var119 -= arg2 * var30;
                    var105 -= arg2 * var33;
                    arg2 = 0;
                }
                int var121 = arg4 << 16;
                if (arg1 < 0) {
                    var121 -= arg1 * var28;
                    arg1 = 0;
                }
                int var122 = arg2 - this.field5085;
                float var123 = (float) var122 * var44 + var42;
                float var124 = (float) var122 * var47 + var45;
                float var125 = (float) var122 * var50 + var48;
                if (var29 < var30) {
                    int var126 = arg0 - arg1;
                    int var127 = arg1 - arg2;
                    int var128 = this.field5083[arg2];
                    while (true) {
                        var127--;
                        if (var127 < 0) {
                            while (true) {
                                var126--;
                                if (var126 < 0) {
                                    return;
                                }
                                this.method2080(this.field5077, var20, 0, 0, var128, var121 >> 16, var119 >> 16, var105, var32, var123, var124, var125, var43, var46, var49);
                                var121 += var28;
                                var119 += var30;
                                var105 += var33;
                                var128 += this.field5081;
                                var123 += var44;
                                var124 += var47;
                                var125 += var50;
                            }
                        }
                        this.method2080(this.field5077, var20, 0, 0, var128, var120 >> 16, var119 >> 16, var105, var32, var123, var124, var125, var43, var46, var49);
                        var120 += var29;
                        var119 += var30;
                        var105 += var33;
                        var128 += this.field5081;
                        var123 += var44;
                        var124 += var47;
                        var125 += var50;
                    }
                } else {
                    int var129 = arg0 - arg1;
                    int var130 = arg1 - arg2;
                    int var131 = this.field5083[arg2];
                    while (true) {
                        var130--;
                        if (var130 < 0) {
                            while (true) {
                                var129--;
                                if (var129 < 0) {
                                    return;
                                }
                                this.method2080(this.field5077, var20, 0, 0, var131, var119 >> 16, var121 >> 16, var105, var32, var123, var124, var125, var43, var46, var49);
                                var121 += var28;
                                var119 += var30;
                                var105 += var33;
                                var131 += this.field5081;
                                var123 += var44;
                                var124 += var47;
                                var125 += var50;
                            }
                        }
                        this.method2080(this.field5077, var20, 0, 0, var131, var119 >> 16, var120 >> 16, var105, var32, var123, var124, var125, var43, var46, var49);
                        var120 += var29;
                        var119 += var30;
                        var105 += var33;
                        var131 += this.field5081;
                        var123 += var44;
                        var124 += var47;
                        var125 += var50;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "()I")
    public final int method2077() {
        return this.field5083[0] / this.field5081;
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(IIIIIIIII)V")
    public final void method2078(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = arg4 - arg3;
        int var11 = arg1 - arg0;
        int var12 = arg5 - arg3;
        int var13 = arg2 - arg0;
        int var14 = arg7 - arg6;
        int var15 = arg8 - arg6;
        int var16;
        if (arg1 == arg2) {
            var16 = 0;
        } else {
            var16 = (arg5 - arg4 << 16) / (arg2 - arg1);
        }
        int var17;
        if (arg0 == arg1) {
            var17 = 0;
        } else {
            var17 = (var10 << 16) / var11;
        }
        int var18;
        if (arg0 == arg2) {
            var18 = 0;
        } else {
            var18 = (var12 << 16) / var13;
        }
        int var19 = var10 * var13 - var11 * var12;
        if (var19 == 0) {
            return;
        }
        int var20 = (var13 * var14 - var11 * var15 << 8) / var19;
        int var21 = (var10 * var15 - var12 * var14 << 8) / var19;
        if (arg0 <= arg1 && arg0 <= arg2) {
            if (arg0 < this.field5080) {
                if (arg1 > this.field5080) {
                    arg1 = this.field5080;
                }
                if (arg2 > this.field5080) {
                    arg2 = this.field5080;
                }
                int var22 = (arg6 << 8) + var20 - arg3 * var20;
                if (arg1 < arg2) {
                    int var23;
                    int var24 = var23 = arg3 << 16;
                    if (arg0 < 0) {
                        var24 -= arg0 * var18;
                        var23 -= arg0 * var17;
                        var22 -= arg0 * var21;
                        arg0 = 0;
                    }
                    int var25 = arg4 << 16;
                    if (arg1 < 0) {
                        var25 -= arg1 * var16;
                        arg1 = 0;
                    }
                    if ((arg0 == arg1 || var18 >= var17) && (arg0 != arg1 || var18 <= var16)) {
                        int var29 = arg2 - arg1;
                        int var30 = arg1 - arg0;
                        int var31 = this.field5083[arg0];
                        while (true) {
                            var30--;
                            if (var30 < 0) {
                                while (true) {
                                    var29--;
                                    if (var29 < 0) {
                                        return;
                                    }
                                    this.method2071(this.field5077, var31, 0, 0, var25 >> 16, var24 >> 16, var22, var20);
                                    var24 += var18;
                                    var25 += var16;
                                    var22 += var21;
                                    var31 += this.field5081;
                                }
                            }
                            this.method2071(this.field5077, var31, 0, 0, var23 >> 16, var24 >> 16, var22, var20);
                            var24 += var18;
                            var23 += var17;
                            var22 += var21;
                            var31 += this.field5081;
                        }
                    } else {
                        int var26 = arg2 - arg1;
                        int var27 = arg1 - arg0;
                        int var28 = this.field5083[arg0];
                        while (true) {
                            var27--;
                            if (var27 < 0) {
                                while (true) {
                                    var26--;
                                    if (var26 < 0) {
                                        return;
                                    }
                                    this.method2071(this.field5077, var28, 0, 0, var24 >> 16, var25 >> 16, var22, var20);
                                    var24 += var18;
                                    var25 += var16;
                                    var22 += var21;
                                    var28 += this.field5081;
                                }
                            }
                            this.method2071(this.field5077, var28, 0, 0, var24 >> 16, var23 >> 16, var22, var20);
                            var24 += var18;
                            var23 += var17;
                            var22 += var21;
                            var28 += this.field5081;
                        }
                    }
                } else {
                    int var32;
                    int var33 = var32 = arg3 << 16;
                    if (arg0 < 0) {
                        var33 -= arg0 * var18;
                        var32 -= arg0 * var17;
                        var22 -= arg0 * var21;
                        arg0 = 0;
                    }
                    int var34 = arg5 << 16;
                    if (arg2 < 0) {
                        var34 -= arg2 * var16;
                        arg2 = 0;
                    }
                    if (arg0 != arg2 && var18 < var17 || arg0 == arg2 && var16 > var17) {
                        int var35 = arg1 - arg2;
                        int var36 = arg2 - arg0;
                        int var37 = this.field5083[arg0];
                        while (true) {
                            var36--;
                            if (var36 < 0) {
                                while (true) {
                                    var35--;
                                    if (var35 < 0) {
                                        return;
                                    }
                                    this.method2071(this.field5077, var37, 0, 0, var34 >> 16, var32 >> 16, var22, var20);
                                    var34 += var16;
                                    var32 += var17;
                                    var22 += var21;
                                    var37 += this.field5081;
                                }
                            }
                            this.method2071(this.field5077, var37, 0, 0, var33 >> 16, var32 >> 16, var22, var20);
                            var33 += var18;
                            var32 += var17;
                            var22 += var21;
                            var37 += this.field5081;
                        }
                    } else {
                        int var38 = arg1 - arg2;
                        int var39 = arg2 - arg0;
                        int var40 = this.field5083[arg0];
                        while (true) {
                            var39--;
                            if (var39 < 0) {
                                while (true) {
                                    var38--;
                                    if (var38 < 0) {
                                        return;
                                    }
                                    this.method2071(this.field5077, var40, 0, 0, var32 >> 16, var34 >> 16, var22, var20);
                                    var34 += var16;
                                    var32 += var17;
                                    var22 += var21;
                                    var40 += this.field5081;
                                }
                            }
                            this.method2071(this.field5077, var40, 0, 0, var32 >> 16, var33 >> 16, var22, var20);
                            var33 += var18;
                            var32 += var17;
                            var22 += var21;
                            var40 += this.field5081;
                        }
                    }
                }
            }
        } else if (arg1 <= arg2) {
            if (arg1 < this.field5080) {
                if (arg2 > this.field5080) {
                    arg2 = this.field5080;
                }
                if (arg0 > this.field5080) {
                    arg0 = this.field5080;
                }
                int var41 = (arg7 << 8) + var20 - arg4 * var20;
                if (arg2 < arg0) {
                    int var42;
                    int var43 = var42 = arg4 << 16;
                    if (arg1 < 0) {
                        var43 -= arg1 * var17;
                        var42 -= arg1 * var16;
                        var41 -= arg1 * var21;
                        arg1 = 0;
                    }
                    int var44 = arg5 << 16;
                    if (arg2 < 0) {
                        var44 -= arg2 * var18;
                        arg2 = 0;
                    }
                    if ((arg1 == arg2 || var17 >= var16) && (arg1 != arg2 || var17 <= var18)) {
                        int var48 = arg0 - arg2;
                        int var49 = arg2 - arg1;
                        int var50 = this.field5083[arg1];
                        while (true) {
                            var49--;
                            if (var49 < 0) {
                                while (true) {
                                    var48--;
                                    if (var48 < 0) {
                                        return;
                                    }
                                    this.method2071(this.field5077, var50, 0, 0, var44 >> 16, var43 >> 16, var41, var20);
                                    var43 += var17;
                                    var44 += var18;
                                    var41 += var21;
                                    var50 += this.field5081;
                                }
                            }
                            this.method2071(this.field5077, var50, 0, 0, var42 >> 16, var43 >> 16, var41, var20);
                            var43 += var17;
                            var42 += var16;
                            var41 += var21;
                            var50 += this.field5081;
                        }
                    } else {
                        int var45 = arg0 - arg2;
                        int var46 = arg2 - arg1;
                        int var47 = this.field5083[arg1];
                        while (true) {
                            var46--;
                            if (var46 < 0) {
                                while (true) {
                                    var45--;
                                    if (var45 < 0) {
                                        return;
                                    }
                                    this.method2071(this.field5077, var47, 0, 0, var43 >> 16, var44 >> 16, var41, var20);
                                    var43 += var17;
                                    var44 += var18;
                                    var41 += var21;
                                    var47 += this.field5081;
                                }
                            }
                            this.method2071(this.field5077, var47, 0, 0, var43 >> 16, var42 >> 16, var41, var20);
                            var43 += var17;
                            var42 += var16;
                            var41 += var21;
                            var47 += this.field5081;
                        }
                    }
                } else {
                    int var51;
                    int var52 = var51 = arg4 << 16;
                    if (arg1 < 0) {
                        var52 -= arg1 * var17;
                        var51 -= arg1 * var16;
                        var41 -= arg1 * var21;
                        arg1 = 0;
                    }
                    int var53 = arg3 << 16;
                    if (arg0 < 0) {
                        var53 -= arg0 * var18;
                        arg0 = 0;
                    }
                    if (var17 < var16) {
                        int var54 = arg2 - arg0;
                        int var55 = arg0 - arg1;
                        int var56 = this.field5083[arg1];
                        while (true) {
                            var55--;
                            if (var55 < 0) {
                                while (true) {
                                    var54--;
                                    if (var54 < 0) {
                                        return;
                                    }
                                    this.method2071(this.field5077, var56, 0, 0, var53 >> 16, var51 >> 16, var41, var20);
                                    var53 += var18;
                                    var51 += var16;
                                    var41 += var21;
                                    var56 += this.field5081;
                                }
                            }
                            this.method2071(this.field5077, var56, 0, 0, var52 >> 16, var51 >> 16, var41, var20);
                            var52 += var17;
                            var51 += var16;
                            var41 += var21;
                            var56 += this.field5081;
                        }
                    } else {
                        int var57 = arg2 - arg0;
                        int var58 = arg0 - arg1;
                        int var59 = this.field5083[arg1];
                        while (true) {
                            var58--;
                            if (var58 < 0) {
                                while (true) {
                                    var57--;
                                    if (var57 < 0) {
                                        return;
                                    }
                                    this.method2071(this.field5077, var59, 0, 0, var51 >> 16, var53 >> 16, var41, var20);
                                    var53 += var18;
                                    var51 += var16;
                                    var41 += var21;
                                    var59 += this.field5081;
                                }
                            }
                            this.method2071(this.field5077, var59, 0, 0, var51 >> 16, var52 >> 16, var41, var20);
                            var52 += var17;
                            var51 += var16;
                            var41 += var21;
                            var59 += this.field5081;
                        }
                    }
                }
            }
        } else if (arg2 < this.field5080) {
            if (arg0 > this.field5080) {
                arg0 = this.field5080;
            }
            if (arg1 > this.field5080) {
                arg1 = this.field5080;
            }
            int var60 = (arg8 << 8) + var20 - arg5 * var20;
            if (arg0 < arg1) {
                int var61;
                int var62 = var61 = arg5 << 16;
                if (arg2 < 0) {
                    var62 -= arg2 * var16;
                    var61 -= arg2 * var18;
                    var60 -= arg2 * var21;
                    arg2 = 0;
                }
                int var63 = arg3 << 16;
                if (arg0 < 0) {
                    var63 -= arg0 * var17;
                    arg0 = 0;
                }
                if (var16 < var18) {
                    int var64 = arg1 - arg0;
                    int var65 = arg0 - arg2;
                    int var66 = this.field5083[arg2];
                    while (true) {
                        var65--;
                        if (var65 < 0) {
                            while (true) {
                                var64--;
                                if (var64 < 0) {
                                    return;
                                }
                                this.method2071(this.field5077, var66, 0, 0, var62 >> 16, var63 >> 16, var60, var20);
                                var62 += var16;
                                var63 += var17;
                                var60 += var21;
                                var66 += this.field5081;
                            }
                        }
                        this.method2071(this.field5077, var66, 0, 0, var62 >> 16, var61 >> 16, var60, var20);
                        var62 += var16;
                        var61 += var18;
                        var60 += var21;
                        var66 += this.field5081;
                    }
                } else {
                    int var67 = arg1 - arg0;
                    int var68 = arg0 - arg2;
                    int var69 = this.field5083[arg2];
                    while (true) {
                        var68--;
                        if (var68 < 0) {
                            while (true) {
                                var67--;
                                if (var67 < 0) {
                                    return;
                                }
                                this.method2071(this.field5077, var69, 0, 0, var63 >> 16, var62 >> 16, var60, var20);
                                var62 += var16;
                                var63 += var17;
                                var60 += var21;
                                var69 += this.field5081;
                            }
                        }
                        this.method2071(this.field5077, var69, 0, 0, var61 >> 16, var62 >> 16, var60, var20);
                        var62 += var16;
                        var61 += var18;
                        var60 += var21;
                        var69 += this.field5081;
                    }
                }
            } else {
                int var70;
                int var71 = var70 = arg5 << 16;
                if (arg2 < 0) {
                    var71 -= arg2 * var16;
                    var70 -= arg2 * var18;
                    var60 -= arg2 * var21;
                    arg2 = 0;
                }
                int var72 = arg4 << 16;
                if (arg1 < 0) {
                    var72 -= arg1 * var17;
                    arg1 = 0;
                }
                if (var16 < var18) {
                    int var73 = arg0 - arg1;
                    int var74 = arg1 - arg2;
                    int var75 = this.field5083[arg2];
                    while (true) {
                        var74--;
                        if (var74 < 0) {
                            while (true) {
                                var73--;
                                if (var73 < 0) {
                                    return;
                                }
                                this.method2071(this.field5077, var75, 0, 0, var72 >> 16, var70 >> 16, var60, var20);
                                var72 += var17;
                                var70 += var18;
                                var60 += var21;
                                var75 += this.field5081;
                            }
                        }
                        this.method2071(this.field5077, var75, 0, 0, var71 >> 16, var70 >> 16, var60, var20);
                        var71 += var16;
                        var70 += var18;
                        var60 += var21;
                        var75 += this.field5081;
                    }
                } else {
                    int var76 = arg0 - arg1;
                    int var77 = arg1 - arg2;
                    int var78 = this.field5083[arg2];
                    while (true) {
                        var77--;
                        if (var77 < 0) {
                            while (true) {
                                var76--;
                                if (var76 < 0) {
                                    return;
                                }
                                this.method2071(this.field5077, var78, 0, 0, var70 >> 16, var72 >> 16, var60, var20);
                                var72 += var17;
                                var70 += var18;
                                var60 += var21;
                                var78 += this.field5081;
                            }
                        }
                        this.method2071(this.field5077, var78, 0, 0, var70 >> 16, var71 >> 16, var60, var20);
                        var71 += var16;
                        var70 += var18;
                        var60 += var21;
                        var78 += this.field5081;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIIIIII)V")
    public final void method2079(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 0;
        if (arg0 != arg1) {
            var8 = (arg4 - arg3 << 16) / (arg1 - arg0);
        }
        int var9 = 0;
        if (arg1 != arg2) {
            var9 = (arg5 - arg4 << 16) / (arg2 - arg1);
        }
        int var10 = 0;
        if (arg0 != arg2) {
            var10 = (arg3 - arg5 << 16) / (arg0 - arg2);
        }
        if (arg0 <= arg1 && arg0 <= arg2) {
            if (arg0 < this.field5080) {
                if (arg1 > this.field5080) {
                    arg1 = this.field5080;
                }
                if (arg2 > this.field5080) {
                    arg2 = this.field5080;
                }
                if (arg1 < arg2) {
                    int var11;
                    int var12 = var11 = arg3 << 16;
                    if (arg0 < 0) {
                        var12 -= arg0 * var10;
                        var11 -= arg0 * var8;
                        arg0 = 0;
                    }
                    int var13 = arg4 << 16;
                    if (arg1 < 0) {
                        var13 -= arg1 * var9;
                        arg1 = 0;
                    }
                    if (arg0 != arg1 && var10 < var8 || arg0 == arg1 && var10 > var9) {
                        int var14 = arg2 - arg1;
                        int var15 = arg1 - arg0;
                        int var16 = this.field5083[arg0];
                        while (true) {
                            var15--;
                            if (var15 < 0) {
                                while (true) {
                                    var14--;
                                    if (var14 < 0) {
                                        return;
                                    }
                                    this.method2074(this.field5077, var16, arg6, 0, var12 >> 16, var13 >> 16);
                                    var12 += var10;
                                    var13 += var9;
                                    var16 += this.field5081;
                                }
                            }
                            this.method2074(this.field5077, var16, arg6, 0, var12 >> 16, var11 >> 16);
                            var12 += var10;
                            var11 += var8;
                            var16 += this.field5081;
                        }
                    } else {
                        int var17 = arg2 - arg1;
                        int var18 = arg1 - arg0;
                        int var19 = this.field5083[arg0];
                        while (true) {
                            var18--;
                            if (var18 < 0) {
                                while (true) {
                                    var17--;
                                    if (var17 < 0) {
                                        return;
                                    }
                                    this.method2074(this.field5077, var19, arg6, 0, var13 >> 16, var12 >> 16);
                                    var12 += var10;
                                    var13 += var9;
                                    var19 += this.field5081;
                                }
                            }
                            this.method2074(this.field5077, var19, arg6, 0, var11 >> 16, var12 >> 16);
                            var12 += var10;
                            var11 += var8;
                            var19 += this.field5081;
                        }
                    }
                } else {
                    int var20;
                    int var21 = var20 = arg3 << 16;
                    if (arg0 < 0) {
                        var21 -= arg0 * var10;
                        var20 -= arg0 * var8;
                        arg0 = 0;
                    }
                    int var22 = arg5 << 16;
                    if (arg2 < 0) {
                        var22 -= arg2 * var9;
                        arg2 = 0;
                    }
                    if (arg0 != arg2 && var10 < var8 || arg0 == arg2 && var9 > var8) {
                        int var23 = arg1 - arg2;
                        int var24 = arg2 - arg0;
                        int var25 = this.field5083[arg0];
                        while (true) {
                            var24--;
                            if (var24 < 0) {
                                while (true) {
                                    var23--;
                                    if (var23 < 0) {
                                        return;
                                    }
                                    this.method2074(this.field5077, var25, arg6, 0, var22 >> 16, var20 >> 16);
                                    var22 += var9;
                                    var20 += var8;
                                    var25 += this.field5081;
                                }
                            }
                            this.method2074(this.field5077, var25, arg6, 0, var21 >> 16, var20 >> 16);
                            var21 += var10;
                            var20 += var8;
                            var25 += this.field5081;
                        }
                    } else {
                        int var26 = arg1 - arg2;
                        int var27 = arg2 - arg0;
                        int var28 = this.field5083[arg0];
                        while (true) {
                            var27--;
                            if (var27 < 0) {
                                while (true) {
                                    var26--;
                                    if (var26 < 0) {
                                        return;
                                    }
                                    this.method2074(this.field5077, var28, arg6, 0, var20 >> 16, var22 >> 16);
                                    var22 += var9;
                                    var20 += var8;
                                    var28 += this.field5081;
                                }
                            }
                            this.method2074(this.field5077, var28, arg6, 0, var20 >> 16, var21 >> 16);
                            var21 += var10;
                            var20 += var8;
                            var28 += this.field5081;
                        }
                    }
                }
            }
        } else if (arg1 <= arg2) {
            if (arg1 < this.field5080) {
                if (arg2 > this.field5080) {
                    arg2 = this.field5080;
                }
                if (arg0 > this.field5080) {
                    arg0 = this.field5080;
                }
                if (arg2 < arg0) {
                    int var29;
                    int var30 = var29 = arg4 << 16;
                    if (arg1 < 0) {
                        var30 -= arg1 * var8;
                        var29 -= arg1 * var9;
                        arg1 = 0;
                    }
                    int var31 = arg5 << 16;
                    if (arg2 < 0) {
                        var31 -= arg2 * var10;
                        arg2 = 0;
                    }
                    if (arg1 != arg2 && var8 < var9 || arg1 == arg2 && var8 > var10) {
                        int var32 = arg0 - arg2;
                        int var33 = arg2 - arg1;
                        int var34 = this.field5083[arg1];
                        while (true) {
                            var33--;
                            if (var33 < 0) {
                                while (true) {
                                    var32--;
                                    if (var32 < 0) {
                                        return;
                                    }
                                    this.method2074(this.field5077, var34, arg6, 0, var30 >> 16, var31 >> 16);
                                    var30 += var8;
                                    var31 += var10;
                                    var34 += this.field5081;
                                }
                            }
                            this.method2074(this.field5077, var34, arg6, 0, var30 >> 16, var29 >> 16);
                            var30 += var8;
                            var29 += var9;
                            var34 += this.field5081;
                        }
                    } else {
                        int var35 = arg0 - arg2;
                        int var36 = arg2 - arg1;
                        int var37 = this.field5083[arg1];
                        while (true) {
                            var36--;
                            if (var36 < 0) {
                                while (true) {
                                    var35--;
                                    if (var35 < 0) {
                                        return;
                                    }
                                    this.method2074(this.field5077, var37, arg6, 0, var31 >> 16, var30 >> 16);
                                    var30 += var8;
                                    var31 += var10;
                                    var37 += this.field5081;
                                }
                            }
                            this.method2074(this.field5077, var37, arg6, 0, var29 >> 16, var30 >> 16);
                            var30 += var8;
                            var29 += var9;
                            var37 += this.field5081;
                        }
                    }
                } else {
                    int var38;
                    int var39 = var38 = arg4 << 16;
                    if (arg1 < 0) {
                        var39 -= arg1 * var8;
                        var38 -= arg1 * var9;
                        arg1 = 0;
                    }
                    int var40 = arg3 << 16;
                    if (arg0 < 0) {
                        var40 -= arg0 * var10;
                        arg0 = 0;
                    }
                    if (var8 < var9) {
                        int var41 = arg2 - arg0;
                        int var42 = arg0 - arg1;
                        int var43 = this.field5083[arg1];
                        while (true) {
                            var42--;
                            if (var42 < 0) {
                                while (true) {
                                    var41--;
                                    if (var41 < 0) {
                                        return;
                                    }
                                    this.method2074(this.field5077, var43, arg6, 0, var40 >> 16, var38 >> 16);
                                    var40 += var10;
                                    var38 += var9;
                                    var43 += this.field5081;
                                }
                            }
                            this.method2074(this.field5077, var43, arg6, 0, var39 >> 16, var38 >> 16);
                            var39 += var8;
                            var38 += var9;
                            var43 += this.field5081;
                        }
                    } else {
                        int var44 = arg2 - arg0;
                        int var45 = arg0 - arg1;
                        int var46 = this.field5083[arg1];
                        while (true) {
                            var45--;
                            if (var45 < 0) {
                                while (true) {
                                    var44--;
                                    if (var44 < 0) {
                                        return;
                                    }
                                    this.method2074(this.field5077, var46, arg6, 0, var38 >> 16, var40 >> 16);
                                    var40 += var10;
                                    var38 += var9;
                                    var46 += this.field5081;
                                }
                            }
                            this.method2074(this.field5077, var46, arg6, 0, var38 >> 16, var39 >> 16);
                            var39 += var8;
                            var38 += var9;
                            var46 += this.field5081;
                        }
                    }
                }
            }
        } else if (arg2 < this.field5080) {
            if (arg0 > this.field5080) {
                arg0 = this.field5080;
            }
            if (arg1 > this.field5080) {
                arg1 = this.field5080;
            }
            if (arg0 < arg1) {
                int var47;
                int var48 = var47 = arg5 << 16;
                if (arg2 < 0) {
                    var48 -= arg2 * var9;
                    var47 -= arg2 * var10;
                    arg2 = 0;
                }
                int var49 = arg3 << 16;
                if (arg0 < 0) {
                    var49 -= arg0 * var8;
                    arg0 = 0;
                }
                if (var9 < var10) {
                    int var50 = arg1 - arg0;
                    int var51 = arg0 - arg2;
                    int var52 = this.field5083[arg2];
                    while (true) {
                        var51--;
                        if (var51 < 0) {
                            while (true) {
                                var50--;
                                if (var50 < 0) {
                                    return;
                                }
                                this.method2074(this.field5077, var52, arg6, 0, var48 >> 16, var49 >> 16);
                                var48 += var9;
                                var49 += var8;
                                var52 += this.field5081;
                            }
                        }
                        this.method2074(this.field5077, var52, arg6, 0, var48 >> 16, var47 >> 16);
                        var48 += var9;
                        var47 += var10;
                        var52 += this.field5081;
                    }
                } else {
                    int var53 = arg1 - arg0;
                    int var54 = arg0 - arg2;
                    int var55 = this.field5083[arg2];
                    while (true) {
                        var54--;
                        if (var54 < 0) {
                            while (true) {
                                var53--;
                                if (var53 < 0) {
                                    return;
                                }
                                this.method2074(this.field5077, var55, arg6, 0, var49 >> 16, var48 >> 16);
                                var48 += var9;
                                var49 += var8;
                                var55 += this.field5081;
                            }
                        }
                        this.method2074(this.field5077, var55, arg6, 0, var47 >> 16, var48 >> 16);
                        var48 += var9;
                        var47 += var10;
                        var55 += this.field5081;
                    }
                }
            } else {
                int var56;
                int var57 = var56 = arg5 << 16;
                if (arg2 < 0) {
                    var57 -= arg2 * var9;
                    var56 -= arg2 * var10;
                    arg2 = 0;
                }
                int var58 = arg4 << 16;
                if (arg1 < 0) {
                    var58 -= arg1 * var8;
                    arg1 = 0;
                }
                if (var9 < var10) {
                    int var59 = arg0 - arg1;
                    int var60 = arg1 - arg2;
                    int var61 = this.field5083[arg2];
                    while (true) {
                        var60--;
                        if (var60 < 0) {
                            while (true) {
                                var59--;
                                if (var59 < 0) {
                                    return;
                                }
                                this.method2074(this.field5077, var61, arg6, 0, var58 >> 16, var56 >> 16);
                                var58 += var8;
                                var56 += var10;
                                var61 += this.field5081;
                            }
                        }
                        this.method2074(this.field5077, var61, arg6, 0, var57 >> 16, var56 >> 16);
                        var57 += var9;
                        var56 += var10;
                        var61 += this.field5081;
                    }
                } else {
                    int var62 = arg0 - arg1;
                    int var63 = arg1 - arg2;
                    int var64 = this.field5083[arg2];
                    while (true) {
                        var63--;
                        if (var63 < 0) {
                            while (true) {
                                var62--;
                                if (var62 < 0) {
                                    return;
                                }
                                this.method2074(this.field5077, var64, arg6, 0, var56 >> 16, var58 >> 16);
                                var58 += var8;
                                var56 += var10;
                                var64 += this.field5081;
                            }
                        }
                        this.method2074(this.field5077, var64, arg6, 0, var56 >> 16, var57 >> 16);
                        var57 += var9;
                        var56 += var10;
                        var64 += this.field5081;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "([I[IIIIIIIIFFFFFF)V")
    private final void method2080(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, float arg9, float arg10, float arg11, float arg12, float arg13, float arg14) {
        if (this.field5079) {
            if (arg6 > this.field5084) {
                arg6 = this.field5084;
            }
            if (arg5 < 0) {
                arg5 = 0;
            }
        }
        if (arg5 >= arg6) {
            return;
        }
        int var16 = arg4 + arg5;
        int var17 = arg5 * arg8 + arg7;
        int var18 = arg6 - arg5;
        if (this.field5087 == 0) {
            if (this.field5082) {
                int var19 = arg5 - this.field5089;
                float var20 = (float) var19 * arg12 + arg9;
                float var21 = (float) var19 * arg13 + arg10;
                float var22 = (float) var19 * arg14 + arg11;
                int var23;
                int var24;
                if (var22 == 0.0F) {
                    var23 = 0;
                    var24 = 0;
                } else {
                    var23 = (int) (var20 * 4096.0F / var22);
                    var24 = (int) (var21 * 4096.0F / var22);
                }
                float var25 = (float) var18 * arg12 + var20;
                float var26 = (float) var18 * arg13 + var21;
                float var27 = (float) var18 * arg14 + var22;
                int var28;
                int var29;
                if (var27 == 0.0F) {
                    var28 = 0;
                    var29 = 0;
                } else {
                    var28 = (int) (var25 * 4096.0F / var27);
                    var29 = (int) (var26 * 4096.0F / var27);
                }
                int var30 = (var23 << 20) + var24;
                int var31 = ((var28 - var23) / var18 << 20) + (var29 - var24) / var18;
                int var32 = var18 >> 3;
                int var33 = arg8 << 3;
                int var34 = var17 >> 8;
                if (this.field5078) {
                    if (var32 > 0) {
                        do {
                            int var35 = arg1[(var30 >>> 26) + (var30 & 0xFC0)];
                            arg0[var16++] = ((var35 & 0xFF00FF) * var34 & 0xFF00FF00) + ((var35 & 0xFF00) * var34 & 0xFF0000) >> 8;
                            int var36 = var30 + var31;
                            int var37 = arg1[(var36 >>> 26) + (var36 & 0xFC0)];
                            arg0[var16++] = ((var37 & 0xFF00FF) * var34 & 0xFF00FF00) + ((var37 & 0xFF00) * var34 & 0xFF0000) >> 8;
                            int var38 = var31 + var36;
                            int var39 = arg1[(var38 >>> 26) + (var38 & 0xFC0)];
                            arg0[var16++] = ((var39 & 0xFF00FF) * var34 & 0xFF00FF00) + ((var39 & 0xFF00) * var34 & 0xFF0000) >> 8;
                            int var40 = var31 + var38;
                            int var41 = arg1[(var40 >>> 26) + (var40 & 0xFC0)];
                            arg0[var16++] = ((var41 & 0xFF00FF) * var34 & 0xFF00FF00) + ((var41 & 0xFF00) * var34 & 0xFF0000) >> 8;
                            int var42 = var31 + var40;
                            int var43 = arg1[(var42 >>> 26) + (var42 & 0xFC0)];
                            arg0[var16++] = ((var43 & 0xFF00FF) * var34 & 0xFF00FF00) + ((var43 & 0xFF00) * var34 & 0xFF0000) >> 8;
                            int var44 = var31 + var42;
                            int var45 = arg1[(var44 >>> 26) + (var44 & 0xFC0)];
                            arg0[var16++] = ((var45 & 0xFF00FF) * var34 & 0xFF00FF00) + ((var45 & 0xFF00) * var34 & 0xFF0000) >> 8;
                            int var46 = var31 + var44;
                            int var47 = arg1[(var46 >>> 26) + (var46 & 0xFC0)];
                            arg0[var16++] = ((var47 & 0xFF00FF) * var34 & 0xFF00FF00) + ((var47 & 0xFF00) * var34 & 0xFF0000) >> 8;
                            int var48 = var31 + var46;
                            int var49 = arg1[(var48 >>> 26) + (var48 & 0xFC0)];
                            arg0[var16++] = ((var49 & 0xFF00FF) * var34 & 0xFF00FF00) + ((var49 & 0xFF00) * var34 & 0xFF0000) >> 8;
                            var30 = var31 + var48;
                            var17 += var33;
                            var34 = var17 >> 8;
                            var32--;
                        } while (var32 > 0);
                    }
                    int var50 = arg6 - arg5 & 0x7;
                    if (var50 > 0) {
                        do {
                            int var51 = arg1[(var30 >>> 26) + (var30 & 0xFC0)];
                            arg0[var16++] = ((var51 & 0xFF00FF) * var34 & 0xFF00FF00) + ((var51 & 0xFF00) * var34 & 0xFF0000) >> 8;
                            var30 += var31;
                            var50--;
                        } while (var50 > 0);
                        return;
                    }
                    return;
                }
                if (var32 > 0) {
                    do {
                        int var52;
                        if ((var52 = arg1[(var30 >>> 26) + (var30 & 0xFC0)]) != 0) {
                            arg0[var16] = ((var52 & 0xFF00FF) * var34 & 0xFF00FF00) + ((var52 & 0xFF00) * var34 & 0xFF0000) >> 8;
                        }
                        var16++;
                        int var53 = var30 + var31;
                        int var54;
                        if ((var54 = arg1[(var53 >>> 26) + (var53 & 0xFC0)]) != 0) {
                            arg0[var16] = ((var54 & 0xFF00FF) * var34 & 0xFF00FF00) + ((var54 & 0xFF00) * var34 & 0xFF0000) >> 8;
                        }
                        var16++;
                        int var55 = var31 + var53;
                        int var56;
                        if ((var56 = arg1[(var55 >>> 26) + (var55 & 0xFC0)]) != 0) {
                            arg0[var16] = ((var56 & 0xFF00FF) * var34 & 0xFF00FF00) + ((var56 & 0xFF00) * var34 & 0xFF0000) >> 8;
                        }
                        var16++;
                        int var57 = var31 + var55;
                        int var58;
                        if ((var58 = arg1[(var57 >>> 26) + (var57 & 0xFC0)]) != 0) {
                            arg0[var16] = ((var58 & 0xFF00FF) * var34 & 0xFF00FF00) + ((var58 & 0xFF00) * var34 & 0xFF0000) >> 8;
                        }
                        var16++;
                        int var59 = var31 + var57;
                        int var60;
                        if ((var60 = arg1[(var59 >>> 26) + (var59 & 0xFC0)]) != 0) {
                            arg0[var16] = ((var60 & 0xFF00FF) * var34 & 0xFF00FF00) + ((var60 & 0xFF00) * var34 & 0xFF0000) >> 8;
                        }
                        var16++;
                        int var61 = var31 + var59;
                        int var62;
                        if ((var62 = arg1[(var61 >>> 26) + (var61 & 0xFC0)]) != 0) {
                            arg0[var16] = ((var62 & 0xFF00FF) * var34 & 0xFF00FF00) + ((var62 & 0xFF00) * var34 & 0xFF0000) >> 8;
                        }
                        var16++;
                        int var63 = var31 + var61;
                        int var64;
                        if ((var64 = arg1[(var63 >>> 26) + (var63 & 0xFC0)]) != 0) {
                            arg0[var16] = ((var64 & 0xFF00FF) * var34 & 0xFF00FF00) + ((var64 & 0xFF00) * var34 & 0xFF0000) >> 8;
                        }
                        var16++;
                        int var65 = var31 + var63;
                        int var66;
                        if ((var66 = arg1[(var65 >>> 26) + (var65 & 0xFC0)]) != 0) {
                            arg0[var16] = ((var66 & 0xFF00FF) * var34 & 0xFF00FF00) + ((var66 & 0xFF00) * var34 & 0xFF0000) >> 8;
                        }
                        var16++;
                        var30 = var31 + var65;
                        var17 += var33;
                        var34 = var17 >> 8;
                        var32--;
                    } while (var32 > 0);
                }
                int var67 = arg6 - arg5 & 0x7;
                if (var67 > 0) {
                    do {
                        int var68;
                        if ((var68 = arg1[(var30 >>> 26) + (var30 & 0xFC0)]) != 0) {
                            arg0[var16] = ((var68 & 0xFF00FF) * var34 & 0xFF00FF00) + ((var68 & 0xFF00) * var34 & 0xFF0000) >> 8;
                        }
                        var16++;
                        var30 += var31;
                        var67--;
                    } while (var67 > 0);
                    return;
                }
            } else {
                int var69 = arg5 - this.field5089;
                float var70 = (float) var69 * arg12 + arg9;
                float var71 = (float) var69 * arg13 + arg10;
                float var72 = (float) var69 * arg14 + arg11;
                int var73;
                int var74;
                if (var72 == 0.0F) {
                    var73 = 0;
                    var74 = 0;
                } else {
                    var73 = (int) (var70 * 16384.0F / var72);
                    var74 = (int) (var71 * 16384.0F / var72);
                }
                float var75 = (float) var18 * arg12 + var70;
                float var76 = (float) var18 * arg13 + var71;
                float var77 = (float) var18 * arg14 + var72;
                int var78;
                int var79;
                if (var77 == 0.0F) {
                    var78 = 0;
                    var79 = 0;
                } else {
                    var78 = (int) (var75 * 16384.0F / var77);
                    var79 = (int) (var76 * 16384.0F / var77);
                }
                int var80 = (var73 << 18) + var74;
                int var81 = ((var78 - var73) / var18 << 18) + (var79 - var74) / var18;
                int var82 = var18 >> 3;
                int var83 = arg8 << 3;
                int var84 = var17 >> 8;
                if (this.field5078) {
                    if (var82 > 0) {
                        do {
                            int var85 = arg1[(var80 >>> 25) + (var80 & 0x3F80)];
                            arg0[var16++] = ((var85 & 0xFF00FF) * var84 & 0xFF00FF00) + ((var85 & 0xFF00) * var84 & 0xFF0000) >> 8;
                            int var86 = var80 + var81;
                            int var87 = arg1[(var86 >>> 25) + (var86 & 0x3F80)];
                            arg0[var16++] = ((var87 & 0xFF00FF) * var84 & 0xFF00FF00) + ((var87 & 0xFF00) * var84 & 0xFF0000) >> 8;
                            int var88 = var81 + var86;
                            int var89 = arg1[(var88 >>> 25) + (var88 & 0x3F80)];
                            arg0[var16++] = ((var89 & 0xFF00FF) * var84 & 0xFF00FF00) + ((var89 & 0xFF00) * var84 & 0xFF0000) >> 8;
                            int var90 = var81 + var88;
                            int var91 = arg1[(var90 >>> 25) + (var90 & 0x3F80)];
                            arg0[var16++] = ((var91 & 0xFF00FF) * var84 & 0xFF00FF00) + ((var91 & 0xFF00) * var84 & 0xFF0000) >> 8;
                            int var92 = var81 + var90;
                            int var93 = arg1[(var92 >>> 25) + (var92 & 0x3F80)];
                            arg0[var16++] = ((var93 & 0xFF00FF) * var84 & 0xFF00FF00) + ((var93 & 0xFF00) * var84 & 0xFF0000) >> 8;
                            int var94 = var81 + var92;
                            int var95 = arg1[(var94 >>> 25) + (var94 & 0x3F80)];
                            arg0[var16++] = ((var95 & 0xFF00FF) * var84 & 0xFF00FF00) + ((var95 & 0xFF00) * var84 & 0xFF0000) >> 8;
                            int var96 = var81 + var94;
                            int var97 = arg1[(var96 >>> 25) + (var96 & 0x3F80)];
                            arg0[var16++] = ((var97 & 0xFF00FF) * var84 & 0xFF00FF00) + ((var97 & 0xFF00) * var84 & 0xFF0000) >> 8;
                            int var98 = var81 + var96;
                            int var99 = arg1[(var98 >>> 25) + (var98 & 0x3F80)];
                            arg0[var16++] = ((var99 & 0xFF00FF) * var84 & 0xFF00FF00) + ((var99 & 0xFF00) * var84 & 0xFF0000) >> 8;
                            var80 = var81 + var98;
                            var17 += var83;
                            var84 = var17 >> 8;
                            var82--;
                        } while (var82 > 0);
                    }
                    int var100 = arg6 - arg5 & 0x7;
                    if (var100 > 0) {
                        do {
                            int var101 = arg1[(var80 >>> 25) + (var80 & 0x3F80)];
                            arg0[var16++] = ((var101 & 0xFF00FF) * var84 & 0xFF00FF00) + ((var101 & 0xFF00) * var84 & 0xFF0000) >> 8;
                            var80 += var81;
                            var100--;
                        } while (var100 > 0);
                        return;
                    }
                } else {
                    if (var82 > 0) {
                        do {
                            int var102;
                            if ((var102 = arg1[(var80 >>> 25) + (var80 & 0x3F80)]) != 0) {
                                arg0[var16] = ((var102 & 0xFF00FF) * var84 & 0xFF00FF00) + ((var102 & 0xFF00) * var84 & 0xFF0000) >> 8;
                            }
                            var16++;
                            int var103 = var80 + var81;
                            int var104;
                            if ((var104 = arg1[(var103 >>> 25) + (var103 & 0x3F80)]) != 0) {
                                arg0[var16] = ((var104 & 0xFF00FF) * var84 & 0xFF00FF00) + ((var104 & 0xFF00) * var84 & 0xFF0000) >> 8;
                            }
                            var16++;
                            int var105 = var81 + var103;
                            int var106;
                            if ((var106 = arg1[(var105 >>> 25) + (var105 & 0x3F80)]) != 0) {
                                arg0[var16] = ((var106 & 0xFF00FF) * var84 & 0xFF00FF00) + ((var106 & 0xFF00) * var84 & 0xFF0000) >> 8;
                            }
                            var16++;
                            int var107 = var81 + var105;
                            int var108;
                            if ((var108 = arg1[(var107 >>> 25) + (var107 & 0x3F80)]) != 0) {
                                arg0[var16] = ((var108 & 0xFF00FF) * var84 & 0xFF00FF00) + ((var108 & 0xFF00) * var84 & 0xFF0000) >> 8;
                            }
                            var16++;
                            int var109 = var81 + var107;
                            int var110;
                            if ((var110 = arg1[(var109 >>> 25) + (var109 & 0x3F80)]) != 0) {
                                arg0[var16] = ((var110 & 0xFF00FF) * var84 & 0xFF00FF00) + ((var110 & 0xFF00) * var84 & 0xFF0000) >> 8;
                            }
                            var16++;
                            int var111 = var81 + var109;
                            int var112;
                            if ((var112 = arg1[(var111 >>> 25) + (var111 & 0x3F80)]) != 0) {
                                arg0[var16] = ((var112 & 0xFF00FF) * var84 & 0xFF00FF00) + ((var112 & 0xFF00) * var84 & 0xFF0000) >> 8;
                            }
                            var16++;
                            int var113 = var81 + var111;
                            int var114;
                            if ((var114 = arg1[(var113 >>> 25) + (var113 & 0x3F80)]) != 0) {
                                arg0[var16] = ((var114 & 0xFF00FF) * var84 & 0xFF00FF00) + ((var114 & 0xFF00) * var84 & 0xFF0000) >> 8;
                            }
                            var16++;
                            int var115 = var81 + var113;
                            int var116;
                            if ((var116 = arg1[(var115 >>> 25) + (var115 & 0x3F80)]) != 0) {
                                arg0[var16] = ((var116 & 0xFF00FF) * var84 & 0xFF00FF00) + ((var116 & 0xFF00) * var84 & 0xFF0000) >> 8;
                            }
                            var16++;
                            var80 = var81 + var115;
                            var17 += var83;
                            var84 = var17 >> 8;
                            var82--;
                        } while (var82 > 0);
                    }
                    int var117 = arg6 - arg5 & 0x7;
                    if (var117 <= 0) {
                        return;
                    }
                    do {
                        int var118;
                        if ((var118 = arg1[(var80 >>> 25) + (var80 & 0x3F80)]) != 0) {
                            arg0[var16] = ((var118 & 0xFF00FF) * var84 & 0xFF00FF00) + ((var118 & 0xFF00) * var84 & 0xFF0000) >> 8;
                        }
                        var16++;
                        var80 += var81;
                        var117--;
                    } while (var117 > 0);
                }
            }
            return;
        }
        int var119 = this.field5087;
        int var120 = 256 - this.field5087;
        if (!this.field5082) {
            int var207 = arg5 - this.field5089;
            float var208 = (float) var207 * arg12 + arg9;
            float var209 = (float) var207 * arg13 + arg10;
            float var210 = (float) var207 * arg14 + arg11;
            int var211;
            int var212;
            if (var210 == 0.0F) {
                var211 = 0;
                var212 = 0;
            } else {
                var211 = (int) (var208 * 16384.0F / var210);
                var212 = (int) (var209 * 16384.0F / var210);
            }
            float var213 = (float) var18 * arg12 + var208;
            float var214 = (float) var18 * arg13 + var209;
            float var215 = (float) var18 * arg14 + var210;
            int var216;
            int var217;
            if (var215 == 0.0F) {
                var216 = 0;
                var217 = 0;
            } else {
                var216 = (int) (var213 * 16384.0F / var215);
                var217 = (int) (var214 * 16384.0F / var215);
            }
            int var218 = (var211 << 18) + var212;
            int var219 = ((var216 - var211) / var18 << 18) + (var217 - var212) / var18;
            int var220 = var18 >> 3;
            int var221 = arg8 << 3;
            int var222 = var17 >> 8;
            if (this.field5078) {
                if (var220 > 0) {
                    do {
                        int var223 = arg0[var16];
                        int var224 = arg1[(var218 >>> 25) + (var218 & 0x3F80)];
                        int var225 = ((var224 & 0xFF00FF) * var222 & 0xFF00FF00) + ((var224 & 0xFF00) * var222 & 0xFF0000) >> 8;
                        arg0[var16++] = ((var223 & 0xFF00FF) * var119 + (var225 & 0xFF00FF) * var120 & 0xFF00FF00) + ((var223 & 0xFF00) * var119 + (var225 & 0xFF00) * var120 & 0xFF0000) >> 8;
                        int var226 = var218 + var219;
                        int var227 = arg0[var16];
                        int var228 = arg1[(var226 >>> 25) + (var226 & 0x3F80)];
                        int var229 = ((var228 & 0xFF00FF) * var222 & 0xFF00FF00) + ((var228 & 0xFF00) * var222 & 0xFF0000) >> 8;
                        arg0[var16++] = ((var227 & 0xFF00FF) * var119 + (var229 & 0xFF00FF) * var120 & 0xFF00FF00) + ((var227 & 0xFF00) * var119 + (var229 & 0xFF00) * var120 & 0xFF0000) >> 8;
                        int var230 = var219 + var226;
                        int var231 = arg0[var16];
                        int var232 = arg1[(var230 >>> 25) + (var230 & 0x3F80)];
                        int var233 = ((var232 & 0xFF00FF) * var222 & 0xFF00FF00) + ((var232 & 0xFF00) * var222 & 0xFF0000) >> 8;
                        arg0[var16++] = ((var231 & 0xFF00FF) * var119 + (var233 & 0xFF00FF) * var120 & 0xFF00FF00) + ((var231 & 0xFF00) * var119 + (var233 & 0xFF00) * var120 & 0xFF0000) >> 8;
                        int var234 = var219 + var230;
                        int var235 = arg0[var16];
                        int var236 = arg1[(var234 >>> 25) + (var234 & 0x3F80)];
                        int var237 = ((var236 & 0xFF00FF) * var222 & 0xFF00FF00) + ((var236 & 0xFF00) * var222 & 0xFF0000) >> 8;
                        arg0[var16++] = ((var235 & 0xFF00FF) * var119 + (var237 & 0xFF00FF) * var120 & 0xFF00FF00) + ((var235 & 0xFF00) * var119 + (var237 & 0xFF00) * var120 & 0xFF0000) >> 8;
                        int var238 = var219 + var234;
                        int var239 = arg0[var16];
                        int var240 = arg1[(var238 >>> 25) + (var238 & 0x3F80)];
                        int var241 = ((var240 & 0xFF00FF) * var222 & 0xFF00FF00) + ((var240 & 0xFF00) * var222 & 0xFF0000) >> 8;
                        arg0[var16++] = ((var239 & 0xFF00FF) * var119 + (var241 & 0xFF00FF) * var120 & 0xFF00FF00) + ((var239 & 0xFF00) * var119 + (var241 & 0xFF00) * var120 & 0xFF0000) >> 8;
                        int var242 = var219 + var238;
                        int var243 = arg0[var16];
                        int var244 = arg1[(var242 >>> 25) + (var242 & 0x3F80)];
                        int var245 = ((var244 & 0xFF00FF) * var222 & 0xFF00FF00) + ((var244 & 0xFF00) * var222 & 0xFF0000) >> 8;
                        arg0[var16++] = ((var243 & 0xFF00FF) * var119 + (var245 & 0xFF00FF) * var120 & 0xFF00FF00) + ((var243 & 0xFF00) * var119 + (var245 & 0xFF00) * var120 & 0xFF0000) >> 8;
                        int var246 = var219 + var242;
                        int var247 = arg0[var16];
                        int var248 = arg1[(var246 >>> 25) + (var246 & 0x3F80)];
                        int var249 = ((var248 & 0xFF00FF) * var222 & 0xFF00FF00) + ((var248 & 0xFF00) * var222 & 0xFF0000) >> 8;
                        arg0[var16++] = ((var247 & 0xFF00FF) * var119 + (var249 & 0xFF00FF) * var120 & 0xFF00FF00) + ((var247 & 0xFF00) * var119 + (var249 & 0xFF00) * var120 & 0xFF0000) >> 8;
                        int var250 = var219 + var246;
                        int var251 = arg0[var16];
                        int var252 = arg1[(var250 >>> 25) + (var250 & 0x3F80)];
                        int var253 = ((var252 & 0xFF00FF) * var222 & 0xFF00FF00) + ((var252 & 0xFF00) * var222 & 0xFF0000) >> 8;
                        arg0[var16++] = ((var251 & 0xFF00FF) * var119 + (var253 & 0xFF00FF) * var120 & 0xFF00FF00) + ((var251 & 0xFF00) * var119 + (var253 & 0xFF00) * var120 & 0xFF0000) >> 8;
                        var218 = var219 + var250;
                        var17 += var221;
                        var222 = var17 >> 8;
                        var220--;
                    } while (var220 > 0);
                }
                int var254 = arg6 - arg5 & 0x7;
                if (var254 > 0) {
                    do {
                        int var255 = arg0[var16];
                        int var256 = arg1[(var218 >>> 25) + (var218 & 0x3F80)];
                        int var257 = ((var256 & 0xFF00FF) * var222 & 0xFF00FF00) + ((var256 & 0xFF00) * var222 & 0xFF0000) >> 8;
                        arg0[var16++] = ((var255 & 0xFF00FF) * var119 + (var257 & 0xFF00FF) * var120 & 0xFF00FF00) + ((var255 & 0xFF00) * var119 + (var257 & 0xFF00) * var120 & 0xFF0000) >> 8;
                        var218 += var219;
                        var254--;
                    } while (var254 > 0);
                    return;
                }
            } else {
                if (var220 > 0) {
                    do {
                        int var258;
                        if ((var258 = arg1[(var218 >>> 25) + (var218 & 0x3F80)]) != 0) {
                            int var259 = arg0[var16];
                            int var260 = ((var258 & 0xFF00FF) * var222 & 0xFF00FF00) + ((var258 & 0xFF00) * var222 & 0xFF0000) >> 8;
                            arg0[var16] = ((var259 & 0xFF00FF) * var119 + (var260 & 0xFF00FF) * var120 & 0xFF00FF00) + ((var259 & 0xFF00) * var119 + (var260 & 0xFF00) * var120 & 0xFF0000) >> 8;
                        }
                        var16++;
                        int var261 = var218 + var219;
                        int var262;
                        if ((var262 = arg1[(var261 >>> 25) + (var261 & 0x3F80)]) != 0) {
                            int var263 = arg0[var16];
                            int var264 = ((var262 & 0xFF00FF) * var222 & 0xFF00FF00) + ((var262 & 0xFF00) * var222 & 0xFF0000) >> 8;
                            arg0[var16] = ((var263 & 0xFF00FF) * var119 + (var264 & 0xFF00FF) * var120 & 0xFF00FF00) + ((var263 & 0xFF00) * var119 + (var264 & 0xFF00) * var120 & 0xFF0000) >> 8;
                        }
                        var16++;
                        int var265 = var219 + var261;
                        int var266;
                        if ((var266 = arg1[(var265 >>> 25) + (var265 & 0x3F80)]) != 0) {
                            int var267 = arg0[var16];
                            int var268 = ((var266 & 0xFF00FF) * var222 & 0xFF00FF00) + ((var266 & 0xFF00) * var222 & 0xFF0000) >> 8;
                            arg0[var16] = ((var267 & 0xFF00FF) * var119 + (var268 & 0xFF00FF) * var120 & 0xFF00FF00) + ((var267 & 0xFF00) * var119 + (var268 & 0xFF00) * var120 & 0xFF0000) >> 8;
                        }
                        var16++;
                        int var269 = var219 + var265;
                        int var270;
                        if ((var270 = arg1[(var269 >>> 25) + (var269 & 0x3F80)]) != 0) {
                            int var271 = arg0[var16];
                            int var272 = ((var270 & 0xFF00FF) * var222 & 0xFF00FF00) + ((var270 & 0xFF00) * var222 & 0xFF0000) >> 8;
                            arg0[var16] = ((var271 & 0xFF00FF) * var119 + (var272 & 0xFF00FF) * var120 & 0xFF00FF00) + ((var271 & 0xFF00) * var119 + (var272 & 0xFF00) * var120 & 0xFF0000) >> 8;
                        }
                        var16++;
                        int var273 = var219 + var269;
                        int var274;
                        if ((var274 = arg1[(var273 >>> 25) + (var273 & 0x3F80)]) != 0) {
                            int var275 = arg0[var16];
                            int var276 = ((var274 & 0xFF00FF) * var222 & 0xFF00FF00) + ((var274 & 0xFF00) * var222 & 0xFF0000) >> 8;
                            arg0[var16] = ((var275 & 0xFF00FF) * var119 + (var276 & 0xFF00FF) * var120 & 0xFF00FF00) + ((var275 & 0xFF00) * var119 + (var276 & 0xFF00) * var120 & 0xFF0000) >> 8;
                        }
                        var16++;
                        int var277 = var219 + var273;
                        int var278;
                        if ((var278 = arg1[(var277 >>> 25) + (var277 & 0x3F80)]) != 0) {
                            int var279 = arg0[var16];
                            int var280 = ((var278 & 0xFF00FF) * var222 & 0xFF00FF00) + ((var278 & 0xFF00) * var222 & 0xFF0000) >> 8;
                            arg0[var16] = ((var279 & 0xFF00FF) * var119 + (var280 & 0xFF00FF) * var120 & 0xFF00FF00) + ((var279 & 0xFF00) * var119 + (var280 & 0xFF00) * var120 & 0xFF0000) >> 8;
                        }
                        var16++;
                        int var281 = var219 + var277;
                        int var282;
                        if ((var282 = arg1[(var281 >>> 25) + (var281 & 0x3F80)]) != 0) {
                            int var283 = arg0[var16];
                            int var284 = ((var282 & 0xFF00FF) * var222 & 0xFF00FF00) + ((var282 & 0xFF00) * var222 & 0xFF0000) >> 8;
                            arg0[var16] = ((var283 & 0xFF00FF) * var119 + (var284 & 0xFF00FF) * var120 & 0xFF00FF00) + ((var283 & 0xFF00) * var119 + (var284 & 0xFF00) * var120 & 0xFF0000) >> 8;
                        }
                        var16++;
                        int var285 = var219 + var281;
                        int var286;
                        if ((var286 = arg1[(var285 >>> 25) + (var285 & 0x3F80)]) != 0) {
                            int var287 = arg0[var16];
                            int var288 = ((var286 & 0xFF00FF) * var222 & 0xFF00FF00) + ((var286 & 0xFF00) * var222 & 0xFF0000) >> 8;
                            arg0[var16] = ((var287 & 0xFF00FF) * var119 + (var288 & 0xFF00FF) * var120 & 0xFF00FF00) + ((var287 & 0xFF00) * var119 + (var288 & 0xFF00) * var120 & 0xFF0000) >> 8;
                        }
                        var16++;
                        var218 = var219 + var285;
                        var17 += var221;
                        var222 = var17 >> 8;
                        var220--;
                    } while (var220 > 0);
                }
                int var289 = arg6 - arg5 & 0x7;
                if (var289 > 0) {
                    do {
                        int var290;
                        if ((var290 = arg1[(var218 >>> 25) + (var218 & 0x3F80)]) != 0) {
                            int var291 = arg0[var16];
                            int var292 = ((var290 & 0xFF00FF) * var222 & 0xFF00FF00) + ((var290 & 0xFF00) * var222 & 0xFF0000) >> 8;
                            arg0[var16] = ((var291 & 0xFF00FF) * var119 + (var292 & 0xFF00FF) * var120 & 0xFF00FF00) + ((var291 & 0xFF00) * var119 + (var292 & 0xFF00) * var120 & 0xFF0000) >> 8;
                        }
                        var16++;
                        var218 += var219;
                        var289--;
                    } while (var289 > 0);
                }
            }
            return;
        }
        int var121 = arg5 - this.field5089;
        float var122 = (float) var121 * arg12 + arg9;
        float var123 = (float) var121 * arg13 + arg10;
        float var124 = (float) var121 * arg14 + arg11;
        int var125;
        int var126;
        if (var124 == 0.0F) {
            var125 = 0;
            var126 = 0;
        } else {
            var125 = (int) (var122 * 4096.0F / var124);
            var126 = (int) (var123 * 4096.0F / var124);
        }
        float var127 = (float) var18 * arg12 + var122;
        float var128 = (float) var18 * arg13 + var123;
        float var129 = (float) var18 * arg14 + var124;
        int var130;
        int var131;
        if (var129 == 0.0F) {
            var130 = 0;
            var131 = 0;
        } else {
            var130 = (int) (var127 * 4096.0F / var129);
            var131 = (int) (var128 * 4096.0F / var129);
        }
        int var132 = (var125 << 20) + var126;
        int var133 = ((var130 - var125) / var18 << 20) + (var131 - var126) / var18;
        int var134 = var18 >> 3;
        int var135 = arg8 << 3;
        int var136 = var17 >> 8;
        if (this.field5078) {
            if (var134 > 0) {
                do {
                    int var137 = arg0[var16];
                    int var138 = arg1[(var132 >>> 26) + (var132 & 0xFC0)];
                    int var139 = ((var138 & 0xFF00FF) * var136 & 0xFF00FF00) + ((var138 & 0xFF00) * var136 & 0xFF0000) >> 8;
                    arg0[var16++] = ((var137 & 0xFF00FF) * var119 + (var139 & 0xFF00FF) * var120 & 0xFF00FF00) + ((var137 & 0xFF00) * var119 + (var139 & 0xFF00) * var120 & 0xFF0000) >> 8;
                    int var140 = var132 + var133;
                    int var141 = arg0[var16];
                    int var142 = arg1[(var140 >>> 26) + (var140 & 0xFC0)];
                    int var143 = ((var142 & 0xFF00FF) * var136 & 0xFF00FF00) + ((var142 & 0xFF00) * var136 & 0xFF0000) >> 8;
                    arg0[var16++] = ((var141 & 0xFF00FF) * var119 + (var143 & 0xFF00FF) * var120 & 0xFF00FF00) + ((var141 & 0xFF00) * var119 + (var143 & 0xFF00) * var120 & 0xFF0000) >> 8;
                    int var144 = var133 + var140;
                    int var145 = arg0[var16];
                    int var146 = arg1[(var144 >>> 26) + (var144 & 0xFC0)];
                    int var147 = ((var146 & 0xFF00FF) * var136 & 0xFF00FF00) + ((var146 & 0xFF00) * var136 & 0xFF0000) >> 8;
                    arg0[var16++] = ((var145 & 0xFF00FF) * var119 + (var147 & 0xFF00FF) * var120 & 0xFF00FF00) + ((var145 & 0xFF00) * var119 + (var147 & 0xFF00) * var120 & 0xFF0000) >> 8;
                    int var148 = var133 + var144;
                    int var149 = arg0[var16];
                    int var150 = arg1[(var148 >>> 26) + (var148 & 0xFC0)];
                    int var151 = ((var150 & 0xFF00FF) * var136 & 0xFF00FF00) + ((var150 & 0xFF00) * var136 & 0xFF0000) >> 8;
                    arg0[var16++] = ((var149 & 0xFF00FF) * var119 + (var151 & 0xFF00FF) * var120 & 0xFF00FF00) + ((var149 & 0xFF00) * var119 + (var151 & 0xFF00) * var120 & 0xFF0000) >> 8;
                    int var152 = var133 + var148;
                    int var153 = arg0[var16];
                    int var154 = arg1[(var152 >>> 26) + (var152 & 0xFC0)];
                    int var155 = ((var154 & 0xFF00FF) * var136 & 0xFF00FF00) + ((var154 & 0xFF00) * var136 & 0xFF0000) >> 8;
                    arg0[var16++] = ((var153 & 0xFF00FF) * var119 + (var155 & 0xFF00FF) * var120 & 0xFF00FF00) + ((var153 & 0xFF00) * var119 + (var155 & 0xFF00) * var120 & 0xFF0000) >> 8;
                    int var156 = var133 + var152;
                    int var157 = arg0[var16];
                    int var158 = arg1[(var156 >>> 26) + (var156 & 0xFC0)];
                    int var159 = ((var158 & 0xFF00FF) * var136 & 0xFF00FF00) + ((var158 & 0xFF00) * var136 & 0xFF0000) >> 8;
                    arg0[var16++] = ((var157 & 0xFF00FF) * var119 + (var159 & 0xFF00FF) * var120 & 0xFF00FF00) + ((var157 & 0xFF00) * var119 + (var159 & 0xFF00) * var120 & 0xFF0000) >> 8;
                    int var160 = var133 + var156;
                    int var161 = arg0[var16];
                    int var162 = arg1[(var160 >>> 26) + (var160 & 0xFC0)];
                    int var163 = ((var162 & 0xFF00FF) * var136 & 0xFF00FF00) + ((var162 & 0xFF00) * var136 & 0xFF0000) >> 8;
                    arg0[var16++] = ((var161 & 0xFF00FF) * var119 + (var163 & 0xFF00FF) * var120 & 0xFF00FF00) + ((var161 & 0xFF00) * var119 + (var163 & 0xFF00) * var120 & 0xFF0000) >> 8;
                    int var164 = var133 + var160;
                    int var165 = arg0[var16];
                    int var166 = arg1[(var164 >>> 26) + (var164 & 0xFC0)];
                    int var167 = ((var166 & 0xFF00FF) * var136 & 0xFF00FF00) + ((var166 & 0xFF00) * var136 & 0xFF0000) >> 8;
                    arg0[var16++] = ((var165 & 0xFF00FF) * var119 + (var167 & 0xFF00FF) * var120 & 0xFF00FF00) + ((var165 & 0xFF00) * var119 + (var167 & 0xFF00) * var120 & 0xFF0000) >> 8;
                    var132 = var133 + var164;
                    var17 += var135;
                    var136 = var17 >> 8;
                    var134--;
                } while (var134 > 0);
            }
            int var168 = arg6 - arg5 & 0x7;
            if (var168 > 0) {
                do {
                    int var169 = arg0[var16];
                    int var170 = arg1[(var132 >>> 26) + (var132 & 0xFC0)];
                    int var171 = ((var170 & 0xFF00FF) * var136 & 0xFF00FF00) + ((var170 & 0xFF00) * var136 & 0xFF0000) >> 8;
                    arg0[var16++] = ((var169 & 0xFF00FF) * var119 + (var171 & 0xFF00FF) * var120 & 0xFF00FF00) + ((var169 & 0xFF00) * var119 + (var171 & 0xFF00) * var120 & 0xFF0000) >> 8;
                    var132 += var133;
                    var168--;
                } while (var168 > 0);
                return;
            }
            return;
        }
        if (var134 > 0) {
            do {
                int var172;
                if ((var172 = arg1[(var132 >>> 26) + (var132 & 0xFC0)]) != 0) {
                    int var173 = arg0[var16];
                    int var174 = ((var172 & 0xFF00FF) * var136 & 0xFF00FF00) + ((var172 & 0xFF00) * var136 & 0xFF0000) >> 8;
                    arg0[var16] = ((var173 & 0xFF00FF) * var119 + (var174 & 0xFF00FF) * var120 & 0xFF00FF00) + ((var173 & 0xFF00) * var119 + (var174 & 0xFF00) * var120 & 0xFF0000) >> 8;
                }
                var16++;
                int var175 = var132 + var133;
                int var176;
                if ((var176 = arg1[(var175 >>> 26) + (var175 & 0xFC0)]) != 0) {
                    int var177 = arg0[var16];
                    int var178 = ((var176 & 0xFF00FF) * var136 & 0xFF00FF00) + ((var176 & 0xFF00) * var136 & 0xFF0000) >> 8;
                    arg0[var16] = ((var177 & 0xFF00FF) * var119 + (var178 & 0xFF00FF) * var120 & 0xFF00FF00) + ((var177 & 0xFF00) * var119 + (var178 & 0xFF00) * var120 & 0xFF0000) >> 8;
                }
                var16++;
                int var179 = var133 + var175;
                int var180;
                if ((var180 = arg1[(var179 >>> 26) + (var179 & 0xFC0)]) != 0) {
                    int var181 = arg0[var16];
                    int var182 = ((var180 & 0xFF00FF) * var136 & 0xFF00FF00) + ((var180 & 0xFF00) * var136 & 0xFF0000) >> 8;
                    arg0[var16] = ((var181 & 0xFF00FF) * var119 + (var182 & 0xFF00FF) * var120 & 0xFF00FF00) + ((var181 & 0xFF00) * var119 + (var182 & 0xFF00) * var120 & 0xFF0000) >> 8;
                }
                var16++;
                int var183 = var133 + var179;
                int var184;
                if ((var184 = arg1[(var183 >>> 26) + (var183 & 0xFC0)]) != 0) {
                    int var185 = arg0[var16];
                    int var186 = ((var184 & 0xFF00FF) * var136 & 0xFF00FF00) + ((var184 & 0xFF00) * var136 & 0xFF0000) >> 8;
                    arg0[var16] = ((var185 & 0xFF00FF) * var119 + (var186 & 0xFF00FF) * var120 & 0xFF00FF00) + ((var185 & 0xFF00) * var119 + (var186 & 0xFF00) * var120 & 0xFF0000) >> 8;
                }
                var16++;
                int var187 = var133 + var183;
                int var188;
                if ((var188 = arg1[(var187 >>> 26) + (var187 & 0xFC0)]) != 0) {
                    int var189 = arg0[var16];
                    int var190 = ((var188 & 0xFF00FF) * var136 & 0xFF00FF00) + ((var188 & 0xFF00) * var136 & 0xFF0000) >> 8;
                    arg0[var16] = ((var189 & 0xFF00FF) * var119 + (var190 & 0xFF00FF) * var120 & 0xFF00FF00) + ((var189 & 0xFF00) * var119 + (var190 & 0xFF00) * var120 & 0xFF0000) >> 8;
                }
                var16++;
                int var191 = var133 + var187;
                int var192;
                if ((var192 = arg1[(var191 >>> 26) + (var191 & 0xFC0)]) != 0) {
                    int var193 = arg0[var16];
                    int var194 = ((var192 & 0xFF00FF) * var136 & 0xFF00FF00) + ((var192 & 0xFF00) * var136 & 0xFF0000) >> 8;
                    arg0[var16] = ((var193 & 0xFF00FF) * var119 + (var194 & 0xFF00FF) * var120 & 0xFF00FF00) + ((var193 & 0xFF00) * var119 + (var194 & 0xFF00) * var120 & 0xFF0000) >> 8;
                }
                var16++;
                int var195 = var133 + var191;
                int var196;
                if ((var196 = arg1[(var195 >>> 26) + (var195 & 0xFC0)]) != 0) {
                    int var197 = arg0[var16];
                    int var198 = ((var196 & 0xFF00FF) * var136 & 0xFF00FF00) + ((var196 & 0xFF00) * var136 & 0xFF0000) >> 8;
                    arg0[var16] = ((var197 & 0xFF00FF) * var119 + (var198 & 0xFF00FF) * var120 & 0xFF00FF00) + ((var197 & 0xFF00) * var119 + (var198 & 0xFF00) * var120 & 0xFF0000) >> 8;
                }
                var16++;
                int var199 = var133 + var195;
                int var200;
                if ((var200 = arg1[(var199 >>> 26) + (var199 & 0xFC0)]) != 0) {
                    int var201 = arg0[var16];
                    int var202 = ((var200 & 0xFF00FF) * var136 & 0xFF00FF00) + ((var200 & 0xFF00) * var136 & 0xFF0000) >> 8;
                    arg0[var16] = ((var201 & 0xFF00FF) * var119 + (var202 & 0xFF00FF) * var120 & 0xFF00FF00) + ((var201 & 0xFF00) * var119 + (var202 & 0xFF00) * var120 & 0xFF0000) >> 8;
                }
                var16++;
                var132 = var133 + var199;
                var17 += var135;
                var136 = var17 >> 8;
                var134--;
            } while (var134 > 0);
        }
        int var203 = arg6 - arg5 & 0x7;
        if (var203 <= 0) {
            return;
        }
        do {
            int var204;
            if ((var204 = arg1[(var132 >>> 26) + (var132 & 0xFC0)]) != 0) {
                int var205 = arg0[var16];
                int var206 = ((var204 & 0xFF00FF) * var136 & 0xFF00FF00) + ((var204 & 0xFF00) * var136 & 0xFF0000) >> 8;
                arg0[var16] = ((var205 & 0xFF00FF) * var119 + (var206 & 0xFF00FF) * var120 & 0xFF00FF00) + ((var205 & 0xFF00) * var119 + (var206 & 0xFF00) * var120 & 0xFF0000) >> 8;
            }
            var16++;
            var132 += var133;
            var203--;
        } while (var203 > 0);
        return;
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(IIIIIIIIIIIIIIIIIII)V")
    public final void method2081(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
        int[] var20 = this.field5086.method883(arg18);
        if (var20 == null) {
            int var21 = this.field5086.method888(arg18);
            this.method2078(arg0, arg1, arg2, arg3, arg4, arg5, method2075(var21, arg6), method2075(var21, arg7), method2075(var21, arg8));
            return;
        }
        this.field5082 = this.field5086.method885(arg18);
        this.field5078 = this.field5086.method879(arg18);
        int var22 = arg4 - arg3;
        int var23 = arg1 - arg0;
        int var24 = arg5 - arg3;
        int var25 = arg2 - arg0;
        int var26 = arg7 - arg6;
        int var27 = arg8 - arg6;
        int var28 = 0;
        if (arg0 != arg1) {
            var28 = (arg4 - arg3 << 16) / (arg1 - arg0);
        }
        int var29 = 0;
        if (arg1 != arg2) {
            var29 = (arg5 - arg4 << 16) / (arg2 - arg1);
        }
        int var30 = 0;
        if (arg0 != arg2) {
            var30 = (arg3 - arg5 << 16) / (arg0 - arg2);
        }
        int var31 = var22 * var25 - var23 * var24;
        if (var31 == 0) {
            return;
        }
        int var32 = (var25 * var26 - var23 * var27 << 9) / var31;
        int var33 = (var22 * var27 - var24 * var26 << 9) / var31;
        float var34 = 8.0F / (float) this.field5086.field1729;
        float var35 = (float) this.field5086.field1759;
        int var36 = arg9 - arg10;
        int var37 = arg12 - arg13;
        int var38 = arg15 - arg16;
        int var39 = arg11 - arg9;
        int var40 = arg14 - arg12;
        int var41 = arg17 - arg15;
        float var42 = (float) (arg12 * var39 - arg9 * var40);
        float var43 = (float) (arg15 * var40 - arg12 * var41) * var34;
        float var44 = (float) (arg9 * var41 - arg15 * var39) / var35;
        float var45 = (float) (arg12 * var36 - arg9 * var37);
        float var46 = (float) (arg15 * var37 - arg12 * var38) * var34;
        float var47 = (float) (arg9 * var38 - arg15 * var36) / var35;
        float var48 = (float) (var37 * var39 - var36 * var40);
        float var49 = (float) (var38 * var40 - var37 * var41) * var34;
        float var50 = (float) (var36 * var41 - var38 * var39) / var35;
        if (arg0 <= arg1 && arg0 <= arg2) {
            if (arg0 < this.field5080) {
                if (arg1 > this.field5080) {
                    arg1 = this.field5080;
                }
                if (arg2 > this.field5080) {
                    arg2 = this.field5080;
                }
                int var51 = (arg6 << 9) + var32 - arg3 * var32;
                if (arg1 < arg2) {
                    int var52;
                    int var53 = var52 = arg3 << 16;
                    if (arg0 < 0) {
                        var53 -= arg0 * var30;
                        var52 -= arg0 * var28;
                        var51 -= arg0 * var33;
                        arg0 = 0;
                    }
                    int var54 = arg4 << 16;
                    if (arg1 < 0) {
                        var54 -= arg1 * var29;
                        arg1 = 0;
                    }
                    int var55 = arg0 - this.field5085;
                    float var56 = (float) var55 * var44 + var42;
                    float var57 = (float) var55 * var47 + var45;
                    float var58 = (float) var55 * var50 + var48;
                    if (arg0 != arg1 && var30 < var28 || arg0 == arg1 && var30 > var29) {
                        int var59 = arg2 - arg1;
                        int var60 = arg1 - arg0;
                        int var61 = this.field5083[arg0];
                        while (true) {
                            var60--;
                            if (var60 < 0) {
                                while (true) {
                                    var59--;
                                    if (var59 < 0) {
                                        return;
                                    }
                                    this.method2070(this.field5077, var20, 0, 0, var61, var53 >> 16, var54 >> 16, var51, var32, var56, var57, var58, var43, var46, var49);
                                    var53 += var30;
                                    var54 += var29;
                                    var51 += var33;
                                    var61 += this.field5081;
                                    var56 += var44;
                                    var57 += var47;
                                    var58 += var50;
                                }
                            }
                            this.method2070(this.field5077, var20, 0, 0, var61, var53 >> 16, var52 >> 16, var51, var32, var56, var57, var58, var43, var46, var49);
                            var53 += var30;
                            var52 += var28;
                            var51 += var33;
                            var61 += this.field5081;
                            var56 += var44;
                            var57 += var47;
                            var58 += var50;
                        }
                    } else {
                        int var62 = arg2 - arg1;
                        int var63 = arg1 - arg0;
                        int var64 = this.field5083[arg0];
                        while (true) {
                            var63--;
                            if (var63 < 0) {
                                while (true) {
                                    var62--;
                                    if (var62 < 0) {
                                        return;
                                    }
                                    this.method2070(this.field5077, var20, 0, 0, var64, var54 >> 16, var53 >> 16, var51, var32, var56, var57, var58, var43, var46, var49);
                                    var53 += var30;
                                    var54 += var29;
                                    var51 += var33;
                                    var64 += this.field5081;
                                    var56 += var44;
                                    var57 += var47;
                                    var58 += var50;
                                }
                            }
                            this.method2070(this.field5077, var20, 0, 0, var64, var52 >> 16, var53 >> 16, var51, var32, var56, var57, var58, var43, var46, var49);
                            var53 += var30;
                            var52 += var28;
                            var51 += var33;
                            var64 += this.field5081;
                            var56 += var44;
                            var57 += var47;
                            var58 += var50;
                        }
                    }
                } else {
                    int var65;
                    int var66 = var65 = arg3 << 16;
                    if (arg0 < 0) {
                        var66 -= arg0 * var30;
                        var65 -= arg0 * var28;
                        var51 -= arg0 * var33;
                        arg0 = 0;
                    }
                    int var67 = arg5 << 16;
                    if (arg2 < 0) {
                        var67 -= arg2 * var29;
                        arg2 = 0;
                    }
                    int var68 = arg0 - this.field5085;
                    float var69 = (float) var68 * var44 + var42;
                    float var70 = (float) var68 * var47 + var45;
                    float var71 = (float) var68 * var50 + var48;
                    if ((arg0 == arg2 || var30 >= var28) && (arg0 != arg2 || var29 <= var28)) {
                        int var75 = arg1 - arg2;
                        int var76 = arg2 - arg0;
                        int var77 = this.field5083[arg0];
                        while (true) {
                            var76--;
                            if (var76 < 0) {
                                while (true) {
                                    var75--;
                                    if (var75 < 0) {
                                        return;
                                    }
                                    this.method2070(this.field5077, var20, 0, 0, var77, var65 >> 16, var67 >> 16, var51, var32, var69, var70, var71, var43, var46, var49);
                                    var67 += var29;
                                    var65 += var28;
                                    var51 += var33;
                                    var77 += this.field5081;
                                    var69 += var44;
                                    var70 += var47;
                                    var71 += var50;
                                }
                            }
                            this.method2070(this.field5077, var20, 0, 0, var77, var65 >> 16, var66 >> 16, var51, var32, var69, var70, var71, var43, var46, var49);
                            var66 += var30;
                            var65 += var28;
                            var51 += var33;
                            var77 += this.field5081;
                            var69 += var44;
                            var70 += var47;
                            var71 += var50;
                        }
                    } else {
                        int var72 = arg1 - arg2;
                        int var73 = arg2 - arg0;
                        int var74 = this.field5083[arg0];
                        while (true) {
                            var73--;
                            if (var73 < 0) {
                                while (true) {
                                    var72--;
                                    if (var72 < 0) {
                                        return;
                                    }
                                    this.method2070(this.field5077, var20, 0, 0, var74, var67 >> 16, var65 >> 16, var51, var32, var69, var70, var71, var43, var46, var49);
                                    var67 += var29;
                                    var65 += var28;
                                    var51 += var33;
                                    var74 += this.field5081;
                                    var69 += var44;
                                    var70 += var47;
                                    var71 += var50;
                                }
                            }
                            this.method2070(this.field5077, var20, 0, 0, var74, var66 >> 16, var65 >> 16, var51, var32, var69, var70, var71, var43, var46, var49);
                            var66 += var30;
                            var65 += var28;
                            var51 += var33;
                            var74 += this.field5081;
                            var69 += var44;
                            var70 += var47;
                            var71 += var50;
                        }
                    }
                }
            }
        } else if (arg1 <= arg2) {
            if (arg1 < this.field5080) {
                if (arg2 > this.field5080) {
                    arg2 = this.field5080;
                }
                if (arg0 > this.field5080) {
                    arg0 = this.field5080;
                }
                int var78 = (arg7 << 9) + var32 - arg4 * var32;
                if (arg2 < arg0) {
                    int var79;
                    int var80 = var79 = arg4 << 16;
                    if (arg1 < 0) {
                        var80 -= arg1 * var28;
                        var79 -= arg1 * var29;
                        var78 -= arg1 * var33;
                        arg1 = 0;
                    }
                    int var81 = arg5 << 16;
                    if (arg2 < 0) {
                        var81 -= arg2 * var30;
                        arg2 = 0;
                    }
                    int var82 = arg1 - this.field5085;
                    float var83 = (float) var82 * var44 + var42;
                    float var84 = (float) var82 * var47 + var45;
                    float var85 = (float) var82 * var50 + var48;
                    if (arg1 != arg2 && var28 < var29 || arg1 == arg2 && var28 > var30) {
                        int var86 = arg0 - arg2;
                        int var87 = arg2 - arg1;
                        int var88 = this.field5083[arg1];
                        while (true) {
                            var87--;
                            if (var87 < 0) {
                                while (true) {
                                    var86--;
                                    if (var86 < 0) {
                                        return;
                                    }
                                    this.method2070(this.field5077, var20, 0, 0, var88, var80 >> 16, var81 >> 16, var78, var32, var83, var84, var85, var43, var46, var49);
                                    var80 += var28;
                                    var81 += var30;
                                    var78 += var33;
                                    var88 += this.field5081;
                                    var83 += var44;
                                    var84 += var47;
                                    var85 += var50;
                                }
                            }
                            this.method2070(this.field5077, var20, 0, 0, var88, var80 >> 16, var79 >> 16, var78, var32, var83, var84, var85, var43, var46, var49);
                            var80 += var28;
                            var79 += var29;
                            var78 += var33;
                            var88 += this.field5081;
                            var83 += var44;
                            var84 += var47;
                            var85 += var50;
                        }
                    } else {
                        int var89 = arg0 - arg2;
                        int var90 = arg2 - arg1;
                        int var91 = this.field5083[arg1];
                        while (true) {
                            var90--;
                            if (var90 < 0) {
                                while (true) {
                                    var89--;
                                    if (var89 < 0) {
                                        return;
                                    }
                                    this.method2070(this.field5077, var20, 0, 0, var91, var81 >> 16, var80 >> 16, var78, var32, var83, var84, var85, var43, var46, var49);
                                    var80 += var28;
                                    var81 += var30;
                                    var78 += var33;
                                    var91 += this.field5081;
                                    var83 += var44;
                                    var84 += var47;
                                    var85 += var50;
                                }
                            }
                            this.method2070(this.field5077, var20, 0, 0, var91, var79 >> 16, var80 >> 16, var78, var32, var83, var84, var85, var43, var46, var49);
                            var80 += var28;
                            var79 += var29;
                            var78 += var33;
                            var91 += this.field5081;
                            var83 += var44;
                            var84 += var47;
                            var85 += var50;
                        }
                    }
                } else {
                    int var92;
                    int var93 = var92 = arg4 << 16;
                    if (arg1 < 0) {
                        var93 -= arg1 * var28;
                        var92 -= arg1 * var29;
                        var78 -= arg1 * var33;
                        arg1 = 0;
                    }
                    int var94 = arg3 << 16;
                    if (arg0 < 0) {
                        var94 -= arg0 * var30;
                        arg0 = 0;
                    }
                    int var95 = arg1 - this.field5085;
                    float var96 = (float) var95 * var44 + var42;
                    float var97 = (float) var95 * var47 + var45;
                    float var98 = (float) var95 * var50 + var48;
                    if (var28 < var29) {
                        int var99 = arg2 - arg0;
                        int var100 = arg0 - arg1;
                        int var101 = this.field5083[arg1];
                        while (true) {
                            var100--;
                            if (var100 < 0) {
                                while (true) {
                                    var99--;
                                    if (var99 < 0) {
                                        return;
                                    }
                                    this.method2070(this.field5077, var20, 0, 0, var101, var94 >> 16, var92 >> 16, var78, var32, var96, var97, var98, var43, var46, var49);
                                    var94 += var30;
                                    var92 += var29;
                                    var78 += var33;
                                    var101 += this.field5081;
                                    var96 += var44;
                                    var97 += var47;
                                    var98 += var50;
                                }
                            }
                            this.method2070(this.field5077, var20, 0, 0, var101, var93 >> 16, var92 >> 16, var78, var32, var96, var97, var98, var43, var46, var49);
                            var93 += var28;
                            var92 += var29;
                            var78 += var33;
                            var101 += this.field5081;
                            var96 += var44;
                            var97 += var47;
                            var98 += var50;
                        }
                    } else {
                        int var102 = arg2 - arg0;
                        int var103 = arg0 - arg1;
                        int var104 = this.field5083[arg1];
                        while (true) {
                            var103--;
                            if (var103 < 0) {
                                while (true) {
                                    var102--;
                                    if (var102 < 0) {
                                        return;
                                    }
                                    this.method2070(this.field5077, var20, 0, 0, var104, var92 >> 16, var94 >> 16, var78, var32, var96, var97, var98, var43, var46, var49);
                                    var94 += var30;
                                    var92 += var29;
                                    var78 += var33;
                                    var104 += this.field5081;
                                    var96 += var44;
                                    var97 += var47;
                                    var98 += var50;
                                }
                            }
                            this.method2070(this.field5077, var20, 0, 0, var104, var92 >> 16, var93 >> 16, var78, var32, var96, var97, var98, var43, var46, var49);
                            var93 += var28;
                            var92 += var29;
                            var78 += var33;
                            var104 += this.field5081;
                            var96 += var44;
                            var97 += var47;
                            var98 += var50;
                        }
                    }
                }
            }
        } else if (arg2 < this.field5080) {
            if (arg0 > this.field5080) {
                arg0 = this.field5080;
            }
            if (arg1 > this.field5080) {
                arg1 = this.field5080;
            }
            int var105 = (arg8 << 9) + var32 - arg5 * var32;
            if (arg0 < arg1) {
                int var106;
                int var107 = var106 = arg5 << 16;
                if (arg2 < 0) {
                    var107 -= arg2 * var29;
                    var106 -= arg2 * var30;
                    var105 -= arg2 * var33;
                    arg2 = 0;
                }
                int var108 = arg3 << 16;
                if (arg0 < 0) {
                    var108 -= arg0 * var28;
                    arg0 = 0;
                }
                int var109 = arg2 - this.field5085;
                float var110 = (float) var109 * var44 + var42;
                float var111 = (float) var109 * var47 + var45;
                float var112 = (float) var109 * var50 + var48;
                if (var29 < var30) {
                    int var113 = arg1 - arg0;
                    int var114 = arg0 - arg2;
                    int var115 = this.field5083[arg2];
                    while (true) {
                        var114--;
                        if (var114 < 0) {
                            while (true) {
                                var113--;
                                if (var113 < 0) {
                                    return;
                                }
                                this.method2070(this.field5077, var20, 0, 0, var115, var107 >> 16, var108 >> 16, var105, var32, var110, var111, var112, var43, var46, var49);
                                var107 += var29;
                                var108 += var28;
                                var105 += var33;
                                var115 += this.field5081;
                                var110 += var44;
                                var111 += var47;
                                var112 += var50;
                            }
                        }
                        this.method2070(this.field5077, var20, 0, 0, var115, var107 >> 16, var106 >> 16, var105, var32, var110, var111, var112, var43, var46, var49);
                        var107 += var29;
                        var106 += var30;
                        var105 += var33;
                        var115 += this.field5081;
                        var110 += var44;
                        var111 += var47;
                        var112 += var50;
                    }
                } else {
                    int var116 = arg1 - arg0;
                    int var117 = arg0 - arg2;
                    int var118 = this.field5083[arg2];
                    while (true) {
                        var117--;
                        if (var117 < 0) {
                            while (true) {
                                var116--;
                                if (var116 < 0) {
                                    return;
                                }
                                this.method2070(this.field5077, var20, 0, 0, var118, var108 >> 16, var107 >> 16, var105, var32, var110, var111, var112, var43, var46, var49);
                                var107 += var29;
                                var108 += var28;
                                var105 += var33;
                                var118 += this.field5081;
                                var110 += var44;
                                var111 += var47;
                                var112 += var50;
                            }
                        }
                        this.method2070(this.field5077, var20, 0, 0, var118, var106 >> 16, var107 >> 16, var105, var32, var110, var111, var112, var43, var46, var49);
                        var107 += var29;
                        var106 += var30;
                        var105 += var33;
                        var118 += this.field5081;
                        var110 += var44;
                        var111 += var47;
                        var112 += var50;
                    }
                }
            } else {
                int var119;
                int var120 = var119 = arg5 << 16;
                if (arg2 < 0) {
                    var120 -= arg2 * var29;
                    var119 -= arg2 * var30;
                    var105 -= arg2 * var33;
                    arg2 = 0;
                }
                int var121 = arg4 << 16;
                if (arg1 < 0) {
                    var121 -= arg1 * var28;
                    arg1 = 0;
                }
                int var122 = arg2 - this.field5085;
                float var123 = (float) var122 * var44 + var42;
                float var124 = (float) var122 * var47 + var45;
                float var125 = (float) var122 * var50 + var48;
                if (var29 < var30) {
                    int var126 = arg0 - arg1;
                    int var127 = arg1 - arg2;
                    int var128 = this.field5083[arg2];
                    while (true) {
                        var127--;
                        if (var127 < 0) {
                            while (true) {
                                var126--;
                                if (var126 < 0) {
                                    return;
                                }
                                this.method2070(this.field5077, var20, 0, 0, var128, var121 >> 16, var119 >> 16, var105, var32, var123, var124, var125, var43, var46, var49);
                                var121 += var28;
                                var119 += var30;
                                var105 += var33;
                                var128 += this.field5081;
                                var123 += var44;
                                var124 += var47;
                                var125 += var50;
                            }
                        }
                        this.method2070(this.field5077, var20, 0, 0, var128, var120 >> 16, var119 >> 16, var105, var32, var123, var124, var125, var43, var46, var49);
                        var120 += var29;
                        var119 += var30;
                        var105 += var33;
                        var128 += this.field5081;
                        var123 += var44;
                        var124 += var47;
                        var125 += var50;
                    }
                } else {
                    int var129 = arg0 - arg1;
                    int var130 = arg1 - arg2;
                    int var131 = this.field5083[arg2];
                    while (true) {
                        var130--;
                        if (var130 < 0) {
                            while (true) {
                                var129--;
                                if (var129 < 0) {
                                    return;
                                }
                                this.method2070(this.field5077, var20, 0, 0, var131, var119 >> 16, var121 >> 16, var105, var32, var123, var124, var125, var43, var46, var49);
                                var121 += var28;
                                var119 += var30;
                                var105 += var33;
                                var131 += this.field5081;
                                var123 += var44;
                                var124 += var47;
                                var125 += var50;
                            }
                        }
                        this.method2070(this.field5077, var20, 0, 0, var131, var119 >> 16, var120 >> 16, var105, var32, var123, var124, var125, var43, var46, var49);
                        var120 += var29;
                        var119 += var30;
                        var105 += var33;
                        var131 += this.field5081;
                        var123 += var44;
                        var124 += var47;
                        var125 += var50;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "()I")
    public final int method2082() {
        return this.field5083[0] % this.field5081;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "([I[IIIIIIIIIIIFFFFFF)V")
    private final void method2083(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, float arg12, float arg13, float arg14, float arg15, float arg16, float arg17) {
        if (this.field5079) {
            if (arg6 > this.field5084) {
                arg6 = this.field5084;
            }
            if (arg5 < 0) {
                arg5 = 0;
            }
        }
        if (arg5 >= arg6) {
            return;
        }
        int var19 = arg4 + arg5;
        int var20 = arg5 * arg8 + arg7;
        int var21 = arg5 * arg11 + arg10;
        int var22 = arg6 - arg5;
        int var23 = arg8 << 3;
        int var24 = var20 >> 16;
        int var25 = 255 - var24;
        int var26 = ((arg9 & 0xFF00FF) * var24 & 0xFF00FF00 | (arg9 & 0xFF00) * var24 & 0xFF0000) >>> 8;
        int var10000;
        if (this.field5087 == 0) {
            if (this.field5082) {
                int var27 = arg5 - this.field5089;
                float var28 = arg15 / 8.0F * (float) var27 + arg12;
                float var29 = arg16 / 8.0F * (float) var27 + arg13;
                float var30 = arg17 / 8.0F * (float) var27 + arg14;
                int var31;
                int var32;
                if (var30 == 0.0F) {
                    var31 = 0;
                    var32 = 0;
                } else {
                    var31 = (int) (var28 * 4096.0F / var30);
                    var32 = (int) (var29 * 4096.0F / var30);
                }
                float var33 = arg15 + var28;
                float var34 = arg16 + var29;
                float var35 = arg17 + var30;
                int var36;
                int var37;
                if (var35 == 0.0F) {
                    var36 = 0;
                    var37 = 0;
                } else {
                    var36 = (int) (var33 * 4096.0F / var35);
                    var37 = (int) (var34 * 4096.0F / var35);
                }
                int var38 = (var31 << 20) + var32;
                int var39 = (var36 - var31 >> 3 << 20) + (var37 - var32 >> 3);
                int var40 = var22 >> 3;
                int var41 = arg11 << 3;
                int var42 = var21 >> 8;
                if (this.field5078) {
                    if (var40 > 0) {
                        do {
                            int var43 = arg1[(var38 >>> 26) + (var38 & 0xFC0)];
                            int var44 = ((var43 & 0xFF00FF) * var42 & 0xFF00FF00) + ((var43 & 0xFF00) * var42 & 0xFF0000) >> 8;
                            arg0[var19++] = (((var44 & 0xFF00FF) * var25 & 0xFF00FF00 | (var44 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                            int var45 = var38 + var39;
                            int var46 = arg1[(var45 >>> 26) + (var45 & 0xFC0)];
                            int var47 = ((var46 & 0xFF00FF) * var42 & 0xFF00FF00) + ((var46 & 0xFF00) * var42 & 0xFF0000) >> 8;
                            arg0[var19++] = (((var47 & 0xFF00FF) * var25 & 0xFF00FF00 | (var47 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                            int var48 = var39 + var45;
                            int var49 = arg1[(var48 >>> 26) + (var48 & 0xFC0)];
                            int var50 = ((var49 & 0xFF00FF) * var42 & 0xFF00FF00) + ((var49 & 0xFF00) * var42 & 0xFF0000) >> 8;
                            arg0[var19++] = (((var50 & 0xFF00FF) * var25 & 0xFF00FF00 | (var50 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                            int var51 = var39 + var48;
                            int var52 = arg1[(var51 >>> 26) + (var51 & 0xFC0)];
                            int var53 = ((var52 & 0xFF00FF) * var42 & 0xFF00FF00) + ((var52 & 0xFF00) * var42 & 0xFF0000) >> 8;
                            arg0[var19++] = (((var53 & 0xFF00FF) * var25 & 0xFF00FF00 | (var53 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                            int var54 = var39 + var51;
                            int var55 = arg1[(var54 >>> 26) + (var54 & 0xFC0)];
                            int var56 = ((var55 & 0xFF00FF) * var42 & 0xFF00FF00) + ((var55 & 0xFF00) * var42 & 0xFF0000) >> 8;
                            arg0[var19++] = (((var56 & 0xFF00FF) * var25 & 0xFF00FF00 | (var56 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                            int var57 = var39 + var54;
                            int var58 = arg1[(var57 >>> 26) + (var57 & 0xFC0)];
                            int var59 = ((var58 & 0xFF00FF) * var42 & 0xFF00FF00) + ((var58 & 0xFF00) * var42 & 0xFF0000) >> 8;
                            arg0[var19++] = (((var59 & 0xFF00FF) * var25 & 0xFF00FF00 | (var59 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                            int var60 = var39 + var57;
                            int var61 = arg1[(var60 >>> 26) + (var60 & 0xFC0)];
                            int var62 = ((var61 & 0xFF00FF) * var42 & 0xFF00FF00) + ((var61 & 0xFF00) * var42 & 0xFF0000) >> 8;
                            arg0[var19++] = (((var62 & 0xFF00FF) * var25 & 0xFF00FF00 | (var62 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                            int var63 = var39 + var60;
                            int var64 = arg1[(var63 >>> 26) + (var63 & 0xFC0)];
                            int var65 = ((var64 & 0xFF00FF) * var42 & 0xFF00FF00) + ((var64 & 0xFF00) * var42 & 0xFF0000) >> 8;
                            arg0[var19++] = (((var65 & 0xFF00FF) * var25 & 0xFF00FF00 | (var65 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                            var10000 = var39 + var63;
                            int var67 = var36;
                            int var68 = var37;
                            var33 += arg15;
                            var34 += arg16;
                            var35 += arg17;
                            if (var35 == 0.0F) {
                                var36 = 0;
                                var37 = 0;
                            } else {
                                var36 = (int) (var33 * 4096.0F / var35);
                                var37 = (int) (var34 * 4096.0F / var35);
                            }
                            var38 = (var67 << 20) + var68;
                            var39 = (var36 - var67 >> 3 << 20) + (var37 - var68 >> 3);
                            var21 += var41;
                            var42 = var21 >> 8;
                            var20 += var23;
                            int var69 = var20 >> 16;
                            var25 = 255 - var69;
                            var26 = ((arg9 & 0xFF00FF) * var69 & 0xFF00FF00 | (arg9 & 0xFF00) * var69 & 0xFF0000) >>> 8;
                            var40--;
                        } while (var40 > 0);
                    }
                    int var70 = arg6 - arg5 & 0x7;
                    if (var70 > 0) {
                        do {
                            int var71 = arg1[(var38 >>> 26) + (var38 & 0xFC0)];
                            int var72 = ((var71 & 0xFF00FF) * var42 & 0xFF00FF00) + ((var71 & 0xFF00) * var42 & 0xFF0000) >> 8;
                            arg0[var19++] = (((var72 & 0xFF00FF) * var25 & 0xFF00FF00 | (var72 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                            var38 += var39;
                            var70--;
                        } while (var70 > 0);
                        return;
                    }
                    return;
                }
                if (var40 > 0) {
                    do {
                        int var73;
                        if ((var73 = arg1[(var38 >>> 26) + (var38 & 0xFC0)]) != 0) {
                            int var74 = ((var73 & 0xFF00FF) * var42 & 0xFF00FF00) + ((var73 & 0xFF00) * var42 & 0xFF0000) >> 8;
                            arg0[var19] = (((var74 & 0xFF00FF) * var25 & 0xFF00FF00 | (var74 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                        }
                        var19++;
                        int var75 = var38 + var39;
                        int var76;
                        if ((var76 = arg1[(var75 >>> 26) + (var75 & 0xFC0)]) != 0) {
                            int var77 = ((var76 & 0xFF00FF) * var42 & 0xFF00FF00) + ((var76 & 0xFF00) * var42 & 0xFF0000) >> 8;
                            arg0[var19] = (((var77 & 0xFF00FF) * var25 & 0xFF00FF00 | (var77 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                        }
                        var19++;
                        int var78 = var39 + var75;
                        int var79;
                        if ((var79 = arg1[(var78 >>> 26) + (var78 & 0xFC0)]) != 0) {
                            int var80 = ((var79 & 0xFF00FF) * var42 & 0xFF00FF00) + ((var79 & 0xFF00) * var42 & 0xFF0000) >> 8;
                            arg0[var19] = (((var80 & 0xFF00FF) * var25 & 0xFF00FF00 | (var80 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                        }
                        var19++;
                        int var81 = var39 + var78;
                        int var82;
                        if ((var82 = arg1[(var81 >>> 26) + (var81 & 0xFC0)]) != 0) {
                            int var83 = ((var82 & 0xFF00FF) * var42 & 0xFF00FF00) + ((var82 & 0xFF00) * var42 & 0xFF0000) >> 8;
                            arg0[var19] = (((var83 & 0xFF00FF) * var25 & 0xFF00FF00 | (var83 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                        }
                        var19++;
                        int var84 = var39 + var81;
                        int var85;
                        if ((var85 = arg1[(var84 >>> 26) + (var84 & 0xFC0)]) != 0) {
                            int var86 = ((var85 & 0xFF00FF) * var42 & 0xFF00FF00) + ((var85 & 0xFF00) * var42 & 0xFF0000) >> 8;
                            arg0[var19] = (((var86 & 0xFF00FF) * var25 & 0xFF00FF00 | (var86 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                        }
                        var19++;
                        int var87 = var39 + var84;
                        int var88;
                        if ((var88 = arg1[(var87 >>> 26) + (var87 & 0xFC0)]) != 0) {
                            int var89 = ((var88 & 0xFF00FF) * var42 & 0xFF00FF00) + ((var88 & 0xFF00) * var42 & 0xFF0000) >> 8;
                            arg0[var19] = (((var89 & 0xFF00FF) * var25 & 0xFF00FF00 | (var89 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                        }
                        var19++;
                        int var90 = var39 + var87;
                        int var91;
                        if ((var91 = arg1[(var90 >>> 26) + (var90 & 0xFC0)]) != 0) {
                            int var92 = ((var91 & 0xFF00FF) * var42 & 0xFF00FF00) + ((var91 & 0xFF00) * var42 & 0xFF0000) >> 8;
                            arg0[var19] = (((var92 & 0xFF00FF) * var25 & 0xFF00FF00 | (var92 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                        }
                        var19++;
                        int var93 = var39 + var90;
                        int var94;
                        if ((var94 = arg1[(var93 >>> 26) + (var93 & 0xFC0)]) != 0) {
                            int var95 = ((var94 & 0xFF00FF) * var42 & 0xFF00FF00) + ((var94 & 0xFF00) * var42 & 0xFF0000) >> 8;
                            arg0[var19] = (((var95 & 0xFF00FF) * var25 & 0xFF00FF00 | (var95 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                        }
                        var19++;
                        var10000 = var39 + var93;
                        int var97 = var36;
                        int var98 = var37;
                        var33 += arg15;
                        var34 += arg16;
                        var35 += arg17;
                        if (var35 == 0.0F) {
                            var36 = 0;
                            var37 = 0;
                        } else {
                            var36 = (int) (var33 * 4096.0F / var35);
                            var37 = (int) (var34 * 4096.0F / var35);
                        }
                        var38 = (var97 << 20) + var98;
                        var39 = (var36 - var97 >> 3 << 20) + (var37 - var98 >> 3);
                        var21 += var41;
                        var42 = var21 >> 8;
                        var20 += var23;
                        int var99 = var20 >> 16;
                        var25 = 255 - var99;
                        var26 = ((arg9 & 0xFF00FF) * var99 & 0xFF00FF00 | (arg9 & 0xFF00) * var99 & 0xFF0000) >>> 8;
                        var40--;
                    } while (var40 > 0);
                }
                int var100 = arg6 - arg5 & 0x7;
                if (var100 > 0) {
                    do {
                        int var101;
                        if ((var101 = arg1[(var38 >>> 26) + (var38 & 0xFC0)]) != 0) {
                            int var102 = ((var101 & 0xFF00FF) * var42 & 0xFF00FF00) + ((var101 & 0xFF00) * var42 & 0xFF0000) >> 8;
                            arg0[var19] = (((var102 & 0xFF00FF) * var25 & 0xFF00FF00 | (var102 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                        }
                        var19++;
                        var38 += var39;
                        var100--;
                    } while (var100 > 0);
                    return;
                }
                return;
            }
            int var103 = arg5 - this.field5089;
            float var104 = arg15 / 8.0F * (float) var103 + arg12;
            float var105 = arg16 / 8.0F * (float) var103 + arg13;
            float var106 = arg17 / 8.0F * (float) var103 + arg14;
            int var107;
            int var108;
            if (var106 == 0.0F) {
                var107 = 0;
                var108 = 0;
            } else {
                var107 = (int) (var104 * 16384.0F / var106);
                var108 = (int) (var105 * 16384.0F / var106);
            }
            float var109 = arg15 + var104;
            float var110 = arg16 + var105;
            float var111 = arg17 + var106;
            int var112;
            int var113;
            if (var111 == 0.0F) {
                var112 = 0;
                var113 = 0;
            } else {
                var112 = (int) (var109 * 16384.0F / var111);
                var113 = (int) (var110 * 16384.0F / var111);
            }
            int var114 = (var107 << 18) + var108;
            int var115 = (var112 - var107 >> 3 << 18) + (var113 - var108 >> 3);
            int var116 = var22 >> 3;
            int var117 = arg11 << 3;
            int var118 = var21 >> 8;
            if (this.field5078) {
                if (var116 > 0) {
                    do {
                        int var119 = arg1[(var114 >>> 25) + (var114 & 0x3F80)];
                        int var120 = ((var119 & 0xFF00FF) * var118 & 0xFF00FF00) + ((var119 & 0xFF00) * var118 & 0xFF0000) >> 8;
                        arg0[var19++] = (((var120 & 0xFF00FF) * var25 & 0xFF00FF00 | (var120 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                        int var121 = var114 + var115;
                        int var122 = arg1[(var121 >>> 25) + (var121 & 0x3F80)];
                        int var123 = ((var122 & 0xFF00FF) * var118 & 0xFF00FF00) + ((var122 & 0xFF00) * var118 & 0xFF0000) >> 8;
                        arg0[var19++] = (((var123 & 0xFF00FF) * var25 & 0xFF00FF00 | (var123 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                        int var124 = var115 + var121;
                        int var125 = arg1[(var124 >>> 25) + (var124 & 0x3F80)];
                        int var126 = ((var125 & 0xFF00FF) * var118 & 0xFF00FF00) + ((var125 & 0xFF00) * var118 & 0xFF0000) >> 8;
                        arg0[var19++] = (((var126 & 0xFF00FF) * var25 & 0xFF00FF00 | (var126 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                        int var127 = var115 + var124;
                        int var128 = arg1[(var127 >>> 25) + (var127 & 0x3F80)];
                        int var129 = ((var128 & 0xFF00FF) * var118 & 0xFF00FF00) + ((var128 & 0xFF00) * var118 & 0xFF0000) >> 8;
                        arg0[var19++] = (((var129 & 0xFF00FF) * var25 & 0xFF00FF00 | (var129 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                        int var130 = var115 + var127;
                        int var131 = arg1[(var130 >>> 25) + (var130 & 0x3F80)];
                        int var132 = ((var131 & 0xFF00FF) * var118 & 0xFF00FF00) + ((var131 & 0xFF00) * var118 & 0xFF0000) >> 8;
                        arg0[var19++] = (((var132 & 0xFF00FF) * var25 & 0xFF00FF00 | (var132 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                        int var133 = var115 + var130;
                        int var134 = arg1[(var133 >>> 25) + (var133 & 0x3F80)];
                        int var135 = ((var134 & 0xFF00FF) * var118 & 0xFF00FF00) + ((var134 & 0xFF00) * var118 & 0xFF0000) >> 8;
                        arg0[var19++] = (((var135 & 0xFF00FF) * var25 & 0xFF00FF00 | (var135 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                        int var136 = var115 + var133;
                        int var137 = arg1[(var136 >>> 25) + (var136 & 0x3F80)];
                        int var138 = ((var137 & 0xFF00FF) * var118 & 0xFF00FF00) + ((var137 & 0xFF00) * var118 & 0xFF0000) >> 8;
                        arg0[var19++] = (((var138 & 0xFF00FF) * var25 & 0xFF00FF00 | (var138 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                        int var139 = var115 + var136;
                        int var140 = arg1[(var139 >>> 25) + (var139 & 0x3F80)];
                        int var141 = ((var140 & 0xFF00FF) * var118 & 0xFF00FF00) + ((var140 & 0xFF00) * var118 & 0xFF0000) >> 8;
                        arg0[var19++] = (((var141 & 0xFF00FF) * var25 & 0xFF00FF00 | (var141 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                        var10000 = var115 + var139;
                        int var143 = var112;
                        int var144 = var113;
                        var109 += arg15;
                        var110 += arg16;
                        var111 += arg17;
                        if (var111 == 0.0F) {
                            var112 = 0;
                            var113 = 0;
                        } else {
                            var112 = (int) (var109 * 16384.0F / var111);
                            var113 = (int) (var110 * 16384.0F / var111);
                        }
                        var114 = (var143 << 18) + var144;
                        var115 = (var112 - var143 >> 3 << 18) + (var113 - var144 >> 3);
                        var21 += var117;
                        var118 = var21 >> 8;
                        var20 += var23;
                        int var145 = var20 >> 16;
                        var25 = 255 - var145;
                        var26 = ((arg9 & 0xFF00FF) * var145 & 0xFF00FF00 | (arg9 & 0xFF00) * var145 & 0xFF0000) >>> 8;
                        var116--;
                    } while (var116 > 0);
                }
                int var146 = arg6 - arg5 & 0x7;
                if (var146 > 0) {
                    do {
                        int var147 = arg1[(var114 >>> 25) + (var114 & 0x3F80)];
                        int var148 = ((var147 & 0xFF00FF) * var118 & 0xFF00FF00) + ((var147 & 0xFF00) * var118 & 0xFF0000) >> 8;
                        arg0[var19++] = (((var148 & 0xFF00FF) * var25 & 0xFF00FF00 | (var148 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                        var114 += var115;
                        var146--;
                    } while (var146 > 0);
                    return;
                }
                return;
            }
            if (var116 > 0) {
                do {
                    int var149;
                    if ((var149 = arg1[(var114 >>> 25) + (var114 & 0x3F80)]) != 0) {
                        int var150 = ((var149 & 0xFF00FF) * var118 & 0xFF00FF00) + ((var149 & 0xFF00) * var118 & 0xFF0000) >> 8;
                        arg0[var19] = (((var150 & 0xFF00FF) * var25 & 0xFF00FF00 | (var150 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                    }
                    var19++;
                    int var151 = var114 + var115;
                    int var152;
                    if ((var152 = arg1[(var151 >>> 25) + (var151 & 0x3F80)]) != 0) {
                        int var153 = ((var152 & 0xFF00FF) * var118 & 0xFF00FF00) + ((var152 & 0xFF00) * var118 & 0xFF0000) >> 8;
                        arg0[var19] = (((var153 & 0xFF00FF) * var25 & 0xFF00FF00 | (var153 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                    }
                    var19++;
                    int var154 = var115 + var151;
                    int var155;
                    if ((var155 = arg1[(var154 >>> 25) + (var154 & 0x3F80)]) != 0) {
                        int var156 = ((var155 & 0xFF00FF) * var118 & 0xFF00FF00) + ((var155 & 0xFF00) * var118 & 0xFF0000) >> 8;
                        arg0[var19] = (((var156 & 0xFF00FF) * var25 & 0xFF00FF00 | (var156 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                    }
                    var19++;
                    int var157 = var115 + var154;
                    int var158;
                    if ((var158 = arg1[(var157 >>> 25) + (var157 & 0x3F80)]) != 0) {
                        int var159 = ((var158 & 0xFF00FF) * var118 & 0xFF00FF00) + ((var158 & 0xFF00) * var118 & 0xFF0000) >> 8;
                        arg0[var19] = (((var159 & 0xFF00FF) * var25 & 0xFF00FF00 | (var159 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                    }
                    var19++;
                    int var160 = var115 + var157;
                    int var161;
                    if ((var161 = arg1[(var160 >>> 25) + (var160 & 0x3F80)]) != 0) {
                        int var162 = ((var161 & 0xFF00FF) * var118 & 0xFF00FF00) + ((var161 & 0xFF00) * var118 & 0xFF0000) >> 8;
                        arg0[var19] = (((var162 & 0xFF00FF) * var25 & 0xFF00FF00 | (var162 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                    }
                    var19++;
                    int var163 = var115 + var160;
                    int var164;
                    if ((var164 = arg1[(var163 >>> 25) + (var163 & 0x3F80)]) != 0) {
                        int var165 = ((var164 & 0xFF00FF) * var118 & 0xFF00FF00) + ((var164 & 0xFF00) * var118 & 0xFF0000) >> 8;
                        arg0[var19] = (((var165 & 0xFF00FF) * var25 & 0xFF00FF00 | (var165 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                    }
                    var19++;
                    int var166 = var115 + var163;
                    int var167;
                    if ((var167 = arg1[(var166 >>> 25) + (var166 & 0x3F80)]) != 0) {
                        int var168 = ((var167 & 0xFF00FF) * var118 & 0xFF00FF00) + ((var167 & 0xFF00) * var118 & 0xFF0000) >> 8;
                        arg0[var19] = (((var168 & 0xFF00FF) * var25 & 0xFF00FF00 | (var168 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                    }
                    var19++;
                    int var169 = var115 + var166;
                    int var170;
                    if ((var170 = arg1[(var169 >>> 25) + (var169 & 0x3F80)]) != 0) {
                        int var171 = ((var170 & 0xFF00FF) * var118 & 0xFF00FF00) + ((var170 & 0xFF00) * var118 & 0xFF0000) >> 8;
                        arg0[var19] = (((var171 & 0xFF00FF) * var25 & 0xFF00FF00 | (var171 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                    }
                    var19++;
                    var10000 = var115 + var169;
                    int var173 = var112;
                    int var174 = var113;
                    var109 += arg15;
                    var110 += arg16;
                    var111 += arg17;
                    if (var111 == 0.0F) {
                        var112 = 0;
                        var113 = 0;
                    } else {
                        var112 = (int) (var109 / var111 * 16384.0F);
                        var113 = (int) (var110 / var111 * 16384.0F);
                    }
                    var114 = (var173 << 18) + var174;
                    var115 = (var112 - var173 >> 3 << 18) + (var113 - var174 >> 3);
                    var21 += var117;
                    var118 = var21 >> 8;
                    var20 += var23;
                    int var175 = var20 >> 16;
                    var25 = 255 - var175;
                    var26 = ((arg9 & 0xFF00FF) * var175 & 0xFF00FF00 | (arg9 & 0xFF00) * var175 & 0xFF0000) >>> 8;
                    var116--;
                } while (var116 > 0);
            }
            int var176 = arg6 - arg5 & 0x7;
            if (var176 > 0) {
                do {
                    int var177;
                    if ((var177 = arg1[(var114 >>> 25) + (var114 & 0x3F80)]) != 0) {
                        int var178 = ((var177 & 0xFF00FF) * var118 & 0xFF00FF00) + ((var177 & 0xFF00) * var118 & 0xFF0000) >> 8;
                        arg0[var19] = (((var178 & 0xFF00FF) * var25 & 0xFF00FF00 | (var178 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                    }
                    var19++;
                    var114 += var115;
                    var176--;
                } while (var176 > 0);
                return;
            }
            return;
        }
        int var179 = this.field5087;
        int var180 = 256 - this.field5087;
        if (!this.field5082) {
            int var293 = arg5 - this.field5089;
            float var294 = arg15 / 8.0F * (float) var293 + arg12;
            float var295 = arg16 / 8.0F * (float) var293 + arg13;
            float var296 = arg17 / 8.0F * (float) var293 + arg14;
            int var297;
            int var298;
            if (var296 == 0.0F) {
                var297 = 0;
                var298 = 0;
            } else {
                var297 = (int) (var294 * 16384.0F / var296);
                var298 = (int) (var295 * 16384.0F / var296);
            }
            float var299 = arg15 + var294;
            float var300 = arg16 + var295;
            float var301 = arg17 + var296;
            int var302;
            int var303;
            if (var301 == 0.0F) {
                var302 = 0;
                var303 = 0;
            } else {
                var302 = (int) (var299 * 16384.0F / var301);
                var303 = (int) (var300 * 16384.0F / var301);
            }
            int var304 = (var297 << 18) + var298;
            int var305 = (var302 - var297 >> 3 << 18) + (var303 - var298 >> 3);
            int var306 = var22 >> 3;
            int var307 = arg11 << 3;
            int var308 = var21 >> 8;
            if (this.field5078) {
                if (var306 > 0) {
                    do {
                        int var309 = arg1[(var304 >>> 25) + (var304 & 0x3F80)];
                        int var310 = arg0[var19];
                        int var311 = ((var309 & 0xFF00FF) * var308 & 0xFF00FF00) + ((var309 & 0xFF00) * var308 & 0xFF0000) >> 8;
                        int var312 = ((var310 & 0xFF00FF) * var179 + (var311 & 0xFF00FF) * var180 & 0xFF00FF00) + ((var310 & 0xFF00) * var179 + (var311 & 0xFF00) * var180 & 0xFF0000) >> 8;
                        arg0[var19++] = (((var312 & 0xFF00FF) * var25 & 0xFF00FF00 | (var312 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                        int var313 = var304 + var305;
                        int var314 = arg1[(var313 >>> 25) + (var313 & 0x3F80)];
                        int var315 = arg0[var19];
                        int var316 = ((var314 & 0xFF00FF) * var308 & 0xFF00FF00) + ((var314 & 0xFF00) * var308 & 0xFF0000) >> 8;
                        int var317 = ((var315 & 0xFF00FF) * var179 + (var316 & 0xFF00FF) * var180 & 0xFF00FF00) + ((var315 & 0xFF00) * var179 + (var316 & 0xFF00) * var180 & 0xFF0000) >> 8;
                        arg0[var19++] = (((var317 & 0xFF00FF) * var25 & 0xFF00FF00 | (var317 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                        int var318 = var305 + var313;
                        int var319 = arg1[(var318 >>> 25) + (var318 & 0x3F80)];
                        int var320 = arg0[var19];
                        int var321 = ((var319 & 0xFF00FF) * var308 & 0xFF00FF00) + ((var319 & 0xFF00) * var308 & 0xFF0000) >> 8;
                        int var322 = ((var320 & 0xFF00FF) * var179 + (var321 & 0xFF00FF) * var180 & 0xFF00FF00) + ((var320 & 0xFF00) * var179 + (var321 & 0xFF00) * var180 & 0xFF0000) >> 8;
                        arg0[var19++] = (((var322 & 0xFF00FF) * var25 & 0xFF00FF00 | (var322 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                        int var323 = var305 + var318;
                        int var324 = arg1[(var323 >>> 25) + (var323 & 0x3F80)];
                        int var325 = arg0[var19];
                        int var326 = ((var324 & 0xFF00FF) * var308 & 0xFF00FF00) + ((var324 & 0xFF00) * var308 & 0xFF0000) >> 8;
                        int var327 = ((var325 & 0xFF00FF) * var179 + (var326 & 0xFF00FF) * var180 & 0xFF00FF00) + ((var325 & 0xFF00) * var179 + (var326 & 0xFF00) * var180 & 0xFF0000) >> 8;
                        arg0[var19++] = (((var327 & 0xFF00FF) * var25 & 0xFF00FF00 | (var327 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                        int var328 = var305 + var323;
                        int var329 = arg1[(var328 >>> 25) + (var328 & 0x3F80)];
                        int var330 = arg0[var19];
                        int var331 = ((var329 & 0xFF00FF) * var308 & 0xFF00FF00) + ((var329 & 0xFF00) * var308 & 0xFF0000) >> 8;
                        int var332 = ((var330 & 0xFF00FF) * var179 + (var331 & 0xFF00FF) * var180 & 0xFF00FF00) + ((var330 & 0xFF00) * var179 + (var331 & 0xFF00) * var180 & 0xFF0000) >> 8;
                        arg0[var19++] = (((var332 & 0xFF00FF) * var25 & 0xFF00FF00 | (var332 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                        int var333 = var305 + var328;
                        int var334 = arg1[(var333 >>> 25) + (var333 & 0x3F80)];
                        int var335 = arg0[var19];
                        int var336 = ((var334 & 0xFF00FF) * var308 & 0xFF00FF00) + ((var334 & 0xFF00) * var308 & 0xFF0000) >> 8;
                        int var337 = ((var335 & 0xFF00FF) * var179 + (var336 & 0xFF00FF) * var180 & 0xFF00FF00) + ((var335 & 0xFF00) * var179 + (var336 & 0xFF00) * var180 & 0xFF0000) >> 8;
                        arg0[var19++] = (((var337 & 0xFF00FF) * var25 & 0xFF00FF00 | (var337 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                        int var338 = var305 + var333;
                        int var339 = arg1[(var338 >>> 25) + (var338 & 0x3F80)];
                        int var340 = arg0[var19];
                        int var341 = ((var339 & 0xFF00FF) * var308 & 0xFF00FF00) + ((var339 & 0xFF00) * var308 & 0xFF0000) >> 8;
                        int var342 = ((var340 & 0xFF00FF) * var179 + (var341 & 0xFF00FF) * var180 & 0xFF00FF00) + ((var340 & 0xFF00) * var179 + (var341 & 0xFF00) * var180 & 0xFF0000) >> 8;
                        arg0[var19++] = (((var342 & 0xFF00FF) * var25 & 0xFF00FF00 | (var342 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                        int var343 = var305 + var338;
                        int var344 = arg1[(var343 >>> 25) + (var343 & 0x3F80)];
                        int var345 = arg0[var19];
                        int var346 = ((var344 & 0xFF00FF) * var308 & 0xFF00FF00) + ((var344 & 0xFF00) * var308 & 0xFF0000) >> 8;
                        int var347 = ((var345 & 0xFF00FF) * var179 + (var346 & 0xFF00FF) * var180 & 0xFF00FF00) + ((var345 & 0xFF00) * var179 + (var346 & 0xFF00) * var180 & 0xFF0000) >> 8;
                        arg0[var19++] = (((var347 & 0xFF00FF) * var25 & 0xFF00FF00 | (var347 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                        var10000 = var305 + var343;
                        int var349 = var302;
                        int var350 = var303;
                        var299 += arg15;
                        var300 += arg16;
                        var301 += arg17;
                        if (var301 == 0.0F) {
                            var302 = 0;
                            var303 = 0;
                        } else {
                            var302 = (int) (var299 * 16384.0F / var301);
                            var303 = (int) (var300 * 16384.0F / var301);
                        }
                        var304 = (var349 << 18) + var350;
                        var305 = (var302 - var349 >> 3 << 18) + (var303 - var350 >> 3);
                        var21 += var307;
                        var308 = var21 >> 8;
                        var20 += var23;
                        int var351 = var20 >> 16;
                        var25 = 255 - var351;
                        var26 = ((arg9 & 0xFF00FF) * var351 & 0xFF00FF00 | (arg9 & 0xFF00) * var351 & 0xFF0000) >>> 8;
                        var306--;
                    } while (var306 > 0);
                }
                int var352 = arg6 - arg5 & 0x7;
                if (var352 > 0) {
                    do {
                        int var353 = arg1[(var304 >>> 25) + (var304 & 0x3F80)];
                        int var354 = arg0[var19];
                        int var355 = ((var353 & 0xFF00FF) * var308 & 0xFF00FF00) + ((var353 & 0xFF00) * var308 & 0xFF0000) >> 8;
                        int var356 = ((var354 & 0xFF00FF) * var179 + (var355 & 0xFF00FF) * var180 & 0xFF00FF00) + ((var354 & 0xFF00) * var179 + (var355 & 0xFF00) * var180 & 0xFF0000) >> 8;
                        arg0[var19++] = (((var356 & 0xFF00FF) * var25 & 0xFF00FF00 | (var356 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                        var304 += var305;
                        var352--;
                    } while (var352 > 0);
                    return;
                }
            } else {
                if (var306 > 0) {
                    do {
                        int var357;
                        if ((var357 = arg1[(var304 >>> 25) + (var304 & 0x3F80)]) != 0) {
                            int var358 = arg0[var19];
                            int var359 = ((var357 & 0xFF00FF) * var308 & 0xFF00FF00) + ((var357 & 0xFF00) * var308 & 0xFF0000) >> 8;
                            int var360 = ((var358 & 0xFF00FF) * var179 + (var359 & 0xFF00FF) * var180 & 0xFF00FF00) + ((var358 & 0xFF00) * var179 + (var359 & 0xFF00) * var180 & 0xFF0000) >> 8;
                            arg0[var19] = (((var360 & 0xFF00FF) * var25 & 0xFF00FF00 | (var360 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                        }
                        var19++;
                        int var361 = var304 + var305;
                        int var362;
                        if ((var362 = arg1[(var361 >>> 25) + (var361 & 0x3F80)]) != 0) {
                            int var363 = arg0[var19];
                            int var364 = ((var362 & 0xFF00FF) * var308 & 0xFF00FF00) + ((var362 & 0xFF00) * var308 & 0xFF0000) >> 8;
                            int var365 = ((var363 & 0xFF00FF) * var179 + (var364 & 0xFF00FF) * var180 & 0xFF00FF00) + ((var363 & 0xFF00) * var179 + (var364 & 0xFF00) * var180 & 0xFF0000) >> 8;
                            arg0[var19] = (((var365 & 0xFF00FF) * var25 & 0xFF00FF00 | (var365 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                        }
                        var19++;
                        int var366 = var305 + var361;
                        int var367;
                        if ((var367 = arg1[(var366 >>> 25) + (var366 & 0x3F80)]) != 0) {
                            int var368 = arg0[var19];
                            int var369 = ((var367 & 0xFF00FF) * var308 & 0xFF00FF00) + ((var367 & 0xFF00) * var308 & 0xFF0000) >> 8;
                            int var370 = ((var368 & 0xFF00FF) * var179 + (var369 & 0xFF00FF) * var180 & 0xFF00FF00) + ((var368 & 0xFF00) * var179 + (var369 & 0xFF00) * var180 & 0xFF0000) >> 8;
                            arg0[var19] = (((var370 & 0xFF00FF) * var25 & 0xFF00FF00 | (var370 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                        }
                        var19++;
                        int var371 = var305 + var366;
                        int var372;
                        if ((var372 = arg1[(var371 >>> 25) + (var371 & 0x3F80)]) != 0) {
                            int var373 = arg0[var19];
                            int var374 = ((var372 & 0xFF00FF) * var308 & 0xFF00FF00) + ((var372 & 0xFF00) * var308 & 0xFF0000) >> 8;
                            int var375 = ((var373 & 0xFF00FF) * var179 + (var374 & 0xFF00FF) * var180 & 0xFF00FF00) + ((var373 & 0xFF00) * var179 + (var374 & 0xFF00) * var180 & 0xFF0000) >> 8;
                            arg0[var19] = (((var375 & 0xFF00FF) * var25 & 0xFF00FF00 | (var375 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                        }
                        var19++;
                        int var376 = var305 + var371;
                        int var377;
                        if ((var377 = arg1[(var376 >>> 25) + (var376 & 0x3F80)]) != 0) {
                            int var378 = arg0[var19];
                            int var379 = ((var377 & 0xFF00FF) * var308 & 0xFF00FF00) + ((var377 & 0xFF00) * var308 & 0xFF0000) >> 8;
                            int var380 = ((var378 & 0xFF00FF) * var179 + (var379 & 0xFF00FF) * var180 & 0xFF00FF00) + ((var378 & 0xFF00) * var179 + (var379 & 0xFF00) * var180 & 0xFF0000) >> 8;
                            arg0[var19] = (((var380 & 0xFF00FF) * var25 & 0xFF00FF00 | (var380 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                        }
                        var19++;
                        int var381 = var305 + var376;
                        int var382;
                        if ((var382 = arg1[(var381 >>> 25) + (var381 & 0x3F80)]) != 0) {
                            int var383 = arg0[var19];
                            int var384 = ((var382 & 0xFF00FF) * var308 & 0xFF00FF00) + ((var382 & 0xFF00) * var308 & 0xFF0000) >> 8;
                            int var385 = ((var383 & 0xFF00FF) * var179 + (var384 & 0xFF00FF) * var180 & 0xFF00FF00) + ((var383 & 0xFF00) * var179 + (var384 & 0xFF00) * var180 & 0xFF0000) >> 8;
                            arg0[var19] = (((var385 & 0xFF00FF) * var25 & 0xFF00FF00 | (var385 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                        }
                        var19++;
                        int var386 = var305 + var381;
                        int var387;
                        if ((var387 = arg1[(var386 >>> 25) + (var386 & 0x3F80)]) != 0) {
                            int var388 = arg0[var19];
                            int var389 = ((var387 & 0xFF00FF) * var308 & 0xFF00FF00) + ((var387 & 0xFF00) * var308 & 0xFF0000) >> 8;
                            int var390 = ((var388 & 0xFF00FF) * var179 + (var389 & 0xFF00FF) * var180 & 0xFF00FF00) + ((var388 & 0xFF00) * var179 + (var389 & 0xFF00) * var180 & 0xFF0000) >> 8;
                            arg0[var19] = (((var390 & 0xFF00FF) * var25 & 0xFF00FF00 | (var390 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                        }
                        var19++;
                        int var391 = var305 + var386;
                        int var392;
                        if ((var392 = arg1[(var391 >>> 25) + (var391 & 0x3F80)]) != 0) {
                            int var393 = arg0[var19];
                            int var394 = ((var392 & 0xFF00FF) * var308 & 0xFF00FF00) + ((var392 & 0xFF00) * var308 & 0xFF0000) >> 8;
                            int var395 = ((var393 & 0xFF00FF) * var179 + (var394 & 0xFF00FF) * var180 & 0xFF00FF00) + ((var393 & 0xFF00) * var179 + (var394 & 0xFF00) * var180 & 0xFF0000) >> 8;
                            arg0[var19] = (((var395 & 0xFF00FF) * var25 & 0xFF00FF00 | (var395 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                        }
                        var19++;
                        var10000 = var305 + var391;
                        int var397 = var302;
                        int var398 = var303;
                        var299 += arg15;
                        var300 += arg16;
                        var301 += arg17;
                        if (var301 == 0.0F) {
                            var302 = 0;
                            var303 = 0;
                        } else {
                            var302 = (int) (var299 * 16384.0F / var301);
                            var303 = (int) (var300 * 16384.0F / var301);
                        }
                        var304 = (var397 << 18) + var398;
                        var305 = (var302 - var397 >> 3 << 18) + (var303 - var398 >> 3);
                        var21 += var307;
                        var308 = var21 >> 8;
                        var20 += var23;
                        int var399 = var20 >> 16;
                        var25 = 255 - var399;
                        var26 = ((arg9 & 0xFF00FF) * var399 & 0xFF00FF00 | (arg9 & 0xFF00) * var399 & 0xFF0000) >>> 8;
                        var306--;
                    } while (var306 > 0);
                }
                int var400 = arg6 - arg5 & 0x7;
                if (var400 > 0) {
                    do {
                        int var401;
                        if ((var401 = arg1[(var304 >>> 25) + (var304 & 0x3F80)]) != 0) {
                            int var402 = arg0[var19];
                            int var403 = ((var401 & 0xFF00FF) * var308 & 0xFF00FF00) + ((var401 & 0xFF00) * var308 & 0xFF0000) >> 8;
                            int var404 = ((var402 & 0xFF00FF) * var179 + (var403 & 0xFF00FF) * var180 & 0xFF00FF00) + ((var402 & 0xFF00) * var179 + (var403 & 0xFF00) * var180 & 0xFF0000) >> 8;
                            arg0[var19] = (((var404 & 0xFF00FF) * var25 & 0xFF00FF00 | (var404 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                        }
                        var19++;
                        var304 += var305;
                        var400--;
                    } while (var400 > 0);
                }
            }
            return;
        }
        int var181 = arg5 - this.field5089;
        float var182 = arg15 / 8.0F * (float) var181 + arg12;
        float var183 = arg16 / 8.0F * (float) var181 + arg13;
        float var184 = arg17 / 8.0F * (float) var181 + arg14;
        int var185;
        int var186;
        if (var184 == 0.0F) {
            var185 = 0;
            var186 = 0;
        } else {
            var185 = (int) (var182 * 4096.0F / var184);
            var186 = (int) (var183 * 4096.0F / var184);
        }
        float var187 = arg15 + var182;
        float var188 = arg16 + var183;
        float var189 = arg17 + var184;
        int var190;
        int var191;
        if (var189 == 0.0F) {
            var190 = 0;
            var191 = 0;
        } else {
            var190 = (int) (var187 * 4096.0F / var189);
            var191 = (int) (var188 * 4096.0F / var189);
        }
        int var192 = (var185 << 20) + var186;
        int var193 = (var190 - var185 >> 3 << 20) + (var191 - var186 >> 3);
        int var194 = var22 >> 3;
        int var195 = arg11 << 3;
        int var196 = var21 >> 8;
        if (this.field5078) {
            if (var194 > 0) {
                do {
                    int var197 = arg0[var19];
                    int var198 = arg1[(var192 >>> 26) + (var192 & 0xFC0)];
                    int var199 = ((var198 & 0xFF00FF) * var196 & 0xFF00FF00) + ((var198 & 0xFF00) * var196 & 0xFF0000) >> 8;
                    int var200 = ((var197 & 0xFF00FF) * var179 + (var199 & 0xFF00FF) * var180 & 0xFF00FF00) + ((var197 & 0xFF00) * var179 + (var199 & 0xFF00) * var180 & 0xFF0000) >> 8;
                    arg0[var19++] = (((var200 & 0xFF00FF) * var25 & 0xFF00FF00 | (var200 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                    int var201 = var192 + var193;
                    int var202 = arg0[var19];
                    int var203 = arg1[(var201 >>> 26) + (var201 & 0xFC0)];
                    int var204 = ((var203 & 0xFF00FF) * var196 & 0xFF00FF00) + ((var203 & 0xFF00) * var196 & 0xFF0000) >> 8;
                    int var205 = ((var202 & 0xFF00FF) * var179 + (var204 & 0xFF00FF) * var180 & 0xFF00FF00) + ((var202 & 0xFF00) * var179 + (var204 & 0xFF00) * var180 & 0xFF0000) >> 8;
                    arg0[var19++] = (((var205 & 0xFF00FF) * var25 & 0xFF00FF00 | (var205 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                    int var206 = var193 + var201;
                    int var207 = arg0[var19];
                    int var208 = arg1[(var206 >>> 26) + (var206 & 0xFC0)];
                    int var209 = ((var208 & 0xFF00FF) * var196 & 0xFF00FF00) + ((var208 & 0xFF00) * var196 & 0xFF0000) >> 8;
                    int var210 = ((var207 & 0xFF00FF) * var179 + (var209 & 0xFF00FF) * var180 & 0xFF00FF00) + ((var207 & 0xFF00) * var179 + (var209 & 0xFF00) * var180 & 0xFF0000) >> 8;
                    arg0[var19++] = (((var210 & 0xFF00FF) * var25 & 0xFF00FF00 | (var210 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                    int var211 = var193 + var206;
                    int var212 = arg0[var19];
                    int var213 = arg1[(var211 >>> 26) + (var211 & 0xFC0)];
                    int var214 = ((var213 & 0xFF00FF) * var196 & 0xFF00FF00) + ((var213 & 0xFF00) * var196 & 0xFF0000) >> 8;
                    int var215 = ((var212 & 0xFF00FF) * var179 + (var214 & 0xFF00FF) * var180 & 0xFF00FF00) + ((var212 & 0xFF00) * var179 + (var214 & 0xFF00) * var180 & 0xFF0000) >> 8;
                    arg0[var19++] = (((var215 & 0xFF00FF) * var25 & 0xFF00FF00 | (var215 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                    int var216 = var193 + var211;
                    int var217 = arg0[var19];
                    int var218 = arg1[(var216 >>> 26) + (var216 & 0xFC0)];
                    int var219 = ((var218 & 0xFF00FF) * var196 & 0xFF00FF00) + ((var218 & 0xFF00) * var196 & 0xFF0000) >> 8;
                    int var220 = ((var217 & 0xFF00FF) * var179 + (var219 & 0xFF00FF) * var180 & 0xFF00FF00) + ((var217 & 0xFF00) * var179 + (var219 & 0xFF00) * var180 & 0xFF0000) >> 8;
                    arg0[var19++] = (((var220 & 0xFF00FF) * var25 & 0xFF00FF00 | (var220 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                    int var221 = var193 + var216;
                    int var222 = arg0[var19];
                    int var223 = arg1[(var221 >>> 26) + (var221 & 0xFC0)];
                    int var224 = ((var223 & 0xFF00FF) * var196 & 0xFF00FF00) + ((var223 & 0xFF00) * var196 & 0xFF0000) >> 8;
                    int var225 = ((var222 & 0xFF00FF) * var179 + (var224 & 0xFF00FF) * var180 & 0xFF00FF00) + ((var222 & 0xFF00) * var179 + (var224 & 0xFF00) * var180 & 0xFF0000) >> 8;
                    arg0[var19++] = (((var225 & 0xFF00FF) * var25 & 0xFF00FF00 | (var225 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                    int var226 = var193 + var221;
                    int var227 = arg0[var19];
                    int var228 = arg1[(var226 >>> 26) + (var226 & 0xFC0)];
                    int var229 = ((var228 & 0xFF00FF) * var196 & 0xFF00FF00) + ((var228 & 0xFF00) * var196 & 0xFF0000) >> 8;
                    int var230 = ((var227 & 0xFF00FF) * var179 + (var229 & 0xFF00FF) * var180 & 0xFF00FF00) + ((var227 & 0xFF00) * var179 + (var229 & 0xFF00) * var180 & 0xFF0000) >> 8;
                    arg0[var19++] = (((var230 & 0xFF00FF) * var25 & 0xFF00FF00 | (var230 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                    int var231 = var193 + var226;
                    int var232 = arg0[var19];
                    int var233 = arg1[(var231 >>> 26) + (var231 & 0xFC0)];
                    int var234 = ((var233 & 0xFF00FF) * var196 & 0xFF00FF00) + ((var233 & 0xFF00) * var196 & 0xFF0000) >> 8;
                    int var235 = ((var232 & 0xFF00FF) * var179 + (var234 & 0xFF00FF) * var180 & 0xFF00FF00) + ((var232 & 0xFF00) * var179 + (var234 & 0xFF00) * var180 & 0xFF0000) >> 8;
                    arg0[var19++] = (((var235 & 0xFF00FF) * var25 & 0xFF00FF00 | (var235 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                    var10000 = var193 + var231;
                    int var237 = var190;
                    int var238 = var191;
                    var187 += arg15;
                    var188 += arg16;
                    var189 += arg17;
                    if (var189 == 0.0F) {
                        var190 = 0;
                        var191 = 0;
                    } else {
                        var190 = (int) (var187 * 4096.0F / var189);
                        var191 = (int) (var188 * 4096.0F / var189);
                    }
                    var192 = (var237 << 20) + var238;
                    var193 = (var190 - var237 >> 3 << 20) + (var191 - var238 >> 3);
                    var21 += var195;
                    var196 = var21 >> 8;
                    var20 += var23;
                    int var239 = var20 >> 16;
                    var25 = 255 - var239;
                    var26 = ((arg9 & 0xFF00FF) * var239 & 0xFF00FF00 | (arg9 & 0xFF00) * var239 & 0xFF0000) >>> 8;
                    var194--;
                } while (var194 > 0);
            }
            int var240 = arg6 - arg5 & 0x7;
            if (var240 > 0) {
                do {
                    int var241 = arg0[var19];
                    int var242 = arg1[(var192 >>> 26) + (var192 & 0xFC0)];
                    int var243 = ((var242 & 0xFF00FF) * var196 & 0xFF00FF00) + ((var242 & 0xFF00) * var196 & 0xFF0000) >> 8;
                    int var244 = ((var241 & 0xFF00FF) * var179 + (var243 & 0xFF00FF) * var180 & 0xFF00FF00) + ((var241 & 0xFF00) * var179 + (var243 & 0xFF00) * var180 & 0xFF0000) >> 8;
                    arg0[var19++] = (((var244 & 0xFF00FF) * var25 & 0xFF00FF00 | (var244 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                    var192 += var193;
                    var240--;
                } while (var240 > 0);
                return;
            }
            return;
        }
        if (var194 > 0) {
            do {
                int var245;
                if ((var245 = arg1[(var192 >>> 26) + (var192 & 0xFC0)]) != 0) {
                    int var246 = arg0[var19];
                    int var247 = ((var245 & 0xFF00FF) * var196 & 0xFF00FF00) + ((var245 & 0xFF00) * var196 & 0xFF0000) >> 8;
                    int var248 = ((var246 & 0xFF00FF) * var179 + (var247 & 0xFF00FF) * var180 & 0xFF00FF00) + ((var246 & 0xFF00) * var179 + (var247 & 0xFF00) * var180 & 0xFF0000) >> 8;
                    arg0[var19] = (((var248 & 0xFF00FF) * var25 & 0xFF00FF00 | (var248 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                }
                var19++;
                int var249 = var192 + var193;
                int var250;
                if ((var250 = arg1[(var249 >>> 26) + (var249 & 0xFC0)]) != 0) {
                    int var251 = arg0[var19];
                    int var252 = ((var250 & 0xFF00FF) * var196 & 0xFF00FF00) + ((var250 & 0xFF00) * var196 & 0xFF0000) >> 8;
                    int var253 = ((var251 & 0xFF00FF) * var179 + (var252 & 0xFF00FF) * var180 & 0xFF00FF00) + ((var251 & 0xFF00) * var179 + (var252 & 0xFF00) * var180 & 0xFF0000) >> 8;
                    arg0[var19] = (((var253 & 0xFF00FF) * var25 & 0xFF00FF00 | (var253 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                }
                var19++;
                int var254 = var193 + var249;
                int var255;
                if ((var255 = arg1[(var254 >>> 26) + (var254 & 0xFC0)]) != 0) {
                    int var256 = arg0[var19];
                    int var257 = ((var255 & 0xFF00FF) * var196 & 0xFF00FF00) + ((var255 & 0xFF00) * var196 & 0xFF0000) >> 8;
                    int var258 = ((var256 & 0xFF00FF) * var179 + (var257 & 0xFF00FF) * var180 & 0xFF00FF00) + ((var256 & 0xFF00) * var179 + (var257 & 0xFF00) * var180 & 0xFF0000) >> 8;
                    arg0[var19] = (((var258 & 0xFF00FF) * var25 & 0xFF00FF00 | (var258 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                }
                var19++;
                int var259 = var193 + var254;
                int var260;
                if ((var260 = arg1[(var259 >>> 26) + (var259 & 0xFC0)]) != 0) {
                    int var261 = arg0[var19];
                    int var262 = ((var260 & 0xFF00FF) * var196 & 0xFF00FF00) + ((var260 & 0xFF00) * var196 & 0xFF0000) >> 8;
                    int var263 = ((var261 & 0xFF00FF) * var179 + (var262 & 0xFF00FF) * var180 & 0xFF00FF00) + ((var261 & 0xFF00) * var179 + (var262 & 0xFF00) * var180 & 0xFF0000) >> 8;
                    arg0[var19] = (((var263 & 0xFF00FF) * var25 & 0xFF00FF00 | (var263 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                }
                var19++;
                int var264 = var193 + var259;
                int var265;
                if ((var265 = arg1[(var264 >>> 26) + (var264 & 0xFC0)]) != 0) {
                    int var266 = arg0[var19];
                    int var267 = ((var265 & 0xFF00FF) * var196 & 0xFF00FF00) + ((var265 & 0xFF00) * var196 & 0xFF0000) >> 8;
                    int var268 = ((var266 & 0xFF00FF) * var179 + (var267 & 0xFF00FF) * var180 & 0xFF00FF00) + ((var266 & 0xFF00) * var179 + (var267 & 0xFF00) * var180 & 0xFF0000) >> 8;
                    arg0[var19] = (((var268 & 0xFF00FF) * var25 & 0xFF00FF00 | (var268 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                }
                var19++;
                int var269 = var193 + var264;
                int var270;
                if ((var270 = arg1[(var269 >>> 26) + (var269 & 0xFC0)]) != 0) {
                    int var271 = arg0[var19];
                    int var272 = ((var270 & 0xFF00FF) * var196 & 0xFF00FF00) + ((var270 & 0xFF00) * var196 & 0xFF0000) >> 8;
                    int var273 = ((var271 & 0xFF00FF) * var179 + (var272 & 0xFF00FF) * var180 & 0xFF00FF00) + ((var271 & 0xFF00) * var179 + (var272 & 0xFF00) * var180 & 0xFF0000) >> 8;
                    arg0[var19] = (((var273 & 0xFF00FF) * var25 & 0xFF00FF00 | (var273 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                }
                var19++;
                int var274 = var193 + var269;
                int var275;
                if ((var275 = arg1[(var274 >>> 26) + (var274 & 0xFC0)]) != 0) {
                    int var276 = arg0[var19];
                    int var277 = ((var275 & 0xFF00FF) * var196 & 0xFF00FF00) + ((var275 & 0xFF00) * var196 & 0xFF0000) >> 8;
                    int var278 = ((var276 & 0xFF00FF) * var179 + (var277 & 0xFF00FF) * var180 & 0xFF00FF00) + ((var276 & 0xFF00) * var179 + (var277 & 0xFF00) * var180 & 0xFF0000) >> 8;
                    arg0[var19] = (((var278 & 0xFF00FF) * var25 & 0xFF00FF00 | (var278 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                }
                var19++;
                int var279 = var193 + var274;
                int var280;
                if ((var280 = arg1[(var279 >>> 26) + (var279 & 0xFC0)]) != 0) {
                    int var281 = arg0[var19];
                    int var282 = ((var280 & 0xFF00FF) * var196 & 0xFF00FF00) + ((var280 & 0xFF00) * var196 & 0xFF0000) >> 8;
                    int var283 = ((var281 & 0xFF00FF) * var179 + (var282 & 0xFF00FF) * var180 & 0xFF00FF00) + ((var281 & 0xFF00) * var179 + (var282 & 0xFF00) * var180 & 0xFF0000) >> 8;
                    arg0[var19] = (((var283 & 0xFF00FF) * var25 & 0xFF00FF00 | (var283 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
                }
                var19++;
                var10000 = var193 + var279;
                int var285 = var190;
                int var286 = var191;
                var187 += arg15;
                var188 += arg16;
                var189 += arg17;
                if (var189 == 0.0F) {
                    var190 = 0;
                    var191 = 0;
                } else {
                    var190 = (int) (var187 * 4096.0F / var189);
                    var191 = (int) (var188 * 4096.0F / var189);
                }
                var192 = (var285 << 20) + var286;
                var193 = (var190 - var285 >> 3 << 20) + (var191 - var286 >> 3);
                var21 += var195;
                var196 = var21 >> 8;
                var20 += var23;
                int var287 = var20 >> 16;
                var25 = 255 - var287;
                var26 = ((arg9 & 0xFF00FF) * var287 & 0xFF00FF00 | (arg9 & 0xFF00) * var287 & 0xFF0000) >>> 8;
                var194--;
            } while (var194 > 0);
        }
        int var288 = arg6 - arg5 & 0x7;
        if (var288 <= 0) {
            return;
        }
        do {
            int var289;
            if ((var289 = arg1[(var192 >>> 26) + (var192 & 0xFC0)]) != 0) {
                int var290 = arg0[var19];
                int var291 = ((var289 & 0xFF00FF) * var196 & 0xFF00FF00) + ((var289 & 0xFF00) * var196 & 0xFF0000) >> 8;
                int var292 = ((var290 & 0xFF00FF) * var179 + (var291 & 0xFF00FF) * var180 & 0xFF00FF00) + ((var290 & 0xFF00) * var179 + (var291 & 0xFF00) * var180 & 0xFF0000) >> 8;
                arg0[var19] = (((var292 & 0xFF00FF) * var25 & 0xFF00FF00 | (var292 & 0xFF00) * var25 & 0xFF0000) >>> 8) + var26;
            }
            var19++;
            var192 += var193;
            var288--;
        } while (var288 > 0);
        return;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "([IIIIIIIIIIII)V")
    private final void method2084(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        if (this.field5079) {
            if (arg5 > this.field5084) {
                arg5 = this.field5084;
            }
            if (arg4 < 0) {
                arg4 = 0;
            }
        }
        if (arg4 >= arg5) {
            return;
        }
        int var13 = arg1 + arg4;
        int var14 = arg4 * arg7 + arg6;
        int var15 = arg4 * arg9 + arg8;
        int var16 = arg4 * arg11 + arg10;
        if (!this.field5088) {
            int var36 = arg5 - arg4;
            if (this.field5087 == 0) {
                do {
                    arg0[var13++] = var14 & 0xFF00 | 0xFF0000 << 8 | var15 & 0xFF00 | var16 >> 8 & 0xFF;
                    var14 += arg7;
                    var15 += arg9;
                    var16 += arg11;
                    var36--;
                } while (var36 > 0);
            } else {
                int var37 = this.field5087;
                int var38 = 256 - this.field5087;
                do {
                    int var39 = var14 & 0xFF00 | 0xFF0000 << 8 | var15 & 0xFF00 | var16 >> 8 & 0xFF;
                    var14 += arg7;
                    var15 += arg9;
                    var16 += arg11;
                    int var40 = ((var39 & 0xFF00FF) * var38 >> 8 & 0xFF00FF) + ((var39 & 0xFF00) * var38 >> 8 & 0xFF00);
                    int var41 = arg0[var13];
                    arg0[var13++] = ((var41 & 0xFF00) * var37 >> 8 & 0xFF00) + ((var41 & 0xFF00FF) * var37 >> 8 & 0xFF00FF) + var40;
                    var36--;
                } while (var36 > 0);
            }
            return;
        }
        int var17 = arg5 - arg4 >> 2;
        int var18 = arg7 << 2;
        int var19 = arg9 << 2;
        int var20 = arg11 << 2;
        if (this.field5087 == 0) {
            if (var17 > 0) {
                do {
                    int var21 = var14 & 0xFF00 | 0xFF0000 << 8 | var15 & 0xFF00 | var16 >> 8 & 0xFF;
                    var14 += var18;
                    var15 += var19;
                    var16 += var20;
                    arg0[var13++] = var21;
                    arg0[var13++] = var21;
                    arg0[var13++] = var21;
                    arg0[var13++] = var21;
                    var17--;
                } while (var17 > 0);
            }
            int var22 = arg5 - arg4 & 0x3;
            if (var22 > 0) {
                int var23 = var14 & 0xFF00 | 0xFF0000 << 8 | var15 & 0xFF00 | var16 >> 8 & 0xFF;
                do {
                    arg0[var13++] = var23;
                    var22--;
                } while (var22 > 0);
                return;
            }
            return;
        }
        int var24 = this.field5087;
        int var25 = 256 - this.field5087;
        if (var17 > 0) {
            do {
                int var26 = var14 & 0xFF00 | 0xFF0000 << 8 | var15 & 0xFF00 | var16 >> 8 & 0xFF;
                var14 += var18;
                var15 += var19;
                var16 += var20;
                int var27 = ((var26 & 0xFF00FF) * var25 >> 8 & 0xFF00FF) + ((var26 & 0xFF00) * var25 >> 8 & 0xFF00);
                int var28 = arg0[var13];
                arg0[var13++] = ((var28 & 0xFF00) * var24 >> 8 & 0xFF00) + ((var28 & 0xFF00FF) * var24 >> 8 & 0xFF00FF) + var27;
                int var29 = arg0[var13];
                arg0[var13++] = ((var29 & 0xFF00) * var24 >> 8 & 0xFF00) + ((var29 & 0xFF00FF) * var24 >> 8 & 0xFF00FF) + var27;
                int var30 = arg0[var13];
                arg0[var13++] = ((var30 & 0xFF00) * var24 >> 8 & 0xFF00) + ((var30 & 0xFF00FF) * var24 >> 8 & 0xFF00FF) + var27;
                int var31 = arg0[var13];
                arg0[var13++] = ((var31 & 0xFF00) * var24 >> 8 & 0xFF00) + ((var31 & 0xFF00FF) * var24 >> 8 & 0xFF00FF) + var27;
                var17--;
            } while (var17 > 0);
        }
        int var32 = arg5 - arg4 & 0x3;
        if (var32 <= 0) {
            return;
        }
        int var33 = var14 & 0xFF00 | 0xFF0000 << 8 | var15 & 0xFF00 | var16 >> 8 & 0xFF;
        int var34 = ((var33 & 0xFF00FF) * var25 >> 8 & 0xFF00FF) + ((var33 & 0xFF00) * var25 >> 8 & 0xFF00);
        do {
            int var35 = arg0[var13];
            arg0[var13++] = ((var35 & 0xFF00) * var24 >> 8 & 0xFF00) + ((var35 & 0xFF00FF) * var24 >> 8 & 0xFF00FF) + var34;
            var32--;
        } while (var32 > 0);
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Lwb;)V")
    public class339(class127 arg0) {
        this.field5086 = arg0;
        this.field5077 = this.field5086.field1743;
        this.field5081 = this.field5086.field1738;
    }
}
