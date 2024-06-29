import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class475 extends class574 {

    @OriginalMember(owner = "client!mq", name = "ub", descriptor = "Z")
    public boolean field5877 = true;

    @OriginalMember(owner = "client!mq", name = "Ib", descriptor = "Lcga;")
    public static class449 field5891 = new class449(41, 8);

    @OriginalMember(owner = "client!mq", name = "pb", descriptor = "I")
    public static int field5872;

    @OriginalMember(owner = "client!mq", name = "rb", descriptor = "I")
    public static int field5874;

    @OriginalMember(owner = "client!mq", name = "sb", descriptor = "I")
    public static int field5875;

    @OriginalMember(owner = "client!mq", name = "tb", descriptor = "I")
    public static int field5876;

    @OriginalMember(owner = "client!mq", name = "vb", descriptor = "I")
    public static int field5878;

    @OriginalMember(owner = "client!mq", name = "wb", descriptor = "I")
    public static int field5879;

    @OriginalMember(owner = "client!mq", name = "xb", descriptor = "I")
    public static int field5880;

    @OriginalMember(owner = "client!mq", name = "yb", descriptor = "I")
    public static int field5881;

    @OriginalMember(owner = "client!mq", name = "zb", descriptor = "I")
    private int field5882;

    @OriginalMember(owner = "client!mq", name = "Ab", descriptor = "I")
    public static int field5883;

    @OriginalMember(owner = "client!mq", name = "Bb", descriptor = "I")
    public static int field5884;

    @OriginalMember(owner = "client!mq", name = "Cb", descriptor = "I")
    public static int field5885;

    @OriginalMember(owner = "client!mq", name = "Db", descriptor = "I")
    public static int field5886;

    @OriginalMember(owner = "client!mq", name = "Eb", descriptor = "I")
    public static int field5887;

    @OriginalMember(owner = "client!mq", name = "Fb", descriptor = "I")
    public static int field5888;

    @OriginalMember(owner = "client!mq", name = "Gb", descriptor = "I")
    public static int field5889;

    @OriginalMember(owner = "client!mq", name = "Hb", descriptor = "I")
    public static int field5890;

    @OriginalMember(owner = "client!mq", name = "Jb", descriptor = "I")
    public static int field5892;

    @OriginalMember(owner = "client!mq", name = "Kb", descriptor = "I")
    public static int field5893;

    @OriginalMember(owner = "client!mq", name = "Lb", descriptor = "I")
    public static int field5894;

    @OriginalMember(owner = "client!mq", name = "Mb", descriptor = "I")
    public static int field5895;

    @OriginalMember(owner = "client!mq", name = "Nb", descriptor = "I")
    public static int field5896;

    @OriginalMember(owner = "client!mq", name = "Ob", descriptor = "I")
    public static int field5897;

    @OriginalMember(owner = "client!mq", name = "Pb", descriptor = "I")
    public static int field5898;

    @OriginalMember(owner = "client!mq", name = "Qb", descriptor = "I")
    public static int field5899;

    @OriginalMember(owner = "client!mq", name = "Rb", descriptor = "I")
    public static int field5900;

    @OriginalMember(owner = "client!mq", name = "Sb", descriptor = "I")
    public static int field5901;

    @OriginalMember(owner = "client!mq", name = "Tb", descriptor = "I")
    private int field5902;

    @OriginalMember(owner = "client!mq", name = "qb", descriptor = "[I")
    public int[] field5873;

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(I)V", line = 3)
    public final void method476(int arg0) {
        super.field7366[arg0].method3775(112, (Runnable) null);
        ++field5892;
    }

    @OriginalMember(owner = "client!mq", name = "u", descriptor = "()Z", line = 15)
    public final boolean method419() {
        ++field5878;
        return true;
    }

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 23)
    public final void method411(Canvas arg0) {
        ++field5874;
        if (arg0 != null) {
            class348 var2 = (class348) super.field7333.method3828((long) arg0.hashCode(), (byte) -91);
            if (var2 != null) {
                super.field7332 = var2;
                super.field7330 = arg0;
                if (super.field7349 == null) {
                    super.field7376 = var2.field4472;
                    super.field7373 = var2.field4473;
                    super.field7339 = var2.field4469;
                    if (~super.field7339 != ~this.field5882 || super.field7373 != this.field5902) {
                        this.field5902 = super.field7373;
                        this.field5882 = super.field7339;
                        this.field5873 = new int[this.field5902 * this.field5882];
                    }
                    this.method3102();
                    return;
                }
            }
        } else {
            super.field7332 = null;
            super.field7330 = null;
            if (super.field7349 != null) {
                return;
            }
            this.field5882 = this.field5902 = 1;
            super.field7376 = null;
            super.field7339 = super.field7373 = 1;
            this.method3102();
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lxa;Z)V", line = 74)
    public final void method369(class468 arg0, boolean arg1) {
        ++field5872;
        if (!(arg0 instanceof class533)) {
            if (!(arg0 instanceof class298)) {
                throw new RuntimeException();
            }
            class298 var3 = (class298) arg0;
            super.field7339 = var3.field5292;
            super.field7373 = var3.field5317;
            super.field7376 = var3.field3799;
            super.field7349 = arg0;
        } else {
            class533 var4 = (class533) arg0;
            super.field7349 = arg0;
            super.field7376 = var4.field6731;
            super.field7339 = var4.field5292;
            super.field7373 = var4.field5317;
        }
        this.method3102();
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(II[[I[[IIII)Ld;", line = 108)
    public final class140 method412(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field5875;
        return new class453(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "([SI)[S", line = 117)
    public static final short[] method2579(short[] arg0, int arg1) {
        ++field5894;
        if (arg0 == null) {
            return null;
        } else {
            if (arg1 != -28073) {
                field5891 = null;
            }
            short[] var2 = new short[arg0.length];
            class70.method552(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(IIIIIII)V", line = 136)
    private final void method2580(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = arg4 << 8;
        if (~arg5 > -1) {
            arg5 = -arg5;
        }
        ++field5897;
        int var9 = -arg5 + arg6;
        if (var9 < super.field7357) {
            var9 = super.field7357;
        }
        int var10 = arg5 + arg6 + 1;
        if (~var10 < ~super.field7367) {
            var10 = super.field7367;
        }
        int var11 = var9;
        if (arg2 != -1979121391) {
            this.field5873 = null;
        }
        int var12 = arg5 * arg5;
        int var13 = 0;
        int var14 = -var9 + arg6;
        int var15 = var14 * var14;
        if (~arg6 < ~var10) {
            arg6 = var10;
        }
        int var16 = -var14 + var15;
        int var17 = arg1 >>> 24;
        if (arg3 == 0 || arg3 == 1 && var17 == 255) {
            while (var11 < arg6) {
                while (~var12 <= ~var16 || ~var15 >= ~var12) {
                    var15 += var13 - -var13;
                    var16 += var13++ + var13;
                }
                int var67 = -var13 + arg0 + 1;
                if (var67 < super.field7374) {
                    var67 = super.field7374;
                }
                int var68 = arg0 + var13;
                if (super.field7350 < var68) {
                    var68 = super.field7350;
                }
                int var69 = super.field7339 * var11 + var67;
                ++var11;
                for (int var70 = var67; ~var68 < ~var70; ++var70) {
                    if (var8 < this.field5873[var69]) {
                        super.field7376[var69] = arg1;
                    }
                    ++var69;
                }
                var15 -= var14-- - -var14;
                var16 -= var14 + var14;
            }
            int var58 = -arg6 + var11;
            int var59 = arg5;
            int var60 = var58 * var58 + var12;
            int var61 = var60 - arg5;
            int var62 = var60 - var58;
            while (var10 > var11) {
                while (~var12 > ~var62 && var61 > var12) {
                    var62 -= var59-- + var59;
                    var61 -= var59 + var59;
                }
                int var63 = -var59 + arg0;
                if (~super.field7374 < ~var63) {
                    var63 = super.field7374;
                }
                int var64 = arg0 + var59;
                if (var64 > super.field7350 + -1) {
                    var64 = super.field7350 + -1;
                }
                int var65 = super.field7339 * var11 + var63;
                var62 += var58 - -var58;
                ++var11;
                for (int var66 = var63; ~var64 <= ~var66; ++var66) {
                    if (this.field5873[var65] > var8) {
                        super.field7376[var65] = arg1;
                    }
                    ++var65;
                }
                var61 += var58++ + var58;
            }
        } else if (arg3 != 1) {
            if (arg3 != 2) {
                throw new IllegalArgumentException();
            } else {
                while (~var11 > ~arg6) {
                    while (~var12 <= ~var16 || var15 <= var12) {
                        var15 += var13 + var13;
                        var16 += var13++ + var13;
                    }
                    int var31 = -var13 + 1 + arg0;
                    if (super.field7374 > var31) {
                        var31 = super.field7374;
                    }
                    int var32 = arg0 - -var13;
                    if (var32 > super.field7350) {
                        var32 = super.field7350;
                    }
                    int var33 = super.field7339 * var11 + var31;
                    var15 -= var14-- + var14;
                    ++var11;
                    for (int var34 = var31; ~var34 > ~var32; ++var34) {
                        if (this.field5873[var33] > var8) {
                            int var35 = super.field7376[var33];
                            int var36 = arg1 - -var35;
                            int var37 = (arg1 & 16711935) + (var35 & 16711935);
                            int var38 = (65536 & -var37 + var36) + (16777472 & var37);
                            super.field7376[var33] = class364.method2113(-(var38 >>> 8) + var38, -var38 + var36);
                        }
                        ++var33;
                    }
                    var16 -= var14 - -var14;
                }
                int var18 = -var14;
                int var19 = arg5;
                int var20 = var18 * var18 + var12;
                int var21 = -arg5 + var20;
                int var22 = var20 - var18;
                while (var11 < var10) {
                    while (var22 > var12 && var12 < var21) {
                        var22 -= var19-- + var19;
                        var21 -= var19 + var19;
                    }
                    int var23 = -var19 + arg0;
                    if (~var23 > ~super.field7374) {
                        var23 = super.field7374;
                    }
                    int var24 = arg0 + var19;
                    if (~var24 < ~(super.field7350 + -1)) {
                        var24 = super.field7350 + -1;
                    }
                    int var25 = super.field7339 * var11 + var23;
                    for (int var26 = var23; var26 <= var24; ++var26) {
                        if (~var8 > ~this.field5873[var25]) {
                            int var27 = super.field7376[var25];
                            int var28 = arg1 + var27;
                            int var29 = (arg1 & 16711935) - -(var27 & 16711935);
                            int var30 = (-var29 + var28 & 65536) + (var29 & 16777472);
                            super.field7376[var25] = class364.method2113(var28 - var30, -(var30 >>> 8) + var30);
                        }
                        ++var25;
                    }
                    var22 += var18 - -var18;
                    ++var11;
                    var21 += var18++ + var18;
                }
            }
        } else {
            int var39 = ((arg1 & 65280) * var17 >> 8 & 65280) + (var17 << 24) + ((arg1 & 16711935) * var17 >> 8 & 16711935);
            int var40 = 256 - var17;
            while (var11 < arg6) {
                while (var12 >= var16 || ~var12 <= ~var15) {
                    var15 += var13 - -var13;
                    var16 += var13++ + var13;
                }
                int var52 = -var13 - -1 + arg0;
                if (var52 < super.field7374) {
                    var52 = super.field7374;
                }
                int var53 = arg0 + var13;
                if (~super.field7350 > ~var53) {
                    var53 = super.field7350;
                }
                int var54 = super.field7339 * var11 + var52;
                var15 -= var14-- - -var14;
                ++var11;
                for (int var55 = var52; ~var55 > ~var53; ++var55) {
                    if (~this.field5873[var54] < ~var8) {
                        int var56 = super.field7376[var54];
                        int var57 = ((16711786 & (var56 & 65280) * var40) >> 8) + (16711935 & (16711935 & var56) * var40 >> 8);
                        super.field7376[var54] = var39 + var57;
                    }
                    ++var54;
                }
                var16 -= var14 + var14;
            }
            int var41 = arg5;
            int var42 = -var14;
            int var43 = var42 * var42 + var12;
            int var44 = -arg5 + var43;
            int var45 = var43 - var42;
            while (var11 < var10) {
                while (var45 > var12 && ~var44 < ~var12) {
                    var45 -= var41-- + var41;
                    var44 -= var41 + var41;
                }
                int var46 = -var41 + arg0;
                if (super.field7374 > var46) {
                    var46 = super.field7374;
                }
                int var47 = arg0 + var41;
                if (~var47 < ~(super.field7350 + -1)) {
                    var47 = super.field7350 + -1;
                }
                int var48 = var46 - -(super.field7339 * var11);
                var45 += var42 + var42;
                ++var11;
                for (int var49 = var46; var49 <= var47; ++var49) {
                    if (~var8 > ~this.field5873[var48]) {
                        int var50 = super.field7376[var48];
                        int var51 = ((16711787 & (65280 & var50) * var40) >> 8) + ((16711935 & var50) * var40 >> 8 & 16711935);
                        super.field7376[var48] = var39 + var51;
                    }
                    ++var48;
                }
                var44 += var42++ + var42;
            }
        }
    }

    @OriginalMember(owner = "client!mq", name = "m", descriptor = "(I)Z", line = 472)
    public static final boolean method2581(int arg0) {
        ++field5886;
        try {
            int var1 = -120 % ((-4 - arg0) / 34);
            class696 var2 = new class696();
            byte[] var3 = var2.method3846(0, class660.field8965);
            class382.method2195(var3, (byte) -76);
            return true;
        } catch (Exception var4) {
            return false;
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lnj;IIII)Lba;", line = 497)
    public final class359 method408(class229 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5900;
        return new class330(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(Ljava/awt/Canvas;Le;)V", line = 505)
    public class475(Canvas arg0, class498 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIIIZIILen;II)V", line = 509)
    private final void method2582(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, class298 arg7, int arg8, int arg9) {
        ++field5881;
        if (arg6 > 0 && arg2 > 0) {
            int var11 = arg3 << 8;
            if (arg4) {
                this.method412(-30, -14, (int[][]) null, (int[][]) null, 82, -119, 10);
            }
            int var12 = 0;
            int var13 = 0;
            int var14 = arg7.field5290 - -arg7.field5292 + arg7.field5310;
            int var15 = arg7.field5314 + arg7.field5305 + arg7.field5317;
            int var16 = (var14 << 16) / arg6;
            int var17 = (var15 << 16) / arg2;
            if (arg7.field5290 > 0) {
                int var18 = ((arg7.field5290 << 16) + -1 + var16) / var16;
                arg5 += var18;
                var12 += var16 * var18 - (arg7.field5290 << 16);
            }
            if (~var14 < ~arg7.field5292) {
                arg6 = ((arg7.field5292 << 16) + -var12 + var16 + -1) / var16;
            }
            if (~arg7.field5314 < -1) {
                int var19 = ((arg7.field5314 << 16) + var17 + -1) / var17;
                var13 += var17 * var19 + -(arg7.field5314 << 16);
                arg8 += var19;
            }
            if (var15 > arg7.field5317) {
                arg2 = ((arg7.field5317 << 16) + -var13 + -1 + var17) / var17;
            }
            int var20 = super.field7339 * arg8 + arg5;
            if (~super.field7367 > ~(arg2 + arg8)) {
                arg2 -= arg8 - super.field7367 + arg2;
            }
            int var21 = -arg6 + super.field7339;
            if (arg8 < super.field7357) {
                int var22 = super.field7357 - arg8;
                arg2 -= var22;
                var20 += super.field7339 * var22;
                var13 += var17 * var22;
            }
            if (arg5 + arg6 > super.field7350) {
                int var23 = arg5 + arg6 + -super.field7350;
                arg6 -= var23;
                var21 += var23;
            }
            if (arg5 < super.field7374) {
                int var24 = -arg5 + super.field7374;
                var12 += var16 * var24;
                var21 += var24;
                var20 += var24;
                arg6 -= var24;
            }
            if (arg9 != 0) {
                if (arg9 == 1) {
                    if (~arg0 != -2) {
                        if (~arg0 == -1) {
                            int var25 = var12;
                            if ((16777215 & arg1) == 16777215) {
                                for (int var26 = -arg2; ~var26 > -1; ++var26) {
                                    int var27 = (var13 >> 16) * arg7.field5292;
                                    for (int var28 = -arg6; ~var28 > -1; ++var28) {
                                        if (this.field5873[var20] > var11) {
                                            int var29 = arg7.field3799[(var12 >> 16) + var27];
                                            int var30 = (arg1 >>> 24) * (var29 >>> 24) >> 8;
                                            int var31 = 256 - var30;
                                            int var32 = super.field7376[var20];
                                            super.field7376[var20] = class109.method762(var30 * class109.method762(65280, var29) + var31 * class109.method762(var32, 65280), 16711680) + class109.method762(-16711936, var30 * class109.method762(var29, 16711935) + var31 * class109.method762(16711935, var32)) >> 8;
                                        }
                                        ++var20;
                                        var12 += var16;
                                    }
                                    var13 += var17;
                                    var20 += var21;
                                    var12 = var25;
                                }
                            } else {
                                int var33 = (16711680 & arg1) >> 16;
                                int var34 = (arg1 & 65280) >> 8;
                                int var35 = arg1 & 255;
                                for (int var36 = -arg2; ~var36 > -1; ++var36) {
                                    int var37 = (var13 >> 16) * arg7.field5292;
                                    for (int var38 = -arg6; ~var38 > -1; ++var38) {
                                        if (var11 < this.field5873[var20]) {
                                            int var39 = arg7.field3799[(var12 >> 16) + var37];
                                            int var40 = (arg1 >>> 24) * (var39 >>> 24) >> 8;
                                            int var41 = 256 - var40;
                                            if (~var40 != -256) {
                                                int var42 = (var39 & 16711680) * var33 & -16777216;
                                                int var43 = (var39 & 65280) * var34 & 16711680;
                                                int var44 = (255 & var39) * var35 & 65280;
                                                int var45 = (var43 | var42 | var44) >>> 8;
                                                int var46 = super.field7376[var20];
                                                super.field7376[var20] = class109.method762(-16711936, class109.method762(var45, 16711935) * var40 + class109.method762(16711935, var46) * var41) - -class109.method762(16711680, class109.method762(65280, var46) * var41 + var40 * class109.method762(var45, 65280)) >> 8;
                                            } else {
                                                int var47 = (var39 & 16711680) * var33 & -16777216;
                                                int var48 = (65280 & var39) * var34 & 16711680;
                                                int var49 = (255 & var39) * var35 & 65280;
                                                super.field7376[var20] = class364.method2113(var49, class364.method2113(var47, var48)) >>> 8;
                                            }
                                        }
                                        ++var20;
                                        var12 += var16;
                                    }
                                    var13 += var17;
                                    var12 = var25;
                                    var20 += var21;
                                }
                            }
                        } else if (arg0 != 3) {
                            if (~arg0 != -3) {
                                throw new IllegalArgumentException();
                            } else {
                                int var50 = arg1 >>> 24;
                                int var51 = -var50 + 256;
                                int var52 = -16711936 & (arg1 & 16711935) * var51;
                                int var53 = 16711680 & (65280 & arg1) * var51;
                                int var54 = (var52 | var53) >>> 8;
                                int var55 = var12;
                                for (int var56 = -arg2; ~var56 > -1; ++var56) {
                                    int var57 = (var13 >> 16) * arg7.field5292;
                                    var13 += var17;
                                    for (int var58 = -arg6; ~var58 > -1; ++var58) {
                                        if (~this.field5873[var20] < ~var11) {
                                            int var59 = arg7.field3799[(var12 >> 16) + var57];
                                            int var60 = var59 >>> 24;
                                            int var61 = (16711935 & var59) * var50 & -16711936;
                                            int var62 = -var60 + 256;
                                            int var63 = (65280 & var59) * var50 & 16711680;
                                            int var64 = ((var61 | var63) >>> 8) - -var54;
                                            int var65 = super.field7376[var20];
                                            super.field7376[var20] = class109.method762(16711680, var62 * class109.method762(65280, var65) + var60 * class109.method762(var64, 65280)) + class109.method762(class109.method762(16711935, var65) * var62 + var60 * class109.method762(var64, 16711935), -16711936) >> 8;
                                        }
                                        var12 += var16;
                                        ++var20;
                                    }
                                    var20 += var21;
                                    var12 = var55;
                                }
                            }
                        } else {
                            int var66 = var12;
                            for (int var67 = -arg2; ~var67 > -1; ++var67) {
                                int var68 = (var13 >> 16) * arg7.field5292;
                                var13 += var17;
                                for (int var69 = -arg6; ~var69 > -1; ++var69) {
                                    if (~var11 > ~this.field5873[var20]) {
                                        int var70 = arg7.field3799[(var12 >> 16) - -var68];
                                        int var71 = arg1 + var70;
                                        int var72 = (arg1 & 16711935) + (var70 & 16711935);
                                        int var73 = (-var72 + var71 & 65536) + (16777472 & var72);
                                        int var74 = var73 - (var73 >>> 8) | var71 - var73;
                                        int var75 = (arg1 >>> 24) * (var74 >>> 24) >> 8;
                                        int var76 = -var75 + 256;
                                        if (~var75 != -256) {
                                            int var78 = super.field7376[var20];
                                            var74 = (16711680 & (65280 & var74) * var75 - -((65280 & var78) * var76)) + (-16711936 & (var74 & 16711935) * var75 + (16711935 & var78) * var76) >> 8;
                                        }
                                        super.field7376[var20] = var74;
                                    }
                                    ++var20;
                                    var12 += var16;
                                }
                                var12 = var66;
                                var20 += var21;
                            }
                        }
                    } else {
                        int var79 = var12;
                        for (int var80 = -arg2; var80 < 0; ++var80) {
                            int var81 = (var13 >> 16) * arg7.field5292;
                            var13 += var17;
                            for (int var82 = -arg6; var82 < 0; ++var82) {
                                if (var11 < this.field5873[var20]) {
                                    int var83 = arg7.field3799[(var12 >> 16) + var81];
                                    int var84 = var83 >>> 24;
                                    int var85 = -var84 + 256;
                                    int var86 = super.field7376[var20];
                                    super.field7376[var20] = (class109.method762(var85 * class109.method762(var86, 16711935) + class109.method762(var83, 16711935) * var84, -16711936) >> 8) - -class109.method762(-16711936, class109.method762(var83 >>> 8, 16711935) * var84 + var85 * class109.method762(16711935, var86 >>> 8));
                                }
                                var12 += var16;
                                ++var20;
                            }
                            var12 = var79;
                            var20 += var21;
                        }
                    }
                } else if (arg9 != 2) {
                    throw new IllegalArgumentException();
                } else if (~arg0 == -2) {
                    int var87 = var12;
                    for (int var88 = -arg2; var88 < 0; ++var88) {
                        int var89 = (var13 >> 16) * arg7.field5292;
                        for (int var90 = -arg6; var90 < 0; ++var90) {
                            if (var11 < this.field5873[var20]) {
                                int var91 = arg7.field3799[(var12 >> 16) - -var89];
                                if (~var91 != -1) {
                                    int var92 = super.field7376[var20];
                                    int var93 = var91 + var92;
                                    int var94 = (var91 & 16711935) + (var92 & 16711935);
                                    int var95 = (var94 & 16777472) - -(65536 & -var94 + var93);
                                    super.field7376[var20] = class364.method2113(-(var95 >>> 8) + var95, -var95 + var93);
                                }
                            }
                            var12 += var16;
                            ++var20;
                        }
                        var13 += var17;
                        var12 = var87;
                        var20 += var21;
                    }
                } else if (arg0 == 0) {
                    int var96 = var12;
                    int var97 = arg1 >> 16 & 255;
                    int var98 = (arg1 & 65280) >> 8;
                    int var99 = 255 & arg1;
                    for (int var100 = -arg2; ~var100 > -1; ++var100) {
                        int var101 = (var13 >> 16) * arg7.field5292;
                        for (int var102 = -arg6; var102 < 0; ++var102) {
                            if (~var11 > ~this.field5873[var20]) {
                                int var103 = arg7.field3799[(var12 >> 16) + var101];
                                if (~var103 != -1) {
                                    int var104 = (16711680 & var103) * var97 & -16777216;
                                    int var105 = (65280 & var103) * var98 & 16711680;
                                    int var106 = 65280 & (var103 & 255) * var99;
                                    int var107 = (var105 | var104 | var106) >>> 8;
                                    int var108 = super.field7376[var20];
                                    int var109 = var107 + var108;
                                    int var110 = (var107 & 16711935) + (16711935 & var108);
                                    int var111 = (var109 - var110 & 65536) + (16777472 & var110);
                                    super.field7376[var20] = class364.method2113(-(var111 >>> 8) + var111, -var111 + var109);
                                }
                            }
                            var12 += var16;
                            ++var20;
                        }
                        var13 += var17;
                        var20 += var21;
                        var12 = var96;
                    }
                } else if (arg0 == 3) {
                    int var112 = var12;
                    for (int var113 = -arg2; var113 < 0; ++var113) {
                        int var114 = (var13 >> 16) * arg7.field5292;
                        for (int var115 = -arg6; var115 < 0; ++var115) {
                            if (this.field5873[var20] > var11) {
                                int var116 = arg7.field3799[(var12 >> 16) + var114];
                                int var117 = arg1 + var116;
                                int var118 = (var116 & 16711935) - -(16711935 & arg1);
                                int var119 = (-var118 + var117 & 65536) + (16777472 & var118);
                                int var120 = -(var119 >>> 8) + var119 | -var119 + var117;
                                int var121 = super.field7376[var20];
                                int var122 = (16711935 & var120) + (16711935 & var121);
                                int var123 = var120 + var121;
                                int var124 = (var122 & 16777472) - -(-var122 + var123 & 65536);
                                super.field7376[var20] = class364.method2113(-(var124 >>> 8) + var124, -var124 + var123);
                            }
                            var12 += var16;
                            ++var20;
                        }
                        var13 += var17;
                        var20 += var21;
                        var12 = var112;
                    }
                } else if (~arg0 != -3) {
                    throw new IllegalArgumentException();
                } else {
                    int var125 = arg1 >>> 24;
                    int var126 = -var125 + 256;
                    int var127 = -16711936 & (16711935 & arg1) * var126;
                    int var128 = (arg1 & 65280) * var126 & 16711680;
                    int var129 = (var128 | var127) >>> 8;
                    int var130 = var12;
                    for (int var131 = -arg2; ~var131 > -1; ++var131) {
                        int var132 = (var13 >> 16) * arg7.field5292;
                        var13 += var17;
                        for (int var133 = -arg6; var133 < 0; ++var133) {
                            if (var11 < this.field5873[var20]) {
                                int var134 = arg7.field3799[(var12 >> 16) - -var132];
                                if (var134 != 0) {
                                    int var135 = 16711680 & (var134 & 65280) * var125;
                                    int var136 = (var134 & 16711935) * var125 & -16711936;
                                    int var137 = ((var136 | var135) >>> 8) + var129;
                                    int var138 = super.field7376[var20];
                                    int var139 = var137 + var138;
                                    int var140 = (var137 & 16711935) + (16711935 & var138);
                                    int var141 = (16777472 & var140) - -(-var140 + var139 & 65536);
                                    super.field7376[var20] = class364.method2113(-(var141 >>> 8) + var141, -var141 + var139);
                                }
                            }
                            var12 += var16;
                            ++var20;
                        }
                        var20 += var21;
                        var12 = var130;
                    }
                }
            } else if (~arg0 != -2) {
                if (~arg0 != -1) {
                    if (arg0 == 3) {
                        int var142 = var12;
                        for (int var143 = -arg2; ~var143 > -1; ++var143) {
                            int var144 = (var13 >> 16) * arg7.field5292;
                            var13 += var17;
                            for (int var145 = -arg6; var145 < 0; ++var145) {
                                if (this.field5873[var20] > var11) {
                                    int var146 = arg7.field3799[(var12 >> 16) + var144];
                                    int var147 = arg1 + var146;
                                    int var148 = (16711935 & arg1) + (var146 & 16711935);
                                    int var149 = (65536 & -var148 + var147) + (var148 & 16777472);
                                    super.field7376[var20] = class364.method2113(-var149 + var147, -(var149 >>> 8) + var149);
                                }
                                var12 += var16;
                                ++var20;
                            }
                            var12 = var142;
                            var20 += var21;
                        }
                    } else if (~arg0 != -3) {
                        throw new IllegalArgumentException();
                    } else {
                        int var150 = arg1 >>> 24;
                        int var151 = -var150 + 256;
                        int var152 = -16711936 & (arg1 & 16711935) * var151;
                        int var153 = (65280 & arg1) * var151 & 16711680;
                        int var154 = (var153 | var152) >>> 8;
                        int var155 = var12;
                        for (int var156 = -arg2; ~var156 > -1; ++var156) {
                            int var157 = (var13 >> 16) * arg7.field5292;
                            var13 += var17;
                            for (int var158 = -arg6; ~var158 > -1; ++var158) {
                                if (~var11 > ~this.field5873[var20]) {
                                    int var159 = arg7.field3799[(var12 >> 16) - -var157];
                                    int var160 = -16711936 & (16711935 & var159) * var150;
                                    int var161 = (var159 & 65280) * var150 & 16711680;
                                    super.field7376[var20] = (class364.method2113(var161, var160) >>> 8) + var154;
                                }
                                ++var20;
                                var12 += var16;
                            }
                            var20 += var21;
                            var12 = var155;
                        }
                    }
                } else {
                    int var162 = (16711680 & arg1) >> 16;
                    int var163 = 255 & arg1 >> 8;
                    int var164 = 255 & arg1;
                    int var165 = var12;
                    for (int var166 = -arg2; var166 < 0; ++var166) {
                        int var167 = (var13 >> 16) * arg7.field5292;
                        for (int var168 = -arg6; var168 < 0; ++var168) {
                            if (var11 < this.field5873[var20]) {
                                int var169 = arg7.field3799[(var12 >> 16) + var167];
                                int var170 = (16711680 & var169) * var162 & -16777216;
                                int var171 = 16711680 & (65280 & var169) * var163;
                                int var172 = (255 & var169) * var164 & 65280;
                                super.field7376[var20] = class364.method2113(var172, class364.method2113(var170, var171)) >>> 8;
                            }
                            ++var20;
                            var12 += var16;
                        }
                        var13 += var17;
                        var20 += var21;
                        var12 = var165;
                    }
                }
            } else {
                int var173 = var12;
                for (int var174 = -arg2; var174 < 0; ++var174) {
                    int var175 = (var13 >> 16) * arg7.field5292;
                    var13 += var17;
                    for (int var176 = -arg6; var176 < 0; ++var176) {
                        if (this.field5873[var20] > var11) {
                            super.field7376[var20] = arg7.field3799[(var12 >> 16) + var175];
                        }
                        ++var20;
                        var12 += var16;
                    }
                    var20 += var21;
                    var12 = var173;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mq", name = "G", descriptor = "()V", line = 1286)
    public final void method934() {
        super.field7348 = -super.field7352 + super.field7350;
        ++field5889;
        super.field7338 = super.field7357 - super.field7365;
        super.field7347 = super.field7374 - super.field7352;
        super.field7345 = -super.field7365 + super.field7367;
        for (int var1 = 0; ~var1 > ~super.field7362; ++var1) {
            class603 var5 = ((class231) super.field7366[var1]).field3010;
            var5.field8089 = -super.field7374 + super.field7352;
            var5.field8086 = -super.field7357 + super.field7365;
            var5.field8085 = -super.field7374 + super.field7350;
            var5.field8097 = -super.field7357 + super.field7367;
        }
        int var2 = super.field7357 * super.field7339 - -super.field7374;
        for (int var3 = super.field7357; super.field7367 > var3; ++var3) {
            for (int var4 = 0; ~var4 > ~super.field7362; ++var4) {
                ((class231) super.field7366[var4]).field3010.field8094[-super.field7357 + var3] = var2;
            }
            var2 += super.field7339;
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 1329)
    public final void method405(Canvas arg0) {
        ++field5896;
        class348 var2 = (class348) super.field7333.method3828((long) arg0.hashCode(), (byte) -91);
        if (var2 != null) {
            var2.method1566(-94);
            class348 var3 = class681.method3760(arg0, (byte) -99);
            super.field7333.method3832(var3, (long) arg0.hashCode(), 55);
            if (super.field7330 == arg0 && super.field7349 == null) {
                super.field7339 = var3.field4469;
                super.field7376 = var3.field4472;
                super.field7373 = var3.field4473;
                super.field7332 = var3;
                if (super.field7339 != this.field5882 || super.field7373 != this.field5902) {
                    this.field5882 = super.field7339;
                    this.field5902 = super.field7373;
                    this.field5873 = new int[this.field5902 * this.field5882];
                }
                this.method3102();
                return;
            }
        }
    }

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "(Z)V", line = 1366)
    public static void method2583(boolean arg0) {
        field5891 = null;
        if (arg0) {
            method2581(14);
        }
    }

    @OriginalMember(owner = "client!mq", name = "B", descriptor = "()V", line = 1376)
    public final void method322() {
        ++field5890;
        if (super.field7374 == 0 && ~super.field7350 == ~super.field7339 && ~super.field7357 == -1 && ~super.field7373 == ~super.field7367) {
            int var1 = this.field5873.length;
            int var2 = 7 & -var1 + var1;
            int var3 = 0;
            while (var3 < var2) {
                this.field5873[var3++] = Integer.MAX_VALUE;
                this.field5873[var3++] = Integer.MAX_VALUE;
                this.field5873[var3++] = Integer.MAX_VALUE;
                this.field5873[var3++] = Integer.MAX_VALUE;
                this.field5873[var3++] = Integer.MAX_VALUE;
                this.field5873[var3++] = Integer.MAX_VALUE;
                this.field5873[var3++] = Integer.MAX_VALUE;
                this.field5873[var3++] = Integer.MAX_VALUE;
            }
            while (~var1 < ~var3) {
                this.field5873[var3++] = Integer.MAX_VALUE;
            }
        } else {
            int var4 = super.field7350 - super.field7374;
            int var5 = -super.field7357 + super.field7367;
            int var6 = -var4 + super.field7339;
            int var7 = super.field7374 - -(super.field7357 * super.field7339);
            int var8 = var4 >> 3;
            int var9 = var4 & 7;
            int var10 = var7 - 1;
            for (int var11 = -var5; ~var11 > -1; ++var11) {
                if (~var8 < -1) {
                    int var12 = var8;
                    do {
                        ++var10;
                        this.field5873[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field5873[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field5873[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field5873[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field5873[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field5873[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field5873[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field5873[var10] = Integer.MAX_VALUE;
                        --var12;
                    } while (var12 > 0);
                }
                if (var9 > 0) {
                    int var13 = var9;
                    do {
                        ++var10;
                        this.field5873[var10] = Integer.MAX_VALUE;
                        --var13;
                    } while (~var13 < -1);
                }
                var10 += var6;
            }
        }
    }

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "(I)V", line = 1462)
    public final void method494(int arg0) {
        super.field7366[arg0].method3775(107, Thread.currentThread());
        ++field5884;
    }

    @OriginalMember(owner = "client!mq", name = "r", descriptor = "()V", line = 1473)
    public final void method336() {
        ++field5901;
        if (super.field7330 != null) {
            super.field7376 = super.field7332.field4472;
            super.field7339 = super.field7332.field4469;
            super.field7373 = super.field7332.field4473;
        } else {
            super.field7339 = 1;
            super.field7373 = 1;
            super.field7376 = null;
        }
        super.field7349 = null;
        this.method3102();
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "([Lba;Lq;[Lpo;I)V", line = 1498)
    public final void method491(class359[] arg0, class396 arg1, class524[] arg2, int arg3) {
        ++field5893;
        for (int var5 = 0; var5 < arg0.length; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method2049(arg1, arg2 == null ? null : arg2[var5], arg3);
            }
        }
    }

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "(Z)V", line = 1521)
    public final void method455(boolean arg0) {
        ++field5899;
        this.field5877 = arg0;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIIIIIIIII)V", line = 1529)
    public final void method457(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field5885;
        class231 var11 = (class231) this.method937(Thread.currentThread());
        class603 var12 = var11.field3010;
        var12.field8096 = ~arg0 > -1 || var12.field8085 < arg0 || ~arg2 > -1 || var12.field8085 < arg2 || arg4 < 0 || ~arg4 < ~var12.field8085;
        var12.field8091 = false;
        int var13 = arg1 - super.field7338;
        int var14 = arg4 - super.field7347;
        int var15 = arg0 - super.field7347;
        int var16 = arg3 - super.field7338;
        int var17 = arg5 - super.field7338;
        int var18 = arg2 - super.field7347;
        int var19 = arg6 >>> 24;
        if (~arg9 != -1 && (arg9 != 1 || var19 != 255)) {
            if (~arg9 == -2) {
                var12.field8092 = false;
                var12.field8087 = 255 - var19;
                var12.method3330(var13, var16, var17, var15, var18, var14, 100, 100, 100, arg6, arg7, arg8);
            } else {
                if (arg9 != 2) {
                    throw new IllegalArgumentException();
                }
                var12.field8087 = 128;
                var12.field8092 = true;
                var12.method3330(var13, var16, var17, var15, var18, var14, 100, 100, 100, arg6, arg7, arg8);
            }
        } else {
            var12.field8092 = false;
            var12.field8087 = 0;
            var12.method3330(var13, var16, var17, var15, var18, var14, 100, 100, 100, arg6, arg7, arg8);
        }
        var12.field8091 = true;
    }

    @OriginalMember(owner = "client!mq", name = "g", descriptor = "(I)V", line = 1583)
    public final void method413(int arg0) {
        super.field7362 = arg0;
        ++field5898;
        super.field7366 = new class231[super.field7362];
        for (int var2 = 0; super.field7362 > var2; ++var2) {
            super.field7366[var2] = new class231(this);
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lfm;IIII)V", line = 1601)
    public final void method936(class688 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5888;
        int var6 = arg0.field9483;
        int var8 = arg4 << 1;
        if (~var6 == 0) {
            this.method2580(arg1, arg0.field9476, -1979121391, 1, arg3, arg4, arg2);
        } else {
            if (super.field7378 != var6) {
                class468 var9 = (class468) super.field7361.method1221((long) var6, true);
                if (var9 == null) {
                    int[] var10 = this.method3103(var6);
                    if (var10 == null) {
                        return;
                    }
                    int var11 = this.method3109(var6) ? 64 : 128;
                    var9 = this.method428(var10, 0, var11, var11, var11);
                    super.field7361.method1230((byte) 91, (long) var6, var9);
                }
                super.field7379 = var9;
                super.field7378 = var6;
            }
            ++var8;
            this.method2582(0, arg0.field9476, var8, arg3, false, -arg4 + arg1, var8, (class298) super.field7379, -arg4 + arg2, 1);
        }
    }

    @OriginalMember(owner = "client!mq", name = "n", descriptor = "(I)V", line = 1646)
    public static final void method2584(int arg0) {
        if (arg0 < 26) {
            field5891 = null;
        }
        ++field5895;
        class162.field1917.method1218(114);
        class185.field2189.method1218(120);
        class89.field1161.method1218(101);
        class106.field1334.method1218(116);
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIIIIII)V", line = 1660)
    public final void method448(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field5883;
        class231 var8 = (class231) this.method937(Thread.currentThread());
        class603 var9 = var8.field3010;
        int var10 = -arg0 + arg2;
        int var11 = arg3 - arg1;
        int var12 = var10 >= 0 ? var10 : -var10;
        int var13 = var11 < 0 ? -var11 : var11;
        int var14 = var12;
        if (var13 > var12) {
            var14 = var13;
        }
        if (~var14 != -1) {
            int var15 = (var10 << 16) / var14;
            int var16 = (var11 << 16) / var14;
            int var17 = (var15 >> 16) + var10;
            int var18 = (var16 >> 16) + var11;
            if (~var15 > ~var16) {
                var16 = -var16;
            } else {
                var15 = -var15;
            }
            int var19 = arg5 * var16 >> 17;
            int var20 = arg5 * var16 + 1 >> 17;
            int var21 = arg5 * var15 >> 17;
            int var22 = arg5 * var15 - -1 >> 17;
            int var23 = arg0 - var9.method3326();
            int var24 = arg1 - var9.method3318();
            int var25 = var19 + var23;
            int var26 = var23 - var20;
            int var27 = var17 + var23 - var20;
            int var28 = var17 + var23 + var19;
            int var29 = var21 + var24;
            int var30 = -var22 + var24;
            int var31 = var18 + var24 + -var22;
            int var32 = var18 + var21 + var24;
            if (~arg6 == -1) {
                var9.field8087 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field8087 = -(arg4 >>> 24) + 255;
            }
            var9.field8096 = ~var25 > -1 || var25 > var9.field8085 || ~var26 > -1 || ~var26 < ~var9.field8085 || var27 < 0 || ~var27 < ~var9.field8085;
            var9.method3312(var29, var30, var31, var25, var26, var27, 0, 0, 0, arg4);
            var9.field8096 = ~var25 > -1 || ~var25 < ~var9.field8085 || var27 < 0 || ~var9.field8085 > ~var27 || var28 < 0 || ~var9.field8085 > ~var28;
            var9.method3312(var29, var31, var32, var25, var27, var28, 0, 0, 0, arg4);
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Ljava/lang/Runnable;)Lcm;", line = 1738)
    public final class683 method937(Runnable arg0) {
        ++field5887;
        for (int var2 = 0; var2 < super.field7362; ++var2) {
            if (super.field7366[var2].field9307 == arg0) {
                return super.field7366[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(IIIIIIIIII)V", line = 1758)
    public final void method935(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field5879;
        if (~arg3 != -1 && arg4 != 0) {
            if (arg6 != 65535 && !super.field8781.method2718(arg6, (byte) 72).field1818) {
                if (super.field7378 != arg6) {
                    class468 var11 = (class468) super.field7361.method1221((long) arg6, true);
                    if (var11 == null) {
                        int[] var12 = this.method3103(arg6);
                        if (var12 == null) {
                            return;
                        }
                        int var13 = this.method3109(arg6) ? 64 : 128;
                        var11 = this.method428(var12, 0, var13, var13, var13);
                        super.field7361.method1230((byte) 7, (long) arg6, var11);
                    }
                    super.field7379 = var11;
                    super.field7378 = arg6;
                }
                this.method2582(arg8, arg7, arg4 << 1, arg2, false, -arg3 + arg0, arg3 << 1, (class298) super.field7379, arg1 - arg4, arg9);
            } else {
                this.method2580(arg0, arg7, -1979121391, arg9, arg2, arg3, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "([Lba;Lig;Lq;[Lpo;I)V", line = 1797)
    public final void method480(class359[] arg0, class228 arg1, class396 arg2, class524[] arg3, int arg4) {
        ++field5876;
        for (int var6 = 0; var6 < arg0.length; ++var6) {
            if (arg0[var6] != null) {
                ((class651) arg0[var6]).method3638(arg2, arg3 == null ? null : arg3[var6], arg1, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "(II)I", line = 1815)
    public static final int method2585(int arg0, int arg1) {
        ++field5880;
        if (arg0 <= 36) {
            method2583(true);
        }
        return arg1 >>> 8;
    }
}
