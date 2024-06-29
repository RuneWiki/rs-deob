import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class646 extends class89 {

    @OriginalMember(owner = "client!gl", name = "L", descriptor = "I")
    public int field9083 = 99;

    @OriginalMember(owner = "client!gl", name = "N", descriptor = "[[B")
    public static byte[][] field9085 = new byte[50][];

    @OriginalMember(owner = "client!gl", name = "P", descriptor = "[I")
    public static int[] field9087 = new int[8];

    @OriginalMember(owner = "client!gl", name = "O", descriptor = "Lil;")
    public static class68 field9086 = new class68(16);

    @OriginalMember(owner = "client!gl", name = "Q", descriptor = "Lfh;")
    public static class266 field9088 = new class266(14, 7);

    @OriginalMember(owner = "client!gl", name = "E", descriptor = "I")
    public static int field9076;

    @OriginalMember(owner = "client!gl", name = "F", descriptor = "I")
    public static int field9077;

    @OriginalMember(owner = "client!gl", name = "G", descriptor = "I")
    public static int field9078;

    @OriginalMember(owner = "client!gl", name = "H", descriptor = "I")
    public static int field9079;

    @OriginalMember(owner = "client!gl", name = "I", descriptor = "I")
    public static int field9080;

    @OriginalMember(owner = "client!gl", name = "J", descriptor = "I")
    public static int field9081;

    @OriginalMember(owner = "client!gl", name = "K", descriptor = "I")
    public static int field9082;

    @OriginalMember(owner = "client!gl", name = "M", descriptor = "I")
    public static int field9084;

    // $FF: synthetic field
    @OriginalMember(owner = "client!gl", name = "R", descriptor = "Ljava/lang/Class;")
    public static Class field9089;

    // $FF: synthetic method
    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3614(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IZLr;I[B[Lwd;)V", line = 4)
    public final void method3605(int arg0, boolean arg1, class566 arg2, int arg3, byte[] arg4, class356[] arg5) {
        ++field9082;
        class630 var7 = new class630(arg4);
        int var8 = -1;
        if (!arg1) {
            this.method3610(1, (class566) null, -100, (class356[]) null, 8, -77, (byte[]) null, 21, 121, -111, 22);
        }
        while (true) {
            int var9 = var7.method3516((byte) -16);
            if (~var9 == -1) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method3504(-13829);
                if (var11 == 0) {
                    break;
                }
                var10 += var11 + -1;
                int var12 = 63 & var10;
                int var13 = var10 >> 6 & 63;
                int var14 = var10 >> 12;
                int var15 = var7.method3501(-9268);
                int var16 = var15 >> 2;
                int var17 = 3 & var15;
                int var18 = arg0 + var13;
                int var19 = arg3 + var12;
                if (var18 > 0 && var19 > 0 && super.field1253 + -1 > var18 && ~(super.field1265 + -1) < ~var19) {
                    class356 var20 = null;
                    if (!super.field1238) {
                        int var21 = var14;
                        if (~(class10.field190[1][var18][var19] & 2) == -3) {
                            var21 = var14 - 1;
                        }
                        if (var21 >= 0) {
                            var20 = arg5[var21];
                        }
                    }
                    this.method3613(var17, var20, var16, arg2, -1, var14, -12, var8, var19, var14, var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILwd;IIIILr;)V", line = 78)
    public final void method3606(int arg0, class356 arg1, int arg2, int arg3, int arg4, int arg5, class566 arg6) {
        ++field9080;
        class339 var8 = null;
        if (~arg4 == -1) {
            var8 = (class339) class312.method1803(arg3, arg0, arg5);
        }
        if (arg4 == 1) {
            var8 = (class339) class480.method2615(arg3, arg0, arg5);
        }
        if (arg4 == 2) {
            var8 = (class339) class700.method3933(arg3, arg0, arg5, field9089 != null ? field9089 : (field9089 = method3614("vda")));
        }
        if (~arg4 == -4) {
            var8 = (class339) class279.method1586(arg3, arg0, arg5);
        }
        if (arg2 != 99) {
            field9088 = null;
        }
        if (var8 != null) {
            class441 var9 = class428.field5352.method3138((byte) 81, var8.method65((byte) 127));
            int var10 = var8.method74((byte) 42);
            int var11 = var8.method78((byte) 91);
            if (var9.method2353((byte) 126)) {
                class154.method879(arg5, arg3, arg0, true, var9);
            }
            if (var8.method64(3755)) {
                var8.method80((byte) -114, arg6);
            }
            if (~arg4 != -1) {
                if (~arg4 != -2) {
                    if (~arg4 != -3) {
                        if (arg4 == 3) {
                            class26.method182(arg3, arg0, arg5);
                            if (var9.field5551 == 1) {
                                arg1.method1968(arg0, 116, arg5);
                                return;
                            }
                        }
                        return;
                    }
                    class3.method19(arg3, arg0, arg5, field9089 != null ? field9089 : (field9089 = method3614("vda")));
                    if (var9.field5551 != 0 && var9.field5525 + arg0 < super.field1253 && ~(var9.field5525 + arg5) > ~super.field1265 && var9.field5534 + arg0 < super.field1253 && ~(var9.field5534 + arg5) > ~super.field1265) {
                        arg1.method1965(-99, var9.field5534, var11, var9.field5525, var9.field5567, arg0, !var9.field5523, arg5);
                        return;
                    }
                } else {
                    class213.method1263(arg3, arg0, arg5);
                }
                return;
            }
            class373.method2032(arg3, arg0, arg5);
            if (~var9.field5551 != -1) {
                arg1.method1966(!var9.field5523, var10, arg5, -125, arg0, var9.field5567, var11);
            }
            if (var9.field5572 == 1) {
                if (~var11 != -1) {
                    if (~var11 == -2) {
                        class462.method2458(arg5 + 1, arg0, 2, arg3, (byte) 41);
                        return;
                    }
                    if (~var11 != -3) {
                        if (~var11 == -4) {
                            class462.method2458(arg5, arg0, 2, arg3, (byte) 41);
                            return;
                        }
                    } else {
                        class462.method2458(arg5, arg0 + 1, 1, arg3, (byte) 41);
                    }
                    return;
                }
                class462.method2458(arg5, arg0, 1, arg3, (byte) 41);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)V", line = 181)
    public static void method3607(int arg0) {
        int var1 = -82 / ((arg0 - 50) / 61);
        field9088 = null;
        field9086 = null;
        field9087 = null;
        field9085 = null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZBLr;)V", line = 194)
    public final void method3608(boolean arg0, byte arg1, class566 arg2) {
        class352.method1933();
        ++field9084;
        if (!arg0) {
            if (~super.field1255 < -2) {
                for (int var4 = 0; ~var4 > ~super.field1253; ++var4) {
                    for (int var5 = 0; var5 < super.field1265; ++var5) {
                        if ((class10.field190[1][var4][var5] & 2) == 2) {
                            class610.method3334(var4, var5);
                        }
                    }
                }
            }
            for (int var6 = 0; ~var6 > ~super.field1255; ++var6) {
                for (int var7 = 0; ~var7 >= ~super.field1265; ++var7) {
                    for (int var8 = 0; ~var8 >= ~super.field1253; ++var8) {
                        if ((4 & super.field1258[var6][var8][var7]) != 0) {
                            int var9 = var8;
                            int var10 = var8;
                            int var11 = var7;
                            int var12 = var7;
                            while (~var11 < -1 && (super.field1258[var6][var8][var11 + -1] & 4) != 0 && -var11 + var12 < 10) {
                                --var11;
                            }
                            while (var12 < super.field1265 && ~(super.field1258[var6][var8][var12 - -1] & 4) != -1 && ~(var12 - var11) > -11) {
                                ++var12;
                            }
                            label118: while (~var9 < -1 && -var9 + var10 < 10) {
                                for (int var13 = var11; var13 <= var12; ++var13) {
                                    if ((super.field1258[var6][var9 - 1][var13] & 4) == 0) {
                                        break label118;
                                    }
                                }
                                --var9;
                            }
                            label105: while (~super.field1253 < ~var10 && -var9 + var10 < 10) {
                                for (int var14 = var11; var12 >= var14; ++var14) {
                                    if (~(4 & super.field1258[var6][var10 + 1][var14]) == -1) {
                                        break label105;
                                    }
                                }
                                ++var10;
                            }
                            if ((-var11 - -1 + var12) * (var10 + 1 + -var9) >= 4) {
                                int var15 = super.field1245[var6][var9][var11];
                                class426.method2263(var9 << 9, var6, 4, (var12 << 9) + 512, var11 << 9, arg1 + 14512, (var10 << 9) + 512, var15, var15);
                                for (int var16 = var9; ~var16 >= ~var10; ++var16) {
                                    for (int var17 = var11; ~var17 >= ~var12; ++var17) {
                                        super.field1258[var6][var16][var17] = (byte) class695.method3921(super.field1258[var6][var16][var17], -5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class574.method3166((byte) -126);
        }
        super.field1258 = null;
        if (arg1 != 45) {
            method3607(72);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lr;ILes;[III)V", line = 333)
    public final void method3609(class566 arg0, int arg1, class630 arg2, int[] arg3, int arg4, int arg5) {
        ++field9076;
        if (!super.field1238) {
            if (arg4 != 6714) {
                this.method3609((class566) null, 24, (class630) null, (int[]) null, 110, 5);
            }
            boolean var7 = false;
            class424 var8 = null;
            if (arg3 != null) {
                arg3[0] = -1;
            }
            while (true) {
                while (~arg2.field8804.length < ~arg2.field8812) {
                    int var18 = arg2.method3501(arg4 + -15982);
                    if (~var18 == -1) {
                        var8 = new class424(arg2);
                    } else if (var18 == 1) {
                        int var19 = arg2.method3501(-9268);
                        if (var19 > 0) {
                            for (int var20 = 0; ~var19 < ~var20; ++var20) {
                                class378 var21 = new class378(arg0, arg2, 2);
                                if (~var21.field4778 == -32) {
                                    class599 var22 = class279.field3504.method1176(true, arg2.method3470(13111));
                                    var21.method2051(var22.field8410, var22.field8409, var22.field8412, 10236, var22.field8406);
                                }
                                if (arg0.method997() > 0) {
                                    class332 var23 = var21.field4779;
                                    int var24 = var23.method1886(true) - -(arg5 << 9);
                                    int var25 = var23.method1885((byte) 119) + (arg1 << 9);
                                    int var26 = var24 >> 9;
                                    int var27 = var25 >> 9;
                                    if (~var26 <= -1 && ~var27 <= -1 && ~super.field1253 < ~var26 && ~var27 > ~super.field1265) {
                                        var23.method2(var24, var25, (byte) -23, super.field1245[var21.field4781][var26][var27] - var23.method1888(-51));
                                        class411.method2179(var21);
                                    }
                                }
                            }
                        }
                    } else if (var18 == 2) {
                        if (var8 == null) {
                            var8 = new class424();
                        }
                        var8.method2251(arg4 ^ 6706, arg2);
                    } else if (var18 == 128) {
                        if (arg3 == null) {
                            arg2.field8812 += 10;
                        } else {
                            arg3[0] = arg2.method3470(13111);
                            arg3[1] = arg2.method3510(class688.method3877(arg4, 6682));
                            arg3[2] = arg2.method3510(class688.method3877(arg4, 6779));
                            arg3[3] = arg2.method3510(arg4 + -6629);
                            arg3[4] = arg2.method3470(13111);
                        }
                    } else {
                        if (~var18 != -130) {
                            throw new IllegalStateException("");
                        }
                        if (super.field1259 == null) {
                            super.field1259 = new byte[4][][];
                        }
                        for (int var28 = 0; var28 < 4; ++var28) {
                            byte var29 = arg2.method3480(-20933);
                            if (var29 == 0 && super.field1259[var28] != null) {
                                int var30 = arg5;
                                int var31 = arg5 + 64;
                                int var32 = arg1;
                                if (arg5 >= 0) {
                                    if (arg5 >= super.field1253) {
                                        var30 = super.field1253;
                                    }
                                } else {
                                    var30 = 0;
                                }
                                if (~arg1 > -1) {
                                    var32 = 0;
                                } else if (~arg1 <= ~super.field1265) {
                                    var32 = super.field1265;
                                }
                                if (~var31 > -1) {
                                    var31 = 0;
                                } else if (~super.field1253 >= ~var31) {
                                    var31 = super.field1253;
                                }
                                int var33 = arg1 + 64;
                                if (var33 >= 0) {
                                    if (super.field1265 <= var33) {
                                        var33 = super.field1265;
                                    }
                                } else {
                                    var33 = 0;
                                }
                                while (~var30 > ~var31) {
                                    while (~var32 > ~var33) {
                                        super.field1259[var28][var30][var32] = 0;
                                        ++var32;
                                    }
                                    ++var30;
                                }
                            } else if (~var29 == -2) {
                                if (super.field1259[var28] == null) {
                                    super.field1259[var28] = new byte[super.field1253 + 1][super.field1265 + 1];
                                }
                                for (int var34 = 0; var34 < 64; var34 += 4) {
                                    for (int var35 = 0; var35 < 64; var35 += 4) {
                                        byte var36 = arg2.method3480(-20933);
                                        for (int var37 = arg5 + var34; ~var37 > ~(arg5 + var34 + 4); ++var37) {
                                            for (int var38 = var35 - -arg1; arg1 + 4 + var35 > var38; ++var38) {
                                                if (~var37 <= -1 && var37 < super.field1253 && ~var38 <= -1 && ~super.field1265 < ~var38) {
                                                    super.field1259[var28][var37][var38] = var36;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (~var29 == -3) {
                                if (super.field1259[var28] == null) {
                                    super.field1259[var28] = new byte[super.field1253 + 1][super.field1265 + 1];
                                }
                                if (var28 > 0) {
                                    int var39 = arg5;
                                    int var40 = arg5 - -64;
                                    int var41 = arg1;
                                    if (~var40 > -1) {
                                        var40 = 0;
                                    } else if (super.field1253 <= var40) {
                                        var40 = super.field1253;
                                    }
                                    if (~arg5 > -1) {
                                        var39 = 0;
                                    } else if (~super.field1253 >= ~arg5) {
                                        var39 = super.field1253;
                                    }
                                    if (~arg1 > -1) {
                                        var41 = 0;
                                    } else if (super.field1265 <= arg1) {
                                        var41 = super.field1265;
                                    }
                                    int var42 = arg1 + 64;
                                    if (~var42 <= -1) {
                                        if (~super.field1265 >= ~var42) {
                                            var42 = super.field1265;
                                        }
                                    } else {
                                        var42 = 0;
                                    }
                                    while (~var40 < ~var39) {
                                        while (var41 < var42) {
                                            super.field1259[var28][var39][var41] = super.field1259[var28 + -1][var39][var41];
                                            ++var41;
                                        }
                                        ++var39;
                                    }
                                }
                            }
                        }
                        var7 = true;
                    }
                }
                if (var8 != null) {
                    for (int var9 = 0; var9 < 8; ++var9) {
                        for (int var10 = 0; ~var10 > -9; ++var10) {
                            int var11 = (arg5 >> 3) + var9;
                            int var12 = (arg1 >> 3) + var10;
                            if (var11 >= 0 && ~var11 > ~(super.field1253 >> 3) && ~var12 <= -1 && ~var12 > ~(super.field1265 >> 3)) {
                                class657.method3693(var11, (byte) 94, var12, var8);
                            }
                        }
                    }
                }
                if (!var7 && super.field1259 != null) {
                    for (int var13 = 0; ~var13 > -5; ++var13) {
                        if (super.field1259[var13] != null) {
                            for (int var14 = 0; var14 < 16; ++var14) {
                                for (int var15 = 0; ~var15 > -17; ++var15) {
                                    int var16 = (arg5 >> 2) + var14;
                                    int var17 = (arg1 >> 2) + var15;
                                    if (var16 >= 0 && var16 < 26 && var17 >= 0 && ~var17 > -27) {
                                        super.field1259[var13][var16][var17] = 0;
                                    }
                                }
                            }
                        }
                    }
                    return;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILr;I[Lwd;II[BIIII)V", line = 700)
    public final void method3610(int arg0, class566 arg1, int arg2, class356[] arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg2 == 0) {
            ++field9081;
            class630 var12 = new class630(arg6);
            int var13 = -1;
            while (true) {
                int var14 = var12.method3516((byte) -16);
                if (~var14 == -1) {
                    return;
                }
                var13 += var14;
                int var15 = 0;
                while (true) {
                    int var16 = var12.method3504(-13829);
                    if (~var16 == -1) {
                        break;
                    }
                    var15 += var16 - 1;
                    int var17 = var15 & 63;
                    int var18 = var15 >> 6 & 63;
                    int var19 = var15 >> 12;
                    int var20 = var12.method3501(-9268);
                    int var21 = var20 >> 2;
                    int var22 = var20 & 3;
                    if (~arg4 == ~var19 && ~var18 <= ~arg5 && ~var18 > ~(arg5 - -8) && ~var17 <= ~arg10 && ~(arg10 + 8) < ~var17) {
                        class441 var23 = class428.field5352.method3138((byte) 118, var13);
                        int var24 = class441.method2365(1, arg9, var23.field5534, 7 & var17, 7 & var18, var23.field5525, var22) + arg7;
                        int var25 = arg8 - -class510.method2755(var18 & 7, var17 & 7, arg9, var22, var23.field5525, (byte) -102, var23.field5534);
                        if (~var24 < -1 && var25 > 0 && var24 < super.field1253 + -1 && ~var25 > ~(super.field1265 + -1)) {
                            class356 var26 = null;
                            if (!super.field1238) {
                                int var27 = arg0;
                                if (~(class10.field190[1][var24][var25] & 2) == -3) {
                                    var27 = arg0 - 1;
                                }
                                if (var27 >= 0) {
                                    var26 = arg3[var27];
                                }
                            }
                            this.method3613(arg9 + var22 & 3, var26, var21, arg1, -1, arg0, arg2 + -12, var13, var25, arg0, var24);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(IIIZ)V", line = 780)
    public class646(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class82.field1096, class583.field8147);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZB)V", line = 784)
    public static final void method3611(boolean arg0, byte arg1) {
        ++field9078;
        if (class163.field2141.length() != 0) {
            class193.method1171(4, "--> " + class163.field2141);
            class483.method2626(0, arg0, class163.field2141, false);
            class687.field9736 = 0;
            class172.field2245 = 0;
            class163.field2141 = "";
            if (arg1 > -27) {
                field9087 = null;
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "([ILr;IZIIIIIILes;)V", line = 805)
    public final void method3612(int[] arg0, class566 arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class630 arg10) {
        ++field9077;
        if (!super.field1238) {
            boolean var12 = false;
            if (!arg3) {
                this.method3612((int[]) null, (class566) null, 16, true, 100, 26, 44, -81, 25, 94, (class630) null);
            }
            class424 var13 = null;
            if (arg0 != null) {
                arg0[0] = -1;
            }
            int var14 = (7 & arg6) * 8;
            int var15 = (arg2 & 7) * 8;
            while (true) {
                while (arg10.field8804.length > arg10.field8812) {
                    int var20 = arg10.method3501(-9268);
                    if (~var20 == -1) {
                        var13 = new class424(arg10);
                    } else if (var20 == 1) {
                        int var34 = arg10.method3501(-9268);
                        if (~var34 < -1) {
                            for (int var35 = 0; var34 > var35; ++var35) {
                                class378 var36 = new class378(arg1, arg10, 2);
                                if (~var36.field4778 == -32) {
                                    class599 var37 = class279.field3504.method1176(true, arg10.method3470(13111));
                                    var36.method2051(var37.field8410, var37.field8409, var37.field8412, 10236, var37.field8406);
                                }
                                if (~arg1.method997() < -1) {
                                    class332 var38 = var36.field4779;
                                    int var39 = var38.method1886(true) >> 9;
                                    int var40 = var38.method1885((byte) 119) >> 9;
                                    if (~var36.field4781 == ~arg8 && var14 <= var39 && var39 < var14 - -8 && ~var15 >= ~var40 && ~(var15 + 8) < ~var40) {
                                        int var41 = (arg5 << 9) - -class557.method3067(var38.method1885((byte) 119) & 4095, 4095 & var38.method1886(arg3), arg4, 102);
                                        int var42 = class516.method2793((byte) -117, var38.method1885((byte) 119) & 4095, arg4, 4095 & var38.method1886(arg3)) + (arg7 << 9);
                                        int var43 = var41 >> 9;
                                        int var44 = var42 >> 9;
                                        if (var43 >= 0 && var44 >= 0 && super.field1253 > var43 && var44 < super.field1265) {
                                            var38.method2(var41, var42, (byte) -99, super.field1245[arg8][var43][var44] - var38.method1888(-111));
                                            class411.method2179(var36);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (~var20 == -3) {
                        if (var13 == null) {
                            var13 = new class424();
                        }
                        var13.method2251(8, arg10);
                    } else if (var20 == 128) {
                        if (arg0 != null) {
                            arg0[0] = arg10.method3470(13111);
                            arg0[1] = arg10.method3510(39);
                            arg0[2] = arg10.method3510(31);
                            arg0[3] = arg10.method3510(92);
                            arg0[4] = arg10.method3470(13111);
                        } else {
                            arg10.field8812 += 10;
                        }
                    } else {
                        if (var20 != 129) {
                            throw new IllegalStateException("");
                        }
                        if (super.field1259 == null) {
                            super.field1259 = new byte[4][][];
                        }
                        for (int var21 = 0; var21 < 4; ++var21) {
                            byte var22 = arg10.method3480(-20933);
                            if (~var22 == -1 && super.field1259[arg9] != null) {
                                if (~var21 >= ~arg8) {
                                    int var23 = arg5;
                                    int var24 = arg5 + 7;
                                    int var25 = arg7;
                                    int var26 = arg7 + 7;
                                    if (~var24 > -1) {
                                        var24 = 0;
                                    } else if (~super.field1253 >= ~var24) {
                                        var24 = super.field1253;
                                    }
                                    if (arg7 >= 0) {
                                        if (super.field1265 <= arg7) {
                                            var25 = super.field1265;
                                        }
                                    } else {
                                        var25 = 0;
                                    }
                                    if (arg5 >= 0) {
                                        if (super.field1253 <= arg5) {
                                            var23 = super.field1253;
                                        }
                                    } else {
                                        var23 = 0;
                                    }
                                    if (~var26 > -1) {
                                        var26 = 0;
                                    } else if (~var26 <= ~super.field1265) {
                                        var26 = super.field1265;
                                    }
                                    while (var24 > var23) {
                                        while (var26 > var25) {
                                            super.field1259[arg9][var23][var25] = 0;
                                            ++var25;
                                        }
                                        ++var23;
                                    }
                                }
                            } else if (var22 == 1) {
                                if (super.field1259[arg9] == null) {
                                    super.field1259[arg9] = new byte[super.field1253 + 1][super.field1265 + 1];
                                }
                                for (int var27 = 0; var27 < 64; var27 += 4) {
                                    for (int var28 = 0; var28 < 64; var28 += 4) {
                                        byte var29 = arg10.method3480(-20933);
                                        if (~var21 >= ~arg8) {
                                            for (int var30 = var27; ~(var27 - -4) < ~var30; ++var30) {
                                                for (int var31 = var28; ~(var28 + 4) < ~var31; ++var31) {
                                                    if (~var14 >= ~var30 && var14 - -8 > var30 && ~var15 >= ~var31 && var15 - -8 > var15) {
                                                        int var32 = arg5 + class18.method118(var31 & 7, arg4, 69, 7 & var30);
                                                        int var33 = arg7 + class277.method1576(7 & var30, arg4, -112, var31 & 7);
                                                        if (var32 >= 0 && super.field1253 > var32 && var33 >= 0 && super.field1265 > var33) {
                                                            super.field1259[arg9][var32][var33] = var29;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (var13 != null) {
                    class657.method3693(arg5 >> 3, (byte) -81, arg7 >> 3, var13);
                }
                if (!var12 && super.field1259 != null && super.field1259[arg9] != null) {
                    int var16 = arg5 + 7;
                    int var17 = arg7 + 7;
                    for (int var18 = arg5; var16 > var18; ++var18) {
                        for (int var19 = arg7; ~var19 > ~var17; ++var19) {
                            super.field1259[arg9][var18][var19] = 0;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILwd;ILr;IIIIIII)V", line = 1102)
    public final void method3613(int arg0, class356 arg1, int arg2, class566 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field9079;
        if (class301.field3698.method135(class651.field9191, 123) || class367.method2011(arg5, class667.field9402, arg10, (byte) 108, arg8)) {
            if (~this.field9083 < ~arg9) {
                this.field9083 = arg9;
            }
            class441 var12 = class428.field5352.method3138((byte) 77, arg7);
            if (!arg3.method1027() || !class301.field3698.field6604 || !var12.field5535) {
                if (arg6 != -12) {
                    field9087 = null;
                }
                int var13;
                int var14;
                if (arg0 != 1 && ~arg0 != -4) {
                    var13 = var12.field5534;
                    var14 = var12.field5525;
                } else {
                    var13 = var12.field5525;
                    var14 = var12.field5534;
                }
                int var15;
                int var16;
                if (arg10 + var14 > super.field1253) {
                    var15 = arg10 + 1;
                    var16 = arg10;
                } else {
                    var16 = (var14 >> 1) + arg10;
                    var15 = (var14 + 1 >> 1) + arg10;
                }
                int var17;
                int var18;
                if (super.field1265 >= arg8 - -var13) {
                    var17 = (var13 >> 1) + arg8;
                    var18 = (var13 + 1 >> 1) + arg8;
                } else {
                    var18 = arg8 + 1;
                    var17 = arg8;
                }
                class272 var19 = class491.field6485[arg5];
                int var20 = var19.method1562(var17, (byte) 51, var16) + var19.method1562(var17, (byte) 51, var15) - (-var19.method1562(var18, (byte) 51, var16) - var19.method1562(var18, (byte) 51, var15)) >> 2;
                int var21 = (arg10 << 9) + (var14 << 8);
                int var22 = (arg8 << 9) - -(var13 << 8);
                boolean var23 = class100.field1353 && !super.field1238 && var12.field5559;
                if (var12.method2353((byte) 121)) {
                    class57.method364(-121, (class514) null, var12, arg0, (class307) null, arg10, arg8, arg9);
                }
                boolean var24 = ~arg4 == 0 && ~var12.field5576 == 0 && var12.field5566 == null && var12.field5574 == null && !var12.field5526;
                if (!class386.field4850 || (!class447.method2389(arg2, -4) || var12.field5572 == 1) && (!class613.method3376(2429, arg2) || var12.field5572 != 0)) {
                    if (~arg2 == -23) {
                        if (class301.field3698.field6646 || ~var12.field5560 != -1 || ~var12.field5551 == -2 || var12.field5528) {
                            class391 var26;
                            if (var24) {
                                class407 var25 = new class407(arg3, var12, arg9, arg5, var21, var20, var22, super.field1238, arg0, var23);
                                var26 = var25;
                                if (var25.method64(3755)) {
                                    var25.method70((byte) 66, arg3);
                                }
                            } else {
                                var26 = new class135(arg3, var12, arg9, arg5, var21, var20, var22, super.field1238, arg0, arg4);
                            }
                            class587.method3236(arg9, arg10, arg8, var26);
                            if (var12.field5551 == 1 && arg1 != null) {
                                arg1.method1957(arg8, (byte) -3, arg10);
                            }
                        }
                    } else if (~arg2 != -11 && ~arg2 != -12) {
                        if (~arg2 <= -13 && ~arg2 >= -18 || ~arg2 <= -19 && ~arg2 >= -22) {
                            class172 var27;
                            if (!var24) {
                                var27 = new class9(arg3, var12, arg9, arg5, var21, var20, var22, super.field1238, arg10, arg10 - 1 + var14, arg8, var13 + -1 + arg8, arg2, arg0, arg4);
                            } else {
                                class311 var28 = new class311(arg3, var12, arg9, arg5, var21, var20, var22, super.field1238, arg10, arg10 - (-var14 - -1), arg8, var13 + -1 + arg8, arg2, arg0, var23);
                                var27 = var28;
                                if (var28.method64(3755)) {
                                    var28.method70((byte) -95, arg3);
                                }
                            }
                            class231.method1391(var27, false);
                            if (class100.field1353 && !super.field1238 && ~arg2 <= -13 && ~arg2 >= -18 && arg2 != 13 && arg9 > 0 && var12.field5572 != 0) {
                                super.field1258[arg9][arg10][arg8] = (byte) class444.method2376(super.field1258[arg9][arg10][arg8], 4);
                            }
                            if (var12.field5551 != 0 && arg1 != null) {
                                arg1.method1964(var14, var12.field5567, var13, (byte) 100, arg10, !var12.field5523, arg8);
                            }
                        } else if (arg2 == 0) {
                            int var29 = var12.field5572;
                            if (class668.field9413 && ~var12.field5572 == 0) {
                                var29 = 1;
                            }
                            class597 var31;
                            if (var24) {
                                class639 var30 = new class639(arg3, var12, arg9, arg5, var21, var20, var22, super.field1238, arg2, arg0, var23);
                                var31 = var30;
                                if (var30.method64(3755)) {
                                    var30.method70((byte) 117, arg3);
                                }
                            } else {
                                var31 = new class451(arg3, var12, arg9, arg5, var21, var20, var22, super.field1238, arg2, arg0, arg4);
                            }
                            class480.method2612(arg9, arg10, arg8, var31, (class597) null);
                            if (~arg0 != -1) {
                                if (arg0 == 1) {
                                    if (class100.field1353 && var12.field5553) {
                                        var19.method1281(arg10, arg8 + 1, 50);
                                        var19.method1281(arg10 + 1, arg8 + 1, 50);
                                    }
                                    if (~var29 == -2 && !super.field1238) {
                                        class224.method1348(3, 2, var12.field5565, arg8 + 1, arg10, arg9, -var12.field5529);
                                    }
                                } else if (~arg0 == -3) {
                                    if (class100.field1353 && var12.field5553) {
                                        var19.method1281(arg10 + 1, arg8, 50);
                                        var19.method1281(arg10 + 1, arg8 + 1, 50);
                                    }
                                    if (~var29 == -2 && !super.field1238) {
                                        class224.method1348(3, 1, var12.field5565, arg8, arg10 - -1, arg9, -var12.field5529);
                                    }
                                } else if (arg0 == 3) {
                                    if (class100.field1353 && var12.field5553) {
                                        var19.method1281(arg10, arg8, 50);
                                        var19.method1281(arg10 - -1, arg8, 50);
                                    }
                                    if (var29 == 1 && !super.field1238) {
                                        class224.method1348(arg6 ^ -9, 2, var12.field5565, arg8, arg10, arg9, var12.field5529);
                                    }
                                }
                            } else {
                                if (class100.field1353 && var12.field5553) {
                                    var19.method1281(arg10, arg8, 50);
                                    var19.method1281(arg10, arg8 + 1, 50);
                                }
                                if (var29 == 1 && !super.field1238) {
                                    class224.method1348(3, 1, var12.field5565, arg8, arg10, arg9, var12.field5529);
                                }
                            }
                            if (~var12.field5551 != -1 && arg1 != null) {
                                arg1.method1961(var12.field5567, arg2, 64, arg8, arg10, !var12.field5523, arg0);
                            }
                            if (var12.field5571 != 64) {
                                class288.method1621(arg9, arg10, arg8, var12.field5571);
                            }
                        } else if (~arg2 == -2) {
                            class597 var32;
                            if (!var24) {
                                var32 = new class451(arg3, var12, arg9, arg5, var21, var20, var22, super.field1238, arg2, arg0, arg4);
                            } else {
                                class639 var33 = new class639(arg3, var12, arg9, arg5, var21, var20, var22, super.field1238, arg2, arg0, var23);
                                var32 = var33;
                                if (var33.method64(3755)) {
                                    var33.method70((byte) 58, arg3);
                                }
                            }
                            class480.method2612(arg9, arg10, arg8, var32, (class597) null);
                            if (var12.field5553 && class100.field1353) {
                                if (arg0 != 0) {
                                    if (~arg0 == -2) {
                                        var19.method1281(arg10 + 1, arg8 + 1, 50);
                                    } else if (~arg0 == -3) {
                                        var19.method1281(arg10 - -1, arg8, 50);
                                    } else if (arg0 == 3) {
                                        var19.method1281(arg10, arg8, 50);
                                    }
                                } else {
                                    var19.method1281(arg10, arg8 - -1, 50);
                                }
                            }
                            if (var12.field5551 != 0 && arg1 != null) {
                                arg1.method1961(var12.field5567, arg2, 84, arg8, arg10, !var12.field5523, arg0);
                            }
                        } else if (arg2 == 2) {
                            int var34 = 3 & arg0 + 1;
                            class597 var37;
                            class597 var38;
                            if (var24) {
                                class639 var35 = new class639(arg3, var12, arg9, arg5, var21, var20, var22, super.field1238, arg2, arg0 + 4, var23);
                                class639 var36 = new class639(arg3, var12, arg9, arg5, var21, var20, var22, super.field1238, arg2, var34, var23);
                                if (var35.method64(3755)) {
                                    var35.method70((byte) 118, arg3);
                                }
                                var37 = var36;
                                if (var36.method64(3755)) {
                                    var36.method70((byte) -87, arg3);
                                }
                                var38 = var35;
                            } else {
                                var38 = new class451(arg3, var12, arg9, arg5, var21, var20, var22, super.field1238, arg2, arg0 + 4, arg4);
                                var37 = new class451(arg3, var12, arg9, arg5, var21, var20, var22, super.field1238, arg2, var34, arg4);
                            }
                            class480.method2612(arg9, arg10, arg8, var38, var37);
                            if ((var12.field5572 == 1 || class668.field9413 && ~var12.field5572 == 0) && !super.field1238) {
                                if (arg0 == 0) {
                                    class224.method1348(arg6 ^ -9, 1, var12.field5565, arg8, arg10, arg9, var12.field5529);
                                    class224.method1348(3, 2, var12.field5565, arg8 + 1, arg10, arg9, var12.field5529);
                                } else if (arg0 == 1) {
                                    class224.method1348(arg6 + 15, 1, var12.field5565, arg8, arg10 + 1, arg9, var12.field5529);
                                    class224.method1348(arg6 ^ -9, 2, var12.field5565, arg8 - -1, arg10, arg9, var12.field5529);
                                } else if (arg0 != 2) {
                                    if (arg0 == 3) {
                                        class224.method1348(3, 1, var12.field5565, arg8, arg10, arg9, var12.field5529);
                                        class224.method1348(arg6 + 15, 2, var12.field5565, arg8, arg10, arg9, var12.field5529);
                                    }
                                } else {
                                    class224.method1348(arg6 ^ -9, 1, var12.field5565, arg8, arg10 + 1, arg9, var12.field5529);
                                    class224.method1348(3, 2, var12.field5565, arg8, arg10, arg9, var12.field5529);
                                }
                            }
                            if (~var12.field5551 != -1 && arg1 != null) {
                                arg1.method1961(var12.field5567, arg2, 43, arg8, arg10, !var12.field5523, arg0);
                            }
                            if (var12.field5571 != 64) {
                                class288.method1621(arg9, arg10, arg8, var12.field5571);
                            }
                        } else if (arg2 == 3) {
                            class597 var39;
                            if (!var24) {
                                var39 = new class451(arg3, var12, arg9, arg5, var21, var20, var22, super.field1238, arg2, arg0, arg4);
                            } else {
                                class639 var40 = new class639(arg3, var12, arg9, arg5, var21, var20, var22, super.field1238, arg2, arg0, var23);
                                var39 = var40;
                                if (var40.method64(3755)) {
                                    var40.method70((byte) 80, arg3);
                                }
                            }
                            class480.method2612(arg9, arg10, arg8, var39, (class597) null);
                            if (var12.field5553 && class100.field1353) {
                                if (arg0 != 0) {
                                    if (~arg0 != -2) {
                                        if (arg0 != 2) {
                                            if (~arg0 == -4) {
                                                var19.method1281(arg10, arg8, 50);
                                            }
                                        } else {
                                            var19.method1281(arg10 + 1, arg8, 50);
                                        }
                                    } else {
                                        var19.method1281(arg10 + 1, arg8 - -1, 50);
                                    }
                                } else {
                                    var19.method1281(arg10, arg8 + 1, 50);
                                }
                            }
                            if (var12.field5551 != 0 && arg1 != null) {
                                arg1.method1961(var12.field5567, arg2, 83, arg8, arg10, !var12.field5523, arg0);
                            }
                        } else if (arg2 == 9) {
                            class172 var42;
                            if (var24) {
                                class311 var41 = new class311(arg3, var12, arg9, arg5, var21, var20, var22, super.field1238, arg10, arg10, arg8, arg8, arg2, arg0, var23);
                                if (var41.method64(3755)) {
                                    var41.method70((byte) 113, arg3);
                                }
                                var42 = var41;
                            } else {
                                var42 = new class9(arg3, var12, arg9, arg5, var21, var20, var22, super.field1238, arg10, arg10 - (-var14 - -1), arg8, arg8 - -var13 + -1, arg2, arg0, arg4);
                            }
                            class231.method1391(var42, false);
                            if (~var12.field5551 != -1 && arg1 != null) {
                                arg1.method1964(var14, var12.field5567, var13, (byte) 100, arg10, !var12.field5523, arg8);
                            }
                            if (~var12.field5571 != -65) {
                                class288.method1621(arg9, arg10, arg8, var12.field5571);
                            }
                        } else if (~arg2 == -5) {
                            class137 var43;
                            if (!var24) {
                                var43 = new class308(arg3, var12, arg9, arg5, var21, var20, var22, super.field1238, 0, 0, arg2, arg0, arg4);
                            } else {
                                class560 var44 = new class560(arg3, var12, arg9, arg5, var21, var20, var22, super.field1238, 0, 0, arg2, arg0);
                                var43 = var44;
                                if (var44.method64(3755)) {
                                    var44.method70((byte) 56, arg3);
                                }
                            }
                            class241.method1443(arg9, arg10, arg8, var43, (class137) null);
                        } else if (~arg2 == -6) {
                            int var45 = 65;
                            class339 var46 = (class339) class312.method1803(arg9, arg10, arg8);
                            if (var46 != null) {
                                var45 = class428.field5352.method3138((byte) 69, var46.method65((byte) 127)).field5571 - -1;
                            }
                            class137 var47;
                            if (!var24) {
                                var47 = new class308(arg3, var12, arg9, arg5, var21, var20, var22, super.field1238, class314.field4046[arg0] * var45, class317.field4064[arg0] * var45, arg2, arg0, arg4);
                            } else {
                                class560 var48 = new class560(arg3, var12, arg9, arg5, var21, var20, var22, super.field1238, class314.field4046[arg0] * var45, class317.field4064[arg0] * var45, arg2, arg0);
                                var47 = var48;
                                if (var48.method64(arg6 + 3767)) {
                                    var48.method70((byte) 31, arg3);
                                }
                            }
                            class241.method1443(arg9, arg10, arg8, var47, (class137) null);
                        } else if (~arg2 == -7) {
                            int var49 = 33;
                            class339 var50 = (class339) class312.method1803(arg9, arg10, arg8);
                            if (var50 != null) {
                                var49 = class428.field5352.method3138((byte) 28, var50.method65((byte) 127)).field5571 / 2 + 1;
                            }
                            class137 var51;
                            if (!var24) {
                                var51 = new class308(arg3, var12, arg9, arg5, var21, var20, var22, super.field1238, class237.field2968[arg0] * var49, class174.field2263[arg0] * var49, arg2, arg0 + 4, arg4);
                            } else {
                                class560 var52 = new class560(arg3, var12, arg9, arg5, var21, var20, var22, super.field1238, class314.field4046[arg0] * var49, class317.field4064[arg0] * var49, arg2, arg0 + 4);
                                if (var52.method64(3755)) {
                                    var52.method70((byte) 108, arg3);
                                }
                                var51 = var52;
                            }
                            class241.method1443(arg9, arg10, arg8, var51, (class137) null);
                        } else if (~arg2 == -8) {
                            int var53 = 3 & arg0 - -2;
                            class137 var55;
                            if (var24) {
                                class560 var54 = new class560(arg3, var12, arg9, arg5, var21, var20, var22, super.field1238, 0, 0, arg2, var53 + 4);
                                if (var54.method64(3755)) {
                                    var54.method70((byte) 27, arg3);
                                }
                                var55 = var54;
                            } else {
                                var55 = new class308(arg3, var12, arg9, arg5, var21, var20, var22, super.field1238, 0, 0, arg2, var53 + 4, arg4);
                            }
                            class241.method1443(arg9, arg10, arg8, var55, (class137) null);
                        } else if (arg2 == 8) {
                            int var56 = arg0 + 2 & 3;
                            int var57 = 33;
                            class339 var58 = (class339) class312.method1803(arg9, arg10, arg8);
                            if (var58 != null) {
                                var57 = 1 + class428.field5352.method3138((byte) 45, var58.method65((byte) 127)).field5571 / 2;
                            }
                            class137 var61;
                            class137 var62;
                            if (!var24) {
                                class308 var59 = new class308(arg3, var12, arg9, arg5, var21, var20, var22, super.field1238, class237.field2968[arg0] * var57, class174.field2263[arg0] * var57, arg2, arg0 - -4, arg4);
                                class308 var60 = new class308(arg3, var12, arg9, arg5, var21, var20, var22, super.field1238, 0, 0, arg2, var56 - -4, arg4);
                                var61 = var59;
                                var62 = var60;
                            } else {
                                class560 var63 = new class560(arg3, var12, arg9, arg5, var21, var20, var22, super.field1238, class237.field2968[arg0] * var57, class174.field2263[arg0] * var57, arg2, arg0 + 4);
                                class560 var64 = new class560(arg3, var12, arg9, arg5, var21, var20, var22, super.field1238, 0, 0, arg2, var56 - -4);
                                if (var63.method64(arg6 ^ -3745)) {
                                    var63.method70((byte) -105, arg3);
                                }
                                var62 = var64;
                                var61 = var63;
                                if (var64.method64(3755)) {
                                    var64.method70((byte) -101, arg3);
                                }
                            }
                            class241.method1443(arg9, arg10, arg8, var61, var62);
                        }
                    } else {
                        class311 var65 = null;
                        int var67;
                        class172 var68;
                        if (var24) {
                            class311 var66 = new class311(arg3, var12, arg9, arg5, var21, var20, var22, super.field1238, arg10, arg10 + var14 - 1, arg8, arg8 - -var13 - 1, arg2, arg0, var23);
                            var65 = var66;
                            var67 = var66.method1796(67);
                            var68 = var66;
                        } else {
                            var67 = 15;
                            var68 = new class9(arg3, var12, arg9, arg5, var21, var20, var22, super.field1238, arg10, arg10 - 1 + var14, arg8, arg8 + var13 - 1, arg2, arg0, arg4);
                        }
                        if (class231.method1391(var68, false)) {
                            if (var65 != null && var65.method64(arg6 + 3767)) {
                                var65.method70((byte) 46, arg3);
                            }
                            if (var12.field5553 && class100.field1353) {
                                if (var67 > 30) {
                                    var67 = 30;
                                }
                                for (int var69 = 0; var69 <= var14; ++var69) {
                                    for (int var70 = 0; var70 <= var13; ++var70) {
                                        var19.method1281(arg10 + var69, arg8 + var70, var67);
                                    }
                                }
                            }
                        }
                        if (~var12.field5551 != -1 && arg1 != null) {
                            arg1.method1964(var14, var12.field5567, var13, (byte) 100, arg10, !var12.field5523, arg8);
                        }
                    }
                }
            }
        }
    }
}
