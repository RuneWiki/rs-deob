import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class557 extends class71 {

    @OriginalMember(owner = "client!ht", name = "H", descriptor = "I")
    public static int field7877 = 0;

    @OriginalMember(owner = "client!ht", name = "F", descriptor = "I")
    public static int field7875 = 0;

    @OriginalMember(owner = "client!ht", name = "I", descriptor = "Luaa;")
    public static class395 field7878 = new class395(32);

    @OriginalMember(owner = "client!ht", name = "E", descriptor = "I")
    public static int field7874;

    @OriginalMember(owner = "client!ht", name = "G", descriptor = "I")
    public static int field7876;

    @OriginalMember(owner = "client!ht", name = "J", descriptor = "I")
    public static int field7879;

    @OriginalMember(owner = "client!ht", name = "K", descriptor = "I")
    public static int field7880;

    @OriginalMember(owner = "client!ht", name = "L", descriptor = "I")
    public static int field7881;

    @OriginalMember(owner = "client!ht", name = "M", descriptor = "I")
    public static int field7882;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method688(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field7881;
        class421 var9 = (class421) super.field1341.method395(Thread.currentThread());
        class348 var10 = var9.field6187;
        var10.field4991 = 0;
        var10.field4989 = false;
        if (super.field1342 == null) {
            if (super.field1326 != null) {
                this.method3135(arg5, arg6, arg7, var9.field2530, arg3, var10, arg1, arg2, arg0, var9.field2569, -98, arg4);
                return;
            }
        } else {
            this.method3134(arg5, arg4, arg2, var9.field2569, var10, 123, arg0, arg3, arg6, arg1, var9.field2530, arg7);
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(II)V")
    public final void method693(int arg0, int arg1) {
        ++field7874;
        class421 var3 = (class421) super.field1341.method395(Thread.currentThread());
        var3.field6187.field4991 = 0;
        if (super.field1342 == null) {
            if (super.field1326 != null) {
                this.method3132(var3.field6187, var3.field2538, var3.field2530, arg1, var3.field2569, var3.field2537, arg0, (byte) 74);
                return;
            }
        } else {
            this.method3136((byte) -75, var3.field6187, arg1, var3.field2530, var3.field2569, var3.field2538, arg0, super.field1341.field4493, var3.field2537);
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lwq;[I[II[I[IIB)V")
    private final void method3132(class348 arg0, int[] arg1, int[] arg2, int arg3, int[] arg4, int[] arg5, int arg6, byte arg7) {
        ++field7880;
        class535 var9 = super.field1326[arg6][arg3];
        int var10 = -92 % ((arg7 - -60) / 47);
        if (var9 != null) {
            if ((var9.field7466 & 2) == 0) {
                int var11 = super.field7544 * arg6;
                int var12 = super.field7544 + var11;
                int var13 = super.field7544 * arg3;
                int var14 = super.field7544 + var13;
                int var19;
                int var20;
                int var21;
                int var22;
                int var23;
                int var24;
                int var25;
                int var26;
                int var27;
                int var28;
                int var29;
                int var31;
                int var32;
                int var34;
                int var35;
                int var36;
                int var37;
                int var38;
                if (~(1 & var9.field7466) == -1) {
                    int var15 = super.field1322[arg6][arg3];
                    int var16 = super.field1322[arg6 + 1][arg3];
                    int var17 = super.field1322[arg6 + 1][arg3 + 1];
                    int var18 = super.field1322[arg6][arg3 + 1];
                    if (~super.field1330 == 0) {
                        var19 = (super.field1338 * var15 + (super.field1324 * var11 - -(super.field1332 * var13)) >> 15) + super.field1327;
                        if (super.field1341.field4490 >= var19) {
                            return;
                        }
                        var20 = (super.field1332 * var13 + super.field1324 * var12 - -(super.field1338 * var16) >> 15) + super.field1327;
                        if (~var20 >= ~super.field1341.field4490) {
                            return;
                        }
                        var21 = (super.field1338 * var17 + super.field1324 * var12 - -(super.field1332 * var14) >> 15) + super.field1327;
                        if (~var21 >= ~super.field1341.field4490) {
                            return;
                        }
                        var22 = super.field1327 - -(super.field1332 * var14 + super.field1338 * var18 + super.field1324 * var11 >> 15);
                        if (super.field1341.field4490 >= var22) {
                            return;
                        }
                    } else {
                        var22 = super.field1330;
                        var21 = super.field1330;
                        var20 = super.field1330;
                        var19 = super.field1330;
                    }
                    var23 = super.field1333 - -(super.field1336 * var13 + (super.field1321 * var11 - -(super.field1325 * var15)) >> 15);
                    var24 = (super.field1334 * var15 + (super.field1340 * var11 - -(super.field1323 * var13)) >> 15) + super.field1337;
                    var25 = super.field1341.field4485 * var23 / var19 + arg0.field4987;
                    var26 = (super.field1325 * var16 + super.field1321 * var12 - -(super.field1336 * var13) >> 15) + super.field1333;
                    var27 = super.field1341.field4505 * var24 / var19 + arg0.field4992;
                    var28 = (super.field1340 * var12 + super.field1334 * var16 - -(super.field1323 * var13) >> 15) + super.field1337;
                    var29 = super.field1341.field4485 * var26 / var20 + arg0.field4987;
                    int var30 = (super.field1336 * var14 + (super.field1321 * var12 - -(super.field1325 * var17)) >> 15) + super.field1333;
                    var31 = super.field1341.field4505 * var28 / var20 + arg0.field4992;
                    var32 = super.field1341.field4485 * var30 / var21 + arg0.field4987;
                    int var33 = (super.field1323 * var14 + (super.field1340 * var12 - -(super.field1334 * var17)) >> 15) + super.field1337;
                    var34 = arg0.field4992 - -(super.field1341.field4505 * var33 / var21);
                    var35 = super.field1333 - -(super.field1336 * var14 + super.field1325 * var18 + super.field1321 * var11 >> 15);
                    var36 = (super.field1340 * var11 + super.field1334 * var18 + super.field1323 * var14 >> 15) + super.field1337;
                    var37 = super.field1341.field4485 * var35 / var22 + arg0.field4987;
                    var38 = super.field1341.field4505 * var36 / var22 + arg0.field4992;
                } else {
                    int var39 = super.field1322[arg6][arg3];
                    if (super.field1330 == -1) {
                        int var40 = super.field1338 * var39;
                        var19 = super.field1327 - -(super.field1324 * var11 + var40 - -(super.field1332 * var13) >> 15);
                        if (~super.field1341.field4490 <= ~var19) {
                            return;
                        }
                        var20 = (super.field1332 * var13 + super.field1324 * var12 + var40 >> 15) + super.field1327;
                        if (super.field1341.field4490 >= var20) {
                            return;
                        }
                        var21 = (super.field1332 * var14 + super.field1324 * var12 - -var40 >> 15) + super.field1327;
                        if (super.field1341.field4490 >= var21) {
                            return;
                        }
                        var22 = (super.field1332 * var14 + super.field1324 * var11 - -var40 >> 15) + super.field1327;
                        if (~super.field1341.field4490 <= ~var22) {
                            return;
                        }
                    } else {
                        var22 = super.field1330;
                        var21 = super.field1330;
                        var20 = super.field1330;
                        var19 = super.field1330;
                    }
                    int var41 = super.field1325 * var39;
                    var23 = (super.field1321 * var11 + var41 - -(super.field1336 * var13) >> 15) + super.field1333;
                    int var42 = super.field1334 * var39;
                    var24 = (super.field1340 * var11 + super.field1323 * var13 + var42 >> 15) + super.field1337;
                    var25 = arg0.field4987 - -(super.field1341.field4485 * var23 / var19);
                    var27 = super.field1341.field4505 * var24 / var19 + arg0.field4992;
                    var26 = super.field1333 - -(super.field1336 * var13 + super.field1321 * var12 - -var41 >> 15);
                    var28 = super.field1337 - -(super.field1340 * var12 + super.field1323 * var13 - -var42 >> 15);
                    var29 = super.field1341.field4485 * var26 / var20 + arg0.field4987;
                    var31 = super.field1341.field4505 * var28 / var20 + arg0.field4992;
                    int var43 = (super.field1336 * var14 + super.field1321 * var12 + var41 >> 15) + super.field1333;
                    var32 = super.field1341.field4485 * var43 / var21 + arg0.field4987;
                    int var44 = (super.field1340 * var12 + super.field1323 * var14 - -var42 >> 15) + super.field1337;
                    var35 = super.field1333 - -(super.field1336 * var14 + super.field1321 * var11 - -var41 >> 15);
                    var34 = super.field1341.field4505 * var44 / var21 + arg0.field4992;
                    var36 = super.field1337 - -(super.field1340 * var11 + super.field1323 * var14 + var42 >> 15);
                    var37 = super.field1341.field4485 * var35 / var22 + arg0.field4987;
                    var38 = super.field1341.field4505 * var36 / var22 + arg0.field4992;
                }
                if (~((var31 - var38) * (-var37 + var32) + -((var29 - var37) * (-var38 + var34))) < -1) {
                    arg0.field4989 = var32 < 0 || ~var37 > -1 || var29 < 0 || ~var32 < ~arg0.field4988 || var37 > arg0.field4988 || arg0.field4988 < var29;
                    if (var9.field7464 >= 0) {
                        if (this.method700(super.field1341.field2443.method2387((byte) 127, var9.field7464).field8203)) {
                            arg0.field4991 = 100;
                        }
                        arg0.method2107(var34, var38, var31, var32, var37, var29, 65535 & var9.field7462, var9.field7465 & 65535, 65535 & var9.field7468, var23, var26, var35, var24, var28, var36, var19, var20, var22, var9.field7464);
                        arg0.field4991 = 0;
                    } else {
                        arg0.method2116(var34, var38, var31, var32, var37, var29, var21, var22, var20, 65535 & var9.field7462, 65535 & var9.field7465, 65535 & var9.field7468);
                    }
                }
                if (~((-var29 + var25) * (-var31 + var38) - (var27 - var31) * (-var29 + var37)) < -1) {
                    arg0.field4989 = ~var25 > -1 || var29 < 0 || var37 < 0 || ~var25 < ~arg0.field4988 || ~arg0.field4988 > ~var29 || ~arg0.field4988 > ~var37;
                    if (~var9.field7464 > -1) {
                        arg0.method2116(var27, var31, var38, var25, var29, var37, var19, var20, var22, var9.field7467 & 65535, 65535 & var9.field7468, var9.field7465 & 65535);
                        return;
                    }
                    if (this.method700(super.field1341.field2443.method2387((byte) 127, var9.field7464).field8203)) {
                        arg0.field4991 = 100;
                    }
                    arg0.method2107(var27, var31, var38, var25, var29, var37, 65535 & var9.field7467, var9.field7468 & 65535, 65535 & var9.field7465, var23, var26, var35, var24, var28, var36, var19, var20, var22, var9.field7464);
                    arg0.field4991 = 0;
                }
            }
        } else {
            class160 var45 = super.field1329[arg6][arg3];
            if (var45 != null) {
                if (super.field1330 != -1) {
                    for (int var46 = 0; ~var46 > ~var45.field2383; ++var46) {
                        int var47 = var45.field2385[var46] - -(arg6 << super.field7537);
                        short var48 = var45.field2386[var46];
                        int var49 = (arg3 << super.field7537) + var45.field2391[var46];
                        int var50 = super.field1337 - -(super.field1340 * var47 + super.field1334 * var48 + super.field1323 * var49 >> 15);
                        int var51 = (super.field1321 * var47 + (super.field1325 * var48 - -(super.field1336 * var49)) >> 15) + super.field1333;
                        arg2[var46] = super.field1341.field4485 * var51 / super.field1330 + arg0.field4987;
                        arg4[var46] = super.field1341.field4505 * var50 / super.field1330 + arg0.field4992;
                        arg5[var46] = super.field1330;
                    }
                } else {
                    for (int var52 = 0; ~var45.field2383 < ~var52; ++var52) {
                        int var92 = (arg6 << super.field7537) + var45.field2385[var52];
                        short var93 = var45.field2386[var52];
                        int var94 = (arg3 << super.field7537) + var45.field2391[var52];
                        int var95 = (super.field1324 * var92 + super.field1338 * var93 + super.field1332 * var94 >> 15) + super.field1327;
                        if (~super.field1341.field4490 <= ~var95) {
                            return;
                        }
                        int var96 = (super.field1336 * var94 + (super.field1321 * var92 - -(super.field1325 * var93)) >> 15) + super.field1333;
                        int var97 = super.field1337 - -(super.field1340 * var92 + super.field1334 * var93 + super.field1323 * var94 >> 15);
                        arg2[var52] = arg0.field4987 - -(super.field1341.field4485 * var96 / var95);
                        arg4[var52] = super.field1341.field4505 * var97 / var95 + arg0.field4992;
                        arg5[var52] = var95;
                    }
                }
                if (var45.field2380 != null) {
                    int var53 = super.field1322[arg6][arg3];
                    int var54 = super.field1322[arg6 + 1][arg3];
                    int var55 = super.field1322[arg6][arg3 - -1];
                    int var56 = super.field7544 * arg6;
                    int var57 = super.field7544 + var56;
                    int var58 = super.field7544 * arg3;
                    int var59 = super.field7544 + var58;
                    int var60 = (super.field1325 * var53 + super.field1336 * var58 + super.field1321 * var56 >> 15) + super.field1333;
                    int var61 = (super.field1340 * var56 + super.field1323 * var58 - -(super.field1334 * var53) >> 15) + super.field1337;
                    int var62 = (super.field1332 * var58 + super.field1338 * var53 + super.field1324 * var56 >> 15) + super.field1327;
                    int var63 = (super.field1325 * var54 + (super.field1321 * var57 - -(super.field1336 * var58)) >> 15) + super.field1333;
                    int var64 = super.field1337 - -(super.field1340 * var57 - -(super.field1334 * var54) - -(super.field1323 * var58) >> 15);
                    int var65 = (super.field1332 * var58 + super.field1338 * var54 + super.field1324 * var57 >> 15) + super.field1327;
                    int var66 = (super.field1321 * var56 - -(super.field1325 * var55) - -(super.field1336 * var59) >> 15) + super.field1333;
                    int var67 = (super.field1323 * var59 + super.field1340 * var56 + super.field1334 * var55 >> 15) + super.field1337;
                    int var68 = super.field1327 - -(super.field1338 * var55 + super.field1332 * var59 + super.field1324 * var56 >> 15);
                    for (int var69 = 0; ~var45.field2384 < ~var69; ++var69) {
                        short var70 = var45.field2387[var69];
                        short var71 = var45.field2381[var69];
                        short var72 = var45.field2389[var69];
                        int var73 = arg2[var70];
                        int var74 = arg2[var71];
                        int var75 = arg2[var72];
                        int var76 = arg4[var70];
                        int var77 = arg4[var71];
                        int var78 = arg4[var72];
                        if (~((-var74 + var73) * (-var77 + var78) + -((var75 - var74) * (-var77 + var76))) < -1) {
                            arg0.field4989 = ~var73 > -1 || var74 < 0 || var75 < 0 || ~arg0.field4988 > ~var73 || var74 > arg0.field4988 || arg0.field4988 < var75;
                            short var79 = var45.field2380[var69];
                            if (~var79 == 0) {
                                int var80 = var45.field2382[var69];
                                if (var80 != -1) {
                                    arg0.method2116(var76, var77, var78, var73, var74, var75, arg5[1], arg5[2], arg5[3], class519.method2936((byte) 119, var80, var45.field2390[var70]), class519.method2936((byte) 124, var80, var45.field2390[var71]), class519.method2936((byte) 79, var80, var45.field2390[var72]));
                                }
                            } else {
                                if (this.method700(super.field1341.field2443.method2387((byte) 127, var79).field8203)) {
                                    arg0.field4991 = 100;
                                }
                                arg0.method2107(var76, var77, var78, var73, var74, var75, var45.field2390[var70], var45.field2390[var71], var45.field2390[var72], var60, var63, var66, var61, var64, var67, var62, var65, var68, var79);
                                arg0.field4991 = 0;
                            }
                        }
                    }
                } else {
                    for (int var81 = 0; ~var81 > ~var45.field2384; ++var81) {
                        short var82 = var45.field2387[var81];
                        short var83 = var45.field2381[var81];
                        short var84 = var45.field2389[var81];
                        int var85 = arg2[var82];
                        int var86 = arg2[var83];
                        int var87 = arg2[var84];
                        int var88 = arg4[var82];
                        int var89 = arg4[var83];
                        int var90 = arg4[var84];
                        if ((-var86 + var85) * (-var89 + var90) + -((var88 - var89) * (-var86 + var87)) > 0) {
                            int var91 = var45.field2382[var81];
                            if (var91 != -1) {
                                arg0.field4989 = var85 < 0 || var86 < 0 || var87 < 0 || ~var85 < ~arg0.field4988 || ~var86 < ~arg0.field4988 || ~arg0.field4988 > ~var87;
                                arg0.method2116(var88, var89, var90, var85, var86, var87, arg5[1], arg5[2], arg5[3], class519.method2936((byte) 99, var91, var45.field2390[var82]), class519.method2936((byte) 117, var91, var45.field2390[var83]), class519.method2936((byte) 80, var91, var45.field2390[var84]));
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(Lvda;IIII[[I[[II)V")
    public class557(class309 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "(I)V")
    public static void method3133(int arg0) {
        int var1 = -86 / ((arg0 - -10) / 38);
        field7878 = null;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(III[ILwq;IIIII[I[[Z)V")
    private final void method3134(int arg0, int arg1, int arg2, int[] arg3, class348 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int[] arg10, boolean[][] arg11) {
        ++field7882;
        int var13 = (arg8 - arg1) * arg2 / 256;
        arg4.field4981 = false;
        arg4.field4982 = false;
        int var14 = arg2 >> 8;
        int var15 = 94 / ((arg5 - 9) / 48);
        int var16 = arg6;
        int var17 = arg9 - -var13;
        for (int var18 = arg7; ~arg0 < ~var18; ++var18) {
            for (int var19 = arg1; ~arg8 < ~var19; ++var19) {
                if (arg11[var18 - arg7][var19 - arg1]) {
                    if (super.field1342[var18][var19] != null) {
                        class462 var20 = super.field1342[var18][var19];
                        if (~var20.field6683 != 0 && (2 & var20.field6688) == 0 && ~var20.field6691 == -1) {
                            int var21 = super.field1341.method1925(var20.field6683);
                            arg4.method2116(-var14 + var17, -var14 + var17, var17, var14 + var16, var16, var14 + var16, 0, 0, 0, class519.method2936((byte) 102, var21, var20.field6692), class519.method2936((byte) 94, var21, var20.field6687), class519.method2936((byte) 83, var21, var20.field6690));
                            arg4.method2116(var17, var17, -var14 + var17, var16, var14 + var16, var16, 0, 0, 0, class519.method2936((byte) 76, var21, var20.field6689), class519.method2936((byte) 97, var21, var20.field6690), class519.method2936((byte) 118, var21, var20.field6687));
                        } else if (var20.field6691 == 0) {
                            arg4.method2108(-var14 + var17, -var14 + var17, var17, var14 + var16, var16, var14 + var16, 0, 0, 0, var20.field6692, var20.field6687, var20.field6690);
                            arg4.method2108(var17, var17, var17 - var14, var16, var14 + var16, var16, 0, 0, 0, var20.field6689, var20.field6690, var20.field6687);
                        } else {
                            int var22 = var20.field6691;
                            arg4.method2108(-var14 + var17, -var14 + var17, var17, var14 + var16, var16, var16 - -var14, 0, 0, 0, class276.method1777((byte) 117, var20.field6692 & -16777216, var22), class276.method1777((byte) 84, var20.field6687 & -16777216, var22), class276.method1777((byte) 83, -16777216 & var20.field6690, var22));
                            arg4.method2108(var17, var17, -var14 + var17, var16, var16 - -var14, var16, 0, 0, 0, class276.method1777((byte) 88, -16777216 & var20.field6689, var22), class276.method1777((byte) 66, var20.field6690 & -16777216, var22), class276.method1777((byte) 119, var20.field6687 & -16777216, var22));
                        }
                    } else if (super.field1335[var18][var19] != null) {
                        class3 var23 = super.field1335[var18][var19];
                        for (int var24 = 0; ~var23.field26 < ~var24; ++var24) {
                            arg10[var24] = var23.field25[var24] * var14 / super.field7544 + var16;
                            arg3[var24] = -(var23.field22[var24] * var14 / super.field7544) + var17;
                        }
                        for (int var25 = 0; ~var25 > ~var23.field24; ++var25) {
                            int var26 = var25 * 3;
                            int var27 = var26 + 1;
                            int var28 = var27 + 1;
                            int var29 = arg10[var26];
                            int var30 = arg10[var27];
                            int var31 = arg10[var28];
                            int var32 = arg3[var26];
                            int var33 = arg3[var27];
                            int var34 = arg3[var28];
                            if (var23.field27 != null && ~var23.field27[var25] != -1 && (var23.field29 == null || var23.field29 != null && ~var23.field29[var25] == 0)) {
                                int var35 = var23.field27[var25];
                                arg4.method2108(var32, var33, var34, var29, var30, var31, 0, 0, 0, class276.method1777((byte) 115, -(-16777216 & var23.field28[var26]) + -16777216, var35), class276.method1777((byte) 90, -(-16777216 & var23.field28[var27]) + -16777216, var35), class276.method1777((byte) 106, -(var23.field28[var28] & -16777216) + -16777216, var35));
                            } else if (var23.field29 != null && var23.field29[var25] != -1) {
                                int var36 = super.field1341.method1925(var23.field29[var25]);
                                arg4.method2116(var32, var33, var34, var29, var30, var31, 0, 0, 0, var36, var36, var36);
                            } else {
                                arg4.method2108(var32, var33, var34, var29, var30, var31, 0, 0, 0, var23.field28[var26], var23.field28[var27], var23.field28[var28]);
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg9 + var13;
            var16 += var14;
        }
        arg4.field4982 = true;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(II[[Z[IILwq;III[III)V")
    private final void method3135(int arg0, int arg1, boolean[][] arg2, int[] arg3, int arg4, class348 arg5, int arg6, int arg7, int arg8, int[] arg9, int arg10, int arg11) {
        if (arg10 > -95) {
            field7877 = -122;
        }
        ++field7876;
        int var13 = (-arg11 + arg1) * arg7 / 256;
        arg5.field4981 = false;
        int var14 = arg7 >> 8;
        arg5.field4982 = false;
        int var15 = arg8;
        int var16 = arg6 + var13;
        for (int var17 = arg4; arg0 > var17; ++var17) {
            for (int var18 = arg11; ~arg1 < ~var18; ++var18) {
                if (arg2[-arg4 + var17][-arg11 + var18]) {
                    if (super.field1326[var17][var18] != null) {
                        class535 var19 = super.field1326[var17][var18];
                        if (~var19.field7464 != 0 && (var19.field7466 & 2) == 0 && var19.field7463 == -1) {
                            int var20 = super.field1341.method1925(var19.field7464);
                            arg5.method2116(-var14 + var16, -var14 + var16, var16, var14 + var15, var15, var14 + var15, 0, 0, 0, class519.method2936((byte) 75, var20, 65535 & var19.field7462), class519.method2936((byte) 98, var20, var19.field7465 & 65535), class519.method2936((byte) 124, var20, var19.field7468 & 65535));
                            arg5.method2116(var16, var16, -var14 + var16, var15, var14 + var15, var15, 0, 0, 0, class519.method2936((byte) 93, var20, 65535 & var19.field7467), class519.method2936((byte) 77, var20, var19.field7468 & 65535), class519.method2936((byte) 110, var20, var19.field7465 & 65535));
                        } else if (~var19.field7463 == 0) {
                            arg5.method2116(-var14 + var16, -var14 + var16, var16, var14 + var15, var15, var15 - -var14, 0, 0, 0, var19.field7462 & 65535, 65535 & var19.field7465, 65535 & var19.field7468);
                            arg5.method2116(var16, var16, -var14 + var16, var15, var15 - -var14, var15, 0, 0, 0, var19.field7467 & 65535, 65535 & var19.field7468, var19.field7465 & 65535);
                        } else {
                            int var21 = var19.field7463;
                            arg5.method2116(-var14 + var16, var16 - var14, var16, var14 + var15, var15, var14 + var15, 0, 0, 0, var21, var21, var21);
                            arg5.method2116(var16, var16, -var14 + var16, var15, var14 + var15, var15, 0, 0, 0, var21, var21, var21);
                        }
                    } else if (super.field1329[var17][var18] != null) {
                        class160 var22 = super.field1329[var17][var18];
                        for (int var23 = 0; var22.field2383 > var23; ++var23) {
                            arg3[var23] = var22.field2385[var23] * var14 / super.field7544 + var15;
                            arg9[var23] = -(var22.field2391[var23] * var14 / super.field7544) + var16;
                        }
                        for (int var24 = 0; ~var22.field2384 < ~var24; ++var24) {
                            short var25 = var22.field2387[var24];
                            short var26 = var22.field2381[var24];
                            short var27 = var22.field2389[var24];
                            int var28 = arg3[var25];
                            int var29 = arg3[var26];
                            int var30 = arg3[var27];
                            int var31 = arg9[var25];
                            int var32 = arg9[var26];
                            int var33 = arg9[var27];
                            if (var22.field2388 != null && var22.field2388[var24] != -1) {
                                int var34 = var22.field2388[var24];
                                arg5.method2116(var31, var32, var33, var28, var29, var30, 0, 0, 0, class519.method2936((byte) 74, var34, var22.field2390[var25]), class519.method2936((byte) 115, var34, var22.field2390[var26]), class519.method2936((byte) 117, var34, var22.field2390[var27]));
                            } else if (var22.field2380 != null && var22.field2380[var24] != -1) {
                                int var35 = super.field1341.method1925(var22.field2380[var24]);
                                arg5.method2116(var31, var32, var33, var28, var29, var30, 0, 0, 0, class519.method2936((byte) 88, var35, var22.field2390[var25]), class519.method2936((byte) 102, var35, var22.field2390[var26]), class519.method2936((byte) 86, var35, var22.field2390[var27]));
                            } else {
                                int var36 = var22.field2382[var24];
                                arg5.method2116(var31, var32, var33, var28, var29, var30, 0, 0, 0, class519.method2936((byte) 89, var36, var22.field2390[var25]), class519.method2936((byte) 90, var36, var22.field2390[var26]), class519.method2936((byte) 120, var36, var22.field2390[var27]));
                            }
                        }
                    }
                }
                var16 -= var14;
            }
            var16 = arg6 - -var13;
            var15 += var14;
        }
        arg5.field4982 = true;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(BLwq;I[I[I[IIZ[I)V")
    private final void method3136(byte arg0, class348 arg1, int arg2, int[] arg3, int[] arg4, int[] arg5, int arg6, boolean arg7, int[] arg8) {
        if (arg0 == -75) {
            ++field7879;
            class462 var10 = super.field1342[arg6][arg2];
            if (var10 != null) {
                if ((2 & var10.field6688) == 0) {
                    int var11 = super.field7544 * arg6;
                    int var12 = super.field7544 + var11;
                    int var13 = super.field7544 * arg2;
                    int var14 = super.field7544 + var13;
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
                    if (~(1 & var10.field6688) != -1 && !arg7) {
                        int var19 = super.field1322[arg6][arg2];
                        if (~super.field1330 != 0) {
                            var20 = super.field1330;
                            var21 = super.field1330;
                            var22 = super.field1330;
                            var23 = super.field1330;
                        } else {
                            int var24 = super.field1338 * var19;
                            var23 = super.field1327 - -(super.field1324 * var11 + super.field1332 * var13 + var24 >> 15);
                            if (~super.field1341.field4490 <= ~var23) {
                                return;
                            }
                            var22 = super.field1327 - -(super.field1324 * var12 - -(super.field1332 * var13) + var24 >> 15);
                            if (~super.field1341.field4490 <= ~var22) {
                                return;
                            }
                            var21 = (super.field1324 * var12 - (-var24 - super.field1332 * var14) >> 15) + super.field1327;
                            if (super.field1341.field4490 >= var21) {
                                return;
                            }
                            var20 = (super.field1332 * var14 + super.field1324 * var11 + var24 >> 15) + super.field1327;
                            if (super.field1341.field4490 >= var20) {
                                return;
                            }
                        }
                        if (super.field1341.field4498) {
                            int var25 = var23 - super.field1341.field4496;
                            if (var25 > 0) {
                                var15 = var25;
                                if (~var25 < -256) {
                                    var15 = 255;
                                }
                            }
                            int var26 = -super.field1341.field4496 + var22;
                            if (~var26 < -1) {
                                var16 = var26;
                                if (~var26 < -256) {
                                    var16 = 255;
                                }
                            }
                            int var27 = -super.field1341.field4496 + var21;
                            if (~var27 < -1) {
                                var17 = var27;
                                if (~var27 < -256) {
                                    var17 = 255;
                                }
                            }
                            int var28 = var20 - super.field1341.field4496;
                            if (~var28 < -1) {
                                var18 = var28;
                                if (~var28 < -256) {
                                    var18 = 255;
                                }
                            }
                        }
                        int var29 = super.field1325 * var19;
                        int var30 = super.field1334 * var19;
                        var31 = (super.field1321 * var11 + var29 - -(super.field1336 * var13) >> 15) + super.field1333;
                        var32 = (super.field1323 * var13 + super.field1340 * var11 + var30 >> 15) + super.field1337;
                        var33 = super.field1341.field4485 * var31 / var23 + arg1.field4987;
                        var34 = (super.field1321 * var12 + var29 - -(super.field1336 * var13) >> 15) + super.field1333;
                        var35 = super.field1341.field4505 * var32 / var23 + arg1.field4992;
                        var36 = (super.field1340 * var12 + super.field1323 * var13 - -var30 >> 15) + super.field1337;
                        var37 = super.field1341.field4485 * var34 / var22 + arg1.field4987;
                        var38 = super.field1341.field4505 * var36 / var22 + arg1.field4992;
                        var39 = (super.field1336 * var14 + super.field1321 * var12 + var29 >> 15) + super.field1333;
                        var40 = super.field1337 - -(super.field1323 * var14 + (super.field1340 * var12 - -var30) >> 15);
                        var41 = super.field1341.field4485 * var39 / var21 + arg1.field4987;
                        var42 = (super.field1321 * var11 - (-(super.field1336 * var14) + -var29) >> 15) + super.field1333;
                        var43 = arg1.field4992 - -(super.field1341.field4505 * var40 / var21);
                        var44 = super.field1341.field4485 * var42 / var20 + arg1.field4987;
                        var45 = (super.field1323 * var14 + super.field1340 * var11 + var30 >> 15) + super.field1337;
                        var46 = super.field1341.field4505 * var45 / var20 + arg1.field4992;
                    } else {
                        int var47 = super.field1322[arg6][arg2];
                        int var48 = super.field1322[arg6 - -1][arg2];
                        int var49 = super.field1322[arg6 - -1][arg2 - -1];
                        int var50 = super.field1322[arg6][arg2 + 1];
                        if (super.field1330 == -1) {
                            var23 = (super.field1338 * var47 + super.field1332 * var13 + super.field1324 * var11 >> 15) + super.field1327;
                            if (~super.field1341.field4490 <= ~var23) {
                                return;
                            }
                            var22 = (super.field1332 * var13 + super.field1338 * var48 + super.field1324 * var12 >> 15) + super.field1327;
                            if (var22 <= super.field1341.field4490) {
                                return;
                            }
                            var21 = (super.field1324 * var12 + super.field1338 * var49 + super.field1332 * var14 >> 15) + super.field1327;
                            if (var21 <= super.field1341.field4490) {
                                return;
                            }
                            var20 = (super.field1332 * var14 + super.field1338 * var50 + super.field1324 * var11 >> 15) + super.field1327;
                            if (var20 <= super.field1341.field4490) {
                                return;
                            }
                        } else {
                            var20 = super.field1330;
                            var21 = super.field1330;
                            var22 = super.field1330;
                            var23 = super.field1330;
                        }
                        if (arg7) {
                            int var51 = var23 - super.field1341.field4496;
                            if (~var51 < -256) {
                                var51 = 255;
                            }
                            if (~var51 < -1) {
                                var15 = var51;
                                int var52 = var10.field6686 * var51 / 255;
                                if (var52 > 0) {
                                    var47 -= var52;
                                }
                            }
                            int var53 = -super.field1341.field4496 + var22;
                            if (var53 > 255) {
                                var53 = 255;
                            }
                            if (var53 > 0) {
                                var16 = var53;
                                int var54 = var10.field6685 * var53 / 255;
                                if (var54 > 0) {
                                    var48 -= var54;
                                }
                            }
                            int var55 = -super.field1341.field4496 + var21;
                            if (var55 > 255) {
                                var55 = 255;
                            }
                            if (var55 > 0) {
                                var17 = var55;
                                int var56 = var10.field6693 * var55 / 255;
                                if (~var56 < -1) {
                                    var49 -= var56;
                                }
                            }
                            int var57 = var20 - super.field1341.field4496;
                            if (~var57 < -256) {
                                var57 = 255;
                            }
                            if (var57 > 0) {
                                var18 = var57;
                                int var58 = var10.field6684 * var57 / 255;
                                if (var58 > 0) {
                                    var50 -= var58;
                                }
                            }
                        } else if (super.field1341.field4498) {
                            int var59 = -super.field1341.field4496 + var23;
                            if (~var59 < -1) {
                                var15 = var59;
                                if (~var59 < -256) {
                                    var15 = 255;
                                }
                            }
                            int var60 = -super.field1341.field4496 + var22;
                            if (~var60 < -1) {
                                var16 = var60;
                                if (~var60 < -256) {
                                    var16 = 255;
                                }
                            }
                            int var61 = -super.field1341.field4496 + var21;
                            if (var61 > 0) {
                                var17 = var61;
                                if (~var61 < -256) {
                                    var17 = 255;
                                }
                            }
                            int var62 = -super.field1341.field4496 + var20;
                            if (~var62 < -1) {
                                var18 = var62;
                                if (var62 > 255) {
                                    var18 = 255;
                                }
                            }
                        }
                        var31 = (super.field1325 * var47 + super.field1336 * var13 + super.field1321 * var11 >> 15) + super.field1333;
                        var32 = (super.field1340 * var11 - (-(super.field1334 * var47) - super.field1323 * var13) >> 15) + super.field1337;
                        var33 = super.field1341.field4485 * var31 / var23 + arg1.field4987;
                        var35 = super.field1341.field4505 * var32 / var23 + arg1.field4992;
                        var34 = super.field1333 - -(super.field1336 * var13 + super.field1325 * var48 + super.field1321 * var12 >> 15);
                        var37 = super.field1341.field4485 * var34 / var22 + arg1.field4987;
                        var36 = (super.field1334 * var48 + super.field1340 * var12 + super.field1323 * var13 >> 15) + super.field1337;
                        var39 = (super.field1336 * var14 + (super.field1321 * var12 - -(super.field1325 * var49)) >> 15) + super.field1333;
                        var38 = arg1.field4992 - -(super.field1341.field4505 * var36 / var22);
                        var41 = arg1.field4987 - -(super.field1341.field4485 * var39 / var21);
                        var40 = (super.field1334 * var49 + super.field1340 * var12 + super.field1323 * var14 >> 15) + super.field1337;
                        var42 = (super.field1321 * var11 + super.field1336 * var14 + super.field1325 * var50 >> 15) + super.field1333;
                        var43 = arg1.field4992 - -(super.field1341.field4505 * var40 / var21);
                        var44 = arg1.field4987 - -(super.field1341.field4485 * var42 / var20);
                        var45 = (super.field1340 * var11 - (-(super.field1334 * var50) + -(super.field1323 * var14)) >> 15) + super.field1337;
                        var46 = arg1.field4992 - -(super.field1341.field4505 * var45 / var20);
                    }
                    boolean var63 = ~var10.field6683 != 0 && this.method700(super.field1341.field2443.method2387((byte) 127, var10.field6683).field8203);
                    int var64 = var17 + var18 + var16;
                    if ((-var44 + var41) * (-var46 + var38) + -((-var44 + var37) * (-var46 + var43)) > 0) {
                        arg1.field4989 = ~var41 > -1 || var44 < 0 || var37 < 0 || ~var41 < ~arg1.field4988 || var44 > arg1.field4988 || ~arg1.field4988 > ~var37;
                        if (~var64 > -766) {
                            if (var63) {
                                arg1.field4991 = 100;
                            }
                            if (var64 > 0) {
                                if (~var10.field6683 > -1) {
                                    arg1.method2108(var43, var46, var38, var41, var44, var37, var21, var20, var22, class276.method1777((byte) 76, var17 << 24 | super.field1341.field4500, var10.field6692), class276.method1777((byte) 99, super.field1341.field4500 | var18 << 24, var10.field6687), class276.method1777((byte) 68, var16 << 24 | super.field1341.field4500, var10.field6690));
                                } else {
                                    arg1.method2111(var43, var46, var38, var41, var44, var37, var21, var20, var22, super.field1341.field4500, var17, var18, var16, var10.field6692, var10.field6687, var10.field6690, var39, var42, var34, var40, var45, var36, var21, var20, var22, var10.field6683);
                                }
                            } else if (var10.field6683 >= 0) {
                                arg1.method2107(var43, var46, var38, var41, var44, var37, var10.field6692, var10.field6687, var10.field6690, var39, var42, var34, var40, var45, var36, var21, var20, var22, var10.field6683);
                            } else {
                                arg1.method2108(var43, var46, var38, var41, var44, var37, var21, var20, var22, var10.field6692, var10.field6687, var10.field6690);
                            }
                            arg1.field4991 = 0;
                        } else {
                            arg1.method2115(var43, var46, var38, var41, var44, var37, var21, var20, var22, super.field1341.field4500);
                        }
                    }
                    int var65 = var15 + var16 + var18;
                    if (~((var33 - var37) * (-var38 + var46) + -((var44 - var37) * (-var38 + var35))) < -1) {
                        arg1.field4989 = var33 < 0 || ~var37 > -1 || var44 < 0 || ~arg1.field4988 > ~var33 || var37 > arg1.field4988 || var44 > arg1.field4988;
                        if (var65 >= 765) {
                            arg1.method2115(var35, var38, var46, var33, var37, var44, var23, var22, var20, super.field1341.field4500);
                            return;
                        }
                        if (var63) {
                            arg1.field4991 = 100;
                        }
                        if (~var65 < -1) {
                            if (var10.field6683 >= 0) {
                                arg1.method2111(var35, var38, var46, var33, var37, var44, var23, var22, var20, super.field1341.field4500, var15, var16, var18, var10.field6689, var10.field6690, var10.field6687, var31, var34, var42, var32, var36, var45, var23, var22, var20, var10.field6683);
                            } else {
                                arg1.method2108(var35, var38, var46, var33, var37, var44, var23, var22, var20, class276.method1777((byte) 108, var15 << 24 | super.field1341.field4500, var10.field6689), class276.method1777((byte) 126, super.field1341.field4500 | var16 << 24, var10.field6690), class276.method1777((byte) 80, super.field1341.field4500 | var18 << 24, var10.field6687));
                            }
                        } else if (~var10.field6683 > -1) {
                            arg1.method2108(var35, var38, var46, var33, var37, var44, var23, var22, var20, var10.field6689, var10.field6690, var10.field6687);
                        } else {
                            arg1.method2107(var35, var38, var46, var33, var37, var44, var10.field6689, var10.field6690, var10.field6687, var31, var34, var42, var32, var36, var45, var23, var22, var20, var10.field6683);
                        }
                        arg1.field4991 = 0;
                    }
                }
            } else {
                class3 var66 = super.field1335[arg6][arg2];
                if (var66 != null) {
                    if (~super.field1330 == 0) {
                        for (int var67 = 0; ~var66.field26 < ~var67; ++var67) {
                            int var68 = var66.field25[var67] - -(arg6 << super.field7537);
                            int var69 = var66.field21[var67];
                            int var70 = (arg2 << super.field7537) + var66.field22[var67];
                            int var71 = (super.field1324 * var68 - -(super.field1338 * var69) - -(super.field1332 * var70) >> 15) + super.field1327;
                            if (~super.field1341.field4490 <= ~var71) {
                                return;
                            }
                            arg5[var67] = 0;
                            if (arg7) {
                                int var72 = var71 - super.field1341.field4496;
                                if (~var72 < -256) {
                                    var72 = 255;
                                }
                                if (~var72 < -1) {
                                    arg5[var67] = var72;
                                    int var73 = var66.field30[var67] * var72 / 255;
                                    if (var73 > 0) {
                                        var69 -= var73;
                                    }
                                }
                            } else if (super.field1341.field4498) {
                                int var74 = -super.field1341.field4496 + var71;
                                if (~var74 < -1) {
                                    arg5[var67] = var74;
                                    if (arg5[var67] > 255) {
                                        arg5[var67] = 255;
                                    }
                                }
                            }
                            int var75 = (super.field1321 * var68 + (super.field1325 * var69 - -(super.field1336 * var70)) >> 15) + super.field1333;
                            int var76 = super.field1337 - -(super.field1323 * var70 + super.field1340 * var68 + super.field1334 * var69 >> 15);
                            arg3[var67] = super.field1341.field4485 * var75 / var71 + arg1.field4987;
                            arg4[var67] = super.field1341.field4505 * var76 / var71 + arg1.field4992;
                            arg8[var67] = var71;
                        }
                    } else {
                        for (int var77 = 0; var77 < var66.field26; ++var77) {
                            int var117 = (arg6 << super.field7537) + var66.field25[var77];
                            int var118 = var66.field21[var77];
                            int var119 = (arg2 << super.field7537) + var66.field22[var77];
                            arg5[var77] = 0;
                            if (!arg7) {
                                if (super.field1341.field4498) {
                                    int var120 = -super.field1341.field4496 + super.field1330;
                                    if (var120 > 0) {
                                        arg5[var77] = var120;
                                        if (arg5[var77] > 255) {
                                            arg5[var77] = 255;
                                        }
                                    }
                                }
                            } else {
                                int var121 = super.field1330 - super.field1341.field4496;
                                if (~var121 < -256) {
                                    var121 = 255;
                                }
                                if (var121 > 0) {
                                    arg5[var77] = var121;
                                    int var122 = var66.field30[var77] * var121 / 255;
                                    if (~var122 < -1) {
                                        var118 -= var122;
                                    }
                                }
                            }
                            int var123 = (super.field1321 * var117 + (super.field1325 * var118 - -(super.field1336 * var119)) >> 15) + super.field1333;
                            int var124 = (super.field1323 * var119 + super.field1340 * var117 + super.field1334 * var118 >> 15) + super.field1337;
                            arg3[var77] = super.field1341.field4485 * var123 / super.field1330 + arg1.field4987;
                            arg4[var77] = super.field1341.field4505 * var124 / super.field1330 + arg1.field4992;
                            arg8[var77] = super.field1330;
                        }
                    }
                    if (var66.field29 != null) {
                        int var78 = super.field1322[arg6][arg2];
                        int var79 = super.field1322[arg6 + 1][arg2];
                        int var80 = super.field1322[arg6][arg2 + 1];
                        int var81 = super.field7544 * arg6;
                        int var82 = super.field7544 + var81;
                        int var83 = super.field7544 * arg2;
                        int var84 = var83 - -super.field7544;
                        int var85 = (super.field1321 * var81 + super.field1336 * var83 + super.field1325 * var78 >> 15) + super.field1333;
                        int var86 = (super.field1323 * var83 + super.field1340 * var81 + super.field1334 * var78 >> 15) + super.field1337;
                        int var87 = (super.field1324 * var81 + super.field1338 * var78 + super.field1332 * var83 >> 15) + super.field1327;
                        int var88 = super.field1333 - -(super.field1325 * var79 + super.field1321 * var82 - -(super.field1336 * var83) >> 15);
                        int var89 = super.field1337 - -(super.field1340 * var82 + super.field1334 * var79 + super.field1323 * var83 >> 15);
                        int var90 = (super.field1324 * var82 + (super.field1338 * var79 - -(super.field1332 * var83)) >> 15) + super.field1327;
                        int var91 = (super.field1325 * var80 + super.field1336 * var84 + super.field1321 * var81 >> 15) + super.field1333;
                        int var92 = (super.field1323 * var84 + super.field1340 * var81 + super.field1334 * var80 >> 15) + super.field1337;
                        int var93 = super.field1327 - -(super.field1324 * var81 + super.field1338 * var80 + super.field1332 * var84 >> 15);
                        for (int var94 = 0; ~var66.field24 < ~var94; ++var94) {
                            int var95 = var94 * 3;
                            int var96 = var95 - -1;
                            int var97 = var96 + 1;
                            int var98 = arg3[var95];
                            int var99 = arg3[var96];
                            int var100 = arg3[var97];
                            int var101 = arg4[var95];
                            int var102 = arg4[var96];
                            int var103 = arg4[var97];
                            int var104 = arg5[var95] + arg5[var97] + arg5[var96];
                            if ((var98 - var99) * (-var102 + var103) + -((var101 - var102) * (-var99 + var100)) > 0) {
                                arg1.field4989 = var98 < 0 || ~var99 > -1 || ~var100 > -1 || ~var98 < ~arg1.field4988 || ~var99 < ~arg1.field4988 || arg1.field4988 < var100;
                                short var105 = var66.field29[var94];
                                if (var104 < 765) {
                                    if (var105 != -1 && this.method700(super.field1341.field2443.method2387((byte) 127, var105).field8203)) {
                                        arg1.field4991 = 100;
                                    }
                                    if (~var104 >= -1) {
                                        if (var105 == -1) {
                                            if (~(var66.field28[var95] & 16777215) != -1) {
                                                arg1.method2108(var101, var102, var103, var98, var99, var100, arg8[var95], arg8[var96], arg8[var97], var66.field28[var95], var66.field28[var96], var66.field28[var97]);
                                            }
                                        } else {
                                            arg1.method2107(var101, var102, var103, var98, var99, var100, var66.field28[var95], var66.field28[var96], var66.field28[var97], var85, var88, var91, var86, var89, var92, var87, var90, var93, var105);
                                        }
                                    } else if (var105 == -1) {
                                        if (~(16777215 & var66.field28[var95]) != -1) {
                                            arg1.method2108(var101, var102, var103, var98, var99, var100, arg8[var95], arg8[var96], arg8[var97], class276.method1777((byte) 101, arg5[var95] << 24 | super.field1341.field4500, var66.field28[var95]), class276.method1777((byte) 98, arg5[var96] << 24 | super.field1341.field4500, var66.field28[var96]), class276.method1777((byte) 83, arg5[var97] << 24 | super.field1341.field4500, var66.field28[var97]));
                                        }
                                    } else {
                                        arg1.method2111(var101, var102, var103, var98, var99, var100, arg8[var95], arg8[var96], arg8[var97], super.field1341.field4500, arg5[var95], arg5[var96], arg5[var97], var66.field28[var95], var66.field28[var96], var66.field28[var97], var85, var88, var91, var86, var89, var92, var87, var90, var93, var105);
                                    }
                                    arg1.field4991 = 0;
                                } else {
                                    arg1.method2115(var101, var102, var103, var98, var99, var100, arg8[var95], arg8[var96], arg8[var97], super.field1341.field4500);
                                }
                            }
                        }
                    } else {
                        for (int var106 = 0; var106 < var66.field24; ++var106) {
                            int var107 = var106 * 3;
                            int var108 = var107 + 1;
                            int var109 = var108 + 1;
                            int var110 = arg3[var107];
                            int var111 = arg3[var108];
                            int var112 = arg3[var109];
                            int var113 = arg4[var107];
                            int var114 = arg4[var108];
                            int var115 = arg4[var109];
                            int var116 = arg5[var107] + arg5[var109] + arg5[var108];
                            if (~((-var111 + var110) * (-var114 + var115) + -((-var111 + var112) * (-var114 + var113))) < -1) {
                                arg1.field4989 = ~var110 > -1 || var111 < 0 || ~var112 > -1 || var110 > arg1.field4988 || ~arg1.field4988 > ~var111 || ~arg1.field4988 > ~var112;
                                if (~var116 <= -766) {
                                    arg1.method2115(var113, var114, var115, var110, var111, var112, arg8[var107], arg8[var108], arg8[var109], super.field1341.field4500);
                                } else if (var116 <= 0) {
                                    if (~(16777215 & var66.field28[var107]) != -1) {
                                        arg1.method2108(var113, var114, var115, var110, var111, var112, arg8[var107], arg8[var108], arg8[var109], var66.field28[var107], var66.field28[var108], var66.field28[var109]);
                                    }
                                } else if (~(var66.field28[var107] & 16777215) != -1) {
                                    arg1.method2108(var113, var114, var115, var110, var111, var112, arg8[var107], arg8[var108], arg8[var109], class481.method2772(var66.field28[var107], arg5[var107], super.field1341.field4500, arg0 ^ 38), class481.method2772(var66.field28[var108], arg5[var108], super.field1341.field4500, 56), class481.method2772(var66.field28[var109], arg5[var109], super.field1341.field4500, 21));
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
