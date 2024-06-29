import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ega")
public class class667 extends class437 {

    @OriginalMember(owner = "client!ega", name = "ub", descriptor = "Z")
    public boolean field9463 = true;

    @OriginalMember(owner = "client!ega", name = "Gb", descriptor = "Lff;")
    public static class9 field9475 = new class9(1);

    @OriginalMember(owner = "client!ega", name = "qb", descriptor = "I")
    public static int field9459;

    @OriginalMember(owner = "client!ega", name = "rb", descriptor = "I")
    public static int field9460;

    @OriginalMember(owner = "client!ega", name = "sb", descriptor = "I")
    public static int field9461;

    @OriginalMember(owner = "client!ega", name = "tb", descriptor = "I")
    public static int field9462;

    @OriginalMember(owner = "client!ega", name = "vb", descriptor = "I")
    public static int field9464;

    @OriginalMember(owner = "client!ega", name = "wb", descriptor = "I")
    private int field9465;

    @OriginalMember(owner = "client!ega", name = "xb", descriptor = "I")
    public static int field9466;

    @OriginalMember(owner = "client!ega", name = "yb", descriptor = "I")
    public static int field9467;

    @OriginalMember(owner = "client!ega", name = "zb", descriptor = "I")
    private int field9468;

    @OriginalMember(owner = "client!ega", name = "Ab", descriptor = "I")
    public static int field9469;

    @OriginalMember(owner = "client!ega", name = "Bb", descriptor = "I")
    public static int field9470;

    @OriginalMember(owner = "client!ega", name = "Cb", descriptor = "I")
    public static int field9471;

    @OriginalMember(owner = "client!ega", name = "Db", descriptor = "I")
    public static int field9472;

    @OriginalMember(owner = "client!ega", name = "Eb", descriptor = "I")
    public static int field9473;

    @OriginalMember(owner = "client!ega", name = "Fb", descriptor = "I")
    public static int field9474;

    @OriginalMember(owner = "client!ega", name = "Ib", descriptor = "I")
    public static int field9477;

    @OriginalMember(owner = "client!ega", name = "Jb", descriptor = "I")
    public static int field9478;

    @OriginalMember(owner = "client!ega", name = "Kb", descriptor = "I")
    public static int field9479;

    @OriginalMember(owner = "client!ega", name = "Lb", descriptor = "I")
    public static int field9480;

    @OriginalMember(owner = "client!ega", name = "Mb", descriptor = "I")
    public static int field9481;

    @OriginalMember(owner = "client!ega", name = "Nb", descriptor = "I")
    public static int field9482;

    @OriginalMember(owner = "client!ega", name = "Ob", descriptor = "I")
    public static int field9483;

    @OriginalMember(owner = "client!ega", name = "Pb", descriptor = "I")
    public static int field9484;

    @OriginalMember(owner = "client!ega", name = "Qb", descriptor = "I")
    public static int field9485;

    @OriginalMember(owner = "client!ega", name = "Hb", descriptor = "[I")
    public int[] field9476;

    @OriginalMember(owner = "client!ega", name = "b", descriptor = "()V", line = 4)
    public final void method107() {
        ++field9480;
        if (super.field5975 == null) {
            super.field5986 = null;
            super.field5995 = 1;
            super.field5996 = 1;
        } else {
            super.field5986 = super.field5979.field2221;
            super.field5995 = super.field5979.field2223;
            super.field5996 = super.field5979.field2220;
        }
        super.field5997 = null;
        this.method2486();
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(Lxa;Z)V", line = 27)
    public final void method80(class468 arg0, boolean arg1) {
        ++field9484;
        if (arg0 instanceof class622) {
            class622 var3 = (class622) arg0;
            super.field5997 = arg0;
            super.field5995 = var3.field4090;
            super.field5986 = var3.field8241;
            super.field5996 = var3.field4083;
        } else {
            if (!(arg0 instanceof class35)) {
                throw new RuntimeException();
            }
            class35 var4 = (class35) arg0;
            super.field5997 = arg0;
            super.field5996 = var4.field4083;
            super.field5995 = var4.field4090;
            super.field5986 = var4.field533;
        }
        this.method2486();
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(IIIIIIILbe;II)V", line = 58)
    private final void method3751(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class35 arg7, int arg8, int arg9) {
        ++field9466;
        if (arg2 > 0 && arg9 > 0) {
            int var11 = arg1 << 8;
            int var12 = 0;
            int var13 = 0;
            int var14 = arg7.field4099 + arg7.field4090 + arg7.field4091;
            if (arg5 != 15591) {
                this.method370((Canvas) null);
            }
            int var15 = arg7.field4102 + arg7.field4083 + arg7.field4087;
            int var16 = (var14 << 16) / arg2;
            if (~arg7.field4099 < -1) {
                int var17 = ((arg7.field4099 << 16) - -var16 + -1) / var16;
                arg0 += var17;
                var12 += var16 * var17 + -(arg7.field4099 << 16);
            }
            int var18 = (var15 << 16) / arg9;
            if (arg7.field4087 > 0) {
                int var19 = ((arg7.field4087 << 16) + var18 + -1) / var18;
                arg6 += var19;
                var13 += var18 * var19 - (arg7.field4087 << 16);
            }
            if (~var14 < ~arg7.field4090) {
                arg2 = ((arg7.field4090 << 16) - 1 + -var12 + var16) / var16;
            }
            if (~arg7.field4083 > ~var15) {
                arg9 = (var18 - 1 + (arg7.field4083 << 16) + -var13) / var18;
            }
            int var20 = super.field5995 * arg6 + arg0;
            int var21 = -arg2 + super.field5995;
            if (~(arg6 + arg9) < ~super.field6001) {
                arg9 -= arg6 + arg9 + -super.field6001;
            }
            if (arg6 < super.field5985) {
                int var22 = super.field5985 - arg6;
                var20 += super.field5995 * var22;
                var13 += var18 * var22;
                arg9 -= var22;
            }
            if (~super.field6014 > ~(arg0 + arg2)) {
                int var23 = arg0 + arg2 - super.field6014;
                arg2 -= var23;
                var21 += var23;
            }
            if (super.field5999 > arg0) {
                int var24 = super.field5999 - arg0;
                var12 += var16 * var24;
                var20 += var24;
                arg2 -= var24;
                var21 += var24;
            }
            if (arg4 != 0) {
                if (arg4 == 1) {
                    if (~arg3 == -2) {
                        int var25 = var12;
                        for (int var26 = -arg9; var26 < 0; ++var26) {
                            int var27 = (var13 >> 16) * arg7.field4090;
                            var13 += var18;
                            for (int var28 = -arg2; ~var28 > -1; ++var28) {
                                if (this.field9476[var20] > var11) {
                                    int var29 = arg7.field533[(var12 >> 16) + var27];
                                    int var30 = var29 >>> 24;
                                    int var31 = -var30 + 256;
                                    int var32 = super.field5986[var20];
                                    super.field5986[var20] = class571.method3139(-65281, class571.method3139(16711935, var32) * var31 + class571.method3139(var29, 16711935) * var30 >> 8) + class571.method3139(var30 * (class571.method3139(-16711936, var29) >>> 8) - -(class571.method3139(16711935, var32 >>> 8) * var31), -16711936);
                                }
                                var12 += var16;
                                ++var20;
                            }
                            var12 = var25;
                            var20 += var21;
                        }
                    } else if (~arg3 == -1) {
                        int var33 = var12;
                        if (~(16777215 & arg8) == -16777216) {
                            for (int var34 = -arg9; ~var34 > -1; ++var34) {
                                int var35 = (var13 >> 16) * arg7.field4090;
                                for (int var36 = -arg2; ~var36 > -1; ++var36) {
                                    if (var11 < this.field9476[var20]) {
                                        int var37 = arg7.field533[(var12 >> 16) - -var35];
                                        int var38 = (arg8 >>> 24) * (var37 >>> 24) >> 8;
                                        int var39 = -var38 + 256;
                                        int var40 = super.field5986[var20];
                                        super.field5986[var20] = class571.method3139(var38 * class571.method3139(16711935, var37) - -(var39 * class571.method3139(16711935, var40)), -16711936) + class571.method3139(16711680, var39 * class571.method3139(65280, var40) + class571.method3139(65280, var37) * var38) >> 8;
                                    }
                                    ++var20;
                                    var12 += var16;
                                }
                                var13 += var18;
                                var12 = var33;
                                var20 += var21;
                            }
                        } else {
                            int var41 = (16711680 & arg8) >> 16;
                            int var42 = (65280 & arg8) >> 8;
                            int var43 = 255 & arg8;
                            for (int var44 = -arg9; var44 < 0; ++var44) {
                                int var45 = (var13 >> 16) * arg7.field4090;
                                for (int var46 = -arg2; ~var46 > -1; ++var46) {
                                    if (this.field9476[var20] > var11) {
                                        int var47 = arg7.field533[(var12 >> 16) + var45];
                                        int var48 = (arg8 >>> 24) * (var47 >>> 24) >> 8;
                                        int var49 = -var48 + 256;
                                        if (var48 == 255) {
                                            int var50 = -16777216 & (16711680 & var47) * var41;
                                            int var51 = (var47 & 65280) * var42 & 16711680;
                                            int var52 = (255 & var47) * var43 & 65280;
                                            super.field5986[var20] = class220.method1393(var52, class220.method1393(var51, var50)) >>> 8;
                                        } else {
                                            int var53 = (16711680 & var47) * var41 & -16777216;
                                            int var54 = 16711680 & (var47 & 65280) * var42;
                                            int var55 = 65280 & (var47 & 255) * var43;
                                            int var56 = (var54 | var53 | var55) >>> 8;
                                            int var57 = super.field5986[var20];
                                            super.field5986[var20] = class571.method3139(class571.method3139(var57, 65280) * var49 + class571.method3139(65280, var56) * var48, 16711680) + class571.method3139(class571.method3139(var57, 16711935) * var49 + class571.method3139(16711935, var56) * var48, -16711936) >> 8;
                                        }
                                    }
                                    var12 += var16;
                                    ++var20;
                                }
                                var13 += var18;
                                var12 = var33;
                                var20 += var21;
                            }
                        }
                    } else if (~arg3 == -4) {
                        int var58 = var12;
                        for (int var59 = -arg9; ~var59 > -1; ++var59) {
                            int var60 = (var13 >> 16) * arg7.field4090;
                            var13 += var18;
                            for (int var61 = -arg2; ~var61 > -1; ++var61) {
                                if (~this.field9476[var20] < ~var11) {
                                    int var62 = arg7.field533[(var12 >> 16) + var60];
                                    int var63 = arg8 + var62;
                                    int var64 = (arg8 & 16711935) + (16711935 & var62);
                                    int var65 = (-var64 + var63 & 65536) + (var64 & 16777472);
                                    int var66 = -(var65 >>> 8) + var65 | -var65 + var63;
                                    int var67 = (arg8 >>> 24) * (var66 >>> 24) >> 8;
                                    int var68 = -var67 + 256;
                                    if (~var67 != -256) {
                                        int var70 = super.field5986[var20];
                                        var66 = (16711680 & (var66 & 65280) * var67 + (65280 & var70) * var68) + (-16711936 & (var66 & 16711935) * var67 + (var70 & 16711935) * var68) >> 8;
                                    }
                                    super.field5986[var20] = var66;
                                }
                                var12 += var16;
                                ++var20;
                            }
                            var20 += var21;
                            var12 = var58;
                        }
                    } else if (arg3 != 2) {
                        throw new IllegalArgumentException();
                    } else {
                        int var71 = arg8 >>> 24;
                        int var72 = 256 - var71;
                        int var73 = -16711936 & (16711935 & arg8) * var72;
                        int var74 = (65280 & arg8) * var72 & 16711680;
                        int var75 = (var73 | var74) >>> 8;
                        int var76 = var12;
                        for (int var77 = -arg9; ~var77 > -1; ++var77) {
                            int var78 = (var13 >> 16) * arg7.field4090;
                            var13 += var18;
                            for (int var79 = -arg2; ~var79 > -1; ++var79) {
                                if (var11 < this.field9476[var20]) {
                                    int var80 = arg7.field533[(var12 >> 16) + var78];
                                    int var81 = var80 >>> 24;
                                    int var82 = (65280 & var80) * var71 & 16711680;
                                    int var83 = -16711936 & (var80 & 16711935) * var71;
                                    int var84 = 256 - var81;
                                    int var85 = ((var83 | var82) >>> 8) - -var75;
                                    int var86 = super.field5986[var20];
                                    super.field5986[var20] = class571.method3139(16711680, class571.method3139(var86, 65280) * var84 + var81 * class571.method3139(65280, var85)) + class571.method3139(-16711936, var81 * class571.method3139(var85, 16711935) - -(class571.method3139(var86, 16711935) * var84)) >> 8;
                                }
                                ++var20;
                                var12 += var16;
                            }
                            var12 = var76;
                            var20 += var21;
                        }
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else if (arg3 == 1) {
                    int var87 = var12;
                    for (int var88 = -arg9; ~var88 > -1; ++var88) {
                        int var89 = (var13 >> 16) * arg7.field4090;
                        var13 += var18;
                        for (int var90 = -arg2; var90 < 0; ++var90) {
                            if (~this.field9476[var20] < ~var11) {
                                int var91 = arg7.field533[(var12 >> 16) + var89];
                                if (var91 != 0) {
                                    int var92 = super.field5986[var20];
                                    int var93 = var91 + var92;
                                    int var94 = (var91 & 16711935) + (var92 & 16711935);
                                    int var95 = (-var94 + var93 & 65536) + (16777472 & var94);
                                    super.field5986[var20] = class220.method1393(-(var95 >>> 8) + var95, -var95 + var93);
                                }
                            }
                            var12 += var16;
                            ++var20;
                        }
                        var12 = var87;
                        var20 += var21;
                    }
                } else if (~arg3 == -1) {
                    int var96 = var12;
                    int var97 = 255 & arg8 >> 16;
                    int var98 = arg8 >> 8 & 255;
                    int var99 = 255 & arg8;
                    for (int var100 = -arg9; var100 < 0; ++var100) {
                        int var101 = (var13 >> 16) * arg7.field4090;
                        var13 += var18;
                        for (int var102 = -arg2; var102 < 0; ++var102) {
                            if (~this.field9476[var20] < ~var11) {
                                int var103 = arg7.field533[(var12 >> 16) + var101];
                                if (~var103 != -1) {
                                    int var104 = -16777216 & (var103 & 16711680) * var97;
                                    int var105 = 16711680 & (65280 & var103) * var98;
                                    int var106 = (255 & var103) * var99 & 65280;
                                    int var107 = (var105 | var104 | var106) >>> 8;
                                    int var108 = super.field5986[var20];
                                    int var109 = var107 + var108;
                                    int var110 = (var107 & 16711935) - -(16711935 & var108);
                                    int var111 = (65536 & -var110 + var109) + (var110 & 16777472);
                                    super.field5986[var20] = class220.method1393(-(var111 >>> 8) + var111, -var111 + var109);
                                }
                            }
                            var12 += var16;
                            ++var20;
                        }
                        var20 += var21;
                        var12 = var96;
                    }
                } else if (~arg3 == -4) {
                    int var112 = var12;
                    for (int var113 = -arg9; var113 < 0; ++var113) {
                        int var114 = (var13 >> 16) * arg7.field4090;
                        var13 += var18;
                        for (int var115 = -arg2; ~var115 > -1; ++var115) {
                            if (~var11 > ~this.field9476[var20]) {
                                int var116 = arg7.field533[(var12 >> 16) + var114];
                                int var117 = arg8 + var116;
                                int var118 = (var116 & 16711935) - -(16711935 & arg8);
                                int var119 = (var118 & 16777472) - -(-var118 + var117 & 65536);
                                int var120 = var119 - (var119 >>> 8) | -var119 + var117;
                                int var121 = super.field5986[var20];
                                int var122 = (var120 & 16711935) + (16711935 & var121);
                                int var123 = var120 + var121;
                                int var124 = (-var122 + var123 & 65536) + (16777472 & var122);
                                super.field5986[var20] = class220.method1393(-var124 + var123, -(var124 >>> 8) + var124);
                            }
                            ++var20;
                            var12 += var16;
                        }
                        var12 = var112;
                        var20 += var21;
                    }
                } else if (~arg3 != -3) {
                    throw new IllegalArgumentException();
                } else {
                    int var125 = arg8 >>> 24;
                    int var126 = 256 - var125;
                    int var127 = (16711935 & arg8) * var126 & -16711936;
                    int var128 = 16711680 & (arg8 & 65280) * var126;
                    int var129 = (var128 | var127) >>> 8;
                    int var130 = var12;
                    for (int var131 = -arg9; ~var131 > -1; ++var131) {
                        int var132 = (var13 >> 16) * arg7.field4090;
                        var13 += var18;
                        for (int var133 = -arg2; ~var133 > -1; ++var133) {
                            if (var11 < this.field9476[var20]) {
                                int var134 = arg7.field533[(var12 >> 16) + var132];
                                if (var134 != 0) {
                                    int var135 = -16711936 & (16711935 & var134) * var125;
                                    int var136 = 16711680 & (var134 & 65280) * var125;
                                    int var137 = ((var136 | var135) >>> 8) + var129;
                                    int var138 = super.field5986[var20];
                                    int var139 = var137 + var138;
                                    int var140 = (var137 & 16711935) - -(16711935 & var138);
                                    int var141 = (-var140 + var139 & 65536) + (16777472 & var140);
                                    super.field5986[var20] = class220.method1393(-(var141 >>> 8) + var141, -var141 + var139);
                                }
                            }
                            var12 += var16;
                            ++var20;
                        }
                        var20 += var21;
                        var12 = var130;
                    }
                }
            } else if (arg3 != 1) {
                if (arg3 != 0) {
                    if (~arg3 != -4) {
                        if (~arg3 != -3) {
                            throw new IllegalArgumentException();
                        } else {
                            int var142 = arg8 >>> 24;
                            int var143 = -var142 + 256;
                            int var144 = -16711936 & (arg8 & 16711935) * var143;
                            int var145 = 16711680 & (arg8 & 65280) * var143;
                            int var146 = (var145 | var144) >>> 8;
                            int var147 = var12;
                            for (int var148 = -arg9; ~var148 > -1; ++var148) {
                                int var149 = (var13 >> 16) * arg7.field4090;
                                var13 += var18;
                                for (int var150 = -arg2; var150 < 0; ++var150) {
                                    if (~this.field9476[var20] < ~var11) {
                                        int var151 = arg7.field533[(var12 >> 16) + var149];
                                        int var152 = 16711680 & (var151 & 65280) * var142;
                                        int var153 = -16711936 & (var151 & 16711935) * var142;
                                        super.field5986[var20] = var146 + (class220.method1393(var153, var152) >>> 8);
                                    }
                                    ++var20;
                                    var12 += var16;
                                }
                                var20 += var21;
                                var12 = var147;
                            }
                        }
                    } else {
                        int var154 = var12;
                        for (int var155 = -arg9; var155 < 0; ++var155) {
                            int var156 = (var13 >> 16) * arg7.field4090;
                            var13 += var18;
                            for (int var157 = -arg2; var157 < 0; ++var157) {
                                if (this.field9476[var20] > var11) {
                                    int var158 = arg7.field533[(var12 >> 16) + var156];
                                    int var159 = arg8 + var158;
                                    int var160 = (arg8 & 16711935) + (var158 & 16711935);
                                    int var161 = (65536 & -var160 + var159) + (16777472 & var160);
                                    super.field5986[var20] = class220.method1393(-(var161 >>> 8) + var161, -var161 + var159);
                                }
                                ++var20;
                                var12 += var16;
                            }
                            var12 = var154;
                            var20 += var21;
                        }
                    }
                } else {
                    int var162 = (arg8 & 16711680) >> 16;
                    int var163 = (arg8 & 65280) >> 8;
                    int var164 = arg8 & 255;
                    int var165 = var12;
                    for (int var166 = -arg9; var166 < 0; ++var166) {
                        int var167 = (var13 >> 16) * arg7.field4090;
                        for (int var168 = -arg2; var168 < 0; ++var168) {
                            if (~var11 > ~this.field9476[var20]) {
                                int var169 = arg7.field533[(var12 >> 16) + var167];
                                int var170 = -16777216 & (var169 & 16711680) * var162;
                                int var171 = 16711680 & (65280 & var169) * var163;
                                int var172 = 65280 & (var169 & 255) * var164;
                                super.field5986[var20] = class220.method1393(class220.method1393(var170, var171), var172) >>> 8;
                            }
                            ++var20;
                            var12 += var16;
                        }
                        var13 += var18;
                        var12 = var165;
                        var20 += var21;
                    }
                }
            } else {
                int var173 = var12;
                for (int var174 = -arg9; ~var174 > -1; ++var174) {
                    int var175 = (var13 >> 16) * arg7.field4090;
                    var13 += var18;
                    for (int var176 = -arg2; ~var176 > -1; ++var176) {
                        if (~this.field9476[var20] < ~var11) {
                            super.field5986[var20] = arg7.field533[(var12 >> 16) + var175];
                        }
                        var12 += var16;
                        ++var20;
                    }
                    var20 += var21;
                    var12 = var173;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(II[[I[[IIII)Ld;", line = 836)
    public final class139 method402(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field9469;
        return new class586(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(I)V", line = 846)
    public final void method378(int arg0) {
        super.field6016[arg0].method1661((Runnable) null, 10);
        ++field9472;
    }

    @OriginalMember(owner = "client!ega", name = "d", descriptor = "(I)V", line = 856)
    public final void method425(int arg0) {
        super.field6016[arg0].method1661(Thread.currentThread(), 10);
        ++field9482;
    }

    @OriginalMember(owner = "client!ega", name = "c", descriptor = "(Z)V", line = 865)
    public final void method407(boolean arg0) {
        this.field9463 = arg0;
        ++field9459;
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(IIIIIIIIII)V", line = 877)
    public final void method448(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field9471;
        class205 var11 = (class205) this.method2478(Thread.currentThread());
        class514 var12 = var11.field2964;
        var12.field6864 = false;
        var12.field6867 = arg0 < 0 || ~arg0 < ~var12.field6870 || arg2 < 0 || ~var12.field6870 > ~arg2 || arg4 < 0 || arg4 > var12.field6870;
        int var13 = arg1 - super.field6018;
        int var14 = arg2 - super.field6000;
        int var15 = arg5 - super.field6018;
        int var16 = arg3 - super.field6018;
        int var17 = arg0 - super.field6000;
        int var18 = arg4 - super.field6000;
        int var19 = arg6 >>> 24;
        if (~arg9 != -1 && (~arg9 != -2 || ~var19 != -256)) {
            if (~arg9 != -2) {
                if (arg9 != 2) {
                    throw new IllegalArgumentException();
                }
                var12.field6866 = 128;
                var12.field6868 = true;
                var12.method2860(var13, var16, var15, var17, var14, var18, 100, 100, 100, arg6, arg7, arg8);
            } else {
                var12.field6868 = false;
                var12.field6866 = -var19 + 255;
                var12.method2860(var13, var16, var15, var17, var14, var18, 100, 100, 100, arg6, arg7, arg8);
            }
        } else {
            var12.field6868 = false;
            var12.field6866 = 0;
            var12.method2860(var13, var16, var15, var17, var14, var18, 100, 100, 100, arg6, arg7, arg8);
        }
        var12.field6864 = true;
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "([Lba;Lq;[Lot;I)V", line = 927)
    public final void method418(class358[] arg0, class397 arg1, class552[] arg2, int arg3) {
        ++field9462;
        for (int var5 = 0; arg0.length > var5; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method1947(arg1, arg2 != null ? arg2[var5] : null, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(Lpf;IIII)Lba;", line = 946)
    public final class358 method443(class545 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field9467;
        return new class320(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!ega", name = "j", descriptor = "()V", line = 954)
    public final void method38() {
        ++field9464;
        if (~super.field5999 == -1 && super.field6014 == super.field5995 && super.field5985 == 0 && super.field6001 == super.field5996) {
            int var1 = this.field9476.length;
            int var2 = -var1 + var1 & 7;
            int var3 = 0;
            while (var3 < var2) {
                this.field9476[var3++] = Integer.MAX_VALUE;
                this.field9476[var3++] = Integer.MAX_VALUE;
                this.field9476[var3++] = Integer.MAX_VALUE;
                this.field9476[var3++] = Integer.MAX_VALUE;
                this.field9476[var3++] = Integer.MAX_VALUE;
                this.field9476[var3++] = Integer.MAX_VALUE;
                this.field9476[var3++] = Integer.MAX_VALUE;
                this.field9476[var3++] = Integer.MAX_VALUE;
            }
            while (var3 < var1) {
                this.field9476[var3++] = Integer.MAX_VALUE;
            }
        } else {
            int var4 = -super.field5999 + super.field6014;
            int var5 = super.field6001 - super.field5985;
            int var6 = -var4 + super.field5995;
            int var7 = super.field5999 - -(super.field5995 * super.field5985);
            int var8 = var4 >> 3;
            int var9 = var4 & 7;
            int var10 = var7 - 1;
            for (int var11 = -var5; var11 < 0; ++var11) {
                if (var8 > 0) {
                    int var12 = var8;
                    do {
                        ++var10;
                        this.field9476[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field9476[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field9476[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field9476[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field9476[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field9476[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field9476[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field9476[var10] = Integer.MAX_VALUE;
                        --var12;
                    } while (~var12 < -1);
                }
                if (~var9 < -1) {
                    int var13 = var9;
                    do {
                        ++var10;
                        this.field9476[var10] = Integer.MAX_VALUE;
                        --var13;
                    } while (~var13 < -1);
                }
                var10 += var6;
            }
        }
    }

    @OriginalMember(owner = "client!ega", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 1039)
    public final void method370(Canvas arg0) {
        if (arg0 == null) {
            super.field5975 = null;
            super.field5979 = null;
            if (super.field5997 == null) {
                super.field5986 = null;
                super.field5995 = super.field5996 = 1;
                this.field9468 = this.field9465 = 1;
                this.method2486();
            }
        } else {
            class137 var2 = (class137) super.field5980.method2918((long) arg0.hashCode(), (byte) -125);
            if (var2 != null) {
                super.field5979 = var2;
                super.field5975 = arg0;
                if (super.field5997 == null) {
                    super.field5986 = var2.field2221;
                    super.field5996 = var2.field2220;
                    super.field5995 = var2.field2223;
                    if (~this.field9468 != ~super.field5995 || this.field9465 != super.field5996) {
                        this.field9465 = super.field5996;
                        this.field9468 = super.field5995;
                        this.field9476 = new int[this.field9468 * this.field9465];
                    }
                    this.method2486();
                }
            }
        }
        ++field9483;
    }

    @OriginalMember(owner = "client!ega", name = "<init>", descriptor = "(Ljava/awt/Canvas;Le;)V", line = 1169)
    public class667(Canvas arg0, class498 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(IIIIIII)V", line = 1090)
    public final void method399(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field9477;
        class205 var8 = (class205) this.method2478(Thread.currentThread());
        class514 var9 = var8.field2964;
        int var10 = arg2 - arg0;
        int var11 = -arg1 + arg3;
        int var12 = ~var10 <= -1 ? var10 : -var10;
        int var13 = var11 < 0 ? -var11 : var11;
        int var14 = var12;
        if (~var12 > ~var13) {
            var14 = var13;
        }
        if (var14 != 0) {
            int var15 = (var10 << 16) / var14;
            int var16 = (var15 >> 16) + var10;
            int var17 = (var11 << 16) / var14;
            int var18 = (var17 >> 16) + var11;
            if (~var17 < ~var15) {
                var17 = -var17;
            } else {
                var15 = -var15;
            }
            int var19 = arg5 * var17 >> 17;
            int var20 = arg5 * var17 + 1 >> 17;
            int var21 = arg5 * var15 >> 17;
            int var22 = arg5 * var15 + 1 >> 17;
            int var23 = arg0 - var9.method2870();
            int var24 = arg1 - var9.method2856();
            int var25 = var19 + var23;
            int var26 = var23 - var20;
            int var27 = -var20 + var16 + var23;
            int var28 = var16 + var23 + var19;
            int var29 = var24 - -var21;
            int var30 = var24 - var22;
            int var31 = var18 + var24 + -var22;
            int var32 = var21 + var24 - -var18;
            if (arg6 == 0) {
                var9.field6866 = 0;
            } else {
                if (~arg6 != -2) {
                    throw new IllegalArgumentException();
                }
                var9.field6866 = -(arg4 >>> 24) + 255;
            }
            var9.field6867 = ~var25 > -1 || var9.field6870 < var25 || ~var26 > -1 || var9.field6870 < var26 || ~var27 > -1 || var27 > var9.field6870;
            var9.method2866(var29, var30, var31, var25, var26, var27, 0, 0, 0, arg4);
            var9.field6867 = ~var25 > -1 || ~var25 < ~var9.field6870 || var27 < 0 || var27 > var9.field6870 || var28 < 0 || var28 > var9.field6870;
            var9.method2866(var29, var31, var32, var25, var27, var28, 0, 0, 0, arg4);
        }
    }

    @OriginalMember(owner = "client!ega", name = "b", descriptor = "(B)V", line = 1172)
    public static void method3752(byte arg0) {
        if (arg0 < -12) {
            field9475 = null;
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(Ljava/lang/Runnable;)Leo;", line = 1182)
    public final class274 method2478(Runnable arg0) {
        ++field9470;
        for (int var2 = 0; ~super.field6013 < ~var2; ++var2) {
            if (super.field6016[var2].field3801 == arg0) {
                return super.field6016[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(IIIIIBI)V", line = 1202)
    private final void method3753(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        int var8 = arg3 << 8;
        if (~arg2 > -1) {
            arg2 = -arg2;
        }
        ++field9481;
        int var9 = arg0 - arg2;
        if (~var9 > ~super.field5985) {
            var9 = super.field5985;
        }
        int var10 = arg0 + arg2 + 1;
        if (~var10 < ~super.field6001) {
            var10 = super.field6001;
        }
        int var11 = var9;
        int var12 = arg2 * arg2;
        if (arg5 <= -68) {
            int var13 = 0;
            int var14 = -var9 + arg0;
            int var15 = var14 * var14;
            if (~arg0 < ~var10) {
                arg0 = var10;
            }
            int var16 = -var14 + var15;
            int var17 = arg6 >>> 24;
            if (arg4 == 0 || ~arg4 == -2 && var17 == 255) {
                while (~var11 > ~arg0) {
                    while (~var12 <= ~var16 || var12 >= var15) {
                        var15 += var13 + var13;
                        var16 += var13++ + var13;
                    }
                    int var67 = -var13 + arg1 + 1;
                    if (super.field5999 > var67) {
                        var67 = super.field5999;
                    }
                    int var68 = arg1 + var13;
                    if (~var68 < ~super.field6014) {
                        var68 = super.field6014;
                    }
                    int var69 = super.field5995 * var11 + var67;
                    for (int var70 = var67; var70 < var68; ++var70) {
                        if (var8 < this.field9476[var69]) {
                            super.field5986[var69] = arg6;
                        }
                        ++var69;
                    }
                    ++var11;
                    var15 -= var14-- + var14;
                    var16 -= var14 - -var14;
                }
                int var58 = arg2;
                int var59 = -arg0 + var11;
                int var60 = var59 * var59 + var12;
                int var61 = -arg2 + var60;
                int var62 = var60 - var59;
                while (~var11 > ~var10) {
                    while (var62 > var12 && var61 > var12) {
                        var62 -= var58-- - -var58;
                        var61 -= var58 + var58;
                    }
                    int var63 = arg1 - var58;
                    if (var63 < super.field5999) {
                        var63 = super.field5999;
                    }
                    int var64 = arg1 + var58;
                    if (~var64 < ~(super.field6014 - 1)) {
                        var64 = super.field6014 + -1;
                    }
                    int var65 = var63 - -(super.field5995 * var11);
                    var62 += var59 + var59;
                    ++var11;
                    for (int var66 = var63; ~var64 <= ~var66; ++var66) {
                        if (~this.field9476[var65] < ~var8) {
                            super.field5986[var65] = arg6;
                        }
                        ++var65;
                    }
                    var61 += var59++ - -var59;
                }
            } else if (~arg4 == -2) {
                int var18 = (var17 << 24) + (((arg6 & 65280) * var17 & 16711793) >> 8) + ((16711935 & arg6) * var17 >> 8 & 16711935);
                int var19 = -var17 + 256;
                while (arg0 > var11) {
                    while (~var12 <= ~var16 || ~var12 <= ~var15) {
                        var15 += var13 - -var13;
                        var16 += var13++ - -var13;
                    }
                    int var31 = -var13 - -1 + arg1;
                    if (super.field5999 > var31) {
                        var31 = super.field5999;
                    }
                    int var32 = arg1 + var13;
                    if (~var32 < ~super.field6014) {
                        var32 = super.field6014;
                    }
                    int var33 = super.field5995 * var11 + var31;
                    for (int var34 = var31; var32 > var34; ++var34) {
                        if (~var8 > ~this.field9476[var33]) {
                            int var35 = super.field5986[var33];
                            int var36 = ((65280 & var35) * var19 >> 8 & 65280) + (16711935 & (var35 & 16711935) * var19 >> 8);
                            super.field5986[var33] = var18 + var36;
                        }
                        ++var33;
                    }
                    var15 -= var14-- - -var14;
                    ++var11;
                    var16 -= var14 + var14;
                }
                int var20 = arg2;
                int var21 = -var14;
                int var22 = var21 * var21 + var12;
                int var23 = -arg2 + var22;
                int var24 = var22 - var21;
                while (~var10 < ~var11) {
                    while (~var24 < ~var12 && var12 < var23) {
                        var24 -= var20-- - -var20;
                        var23 -= var20 - -var20;
                    }
                    int var25 = -var20 + arg1;
                    if (var25 < super.field5999) {
                        var25 = super.field5999;
                    }
                    int var26 = arg1 + var20;
                    if (super.field6014 - 1 < var26) {
                        var26 = super.field6014 + -1;
                    }
                    int var27 = super.field5995 * var11 + var25;
                    ++var11;
                    var24 += var21 + var21;
                    for (int var28 = var25; var28 <= var26; ++var28) {
                        if (~var8 > ~this.field9476[var27]) {
                            int var29 = super.field5986[var27];
                            int var30 = ((65280 & var29) * var19 >> 8 & 65280) + (16711935 & (16711935 & var29) * var19 >> 8);
                            super.field5986[var27] = var18 + var30;
                        }
                        ++var27;
                    }
                    var23 += var21++ + var21;
                }
            } else if (~arg4 != -3) {
                throw new IllegalArgumentException();
            } else {
                while (~var11 > ~arg0) {
                    while (~var16 >= ~var12 || ~var12 <= ~var15) {
                        var15 += var13 - -var13;
                        var16 += var13++ + var13;
                    }
                    int var50 = arg1 + 1 - var13;
                    if (var50 < super.field5999) {
                        var50 = super.field5999;
                    }
                    int var51 = arg1 + var13;
                    if (var51 > super.field6014) {
                        var51 = super.field6014;
                    }
                    int var52 = super.field5995 * var11 + var50;
                    var15 -= var14-- + var14;
                    ++var11;
                    for (int var53 = var50; ~var51 < ~var53; ++var53) {
                        if (~this.field9476[var52] < ~var8) {
                            int var54 = super.field5986[var52];
                            int var55 = arg6 - -var54;
                            int var56 = (16711935 & arg6) + (var54 & 16711935);
                            int var57 = (65536 & -var56 + var55) + (var56 & 16777472);
                            super.field5986[var52] = class220.method1393(-(var57 >>> 8) + var57, -var57 + var55);
                        }
                        ++var52;
                    }
                    var16 -= var14 - -var14;
                }
                int var37 = -var14;
                int var38 = arg2;
                int var39 = var37 * var37 - -var12;
                int var40 = var39 - arg2;
                int var41 = var39 - var37;
                while (var10 > var11) {
                    while (~var41 < ~var12 && ~var40 < ~var12) {
                        var41 -= var38-- + var38;
                        var40 -= var38 + var38;
                    }
                    int var42 = -var38 + arg1;
                    if (~super.field5999 < ~var42) {
                        var42 = super.field5999;
                    }
                    int var43 = arg1 + var38;
                    if (~(super.field6014 + -1) > ~var43) {
                        var43 = super.field6014 + -1;
                    }
                    int var44 = super.field5995 * var11 + var42;
                    var41 += var37 + var37;
                    ++var11;
                    for (int var45 = var42; var45 <= var43; ++var45) {
                        if (~this.field9476[var44] < ~var8) {
                            int var46 = super.field5986[var44];
                            int var47 = arg6 + var46;
                            int var48 = (arg6 & 16711935) + (16711935 & var46);
                            int var49 = (65536 & -var48 + var47) + (16777472 & var48);
                            super.field5986[var44] = class220.method1393(-var49 + var47, -(var49 >>> 8) + var49);
                        }
                        ++var44;
                    }
                    var40 += var37++ - -var37;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ega", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 1542)
    public final void method447(Canvas arg0) {
        ++field9479;
        class137 var2 = (class137) super.field5980.method2918((long) arg0.hashCode(), (byte) -126);
        if (var2 != null) {
            var2.method2797(-114);
            class137 var3 = class116.method919(0, arg0);
            super.field5980.method2911((long) arg0.hashCode(), var3, (byte) -28);
            if (super.field5975 == arg0 && super.field5997 == null) {
                super.field5996 = var3.field2220;
                super.field5995 = var3.field2223;
                super.field5979 = var3;
                super.field5986 = var3.field2221;
                if (~this.field9468 != ~super.field5995 || ~this.field9465 != ~super.field5996) {
                    this.field9465 = super.field5996;
                    this.field9468 = super.field5995;
                    this.field9476 = new int[this.field9468 * this.field9465];
                }
                this.method2486();
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ega", name = "b", descriptor = "(IIIIIIIIII)V", line = 1582)
    public final void method2489(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field9473;
        if (arg3 != 0 && ~arg4 != -1) {
            if (arg6 != 65535 && !super.field8808.method2760(arg6, 21351).field4930) {
                if (super.field6024 != arg6) {
                    class468 var11 = (class468) super.field6022.method3750((long) arg6, false);
                    if (var11 == null) {
                        int[] var12 = this.method2490(arg6);
                        if (var12 == null) {
                            return;
                        }
                        int var13 = !this.method2480(arg6) ? 128 : 64;
                        var11 = this.method374(var12, 0, var13, var13, var13);
                        super.field6022.method3745(1, (long) arg6, var11);
                    }
                    super.field6024 = arg6;
                    super.field6023 = var11;
                }
                this.method3751(arg0 - arg3, arg2, arg3 << 1, arg8, arg9, 15591, -arg4 + arg1, (class35) super.field6023, arg7, arg4 << 1);
            } else {
                this.method3753(arg1, arg0, arg3, arg2, arg9, (byte) -119, arg7);
            }
        }
    }

    @OriginalMember(owner = "client!ega", name = "g", descriptor = "(I)V", line = 1623)
    public final void method409(int arg0) {
        super.field6013 = arg0;
        ++field9461;
        super.field6016 = new class205[super.field6013];
        for (int var2 = 0; var2 < super.field6013; ++var2) {
            super.field6016[var2] = new class205(this);
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(Ldi;IIII)V", line = 1647)
    public final void method2481(class115 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field9478;
        int var6 = arg0.field1982;
        int var8 = arg4 << 1;
        if (~var6 == 0) {
            this.method3753(arg2, arg1, arg4, arg3, 1, (byte) -117, arg0.field1979);
        } else {
            if (super.field6024 != var6) {
                class468 var9 = (class468) super.field6022.method3750((long) var6, false);
                if (var9 == null) {
                    int[] var10 = this.method2490(var6);
                    if (var10 == null) {
                        return;
                    }
                    int var11 = !this.method2480(var6) ? 128 : 64;
                    var9 = this.method374(var10, 0, var11, var11, var11);
                    super.field6022.method3745(1, (long) var6, var9);
                }
                super.field6024 = var6;
                super.field6023 = var9;
            }
            ++var8;
            this.method3751(-arg4 + arg1, arg3, var8, 0, 1, 15591, -arg4 + arg2, (class35) super.field6023, arg0.field1979, var8);
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "([Lba;Lc;Lq;[Lot;I)V", line = 1693)
    public final void method429(class358[] arg0, class174 arg1, class397 arg2, class552[] arg3, int arg4) {
        ++field9460;
        for (int var6 = 0; ~var6 > ~arg0.length; ++var6) {
            if (arg0[var6] != null) {
                ((class321) arg0[var6]).method1944(arg2, arg3 == null ? null : arg3[var6], arg1, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!ega", name = "w", descriptor = "()Z", line = 1713)
    public final boolean method396() {
        ++field9474;
        return true;
    }

    @OriginalMember(owner = "client!ega", name = "s", descriptor = "()V", line = 1721)
    public final void method2479() {
        super.field6018 = -super.field6007 + super.field5985;
        super.field6008 = super.field6014 - super.field6015;
        super.field6000 = super.field5999 - super.field6015;
        ++field9485;
        super.field5989 = -super.field6007 + super.field6001;
        for (int var1 = 0; var1 < super.field6013; ++var1) {
            class514 var5 = ((class205) super.field6016[var1]).field2964;
            var5.field6858 = -super.field5985 + super.field6007;
            var5.field6860 = -super.field5999 + super.field6015;
            var5.field6861 = -super.field5985 + super.field6001;
            var5.field6870 = -super.field5999 + super.field6014;
        }
        int var2 = super.field5995 * super.field5985 + super.field5999;
        for (int var3 = super.field5985; ~super.field6001 < ~var3; ++var3) {
            for (int var4 = 0; ~var4 > ~super.field6013; ++var4) {
                ((class205) super.field6016[var4]).field2964.field6862[var3 - super.field5985] = var2;
            }
            var2 += super.field5995;
        }
    }
}
