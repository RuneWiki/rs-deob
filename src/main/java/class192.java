import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class192 extends class182 {

    @OriginalMember(owner = "client!ru", name = "C", descriptor = "[B")
    public byte[] field2261;

    @OriginalMember(owner = "client!ru", name = "z", descriptor = "I")
    public int field2258;

    @OriginalMember(owner = "client!ru", name = "A", descriptor = "I")
    public int field2259;

    @OriginalMember(owner = "client!ru", name = "B", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!ru", name = "D", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!ru", name = "E", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!ru", name = "F", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!ru", name = "G", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!ru", name = "H", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!ru", name = "I", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!ru", name = "J", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!ru", name = "K", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!ru", name = "L", descriptor = "I")
    public int field2270;

    @OriginalMember(owner = "client!ru", name = "M", descriptor = "I")
    public int field2271;

    @OriginalMember(owner = "client!ru", name = "N", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!ru", name = "O", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(III)Z", line = 3)
    public final boolean method1163(int arg0, int arg1, int arg2) {
        if (arg0 == 13793) {
            field2262++;
            return this.field2261.length >= arg1 * arg2;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(IIII)V", line = 21)
    public static final void method1164(int arg0, int arg1, int arg2, int arg3) {
        field2264++;
        if (class308.field3828 == arg1 && class71.field759 == arg0 && class649.field9281 == arg3) {
            return;
        }
        class568.field8076 = true;
        class71.field759 = arg0;
        class649.field9281 = arg3;
        if (arg2 != -2124701936) {
            return;
        }
        class308.field3828 = arg1;
        double var4 = -((double) (arg1 * 2) * 3.141592653589793D) / 16384.0D;
        double var6 = -((double) (arg0 * 2) * 3.141592653589793D) / 16384.0D;
        double var8 = Math.cos(var6);
        double var10 = Math.sin(var6);
        double var12 = Math.cos(var4);
        double var14 = Math.sin(var4);
        class279.field3428 = var14;
        class480.field6865 = var8 * var12;
        class631.field9074 = -var10 * var12;
        class12.field101 = var10 * var14;
        class598.field8521 = var10;
        class312.field3872 = var12;
        class379.field5186 = -var8 * var14;
        class66.field671 = var8;
        class535.field7739 = 0.0D;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(IIIIB)V", line = 86)
    public static final void method1165(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (class224.field2571 <= arg0 && arg0 <= class578.field8182) {
            int var5 = class211.method1255(class338.field4355, arg3, false, class744.field10385);
            int var6 = class211.method1255(class338.field4355, arg1, false, class744.field10385);
            class687.method3884(var5, -1699468752, arg2, var6, arg0);
        }
        field2273++;
        if (arg4 >= -73) {
            method1165(-73, -62, -50, 30, (byte) 96);
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(IIIII)V", line = 104)
    public final void method1166(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != -1778027312) {
            this.method1171(-10);
        }
        this.field2259 = arg4 - arg3;
        this.field2270 = arg3;
        this.field2258 = arg1 - arg2;
        field2263++;
        this.field2271 = arg2;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(I[II[[B[[BI[B[I)I", line = 123)
    public static final int method1167(int arg0, int[] arg1, int arg2, byte[][] arg3, byte[][] arg4, int arg5, byte[] arg6, int[] arg7) {
        field2265++;
        int var8 = arg7[arg2];
        int var9 = arg1[arg2] + var8;
        int var10 = arg7[arg0];
        int var11 = arg1[arg0] + var10;
        int var12 = var8;
        if (var10 > var8) {
            var12 = var10;
        }
        int var13 = var9;
        if (var9 > var11) {
            var13 = var11;
        }
        int var14 = arg6[arg2] & 0xFF;
        if (var14 > (arg6[arg0] & 0xFF)) {
            var14 = arg6[arg0] & 0xFF;
        }
        byte[] var15 = arg3[arg2];
        byte[] var16 = arg4[arg0];
        int var17 = var12 - var8;
        int var18 = var12 - var10;
        if (arg5 >= -108) {
            field2266 = -118;
        }
        for (int var19 = var12; var19 < var13; var19++) {
            int var20 = var16[var18++] + var15[var17++];
            if (var20 < var14) {
                var14 = var20;
            }
        }
        return -var14;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(IFFFIIFLrp;IIF)[B", line = 181)
    public static final byte[] method1168(int arg0, float arg1, float arg2, float arg3, int arg4, int arg5, float arg6, class435 arg7, int arg8, int arg9, float arg10) {
        if (arg0 >= -70) {
            method1164(-19, -3, -86, 40);
        }
        field2269++;
        byte[] var11 = new byte[arg4 * arg8 * arg5];
        class533.method3130(arg9, arg7, 0, 0, arg10, arg6, arg1, arg5, arg8, arg2, arg3, arg4, var11);
        return var11;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(IIIIIII)V", line = 196)
    public final void method1169(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2267++;
        int var8 = 0;
        if (arg4 != arg5) {
            var8 = (arg2 - arg3 << 16) / (arg4 - arg5);
        }
        int var9 = 0;
        if (arg4 != arg6) {
            var9 = (arg0 - arg2 << 16) / (arg6 - arg4);
        }
        int var10 = 0;
        if (arg1 >= -22) {
            return;
        }
        if (arg5 != arg6) {
            var10 = (arg3 - arg0 << 16) / (arg5 - arg6);
        }
        if (arg5 <= arg4 && arg6 >= arg5) {
            if (arg6 <= arg4) {
                int var11;
                int var12 = var11 = arg3 << 16;
                if (arg5 < 0) {
                    var12 -= arg5 * var10;
                    var11 -= arg5 * var8;
                    arg5 = 0;
                }
                int var13 = arg0 << 16;
                if (arg6 < 0) {
                    var13 -= arg6 * var9;
                    arg6 = 0;
                }
                if ((arg5 == arg6 || var8 <= var10) && (arg5 != arg6 || var8 >= var9)) {
                    int var17 = arg4 - arg6;
                    int var18 = arg6 - arg5;
                    int var19 = this.field2259 * arg5;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class57.method313(0, var19, this.field2261, var11 >> 16, var13 >> 16, -113);
                                var11 += var8;
                                var19 += this.field2259;
                                var13 += var9;
                            }
                        }
                        class57.method313(0, var19, this.field2261, var11 >> 16, var12 >> 16, -112);
                        var11 += var8;
                        var19 += this.field2259;
                        var12 += var10;
                    }
                } else {
                    int var14 = arg4 - arg6;
                    int var15 = arg6 - arg5;
                    int var16 = this.field2259 * arg5;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class57.method313(0, var16, this.field2261, var13 >> 16, var11 >> 16, -95);
                                var11 += var8;
                                var13 += var9;
                                var16 += this.field2259;
                            }
                        }
                        class57.method313(0, var16, this.field2261, var12 >> 16, var11 >> 16, -100);
                        var12 += var10;
                        var11 += var8;
                        var16 += this.field2259;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg3 << 16;
                if (arg5 < 0) {
                    var21 -= arg5 * var10;
                    var20 -= arg5 * var8;
                    arg5 = 0;
                }
                int var22 = arg2 << 16;
                if (arg4 < 0) {
                    var22 -= arg4 * var9;
                    arg4 = 0;
                }
                if (arg4 != arg5 && var8 > var10 || arg4 == arg5 && var9 < var10) {
                    int var23 = arg6 - arg4;
                    int var24 = arg4 - arg5;
                    int var25 = this.field2259 * arg5;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class57.method313(0, var25, this.field2261, var21 >> 16, var22 >> 16, -115);
                                var22 += var9;
                                var21 += var10;
                                var25 += this.field2259;
                            }
                        }
                        class57.method313(0, var25, this.field2261, var21 >> 16, var20 >> 16, -101);
                        var21 += var10;
                        var25 += this.field2259;
                        var20 += var8;
                    }
                } else {
                    int var26 = arg6 - arg4;
                    int var27 = arg4 - arg5;
                    int var28 = this.field2259 * arg5;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class57.method313(0, var28, this.field2261, var22 >> 16, var21 >> 16, -120);
                                var22 += var9;
                                var28 += this.field2259;
                                var21 += var10;
                            }
                        }
                        class57.method313(0, var28, this.field2261, var20 >> 16, var21 >> 16, -127);
                        var28 += this.field2259;
                        var20 += var8;
                        var21 += var10;
                    }
                }
            }
        } else if (arg6 >= arg4) {
            if (arg5 <= arg6) {
                int var29;
                int var30 = var29 = arg2 << 16;
                int var31 = arg3 << 16;
                if (arg4 < 0) {
                    var29 -= arg4 * var9;
                    var30 -= arg4 * var8;
                    arg4 = 0;
                }
                if (arg5 < 0) {
                    var31 -= arg5 * var10;
                    arg5 = 0;
                }
                if (var8 >= var9) {
                    int var32 = arg6 - arg5;
                    int var33 = arg5 - arg4;
                    int var34 = this.field2259 * arg4;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class57.method313(0, var34, this.field2261, var29 >> 16, var31 >> 16, -124);
                                var29 += var9;
                                var34 += this.field2259;
                                var31 += var10;
                            }
                        }
                        class57.method313(0, var34, this.field2261, var29 >> 16, var30 >> 16, -123);
                        var30 += var8;
                        var34 += this.field2259;
                        var29 += var9;
                    }
                } else {
                    int var35 = arg6 - arg5;
                    int var36 = arg5 - arg4;
                    int var37 = this.field2259 * arg4;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class57.method313(0, var37, this.field2261, var31 >> 16, var29 >> 16, -108);
                                var29 += var9;
                                var37 += this.field2259;
                                var31 += var10;
                            }
                        }
                        class57.method313(0, var37, this.field2261, var30 >> 16, var29 >> 16, -122);
                        var29 += var9;
                        var37 += this.field2259;
                        var30 += var8;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg2 << 16;
                int var40 = arg0 << 16;
                if (arg4 < 0) {
                    var39 -= arg4 * var8;
                    var38 -= arg4 * var9;
                    arg4 = 0;
                }
                if (arg6 < 0) {
                    var40 -= arg6 * var10;
                    arg6 = 0;
                }
                if (arg4 != arg6 && var9 > var8 || arg4 == arg6 && var10 < var8) {
                    int var41 = arg5 - arg6;
                    int var42 = arg6 - arg4;
                    int var43 = this.field2259 * arg4;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class57.method313(0, var43, this.field2261, var39 >> 16, var40 >> 16, -108);
                                var39 += var8;
                                var43 += this.field2259;
                                var40 += var10;
                            }
                        }
                        class57.method313(0, var43, this.field2261, var39 >> 16, var38 >> 16, -124);
                        var39 += var8;
                        var43 += this.field2259;
                        var38 += var9;
                    }
                } else {
                    int var44 = arg5 - arg6;
                    int var45 = arg6 - arg4;
                    int var46 = this.field2259 * arg4;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class57.method313(0, var46, this.field2261, var40 >> 16, var39 >> 16, -94);
                                var40 += var10;
                                var46 += this.field2259;
                                var39 += var8;
                            }
                        }
                        class57.method313(0, var46, this.field2261, var38 >> 16, var39 >> 16, -102);
                        var46 += this.field2259;
                        var38 += var9;
                        var39 += var8;
                    }
                }
            }
        } else if (arg5 < arg4) {
            int var47;
            int var48 = var47 = arg0 << 16;
            if (arg6 < 0) {
                var48 -= arg6 * var9;
                var47 -= arg6 * var10;
                arg6 = 0;
            }
            int var49 = arg3 << 16;
            if (arg5 < 0) {
                var49 -= arg5 * var8;
                arg5 = 0;
            }
            if (var9 >= var10) {
                int var50 = arg4 - arg5;
                int var51 = arg5 - arg6;
                int var52 = this.field2259 * arg6;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class57.method313(0, var52, this.field2261, var49 >> 16, var48 >> 16, -102);
                            var49 += var8;
                            var52 += this.field2259;
                            var48 += var9;
                        }
                    }
                    class57.method313(0, var52, this.field2261, var47 >> 16, var48 >> 16, -122);
                    var48 += var9;
                    var47 += var10;
                    var52 += this.field2259;
                }
            } else {
                int var53 = arg4 - arg5;
                int var54 = arg5 - arg6;
                int var55 = this.field2259 * arg6;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class57.method313(0, var55, this.field2261, var48 >> 16, var49 >> 16, -123);
                            var49 += var8;
                            var48 += var9;
                            var55 += this.field2259;
                        }
                    }
                    class57.method313(0, var55, this.field2261, var48 >> 16, var47 >> 16, -120);
                    var48 += var9;
                    var55 += this.field2259;
                    var47 += var10;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg0 << 16;
            if (arg6 < 0) {
                var56 -= arg6 * var10;
                var57 -= arg6 * var9;
                arg6 = 0;
            }
            int var58 = arg2 << 16;
            if (arg4 < 0) {
                var58 -= arg4 * var8;
                arg4 = 0;
            }
            if (var10 <= var9) {
                int var59 = arg5 - arg4;
                int var60 = arg4 - arg6;
                int var61 = this.field2259 * arg6;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class57.method313(0, var61, this.field2261, var56 >> 16, var58 >> 16, -123);
                            var61 += this.field2259;
                            var58 += var8;
                            var56 += var10;
                        }
                    }
                    class57.method313(0, var61, this.field2261, var56 >> 16, var57 >> 16, -124);
                    var56 += var10;
                    var61 += this.field2259;
                    var57 += var9;
                }
            } else {
                int var62 = arg5 - arg4;
                int var63 = arg4 - arg6;
                int var64 = this.field2259 * arg6;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class57.method313(0, var64, this.field2261, var58 >> 16, var56 >> 16, -127);
                            var64 += this.field2259;
                            var56 += var10;
                            var58 += var8;
                        }
                    }
                    class57.method313(0, var64, this.field2261, var57 >> 16, var56 >> 16, -100);
                    var57 += var9;
                    var64 += this.field2259;
                    var56 += var10;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lda;ZILha;Ljava/lang/String;Lur;)V", line = 636)
    public static final void method1170(class59 arg0, boolean arg1, int arg2, class58 arg3, String arg4, class535 arg5) {
        field2260++;
        boolean var6 = !class73.field769 || class251.method1502(-87);
        if (!var6) {
            return;
        }
        if (class73.field769 && var6) {
            class535 var7 = class448.field6465;
            class59 var8 = arg3.method373(var7, class215.field2498, true);
            int var9 = var7.method3141(null, (byte) -59, arg4, 250);
            int var10 = var7.method3143(250, var7.field7729, -1, arg4, null);
            int var11 = class304.field3797.field1708;
            int var12 = var11 + 4;
            int var13 = var12 * 2 + var10;
            int var14 = var12 * 2 + var9;
            if (class160.field1779 > var13) {
                var13 = class160.field1779;
            }
            if (class299.field3721 > var14) {
                var14 = class299.field3721;
            }
            int var15 = class251.field3037.method2395(class12.field92, (byte) -48, var14) + class498.field7025;
            int var16 = class598.field8519.method1280(true, class181.field2143, var13) + class484.field6890;
            if (class397.field5443) {
                var15 += class389.method2400(41);
                var16 += class752.method4192(1);
            }
            arg3.method434(class512.field7303, false).method513(var15 + class707.field9976.field1708, var16 - -class707.field9976.field1706, var14 - class707.field9976.field1708 * 2, var13 - class707.field9976.field1706 * 2, 1, 0, 0);
            arg3.method434(class707.field9976, true).method824(var15, var16);
            class707.field9976.method947();
            arg3.method434(class707.field9976, true).method824(var14 + var15 - var11, var16);
            class707.field9976.method955();
            arg3.method434(class707.field9976, true).method824(var15 + var14 - var11, var13 + var16 + -var11);
            class707.field9976.method947();
            arg3.method434(class707.field9976, true).method824(var15, var13 + var16 - var11);
            class707.field9976.method955();
            arg3.method434(class304.field3797, true).method819(var15, var16 + class707.field9976.field1706, var11, var13 - (class707.field9976.field1706 * 2));
            class304.field3797.method949();
            arg3.method434(class304.field3797, true).method819(var15 + class707.field9976.field1708, var16, var14 - (class707.field9976.field1708 * 2), var11);
            class304.field3797.method949();
            arg3.method434(class304.field3797, true).method819(var14 + var15 - var11, class707.field9976.field1706 + var16, var11, var13 - (class707.field9976.field1706 * 2));
            class304.field3797.method949();
            arg3.method434(class304.field3797, true).method819(var15 + class707.field9976.field1708, -var11 + var16 + var13, var14 - class707.field9976.field1708 * 2, var11);
            class304.field3797.method949();
            var8.method459(-1, 1, null, null, var14 - var12 * 2, null, 1, 0, class366.field4688 | 0xFF000000, var12 + var15, 0, 0, arg4, var13 - (var12 * 2), var16 - -var12, 0);
            class119.method771(var13, (byte) 115, var14, var15, var16);
        } else {
            int var17 = arg5.method3141(null, (byte) -59, arg4, 250);
            int var18 = arg5.method3136(null, arg4, -102, 250) * 13;
            byte var19 = 4;
            int var20 = var19 + 6;
            int var21 = var19 + 6;
            arg3.method370(var20 - var19, -var19 + var21, var17 + var19 + var19, var18 - -var19 + var19, -16777216, 0);
            arg3.method399(var20 - var19, -var19 + var21, var19 + var19 + var17, var18 - -var19 + var19, -1, 0);
            arg0.method459(-1, 1, null, null, var17, null, 1, 0, -1, var20, 0, 0, arg4, var18, var21, arg2 ^ 0xFFFFE07B);
            class119.method771(var19 + var19 + var18, (byte) -116, var17 + var19 + var19, var20 - var19, var21 - var19);
        }
        if (arg2 != -8069 || !arg1) {
            return;
        }
        try {
            if (class397.field5443) {
                class178.method1098(false);
            } else {
                arg3.method388((byte) -117);
            }
        } catch (class266 var22) {
        }
    }

    @OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Lln;II)V", line = 738)
    public class192(class377 arg0, int arg1, int arg2) {
        this.field2261 = new byte[arg1 * arg2];
    }

    @OriginalMember(owner = "client!ru", name = "f", descriptor = "(I)V", line = 748)
    public final void method1171(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field2272++;
        int var2 = -1;
        int var3 = this.field2261.length - 8;
        while (var3 > var2) {
            var2++;
            this.field2261[var2] = 0;
            var2++;
            this.field2261[var2] = 0;
            var2++;
            this.field2261[var2] = 0;
            var2++;
            this.field2261[var2] = 0;
            var2++;
            this.field2261[var2] = 0;
            var2++;
            this.field2261[var2] = 0;
            var2++;
            this.field2261[var2] = 0;
            var2++;
            this.field2261[var2] = 0;
        }
        while (var2 < (this.field2261.length - 1)) {
            var2++;
            this.field2261[var2] = 0;
        }
    }
}
