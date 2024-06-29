import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class474 extends class66 {

    @OriginalMember(owner = "client!h", name = "D", descriptor = "I")
    public int field7025 = 99;

    @OriginalMember(owner = "client!h", name = "C", descriptor = "I")
    public static int field7024;

    @OriginalMember(owner = "client!h", name = "E", descriptor = "I")
    public static int field7026;

    @OriginalMember(owner = "client!h", name = "F", descriptor = "I")
    public static int field7027;

    @OriginalMember(owner = "client!h", name = "H", descriptor = "I")
    public static int field7028;

    @OriginalMember(owner = "client!h", name = "I", descriptor = "I")
    public static int field7029;

    @OriginalMember(owner = "client!h", name = "J", descriptor = "I")
    public static int field7030;

    @OriginalMember(owner = "client!h", name = "K", descriptor = "I")
    public static int field7031;

    @OriginalMember(owner = "client!h", name = "L", descriptor = "I")
    public static int field7032;

    @OriginalMember(owner = "client!h", name = "M", descriptor = "I")
    public static int field7033;

    @OriginalMember(owner = "client!h", name = "N", descriptor = "I")
    public static int field7034;

    @OriginalMember(owner = "client!h", name = "O", descriptor = "I")
    public static int field7035;

    // $FF: synthetic field
    @OriginalMember(owner = "client!h", name = "P", descriptor = "Ljava/lang/Class;")
    public static Class field7036;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lza;Lsd;IIIII)V")
    public final void method2829(class288 arg0, class63 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field7033;
        class425 var8 = null;
        int var9 = 65 % ((arg3 - -47) / 61);
        if (arg2 == 0) {
            var8 = (class425) class211.method1435(arg5, arg4, arg6);
        }
        if (arg2 == 1) {
            var8 = (class425) class498.method3008(arg5, arg4, arg6);
        }
        if (arg2 == 2) {
            var8 = (class425) class479.method2859(arg5, arg4, arg6, field7036 != null ? field7036 : (field7036 = method2840("rj")));
        }
        if (arg2 == 3) {
            var8 = (class425) class296.method1911(arg5, arg4, arg6);
        }
        if (var8 != null) {
            class306 var10 = class123.field2142.method1530((byte) -26, var8.method224(-10848));
            int var11 = var8.method225(false);
            int var12 = var8.method231(74);
            if (var10.method1947((byte) 49)) {
                class490.method2962(arg5, arg4, (byte) -9, var10, arg6);
            }
            if (var8.method228(1396)) {
                var8.method233(arg0, 13367);
            }
            if (~arg2 != -1) {
                if (arg2 != 1) {
                    if (~arg2 == -3) {
                        class402 var13 = class479.method2859(arg5, arg4, arg6, field7036 != null ? field7036 : (field7036 = method2840("rj")));
                        if (var13 instanceof class110 && var13.field6082 == arg4 && ~var13.field6077 == ~arg6) {
                            ((class110) var13).field2018 = null;
                        } else {
                            class106.method911(arg5, arg4, arg6, field7036 != null ? field7036 : (field7036 = method2840("rj")));
                        }
                        if (~var10.field4614 != -1 && var10.field4601 + arg4 < super.field1341 && ~(arg6 - -var10.field4601) > ~super.field1336 && var10.field4595 + arg4 < super.field1341 && ~(arg6 - -var10.field4595) > ~super.field1336) {
                            arg1.method563(var10.field4595, var12, arg6, !var10.field4620, var10.field4609, arg4, var10.field4601, 1);
                            return;
                        }
                    } else {
                        if (~arg2 != -4) {
                            return;
                        }
                        class311 var14 = class296.method1911(arg5, arg4, arg6);
                        if (var14 instanceof class65) {
                            ((class65) var14).field1320 = null;
                        } else {
                            class146.method1081(arg5, arg4, arg6);
                        }
                        if (~var10.field4614 != -2) {
                            return;
                        }
                        arg1.method566(-120, arg4, arg6);
                    }
                    return;
                } else {
                    class210 var15 = class498.method3008(arg5, arg4, arg6);
                    if (!(var15 instanceof class33)) {
                        class268.method1703(arg5, arg4, arg6);
                        return;
                    }
                    ((class33) var15).field511 = null;
                    return;
                }
            }
            class50 var16 = class211.method1435(arg5, arg4, arg6);
            if (var16 instanceof class237) {
                ((class237) var16).field3664 = null;
            } else {
                class124.method986(arg5, arg4, arg6);
            }
            if (~var10.field4614 != -1) {
                arg1.method554(!var10.field4620, -1, var10.field4609, arg4, arg6, var12, var11);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I[IIILza;Lnn;)V")
    public final void method2830(int arg0, int[] arg1, int arg2, int arg3, class288 arg4, class289 arg5) {
        ++field7028;
        if (!super.field1342) {
            boolean var7 = false;
            if (arg1 != null) {
                arg1[0] = -1;
            }
            class469 var8 = null;
            while (true) {
                while (~arg5.field4399 > ~arg5.field4408.length) {
                    int var18 = arg5.method1858(-3256);
                    if (~var18 == -1) {
                        var8 = new class469(arg5);
                    } else if (~var18 == -2) {
                        int var19 = arg5.method1858(-3256);
                        if (var19 > 0) {
                            for (int var20 = 0; var19 > var20; ++var20) {
                                class188 var21 = new class188(arg4, arg5, 0);
                                if (var21.field3029 == 31) {
                                    class494 var22 = class214.field3396.method1080(arg5.method1841((byte) -119), (byte) -114);
                                    var21.method1284((byte) 123, var22.field7237, var22.field7236, var22.field7239, var22.field7234);
                                }
                                if (arg4.method403() > 0) {
                                    class256 var23 = var21.field3015;
                                    int var24 = var23.method1646(-108) + (arg0 << 7);
                                    int var25 = (arg2 << 7) + var23.method1653((byte) -108);
                                    int var26 = var24 >> 7;
                                    int var27 = var25 >> 7;
                                    if (~var26 <= -1 && var27 >= 0 && super.field1341 > var26 && ~var27 > ~super.field1336) {
                                        var23.method146(var24, 4, var25, super.field1355[var21.field3021][var26][var27] - var23.method1655((byte) -67));
                                        class266.method1695(var21);
                                    }
                                }
                            }
                        }
                    } else if (~var18 == -3) {
                        if (var8 == null) {
                            var8 = new class469();
                        }
                        var8.method2802(0, arg5);
                    } else if (~var18 == -129) {
                        if (arg1 != null) {
                            arg1[0] = arg5.method1841((byte) 53);
                            arg1[1] = arg5.method1848((byte) 110);
                            arg1[2] = arg5.method1848((byte) 125);
                            arg1[3] = arg5.method1848((byte) 123);
                            arg1[4] = arg5.method1841((byte) -127);
                        } else {
                            arg5.field4399 += 10;
                        }
                    } else {
                        if (~var18 != -130) {
                            throw new IllegalStateException("");
                        }
                        if (super.field1344 == null) {
                            super.field1344 = new byte[4][][];
                        }
                        for (int var28 = 0; ~var28 > -5; ++var28) {
                            byte var29 = arg5.method1816(true);
                            if (~var29 == -1 && super.field1344[var28] != null) {
                                int var30 = arg0;
                                int var31 = arg0 - -64;
                                int var32 = arg2;
                                if (arg0 >= 0) {
                                    if (super.field1341 <= arg0) {
                                        var30 = super.field1341;
                                    }
                                } else {
                                    var30 = 0;
                                }
                                if (~var31 <= -1) {
                                    if (var31 >= super.field1341) {
                                        var31 = super.field1341;
                                    }
                                } else {
                                    var31 = 0;
                                }
                                int var33 = arg2 + 64;
                                if (arg2 >= 0) {
                                    if (arg2 >= super.field1336) {
                                        var32 = super.field1336;
                                    }
                                } else {
                                    var32 = 0;
                                }
                                if (~var33 <= -1) {
                                    if (~var33 <= ~super.field1336) {
                                        var33 = super.field1336;
                                    }
                                } else {
                                    var33 = 0;
                                }
                                while (var31 > var30) {
                                    while (var32 < var33) {
                                        super.field1344[var28][var30][var32] = 0;
                                        ++var32;
                                    }
                                    ++var30;
                                }
                            } else if (~var29 != -2) {
                                if (~var29 == -3) {
                                    if (super.field1344[var28] == null) {
                                        super.field1344[var28] = new byte[super.field1341 + 1][super.field1336 + 1];
                                    }
                                    if (~var28 < -1) {
                                        int var34 = arg0;
                                        int var35 = arg0 - -64;
                                        int var36 = arg2;
                                        int var37 = arg2 + 64;
                                        if (arg0 >= 0) {
                                            if (super.field1341 <= arg0) {
                                                var34 = super.field1341;
                                            }
                                        } else {
                                            var34 = 0;
                                        }
                                        if (~arg2 <= -1) {
                                            if (~arg2 <= ~super.field1336) {
                                                var36 = super.field1336;
                                            }
                                        } else {
                                            var36 = 0;
                                        }
                                        if (var35 >= 0) {
                                            if (~super.field1341 >= ~var35) {
                                                var35 = super.field1341;
                                            }
                                        } else {
                                            var35 = 0;
                                        }
                                        if (var37 < 0) {
                                            var37 = 0;
                                        } else if (~super.field1336 >= ~var37) {
                                            var37 = super.field1336;
                                        }
                                        while (~var34 > ~var35) {
                                            while (~var36 > ~var37) {
                                                super.field1344[var28][var34][var36] = super.field1344[var28 + -1][var34][var36];
                                                ++var36;
                                            }
                                            ++var34;
                                        }
                                    }
                                }
                            } else {
                                if (super.field1344[var28] == null) {
                                    super.field1344[var28] = new byte[super.field1341 - -1][super.field1336 + 1];
                                }
                                for (int var38 = 0; var38 < 64; var38 += 4) {
                                    for (int var39 = 0; ~var39 > -65; var39 += 4) {
                                        byte var40 = arg5.method1816(true);
                                        for (int var41 = arg0 + var38; ~var41 > ~(arg0 + var38 + 4); ++var41) {
                                            for (int var42 = arg2 + var39; var42 < arg2 + var39 + 4; ++var42) {
                                                if (~var41 <= -1 && var41 < super.field1341 && ~var42 <= -1 && var42 < super.field1336) {
                                                    super.field1344[var28][var41][var42] = var40;
                                                }
                                            }
                                        }
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
                            int var11 = (arg0 >> 3) - -var9;
                            int var12 = (arg2 >> 3) + var10;
                            if (var11 >= 0 && ~(super.field1341 >> 3) < ~var11 && var12 >= 0 && ~var12 > ~(super.field1336 >> 3)) {
                                class199.method1382(-1385037081, var8, var11, var12);
                            }
                        }
                    }
                }
                if (!var7 && super.field1344 != null) {
                    for (int var13 = 0; ~var13 > -5; ++var13) {
                        if (super.field1344[var13] != null) {
                            for (int var14 = 0; var14 < 16; ++var14) {
                                for (int var15 = 0; ~var15 > -17; ++var15) {
                                    int var16 = (arg0 >> 2) - -var14;
                                    int var17 = (arg2 >> 2) + var15;
                                    if (var16 >= 0 && ~var16 > -27 && var17 >= 0 && ~var17 > -27) {
                                        super.field1344[var13][var16][var17] = 0;
                                    }
                                }
                            }
                        }
                    }
                }
                if (arg3 >= -126) {
                    this.field7025 = -37;
                    return;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I[BLza;II[Lsd;IIIII)V")
    public final void method2831(int arg0, byte[] arg1, class288 arg2, int arg3, int arg4, class63[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field7034;
        if (arg6 != 19178) {
            this.field7025 = -7;
        }
        class289 var12 = new class289(arg1);
        int var13 = -1;
        while (true) {
            int var14 = var12.method1819(arg6 + -19178);
            if (~var14 == -1) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method1825((byte) -114);
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 63;
                int var18 = (4090 & var15) >> 6;
                int var19 = var15 >> 12;
                int var20 = var12.method1858(-3256);
                int var21 = var20 >> 2;
                int var22 = 3 & var20;
                if (~arg8 == ~var19 && arg3 <= var18 && arg3 - -8 > var18 && arg0 <= var17 && var17 < arg0 + 8) {
                    class306 var23 = class123.field2142.method1530((byte) -115, var13);
                    int var24 = arg10 - -class470.method2809(var17 & 7, 7 & var18, var23.field4595, true, var22, arg9, var23.field4601);
                    int var25 = arg7 - -class370.method2272(var23.field4601, var22, var23.field4595, 7 & var17, arg9, 7 & var18, (byte) 118);
                    if (~var24 < -1 && var25 > 0 && var24 < super.field1341 + -1 && ~(super.field1336 + -1) < ~var25) {
                        class63 var26 = null;
                        if (!super.field1342) {
                            int var27 = arg4;
                            if ((class22.field333[1][var24][var25] & 2) == 2) {
                                var27 = arg4 - 1;
                            }
                            if (var27 >= 0) {
                                var26 = arg5[var27];
                            }
                        }
                        this.method2837((byte) 66, var25, var21, var26, var13, var24, arg4, 3 & arg9 + var22, arg2, -1, arg4);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IZIIII)V")
    public static final void method2832(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7031;
        int var6 = -arg0 + arg2;
        int var7 = arg4 - arg3;
        if (~var6 == -1) {
            if (~var7 != -1) {
                class120.method972(arg4, arg0, 0, arg5, arg3);
            }
        } else if (var7 == 0) {
            class299.method1927(arg2, false, arg0, arg3, arg5);
        } else if (!arg1) {
            int var8 = (var7 << 12) / var6;
            int var9 = -(arg0 * var8 >> 12) + arg3;
            int var10;
            int var11;
            if (~arg2 <= ~class467.field6940) {
                if (arg2 <= class43.field600) {
                    var10 = arg2;
                    var11 = arg4;
                } else {
                    var10 = class43.field600;
                    var11 = (class43.field600 * var8 >> 12) + var9;
                }
            } else {
                var10 = class467.field6940;
                var11 = (class467.field6940 * var8 >> 12) + var9;
            }
            int var12;
            int var13;
            if (arg0 >= class467.field6940) {
                if (~class43.field600 > ~arg0) {
                    var12 = (class43.field600 * var8 >> 12) + var9;
                    var13 = class43.field600;
                } else {
                    var12 = arg3;
                    var13 = arg0;
                }
            } else {
                var12 = var9 - -(class467.field6940 * var8 >> 12);
                var13 = class467.field6940;
            }
            if (~class372.field5455 >= ~var12) {
                if (var12 > class216.field3415) {
                    var13 = (-var9 + class216.field3415 << 12) / var8;
                    var12 = class216.field3415;
                }
            } else {
                var13 = (class372.field5455 - var9 << 12) / var8;
                var12 = class372.field5455;
            }
            if (class372.field5455 > var11) {
                var10 = (-var9 + class372.field5455 << 12) / var8;
                var11 = class372.field5455;
            } else if (var11 > class216.field3415) {
                var10 = (class216.field3415 - var9 << 12) / var8;
                var11 = class216.field3415;
            }
            class355.method2194(var12, var13, (byte) -40, var10, var11, arg5);
        }
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(IIIZ)V")
    public class474(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class293.field4482, class127.field2174);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ZB)V")
    public static final void method2833(boolean arg0, byte arg1) {
        ++field7026;
        if (class496.field7294.length() != 0) {
            if (arg1 > -18) {
                method2832(-27, true, -83, 81, -72, -7);
            }
            class113.method944((byte) 84, "--> " + class496.field7294);
            class230.method1518(class496.field7294, false, arg0, -30805);
            class73.field1501 = 0;
            class496.field7294 = "";
            class507.field7394 = 0;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public static final void method2834(boolean arg0, String arg1) {
        if (!arg0) {
            System.exit(1);
            ++field7035;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I[IIILza;IIIILnn;I)V")
    public final void method2835(int arg0, int[] arg1, int arg2, int arg3, class288 arg4, int arg5, int arg6, int arg7, int arg8, class289 arg9, int arg10) {
        ++field7030;
        if (!super.field1342) {
            boolean var12 = false;
            if (arg1 != null) {
                arg1[0] = -1;
            }
            class469 var13 = null;
            int var14 = (7 & arg6) * 8;
            if (arg0 <= -89) {
                int var15 = (arg5 & 7) * 8;
                while (true) {
                    int var21;
                    label242: do {
                        while (true) {
                            while (~arg9.field4408.length < ~arg9.field4399) {
                                int var20 = arg9.method1858(-3256);
                                if (var20 != 0) {
                                    if (var20 == 1) {
                                        var21 = arg9.method1858(-3256);
                                        continue label242;
                                    }
                                    if (var20 == 2) {
                                        if (var13 == null) {
                                            var13 = new class469();
                                        }
                                        var13.method2802(0, arg9);
                                    } else if (~var20 == -129) {
                                        if (arg1 == null) {
                                            arg9.field4399 += 10;
                                        } else {
                                            arg1[0] = arg9.method1841((byte) 109);
                                            arg1[1] = arg9.method1848((byte) 114);
                                            arg1[2] = arg9.method1848((byte) 106);
                                            arg1[3] = arg9.method1848((byte) 112);
                                            arg1[4] = arg9.method1841((byte) 86);
                                        }
                                    } else {
                                        if (~var20 != -130) {
                                            throw new IllegalStateException("");
                                        }
                                        if (super.field1344 == null) {
                                            super.field1344 = new byte[4][][];
                                        }
                                        for (int var32 = 0; var32 < 4; ++var32) {
                                            byte var33 = arg9.method1816(true);
                                            if (var33 == 0 && super.field1344[arg8] != null) {
                                                if (~arg10 <= ~var32) {
                                                    int var34 = arg2;
                                                    int var35 = arg2 + 7;
                                                    int var36 = arg7;
                                                    if (~var35 > -1) {
                                                        var35 = 0;
                                                    } else if (~var35 <= ~super.field1341) {
                                                        var35 = super.field1341;
                                                    }
                                                    if (arg7 < 0) {
                                                        var36 = 0;
                                                    } else if (arg7 >= super.field1336) {
                                                        var36 = super.field1336;
                                                    }
                                                    int var37 = arg7 + 7;
                                                    if (arg2 >= 0) {
                                                        if (~super.field1341 >= ~arg2) {
                                                            var34 = super.field1341;
                                                        }
                                                    } else {
                                                        var34 = 0;
                                                    }
                                                    if (var37 < 0) {
                                                        var37 = 0;
                                                    } else if (~super.field1336 >= ~var37) {
                                                        var37 = super.field1336;
                                                    }
                                                    while (var35 > var34) {
                                                        while (~var36 > ~var37) {
                                                            super.field1344[arg8][var34][var36] = 0;
                                                            ++var36;
                                                        }
                                                        ++var34;
                                                    }
                                                }
                                            } else if (~var33 == -2) {
                                                if (super.field1344[arg8] == null) {
                                                    super.field1344[arg8] = new byte[super.field1341 + 1][super.field1336 + 1];
                                                }
                                                for (int var38 = 0; ~var38 > -65; var38 += 4) {
                                                    for (int var39 = 0; ~var39 > -65; var39 += 4) {
                                                        byte var40 = arg9.method1816(true);
                                                        if (arg10 >= var32) {
                                                            for (int var41 = var38; var38 + 4 > var41; ++var41) {
                                                                for (int var42 = var39; var42 < var39 - -4; ++var42) {
                                                                    if (var14 <= var41 && ~(var14 + 8) < ~var41 && var42 >= var15 && ~var15 > ~(var15 + 8)) {
                                                                        int var43 = arg2 + class82.method772(7 & var41, var42 & 7, arg3, -1);
                                                                        int var44 = arg7 - -class464.method2781(7 & var42, arg3, (byte) -128, var41 & 7);
                                                                        if (var43 >= 0 && ~var43 > ~super.field1341 && ~var44 <= -1 && super.field1336 > var44) {
                                                                            super.field1344[arg8][var43][var44] = var40;
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
                                } else {
                                    var13 = new class469(arg9);
                                }
                            }
                            if (var13 != null) {
                                class199.method1382(-1385037081, var13, arg2 >> 3, arg7 >> 3);
                            }
                            if (!var12 && super.field1344 != null && super.field1344[arg8] != null) {
                                int var16 = arg2 + 7;
                                int var17 = arg7 + 7;
                                for (int var18 = arg2; ~var18 > ~var16; ++var18) {
                                    for (int var19 = arg7; ~var19 > ~var17; ++var19) {
                                        super.field1344[arg8][var18][var19] = 0;
                                    }
                                }
                                return;
                            }
                            return;
                        }
                    } while (var21 <= 0);
                    for (int var22 = 0; var21 > var22; ++var22) {
                        class188 var23 = new class188(arg4, arg9, 0);
                        if (var23.field3029 == 31) {
                            class494 var24 = class214.field3396.method1080(arg9.method1841((byte) -120), (byte) 89);
                            var23.method1284((byte) 124, var24.field7237, var24.field7236, var24.field7239, var24.field7234);
                        }
                        if (arg4.method403() > 0) {
                            class256 var25 = var23.field3015;
                            int var26 = var25.method1646(-111) >> 7;
                            int var27 = var25.method1653((byte) -69) >> 7;
                            if (~var23.field3021 == ~arg10 && ~var14 >= ~var26 && var26 < var14 + 8 && var15 <= var27 && ~(var15 + 8) < ~var27) {
                                int var28 = (arg2 << 7) - -class233.method1534(1023, 1023 & var25.method1646(-128), var25.method1653((byte) -86) & 1023, arg3);
                                int var29 = class338.method2125(arg3, 1023 & var25.method1646(-105), (byte) 4, var25.method1653((byte) -125) & 1023) + (arg7 << 7);
                                int var30 = var28 >> 7;
                                int var31 = var29 >> 7;
                                if (var30 >= 0 && var31 >= 0 && ~var30 > ~super.field1341 && super.field1336 > var31) {
                                    var25.method146(var28, 4, var29, super.field1355[arg10][var30][var31] + -var25.method1655((byte) -128));
                                    class266.method1695(var23);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([BLza;B[Lsd;II)V")
    public final void method2836(byte[] arg0, class288 arg1, byte arg2, class63[] arg3, int arg4, int arg5) {
        ++field7024;
        class289 var7 = new class289(arg0);
        if (arg2 < 39) {
            this.field7025 = 106;
        }
        int var8 = -1;
        while (true) {
            int var9 = var7.method1819(0);
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method1825((byte) -114);
                if (var11 == 0) {
                    break;
                }
                var10 += var11 + -1;
                int var12 = var10 & 63;
                int var13 = (var10 & 4062) >> 6;
                int var14 = var10 >> 12;
                int var15 = var7.method1858(-3256);
                int var16 = var15 >> 2;
                int var17 = var15 & 3;
                int var18 = arg5 + var13;
                int var19 = arg4 + var12;
                if (~var18 < -1 && var19 > 0 && ~(super.field1341 + -1) < ~var18 && super.field1336 + -1 > var19) {
                    class63 var20 = null;
                    if (!super.field1342) {
                        int var21 = var14;
                        if ((2 & class22.field333[1][var18][var19]) == 2) {
                            var21 = var14 - 1;
                        }
                        if (~var21 <= -1) {
                            var20 = arg3[var21];
                        }
                    }
                    this.method2837((byte) 52, var19, var16, var20, var8, var18, var14, var17, arg1, -1, var14);
                }
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(BIILsd;IIIILza;II)V")
    public final void method2837(byte arg0, int arg1, int arg2, class63 arg3, int arg4, int arg5, int arg6, int arg7, class288 arg8, int arg9, int arg10) {
        ++field7027;
        if (class186.field2990.method1783(-1, class133.field2236) || class377.method2314(arg10, class419.field6303, arg1, arg5, false)) {
            if (~this.field7025 < ~arg6) {
                this.field7025 = arg6;
            }
            class306 var12 = class123.field2142.method1530((byte) -109, arg4);
            if (!arg8.method449() || !class186.field2990.field2531 || !var12.field4611) {
                int var13;
                int var14;
                if (arg7 != 1 && ~arg7 != -4) {
                    var13 = var12.field4601;
                    var14 = var12.field4595;
                } else {
                    var13 = var12.field4595;
                    var14 = var12.field4601;
                }
                int var15;
                int var16;
                if (~(arg5 + var13) >= ~super.field1341) {
                    var15 = (var13 + 1 >> 1) + arg5;
                    var16 = (var13 >> 1) + arg5;
                } else {
                    var16 = arg5;
                    var15 = arg5 + 1;
                }
                int var17;
                int var18;
                if (super.field1336 < arg1 + var14) {
                    var17 = arg1 + 1;
                    var18 = arg1;
                } else {
                    var18 = (var14 >> 1) + arg1;
                    var17 = (var14 + 1 >> 1) + arg1;
                }
                class38 var19 = class520.field7560[arg10];
                int var20 = var19.method177(var16, var18) + (var19.method177(var15, var18) - (-var19.method177(var16, var17) - var19.method177(var15, var17))) >> 2;
                int var21 = -53 % ((14 - arg0) / 37);
                int var22 = (arg5 << 7) + (var13 << 6);
                int var23 = (arg1 << 7) + (var14 << 6);
                boolean var24 = class34.field525 && !super.field1342 && var12.field4645;
                if (var12.method1947((byte) 68)) {
                    class504.method3028(arg1, (byte) 86, (class366) null, var12, arg5, arg7, arg6, (class163) null);
                }
                boolean var25 = arg9 == -1 && ~var12.field4563 == 0 && var12.field4631 == null && var12.field4593 == null && !var12.field4594;
                if (!class198.field3186 || (!class144.method1073(106, arg2) || var12.field4578 == 1) && (!class448.method2681(-18, arg2) || ~var12.field4578 != -1)) {
                    if (~arg2 == -23) {
                        if (class186.field2990.field2529 || ~var12.field4587 != -1 || ~var12.field4614 == -2 || var12.field4629) {
                            class311 var27;
                            if (var25) {
                                class174 var26 = new class174(arg8, var12, arg10, var22, var20, var23, super.field1342, arg7, var24);
                                var27 = var26;
                                if (var26.method228(1396)) {
                                    var26.method232(arg8, true);
                                }
                            } else {
                                var27 = new class199(arg8, var12, arg6, arg10, var22, var20, var23, super.field1342, arg7, arg9);
                            }
                            class311 var28 = class296.method1911(arg6, arg5, arg1);
                            if (var28 instanceof class65) {
                                ((class65) var28).field1320 = var27;
                            } else {
                                class146.method1079(arg6, arg5, arg1, var27);
                            }
                            if (~var12.field4614 == -2 && arg3 != null) {
                                arg3.method553((byte) -40, arg1, arg5);
                            }
                        }
                    } else if (arg2 != 10 && arg2 != 11) {
                        if (arg2 >= 12 && arg2 <= 17 || ~arg2 <= -19 && ~arg2 >= -22) {
                            class402 var29;
                            if (!var25) {
                                var29 = new class133(arg8, var12, arg6, arg10, var22, var20, var23, super.field1342, arg5, var13 - 1 + arg5, arg1, arg1 - -var14 + -1, arg2, arg7, arg9);
                            } else {
                                class54 var30 = new class54(arg8, var12, arg6, arg10, var22, var20, var23, super.field1342, arg5, var13 - 1 + arg5, arg1, arg1 + -1 + var14, arg2, arg7, var24);
                                if (var30.method228(1396)) {
                                    var30.method232(arg8, true);
                                }
                                var29 = var30;
                            }
                            class402 var31 = class479.method2859(arg6, arg5, arg1, field7036 != null ? field7036 : (field7036 = method2840("rj")));
                            if (var31 instanceof class110 && ~var31.field6082 == ~arg5 && ~var31.field6077 == ~arg1) {
                                ((class110) var31).field2018 = var29;
                            } else {
                                class234.method1538(var29, false);
                            }
                            if (class34.field525 && !super.field1342 && arg2 >= 12 && ~arg2 >= -18 && ~arg2 != -14 && arg6 > 0 && var12.field4578 != 0) {
                                super.field1354[arg6][arg5][arg1] = (byte) class418.method2558(super.field1354[arg6][arg5][arg1], 4);
                            }
                            if (~var12.field4614 != -1 && arg3 != null) {
                                arg3.method549(var12.field4609, var13, arg5, !var12.field4620, arg1, -101, var14);
                            }
                        } else if (~arg2 == -1) {
                            int var32 = var12.field4578;
                            if (class123.field2141 && ~var12.field4578 == 0) {
                                var32 = 1;
                            }
                            class50 var33;
                            if (!var25) {
                                var33 = new class250(arg8, var12, arg6, arg10, var22, var20, var23, super.field1342, arg2, arg7, arg9);
                            } else {
                                class190 var34 = new class190(arg8, var12, arg10, var22, var20, var23, super.field1342, arg2, arg7, var24);
                                var33 = var34;
                                if (var34.method228(1396)) {
                                    var34.method232(arg8, true);
                                }
                            }
                            class50 var35 = class211.method1435(arg6, arg5, arg1);
                            if (var35 instanceof class237) {
                                ((class237) var35).field3664 = var33;
                            } else {
                                class325.method2069(arg6, arg5, arg1, var33, (class50) null);
                            }
                            if (class34.field525) {
                                if (arg7 == 0) {
                                    if (var12.field4608) {
                                        var19.method179(arg5, arg1, 50);
                                        var19.method179(arg5, arg1 + 1, 50);
                                    }
                                    if (var32 == 1 && !super.field1342) {
                                        super.field1354[arg6][arg5][arg1] = (byte) class418.method2558(super.field1354[arg6][arg5][arg1], 1);
                                    }
                                } else if (arg7 == 1) {
                                    if (var12.field4608) {
                                        var19.method179(arg5, arg1 + 1, 50);
                                        var19.method179(arg5 + 1, arg1 + 1, 50);
                                    }
                                    if (~var32 == -2 && !super.field1342) {
                                        super.field1354[arg6][arg5][arg1 + 1] = (byte) class418.method2558(super.field1354[arg6][arg5][arg1 + 1], 2);
                                    }
                                } else if (arg7 != 2) {
                                    if (arg7 == 3) {
                                        if (var12.field4608) {
                                            var19.method179(arg5, arg1, 50);
                                            var19.method179(arg5 + 1, arg1, 50);
                                        }
                                        if (~var32 == -2 && !super.field1342) {
                                            super.field1354[arg6][arg5][arg1] = (byte) class418.method2558(super.field1354[arg6][arg5][arg1], 2);
                                        }
                                    }
                                } else {
                                    if (var12.field4608) {
                                        var19.method179(arg5 + 1, arg1, 50);
                                        var19.method179(arg5 + 1, arg1 + 1, 50);
                                    }
                                    if (var32 == 1 && !super.field1342) {
                                        super.field1354[arg6][arg5 + 1][arg1] = (byte) class418.method2558(super.field1354[arg6][arg5 + 1][arg1], 1);
                                    }
                                }
                            }
                            if (~var12.field4614 != -1 && arg3 != null) {
                                arg3.method560(!var12.field4620, -24, arg1, arg5, arg2, arg7, var12.field4609);
                            }
                            if (var12.field4575 != 16) {
                                class247.method1600(arg6, arg5, arg1, var12.field4575);
                            }
                        } else if (~arg2 == -2) {
                            class50 var36;
                            if (!var25) {
                                var36 = new class250(arg8, var12, arg6, arg10, var22, var20, var23, super.field1342, arg2, arg7, arg9);
                            } else {
                                class190 var37 = new class190(arg8, var12, arg10, var22, var20, var23, super.field1342, arg2, arg7, var24);
                                if (var37.method228(1396)) {
                                    var37.method232(arg8, true);
                                }
                                var36 = var37;
                            }
                            class50 var38 = class211.method1435(arg6, arg5, arg1);
                            if (!(var38 instanceof class237)) {
                                class325.method2069(arg6, arg5, arg1, var36, (class50) null);
                            } else {
                                ((class237) var38).field3664 = var36;
                            }
                            if (var12.field4608 && class34.field525) {
                                if (~arg7 == -1) {
                                    var19.method179(arg5, arg1 + 1, 50);
                                } else if (arg7 != 1) {
                                    if (~arg7 == -3) {
                                        var19.method179(arg5 - -1, arg1, 50);
                                    } else if (arg7 == 3) {
                                        var19.method179(arg5, arg1, 50);
                                    }
                                } else {
                                    var19.method179(arg5 + 1, arg1 + 1, 50);
                                }
                            }
                            if (var12.field4614 != 0 && arg3 != null) {
                                arg3.method560(!var12.field4620, -47, arg1, arg5, arg2, arg7, var12.field4609);
                            }
                        } else if (arg2 == 2) {
                            int var39 = arg7 + 1 & 3;
                            class50 var40;
                            class50 var41;
                            if (!var25) {
                                var40 = new class250(arg8, var12, arg6, arg10, var22, var20, var23, super.field1342, arg2, arg7 + 4, arg9);
                                var41 = new class250(arg8, var12, arg6, arg10, var22, var20, var23, super.field1342, arg2, var39, arg9);
                            } else {
                                class190 var42 = new class190(arg8, var12, arg10, var22, var20, var23, super.field1342, arg2, arg7 + 4, var24);
                                class190 var43 = new class190(arg8, var12, arg10, var22, var20, var23, super.field1342, arg2, var39, var24);
                                if (var42.method228(1396)) {
                                    var42.method232(arg8, true);
                                }
                                var41 = var43;
                                if (var43.method228(1396)) {
                                    var43.method232(arg8, true);
                                }
                                var40 = var42;
                            }
                            class325.method2069(arg6, arg5, arg1, var40, var41);
                            if (var12.field4578 == 1 && class34.field525 && !super.field1342) {
                                if (arg7 != 0) {
                                    if (arg7 != 1) {
                                        if (~arg7 == -3) {
                                            super.field1354[arg6][arg5 + 1][arg1] = (byte) class418.method2558(super.field1354[arg6][arg5 + 1][arg1], 1);
                                            super.field1354[arg6][arg5][arg1] = (byte) class418.method2558(super.field1354[arg6][arg5][arg1], 2);
                                        } else if (~arg7 == -4) {
                                            super.field1354[arg6][arg5][arg1] = (byte) class418.method2558(super.field1354[arg6][arg5][arg1], 2);
                                            super.field1354[arg6][arg5][arg1] = (byte) class418.method2558(super.field1354[arg6][arg5][arg1], 1);
                                        }
                                    } else {
                                        super.field1354[arg6][arg5][arg1 + 1] = (byte) class418.method2558(super.field1354[arg6][arg5][arg1 + 1], 2);
                                        super.field1354[arg6][arg5 + 1][arg1] = (byte) class418.method2558(super.field1354[arg6][arg5 + 1][arg1], 1);
                                    }
                                } else {
                                    super.field1354[arg6][arg5][arg1] = (byte) class418.method2558(super.field1354[arg6][arg5][arg1], 1);
                                    super.field1354[arg6][arg5][arg1 + 1] = (byte) class418.method2558(super.field1354[arg6][arg5][arg1 + 1], 2);
                                }
                            }
                            if (var12.field4614 != 0 && arg3 != null) {
                                arg3.method560(!var12.field4620, -90, arg1, arg5, arg2, arg7, var12.field4609);
                            }
                            if (~var12.field4575 != -17) {
                                class247.method1600(arg6, arg5, arg1, var12.field4575);
                            }
                        } else if (arg2 == 3) {
                            class50 var45;
                            if (var25) {
                                class190 var44 = new class190(arg8, var12, arg10, var22, var20, var23, super.field1342, arg2, arg7, var24);
                                var45 = var44;
                                if (var44.method228(1396)) {
                                    var44.method232(arg8, true);
                                }
                            } else {
                                var45 = new class250(arg8, var12, arg6, arg10, var22, var20, var23, super.field1342, arg2, arg7, arg9);
                            }
                            class50 var46 = class211.method1435(arg6, arg5, arg1);
                            if (var46 instanceof class237) {
                                ((class237) var46).field3664 = var45;
                            } else {
                                class325.method2069(arg6, arg5, arg1, var45, (class50) null);
                            }
                            if (var12.field4608 && class34.field525) {
                                if (arg7 == 0) {
                                    var19.method179(arg5, arg1 + 1, 50);
                                } else if (arg7 != 1) {
                                    if (~arg7 != -3) {
                                        if (arg7 == 3) {
                                            var19.method179(arg5, arg1, 50);
                                        }
                                    } else {
                                        var19.method179(arg5 + 1, arg1, 50);
                                    }
                                } else {
                                    var19.method179(arg5 + 1, arg1 + 1, 50);
                                }
                            }
                            if (var12.field4614 != 0 && arg3 != null) {
                                arg3.method560(!var12.field4620, 100, arg1, arg5, arg2, arg7, var12.field4609);
                            }
                        } else if (~arg2 == -10) {
                            class402 var47;
                            if (!var25) {
                                var47 = new class133(arg8, var12, arg6, arg10, var22, var20, var23, super.field1342, arg5, arg5 - -var13 + -1, arg1, arg1 - 1 + var14, arg2, arg7, arg9);
                            } else {
                                class54 var48 = new class54(arg8, var12, arg6, arg10, var22, var20, var23, super.field1342, arg5, arg5, arg1, arg1, arg2, arg7, var24);
                                if (var48.method228(1396)) {
                                    var48.method232(arg8, true);
                                }
                                var47 = var48;
                            }
                            class402 var49 = class479.method2859(arg6, arg5, arg1, field7036 != null ? field7036 : (field7036 = method2840("rj")));
                            if (var49 instanceof class110 && ~var49.field6082 == ~arg5 && ~var49.field6077 == ~arg1) {
                                ((class110) var49).field2018 = var47;
                            } else {
                                class234.method1538(var47, false);
                            }
                            if (~var12.field4614 != -1 && arg3 != null) {
                                arg3.method549(var12.field4609, var13, arg5, !var12.field4620, arg1, -112, var14);
                            }
                            if (var12.field4575 != 16) {
                                class247.method1600(arg6, arg5, arg1, var12.field4575);
                            }
                        } else if (arg2 == 4) {
                            class210 var51;
                            if (var25) {
                                class280 var50 = new class280(arg8, var12, arg10, var22, var20, var23, super.field1342, 0, 0, 0, arg2, arg7);
                                var51 = var50;
                                if (var50.method228(1396)) {
                                    var50.method232(arg8, true);
                                }
                            } else {
                                var51 = new class327(arg8, var12, arg6, arg10, var22, var20, var23, super.field1342, 0, 0, 0, arg2, arg7, arg9);
                            }
                            class210 var52 = class498.method3008(arg6, arg5, arg1);
                            if (!(var52 instanceof class33)) {
                                class385.method2361(arg6, arg5, arg1, var51, (class210) null);
                            } else {
                                ((class33) var52).field511 = var51;
                            }
                        } else if (arg2 == 5) {
                            int var53 = 17;
                            class425 var54 = (class425) class211.method1435(arg6, arg5, arg1);
                            if (var54 != null) {
                                var53 = 1 + class123.field2142.method1530((byte) -48, var54.method224(-10848)).field4575;
                            }
                            class210 var56;
                            if (var25) {
                                class280 var55 = new class280(arg8, var12, arg10, var22, var20, var23, super.field1342, 0, class136.field2293[arg7] * var53, class93.field1850[arg7] * var53, arg2, arg7);
                                var56 = var55;
                                if (var55.method228(1396)) {
                                    var55.method232(arg8, true);
                                }
                            } else {
                                var56 = new class327(arg8, var12, arg6, arg10, var22, var20, var23, super.field1342, 0, class136.field2293[arg7] * var53, class93.field1850[arg7] * var53, arg2, arg7, arg9);
                            }
                            class210 var57 = class498.method3008(arg6, arg5, arg1);
                            if (!(var57 instanceof class33)) {
                                class385.method2361(arg6, arg5, arg1, var56, (class210) null);
                            } else {
                                ((class33) var57).field511 = var56;
                            }
                        } else if (~arg2 == -7) {
                            int var58 = 9;
                            class425 var59 = (class425) class211.method1435(arg6, arg5, arg1);
                            if (var59 != null) {
                                var58 = 1 + class123.field2142.method1530((byte) -105, var59.method224(-10848)).field4575 / 2;
                            }
                            class210 var60;
                            if (!var25) {
                                var60 = new class327(arg8, var12, arg6, arg10, var22, var20, var23, super.field1342, arg7, class264.field4031[arg7] * var58, class129.field2199[arg7] * var58, arg2, arg7 + 4, arg9);
                            } else {
                                class280 var61 = new class280(arg8, var12, arg10, var22, var20, var23, super.field1342, arg7, class136.field2293[arg7] * var58, class93.field1850[arg7] * var58, arg2, arg7 + 4);
                                var60 = var61;
                                if (var61.method228(1396)) {
                                    var61.method232(arg8, true);
                                }
                            }
                            class210 var62 = class498.method3008(arg6, arg5, arg1);
                            if (!(var62 instanceof class33)) {
                                class385.method2361(arg6, arg5, arg1, var60, (class210) null);
                            } else {
                                ((class33) var62).field511 = var60;
                            }
                        } else if (~arg2 == -8) {
                            int var63 = 3 & arg7 + 2;
                            class210 var65;
                            if (var25) {
                                class280 var64 = new class280(arg8, var12, arg10, var22, var20, var23, super.field1342, var63, 0, 0, arg2, var63 - -4);
                                var65 = var64;
                                if (var64.method228(1396)) {
                                    var64.method232(arg8, true);
                                }
                            } else {
                                var65 = new class327(arg8, var12, arg6, arg10, var22, var20, var23, super.field1342, var63, 0, 0, arg2, var63 + 4, arg9);
                            }
                            class210 var66 = class498.method3008(arg6, arg5, arg1);
                            if (var66 instanceof class33) {
                                ((class33) var66).field511 = var65;
                            } else {
                                class385.method2361(arg6, arg5, arg1, var65, (class210) null);
                            }
                        } else if (arg2 == 8) {
                            int var67 = 3 & arg7 + 2;
                            int var68 = 9;
                            class425 var69 = (class425) class211.method1435(arg6, arg5, arg1);
                            if (var69 != null) {
                                var68 = class123.field2142.method1530((byte) -97, var69.method224(-10848)).field4575 / 2 - -1;
                            }
                            class210 var72;
                            class210 var73;
                            if (!var25) {
                                class327 var70 = new class327(arg8, var12, arg6, arg10, var22, var20, var23, super.field1342, arg7, class264.field4031[arg7] * var68, class129.field2199[arg7] * var68, arg2, arg7 + 4, arg9);
                                class327 var71 = new class327(arg8, var12, arg6, arg10, var22, var20, var23, super.field1342, arg7, 0, 0, arg2, var67 + 4, arg9);
                                var72 = var70;
                                var73 = var71;
                            } else {
                                class280 var74 = new class280(arg8, var12, arg10, var22, var20, var23, super.field1342, arg7, class264.field4031[arg7] * var68, class129.field2199[arg7] * var68, arg2, arg7 + 4);
                                class280 var75 = new class280(arg8, var12, arg10, var22, var20, var23, super.field1342, arg7, 0, 0, arg2, var67 - -4);
                                if (var74.method228(1396)) {
                                    var74.method232(arg8, true);
                                }
                                var72 = var74;
                                if (var75.method228(1396)) {
                                    var75.method232(arg8, true);
                                }
                                var73 = var75;
                            }
                            class385.method2361(arg6, arg5, arg1, var72, var73);
                        }
                    } else {
                        class54 var76 = null;
                        class402 var78;
                        int var79;
                        if (var25) {
                            class54 var77 = new class54(arg8, var12, arg6, arg10, var22, var20, var23, super.field1342, arg5, arg5 + var13 - 1, arg1, arg1 + -1 - -var14, arg2, arg7, var24);
                            var76 = var77;
                            var78 = var77;
                            var79 = var77.method505(262144);
                        } else {
                            var79 = 15;
                            var78 = new class133(arg8, var12, arg6, arg10, var22, var20, var23, super.field1342, arg5, arg5 + var13 - 1, arg1, arg1 - (-var14 - -1), arg2, arg7, arg9);
                        }
                        class402 var80 = class479.method2859(arg6, arg5, arg1, field7036 != null ? field7036 : (field7036 = method2840("rj")));
                        boolean var81 = false;
                        if (var80 instanceof class110 && var80.field6082 == arg5 && var80.field6077 == arg1) {
                            ((class110) var80).field2018 = var78;
                            var81 = true;
                        }
                        if (var81 || class234.method1538(var78, false)) {
                            if (var76 != null && var76.method228(1396)) {
                                var76.method232(arg8, true);
                            }
                            if (var12.field4608 && class34.field525) {
                                if (var79 > 30) {
                                    var79 = 30;
                                }
                                for (int var82 = 0; var13 >= var82; ++var82) {
                                    for (int var83 = 0; var83 <= var14; ++var83) {
                                        var19.method179(arg5 + var82, arg1 + var83, var79);
                                    }
                                }
                            }
                        }
                        if (~var12.field4614 != -1 && arg3 != null) {
                            arg3.method549(var12.field4609, var13, arg5, !var12.field4620, arg1, -115, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(BLza;)V")
    public final void method2838(byte arg0, class288 arg1) {
        ++field7029;
        class186.method1269(arg1);
        if (super.field1348 > 1) {
            for (int var3 = 0; ~super.field1341 < ~var3; ++var3) {
                for (int var4 = 0; super.field1336 > var4; ++var4) {
                    if ((class22.field333[1][var3][var4] & 2) == 2) {
                        class134.method1024(var3, var4);
                    }
                }
            }
        }
        if (arg0 == -104) {
            for (int var5 = 0; ~super.field1348 < ~var5; ++var5) {
                for (int var6 = 0; var6 <= super.field1336; ++var6) {
                    for (int var7 = 0; ~var7 >= ~super.field1341; ++var7) {
                        if ((super.field1354[var5][var7][var6] & 1) != 0) {
                            int var8 = var6;
                            int var9 = var6;
                            int var10 = var5;
                            while (super.field1336 > var9 && ~(super.field1354[var5][var7][var9 + 1] & 1) != -1) {
                                ++var9;
                            }
                            int var11 = var5;
                            while (~var8 < -1 && (1 & super.field1354[var5][var7][var8 + -1]) != 0) {
                                --var8;
                            }
                            label171: while (var10 > 0) {
                                for (int var12 = var8; var9 >= var12; ++var12) {
                                    if (~(1 & super.field1354[var10 + -1][var7][var12]) == -1) {
                                        break label171;
                                    }
                                }
                                --var10;
                            }
                            label160: while (~var11 > -4) {
                                for (int var13 = var8; var9 >= var13; ++var13) {
                                    if (~(super.field1354[var11 + 1][var7][var13] & 1) == -1) {
                                        break label160;
                                    }
                                }
                                ++var11;
                            }
                            int var14 = (-var8 + var9 - -1) * (-var10 + var11 - -1);
                            if (var14 >= 2) {
                                short var15 = 240;
                                int var16 = super.field1355[var11][var7][var8] - var15;
                                int var17 = super.field1355[var10][var7][var8];
                                class263.method1683(1, var7 << 7, var7 << 7, var8 << 7, (var9 << 7) + 128, var16, var17);
                                for (int var18 = var10; ~var18 >= ~var11; ++var18) {
                                    for (int var19 = var8; ~var19 >= ~var9; ++var19) {
                                        super.field1354[var18][var7][var19] = (byte) class490.method2960(super.field1354[var18][var7][var19], -2);
                                    }
                                }
                            }
                        }
                        if (~(super.field1354[var5][var7][var6] & 2) != -1) {
                            int var20 = var7;
                            int var21 = var7;
                            int var22 = var5;
                            int var23 = var5;
                            while (super.field1341 > var21 && (2 & super.field1354[var5][var21 + 1][var6]) != 0) {
                                ++var21;
                            }
                            while (var20 > 0 && (2 & super.field1354[var5][var20 + -1][var6]) != 0) {
                                --var20;
                            }
                            label225: while (var22 > 0) {
                                for (int var24 = var20; var24 <= var21; ++var24) {
                                    if (~(super.field1354[var22 + -1][var24][var6] & 2) == -1) {
                                        break label225;
                                    }
                                }
                                --var22;
                            }
                            label214: while (var23 < 3) {
                                for (int var25 = var20; var21 >= var25; ++var25) {
                                    if (~(2 & super.field1354[var23 + 1][var25][var6]) == -1) {
                                        break label214;
                                    }
                                }
                                ++var23;
                            }
                            int var26 = (var23 - (var22 + -1)) * (var21 - var20 + 1);
                            if (~var26 <= -3) {
                                short var27 = 240;
                                int var28 = super.field1355[var23][var20][var6] + -var27;
                                int var29 = super.field1355[var22][var20][var6];
                                class263.method1683(2, var20 << 7, (var21 << 7) + 128, var6 << 7, var6 << 7, var28, var29);
                                for (int var30 = var22; ~var30 >= ~var23; ++var30) {
                                    for (int var31 = var20; ~var31 >= ~var21; ++var31) {
                                        super.field1354[var30][var31][var6] = (byte) class490.method2960(super.field1354[var30][var31][var6], -3);
                                    }
                                }
                            }
                        }
                        if ((super.field1354[var5][var7][var6] & 4) != 0) {
                            int var32 = var7;
                            int var33 = var7;
                            int var34;
                            for (var34 = var6; var34 > 0 && ~(super.field1354[var5][var7][var34 + -1] & 4) != -1; --var34) {
                            }
                            int var35;
                            for (var35 = var6; super.field1336 > var35 && (4 & super.field1354[var5][var7][var35 + 1]) != 0; ++var35) {
                            }
                            label278: while (var32 > 0) {
                                for (int var36 = var34; var35 >= var36; ++var36) {
                                    if (~(4 & super.field1354[var5][var32 + -1][var36]) == -1) {
                                        break label278;
                                    }
                                }
                                --var32;
                            }
                            label267: while (~var33 > ~super.field1341) {
                                for (int var37 = var34; var35 >= var37; ++var37) {
                                    if ((super.field1354[var5][var33 - -1][var37] & 4) == 0) {
                                        break label267;
                                    }
                                }
                                ++var33;
                            }
                            if (~((-var32 + var33 - -1) * (var35 - -1 + -var34)) <= -5) {
                                int var38 = super.field1355[var5][var32][var34];
                                class263.method1683(4, var32 << 7, (var33 << 7) + 128, var34 << 7, (var35 << 7) + 128, var38, var38);
                                for (int var39 = var32; var39 <= var33; ++var39) {
                                    for (int var40 = var34; ~var35 <= ~var40; ++var40) {
                                        super.field1354[var5][var39][var40] = (byte) class490.method2960(super.field1354[var5][var39][var40], -5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            super.field1354 = null;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(III)I")
    public static final int method2839(int arg0, int arg1, int arg2) {
        ++field7032;
        int var3 = arg1 >>> 24;
        if (arg0 != -10679) {
            method2834(false, (String) null);
        }
        int var4 = -var3 + 255;
        int var5 = ((16711935 & arg1) * var3 & -16711936 | (65280 & arg1) * var3 & 16711680) >>> 8;
        return (((arg2 & 65280) * var4 & 16711680 | (arg2 & 16711935) * var4 & -16711936) >>> 8) + var5;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2840(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
