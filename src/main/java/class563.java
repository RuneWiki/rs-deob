import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class563 extends class609 {

    @OriginalMember(owner = "client!dr", name = "D", descriptor = "I")
    public static int field7341 = 16777215;

    @OriginalMember(owner = "client!dr", name = "E", descriptor = "I")
    public static int field7342;

    @OriginalMember(owner = "client!dr", name = "F", descriptor = "I")
    public static int field7343;

    @OriginalMember(owner = "client!dr", name = "G", descriptor = "I")
    public static int field7344;

    @OriginalMember(owner = "client!dr", name = "H", descriptor = "I")
    public static int field7345;

    @OriginalMember(owner = "client!dr", name = "I", descriptor = "I")
    public static int field7346;

    @OriginalMember(owner = "client!dr", name = "J", descriptor = "I")
    public static int field7347;

    @OriginalMember(owner = "client!dr", name = "K", descriptor = "I")
    public static int field7348;

    @OriginalMember(owner = "client!dr", name = "L", descriptor = "I")
    public static int field7349;

    @OriginalMember(owner = "client!dr", name = "M", descriptor = "I")
    public static int field7350;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "([IILjb;I[I[II[I)V")
    private final void method3006(int[] arg0, int arg1, class670 arg2, int arg3, int[] arg4, int[] arg5, int arg6, int[] arg7) {
        ++field7343;
        if (arg3 != 65535) {
            field7341 = 66;
        }
        class632 var9 = super.field8235[arg1][arg6];
        if (var9 != null) {
            if ((2 & var9.field8812) == 0) {
                int var10 = super.field1163 * arg1;
                int var11 = super.field1163 + var10;
                int var12 = super.field1163 * arg6;
                int var13 = super.field1163 + var12;
                int var16;
                int var17;
                int var18;
                int var19;
                int var22;
                int var23;
                int var24;
                int var25;
                int var26;
                int var27;
                int var28;
                int var30;
                int var31;
                int var33;
                int var34;
                int var35;
                int var36;
                int var37;
                if (~(1 & var9.field8812) != -1) {
                    int var14 = super.field8236[arg1][arg6];
                    if (~super.field8227 == 0) {
                        int var15 = super.field8224 * var14;
                        var16 = (super.field8233 * var12 + super.field8242 * var10 + var15 >> 14) + super.field8223;
                        if (~super.field8232.field2165 <= ~var16) {
                            return;
                        }
                        var17 = (super.field8242 * var11 + super.field8233 * var12 + var15 >> 14) + super.field8223;
                        if (~super.field8232.field2165 <= ~var17) {
                            return;
                        }
                        var18 = super.field8223 - -(super.field8242 * var11 + super.field8233 * var13 - -var15 >> 14);
                        if (var18 <= super.field8232.field2165) {
                            return;
                        }
                        var19 = (super.field8242 * var10 + super.field8233 * var13 - -var15 >> 14) + super.field8223;
                        if (~super.field8232.field2165 <= ~var19) {
                            return;
                        }
                    } else {
                        var19 = super.field8227;
                        var18 = super.field8227;
                        var17 = super.field8227;
                        var16 = super.field8227;
                    }
                    int var20 = super.field8229 * var14;
                    int var21 = super.field8225 * var14;
                    var22 = (super.field8226 * var12 + super.field8230 * var10 + var20 >> 14) + super.field8240;
                    var23 = arg2.field9309 - -(super.field8232.field2162 * var22 / var16);
                    var24 = super.field8237 - -(super.field8238 * var10 + (var21 - -(super.field8239 * var12)) >> 14);
                    var25 = super.field8232.field2171 * var24 / var16 + arg2.field9299;
                    var26 = (super.field8230 * var11 + var20 - -(super.field8226 * var12) >> 14) + super.field8240;
                    var27 = super.field8232.field2162 * var26 / var17 + arg2.field9309;
                    var28 = (super.field8239 * var12 + (super.field8238 * var11 - -var21) >> 14) + super.field8237;
                    int var29 = (super.field8230 * var11 + super.field8226 * var13 - -var20 >> 14) + super.field8240;
                    var30 = super.field8232.field2171 * var28 / var17 + arg2.field9299;
                    var31 = super.field8232.field2162 * var29 / var18 + arg2.field9309;
                    int var32 = (super.field8238 * var11 - -(super.field8239 * var13) + var21 >> 14) + super.field8237;
                    var33 = super.field8240 - -(super.field8226 * var13 + super.field8230 * var10 + var20 >> 14);
                    var34 = arg2.field9299 - -(super.field8232.field2171 * var32 / var18);
                    var35 = (super.field8238 * var10 + super.field8239 * var13 + var21 >> 14) + super.field8237;
                    var36 = super.field8232.field2162 * var33 / var19 + arg2.field9309;
                    var37 = super.field8232.field2171 * var35 / var19 + arg2.field9299;
                } else {
                    int var38 = super.field8236[arg1][arg6];
                    int var39 = super.field8236[arg1 - -1][arg6];
                    int var40 = super.field8236[arg1 - -1][arg6 + 1];
                    int var41 = super.field8236[arg1][arg6 + 1];
                    if (~super.field8227 != 0) {
                        var19 = super.field8227;
                        var18 = super.field8227;
                        var17 = super.field8227;
                        var16 = super.field8227;
                    } else {
                        var16 = (super.field8224 * var38 + super.field8242 * var10 + super.field8233 * var12 >> 14) + super.field8223;
                        if (~super.field8232.field2165 <= ~var16) {
                            return;
                        }
                        var17 = (super.field8242 * var11 + super.field8233 * var12 + super.field8224 * var39 >> 14) + super.field8223;
                        if (super.field8232.field2165 >= var17) {
                            return;
                        }
                        var18 = (super.field8242 * var11 - (-(super.field8224 * var40) - super.field8233 * var13) >> 14) + super.field8223;
                        if (super.field8232.field2165 >= var18) {
                            return;
                        }
                        var19 = (super.field8233 * var13 + super.field8242 * var10 + super.field8224 * var41 >> 14) + super.field8223;
                        if (super.field8232.field2165 >= var19) {
                            return;
                        }
                    }
                    var22 = (super.field8229 * var38 + super.field8230 * var10 + super.field8226 * var12 >> 14) + super.field8240;
                    var23 = super.field8232.field2162 * var22 / var16 + arg2.field9309;
                    var24 = (super.field8238 * var10 + super.field8239 * var12 + super.field8225 * var38 >> 14) + super.field8237;
                    var25 = super.field8232.field2171 * var24 / var16 + arg2.field9299;
                    var26 = (super.field8226 * var12 + (super.field8230 * var11 - -(super.field8229 * var39)) >> 14) + super.field8240;
                    var27 = super.field8232.field2162 * var26 / var17 + arg2.field9309;
                    var28 = (super.field8239 * var12 + super.field8238 * var11 + super.field8225 * var39 >> 14) + super.field8237;
                    int var42 = (super.field8226 * var13 + (super.field8230 * var11 - -(super.field8229 * var40)) >> 14) + super.field8240;
                    var30 = super.field8232.field2171 * var28 / var17 + arg2.field9299;
                    var31 = super.field8232.field2162 * var42 / var18 + arg2.field9309;
                    int var43 = super.field8237 - -(super.field8238 * var11 + super.field8225 * var40 - -(super.field8239 * var13) >> 14);
                    var34 = super.field8232.field2171 * var43 / var18 + arg2.field9299;
                    var33 = (super.field8226 * var13 + super.field8230 * var10 + super.field8229 * var41 >> 14) + super.field8240;
                    var35 = super.field8237 - -(super.field8239 * var13 + super.field8238 * var10 + super.field8225 * var41 >> 14);
                    var36 = arg2.field9309 - -(super.field8232.field2162 * var33 / var19);
                    var37 = super.field8232.field2171 * var35 / var19 + arg2.field9299;
                }
                if ((var30 - var37) * (-var36 + var31) + -((-var36 + var27) * (-var37 + var34)) > 0) {
                    arg2.field9308 = var31 < 0 || ~var36 > -1 || ~var27 > -1 || ~arg2.field9306 > ~var31 || arg2.field9306 < var36 || ~var27 < ~arg2.field9306;
                    if (~var9.field8810 > -1) {
                        arg2.method3669(var34, var37, var30, var31, var36, var27, var18, var19, var17, 65535 & var9.field8809, var9.field8814 & 65535, 65535 & var9.field8811);
                    } else {
                        if (this.method3311(super.field8232.field598.method3162((byte) -104, var9.field8810).field805)) {
                            arg2.field9305 = 100;
                        }
                        arg2.method3685(var34, var37, var30, var31, var36, var27, var18, var19, var17, 65535 & var9.field8809, 65535 & var9.field8814, var9.field8811 & 65535, var22, var26, var33, var24, var28, var35, var16, var17, var19, var9.field8810);
                        arg2.field9305 = 0;
                    }
                }
                if ((var23 - var27) * (-var30 + var37) + -((-var27 + var36) * (-var30 + var25)) > 0) {
                    arg2.field9308 = var23 < 0 || ~var27 > -1 || var36 < 0 || ~var23 < ~arg2.field9306 || ~arg2.field9306 > ~var27 || ~arg2.field9306 > ~var36;
                    if (var9.field8810 >= 0) {
                        if (this.method3311(super.field8232.field598.method3162((byte) -104, var9.field8810).field805)) {
                            arg2.field9305 = 100;
                        }
                        arg2.method3685(var25, var30, var37, var23, var27, var36, var16, var17, var19, var9.field8815 & 65535, var9.field8811 & 65535, var9.field8814 & 65535, var22, var26, var33, var24, var28, var35, var16, var17, var19, var9.field8810);
                        arg2.field9305 = 0;
                        return;
                    }
                    arg2.method3669(var25, var30, var37, var23, var27, var36, var16, var17, var19, var9.field8815 & 65535, 65535 & var9.field8811, 65535 & var9.field8814);
                }
            }
        } else {
            class58 var44 = super.field8241[arg1][arg6];
            if (var44 != null) {
                if (super.field8227 != -1) {
                    for (int var45 = 0; ~var45 > ~var44.field790; ++var45) {
                        int var46 = (arg1 << super.field1168) + var44.field781[var45];
                        short var47 = var44.field789[var45];
                        int var48 = var44.field782[var45] - -(arg6 << super.field1168);
                        int var49 = (super.field8239 * var48 + super.field8238 * var46 + super.field8225 * var47 >> 14) + super.field8237;
                        int var50 = (super.field8230 * var46 + super.field8229 * var47 - -(super.field8226 * var48) >> 14) + super.field8240;
                        arg5[var45] = super.field8232.field2162 * var50 / super.field8227 + arg2.field9309;
                        arg4[var45] = arg2.field9299 - -(super.field8232.field2171 * var49 / super.field8227);
                        arg7[var45] = super.field8227;
                    }
                } else {
                    for (int var51 = 0; var44.field790 > var51; ++var51) {
                        int var91 = var44.field781[var51] - -(arg1 << super.field1168);
                        short var92 = var44.field789[var51];
                        int var93 = (arg6 << super.field1168) + var44.field782[var51];
                        int var94 = super.field8223 - -(super.field8224 * var92 + super.field8242 * var91 + super.field8233 * var93 >> 14);
                        if (super.field8232.field2165 >= var94) {
                            return;
                        }
                        int var95 = (super.field8230 * var91 + super.field8229 * var92 + super.field8226 * var93 >> 14) + super.field8240;
                        int var96 = super.field8237 - -(super.field8225 * var92 + super.field8239 * var93 + super.field8238 * var91 >> 14);
                        arg5[var51] = arg2.field9309 - -(super.field8232.field2162 * var95 / var94);
                        arg4[var51] = super.field8232.field2171 * var96 / var94 + arg2.field9299;
                        arg7[var51] = var94;
                    }
                }
                if (var44.field786 != null) {
                    int var52 = super.field8236[arg1][arg6];
                    int var53 = super.field8236[arg1 + 1][arg6];
                    int var54 = super.field8236[arg1][arg6 + 1];
                    int var55 = super.field1163 * arg1;
                    int var56 = super.field1163 + var55;
                    int var57 = super.field1163 * arg6;
                    int var58 = super.field1163 + var57;
                    int var59 = super.field8240 - -(super.field8230 * var55 + super.field8226 * var57 - -(super.field8229 * var52) >> 14);
                    int var60 = super.field8237 - -(super.field8239 * var57 + super.field8238 * var55 + super.field8225 * var52 >> 14);
                    int var61 = (super.field8233 * var57 + super.field8242 * var55 + super.field8224 * var52 >> 14) + super.field8223;
                    int var62 = (super.field8230 * var56 + super.field8229 * var53 + super.field8226 * var57 >> 14) + super.field8240;
                    int var63 = super.field8237 - -(super.field8225 * var53 + super.field8239 * var57 + super.field8238 * var56 >> 14);
                    int var64 = (super.field8242 * var56 + super.field8224 * var53 - -(super.field8233 * var57) >> 14) + super.field8223;
                    int var65 = (super.field8229 * var54 + (super.field8230 * var55 - -(super.field8226 * var58)) >> 14) + super.field8240;
                    int var66 = (super.field8225 * var54 + (super.field8238 * var55 - -(super.field8239 * var58)) >> 14) + super.field8237;
                    int var67 = super.field8223 - -(super.field8242 * var55 + super.field8233 * var58 + super.field8224 * var54 >> 14);
                    for (int var68 = 0; var44.field780 > var68; ++var68) {
                        short var69 = var44.field783[var68];
                        short var70 = var44.field785[var68];
                        short var71 = var44.field779[var68];
                        int var72 = arg5[var69];
                        int var73 = arg5[var70];
                        int var74 = arg5[var71];
                        int var75 = arg4[var69];
                        int var76 = arg4[var70];
                        int var77 = arg4[var71];
                        if ((-var73 + var72) * (-var76 + var77) + -((-var73 + var74) * (-var76 + var75)) > 0) {
                            arg2.field9308 = var72 < 0 || ~var73 > -1 || ~var74 > -1 || arg2.field9306 < var72 || arg2.field9306 < var73 || arg2.field9306 < var74;
                            short var78 = var44.field786[var68];
                            if (var78 == -1) {
                                int var79 = var44.field784[var68];
                                if (~var79 != 0) {
                                    arg2.method3669(var75, var76, var77, var72, var73, var74, arg7[var69], arg7[var70], arg7[var71], class82.method639(3626, var79, var44.field788[var69]), class82.method639(3626, var79, var44.field788[var70]), class82.method639(arg3 + -61909, var79, var44.field788[var71]));
                                }
                            } else {
                                if (this.method3311(super.field8232.field598.method3162((byte) -104, var78).field805)) {
                                    arg2.field9305 = 100;
                                }
                                arg2.method3685(var75, var76, var77, var72, var73, var74, arg7[var69], arg7[var70], arg7[var71], var44.field788[var69], var44.field788[var70], var44.field788[var71], var59, var62, var65, var60, var63, var66, var61, var64, var67, var78);
                                arg2.field9305 = 0;
                            }
                        }
                    }
                } else {
                    for (int var80 = 0; ~var80 > ~var44.field780; ++var80) {
                        short var81 = var44.field783[var80];
                        short var82 = var44.field785[var80];
                        short var83 = var44.field779[var80];
                        int var84 = arg5[var81];
                        int var85 = arg5[var82];
                        int var86 = arg5[var83];
                        int var87 = arg4[var81];
                        int var88 = arg4[var82];
                        int var89 = arg4[var83];
                        if (~((-var85 + var84) * (-var88 + var89) - (-var85 + var86) * (-var88 + var87)) < -1) {
                            int var90 = var44.field784[var80];
                            if (var90 != -1) {
                                arg2.field9308 = ~var84 > -1 || var85 < 0 || ~var86 > -1 || ~var84 < ~arg2.field9306 || arg2.field9306 < var85 || arg2.field9306 < var86;
                                arg2.method3669(var87, var88, var89, var84, var85, var86, arg7[var81], arg7[var82], arg7[var83], class82.method639(3626, var90, var44.field788[var81]), class82.method639(3626, var90, var44.field788[var82]), class82.method639(3626, var90, var44.field788[var83]));
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Lql;IIII[[I[[II)V")
    public class563(class173 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(III[[ZZ)V")
    public final void method660(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        ++field7345;
        class488 var6 = super.field8232.field2151;
        super.field8227 = -1;
        super.field8237 = var6.field6483;
        super.field8242 = var6.field6477;
        super.field8233 = var6.field6481;
        super.field8240 = var6.field6485;
        super.field8226 = var6.field6484;
        super.field8223 = var6.field6487;
        super.field8238 = var6.field6486;
        super.field8230 = var6.field6478;
        super.field8225 = var6.field6488;
        super.field8239 = var6.field6480;
        super.field8229 = var6.field6482;
        super.field8224 = var6.field6479;
        for (int var7 = 0; var7 < arg2 - -arg2; ++var7) {
            for (int var8 = 0; ~(arg2 + arg2) < ~var8; ++var8) {
                if (arg3[var7][var8]) {
                    int var9 = arg0 - -var7 + -arg2;
                    int var10 = -arg2 + var8 + arg1;
                    if (~var9 <= -1 && super.field1166 > var9 && var10 >= 0 && var10 < super.field1164) {
                        this.method659(var9, var10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(II[IIZILjb;[[ZII[II)V")
    private final void method3007(int arg0, int arg1, int[] arg2, int arg3, boolean arg4, int arg5, class670 arg6, boolean[][] arg7, int arg8, int arg9, int[] arg10, int arg11) {
        ++field7347;
        int var13 = (-arg9 + arg5) * arg0 / 256;
        int var14 = arg0 >> 8;
        boolean var15 = ((class110) super.field8232).field1439;
        super.field8232.method391(false);
        arg6.field9303 = false;
        arg6.field9300 = arg4;
        int var16 = arg11;
        int var17 = arg1 - -var13;
        for (int var18 = arg3; arg8 > var18; ++var18) {
            for (int var19 = arg9; ~var19 > ~arg5; ++var19) {
                if (arg7[-arg3 + var18][-arg9 + var19]) {
                    if (super.field8231[var18][var19] != null) {
                        class375 var20 = super.field8231[var18][var19];
                        if (var20.field4809 != -1 && (var20.field4806 & 2) == 0 && var20.field4811 == 0) {
                            int var21 = super.field8232.method1178(var20.field4809);
                            arg6.method3669(-var14 + var17, -var14 + var17, var17, var14 + var16, var16, var16 - -var14, 100, 100, 100, class82.method639(3626, var21, var20.field4802), class82.method639(3626, var21, var20.field4810), class82.method639(3626, var21, var20.field4803));
                            arg6.method3669(var17, var17, -var14 + var17, var16, var14 + var16, var16, 100, 100, 100, class82.method639(3626, var21, var20.field4805), class82.method639(3626, var21, var20.field4803), class82.method639(3626, var21, var20.field4810));
                        } else if (~var20.field4811 == -1) {
                            arg6.method3673(var17 - var14, var17 - var14, var17, var16 - -var14, var16, var14 + var16, 100, 100, 100, var20.field4802, var20.field4810, var20.field4803);
                            arg6.method3673(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, var20.field4805, var20.field4803, var20.field4810);
                        } else {
                            int var22 = var20.field4811;
                            arg6.method3673(-var14 + var17, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, class354.method2040(-16777216 & var20.field4802, (byte) 99, var22), class354.method2040(-16777216 & var20.field4810, (byte) 117, var22), class354.method2040(var20.field4803 & -16777216, (byte) 121, var22));
                            arg6.method3673(var17, var17, -var14 + var17, var16, var16 - -var14, var16, 100, 100, 100, class354.method2040(var20.field4805 & -16777216, (byte) -17, var22), class354.method2040(var20.field4803 & -16777216, (byte) -53, var22), class354.method2040(var20.field4810 & -16777216, (byte) -98, var22));
                        }
                    } else if (super.field8222[var18][var19] != null) {
                        class624 var23 = super.field8222[var18][var19];
                        for (int var24 = 0; var24 < var23.field8731; ++var24) {
                            arg10[var24] = var23.field8737[var24] * var14 / super.field1163 + var16;
                            arg2[var24] = var17 - var23.field8734[var24] * var14 / super.field1163;
                        }
                        for (int var25 = 0; ~var25 > ~var23.field8732; ++var25) {
                            int var26 = var25 * 3;
                            int var27 = var26 + 1;
                            int var28 = var27 + 1;
                            int var29 = arg10[var26];
                            int var30 = arg10[var27];
                            int var31 = arg10[var28];
                            int var32 = arg2[var26];
                            int var33 = arg2[var27];
                            int var34 = arg2[var28];
                            if (var23.field8735 == null || var23.field8735[var25] == 0 || var23.field8739 != null && (var23.field8739 == null || var23.field8739[var25] != -1)) {
                                if (var23.field8739 != null && var23.field8739[var25] != -1) {
                                    int var36 = super.field8232.method1178(var23.field8739[var25]);
                                    arg6.method3669(var32, var33, var34, var29, var30, var31, 100, 100, 100, var36, var36, var36);
                                } else {
                                    arg6.method3673(var32, var33, var34, var29, var30, var31, 100, 100, 100, var23.field8736[var26], var23.field8736[var27], var23.field8736[var28]);
                                }
                            } else {
                                int var35 = var23.field8735[var25];
                                arg6.method3673(var32, var33, var34, var29, var30, var31, 100, 100, 100, class354.method2040(-(-16777216 & var23.field8736[var26]) + -16777216, (byte) -55, var35), class354.method2040(-(var23.field8736[var27] & -16777216) + -16777216, (byte) -61, var35), class354.method2040(-(-16777216 & var23.field8736[var28]) + -16777216, (byte) 79, var35));
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var16 += var14;
            var17 = arg1 + var13;
        }
        arg6.field9303 = true;
        super.field8232.method391(var15);
    }

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(I)V")
    public static final void method3008(int arg0) {
        if (arg0 == 512) {
            ++field7350;
            int var1 = (int) ((double) class611.field8258 * 34.46D);
            int var2 = var1 << 2;
            if (class520.field6799.method382()) {
                var2 += 512;
            }
            class520.field6799.method335(200, var2);
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(II)V")
    public final void method659(int arg0, int arg1) {
        ++field7346;
        class639 var3 = (class639) super.field8232.method846(Thread.currentThread());
        var3.field8892.field9305 = 0;
        if (super.field8231 == null) {
            if (super.field8235 != null) {
                this.method3006(var3.field5627, arg0, var3.field8892, 65535, var3.field5635, var3.field5613, arg1, var3.field5637);
                return;
            }
        } else {
            this.method3011(arg0, var3.field8892, -126, var3.field5627, var3.field5613, super.field8232.field2156, arg1, var3.field5635, var3.field5637);
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(III[IIBI[[ZLjb;[III)V")
    private final void method3009(int arg0, int arg1, int arg2, int[] arg3, int arg4, byte arg5, int arg6, boolean[][] arg7, class670 arg8, int[] arg9, int arg10, int arg11) {
        ++field7344;
        int var13 = (-arg10 + arg0) * arg1 / 256;
        int var14 = arg1 >> 8;
        int var15 = -48 / ((arg5 - -47) / 52);
        boolean var16 = ((class110) super.field8232).field1439;
        super.field8232.method391(false);
        arg8.field9300 = false;
        arg8.field9303 = false;
        int var17 = arg6;
        int var18 = arg11 + var13;
        for (int var19 = arg4; arg2 > var19; ++var19) {
            for (int var20 = arg10; var20 < arg0; ++var20) {
                if (arg7[-arg4 + var19][-arg10 + var20]) {
                    if (super.field8235[var19][var20] != null) {
                        class632 var36 = super.field8235[var19][var20];
                        if (~var36.field8810 != 0 && (var36.field8812 & 2) == 0 && var36.field8813 == -1) {
                            int var37 = super.field8232.method1178(var36.field8810);
                            arg8.method3669(var18 - var14, var18 - var14, var18, var14 + var17, var17, var17 - -var14, 100, 100, 100, class82.method639(3626, var37, 65535 & var36.field8809), class82.method639(3626, var37, var36.field8814 & 65535), class82.method639(3626, var37, 65535 & var36.field8811));
                            arg8.method3669(var18, var18, var18 - var14, var17, var14 + var17, var17, 100, 100, 100, class82.method639(3626, var37, 65535 & var36.field8815), class82.method639(3626, var37, 65535 & var36.field8811), class82.method639(3626, var37, 65535 & var36.field8814));
                        } else if (var36.field8813 != -1) {
                            int var38 = var36.field8813;
                            arg8.method3669(-var14 + var18, -var14 + var18, var18, var14 + var17, var17, var14 + var17, 100, 100, 100, var38, var38, var38);
                            arg8.method3669(var18, var18, -var14 + var18, var17, var17 - -var14, var17, 100, 100, 100, var38, var38, var38);
                        } else {
                            arg8.method3669(-var14 + var18, -var14 + var18, var18, var17 - -var14, var17, var14 + var17, 100, 100, 100, var36.field8809 & 65535, 65535 & var36.field8814, var36.field8811 & 65535);
                            arg8.method3669(var18, var18, -var14 + var18, var17, var14 + var17, var17, 100, 100, 100, 65535 & var36.field8815, var36.field8811 & 65535, 65535 & var36.field8814);
                        }
                    } else if (super.field8241[var19][var20] != null) {
                        class58 var21 = super.field8241[var19][var20];
                        for (int var22 = 0; ~var22 > ~var21.field790; ++var22) {
                            arg3[var22] = var21.field781[var22] * var14 / super.field1163 + var17;
                            arg9[var22] = var18 - var21.field782[var22] * var14 / super.field1163;
                        }
                        for (int var23 = 0; var21.field780 > var23; ++var23) {
                            short var24 = var21.field783[var23];
                            short var25 = var21.field785[var23];
                            short var26 = var21.field779[var23];
                            int var27 = arg3[var24];
                            int var28 = arg3[var25];
                            int var29 = arg3[var26];
                            int var30 = arg9[var24];
                            int var31 = arg9[var25];
                            int var32 = arg9[var26];
                            if (var21.field787 != null && var21.field787[var23] != -1) {
                                int var33 = var21.field787[var23];
                                arg8.method3669(var30, var31, var32, var27, var28, var29, 100, 100, 100, class82.method639(3626, var33, var21.field788[var24]), class82.method639(3626, var33, var21.field788[var25]), class82.method639(3626, var33, var21.field788[var26]));
                            } else if (var21.field786 != null && ~var21.field786[var23] != 0) {
                                int var34 = super.field8232.method1178(var21.field786[var23]);
                                arg8.method3669(var30, var31, var32, var27, var28, var29, 100, 100, 100, class82.method639(3626, var34, var21.field788[var24]), class82.method639(3626, var34, var21.field788[var25]), class82.method639(3626, var34, var21.field788[var26]));
                            } else {
                                int var35 = var21.field784[var23];
                                arg8.method3669(var30, var31, var32, var27, var28, var29, 100, 100, 100, class82.method639(3626, var35, var21.field788[var24]), class82.method639(3626, var35, var21.field788[var25]), class82.method639(3626, var35, var21.field788[var26]));
                            }
                        }
                    }
                }
                var18 -= var14;
            }
            var17 += var14;
            var18 = arg11 - -var13;
        }
        arg8.field9303 = true;
        super.field8232.method391(var16);
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "([IZ[I)V")
    public static final void method3010(int[] arg0, boolean arg1, int[] arg2) {
        ++field7349;
        if (arg1) {
            field7341 = 59;
        }
        if (arg2 != null && arg0 != null) {
            class171.field2117 = arg2;
            class109.field1416 = new int[arg2.length];
            class310.field4028 = new byte[arg2.length][][];
            for (int var3 = 0; ~class171.field2117.length < ~var3; ++var3) {
                class310.field4028[var3] = new byte[arg0[var3]][];
            }
        } else {
            class171.field2117 = null;
            class109.field1416 = null;
            class310.field4028 = null;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILjb;I[I[IZI[I[I)V")
    private final void method3011(int arg0, class670 arg1, int arg2, int[] arg3, int[] arg4, boolean arg5, int arg6, int[] arg7, int[] arg8) {
        ++field7342;
        if (arg2 >= -122) {
            field7341 = -91;
        }
        class375 var10 = super.field8231[arg0][arg6];
        if (var10 != null) {
            if (~(2 & var10.field4806) == -1) {
                int var11 = super.field1163 * arg0;
                int var12 = var11 - -super.field1163;
                int var13 = super.field1163 * arg6;
                int var14 = var13 - -super.field1163;
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                int var20;
                int var21;
                int var22;
                int var23;
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
                int var45;
                int var46;
                if (~(1 & var10.field4806) != -1 && !arg5) {
                    int var19 = super.field8236[arg0][arg6];
                    if (~super.field8227 != 0) {
                        var20 = super.field8227;
                        var21 = super.field8227;
                        var22 = super.field8227;
                        var23 = super.field8227;
                    } else {
                        int var24 = super.field8224 * var19;
                        var23 = (super.field8233 * var13 + super.field8242 * var11 + var24 >> 14) + super.field8223;
                        if (~var23 >= ~super.field8232.field2165) {
                            return;
                        }
                        var22 = (super.field8242 * var12 + super.field8233 * var13 + var24 >> 14) + super.field8223;
                        if (~var22 >= ~super.field8232.field2165) {
                            return;
                        }
                        var21 = (super.field8242 * var12 + super.field8233 * var14 - -var24 >> 14) + super.field8223;
                        if (super.field8232.field2165 >= var21) {
                            return;
                        }
                        var20 = super.field8223 - -(super.field8242 * var11 - (-var24 - super.field8233 * var14) >> 14);
                        if (super.field8232.field2165 >= var20) {
                            return;
                        }
                    }
                    if (super.field8232.field2161) {
                        int var25 = var23 - super.field8232.field2152;
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = -super.field8232.field2152 + var22;
                        if (~var26 < -1) {
                            var16 = var26;
                            if (~var26 < -256) {
                                var16 = 255;
                            }
                        }
                        int var27 = var21 - super.field8232.field2152;
                        if (~var27 < -1) {
                            var17 = var27;
                            if (~var27 < -256) {
                                var17 = 255;
                            }
                        }
                        int var28 = -super.field8232.field2152 + var20;
                        if (var28 > 0) {
                            var18 = var28;
                            if (var28 > 255) {
                                var18 = 255;
                            }
                        }
                    }
                    int var29 = super.field8229 * var19;
                    int var30 = super.field8225 * var19;
                    var31 = (super.field8226 * var13 + (super.field8230 * var11 - -var29) >> 14) + super.field8240;
                    var32 = super.field8232.field2162 * var31 / var23 + arg1.field9309;
                    var33 = super.field8237 - -(super.field8238 * var11 + var30 - -(super.field8239 * var13) >> 14);
                    var34 = arg1.field9299 - -(super.field8232.field2171 * var33 / var23);
                    var35 = super.field8240 - -(super.field8226 * var13 + super.field8230 * var12 + var29 >> 14);
                    var36 = arg1.field9309 - -(super.field8232.field2162 * var35 / var22);
                    var37 = super.field8237 - -(super.field8238 * var12 - (-(super.field8239 * var13) + -var30) >> 14);
                    var38 = (super.field8226 * var14 + super.field8230 * var12 + var29 >> 14) + super.field8240;
                    var39 = super.field8232.field2171 * var37 / var22 + arg1.field9299;
                    var40 = (super.field8238 * var12 + var30 - -(super.field8239 * var14) >> 14) + super.field8237;
                    var41 = super.field8232.field2162 * var38 / var21 + arg1.field9309;
                    var42 = super.field8232.field2171 * var40 / var21 + arg1.field9299;
                    var43 = (super.field8226 * var14 + super.field8230 * var11 + var29 >> 14) + super.field8240;
                    var44 = super.field8237 - -(super.field8238 * var11 + (var30 - -(super.field8239 * var14)) >> 14);
                    var45 = super.field8232.field2162 * var43 / var20 + arg1.field9309;
                    var46 = super.field8232.field2171 * var44 / var20 + arg1.field9299;
                } else {
                    int var47 = super.field8236[arg0][arg6];
                    int var48 = super.field8236[arg0 + 1][arg6];
                    int var49 = super.field8236[arg0 + 1][arg6 + 1];
                    int var50 = super.field8236[arg0][arg6 + 1];
                    if (super.field8227 == -1) {
                        var23 = (super.field8242 * var11 - -(super.field8224 * var47) - -(super.field8233 * var13) >> 14) + super.field8223;
                        if (var23 <= super.field8232.field2165) {
                            return;
                        }
                        var22 = (super.field8242 * var12 + super.field8224 * var48 - -(super.field8233 * var13) >> 14) + super.field8223;
                        if (~var22 >= ~super.field8232.field2165) {
                            return;
                        }
                        var21 = super.field8223 - -(super.field8233 * var14 + super.field8242 * var12 + super.field8224 * var49 >> 14);
                        if (var21 <= super.field8232.field2165) {
                            return;
                        }
                        var20 = (super.field8242 * var11 + super.field8233 * var14 - -(super.field8224 * var50) >> 14) + super.field8223;
                        if (super.field8232.field2165 >= var20) {
                            return;
                        }
                    } else {
                        var20 = super.field8227;
                        var21 = super.field8227;
                        var22 = super.field8227;
                        var23 = super.field8227;
                    }
                    if (!arg5) {
                        if (super.field8232.field2161) {
                            int var51 = var23 - super.field8232.field2152;
                            if (~var51 < -1) {
                                var15 = var51;
                                if (var51 > 255) {
                                    var15 = 255;
                                }
                            }
                            int var52 = var22 - super.field8232.field2152;
                            if (var52 > 0) {
                                var16 = var52;
                                if (~var52 < -256) {
                                    var16 = 255;
                                }
                            }
                            int var53 = -super.field8232.field2152 + var21;
                            if (var53 > 0) {
                                var17 = var53;
                                if (~var53 < -256) {
                                    var17 = 255;
                                }
                            }
                            int var54 = var20 - super.field8232.field2152;
                            if (~var54 < -1) {
                                var18 = var54;
                                if (var54 > 255) {
                                    var18 = 255;
                                }
                            }
                        }
                    } else {
                        int var55 = var23 - super.field8232.field2152;
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (~var55 < -1) {
                            var15 = var55;
                            int var56 = var10.field4808 * var55 / 255;
                            if (~var56 < -1) {
                                var47 -= var56;
                            }
                        }
                        int var57 = -super.field8232.field2152 + var22;
                        if (var57 > 255) {
                            var57 = 255;
                        }
                        if (var57 > 0) {
                            var16 = var57;
                            int var58 = var10.field4804 * var57 / 255;
                            if (~var58 < -1) {
                                var48 -= var58;
                            }
                        }
                        int var59 = -super.field8232.field2152 + var21;
                        if (~var59 < -256) {
                            var59 = 255;
                        }
                        if (var59 > 0) {
                            var17 = var59;
                            int var60 = var10.field4807 * var59 / 255;
                            if (var60 > 0) {
                                var49 -= var60;
                            }
                        }
                        int var61 = -super.field8232.field2152 + var20;
                        if (var61 > 255) {
                            var61 = 255;
                        }
                        if (~var61 < -1) {
                            var18 = var61;
                            int var62 = var10.field4812 * var61 / 255;
                            if (var62 > 0) {
                                var50 -= var62;
                            }
                        }
                    }
                    var31 = (super.field8230 * var11 - (-(super.field8229 * var47) - super.field8226 * var13) >> 14) + super.field8240;
                    var33 = (super.field8238 * var11 - (-(super.field8239 * var13) + -(super.field8225 * var47)) >> 14) + super.field8237;
                    var32 = arg1.field9309 - -(super.field8232.field2162 * var31 / var23);
                    var35 = (super.field8226 * var13 + super.field8230 * var12 + super.field8229 * var48 >> 14) + super.field8240;
                    var34 = arg1.field9299 - -(super.field8232.field2171 * var33 / var23);
                    var36 = super.field8232.field2162 * var35 / var22 + arg1.field9309;
                    var37 = (super.field8225 * var48 + super.field8239 * var13 + super.field8238 * var12 >> 14) + super.field8237;
                    var38 = super.field8240 - -(super.field8226 * var14 + super.field8230 * var12 + super.field8229 * var49 >> 14);
                    var39 = arg1.field9299 - -(super.field8232.field2171 * var37 / var22);
                    var40 = (super.field8238 * var12 - -(super.field8225 * var49) - -(super.field8239 * var14) >> 14) + super.field8237;
                    var41 = super.field8232.field2162 * var38 / var21 + arg1.field9309;
                    var42 = super.field8232.field2171 * var40 / var21 + arg1.field9299;
                    var43 = (super.field8230 * var11 - -(super.field8229 * var50) - -(super.field8226 * var14) >> 14) + super.field8240;
                    var44 = super.field8237 - -(super.field8238 * var11 - (-(super.field8239 * var14) + -(super.field8225 * var50)) >> 14);
                    var45 = super.field8232.field2162 * var43 / var20 + arg1.field9309;
                    var46 = super.field8232.field2171 * var44 / var20 + arg1.field9299;
                }
                boolean var63 = ~var10.field4809 != 0 && this.method3311(super.field8232.field598.method3162((byte) -104, var10.field4809).field805);
                int var64 = var16 + var18 + var17;
                if (~((var41 - var45) * (-var46 + var39) + -((var36 - var45) * (-var46 + var42))) < -1) {
                    arg1.field9308 = var41 < 0 || var45 < 0 || ~var36 > -1 || arg1.field9306 < var41 || arg1.field9306 < var45 || var36 > arg1.field9306;
                    if (var64 < 765) {
                        if (var63) {
                            arg1.field9305 = 100;
                        }
                        if (~var64 >= -1) {
                            if (var10.field4809 >= 0) {
                                arg1.method3685(var42, var46, var39, var41, var45, var36, var21, var20, var22, var10.field4802, var10.field4810, var10.field4803, var38, var43, var35, var40, var44, var37, var21, var20, var22, var10.field4809);
                            } else {
                                arg1.method3673(var42, var46, var39, var41, var45, var36, var21, var20, var22, var10.field4802, var10.field4810, var10.field4803);
                            }
                        } else if (~var10.field4809 <= -1) {
                            arg1.method3686(var42, var46, var39, var41, var45, var36, var21, var20, var22, super.field8232.field2175, var17, var18, var16, var10.field4802, var10.field4810, var10.field4803, var38, var43, var35, var40, var44, var37, var21, var20, var22, var10.field4809);
                        } else {
                            arg1.method3673(var42, var46, var39, var41, var45, var36, var21, var20, var22, class354.method2040(super.field8232.field2175 | var17 << 24, (byte) 115, var10.field4802), class354.method2040(super.field8232.field2175 | var18 << 24, (byte) -37, var10.field4810), class354.method2040(super.field8232.field2175 | var16 << 24, (byte) -122, var10.field4803));
                        }
                        arg1.field9305 = 0;
                    } else {
                        arg1.method3671(var42, var46, var39, var41, var45, var36, var21, var20, var22, super.field8232.field2175);
                    }
                }
                int var65 = var15 - (-var16 - var18);
                if (~((-var36 + var32) * (-var39 + var46) + -((var34 - var39) * (-var36 + var45))) < -1) {
                    arg1.field9308 = var32 < 0 || var36 < 0 || ~var45 > -1 || arg1.field9306 < var32 || arg1.field9306 < var36 || ~var45 < ~arg1.field9306;
                    if (~var65 <= -766) {
                        arg1.method3671(var34, var39, var46, var32, var36, var45, var23, var22, var20, super.field8232.field2175);
                        return;
                    }
                    if (var63) {
                        arg1.field9305 = 100;
                    }
                    if (var65 <= 0) {
                        if (~var10.field4809 <= -1) {
                            arg1.method3685(var34, var39, var46, var32, var36, var45, var23, var22, var20, var10.field4805, var10.field4803, var10.field4810, var31, var35, var43, var33, var37, var44, var23, var22, var20, var10.field4809);
                        } else {
                            arg1.method3673(var34, var39, var46, var32, var36, var45, var23, var22, var20, var10.field4805, var10.field4803, var10.field4810);
                        }
                    } else if (var10.field4809 < 0) {
                        arg1.method3673(var34, var39, var46, var32, var36, var45, var23, var22, var20, class354.method2040(super.field8232.field2175 | var15 << 24, (byte) -93, var10.field4805), class354.method2040(super.field8232.field2175 | var16 << 24, (byte) 114, var10.field4803), class354.method2040(var18 << 24 | super.field8232.field2175, (byte) 80, var10.field4810));
                    } else {
                        arg1.method3686(var34, var39, var46, var32, var36, var45, var23, var22, var20, super.field8232.field2175, var15, var16, var18, var10.field4805, var10.field4803, var10.field4810, var31, var35, var43, var33, var37, var44, var23, var22, var20, var10.field4809);
                    }
                    arg1.field9305 = 0;
                }
            }
        } else {
            class624 var66 = super.field8222[arg0][arg6];
            if (var66 != null) {
                if (~super.field8227 == 0) {
                    for (int var67 = 0; var66.field8731 > var67; ++var67) {
                        int var68 = var66.field8737[var67] - -(arg0 << super.field1168);
                        int var69 = var66.field8733[var67];
                        int var70 = (arg6 << super.field1168) + var66.field8734[var67];
                        int var71 = super.field8223 - -(super.field8242 * var68 + super.field8224 * var69 - -(super.field8233 * var70) >> 14);
                        if (~var71 >= ~super.field8232.field2165) {
                            return;
                        }
                        arg3[var67] = 0;
                        if (!arg5) {
                            if (super.field8232.field2161) {
                                int var72 = var71 - super.field8232.field2152;
                                if (var72 > 0) {
                                    arg3[var67] = var72;
                                    if (arg3[var67] > 255) {
                                        arg3[var67] = 255;
                                    }
                                }
                            }
                        } else {
                            int var73 = var71 - super.field8232.field2152;
                            if (~var73 < -256) {
                                var73 = 255;
                            }
                            if (var73 > 0) {
                                arg3[var67] = var73;
                                int var74 = var66.field8738[var67] * var73 / 255;
                                if (~var74 < -1) {
                                    var69 -= var74;
                                }
                            }
                        }
                        int var75 = (super.field8226 * var70 + super.field8230 * var68 + super.field8229 * var69 >> 14) + super.field8240;
                        int var76 = (super.field8239 * var70 + super.field8238 * var68 + super.field8225 * var69 >> 14) + super.field8237;
                        arg4[var67] = super.field8232.field2162 * var75 / var71 + arg1.field9309;
                        arg7[var67] = super.field8232.field2171 * var76 / var71 + arg1.field9299;
                        arg8[var67] = var71;
                    }
                } else {
                    for (int var77 = 0; ~var77 > ~var66.field8731; ++var77) {
                        int var117 = (arg0 << super.field1168) + var66.field8737[var77];
                        int var118 = var66.field8733[var77];
                        int var119 = (arg6 << super.field1168) + var66.field8734[var77];
                        arg3[var77] = 0;
                        if (!arg5) {
                            if (super.field8232.field2161) {
                                int var120 = -super.field8232.field2152 + super.field8227;
                                if (var120 > 0) {
                                    arg3[var77] = var120;
                                    if (arg3[var77] > 255) {
                                        arg3[var77] = 255;
                                    }
                                }
                            }
                        } else {
                            int var121 = super.field8227 - super.field8232.field2152;
                            if (var121 > 255) {
                                var121 = 255;
                            }
                            if (~var121 < -1) {
                                arg3[var77] = var121;
                                int var122 = var66.field8738[var77] * var121 / 255;
                                if (var122 > 0) {
                                    var118 -= var122;
                                }
                            }
                        }
                        int var123 = super.field8237 - -(super.field8238 * var117 + super.field8225 * var118 - -(super.field8239 * var119) >> 14);
                        int var124 = (super.field8230 * var117 + super.field8229 * var118 - -(super.field8226 * var119) >> 14) + super.field8240;
                        arg4[var77] = super.field8232.field2162 * var124 / super.field8227 + arg1.field9309;
                        arg7[var77] = super.field8232.field2171 * var123 / super.field8227 + arg1.field9299;
                        arg8[var77] = super.field8227;
                    }
                }
                if (var66.field8739 != null) {
                    int var78 = super.field8236[arg0][arg6];
                    int var79 = super.field8236[arg0 + 1][arg6];
                    int var80 = super.field8236[arg0][arg6 + 1];
                    int var81 = super.field1163 * arg0;
                    int var82 = super.field1163 + var81;
                    int var83 = super.field1163 * arg6;
                    int var84 = super.field1163 + var83;
                    int var85 = (super.field8226 * var83 + super.field8230 * var81 + super.field8229 * var78 >> 14) + super.field8240;
                    int var86 = (super.field8239 * var83 + super.field8238 * var81 + super.field8225 * var78 >> 14) + super.field8237;
                    int var87 = (super.field8242 * var81 + super.field8224 * var78 - -(super.field8233 * var83) >> 14) + super.field8223;
                    int var88 = (super.field8229 * var79 + super.field8230 * var82 + super.field8226 * var83 >> 14) + super.field8240;
                    int var89 = super.field8237 - -(super.field8239 * var83 + super.field8238 * var82 + super.field8225 * var79 >> 14);
                    int var90 = (super.field8242 * var82 + super.field8233 * var83 + super.field8224 * var79 >> 14) + super.field8223;
                    int var91 = (super.field8226 * var84 + (super.field8230 * var81 - -(super.field8229 * var80)) >> 14) + super.field8240;
                    int var92 = (super.field8238 * var81 - -(super.field8225 * var80) - -(super.field8239 * var84) >> 14) + super.field8237;
                    int var93 = super.field8223 - -(super.field8233 * var84 + super.field8242 * var81 + super.field8224 * var80 >> 14);
                    for (int var94 = 0; var66.field8732 > var94; ++var94) {
                        int var95 = var94 * 3;
                        int var96 = var95 + 1;
                        int var97 = var96 + 1;
                        int var98 = arg4[var95];
                        int var99 = arg4[var96];
                        int var100 = arg4[var97];
                        int var101 = arg7[var95];
                        int var102 = arg7[var96];
                        int var103 = arg7[var97];
                        int var104 = arg3[var95] + arg3[var96] + arg3[var97];
                        if ((var98 - var99) * (var103 - var102) - (-var99 + var100) * (-var102 + var101) > 0) {
                            arg1.field9308 = var98 < 0 || var99 < 0 || ~var100 > -1 || ~var98 < ~arg1.field9306 || ~var99 < ~arg1.field9306 || ~arg1.field9306 > ~var100;
                            short var105 = var66.field8739[var94];
                            if (~var104 <= -766) {
                                arg1.method3671(var101, var102, var103, var98, var99, var100, arg8[var95], arg8[var96], arg8[var97], super.field8232.field2175);
                            } else {
                                if (~var105 != 0 && this.method3311(super.field8232.field598.method3162((byte) -104, var105).field805)) {
                                    arg1.field9305 = 100;
                                }
                                if (~var104 >= -1) {
                                    if (var105 != -1) {
                                        arg1.method3685(var101, var102, var103, var98, var99, var100, arg8[var95], arg8[var96], arg8[var97], var66.field8736[var95], var66.field8736[var96], var66.field8736[var97], var85, var88, var91, var86, var89, var92, var87, var90, var93, var105);
                                    } else if ((16777215 & var66.field8736[var95]) != 0) {
                                        arg1.method3673(var101, var102, var103, var98, var99, var100, arg8[var95], arg8[var96], arg8[var97], var66.field8736[var95], var66.field8736[var96], var66.field8736[var97]);
                                    }
                                } else if (var105 != -1) {
                                    arg1.method3686(var101, var102, var103, var98, var99, var100, arg8[var95], arg8[var96], arg8[var97], super.field8232.field2175, arg3[var95], arg3[var96], arg3[var97], var66.field8736[var95], var66.field8736[var96], var66.field8736[var97], var85, var88, var91, var86, var89, var92, var87, var90, var93, var105);
                                } else if (~(var66.field8736[var95] & 16777215) != -1) {
                                    arg1.method3673(var101, var102, var103, var98, var99, var100, arg8[var95], arg8[var96], arg8[var97], class354.method2040(arg3[var95] << 24 | super.field8232.field2175, (byte) 112, var66.field8736[var95]), class354.method2040(arg3[var96] << 24 | super.field8232.field2175, (byte) 119, var66.field8736[var96]), class354.method2040(super.field8232.field2175 | arg3[var97] << 24, (byte) 119, var66.field8736[var97]));
                                }
                                arg1.field9305 = 0;
                            }
                        }
                    }
                } else {
                    for (int var106 = 0; var106 < var66.field8732; ++var106) {
                        int var107 = var106 * 3;
                        int var108 = var107 - -1;
                        int var109 = var108 + 1;
                        int var110 = arg4[var107];
                        int var111 = arg4[var108];
                        int var112 = arg4[var109];
                        int var113 = arg7[var107];
                        int var114 = arg7[var108];
                        int var115 = arg7[var109];
                        int var116 = arg3[var107] + arg3[var109] + arg3[var108];
                        if ((var110 - var111) * (-var114 + var115) + -((-var111 + var112) * (-var114 + var113)) > 0) {
                            arg1.field9308 = var110 < 0 || ~var111 > -1 || var112 < 0 || ~var110 < ~arg1.field9306 || arg1.field9306 < var111 || var112 > arg1.field9306;
                            if (var116 < 765) {
                                if (~var116 >= -1) {
                                    if (~(var66.field8736[var107] & 16777215) != -1) {
                                        arg1.method3673(var113, var114, var115, var110, var111, var112, arg8[var107], arg8[var108], arg8[var109], var66.field8736[var107], var66.field8736[var108], var66.field8736[var109]);
                                    }
                                } else if (~(var66.field8736[var107] & 16777215) != -1) {
                                    arg1.method3673(var113, var114, var115, var110, var111, var112, arg8[var107], arg8[var108], arg8[var109], class14.method84(super.field8232.field2175, arg3[var107], false, var66.field8736[var107]), class14.method84(super.field8232.field2175, arg3[var108], false, var66.field8736[var108]), class14.method84(super.field8232.field2175, arg3[var109], false, var66.field8736[var109]));
                                }
                            } else {
                                arg1.method3671(var113, var114, var115, var110, var111, var112, arg8[var107], arg8[var108], arg8[var109], super.field8232.field2175);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method670(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field7348;
        class639 var9 = (class639) super.field8232.method846(Thread.currentThread());
        class670 var10 = var9.field8892;
        var10.field9308 = false;
        var10.field9305 = 0;
        super.field8232.method205();
        if (super.field8231 != null) {
            this.method3007(arg2, arg1, var9.field5635, arg3, false, arg6, var10, arg7, arg5, arg4, var9.field5613, arg0);
        } else if (super.field8235 != null) {
            this.method3009(arg6, arg2, arg5, var9.field5613, arg3, (byte) 13, arg0, arg7, var10, var9.field5635, arg4, arg1);
        }
    }
}
