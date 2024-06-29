import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class388 extends class531 {

    @OriginalMember(owner = "client!nd", name = "N", descriptor = "I")
    public int field5447 = 99;

    @OriginalMember(owner = "client!nd", name = "P", descriptor = "Lvo;")
    public static class32 field5449 = new class32("", 13);

    @OriginalMember(owner = "client!nd", name = "S", descriptor = "[Ljava/lang/String;")
    public static String[] field5452 = new String[100];

    @OriginalMember(owner = "client!nd", name = "I", descriptor = "I")
    public static int field5443;

    @OriginalMember(owner = "client!nd", name = "J", descriptor = "I")
    public static int field5444;

    @OriginalMember(owner = "client!nd", name = "L", descriptor = "I")
    public static int field5445;

    @OriginalMember(owner = "client!nd", name = "M", descriptor = "I")
    public static int field5446;

    @OriginalMember(owner = "client!nd", name = "O", descriptor = "I")
    public static int field5448;

    @OriginalMember(owner = "client!nd", name = "Q", descriptor = "I")
    public static int field5450;

    @OriginalMember(owner = "client!nd", name = "R", descriptor = "I")
    public static int field5451;

    @OriginalMember(owner = "client!nd", name = "U", descriptor = "I")
    public static int field5454;

    // $FF: synthetic field
    @OriginalMember(owner = "client!nd", name = "V", descriptor = "Ljava/lang/Class;")
    public static Class field5455;

    @OriginalMember(owner = "client!nd", name = "T", descriptor = "[Lo;")
    public static class24[] field5453;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II[BIIIII[Lmk;Lza;I)V")
    public final void method2245(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class40[] arg8, class290 arg9, int arg10) {
        if (arg7 >= -74) {
            field5452 = null;
        }
        ++field5443;
        class403 var12 = new class403(arg2);
        int var13 = -1;
        while (true) {
            int var14 = var12.method2339((byte) 16);
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method2325(true);
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = 63 & var15;
                int var18 = 63 & var15 >> 6;
                int var19 = var15 >> 12;
                int var20 = var12.method2357((byte) 117);
                int var21 = var20 >> 2;
                int var22 = 3 & var20;
                if (~arg1 == ~var19 && arg10 <= var18 && ~(arg10 + 8) < ~var18 && var17 >= arg0 && ~var17 > ~(arg0 + 8)) {
                    class270 var23 = class377.field5338.method1901(50, var13);
                    int var24 = arg4 - -class417.method2472(7 & var18, var22, -20589, var17 & 7, var23.field4012, var23.field3937, arg6);
                    int var25 = class485.method2796(-1, var23.field4012, var23.field3937, var18 & 7, arg6, var22, var17 & 7) + arg5;
                    if (var24 > 0 && ~var25 < -1 && super.field7775 + -1 > var24 && ~var25 > ~(super.field7794 + -1)) {
                        class40 var26 = null;
                        if (!super.field7784) {
                            int var27 = arg3;
                            if ((class368.field5253[1][var24][var25] & 2) == 2) {
                                var27 = arg3 - 1;
                            }
                            if (var27 >= 0) {
                                var26 = arg8[var27];
                            }
                        }
                        this.method2249(var22 - -arg6 & 3, var26, arg3, false, var24, -1, var21, arg3, arg9, var13, var25);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(IIIZ)V")
    public class388(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class340.field4928, class211.field3058);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II[B[Lmk;Lza;I)V")
    public final void method2246(int arg0, int arg1, byte[] arg2, class40[] arg3, class290 arg4, int arg5) {
        if (arg0 > -108) {
            field5445 = 57;
        }
        ++field5448;
        class403 var7 = new class403(arg2);
        int var8 = -1;
        while (true) {
            int var9 = var7.method2339((byte) 16);
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method2325(true);
                if (var11 == 0) {
                    break;
                }
                var10 += var11 + -1;
                int var12 = var10 & 63;
                int var13 = var10 >> 6 & 63;
                int var14 = var10 >> 12;
                int var15 = var7.method2357((byte) 121);
                int var16 = var15 >> 2;
                int var17 = 3 & var15;
                int var18 = arg5 + var13;
                int var19 = arg1 + var12;
                if (var18 > 0 && ~var19 < -1 && ~(super.field7775 + -1) < ~var18 && ~(super.field7794 + -1) < ~var19) {
                    class40 var20 = null;
                    if (!super.field7784) {
                        int var21 = var14;
                        if ((class368.field5253[1][var18][var19] & 2) == 2) {
                            var21 = var14 - 1;
                        }
                        if (~var21 <= -1) {
                            var20 = arg3[var21];
                        }
                    }
                    this.method2249(var17, var20, var14, false, var18, -1, var16, var14, arg4, var8, var19);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IILza;Lwm;[II)V")
    public final void method2247(int arg0, int arg1, class290 arg2, class403 arg3, int[] arg4, int arg5) {
        ++field5446;
        if (!super.field7784) {
            boolean var7 = false;
            if (arg4 != null) {
                arg4[0] = -1;
            }
            class251 var8 = null;
            while (true) {
                while (true) {
                    while (true) {
                        while (true) {
                            while (~arg3.field5665 > ~arg3.field5663.length) {
                                int var18 = arg3.method2357((byte) 126);
                                if (~var18 != -1) {
                                    if (~var18 != -2) {
                                        if (~var18 != -3) {
                                            if (~var18 == -129) {
                                                if (arg4 == null) {
                                                    arg3.field5665 += 10;
                                                } else {
                                                    arg4[0] = arg3.method2338(0);
                                                    arg4[1] = arg3.method2371(7162);
                                                    arg4[2] = arg3.method2371(class509.method3039(arg1, -7162));
                                                    arg4[3] = arg3.method2371(arg1 + 7166);
                                                    arg4[4] = arg3.method2338(0);
                                                }
                                            } else {
                                                if (var18 != 129) {
                                                    throw new IllegalStateException("");
                                                }
                                                if (super.field7793 == null) {
                                                    super.field7793 = new byte[4][][];
                                                }
                                                for (int var19 = 0; var19 < 4; ++var19) {
                                                    byte var20 = arg3.method2359(-116);
                                                    if (~var20 == -1 && super.field7793[var19] != null) {
                                                        int var21 = arg0;
                                                        int var22 = arg0 + 64;
                                                        int var23 = arg5;
                                                        if (arg0 < 0) {
                                                            var21 = 0;
                                                        } else if (arg0 >= super.field7775) {
                                                            var21 = super.field7775;
                                                        }
                                                        if (var22 >= 0) {
                                                            if (~var22 <= ~super.field7775) {
                                                                var22 = super.field7775;
                                                            }
                                                        } else {
                                                            var22 = 0;
                                                        }
                                                        if (arg5 >= 0) {
                                                            if (~arg5 <= ~super.field7794) {
                                                                var23 = super.field7794;
                                                            }
                                                        } else {
                                                            var23 = 0;
                                                        }
                                                        int var24 = arg5 + 64;
                                                        if (var24 < 0) {
                                                            var24 = 0;
                                                        } else if (super.field7794 <= var24) {
                                                            var24 = super.field7794;
                                                        }
                                                        while (~var22 < ~var21) {
                                                            while (var23 < var24) {
                                                                super.field7793[var19][var21][var23] = 0;
                                                                ++var23;
                                                            }
                                                            ++var21;
                                                        }
                                                    } else if (var20 != 1) {
                                                        if (var20 == 2) {
                                                            if (super.field7793[var19] == null) {
                                                                super.field7793[var19] = new byte[super.field7775 + 1][super.field7794 + 1];
                                                            }
                                                            if (var19 > 0) {
                                                                int var25 = arg0;
                                                                int var26 = arg0 + 64;
                                                                int var27 = arg5;
                                                                int var28 = arg5 + 64;
                                                                if (arg5 < 0) {
                                                                    var27 = 0;
                                                                } else if (super.field7794 <= arg5) {
                                                                    var27 = super.field7794;
                                                                }
                                                                if (~arg0 > -1) {
                                                                    var25 = 0;
                                                                } else if (~arg0 <= ~super.field7775) {
                                                                    var25 = super.field7775;
                                                                }
                                                                if (var26 < 0) {
                                                                    var26 = 0;
                                                                } else if (~var26 <= ~super.field7775) {
                                                                    var26 = super.field7775;
                                                                }
                                                                if (~var28 <= -1) {
                                                                    if (var28 >= super.field7794) {
                                                                        var28 = super.field7794;
                                                                    }
                                                                } else {
                                                                    var28 = 0;
                                                                }
                                                                while (var26 > var25) {
                                                                    while (~var27 > ~var28) {
                                                                        super.field7793[var19][var25][var27] = super.field7793[var19 - 1][var25][var27];
                                                                        ++var27;
                                                                    }
                                                                    ++var25;
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        if (super.field7793[var19] == null) {
                                                            super.field7793[var19] = new byte[super.field7775 + 1][super.field7794 + 1];
                                                        }
                                                        for (int var29 = 0; var29 < 64; var29 += 4) {
                                                            for (int var30 = 0; ~var30 > -65; var30 += 4) {
                                                                byte var31 = arg3.method2359(arg1 ^ 100);
                                                                for (int var32 = arg0 + var29; var29 + 4 + arg0 > var32; ++var32) {
                                                                    for (int var33 = arg5 + var30; ~var33 > ~(arg5 + var30 + 4); ++var33) {
                                                                        if (~var32 <= -1 && super.field7775 > var32 && ~var33 <= -1 && var33 < super.field7794) {
                                                                            super.field7793[var19][var32][var33] = var31;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                var7 = true;
                                            }
                                        } else {
                                            if (var8 == null) {
                                                var8 = new class251();
                                            }
                                            var8.method1635(arg3, arg1 ^ -21522);
                                        }
                                    } else {
                                        int var34 = arg3.method2357((byte) 104);
                                        if (var34 > 0) {
                                            for (int var35 = 0; ~var35 > ~var34; ++var35) {
                                                class391 var36 = new class391(arg2, arg3, 0);
                                                if (var36.field5492 == 31) {
                                                    class442 var37 = class52.field628.method2143(arg3.method2338(arg1 + 4), (byte) -79);
                                                    var36.method2267(var37.field6177, var37.field6181, 0, var37.field6178, var37.field6187);
                                                }
                                                if (~arg2.method371() < -1) {
                                                    class95 var38 = var36.field5504;
                                                    int var39 = (arg0 << 7) + var38.method672((byte) -41);
                                                    int var40 = var38.method673(10518) + (arg5 << 7);
                                                    int var41 = var39 >> 7;
                                                    int var42 = var40 >> 7;
                                                    if (~var41 <= -1 && var42 >= 0 && ~var41 > ~super.field7775 && ~var42 > ~super.field7794) {
                                                        var38.method674(var40, var39, 16384, super.field7791[var36.field5494][var41][var42] + -var38.method669((byte) -99));
                                                        class39.method214(var36);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    var8 = new class251(arg3);
                                }
                            }
                            if (arg1 != -4) {
                                return;
                            }
                            if (var8 != null) {
                                for (int var9 = 0; ~var9 > -9; ++var9) {
                                    for (int var10 = 0; ~var10 > -9; ++var10) {
                                        int var11 = (arg0 >> 3) + var9;
                                        int var12 = (arg5 >> 3) + var10;
                                        if (var11 >= 0 && super.field7775 >> 3 > var11 && ~var12 <= -1 && super.field7794 >> 3 > var12) {
                                            class292.method1808(var11, 256, var8, var12);
                                        }
                                    }
                                }
                            }
                            if (!var7 && super.field7793 != null) {
                                for (int var13 = 0; var13 < 4; ++var13) {
                                    if (super.field7793[var13] != null) {
                                        for (int var14 = 0; var14 < 16; ++var14) {
                                            for (int var15 = 0; var15 < 16; ++var15) {
                                                int var16 = (arg0 >> 2) - -var14;
                                                int var17 = (arg5 >> 2) + var15;
                                                if (~var16 <= -1 && ~var16 > -27 && var17 >= 0 && ~var17 > -27) {
                                                    super.field7793[var13][var16][var17] = 0;
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
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IILwm;[IIBILza;III)V")
    public final void method2248(int arg0, int arg1, class403 arg2, int[] arg3, int arg4, byte arg5, int arg6, class290 arg7, int arg8, int arg9, int arg10) {
        ++field5454;
        if (!super.field7784) {
            boolean var12 = false;
            class251 var13 = null;
            if (arg3 != null) {
                arg3[0] = -1;
            }
            int var14 = (arg8 & 7) * 8;
            if (arg5 != -118) {
                field5449 = null;
            }
            int var15 = (7 & arg0) * 8;
            while (true) {
                while (arg2.field5665 < arg2.field5663.length) {
                    int var20 = arg2.method2357((byte) 121);
                    if (var20 == 0) {
                        var13 = new class251(arg2);
                    } else if (~var20 == -2) {
                        int var34 = arg2.method2357((byte) 106);
                        if (~var34 < -1) {
                            for (int var35 = 0; var34 > var35; ++var35) {
                                class391 var36 = new class391(arg7, arg2, 0);
                                if (~var36.field5492 == -32) {
                                    class442 var37 = class52.field628.method2143(arg2.method2338(arg5 + 118), (byte) -87);
                                    var36.method2267(var37.field6177, var37.field6181, 0, var37.field6178, var37.field6187);
                                }
                                if (~arg7.method371() < -1) {
                                    class95 var38 = var36.field5504;
                                    int var39 = var38.method672((byte) -41) >> 7;
                                    int var40 = var38.method673(10518) >> 7;
                                    if (~var36.field5494 == ~arg1 && ~var14 >= ~var39 && var14 - -8 > var39 && ~var40 <= ~var15 && var15 + 8 > var40) {
                                        int var41 = class254.method1639((byte) 68, arg6, var38.method672((byte) -41) & 1023, 1023 & var38.method673(arg5 ^ -10596)) + (arg4 << 7);
                                        int var42 = class341.method2025(arg6, 8, var38.method672((byte) -41) & 1023, 1023 & var38.method673(arg5 ^ -10596)) + (arg10 << 7);
                                        int var43 = var41 >> 7;
                                        int var44 = var42 >> 7;
                                        if (var43 >= 0 && var44 >= 0 && super.field7775 > var43 && super.field7794 > var44) {
                                            var38.method674(var42, var41, 16384, super.field7791[arg1][var43][var44] + -var38.method669((byte) 90));
                                            class39.method214(var36);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var20 == 2) {
                        if (var13 == null) {
                            var13 = new class251();
                        }
                        var13.method1635(arg2, 21522);
                    } else if (var20 == 128) {
                        if (arg3 != null) {
                            arg3[0] = arg2.method2338(0);
                            arg3[1] = arg2.method2371(7162);
                            arg3[2] = arg2.method2371(7162);
                            arg3[3] = arg2.method2371(7162);
                            arg3[4] = arg2.method2338(0);
                        } else {
                            arg2.field5665 += 10;
                        }
                    } else {
                        if (var20 != 129) {
                            throw new IllegalStateException("");
                        }
                        if (super.field7793 == null) {
                            super.field7793 = new byte[4][][];
                        }
                        for (int var21 = 0; ~var21 > -5; ++var21) {
                            byte var22 = arg2.method2359(29);
                            if (var22 == 0 && super.field7793[arg9] != null) {
                                if (arg1 >= var21) {
                                    int var23 = arg4;
                                    int var24 = arg4 + 7;
                                    int var25 = arg10;
                                    if (arg4 < 0) {
                                        var23 = 0;
                                    } else if (super.field7775 <= arg4) {
                                        var23 = super.field7775;
                                    }
                                    if (~arg10 > -1) {
                                        var25 = 0;
                                    } else if (arg10 >= super.field7794) {
                                        var25 = super.field7794;
                                    }
                                    int var26 = arg10 + 7;
                                    if (~var24 > -1) {
                                        var24 = 0;
                                    } else if (super.field7775 <= var24) {
                                        var24 = super.field7775;
                                    }
                                    if (~var26 > -1) {
                                        var26 = 0;
                                    } else if (~super.field7794 >= ~var26) {
                                        var26 = super.field7794;
                                    }
                                    while (~var23 > ~var24) {
                                        while (var26 > var25) {
                                            super.field7793[arg9][var23][var25] = 0;
                                            ++var25;
                                        }
                                        ++var23;
                                    }
                                }
                            } else if (~var22 == -2) {
                                if (super.field7793[arg9] == null) {
                                    super.field7793[arg9] = new byte[super.field7775 - -1][super.field7794 - -1];
                                }
                                for (int var27 = 0; ~var27 > -65; var27 += 4) {
                                    for (int var28 = 0; var28 < 64; var28 += 4) {
                                        byte var29 = arg2.method2359(117);
                                        if (~arg1 <= ~var21) {
                                            for (int var30 = var27; var30 < var27 + 4; ++var30) {
                                                for (int var31 = var28; ~var31 > ~(var28 - -4); ++var31) {
                                                    if (~var14 >= ~var30 && var14 + 8 > var30 && var31 >= var15 && ~(var15 + 8) < ~var15) {
                                                        int var32 = arg4 - -class181.method1125(var31 & 7, arg6, 31290, var30 & 7);
                                                        int var33 = class41.method234(false, 7 & var31, 7 & var30, arg6) + arg10;
                                                        if (~var32 <= -1 && ~super.field7775 < ~var32 && ~var33 <= -1 && ~var33 > ~super.field7794) {
                                                            super.field7793[arg9][var32][var33] = var29;
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
                    class292.method1808(arg4 >> 3, 256, var13, arg10 >> 3);
                }
                if (!var12 && super.field7793 != null && super.field7793[arg9] != null) {
                    int var16 = arg4 - -7;
                    int var17 = arg10 + 7;
                    for (int var18 = arg4; ~var18 > ~var16; ++var18) {
                        for (int var19 = arg10; ~var17 < ~var19; ++var19) {
                            super.field7793[arg9][var18][var19] = 0;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILmk;IZIIIILza;II)V")
    public final void method2249(int arg0, class40 arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, class290 arg8, int arg9, int arg10) {
        ++field5451;
        if (class4.field81.method1791(-2, class405.field5737) || class36.method205(class146.field1941, 0, arg4, arg10, arg7)) {
            if (~this.field5447 < ~arg2) {
                this.field5447 = arg2;
            }
            class270 var12 = class377.field5338.method1901(50, arg9);
            if (!arg8.method363() || !class4.field81.field1412 || !var12.field3982) {
                int var13;
                int var14;
                if (arg0 != 1 && arg0 != 3) {
                    var13 = var12.field4012;
                    var14 = var12.field3937;
                } else {
                    var14 = var12.field4012;
                    var13 = var12.field3937;
                }
                int var15;
                int var16;
                if (super.field7775 >= arg4 + var14) {
                    var15 = (var14 + 1 >> 1) + arg4;
                    var16 = (var14 >> 1) + arg4;
                } else {
                    var16 = arg4;
                    var15 = arg4 + 1;
                }
                int var17;
                int var18;
                if (~super.field7794 <= ~(arg10 - -var13)) {
                    var17 = (var13 >> 1) + arg10;
                    var18 = (var13 + 1 >> 1) + arg10;
                } else {
                    var17 = arg10;
                    var18 = arg10 - -1;
                }
                class38 var19 = class330.field4818[arg7];
                int var20 = var19.method10(var16, var17) + var19.method10(var15, var17) + (var19.method10(var16, var18) - -var19.method10(var15, var18)) >> 2;
                int var21 = (arg4 << 7) + (var14 << 6);
                int var22 = (arg10 << 7) - -(var13 << 6);
                boolean var23 = class141.field1848 && !super.field7784 && var12.field3973;
                if (var12.method1700(-7)) {
                    class138.method863(arg0, arg4, (class429) null, arg10, arg2, (class22) null, -9518, var12);
                }
                boolean var24 = arg5 == -1 && ~var12.field3956 == 0 && var12.field3960 == null && var12.field3998 == null && !var12.field3981;
                if (!class153.field2207 || (!class139.method867((byte) 84, arg6) || ~var12.field3948 == -2) && (!class367.method2163((byte) -68, arg6) || ~var12.field3948 != -1)) {
                    if (arg6 == 22) {
                        if (class4.field81.field1444 || var12.field3957 != 0 || ~var12.field3989 == -2 || var12.field3966) {
                            class35 var26;
                            if (var24) {
                                class427 var25 = new class427(arg8, var12, arg7, var21, var20, var22, super.field7784, arg0, var23);
                                if (var25.method113(31692)) {
                                    var25.method117(arg8, (byte) -38);
                                }
                                var26 = var25;
                            } else {
                                var26 = new class494(arg8, var12, arg2, arg7, var21, var20, var22, super.field7784, arg0, arg5);
                            }
                            class35 var27 = class87.method628(arg2, arg4, arg10);
                            if (var27 instanceof class194) {
                                ((class194) var27).field2740 = var26;
                            } else {
                                class222.method1368(arg2, arg4, arg10, var26);
                            }
                            if (var12.field3989 == 1 && arg1 != null) {
                                arg1.method216(arg10, -54, arg4);
                            }
                        }
                    } else if (!arg3) {
                        if (~arg6 != -11 && arg6 != 11) {
                            if (~arg6 <= -13 && arg6 <= 17 || ~arg6 <= -19 && ~arg6 >= -22) {
                                class144 var28;
                                if (!var24) {
                                    var28 = new class295(arg8, var12, arg2, arg7, var21, var20, var22, super.field7784, arg4, var14 + -1 + arg4, arg10, arg10 + -1 - -var13, arg6, arg0, arg5);
                                } else {
                                    class340 var29 = new class340(arg8, var12, arg2, arg7, var21, var20, var22, super.field7784, arg4, arg4 + var14 + -1, arg10, arg10 + -1 + var13, arg6, arg0, var23);
                                    if (var29.method113(31692)) {
                                        var29.method117(arg8, (byte) -38);
                                    }
                                    var28 = var29;
                                }
                                class144 var30 = class248.method1622(arg2, arg4, arg10, field5455 != null ? field5455 : (field5455 = method2253("nc")));
                                if (var30 instanceof class209 && ~var30.field1911 == ~arg4 && ~var30.field1902 == ~arg10) {
                                    ((class209) var30).field3052 = var28;
                                } else {
                                    class120.method806(var28, false);
                                }
                                if (class141.field1848 && !super.field7784 && arg6 >= 12 && ~arg6 >= -18 && ~arg6 != -14 && arg2 > 0 && ~var12.field3948 != -1) {
                                    super.field7787[arg2][arg4][arg10] = (byte) class170.method1067(super.field7787[arg2][arg4][arg10], 4);
                                }
                                if (~var12.field3989 != -1 && arg1 != null) {
                                    arg1.method227(var14, 51, arg4, var12.field4006, arg10, !var12.field3941, var13);
                                }
                            } else if (~arg6 == -1) {
                                int var31 = var12.field3948;
                                if (class274.field4054 && ~var12.field3948 == 0) {
                                    var31 = 1;
                                }
                                class232 var32;
                                if (!var24) {
                                    var32 = new class355(arg8, var12, arg2, arg7, var21, var20, var22, super.field7784, arg6, arg0, arg5);
                                } else {
                                    class488 var33 = new class488(arg8, var12, arg7, var21, var20, var22, super.field7784, arg6, arg0, var23);
                                    if (var33.method113(31692)) {
                                        var33.method117(arg8, (byte) -38);
                                    }
                                    var32 = var33;
                                }
                                class232 var34 = class38.method211(arg2, arg4, arg10);
                                if (!(var34 instanceof class521)) {
                                    class295.method1814(arg2, arg4, arg10, var32, (class232) null);
                                } else {
                                    ((class521) var34).field7659 = var32;
                                }
                                if (class141.field1848) {
                                    if (arg0 == 0) {
                                        if (var12.field3958) {
                                            var19.method9(arg4, arg10, 50);
                                            var19.method9(arg4, arg10 - -1, 50);
                                        }
                                        if (~var31 == -2 && !super.field7784) {
                                            super.field7787[arg2][arg4][arg10] = (byte) class170.method1067(super.field7787[arg2][arg4][arg10], 1);
                                        }
                                    } else if (arg0 != 1) {
                                        if (~arg0 == -3) {
                                            if (var12.field3958) {
                                                var19.method9(arg4 - -1, arg10, 50);
                                                var19.method9(arg4 + 1, arg10 - -1, 50);
                                            }
                                            if (~var31 == -2 && !super.field7784) {
                                                super.field7787[arg2][arg4 + 1][arg10] = (byte) class170.method1067(super.field7787[arg2][arg4 + 1][arg10], 1);
                                            }
                                        } else if (arg0 == 3) {
                                            if (var12.field3958) {
                                                var19.method9(arg4, arg10, 50);
                                                var19.method9(arg4 + 1, arg10, 50);
                                            }
                                            if (~var31 == -2 && !super.field7784) {
                                                super.field7787[arg2][arg4][arg10] = (byte) class170.method1067(super.field7787[arg2][arg4][arg10], 2);
                                            }
                                        }
                                    } else {
                                        if (var12.field3958) {
                                            var19.method9(arg4, arg10 + 1, 50);
                                            var19.method9(arg4 + 1, arg10 + 1, 50);
                                        }
                                        if (~var31 == -2 && !super.field7784) {
                                            super.field7787[arg2][arg4][arg10 + 1] = (byte) class170.method1067(super.field7787[arg2][arg4][arg10 + 1], 2);
                                        }
                                    }
                                }
                                if (var12.field3989 != 0 && arg1 != null) {
                                    arg1.method218(arg10, arg4, 25, arg0, var12.field4006, !var12.field3941, arg6);
                                }
                                if (~var12.field4016 != -17) {
                                    class334.method1994(arg2, arg4, arg10, var12.field4016);
                                }
                            } else if (arg6 == 1) {
                                class232 var36;
                                if (var24) {
                                    class488 var35 = new class488(arg8, var12, arg7, var21, var20, var22, super.field7784, arg6, arg0, var23);
                                    if (var35.method113(31692)) {
                                        var35.method117(arg8, (byte) -38);
                                    }
                                    var36 = var35;
                                } else {
                                    var36 = new class355(arg8, var12, arg2, arg7, var21, var20, var22, super.field7784, arg6, arg0, arg5);
                                }
                                class232 var37 = class38.method211(arg2, arg4, arg10);
                                if (!(var37 instanceof class521)) {
                                    class295.method1814(arg2, arg4, arg10, var36, (class232) null);
                                } else {
                                    ((class521) var37).field7659 = var36;
                                }
                                if (var12.field3958 && class141.field1848) {
                                    if (arg0 == 0) {
                                        var19.method9(arg4, arg10 - -1, 50);
                                    } else if (~arg0 == -2) {
                                        var19.method9(arg4 + 1, arg10 + 1, 50);
                                    } else if (~arg0 == -3) {
                                        var19.method9(arg4 + 1, arg10, 50);
                                    } else if (~arg0 == -4) {
                                        var19.method9(arg4, arg10, 50);
                                    }
                                }
                                if (~var12.field3989 != -1 && arg1 != null) {
                                    arg1.method218(arg10, arg4, 25, arg0, var12.field4006, !var12.field3941, arg6);
                                }
                            } else if (~arg6 == -3) {
                                int var38 = arg0 - -1 & 3;
                                class232 var39;
                                class232 var40;
                                if (!var24) {
                                    var39 = new class355(arg8, var12, arg2, arg7, var21, var20, var22, super.field7784, arg6, arg0 - -4, arg5);
                                    var40 = new class355(arg8, var12, arg2, arg7, var21, var20, var22, super.field7784, arg6, var38, arg5);
                                } else {
                                    class488 var41 = new class488(arg8, var12, arg7, var21, var20, var22, super.field7784, arg6, arg0 - -4, var23);
                                    class488 var42 = new class488(arg8, var12, arg7, var21, var20, var22, super.field7784, arg6, var38, var23);
                                    if (var41.method113(31692)) {
                                        var41.method117(arg8, (byte) -38);
                                    }
                                    var40 = var42;
                                    var39 = var41;
                                    if (var42.method113(31692)) {
                                        var42.method117(arg8, (byte) -38);
                                    }
                                }
                                class295.method1814(arg2, arg4, arg10, var39, var40);
                                if (var12.field3948 == 1 && class141.field1848 && !super.field7784) {
                                    if (arg0 != 0) {
                                        if (arg0 == 1) {
                                            super.field7787[arg2][arg4][arg10 - -1] = (byte) class170.method1067(super.field7787[arg2][arg4][arg10 - -1], 2);
                                            super.field7787[arg2][arg4 + 1][arg10] = (byte) class170.method1067(super.field7787[arg2][arg4 + 1][arg10], 1);
                                        } else if (~arg0 != -3) {
                                            if (arg0 == 3) {
                                                super.field7787[arg2][arg4][arg10] = (byte) class170.method1067(super.field7787[arg2][arg4][arg10], 2);
                                                super.field7787[arg2][arg4][arg10] = (byte) class170.method1067(super.field7787[arg2][arg4][arg10], 1);
                                            }
                                        } else {
                                            super.field7787[arg2][arg4 - -1][arg10] = (byte) class170.method1067(super.field7787[arg2][arg4 - -1][arg10], 1);
                                            super.field7787[arg2][arg4][arg10] = (byte) class170.method1067(super.field7787[arg2][arg4][arg10], 2);
                                        }
                                    } else {
                                        super.field7787[arg2][arg4][arg10] = (byte) class170.method1067(super.field7787[arg2][arg4][arg10], 1);
                                        super.field7787[arg2][arg4][arg10 + 1] = (byte) class170.method1067(super.field7787[arg2][arg4][arg10 + 1], 2);
                                    }
                                }
                                if (var12.field3989 != 0 && arg1 != null) {
                                    arg1.method218(arg10, arg4, 25, arg0, var12.field4006, !var12.field3941, arg6);
                                }
                                if (var12.field4016 != 16) {
                                    class334.method1994(arg2, arg4, arg10, var12.field4016);
                                }
                            } else if (arg6 == 3) {
                                class232 var43;
                                if (!var24) {
                                    var43 = new class355(arg8, var12, arg2, arg7, var21, var20, var22, super.field7784, arg6, arg0, arg5);
                                } else {
                                    class488 var44 = new class488(arg8, var12, arg7, var21, var20, var22, super.field7784, arg6, arg0, var23);
                                    if (var44.method113(31692)) {
                                        var44.method117(arg8, (byte) -38);
                                    }
                                    var43 = var44;
                                }
                                class232 var45 = class38.method211(arg2, arg4, arg10);
                                if (!(var45 instanceof class521)) {
                                    class295.method1814(arg2, arg4, arg10, var43, (class232) null);
                                } else {
                                    ((class521) var45).field7659 = var43;
                                }
                                if (var12.field3958 && class141.field1848) {
                                    if (arg0 == 0) {
                                        var19.method9(arg4, arg10 + 1, 50);
                                    } else if (arg0 != 1) {
                                        if (arg0 == 2) {
                                            var19.method9(arg4 + 1, arg10, 50);
                                        } else if (arg0 == 3) {
                                            var19.method9(arg4, arg10, 50);
                                        }
                                    } else {
                                        var19.method9(arg4 + 1, arg10 + 1, 50);
                                    }
                                }
                                if (~var12.field3989 != -1 && arg1 != null) {
                                    arg1.method218(arg10, arg4, 25, arg0, var12.field4006, !var12.field3941, arg6);
                                }
                            } else if (arg6 == 9) {
                                class144 var47;
                                if (var24) {
                                    class340 var46 = new class340(arg8, var12, arg2, arg7, var21, var20, var22, super.field7784, arg4, arg4, arg10, arg10, arg6, arg0, var23);
                                    var47 = var46;
                                    if (var46.method113(31692)) {
                                        var46.method117(arg8, (byte) -38);
                                    }
                                } else {
                                    var47 = new class295(arg8, var12, arg2, arg7, var21, var20, var22, super.field7784, arg4, var14 - 1 + arg4, arg10, arg10 - -var13 + -1, arg6, arg0, arg5);
                                }
                                class144 var48 = class248.method1622(arg2, arg4, arg10, field5455 != null ? field5455 : (field5455 = method2253("nc")));
                                if (var48 instanceof class209 && ~var48.field1911 == ~arg4 && ~var48.field1902 == ~arg10) {
                                    ((class209) var48).field3052 = var47;
                                } else {
                                    class120.method806(var47, false);
                                }
                                if (~var12.field3989 != -1 && arg1 != null) {
                                    arg1.method227(var14, 54, arg4, var12.field4006, arg10, !var12.field3941, var13);
                                }
                                if (var12.field4016 != 16) {
                                    class334.method1994(arg2, arg4, arg10, var12.field4016);
                                }
                            } else if (arg6 == 4) {
                                class362 var50;
                                if (var24) {
                                    class112 var49 = new class112(arg8, var12, arg7, var21, var20, var22, super.field7784, 0, 0, 0, arg6, arg0);
                                    var50 = var49;
                                    if (var49.method113(31692)) {
                                        var49.method117(arg8, (byte) -38);
                                    }
                                } else {
                                    var50 = new class475(arg8, var12, arg2, arg7, var21, var20, var22, super.field7784, 0, 0, 0, arg6, arg0, arg5);
                                }
                                class362 var51 = class335.method2002(arg2, arg4, arg10);
                                if (var51 instanceof class453) {
                                    ((class453) var51).field6340 = var50;
                                } else {
                                    class481.method2773(arg2, arg4, arg10, var50, (class362) null);
                                }
                            } else if (arg6 == 5) {
                                int var52 = 17;
                                class21 var53 = (class21) class38.method211(arg2, arg4, arg10);
                                if (var53 != null) {
                                    var52 = class377.field5338.method1901(50, var53.method110((byte) 116)).field4016 - -1;
                                }
                                class362 var54;
                                if (!var24) {
                                    var54 = new class475(arg8, var12, arg2, arg7, var21, var20, var22, super.field7784, 0, class452.field6335[arg0] * var52, class217.field3154[arg0] * var52, arg6, arg0, arg5);
                                } else {
                                    class112 var55 = new class112(arg8, var12, arg7, var21, var20, var22, super.field7784, 0, class452.field6335[arg0] * var52, class217.field3154[arg0] * var52, arg6, arg0);
                                    var54 = var55;
                                    if (var55.method113(31692)) {
                                        var55.method117(arg8, (byte) -38);
                                    }
                                }
                                class362 var56 = class335.method2002(arg2, arg4, arg10);
                                if (var56 instanceof class453) {
                                    ((class453) var56).field6340 = var54;
                                } else {
                                    class481.method2773(arg2, arg4, arg10, var54, (class362) null);
                                }
                            } else if (arg6 == 6) {
                                int var57 = 9;
                                class21 var58 = (class21) class38.method211(arg2, arg4, arg10);
                                if (var58 != null) {
                                    var57 = class377.field5338.method1901(50, var58.method110((byte) 127)).field4016 / 2 - -1;
                                }
                                class362 var59;
                                if (!var24) {
                                    var59 = new class475(arg8, var12, arg2, arg7, var21, var20, var22, super.field7784, arg0, class61.field760[arg0] * var57, class178.field2560[arg0] * var57, arg6, arg0 + 4, arg5);
                                } else {
                                    class112 var60 = new class112(arg8, var12, arg7, var21, var20, var22, super.field7784, arg0, class452.field6335[arg0] * var57, class217.field3154[arg0] * var57, arg6, arg0 + 4);
                                    var59 = var60;
                                    if (var60.method113(31692)) {
                                        var60.method117(arg8, (byte) -38);
                                    }
                                }
                                class362 var61 = class335.method2002(arg2, arg4, arg10);
                                if (var61 instanceof class453) {
                                    ((class453) var61).field6340 = var59;
                                } else {
                                    class481.method2773(arg2, arg4, arg10, var59, (class362) null);
                                }
                            } else if (~arg6 == -8) {
                                int var62 = 3 & arg0 + 2;
                                class362 var63;
                                if (!var24) {
                                    var63 = new class475(arg8, var12, arg2, arg7, var21, var20, var22, super.field7784, var62, 0, 0, arg6, var62 + 4, arg5);
                                } else {
                                    class112 var64 = new class112(arg8, var12, arg7, var21, var20, var22, super.field7784, var62, 0, 0, arg6, var62 + 4);
                                    var63 = var64;
                                    if (var64.method113(31692)) {
                                        var64.method117(arg8, (byte) -38);
                                    }
                                }
                                class362 var65 = class335.method2002(arg2, arg4, arg10);
                                if (!(var65 instanceof class453)) {
                                    class481.method2773(arg2, arg4, arg10, var63, (class362) null);
                                } else {
                                    ((class453) var65).field6340 = var63;
                                }
                            } else if (~arg6 == -9) {
                                int var66 = 3 & arg0 - -2;
                                int var67 = 9;
                                class21 var68 = (class21) class38.method211(arg2, arg4, arg10);
                                if (var68 != null) {
                                    var67 = class377.field5338.method1901(50, var68.method110((byte) 102)).field4016 / 2 + 1;
                                }
                                class362 var70;
                                class362 var72;
                                if (!var24) {
                                    class475 var69 = new class475(arg8, var12, arg2, arg7, var21, var20, var22, super.field7784, arg0, class61.field760[arg0] * var67, class178.field2560[arg0] * var67, arg6, arg0 + 4, arg5);
                                    var70 = var69;
                                    class475 var71 = new class475(arg8, var12, arg2, arg7, var21, var20, var22, super.field7784, arg0, 0, 0, arg6, var66 - -4, arg5);
                                    var72 = var71;
                                } else {
                                    class112 var73 = new class112(arg8, var12, arg7, var21, var20, var22, super.field7784, arg0, class61.field760[arg0] * var67, class178.field2560[arg0] * var67, arg6, arg0 + 4);
                                    class112 var74 = new class112(arg8, var12, arg7, var21, var20, var22, super.field7784, arg0, 0, 0, arg6, var66 - -4);
                                    if (var73.method113(31692)) {
                                        var73.method117(arg8, (byte) -38);
                                    }
                                    var72 = var74;
                                    if (var74.method113(31692)) {
                                        var74.method117(arg8, (byte) -38);
                                    }
                                    var70 = var73;
                                }
                                class481.method2773(arg2, arg4, arg10, var70, var72);
                            }
                        } else {
                            class340 var75 = null;
                            int var77;
                            class144 var78;
                            if (var24) {
                                class340 var76 = new class340(arg8, var12, arg2, arg7, var21, var20, var22, super.field7784, arg4, arg4 - (-var14 - -1), arg10, arg10 - -var13 + -1, arg6, arg0, var23);
                                var75 = var76;
                                var77 = var76.method2022((byte) -107);
                                var78 = var76;
                            } else {
                                var77 = 15;
                                var78 = new class295(arg8, var12, arg2, arg7, var21, var20, var22, super.field7784, arg4, arg4 - -var14 + -1, arg10, var13 + -1 + arg10, arg6, arg0, arg5);
                            }
                            class144 var79 = class248.method1622(arg2, arg4, arg10, field5455 != null ? field5455 : (field5455 = method2253("nc")));
                            boolean var80 = false;
                            if (var79 instanceof class209 && var79.field1911 == arg4 && var79.field1902 == arg10) {
                                ((class209) var79).field3052 = var78;
                                var80 = true;
                            }
                            if (var80 || class120.method806(var78, false)) {
                                if (var75 != null && var75.method113(31692)) {
                                    var75.method117(arg8, (byte) -38);
                                }
                                if (var12.field3958 && class141.field1848) {
                                    if (~var77 < -31) {
                                        var77 = 30;
                                    }
                                    for (int var81 = 0; ~var14 <= ~var81; ++var81) {
                                        for (int var82 = 0; ~var82 >= ~var13; ++var82) {
                                            var19.method9(arg4 - -var81, arg10 + var82, var77);
                                        }
                                    }
                                }
                            }
                            if (var12.field3989 != 0 && arg1 != null) {
                                arg1.method227(var14, 54, arg4, var12.field4006, arg10, !var12.field3941, var13);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
    public static void method2250(byte arg0) {
        field5449 = null;
        field5453 = null;
        if (arg0 != 72) {
            method2250((byte) -38);
        }
        field5452 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(BLza;)V")
    public final void method2251(byte arg0, class290 arg1) {
        ++field5444;
        class29.method181(arg1);
        if (~super.field7796 < -2) {
            for (int var3 = 0; super.field7775 > var3; ++var3) {
                for (int var4 = 0; var4 < super.field7794; ++var4) {
                    if (~(class368.field5253[1][var3][var4] & 2) == -3) {
                        class292.method1809(var3, var4);
                    }
                }
            }
        }
        int var5 = 104 % ((-29 - arg0) / 63);
        for (int var6 = 0; var6 < super.field7796; ++var6) {
            for (int var7 = 0; ~var7 >= ~super.field7794; ++var7) {
                for (int var8 = 0; super.field7775 >= var8; ++var8) {
                    if ((1 & super.field7787[var6][var8][var7]) != 0) {
                        int var9 = var7;
                        int var10 = var7;
                        int var11 = var6;
                        while (var10 < super.field7794 && (super.field7787[var6][var8][var10 + 1] & 1) != 0) {
                            ++var10;
                        }
                        while (~var9 < -1 && ~(1 & super.field7787[var6][var8][var9 + -1]) != -1) {
                            --var9;
                        }
                        int var12 = var6;
                        label168: while (~var11 < -1) {
                            for (int var13 = var9; ~var13 >= ~var10; ++var13) {
                                if ((1 & super.field7787[var11 + -1][var8][var13]) == 0) {
                                    break label168;
                                }
                            }
                            --var11;
                        }
                        label157: while (~var12 > -4) {
                            for (int var14 = var9; ~var14 >= ~var10; ++var14) {
                                if (~(1 & super.field7787[var12 + 1][var8][var14]) == -1) {
                                    break label157;
                                }
                            }
                            ++var12;
                        }
                        int var15 = (var12 - var11 + 1) * (var10 + 1 + -var9);
                        if (~var15 <= -3) {
                            short var16 = 240;
                            int var17 = super.field7791[var12][var8][var9] + -var16;
                            int var18 = super.field7791[var11][var8][var9];
                            class424.method2513(1, var8 << 7, var8 << 7, var9 << 7, (var10 << 7) - -128, var17, var18);
                            for (int var19 = var11; var12 >= var19; ++var19) {
                                for (int var20 = var9; var20 <= var10; ++var20) {
                                    super.field7787[var19][var8][var20] = (byte) class239.method1507(super.field7787[var19][var8][var20], -2);
                                }
                            }
                        }
                    }
                    if (~(super.field7787[var6][var8][var7] & 2) != -1) {
                        int var21 = var8;
                        int var22 = var8;
                        int var23 = var6;
                        while (~super.field7775 < ~var22 && (super.field7787[var6][var22 + 1][var7] & 2) != 0) {
                            ++var22;
                        }
                        while (var21 > 0 && ~(super.field7787[var6][var21 + -1][var7] & 2) != -1) {
                            --var21;
                        }
                        int var24 = var6;
                        label222: while (~var23 < -1) {
                            for (int var25 = var21; ~var25 >= ~var22; ++var25) {
                                if (~(super.field7787[var23 + -1][var25][var7] & 2) == -1) {
                                    break label222;
                                }
                            }
                            --var23;
                        }
                        label211: while (~var24 > -4) {
                            for (int var26 = var21; var26 <= var22; ++var26) {
                                if (~(2 & super.field7787[var24 - -1][var26][var7]) == -1) {
                                    break label211;
                                }
                            }
                            ++var24;
                        }
                        int var27 = (var24 - -1 - var23) * (-var21 - -1 + var22);
                        if (~var27 <= -3) {
                            short var28 = 240;
                            int var29 = super.field7791[var24][var21][var7] + -var28;
                            int var30 = super.field7791[var23][var21][var7];
                            class424.method2513(2, var21 << 7, (var22 << 7) + 128, var7 << 7, var7 << 7, var29, var30);
                            for (int var31 = var23; var24 >= var31; ++var31) {
                                for (int var32 = var21; var22 >= var32; ++var32) {
                                    super.field7787[var31][var32][var7] = (byte) class239.method1507(super.field7787[var31][var32][var7], -3);
                                }
                            }
                        }
                    }
                    if ((super.field7787[var6][var8][var7] & 4) != 0) {
                        int var33 = var8;
                        int var34 = var8;
                        int var35;
                        for (var35 = var7; ~var35 < -1 && ~(4 & super.field7787[var6][var8][var35 - 1]) != -1; --var35) {
                        }
                        int var36;
                        for (var36 = var7; ~var36 > ~super.field7794 && (super.field7787[var6][var8][var36 + 1] & 4) != 0; ++var36) {
                        }
                        label276: while (var33 > 0) {
                            for (int var37 = var35; var36 >= var37; ++var37) {
                                if (~(super.field7787[var6][var33 + -1][var37] & 4) == -1) {
                                    break label276;
                                }
                            }
                            --var33;
                        }
                        label265: while (~super.field7775 < ~var34) {
                            for (int var38 = var35; ~var36 <= ~var38; ++var38) {
                                if ((super.field7787[var6][var34 + 1][var38] & 4) == 0) {
                                    break label265;
                                }
                            }
                            ++var34;
                        }
                        if (~((-var33 + var34 + 1) * (-var35 + 1 + var36)) <= -5) {
                            int var39 = super.field7791[var6][var33][var35];
                            class424.method2513(4, var33 << 7, (var34 << 7) + 128, var35 << 7, (var36 << 7) + 128, var39, var39);
                            for (int var40 = var33; ~var40 >= ~var34; ++var40) {
                                for (int var41 = var35; ~var36 <= ~var41; ++var41) {
                                    super.field7787[var6][var40][var41] = (byte) class239.method1507(super.field7787[var6][var40][var41], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
        super.field7787 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lza;Lmk;IIIII)V")
    public final void method2252(class290 arg0, class40 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field5450;
        class21 var8 = null;
        if (~arg6 == -1) {
            var8 = (class21) class38.method211(arg2, arg5, arg3);
        }
        if (~arg6 == -2) {
            var8 = (class21) class335.method2002(arg2, arg5, arg3);
        }
        int var9 = 88 % ((arg4 - -28) / 54);
        if (arg6 == 2) {
            var8 = (class21) class248.method1622(arg2, arg5, arg3, field5455 != null ? field5455 : (field5455 = method2253("nc")));
        }
        if (arg6 == 3) {
            var8 = (class21) class87.method628(arg2, arg5, arg3);
        }
        if (var8 != null) {
            class270 var10 = class377.field5338.method1901(50, var8.method110((byte) 112));
            int var11 = var8.method112(118);
            int var12 = var8.method114(-9772);
            if (var10.method1700(117)) {
                class386.method2238((byte) 119, arg3, arg2, arg5, var10);
            }
            if (var8.method113(31692)) {
                var8.method111(-38, arg0);
            }
            if (~arg6 == -1) {
                class232 var13 = class38.method211(arg2, arg5, arg3);
                if (var13 instanceof class521) {
                    ((class521) var13).field7659 = null;
                } else {
                    class234.method1433(arg2, arg5, arg3);
                }
                if (var10.field3989 != 0) {
                    arg1.method228(var12, !var10.field3941, arg5, var10.field4006, (byte) 76, var11, arg3);
                    return;
                }
                return;
            }
            if (arg6 == 1) {
                class362 var14 = class335.method2002(arg2, arg5, arg3);
                if (!(var14 instanceof class453)) {
                    class75.method581(arg2, arg5, arg3);
                    return;
                }
                ((class453) var14).field6340 = null;
                return;
            }
            if (arg6 != 2) {
                if (arg6 == 3) {
                    class35 var15 = class87.method628(arg2, arg5, arg3);
                    if (!(var15 instanceof class194)) {
                        class56.method467(arg2, arg5, arg3);
                    } else {
                        ((class194) var15).field2740 = null;
                    }
                    if (~var10.field3989 == -2) {
                        arg1.method226((byte) -98, arg3, arg5);
                        return;
                    }
                }
                return;
            }
            class144 var16 = class248.method1622(arg2, arg5, arg3, field5455 != null ? field5455 : (field5455 = method2253("nc")));
            if (var16 instanceof class209 && ~var16.field1911 == ~arg5 && var16.field1902 == arg3) {
                ((class209) var16).field3052 = null;
            } else {
                class234.method1435(arg2, arg5, arg3, field5455 != null ? field5455 : (field5455 = method2253("nc")));
            }
            if (~var10.field3989 != -1 && ~(var10.field3937 + arg5) > ~super.field7775 && var10.field3937 + arg3 < super.field7794 && ~(var10.field4012 + arg5) > ~super.field7775 && super.field7794 > var10.field4012 + arg3) {
                arg1.method224(var12, var10.field3937, !var10.field3941, var10.field4012, 3, arg3, arg5, var10.field4006);
                return;
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2253(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
