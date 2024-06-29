import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class117 extends class285 {

    @OriginalMember(owner = "client!er", name = "C", descriptor = "I")
    public int field1482 = 99;

    @OriginalMember(owner = "client!er", name = "F", descriptor = "Z")
    public static boolean field1485 = false;

    @OriginalMember(owner = "client!er", name = "O", descriptor = "Lhj;")
    public static class596 field1494 = new class596(34, 20);

    @OriginalMember(owner = "client!er", name = "Q", descriptor = "I")
    public static int field1496 = 2;

    @OriginalMember(owner = "client!er", name = "R", descriptor = "[B")
    public static byte[] field1497 = new byte[520];

    @OriginalMember(owner = "client!er", name = "D", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!er", name = "E", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!er", name = "G", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!er", name = "H", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!er", name = "I", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!er", name = "J", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!er", name = "K", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!er", name = "L", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!er", name = "M", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!er", name = "N", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!er", name = "P", descriptor = "I")
    public static int field1495;

    // $FF: synthetic field
    @OriginalMember(owner = "client!er", name = "S", descriptor = "Ljava/lang/Class;")
    public static Class field1498;

    // $FF: synthetic method
    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method924(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(B[BIIII[Lwj;ILha;II)V", line = 4)
    public final void method915(byte arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, class415[] arg6, int arg7, class66 arg8, int arg9, int arg10) {
        ++field1492;
        class403 var12 = new class403(arg1);
        int var13 = -1;
        while (true) {
            int var14 = var12.method2417(arg0 + -213);
            if (var14 == 0) {
                if (arg0 != 110) {
                    field1495 = 22;
                    return;
                }
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method2354((byte) -110);
                if (var16 == 0) {
                    break;
                }
                var15 += var16 + -1;
                int var17 = var15 & 63;
                int var18 = 63 & var15 >> 6;
                int var19 = var15 >> 12;
                int var20 = var12.method2396((byte) 69);
                int var21 = var20 >> 2;
                int var22 = var20 & 3;
                if (~arg10 == ~var19 && arg5 <= var18 && ~var18 > ~(arg5 + 8) && ~arg4 >= ~var17 && ~var17 > ~(arg4 + 8)) {
                    class174 var23 = class379.field4811.method4192(27324, var13);
                    int var24 = arg2 - -class382.method2238(arg9, var23.field2147, 7 & var18, 7 & var17, var23.field2125, true, var22);
                    int var25 = arg7 - -class403.method2356(var23.field2125, 7 & var18, arg9, 255, 7 & var17, var22, var23.field2147);
                    if (var24 > 0 && ~var25 < -1 && var24 < super.field3339 + -1 && super.field3326 + -1 > var25) {
                        class415 var26 = null;
                        if (!super.field3316) {
                            int var27 = arg3;
                            if ((class124.field1585[1][var24][var25] & 2) == 2) {
                                var27 = arg3 - 1;
                            }
                            if (~var27 <= -1) {
                                var26 = arg6[var27];
                            }
                        }
                        this.method922(arg9 + var22 & 3, var26, arg3, var13, var21, var24, false, -1, var25, arg3, arg8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(ILha;I[Lwj;[BI)V", line = 86)
    public final void method916(int arg0, class66 arg1, int arg2, class415[] arg3, byte[] arg4, int arg5) {
        if (arg0 == 899005698) {
            ++field1489;
            class403 var7 = new class403(arg4);
            int var8 = -1;
            while (true) {
                int var9 = var7.method2417(arg0 + -899005754);
                if (~var9 == -1) {
                    return;
                }
                var8 += var9;
                int var10 = 0;
                while (true) {
                    int var11 = var7.method2354((byte) 81);
                    if (var11 == 0) {
                        break;
                    }
                    var10 += var11 + -1;
                    int var12 = 63 & var10;
                    int var13 = var10 >> 6 & 63;
                    int var14 = var10 >> 12;
                    int var15 = var7.method2396((byte) 34);
                    int var16 = var15 >> 2;
                    int var17 = 3 & var15;
                    int var18 = var13 - -arg5;
                    int var19 = var12 - -arg2;
                    if (~var18 < -1 && ~var19 < -1 && super.field3339 - 1 > var18 && var19 < super.field3326 + -1) {
                        class415 var20 = null;
                        if (!super.field3316) {
                            int var21 = var14;
                            if ((class124.field1585[1][var18][var19] & 2) == 2) {
                                var21 = var14 - 1;
                            }
                            if (~var21 <= -1) {
                                var20 = arg3[var21];
                            }
                        }
                        this.method922(var17, var20, var14, var8, var16, var18, false, -1, var19, var14, arg1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Lha;IZ)V", line = 160)
    public final void method917(class66 arg0, int arg1, boolean arg2) {
        class260.method1562();
        ++field1488;
        int var4 = -70 % ((69 - arg1) / 54);
        if (!arg2) {
            if (super.field3317 > 1) {
                for (int var5 = 0; ~var5 > ~super.field3339; ++var5) {
                    for (int var6 = 0; super.field3326 > var6; ++var6) {
                        if (~(class124.field1585[1][var5][var6] & 2) == -3) {
                            class627.method3555(var5, var6);
                        }
                    }
                }
            }
            for (int var7 = 0; var7 < super.field3317; ++var7) {
                for (int var8 = 0; var8 <= super.field3326; ++var8) {
                    for (int var9 = 0; ~super.field3339 <= ~var9; ++var9) {
                        if ((super.field3322[var7][var9][var8] & 4) != 0) {
                            int var10 = var9;
                            int var11 = var9;
                            int var12 = var8;
                            int var13 = var8;
                            while (~var12 < -1 && ~(super.field3322[var7][var9][var12 + -1] & 4) != -1 && ~(-var12 + var13) > -11) {
                                --var12;
                            }
                            while (super.field3326 > var13 && ~(4 & super.field3322[var7][var9][var13 + 1]) != -1 && ~(-var12 + var13) > -11) {
                                ++var13;
                            }
                            label114: while (var10 > 0 && -var10 + var11 < 10) {
                                for (int var14 = var12; var13 >= var14; ++var14) {
                                    if ((4 & super.field3322[var7][var10 - 1][var14]) == 0) {
                                        break label114;
                                    }
                                }
                                --var10;
                            }
                            label101: while (~var11 > ~super.field3339 && -var10 + var11 < 10) {
                                for (int var15 = var12; var13 >= var15; ++var15) {
                                    if ((super.field3322[var7][var11 + 1][var15] & 4) == 0) {
                                        break label101;
                                    }
                                }
                                ++var11;
                            }
                            if (~((-var10 + var11 + 1) * (-var12 + var13 + 1)) <= -5) {
                                int var16 = super.field3331[var7][var10][var12];
                                class11.method179(var12 << 9, var10 << 9, var16, (var11 << 9) + 512, 4, (byte) 82, var16, (var13 << 9) + 512, var7);
                                for (int var17 = var10; ~var17 >= ~var11; ++var17) {
                                    for (int var18 = var12; ~var13 <= ~var18; ++var18) {
                                        super.field3322[var7][var17][var18] = (byte) class296.method1733(super.field3322[var7][var17][var18], -5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class358.method2097(237);
        }
        super.field3322 = null;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Lha;IIB[ILes;)V", line = 297)
    public final void method918(class66 arg0, int arg1, int arg2, byte arg3, int[] arg4, class403 arg5) {
        ++field1490;
        if (!super.field3316) {
            boolean var7 = false;
            if (arg3 >= -126) {
                field1495 = 93;
            }
            class140 var8 = null;
            if (arg4 != null) {
                arg4[0] = -1;
            }
            while (true) {
                while (~arg5.field5262 > ~arg5.field5275.length) {
                    int var18 = arg5.method2396((byte) -118);
                    if (~var18 == -1) {
                        var8 = new class140(arg5);
                    } else if (~var18 == -2) {
                        int var19 = arg5.method2396((byte) -112);
                        if (~var19 < -1) {
                            for (int var20 = 0; var20 < var19; ++var20) {
                                class110 var21 = new class110(arg0, arg5, 2);
                                if (var21.field1388 == 31) {
                                    class652 var22 = class520.field7343.method2821((byte) -121, arg5.method2390((byte) 124));
                                    var21.method883(var22.field9007, 117, var22.field9001, var22.field9004, var22.field8999);
                                }
                                if (arg0.method583() > 0) {
                                    class515 var23 = var21.field1374;
                                    int var24 = var23.method3084(0) - -(arg1 << 9);
                                    int var25 = var23.method3085(true) + (arg2 << 9);
                                    int var26 = var24 >> 9;
                                    int var27 = var25 >> 9;
                                    if (~var26 <= -1 && var27 >= 0 && super.field3339 > var26 && var27 < super.field3326) {
                                        var23.method544((byte) 25, var25, super.field3331[var21.field1385][var26][var27] - var23.method3086((byte) -110), var24);
                                        class391.method2295(var21);
                                    }
                                }
                            }
                        }
                    } else if (var18 == 2) {
                        if (var8 == null) {
                            var8 = new class140();
                        }
                        var8.method1022(109, arg5);
                    } else if (~var18 == -129) {
                        if (arg4 == null) {
                            arg5.field5262 += 10;
                        } else {
                            arg4[0] = arg5.method2390((byte) -108);
                            arg4[1] = arg5.method2365(true);
                            arg4[2] = arg5.method2365(true);
                            arg4[3] = arg5.method2365(true);
                            arg4[4] = arg5.method2390((byte) 111);
                        }
                    } else {
                        if (var18 != 129) {
                            throw new IllegalStateException("");
                        }
                        if (super.field3334 == null) {
                            super.field3334 = new byte[4][][];
                        }
                        var7 = true;
                        for (int var28 = 0; var28 < 4; ++var28) {
                            byte var29 = arg5.method2392(23);
                            if (var29 == 0 && super.field3334[var28] != null) {
                                int var30 = arg1;
                                int var31 = arg1 + 64;
                                int var32 = arg2;
                                if (arg1 >= 0) {
                                    if (~super.field3339 >= ~arg1) {
                                        var30 = super.field3339;
                                    }
                                } else {
                                    var30 = 0;
                                }
                                int var33 = arg2 - -64;
                                if (arg2 >= 0) {
                                    if (arg2 >= super.field3326) {
                                        var32 = super.field3326;
                                    }
                                } else {
                                    var32 = 0;
                                }
                                if (var31 >= 0) {
                                    if (super.field3339 <= var31) {
                                        var31 = super.field3339;
                                    }
                                } else {
                                    var31 = 0;
                                }
                                if (~var33 > -1) {
                                    var33 = 0;
                                } else if (~var33 <= ~super.field3326) {
                                    var33 = super.field3326;
                                }
                                while (var31 > var30) {
                                    while (~var32 > ~var33) {
                                        super.field3334[var28][var30][var32] = 0;
                                        ++var32;
                                    }
                                    ++var30;
                                }
                            } else if (var29 == 1) {
                                if (super.field3334[var28] == null) {
                                    super.field3334[var28] = new byte[super.field3339 + 1][super.field3326 + 1];
                                }
                                for (int var34 = 0; var34 < 64; var34 += 4) {
                                    for (int var35 = 0; ~var35 > -65; var35 += 4) {
                                        byte var36 = arg5.method2392(125);
                                        for (int var37 = arg1 + var34; var34 + 4 + arg1 > var37; ++var37) {
                                            for (int var38 = arg2 + var35; arg2 + 4 + var35 > var38; ++var38) {
                                                if (~var37 <= -1 && super.field3339 > var37 && ~var38 <= -1 && ~var38 > ~super.field3326) {
                                                    super.field3334[var28][var37][var38] = var36;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (var29 == 2) {
                                if (super.field3334[var28] == null) {
                                    super.field3334[var28] = new byte[super.field3339 - -1][super.field3326 + 1];
                                }
                                if (var28 > 0) {
                                    int var39 = arg1;
                                    int var40 = arg1 + 64;
                                    int var41 = arg2;
                                    int var42 = arg2 + 64;
                                    if (arg1 < 0) {
                                        var39 = 0;
                                    } else if (~arg1 <= ~super.field3339) {
                                        var39 = super.field3339;
                                    }
                                    if (~var40 <= -1) {
                                        if (super.field3339 <= var40) {
                                            var40 = super.field3339;
                                        }
                                    } else {
                                        var40 = 0;
                                    }
                                    if (arg2 >= 0) {
                                        if (arg2 >= super.field3326) {
                                            var41 = super.field3326;
                                        }
                                    } else {
                                        var41 = 0;
                                    }
                                    if (var42 < 0) {
                                        var42 = 0;
                                    } else if (super.field3326 <= var42) {
                                        var42 = super.field3326;
                                    }
                                    while (var40 > var39) {
                                        while (var42 > var41) {
                                            super.field3334[var28][var39][var41] = super.field3334[var28 + -1][var39][var41];
                                            ++var41;
                                        }
                                        ++var39;
                                    }
                                }
                            }
                        }
                    }
                }
                if (var8 != null) {
                    for (int var9 = 0; ~var9 > -9; ++var9) {
                        for (int var10 = 0; var10 < 8; ++var10) {
                            int var11 = (arg1 >> 3) - -var9;
                            int var12 = (arg2 >> 3) + var10;
                            if (~var11 <= -1 && var11 < super.field3339 >> 3 && ~var12 <= -1 && ~(super.field3326 >> 3) < ~var12) {
                                class391.method2294(var12, var11, var8, -257);
                            }
                        }
                    }
                }
                if (!var7 && super.field3334 != null) {
                    for (int var13 = 0; ~var13 > -5; ++var13) {
                        if (super.field3334[var13] != null) {
                            for (int var14 = 0; ~var14 > -17; ++var14) {
                                for (int var15 = 0; ~var15 > -17; ++var15) {
                                    int var16 = (arg1 >> 2) + var14;
                                    int var17 = (arg2 >> 2) + var15;
                                    if (var16 >= 0 && var16 < 26 && var17 >= 0 && ~var17 > -27) {
                                        super.field3334[var13][var16][var17] = 0;
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

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "(IIIZ)V", line = 665)
    public class117(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class65.field887, class100.field1304);
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(I)V", line = 671)
    public static void method919(int arg0) {
        field1494 = null;
        int var1 = -43 / ((arg0 - -4) / 48);
        field1497 = null;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Lha;IIIIB[IIILes;I)V", line = 681)
    public final void method920(class66 arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int[] arg6, int arg7, int arg8, class403 arg9, int arg10) {
        if (arg5 < 20) {
            this.method921(84, 67, (class66) null, -15, -61, (class415) null, -114);
        }
        ++field1487;
        if (!super.field3316) {
            boolean var12 = false;
            if (arg6 != null) {
                arg6[0] = -1;
            }
            class140 var13 = null;
            int var14 = (arg10 & 7) * 8;
            int var15 = (arg3 & 7) * 8;
            while (true) {
                int var21;
                label241: do {
                    while (true) {
                        while (~arg9.field5275.length < ~arg9.field5262) {
                            int var20 = arg9.method2396((byte) 85);
                            if (~var20 != -1) {
                                if (~var20 == -2) {
                                    var21 = arg9.method2396((byte) 84);
                                    continue label241;
                                }
                                if (~var20 == -3) {
                                    if (var13 == null) {
                                        var13 = new class140();
                                    }
                                    var13.method1022(106, arg9);
                                } else if (~var20 == -129) {
                                    if (arg6 == null) {
                                        arg9.field5262 += 10;
                                    } else {
                                        arg6[0] = arg9.method2390((byte) 88);
                                        arg6[1] = arg9.method2365(true);
                                        arg6[2] = arg9.method2365(true);
                                        arg6[3] = arg9.method2365(true);
                                        arg6[4] = arg9.method2390((byte) 12);
                                    }
                                } else {
                                    if (~var20 != -130) {
                                        throw new IllegalStateException("");
                                    }
                                    if (super.field3334 == null) {
                                        super.field3334 = new byte[4][][];
                                    }
                                    for (int var32 = 0; var32 < 4; ++var32) {
                                        byte var33 = arg9.method2392(122);
                                        if (var33 == 0 && super.field3334[arg4] != null) {
                                            if (var32 <= arg1) {
                                                int var34 = arg2;
                                                int var35 = arg2 + 7;
                                                int var36 = arg7;
                                                int var37 = arg7 + 7;
                                                if (~var35 > -1) {
                                                    var35 = 0;
                                                } else if (~var35 <= ~super.field3339) {
                                                    var35 = super.field3339;
                                                }
                                                if (arg7 >= 0) {
                                                    if (arg7 >= super.field3326) {
                                                        var36 = super.field3326;
                                                    }
                                                } else {
                                                    var36 = 0;
                                                }
                                                if (arg2 < 0) {
                                                    var34 = 0;
                                                } else if (arg2 >= super.field3339) {
                                                    var34 = super.field3339;
                                                }
                                                if (var37 >= 0) {
                                                    if (super.field3326 <= var37) {
                                                        var37 = super.field3326;
                                                    }
                                                } else {
                                                    var37 = 0;
                                                }
                                                while (~var35 < ~var34) {
                                                    while (var37 > var36) {
                                                        super.field3334[arg4][var34][var36] = 0;
                                                        ++var36;
                                                    }
                                                    ++var34;
                                                }
                                            }
                                        } else if (~var33 == -2) {
                                            if (super.field3334[arg4] == null) {
                                                super.field3334[arg4] = new byte[super.field3339 + 1][super.field3326 + 1];
                                            }
                                            for (int var38 = 0; var38 < 64; var38 += 4) {
                                                for (int var39 = 0; ~var39 > -65; var39 += 4) {
                                                    byte var40 = arg9.method2392(119);
                                                    if (var32 <= arg1) {
                                                        for (int var41 = var38; var38 + 4 > var41; ++var41) {
                                                            for (int var42 = var39; ~(var39 + 4) < ~var42; ++var42) {
                                                                if (~var14 >= ~var41 && ~(var14 + 8) < ~var41 && ~var15 >= ~var42 && var15 + 8 > var15) {
                                                                    int var43 = class571.method3311(7 & var42, var41 & 7, -128, arg8) + arg2;
                                                                    int var44 = arg7 + class107.method872(7 & var41, var42 & 7, (byte) -25, arg8);
                                                                    if (~var43 <= -1 && ~var43 > ~super.field3339 && var44 >= 0 && var44 < super.field3326) {
                                                                        super.field3334[arg4][var43][var44] = var40;
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
                                var13 = new class140(arg9);
                            }
                        }
                        if (var13 != null) {
                            class391.method2294(arg7 >> 3, arg2 >> 3, var13, -257);
                        }
                        if (!var12 && super.field3334 != null && super.field3334[arg4] != null) {
                            int var16 = arg2 + 7;
                            int var17 = arg7 - -7;
                            for (int var18 = arg2; ~var18 > ~var16; ++var18) {
                                for (int var19 = arg7; ~var19 > ~var17; ++var19) {
                                    super.field3334[arg4][var18][var19] = 0;
                                }
                            }
                            return;
                        }
                        return;
                    }
                } while (~var21 >= -1);
                for (int var22 = 0; ~var21 < ~var22; ++var22) {
                    class110 var23 = new class110(arg0, arg9, 2);
                    if (var23.field1388 == 31) {
                        class652 var24 = class520.field7343.method2821((byte) -78, arg9.method2390((byte) -106));
                        var23.method883(var24.field9007, 122, var24.field9001, var24.field9004, var24.field8999);
                    }
                    if (arg0.method583() > 0) {
                        class515 var25 = var23.field1374;
                        int var26 = var25.method3084(0) >> 9;
                        int var27 = var25.method3085(true) >> 9;
                        if (var23.field1385 == arg1 && ~var14 >= ~var26 && var26 < var14 + 8 && var15 <= var27 && ~(var15 + 8) < ~var27) {
                            int var28 = class458.method2774(467485538, arg8, 4095 & var25.method3085(true), 4095 & var25.method3084(0)) + (arg2 << 9);
                            int var29 = var28 >> 9;
                            int var30 = class522.method3133(4095 & var25.method3085(true), var25.method3084(0) & 4095, -60, arg8) + (arg7 << 9);
                            int var31 = var30 >> 9;
                            if (var29 >= 0 && ~var31 <= -1 && ~var29 > ~super.field3339 && super.field3326 > var31) {
                                var25.method544((byte) 25, var30, super.field3331[arg1][var29][var31] + -var25.method3086((byte) -105), var28);
                                class391.method2295(var23);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IILha;IILwj;I)V", line = 977)
    public final void method921(int arg0, int arg1, class66 arg2, int arg3, int arg4, class415 arg5, int arg6) {
        int var8 = 7 / ((35 - arg0) / 42);
        ++field1493;
        class238 var9 = this.method923(arg4, -1, arg1, arg6, arg3);
        if (var9 != null) {
            class174 var10 = class379.field4811.method4192(27324, var9.method927(-24482));
            int var11 = var9.method929((byte) -45);
            int var12 = var9.method928(13272);
            if (var10.method1183(128)) {
                class71.method682((byte) 87, var10, arg4, arg1, arg3);
            }
            if (var9.method935(25271)) {
                var9.method931(arg2, -62);
            }
            if (~arg6 != -1) {
                if (~arg6 != -2) {
                    if (~arg6 != -3) {
                        if (arg6 == 3) {
                            class230.method1419(arg4, arg1, arg3);
                            if (var10.field2110 == 1) {
                                arg5.method2484(arg3, arg1, (byte) -106);
                                return;
                            }
                        }
                        return;
                    }
                    class582.method3355(arg4, arg1, arg3, field1498 != null ? field1498 : (field1498 = method924("qb")));
                    if (var10.field2110 != 0 && var10.field2125 + arg1 < super.field3339 && ~(arg3 - -var10.field2125) > ~super.field3326 && var10.field2147 + arg1 < super.field3339 && super.field3326 > arg3 - -var10.field2147) {
                        arg5.method2477(var12, !var10.field2143, arg1, var10.field2125, var10.field2087, false, var10.field2147, arg3);
                    }
                    if (var11 == 9) {
                        if (~(var12 & 1) == -1) {
                            class722.method4087(arg1, -21207, arg4, arg3, 8);
                            return;
                        }
                        class722.method4087(arg1, -21207, arg4, arg3, 16);
                        return;
                    }
                } else {
                    class633.method3574(arg4, arg1, arg3);
                }
                return;
            }
            class221.method1367(arg4, arg1, arg3);
            if (~var10.field2110 != -1) {
                arg5.method2480(!var10.field2143, var10.field2087, var12, var11, 92, arg3, arg1);
            }
            if (var10.field2081 == 1) {
                if (~var12 == -1) {
                    class722.method4087(arg1, -21207, arg4, arg3, 1);
                    return;
                }
                if (var12 != 1) {
                    if (var12 == 2) {
                        class722.method4087(arg1 + 1, -21207, arg4, arg3, 1);
                        return;
                    }
                    if (~var12 == -4) {
                        class722.method4087(arg1, -21207, arg4, arg3, 2);
                        return;
                    }
                } else {
                    class722.method4087(arg1, -21207, arg4, arg3 + 1, 2);
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(ILwj;IIIIZIIILha;)V", line = 1079)
    public final void method922(int arg0, class415 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, class66 arg10) {
        ++field1486;
        if (~class118.field1503.field10632.method3881(0) != -1 || class99.method845(arg8, arg9, class500.field7013, arg5, 16)) {
            if (~this.field1482 < ~arg2) {
                this.field1482 = arg2;
            }
            class174 var12 = class379.field4811.method4192(27324, arg3);
            if (~class118.field1503.field10641.method1572(0) != -1 || !var12.field2119) {
                int var13;
                int var14;
                if (~arg0 != -2 && ~arg0 != -4) {
                    var13 = var12.field2125;
                    var14 = var12.field2147;
                } else {
                    var13 = var12.field2147;
                    var14 = var12.field2125;
                }
                if (arg6) {
                    field1497 = null;
                }
                int var15;
                int var16;
                if (~(arg5 + var13) < ~super.field3339) {
                    var15 = arg5;
                    var16 = arg5 - -1;
                } else {
                    var15 = arg5 - -(var13 >> 1);
                    var16 = (var13 + 1 >> 1) + arg5;
                }
                int var17;
                int var18;
                if (~(arg8 + var14) >= ~super.field3326) {
                    var17 = arg8 - -(var14 + 1 >> 1);
                    var18 = (var14 >> 1) + arg8;
                } else {
                    var17 = arg8 + 1;
                    var18 = arg8;
                }
                class296 var19 = class621.field8523[arg9];
                int var20 = var19.method1728(var18, (byte) -128, var15) + var19.method1728(var18, (byte) -90, var16) - (-var19.method1728(var17, (byte) -107, var15) + -var19.method1728(var17, (byte) -123, var16)) >> 2;
                int var21 = (arg5 << 9) + (var13 << 8);
                int var22 = (arg8 << 9) - -(var14 << 8);
                boolean var23 = class134.field1676 && !super.field3316 && var12.field2117;
                if (var12.method1183(128)) {
                    class250.method1497(78, (class388) null, (class521) null, arg2, arg8, var12, arg0, arg5);
                }
                boolean var24 = ~arg7 == 0 && var12.field2146 == -1 && var12.field2086 == null && var12.field2157 == null && !var12.field2129 && !var12.field2154;
                if (!class438.field5772 || (!class203.method1306(25339, arg4) || var12.field2081 == 1) && (!class153.method1095(89, arg4) || ~var12.field2081 != -1)) {
                    if (arg4 == 22) {
                        if (~class118.field1503.field10649.method3707(0) != -1 || ~var12.field2171 != -1 || ~var12.field2110 == -2 || var12.field2176) {
                            class328 var25;
                            if (!var24) {
                                var25 = new class119(arg10, var12, arg2, arg9, var21, var20, var22, super.field3316, arg0, arg7);
                            } else {
                                class199 var26 = new class199(arg10, var12, arg2, arg9, var21, var20, var22, super.field3316, arg0, var23);
                                var25 = var26;
                                if (var26.method935(25271)) {
                                    var26.method930(14353, arg10);
                                }
                            }
                            class426.method2542(arg2, arg5, arg8, var25);
                            if (~var12.field2110 == -2 && arg1 != null) {
                                arg1.method2485(!arg6, arg8, arg5);
                            }
                        }
                    } else if (~arg4 != -11 && arg4 != 11) {
                        if (~arg4 <= -13 && ~arg4 >= -18 || arg4 >= 18 && ~arg4 >= -22) {
                            class712 var27;
                            if (!var24) {
                                var27 = new class132(arg10, var12, arg2, arg9, var21, var20, var22, super.field3316, arg5, arg5 - -var13 - 1, arg8, arg8 + -1 + var14, arg4, arg0, arg7);
                            } else {
                                class419 var28 = new class419(arg10, var12, arg2, arg9, var21, var20, var22, super.field3316, arg5, arg5 - -var13 - 1, arg8, arg8 - (-var14 + 1), arg4, arg0, var23);
                                var27 = var28;
                                if (var28.method935(25271)) {
                                    var28.method930(14353, arg10);
                                }
                            }
                            class36.method321(var27, false);
                            if (class134.field1676 && !super.field3316 && ~arg4 <= -13 && arg4 <= 17 && ~arg4 != -14 && arg2 > 0 && var12.field2081 != 0) {
                                super.field3322[arg2][arg5][arg8] = (byte) class5.method105(super.field3322[arg2][arg5][arg8], 4);
                            }
                            if (~var12.field2110 != -1 && arg1 != null) {
                                arg1.method2488(arg5, var12.field2087, (byte) -58, arg8, var13, var14, !var12.field2143);
                            }
                        } else if (~arg4 == -1) {
                            int var29 = var12.field2081;
                            if (class497.field6950 && var12.field2081 == -1) {
                                var29 = 1;
                            }
                            class621 var31;
                            if (var24) {
                                class431 var30 = new class431(arg10, var12, arg2, arg9, var21, var20, var22, super.field3316, arg4, arg0, var23);
                                var31 = var30;
                                if (var30.method935(25271)) {
                                    var30.method930(14353, arg10);
                                }
                            } else {
                                var31 = new class491(arg10, var12, arg2, arg9, var21, var20, var22, super.field3316, arg4, arg0, arg7);
                            }
                            class763.method4232(arg2, arg5, arg8, var31, (class621) null);
                            if (arg0 != 0) {
                                if (~arg0 == -2) {
                                    if (class134.field1676 && var12.field2130) {
                                        var19.method1406(arg5, arg8 - -1, 50);
                                        var19.method1406(arg5 - -1, arg8 + 1, 50);
                                    }
                                    if (~var29 == -2 && !super.field3316) {
                                        class502.method2976(-1964532595, arg5, -var12.field2137, 2, arg2, arg8 + 1, var12.field2131);
                                    }
                                } else if (~arg0 != -3) {
                                    if (~arg0 == -4) {
                                        if (class134.field1676 && var12.field2130) {
                                            var19.method1406(arg5, arg8, 50);
                                            var19.method1406(arg5 - -1, arg8, 50);
                                        }
                                        if (~var29 == -2 && !super.field3316) {
                                            class502.method2976(-1964532595, arg5, var12.field2137, 2, arg2, arg8, var12.field2131);
                                        }
                                    }
                                } else {
                                    if (class134.field1676 && var12.field2130) {
                                        var19.method1406(arg5 + 1, arg8, 50);
                                        var19.method1406(arg5 - -1, arg8 + 1, 50);
                                    }
                                    if (~var29 == -2 && !super.field3316) {
                                        class502.method2976(-1964532595, arg5 + 1, -var12.field2137, 1, arg2, arg8, var12.field2131);
                                    }
                                }
                            } else {
                                if (class134.field1676 && var12.field2130) {
                                    var19.method1406(arg5, arg8, 50);
                                    var19.method1406(arg5, arg8 + 1, 50);
                                }
                                if (~var29 == -2 && !super.field3316) {
                                    class502.method2976(-1964532595, arg5, var12.field2137, 1, arg2, arg8, var12.field2131);
                                }
                            }
                            if (var12.field2110 != 0 && arg1 != null) {
                                arg1.method2471(var12.field2087, arg0, arg5, !var12.field2143, (byte) -75, arg4, arg8);
                            }
                            if (var12.field2144 != 64) {
                                class533.method3172(arg2, arg5, arg8, var12.field2144);
                            }
                        } else if (arg4 == 1) {
                            class621 var33;
                            if (var24) {
                                class431 var32 = new class431(arg10, var12, arg2, arg9, var21, var20, var22, super.field3316, arg4, arg0, var23);
                                if (var32.method935(25271)) {
                                    var32.method930(14353, arg10);
                                }
                                var33 = var32;
                            } else {
                                var33 = new class491(arg10, var12, arg2, arg9, var21, var20, var22, super.field3316, arg4, arg0, arg7);
                            }
                            class763.method4232(arg2, arg5, arg8, var33, (class621) null);
                            if (var12.field2130 && class134.field1676) {
                                if (arg0 != 0) {
                                    if (~arg0 == -2) {
                                        var19.method1406(arg5 + 1, arg8 + 1, 50);
                                    } else if (arg0 == 2) {
                                        var19.method1406(arg5 + 1, arg8, 50);
                                    } else if (~arg0 == -4) {
                                        var19.method1406(arg5, arg8, 50);
                                    }
                                } else {
                                    var19.method1406(arg5, arg8 - -1, 50);
                                }
                            }
                            if (~var12.field2110 != -1 && arg1 != null) {
                                arg1.method2471(var12.field2087, arg0, arg5, !var12.field2143, (byte) -119, arg4, arg8);
                            }
                        } else if (~arg4 == -3) {
                            int var34 = 3 & arg0 + 1;
                            class621 var37;
                            class621 var38;
                            if (var24) {
                                class431 var35 = new class431(arg10, var12, arg2, arg9, var21, var20, var22, super.field3316, arg4, arg0 + 4, var23);
                                class431 var36 = new class431(arg10, var12, arg2, arg9, var21, var20, var22, super.field3316, arg4, var34, var23);
                                if (var35.method935(25271)) {
                                    var35.method930(14353, arg10);
                                }
                                var37 = var35;
                                var38 = var36;
                                if (var36.method935(25271)) {
                                    var36.method930(14353, arg10);
                                }
                            } else {
                                var37 = new class491(arg10, var12, arg2, arg9, var21, var20, var22, super.field3316, arg4, arg0 - -4, arg7);
                                var38 = new class491(arg10, var12, arg2, arg9, var21, var20, var22, super.field3316, arg4, var34, arg7);
                            }
                            class763.method4232(arg2, arg5, arg8, var37, var38);
                            if ((var12.field2081 == 1 || class497.field6950 && var12.field2081 == -1) && !super.field3316) {
                                if (~arg0 == -1) {
                                    class502.method2976(-1964532595, arg5, var12.field2137, 1, arg2, arg8, var12.field2131);
                                    class502.method2976(-1964532595, arg5, var12.field2137, 2, arg2, arg8 + 1, var12.field2131);
                                } else if (arg0 == 1) {
                                    class502.method2976(-1964532595, arg5 + 1, var12.field2137, 1, arg2, arg8, var12.field2131);
                                    class502.method2976(-1964532595, arg5, var12.field2137, 2, arg2, arg8 - -1, var12.field2131);
                                } else if (arg0 != 2) {
                                    if (~arg0 == -4) {
                                        class502.method2976(-1964532595, arg5, var12.field2137, 1, arg2, arg8, var12.field2131);
                                        class502.method2976(-1964532595, arg5, var12.field2137, 2, arg2, arg8, var12.field2131);
                                    }
                                } else {
                                    class502.method2976(-1964532595, arg5 + 1, var12.field2137, 1, arg2, arg8, var12.field2131);
                                    class502.method2976(-1964532595, arg5, var12.field2137, 2, arg2, arg8, var12.field2131);
                                }
                            }
                            if (var12.field2110 != 0 && arg1 != null) {
                                arg1.method2471(var12.field2087, arg0, arg5, !var12.field2143, (byte) -122, arg4, arg8);
                            }
                            if (~var12.field2144 != -65) {
                                class533.method3172(arg2, arg5, arg8, var12.field2144);
                            }
                        } else if (arg4 == 3) {
                            class621 var39;
                            if (!var24) {
                                var39 = new class491(arg10, var12, arg2, arg9, var21, var20, var22, super.field3316, arg4, arg0, arg7);
                            } else {
                                class431 var40 = new class431(arg10, var12, arg2, arg9, var21, var20, var22, super.field3316, arg4, arg0, var23);
                                if (var40.method935(25271)) {
                                    var40.method930(14353, arg10);
                                }
                                var39 = var40;
                            }
                            class763.method4232(arg2, arg5, arg8, var39, (class621) null);
                            if (var12.field2130 && class134.field1676) {
                                if (arg0 != 0) {
                                    if (~arg0 != -2) {
                                        if (arg0 == 2) {
                                            var19.method1406(arg5 - -1, arg8, 50);
                                        } else if (~arg0 == -4) {
                                            var19.method1406(arg5, arg8, 50);
                                        }
                                    } else {
                                        var19.method1406(arg5 + 1, arg8 + 1, 50);
                                    }
                                } else {
                                    var19.method1406(arg5, arg8 + 1, 50);
                                }
                            }
                            if (~var12.field2110 != -1 && arg1 != null) {
                                arg1.method2471(var12.field2087, arg0, arg5, !var12.field2143, (byte) -98, arg4, arg8);
                            }
                        } else if (~arg4 == -10) {
                            class712 var41;
                            if (!var24) {
                                var41 = new class132(arg10, var12, arg2, arg9, var21, var20, var22, super.field3316, arg5, var13 + -1 + arg5, arg8, arg8 + -1 - -var14, arg4, arg0, arg7);
                            } else {
                                class419 var42 = new class419(arg10, var12, arg2, arg9, var21, var20, var22, super.field3316, arg5, arg5, arg8, arg8, arg4, arg0, var23);
                                var41 = var42;
                                if (var42.method935(25271)) {
                                    var42.method930(14353, arg10);
                                }
                            }
                            class36.method321(var41, false);
                            if (~var12.field2081 == -2 && !super.field3316) {
                                byte var43;
                                if (~(arg0 & 1) == -1) {
                                    var43 = 8;
                                } else {
                                    var43 = 16;
                                }
                                class502.method2976(-1964532595, arg5, 0, var43, arg2, arg8, var12.field2131);
                            }
                            if (~var12.field2110 != -1 && arg1 != null) {
                                arg1.method2488(arg5, var12.field2087, (byte) -61, arg8, var13, var14, !var12.field2143);
                            }
                            if (~var12.field2144 != -65) {
                                class533.method3172(arg2, arg5, arg8, var12.field2144);
                            }
                        } else if (~arg4 == -5) {
                            class377 var44;
                            if (!var24) {
                                var44 = new class440(arg10, var12, arg2, arg9, var21, var20, var22, super.field3316, 0, 0, arg4, arg0, arg7);
                            } else {
                                class781 var45 = new class781(arg10, var12, arg2, arg9, var21, var20, var22, super.field3316, 0, 0, arg4, arg0);
                                if (var45.method935(25271)) {
                                    var45.method930(14353, arg10);
                                }
                                var44 = var45;
                            }
                            class619.method3511(arg2, arg5, arg8, var44, (class377) null);
                        } else if (arg4 == 5) {
                            int var46 = 65;
                            class238 var47 = (class238) class253.method1504(arg2, arg5, arg8);
                            if (var47 != null) {
                                var46 = class379.field4811.method4192(27324, var47.method927(-24482)).field2144 - -1;
                            }
                            class377 var49;
                            if (var24) {
                                class781 var48 = new class781(arg10, var12, arg2, arg9, var21, var20, var22, super.field3316, class397.field5140[arg0] * var46, class358.field4432[arg0] * var46, arg4, arg0);
                                var49 = var48;
                                if (var48.method935(25271)) {
                                    var48.method930(14353, arg10);
                                }
                            } else {
                                var49 = new class440(arg10, var12, arg2, arg9, var21, var20, var22, super.field3316, class397.field5140[arg0] * var46, class358.field4432[arg0] * var46, arg4, arg0, arg7);
                            }
                            class619.method3511(arg2, arg5, arg8, var49, (class377) null);
                        } else if (arg4 == 6) {
                            int var50 = 33;
                            class238 var51 = (class238) class253.method1504(arg2, arg5, arg8);
                            if (var51 != null) {
                                var50 = class379.field4811.method4192(27324, var51.method927(-24482)).field2144 / 2 + 1;
                            }
                            class377 var53;
                            if (var24) {
                                class781 var52 = new class781(arg10, var12, arg2, arg9, var21, var20, var22, super.field3316, class397.field5140[arg0] * var50, class358.field4432[arg0] * var50, arg4, arg0 + 4);
                                if (var52.method935(25271)) {
                                    var52.method930(14353, arg10);
                                }
                                var53 = var52;
                            } else {
                                var53 = new class440(arg10, var12, arg2, arg9, var21, var20, var22, super.field3316, class61.field824[arg0] * var50, class558.field7753[arg0] * var50, arg4, arg0 + 4, arg7);
                            }
                            class619.method3511(arg2, arg5, arg8, var53, (class377) null);
                        } else if (~arg4 == -8) {
                            int var54 = arg0 + 2 & 3;
                            class377 var55;
                            if (!var24) {
                                var55 = new class440(arg10, var12, arg2, arg9, var21, var20, var22, super.field3316, 0, 0, arg4, var54 + 4, arg7);
                            } else {
                                class781 var56 = new class781(arg10, var12, arg2, arg9, var21, var20, var22, super.field3316, 0, 0, arg4, var54 - -4);
                                if (var56.method935(25271)) {
                                    var56.method930(14353, arg10);
                                }
                                var55 = var56;
                            }
                            class619.method3511(arg2, arg5, arg8, var55, (class377) null);
                        } else if (arg4 == 8) {
                            int var57 = arg0 + 2 & 3;
                            int var58 = 33;
                            class238 var59 = (class238) class253.method1504(arg2, arg5, arg8);
                            if (var59 != null) {
                                var58 = class379.field4811.method4192(27324, var59.method927(-24482)).field2144 / 2 - -1;
                            }
                            class377 var62;
                            class377 var63;
                            if (var24) {
                                class781 var60 = new class781(arg10, var12, arg2, arg9, var21, var20, var22, super.field3316, class61.field824[arg0] * var58, class558.field7753[arg0] * var58, arg4, arg0 - -4);
                                class781 var61 = new class781(arg10, var12, arg2, arg9, var21, var20, var22, super.field3316, 0, 0, arg4, var57 + 4);
                                if (var60.method935(25271)) {
                                    var60.method930(14353, arg10);
                                }
                                var62 = var61;
                                if (var61.method935(25271)) {
                                    var61.method930(14353, arg10);
                                }
                                var63 = var60;
                            } else {
                                class440 var64 = new class440(arg10, var12, arg2, arg9, var21, var20, var22, super.field3316, class61.field824[arg0] * var58, class558.field7753[arg0] * var58, arg4, arg0 + 4, arg7);
                                var63 = var64;
                                class440 var65 = new class440(arg10, var12, arg2, arg9, var21, var20, var22, super.field3316, 0, 0, arg4, var57 + 4, arg7);
                                var62 = var65;
                            }
                            class619.method3511(arg2, arg5, arg8, var63, var62);
                        }
                    } else {
                        class419 var66 = null;
                        int var67;
                        class712 var68;
                        if (!var24) {
                            var67 = 15;
                            var68 = new class132(arg10, var12, arg2, arg9, var21, var20, var22, super.field3316, arg5, var13 - 1 + arg5, arg8, var14 + -1 + arg8, arg4, arg0, arg7);
                        } else {
                            class419 var69 = new class419(arg10, var12, arg2, arg9, var21, var20, var22, super.field3316, arg5, var13 + -1 + arg5, arg8, arg8 - -var14 + -1, arg4, arg0, var23);
                            var68 = var69;
                            var67 = var69.method2501(127);
                            var66 = var69;
                        }
                        if (class36.method321(var68, false)) {
                            if (var66 != null && var66.method935(25271)) {
                                var66.method930(14353, arg10);
                            }
                            if (var12.field2130 && class134.field1676) {
                                if (var67 > 30) {
                                    var67 = 30;
                                }
                                for (int var70 = 0; var70 <= var13; ++var70) {
                                    for (int var71 = 0; var71 <= var14; ++var71) {
                                        var19.method1406(arg5 - -var70, arg8 - -var71, var67);
                                    }
                                }
                            }
                        }
                        if (~var12.field2110 != -1 && arg1 != null) {
                            arg1.method2488(arg5, var12.field2087, (byte) -105, arg8, var13, var14, !var12.field2143);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(IIIII)Lqb;", line = 1713)
    public final class238 method923(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1491;
        class238 var6 = null;
        if (~arg3 == arg1) {
            var6 = (class238) class253.method1504(arg0, arg2, arg4);
        }
        if (~arg3 == -2) {
            var6 = (class238) class714.method4042(arg0, arg2, arg4);
        }
        if (arg3 == 2) {
            var6 = (class238) class764.method4234(arg0, arg2, arg4, field1498 != null ? field1498 : (field1498 = method924("qb")));
        }
        if (~arg3 == -4) {
            var6 = (class238) class662.method3720(arg0, arg2, arg4);
        }
        return var6;
    }
}
