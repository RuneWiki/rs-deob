import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class420 extends class456 {

    @OriginalMember(owner = "client!nq", name = "H", descriptor = "I")
    public int field5583 = 99;

    @OriginalMember(owner = "client!nq", name = "G", descriptor = "[Lmj;")
    public static class597[] field5582 = new class597[128];

    @OriginalMember(owner = "client!nq", name = "N", descriptor = "[I")
    public static int[] field5589 = new int[8];

    @OriginalMember(owner = "client!nq", name = "P", descriptor = "I")
    public static int field5591 = -1;

    @OriginalMember(owner = "client!nq", name = "D", descriptor = "I")
    public static int field5579;

    @OriginalMember(owner = "client!nq", name = "E", descriptor = "I")
    public static int field5580;

    @OriginalMember(owner = "client!nq", name = "F", descriptor = "I")
    public static int field5581;

    @OriginalMember(owner = "client!nq", name = "I", descriptor = "I")
    public static int field5584;

    @OriginalMember(owner = "client!nq", name = "J", descriptor = "I")
    public static int field5585;

    @OriginalMember(owner = "client!nq", name = "K", descriptor = "I")
    public static int field5586;

    @OriginalMember(owner = "client!nq", name = "L", descriptor = "I")
    public static int field5587;

    @OriginalMember(owner = "client!nq", name = "M", descriptor = "I")
    public static int field5588;

    @OriginalMember(owner = "client!nq", name = "O", descriptor = "I")
    public static int field5590;

    // $FF: synthetic field
    @OriginalMember(owner = "client!nq", name = "Q", descriptor = "Ljava/lang/Class;")
    public static Class field5592;

    // $FF: synthetic method
    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2279(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Liaa;Loa;II[II)V", line = 3)
    public final void method2270(class452 arg0, class635 arg1, int arg2, int arg3, int[] arg4, int arg5) {
        ++field5587;
        if (!super.field6377) {
            boolean var7 = false;
            class515 var8 = null;
            if (arg4 != null) {
                arg4[0] = -1;
            }
            if (arg5 <= 50) {
                field5589 = null;
            }
            while (true) {
                int var19;
                label312: do {
                    while (true) {
                        while (arg0.field6209.length > arg0.field6215) {
                            int var18 = arg0.method2541(103);
                            if (~var18 != -1) {
                                if (var18 == 1) {
                                    var19 = arg0.method2541(125);
                                    continue label312;
                                }
                                if (~var18 == -3) {
                                    if (var8 == null) {
                                        var8 = new class515();
                                    }
                                    var8.method2945(arg0, 12);
                                } else if (var18 == 128) {
                                    if (arg4 != null) {
                                        arg4[0] = arg0.method2574(-1758460248);
                                        arg4[1] = arg0.method2549((byte) 32);
                                        arg4[2] = arg0.method2549((byte) 32);
                                        arg4[3] = arg0.method2549((byte) 32);
                                        arg4[4] = arg0.method2574(-1758460248);
                                    } else {
                                        arg0.field6215 += 10;
                                    }
                                } else {
                                    if (var18 != 129) {
                                        throw new IllegalStateException("");
                                    }
                                    if (super.field6360 == null) {
                                        super.field6360 = new byte[4][][];
                                    }
                                    for (int var28 = 0; ~var28 > -5; ++var28) {
                                        byte var29 = arg0.method2547(true);
                                        if (~var29 == -1 && super.field6360[var28] != null) {
                                            int var30 = arg2;
                                            int var31 = arg2 + 64;
                                            int var32 = arg3;
                                            int var33 = arg3 + 64;
                                            if (~arg3 <= -1) {
                                                if (arg3 >= super.field6376) {
                                                    var32 = super.field6376;
                                                }
                                            } else {
                                                var32 = 0;
                                            }
                                            if (~var31 > -1) {
                                                var31 = 0;
                                            } else if (super.field6351 <= var31) {
                                                var31 = super.field6351;
                                            }
                                            if (arg2 < 0) {
                                                var30 = 0;
                                            } else if (super.field6351 <= arg2) {
                                                var30 = super.field6351;
                                            }
                                            if (var33 >= 0) {
                                                if (~super.field6376 >= ~var33) {
                                                    var33 = super.field6376;
                                                }
                                            } else {
                                                var33 = 0;
                                            }
                                            while (~var31 < ~var30) {
                                                while (~var33 < ~var32) {
                                                    super.field6360[var28][var30][var32] = 0;
                                                    ++var32;
                                                }
                                                ++var30;
                                            }
                                        } else if (~var29 != -2) {
                                            if (var29 == 2) {
                                                if (super.field6360[var28] == null) {
                                                    super.field6360[var28] = new byte[super.field6351 + 1][super.field6376 + 1];
                                                }
                                                if (var28 > 0) {
                                                    int var34 = arg2;
                                                    int var35 = arg2 + 64;
                                                    int var36 = arg3;
                                                    if (arg3 < 0) {
                                                        var36 = 0;
                                                    } else if (~super.field6376 >= ~arg3) {
                                                        var36 = super.field6376;
                                                    }
                                                    if (~arg2 <= -1) {
                                                        if (~arg2 <= ~super.field6351) {
                                                            var34 = super.field6351;
                                                        }
                                                    } else {
                                                        var34 = 0;
                                                    }
                                                    int var37 = arg3 + 64;
                                                    if (~var35 > -1) {
                                                        var35 = 0;
                                                    } else if (var35 >= super.field6351) {
                                                        var35 = super.field6351;
                                                    }
                                                    if (var37 >= 0) {
                                                        if (~var37 <= ~super.field6376) {
                                                            var37 = super.field6376;
                                                        }
                                                    } else {
                                                        var37 = 0;
                                                    }
                                                    while (~var35 < ~var34) {
                                                        while (var36 < var37) {
                                                            super.field6360[var28][var34][var36] = super.field6360[var28 - 1][var34][var36];
                                                            ++var36;
                                                        }
                                                        ++var34;
                                                    }
                                                }
                                            }
                                        } else {
                                            if (super.field6360[var28] == null) {
                                                super.field6360[var28] = new byte[super.field6351 - -1][super.field6376 + 1];
                                            }
                                            for (int var38 = 0; ~var38 > -65; var38 += 4) {
                                                for (int var39 = 0; var39 < 64; var39 += 4) {
                                                    byte var40 = arg0.method2547(true);
                                                    for (int var41 = arg2 + var38; ~(var38 + 4 + arg2) < ~var41; ++var41) {
                                                        for (int var42 = arg3 + var39; arg3 + var39 + 4 > var42; ++var42) {
                                                            if (~var41 <= -1 && var41 < super.field6351 && var42 >= 0 && ~var42 > ~super.field6376) {
                                                                super.field6360[var28][var41][var42] = var40;
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
                                var8 = new class515(arg0);
                            }
                        }
                        if (var8 != null) {
                            for (int var9 = 0; var9 < 8; ++var9) {
                                for (int var10 = 0; ~var10 > -9; ++var10) {
                                    int var11 = (arg2 >> 3) + var9;
                                    int var12 = (arg3 >> 3) - -var10;
                                    if (var11 >= 0 && ~var11 > ~(super.field6351 >> 3) && var12 >= 0 && var12 < super.field6376 >> 3) {
                                        class223.method1307(var12, 0, var11, var8);
                                    }
                                }
                            }
                        }
                        if (!var7 && super.field6360 != null) {
                            for (int var13 = 0; ~var13 > -5; ++var13) {
                                if (super.field6360[var13] != null) {
                                    for (int var14 = 0; ~var14 > -17; ++var14) {
                                        for (int var15 = 0; ~var15 > -17; ++var15) {
                                            int var16 = (arg2 >> 2) + var14;
                                            int var17 = (arg3 >> 2) + var15;
                                            if (var16 >= 0 && var16 < 26 && var17 >= 0 && var17 < 26) {
                                                super.field6360[var13][var16][var17] = 0;
                                            }
                                        }
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    }
                } while (var19 <= 0);
                for (int var20 = 0; ~var20 > ~var19; ++var20) {
                    class247 var21 = new class247(arg1, arg0, 2);
                    if (var21.field3190 == 31) {
                        class656 var22 = class168.field2010.method1077((byte) -57, arg0.method2574(-1758460248));
                        var21.method1426(-2009810229, var22.field9369, var22.field9363, var22.field9360, var22.field9361);
                    }
                    if (~arg1.method352() < -1) {
                        class463 var23 = var21.field3189;
                        int var24 = var23.method2640(-2049) + (arg2 << 9);
                        int var25 = (arg3 << 9) + var23.method2641((byte) -14);
                        int var26 = var24 >> 9;
                        int var27 = var25 >> 9;
                        if (var26 >= 0 && var27 >= 0 && ~var26 > ~super.field6351 && ~super.field6376 < ~var27) {
                            var23.method2509(72, var24, super.field6375[var21.field3188][var26][var27] - var23.method2638((byte) -96), var25);
                            class387.method2119(var21);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(I)V", line = 370)
    public static void method2271(int arg0) {
        if (arg0 <= -95) {
            field5589 = null;
            field5582 = null;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIIIILoa;[B[Lle;III)V", line = 381)
    public final void method2272(int arg0, int arg1, int arg2, int arg3, int arg4, class635 arg5, byte[] arg6, class277[] arg7, int arg8, int arg9, int arg10) {
        ++field5590;
        class452 var12 = new class452(arg6);
        if (arg1 < 73) {
            method2271(-114);
        }
        int var13 = -1;
        while (true) {
            int var14 = var12.method2522(117);
            if (~var14 == -1) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method2548(-29696);
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 63;
                int var18 = var15 >> 6 & 63;
                int var19 = var15 >> 12;
                int var20 = var12.method2541(105);
                int var21 = var20 >> 2;
                int var22 = var20 & 3;
                if (~arg2 == ~var19 && var18 >= arg3 && var18 < arg3 + 8 && ~var17 <= ~arg0 && ~var17 > ~(arg0 + 8)) {
                    class335 var23 = class195.field2339.method3729(var13, (byte) 109);
                    int var24 = class398.method2182(arg4, 7 & var18, var23.field4410, (byte) 23, var22, var23.field4322, 7 & var17) + arg8;
                    int var25 = class626.method3508(-124, var22, var23.field4410, var17 & 7, var23.field4322, 7 & var18, arg4) + arg9;
                    if (var24 > 0 && var25 > 0 && ~var24 > ~(super.field6351 + -1) && super.field6376 + -1 > var25) {
                        class277 var26 = null;
                        if (!super.field6377) {
                            int var27 = arg10;
                            if ((2 & class379.field4922[1][var24][var25]) == 2) {
                                var27 = arg10 - 1;
                            }
                            if (var27 >= 0) {
                                var26 = arg7[var27];
                            }
                        }
                        this.method2273(false, arg10, var26, arg10, var13, var25, var21, -1, arg5, 3 & arg4 + var22, var24);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZILle;IIIIILoa;II)V", line = 461)
    public final void method2273(boolean arg0, int arg1, class277 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class635 arg8, int arg9, int arg10) {
        ++field5579;
        if (class601.field8530.method1835(class150.field1711, (byte) 110) || class177.method1042(arg5, (byte) -109, arg10, arg1, class676.field9588)) {
            if (arg3 < this.field5583) {
                this.field5583 = arg3;
            }
            class335 var12 = class195.field2339.method3729(arg4, (byte) 109);
            if (!arg8.method276() || !class601.field8530.field2876 || !var12.field4346) {
                int var13;
                int var14;
                if (arg9 != 1 && arg9 != 3) {
                    var13 = var12.field4410;
                    var14 = var12.field4322;
                } else {
                    var13 = var12.field4322;
                    var14 = var12.field4410;
                }
                int var15;
                int var16;
                if (super.field6351 < arg10 - -var13) {
                    var15 = arg10;
                    var16 = arg10 + 1;
                } else {
                    var16 = (var13 + 1 >> 1) + arg10;
                    var15 = (var13 >> 1) + arg10;
                }
                int var17;
                int var18;
                if (~(arg5 + var14) < ~super.field6376) {
                    var17 = arg5 - -1;
                    var18 = arg5;
                } else {
                    var18 = (var14 >> 1) + arg5;
                    var17 = (var14 - -1 >> 1) + arg5;
                }
                class137 var19 = class628.field8912[arg1];
                int var20 = var19.method253(var15, var18) + var19.method253(var16, var18) - -var19.method253(var15, var17) - -var19.method253(var16, var17) >> 2;
                int var21 = (arg10 << 9) - -(var13 << 8);
                int var22 = (arg5 << 9) + (var14 << 8);
                boolean var23 = class397.field5319 && !super.field6377 && var12.field4385;
                if (var12.method1896(-10086)) {
                    class67.method441(arg9, arg5, var12, -74, arg10, arg3, (class455) null, (class625) null);
                }
                boolean var24 = arg7 == -1 && ~var12.field4399 == 0 && var12.field4401 == null && var12.field4342 == null && !var12.field4386;
                if (!class544.field7795 || (!class488.method2823(arg6, -87) || var12.field4365 == 1) && (!class565.method3194(-115, arg6) || ~var12.field4365 != -1)) {
                    if (~arg6 == -23) {
                        if (class601.field8530.field2839 || ~var12.field4407 != -1 || var12.field4383 == 1 || var12.field4344) {
                            class344 var25;
                            if (!var24) {
                                var25 = new class164(arg8, var12, arg3, arg1, var21, var20, var22, super.field6377, arg9, arg7);
                            } else {
                                class214 var26 = new class214(arg8, var12, arg1, var21, var20, var22, super.field6377, arg9, var23);
                                if (var26.method454(123)) {
                                    var26.method456(arg8, 119);
                                }
                                var25 = var26;
                            }
                            class344 var27 = class606.method3380(arg3, arg10, arg5);
                            if (var27 instanceof class68) {
                                ((class68) var27).field736 = var25;
                            } else {
                                class557.method3153(arg3, arg10, arg5, var25);
                            }
                            if (var12.field4383 == 1 && arg2 != null) {
                                arg2.method1570(arg5, 262144, arg10);
                            }
                        }
                    } else if (!arg0) {
                        if (arg6 != 10 && arg6 != 11) {
                            if (~arg6 <= -13 && ~arg6 >= -18 || ~arg6 <= -19 && ~arg6 >= -22) {
                                class354 var29;
                                if (var24) {
                                    class520 var28 = new class520(arg8, var12, arg3, arg1, var21, var20, var22, super.field6377, arg10, arg10 + var13 + -1, arg5, arg5 - (-var14 + 1), arg6, arg9, var23);
                                    var29 = var28;
                                    if (var28.method454(113)) {
                                        var28.method456(arg8, 114);
                                    }
                                } else {
                                    var29 = new class173(arg8, var12, arg3, arg1, var21, var20, var22, super.field6377, arg10, arg10 + var13 + -1, arg5, arg5 + var14 + -1, arg6, arg9, arg7);
                                }
                                class354 var30 = class396.method2163(arg3, arg10, arg5, field5592 != null ? field5592 : (field5592 = method2279("ql")));
                                if (var30 instanceof class557 && var30.field4642 == arg10 && ~var30.field4648 == ~arg5) {
                                    ((class557) var30).field7955 = var29;
                                } else {
                                    class223.method1309(var29, false);
                                }
                                if (class397.field5319 && !super.field6377 && ~arg6 <= -13 && arg6 <= 17 && arg6 != 13 && arg3 > 0 && var12.field4365 != 0) {
                                    super.field6359[arg3][arg10][arg5] = (byte) class139.method776(super.field6359[arg3][arg10][arg5], 4);
                                }
                                if (~var12.field4383 != -1 && arg2 != null) {
                                    arg2.method1578(var12.field4398, arg10, var13, arg5, true, var14, !var12.field4335);
                                }
                            } else if (~arg6 == -1) {
                                int var31 = var12.field4365;
                                if (class473.field6611 && ~var12.field4365 == 0) {
                                    var31 = 1;
                                }
                                class244 var32;
                                if (!var24) {
                                    var32 = new class113(arg8, var12, arg3, arg1, var21, var20, var22, super.field6377, arg6, arg9, arg7);
                                } else {
                                    class610 var33 = new class610(arg8, var12, arg1, var21, var20, var22, super.field6377, arg6, arg9, var23);
                                    if (var33.method454(74)) {
                                        var33.method456(arg8, 122);
                                    }
                                    var32 = var33;
                                }
                                class244 var34 = class480.method2801(arg3, arg10, arg5);
                                if (var34 instanceof class107) {
                                    ((class107) var34).field1243 = var32;
                                } else {
                                    class303.method1717(arg3, arg10, arg5, var32, (class244) null);
                                }
                                if (class397.field5319) {
                                    if (arg9 != 0) {
                                        if (arg9 != 1) {
                                            if (arg9 == 2) {
                                                if (var12.field4363) {
                                                    var19.method243(arg10 + 1, arg5, 50);
                                                    var19.method243(arg10 - -1, arg5 + 1, 50);
                                                }
                                                if (~var31 == -2 && !super.field6377) {
                                                    super.field6359[arg3][arg10 + 1][arg5] = (byte) class139.method776(super.field6359[arg3][arg10 + 1][arg5], 1);
                                                }
                                            } else if (arg9 == 3) {
                                                if (var12.field4363) {
                                                    var19.method243(arg10, arg5, 50);
                                                    var19.method243(arg10 + 1, arg5, 50);
                                                }
                                                if (var31 == 1 && !super.field6377) {
                                                    super.field6359[arg3][arg10][arg5] = (byte) class139.method776(super.field6359[arg3][arg10][arg5], 2);
                                                }
                                            }
                                        } else {
                                            if (var12.field4363) {
                                                var19.method243(arg10, arg5 - -1, 50);
                                                var19.method243(arg10 + 1, arg5 - -1, 50);
                                            }
                                            if (~var31 == -2 && !super.field6377) {
                                                super.field6359[arg3][arg10][arg5 + 1] = (byte) class139.method776(super.field6359[arg3][arg10][arg5 + 1], 2);
                                            }
                                        }
                                    } else {
                                        if (var12.field4363) {
                                            var19.method243(arg10, arg5, 50);
                                            var19.method243(arg10, arg5 + 1, 50);
                                        }
                                        if (~var31 == -2 && !super.field6377) {
                                            super.field6359[arg3][arg10][arg5] = (byte) class139.method776(super.field6359[arg3][arg10][arg5], 1);
                                        }
                                    }
                                }
                                if (~var12.field4383 != -1 && arg2 != null) {
                                    arg2.method1566(arg10, arg9, !var12.field4335, arg5, -120, var12.field4398, arg6);
                                }
                                if (~var12.field4333 != -65) {
                                    class9.method43(arg3, arg10, arg5, var12.field4333);
                                }
                            } else if (~arg6 == -2) {
                                class244 var36;
                                if (var24) {
                                    class610 var35 = new class610(arg8, var12, arg1, var21, var20, var22, super.field6377, arg6, arg9, var23);
                                    if (var35.method454(112)) {
                                        var35.method456(arg8, 118);
                                    }
                                    var36 = var35;
                                } else {
                                    var36 = new class113(arg8, var12, arg3, arg1, var21, var20, var22, super.field6377, arg6, arg9, arg7);
                                }
                                class244 var37 = class480.method2801(arg3, arg10, arg5);
                                if (!(var37 instanceof class107)) {
                                    class303.method1717(arg3, arg10, arg5, var36, (class244) null);
                                } else {
                                    ((class107) var37).field1243 = var36;
                                }
                                if (var12.field4363 && class397.field5319) {
                                    if (arg9 == 0) {
                                        var19.method243(arg10, arg5 + 1, 50);
                                    } else if (arg9 == 1) {
                                        var19.method243(arg10 - -1, arg5 - -1, 50);
                                    } else if (~arg9 == -3) {
                                        var19.method243(arg10 + 1, arg5, 50);
                                    } else if (~arg9 == -4) {
                                        var19.method243(arg10, arg5, 50);
                                    }
                                }
                                if (~var12.field4383 != -1 && arg2 != null) {
                                    arg2.method1566(arg10, arg9, !var12.field4335, arg5, -126, var12.field4398, arg6);
                                }
                            } else if (~arg6 == -3) {
                                int var38 = 3 & arg9 + 1;
                                class244 var39;
                                class244 var40;
                                if (!var24) {
                                    var39 = new class113(arg8, var12, arg3, arg1, var21, var20, var22, super.field6377, arg6, arg9 + 4, arg7);
                                    var40 = new class113(arg8, var12, arg3, arg1, var21, var20, var22, super.field6377, arg6, var38, arg7);
                                } else {
                                    class610 var41 = new class610(arg8, var12, arg1, var21, var20, var22, super.field6377, arg6, arg9 - -4, var23);
                                    class610 var42 = new class610(arg8, var12, arg1, var21, var20, var22, super.field6377, arg6, var38, var23);
                                    if (var41.method454(50)) {
                                        var41.method456(arg8, 102);
                                    }
                                    var40 = var42;
                                    if (var42.method454(62)) {
                                        var42.method456(arg8, 117);
                                    }
                                    var39 = var41;
                                }
                                class303.method1717(arg3, arg10, arg5, var39, var40);
                                if (~var12.field4365 == -2 && class397.field5319 && !super.field6377) {
                                    if (arg9 == 0) {
                                        super.field6359[arg3][arg10][arg5] = (byte) class139.method776(super.field6359[arg3][arg10][arg5], 1);
                                        super.field6359[arg3][arg10][arg5 + 1] = (byte) class139.method776(super.field6359[arg3][arg10][arg5 + 1], 2);
                                    } else if (~arg9 == -2) {
                                        super.field6359[arg3][arg10][arg5 + 1] = (byte) class139.method776(super.field6359[arg3][arg10][arg5 + 1], 2);
                                        super.field6359[arg3][arg10 + 1][arg5] = (byte) class139.method776(super.field6359[arg3][arg10 + 1][arg5], 1);
                                    } else if (arg9 == 2) {
                                        super.field6359[arg3][arg10 + 1][arg5] = (byte) class139.method776(super.field6359[arg3][arg10 + 1][arg5], 1);
                                        super.field6359[arg3][arg10][arg5] = (byte) class139.method776(super.field6359[arg3][arg10][arg5], 2);
                                    } else if (~arg9 == -4) {
                                        super.field6359[arg3][arg10][arg5] = (byte) class139.method776(super.field6359[arg3][arg10][arg5], 2);
                                        super.field6359[arg3][arg10][arg5] = (byte) class139.method776(super.field6359[arg3][arg10][arg5], 1);
                                    }
                                }
                                if (var12.field4383 != 0 && arg2 != null) {
                                    arg2.method1566(arg10, arg9, !var12.field4335, arg5, -128, var12.field4398, arg6);
                                }
                                if (~var12.field4333 != -65) {
                                    class9.method43(arg3, arg10, arg5, var12.field4333);
                                }
                            } else if (arg6 == 3) {
                                class244 var43;
                                if (!var24) {
                                    var43 = new class113(arg8, var12, arg3, arg1, var21, var20, var22, super.field6377, arg6, arg9, arg7);
                                } else {
                                    class610 var44 = new class610(arg8, var12, arg1, var21, var20, var22, super.field6377, arg6, arg9, var23);
                                    if (var44.method454(101)) {
                                        var44.method456(arg8, 100);
                                    }
                                    var43 = var44;
                                }
                                class244 var45 = class480.method2801(arg3, arg10, arg5);
                                if (var45 instanceof class107) {
                                    ((class107) var45).field1243 = var43;
                                } else {
                                    class303.method1717(arg3, arg10, arg5, var43, (class244) null);
                                }
                                if (var12.field4363 && class397.field5319) {
                                    if (~arg9 != -1) {
                                        if (~arg9 == -2) {
                                            var19.method243(arg10 + 1, arg5 + 1, 50);
                                        } else if (~arg9 != -3) {
                                            if (~arg9 == -4) {
                                                var19.method243(arg10, arg5, 50);
                                            }
                                        } else {
                                            var19.method243(arg10 + 1, arg5, 50);
                                        }
                                    } else {
                                        var19.method243(arg10, arg5 + 1, 50);
                                    }
                                }
                                if (~var12.field4383 != -1 && arg2 != null) {
                                    arg2.method1566(arg10, arg9, !var12.field4335, arg5, -101, var12.field4398, arg6);
                                }
                            } else if (arg6 == 9) {
                                class354 var46;
                                if (!var24) {
                                    var46 = new class173(arg8, var12, arg3, arg1, var21, var20, var22, super.field6377, arg10, arg10 + var13 + -1, arg5, var14 + -1 + arg5, arg6, arg9, arg7);
                                } else {
                                    class520 var47 = new class520(arg8, var12, arg3, arg1, var21, var20, var22, super.field6377, arg10, arg10, arg5, arg5, arg6, arg9, var23);
                                    if (var47.method454(71)) {
                                        var47.method456(arg8, 103);
                                    }
                                    var46 = var47;
                                }
                                class354 var48 = class396.method2163(arg3, arg10, arg5, field5592 != null ? field5592 : (field5592 = method2279("ql")));
                                if (var48 instanceof class557 && var48.field4642 == arg10 && var48.field4648 == arg5) {
                                    ((class557) var48).field7955 = var46;
                                } else {
                                    class223.method1309(var46, false);
                                }
                                if (~var12.field4383 != -1 && arg2 != null) {
                                    arg2.method1578(var12.field4398, arg10, var13, arg5, true, var14, !var12.field4335);
                                }
                                if (var12.field4333 != 64) {
                                    class9.method43(arg3, arg10, arg5, var12.field4333);
                                }
                            } else if (~arg6 == -5) {
                                class599 var50;
                                if (var24) {
                                    class345 var49 = new class345(arg8, var12, arg1, var21, var20, var22, super.field6377, 0, 0, 0, arg6, arg9);
                                    var50 = var49;
                                    if (var49.method454(52)) {
                                        var49.method456(arg8, 124);
                                    }
                                } else {
                                    var50 = new class591(arg8, var12, arg3, arg1, var21, var20, var22, super.field6377, 0, 0, 0, arg6, arg9, arg7);
                                }
                                class599 var51 = class248.method1430(arg3, arg10, arg5);
                                if (!(var51 instanceof class567)) {
                                    class308.method1756(arg3, arg10, arg5, var50, (class599) null);
                                } else {
                                    ((class567) var51).field8037 = var50;
                                }
                            } else if (arg6 == 5) {
                                int var52 = 65;
                                class670 var53 = (class670) class480.method2801(arg3, arg10, arg5);
                                if (var53 != null) {
                                    var52 = 1 + class195.field2339.method3729(var53.method444((byte) -117), (byte) 109).field4333;
                                }
                                class599 var54;
                                if (!var24) {
                                    var54 = new class591(arg8, var12, arg3, arg1, var21, var20, var22, super.field6377, 0, class147.field1645[arg9] * var52, class555.field7908[arg9] * var52, arg6, arg9, arg7);
                                } else {
                                    class345 var55 = new class345(arg8, var12, arg1, var21, var20, var22, super.field6377, 0, class147.field1645[arg9] * var52, class555.field7908[arg9] * var52, arg6, arg9);
                                    if (var55.method454(100)) {
                                        var55.method456(arg8, 104);
                                    }
                                    var54 = var55;
                                }
                                class599 var56 = class248.method1430(arg3, arg10, arg5);
                                if (!(var56 instanceof class567)) {
                                    class308.method1756(arg3, arg10, arg5, var54, (class599) null);
                                } else {
                                    ((class567) var56).field8037 = var54;
                                }
                            } else if (arg6 == 6) {
                                int var57 = 33;
                                class670 var58 = (class670) class480.method2801(arg3, arg10, arg5);
                                if (var58 != null) {
                                    var57 = 1 + class195.field2339.method3729(var58.method444((byte) -49), (byte) 109).field4333 / 2;
                                }
                                class599 var60;
                                if (var24) {
                                    class345 var59 = new class345(arg8, var12, arg1, var21, var20, var22, super.field6377, arg9, class147.field1645[arg9] * var57, class555.field7908[arg9] * var57, arg6, arg9 + 4);
                                    if (var59.method454(120)) {
                                        var59.method456(arg8, 119);
                                    }
                                    var60 = var59;
                                } else {
                                    var60 = new class591(arg8, var12, arg3, arg1, var21, var20, var22, super.field6377, arg9, class308.field4002[arg9] * var57, class370.field4814[arg9] * var57, arg6, arg9 + 4, arg7);
                                }
                                class599 var61 = class248.method1430(arg3, arg10, arg5);
                                if (var61 instanceof class567) {
                                    ((class567) var61).field8037 = var60;
                                } else {
                                    class308.method1756(arg3, arg10, arg5, var60, (class599) null);
                                }
                            } else if (arg6 == 7) {
                                int var62 = 3 & arg9 + 2;
                                class599 var64;
                                if (var24) {
                                    class345 var63 = new class345(arg8, var12, arg1, var21, var20, var22, super.field6377, var62, 0, 0, arg6, var62 + 4);
                                    if (var63.method454(50)) {
                                        var63.method456(arg8, 103);
                                    }
                                    var64 = var63;
                                } else {
                                    var64 = new class591(arg8, var12, arg3, arg1, var21, var20, var22, super.field6377, var62, 0, 0, arg6, var62 + 4, arg7);
                                }
                                class599 var65 = class248.method1430(arg3, arg10, arg5);
                                if (var65 instanceof class567) {
                                    ((class567) var65).field8037 = var64;
                                } else {
                                    class308.method1756(arg3, arg10, arg5, var64, (class599) null);
                                }
                            } else if (arg6 == 8) {
                                int var66 = 3 & arg9 + 2;
                                int var67 = 33;
                                class670 var68 = (class670) class480.method2801(arg3, arg10, arg5);
                                if (var68 != null) {
                                    var67 = 1 + class195.field2339.method3729(var68.method444((byte) -100), (byte) 109).field4333 / 2;
                                }
                                class599 var71;
                                class599 var72;
                                if (var24) {
                                    class345 var69 = new class345(arg8, var12, arg1, var21, var20, var22, super.field6377, arg9, class308.field4002[arg9] * var67, class370.field4814[arg9] * var67, arg6, arg9 + 4);
                                    class345 var70 = new class345(arg8, var12, arg1, var21, var20, var22, super.field6377, arg9, 0, 0, arg6, var66 - -4);
                                    if (var69.method454(51)) {
                                        var69.method456(arg8, 106);
                                    }
                                    if (var70.method454(74)) {
                                        var70.method456(arg8, 104);
                                    }
                                    var71 = var70;
                                    var72 = var69;
                                } else {
                                    class591 var73 = new class591(arg8, var12, arg3, arg1, var21, var20, var22, super.field6377, arg9, class308.field4002[arg9] * var67, class370.field4814[arg9] * var67, arg6, arg9 - -4, arg7);
                                    class591 var74 = new class591(arg8, var12, arg3, arg1, var21, var20, var22, super.field6377, arg9, 0, 0, arg6, var66 - -4, arg7);
                                    var72 = var73;
                                    var71 = var74;
                                }
                                class308.method1756(arg3, arg10, arg5, var72, var71);
                            }
                        } else {
                            class520 var75 = null;
                            class354 var77;
                            int var78;
                            if (var24) {
                                class520 var76 = new class520(arg8, var12, arg3, arg1, var21, var20, var22, super.field6377, arg10, var13 + -1 + arg10, arg5, arg5 - -var14 + -1, arg6, arg9, var23);
                                var77 = var76;
                                var75 = var76;
                                var78 = var76.method2963(2048);
                            } else {
                                var77 = new class173(arg8, var12, arg3, arg1, var21, var20, var22, super.field6377, arg10, var13 + -1 + arg10, arg5, arg5 + var14 + -1, arg6, arg9, arg7);
                                var78 = 15;
                            }
                            class354 var79 = class396.method2163(arg3, arg10, arg5, field5592 != null ? field5592 : (field5592 = method2279("ql")));
                            boolean var80 = false;
                            if (var79 instanceof class557 && ~var79.field4642 == ~arg10 && ~var79.field4648 == ~arg5) {
                                ((class557) var79).field7955 = var77;
                                var80 = true;
                            }
                            if (var80 || class223.method1309(var77, false)) {
                                if (var75 != null && var75.method454(104)) {
                                    var75.method456(arg8, 108);
                                }
                                if (var12.field4363 && class397.field5319) {
                                    if (var78 > 30) {
                                        var78 = 30;
                                    }
                                    for (int var81 = 0; var13 >= var81; ++var81) {
                                        for (int var82 = 0; ~var82 >= ~var14; ++var82) {
                                            var19.method243(arg10 - -var81, arg5 - -var82, var78);
                                        }
                                    }
                                }
                            }
                            if (~var12.field4383 != -1 && arg2 != null) {
                                arg2.method1578(var12.field4398, arg10, var13, arg5, !arg0, var14, !var12.field4335);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "([IILoa;ILiaa;IIIIII)V", line = 1175)
    public final void method2274(int[] arg0, int arg1, class635 arg2, int arg3, class452 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = 90 % ((41 - arg8) / 56);
        ++field5580;
        if (!super.field6377) {
            boolean var13 = false;
            class515 var14 = null;
            if (arg0 != null) {
                arg0[0] = -1;
            }
            int var15 = (arg3 & 7) * 8;
            int var16 = (7 & arg7) * 8;
            while (true) {
                while (arg4.field6215 < arg4.field6209.length) {
                    int var21 = arg4.method2541(87);
                    if (var21 == 0) {
                        var14 = new class515(arg4);
                    } else if (~var21 == -2) {
                        int var35 = arg4.method2541(41);
                        if (~var35 < -1) {
                            for (int var36 = 0; var35 > var36; ++var36) {
                                class247 var37 = new class247(arg2, arg4, 2);
                                if (var37.field3190 == 31) {
                                    class656 var38 = class168.field2010.method1077((byte) -85, arg4.method2574(-1758460248));
                                    var37.method1426(-2009810229, var38.field9369, var38.field9363, var38.field9360, var38.field9361);
                                }
                                if (~arg2.method352() < -1) {
                                    class463 var39 = var37.field3189;
                                    int var40 = var39.method2640(-2049) >> 9;
                                    int var41 = var39.method2641((byte) -14) >> 9;
                                    if (var37.field3188 == arg5 && ~var15 >= ~var40 && var40 < var15 + 8 && ~var41 <= ~var16 && var41 < var16 + 8) {
                                        int var42 = (arg9 << 9) + class626.method3515(4095 & var39.method2640(-2049), 4095 & var39.method2641((byte) -14), arg10, -101);
                                        int var43 = var42 >> 9;
                                        int var44 = class162.method983(var39.method2640(-2049) & 4095, arg10, (byte) -67, 4095 & var39.method2641((byte) -14)) + (arg1 << 9);
                                        int var45 = var44 >> 9;
                                        if (~var43 <= -1 && ~var45 <= -1 && var43 < super.field6351 && super.field6376 > var45) {
                                            var39.method2509(-103, var42, super.field6375[arg5][var43][var45] + -var39.method2638((byte) -70), var44);
                                            class387.method2119(var37);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var21 == 2) {
                        if (var14 == null) {
                            var14 = new class515();
                        }
                        var14.method2945(arg4, 12);
                    } else if (var21 == 128) {
                        if (arg0 != null) {
                            arg0[0] = arg4.method2574(-1758460248);
                            arg0[1] = arg4.method2549((byte) 32);
                            arg0[2] = arg4.method2549((byte) 32);
                            arg0[3] = arg4.method2549((byte) 32);
                            arg0[4] = arg4.method2574(-1758460248);
                        } else {
                            arg4.field6215 += 10;
                        }
                    } else {
                        if (var21 != 129) {
                            throw new IllegalStateException("");
                        }
                        if (super.field6360 == null) {
                            super.field6360 = new byte[4][][];
                        }
                        for (int var22 = 0; var22 < 4; ++var22) {
                            byte var23 = arg4.method2547(true);
                            if (~var23 == -1 && super.field6360[arg6] != null) {
                                if (var22 <= arg5) {
                                    int var24 = arg9;
                                    int var25 = arg9 + 7;
                                    int var26 = arg1;
                                    int var27 = arg1 - -7;
                                    if (var25 >= 0) {
                                        if (~super.field6351 >= ~var25) {
                                            var25 = super.field6351;
                                        }
                                    } else {
                                        var25 = 0;
                                    }
                                    if (arg1 >= 0) {
                                        if (~arg1 <= ~super.field6376) {
                                            var26 = super.field6376;
                                        }
                                    } else {
                                        var26 = 0;
                                    }
                                    if (arg9 >= 0) {
                                        if (super.field6351 <= arg9) {
                                            var24 = super.field6351;
                                        }
                                    } else {
                                        var24 = 0;
                                    }
                                    if (var27 < 0) {
                                        var27 = 0;
                                    } else if (~super.field6376 >= ~var27) {
                                        var27 = super.field6376;
                                    }
                                    while (~var24 > ~var25) {
                                        while (~var27 < ~var26) {
                                            super.field6360[arg6][var24][var26] = 0;
                                            ++var26;
                                        }
                                        ++var24;
                                    }
                                }
                            } else if (~var23 == -2) {
                                if (super.field6360[arg6] == null) {
                                    super.field6360[arg6] = new byte[super.field6351 + 1][super.field6376 - -1];
                                }
                                for (int var28 = 0; var28 < 64; var28 += 4) {
                                    for (int var29 = 0; var29 < 64; var29 += 4) {
                                        byte var30 = arg4.method2547(true);
                                        if (var22 <= arg5) {
                                            for (int var31 = var28; ~var31 > ~(var28 + 4); ++var31) {
                                                for (int var32 = var29; var32 < var29 + 4; ++var32) {
                                                    if (var15 <= var31 && var15 + 8 > var31 && ~var16 >= ~var32 && var16 < var16 + 8) {
                                                        int var33 = class511.method2930(arg10, var32 & 7, -31746, 7 & var31) + arg9;
                                                        int var34 = class634.method3546(var31 & 7, arg10, (byte) 68, var32 & 7) + arg1;
                                                        if (~var33 <= -1 && ~var33 > ~super.field6351 && var34 >= 0 && var34 < super.field6376) {
                                                            super.field6360[arg6][var33][var34] = var30;
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
                if (var14 != null) {
                    class223.method1307(arg1 >> 3, 0, arg9 >> 3, var14);
                }
                if (!var13 && super.field6360 != null && super.field6360[arg6] != null) {
                    int var17 = arg9 + 7;
                    int var18 = arg1 - -7;
                    for (int var19 = arg9; var17 > var19; ++var19) {
                        for (int var20 = arg1; ~var18 < ~var20; ++var20) {
                            super.field6360[arg6][var19][var20] = 0;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Loa;I)V", line = 1465)
    public final void method2275(class635 arg0, int arg1) {
        ++field5584;
        if (arg1 != -4267) {
            this.method2270((class452) null, (class635) null, -75, -128, (int[]) null, -108);
        }
        class552.method3110(arg0);
        if (~super.field6373 < -2) {
            for (int var3 = 0; super.field6351 > var3; ++var3) {
                for (int var4 = 0; super.field6376 > var4; ++var4) {
                    if (~(2 & class379.field4922[1][var3][var4]) == -3) {
                        class484.method2810(var3, var4);
                    }
                }
            }
        }
        for (int var5 = 0; ~var5 > ~super.field6373; ++var5) {
            for (int var6 = 0; var6 <= super.field6376; ++var6) {
                for (int var7 = 0; super.field6351 >= var7; ++var7) {
                    if (~(super.field6359[var5][var7][var6] & 1) != -1) {
                        int var8 = var6;
                        int var9 = var6;
                        int var10 = var5;
                        int var11 = var5;
                        while (super.field6376 > var9 && ~(super.field6359[var5][var7][var9 - -1] & 1) != -1) {
                            ++var9;
                        }
                        while (~var8 < -1 && ~(1 & super.field6359[var5][var7][var8 - 1]) != -1) {
                            --var8;
                        }
                        label169: while (var10 > 0) {
                            for (int var12 = var8; var9 >= var12; ++var12) {
                                if (~(1 & super.field6359[var10 + -1][var7][var12]) == -1) {
                                    break label169;
                                }
                            }
                            --var10;
                        }
                        label158: while (var11 < 3) {
                            for (int var13 = var8; ~var13 >= ~var9; ++var13) {
                                if ((super.field6359[var11 + 1][var7][var13] & 1) == 0) {
                                    break label158;
                                }
                            }
                            ++var11;
                        }
                        int var14 = (-var10 + var11 - -1) * (var9 - -1 + -var8);
                        if (var14 >= 2) {
                            short var15 = 960;
                            int var16 = super.field6375[var11][var7][var8] + -var15;
                            int var17 = super.field6375[var10][var7][var8];
                            class398.method2180(1, var7 << 9, var7 << 9, var8 << 9, (var9 << 9) + 512, var16, var17);
                            for (int var18 = var10; ~var11 <= ~var18; ++var18) {
                                for (int var19 = var8; ~var19 >= ~var9; ++var19) {
                                    super.field6359[var18][var7][var19] = (byte) class203.method1246(super.field6359[var18][var7][var19], -2);
                                }
                            }
                        }
                    }
                    if (~(2 & super.field6359[var5][var7][var6]) != -1) {
                        int var20 = var7;
                        int var21 = var7;
                        int var22 = var5;
                        while (var21 < super.field6351 && ~(super.field6359[var5][var21 - -1][var6] & 2) != -1) {
                            ++var21;
                        }
                        int var23 = var5;
                        while (~var20 < -1 && (2 & super.field6359[var5][var20 + -1][var6]) != 0) {
                            --var20;
                        }
                        label222: while (var22 > 0) {
                            for (int var24 = var20; var24 <= var21; ++var24) {
                                if (~(2 & super.field6359[var22 + -1][var24][var6]) == -1) {
                                    break label222;
                                }
                            }
                            --var22;
                        }
                        label211: while (~var23 > -4) {
                            for (int var25 = var20; var21 >= var25; ++var25) {
                                if (~(2 & super.field6359[var23 + 1][var25][var6]) == -1) {
                                    break label211;
                                }
                            }
                            ++var23;
                        }
                        int var26 = (var23 + 1 - var22) * (-var20 + var21 + 1);
                        if (~var26 <= -3) {
                            short var27 = 960;
                            int var28 = super.field6375[var23][var20][var6] - var27;
                            int var29 = super.field6375[var22][var20][var6];
                            class398.method2180(2, var20 << 9, (var21 << 9) + 512, var6 << 9, var6 << 9, var28, var29);
                            for (int var30 = var22; var23 >= var30; ++var30) {
                                for (int var31 = var20; var21 >= var31; ++var31) {
                                    super.field6359[var30][var31][var6] = (byte) class203.method1246(super.field6359[var30][var31][var6], -3);
                                }
                            }
                        }
                    }
                    if (~(4 & super.field6359[var5][var7][var6]) != -1) {
                        int var32 = var7;
                        int var33 = var7;
                        int var34 = var6;
                        int var35 = var6;
                        while (var34 > 0 && ~(super.field6359[var5][var7][var34 + -1] & 4) != -1) {
                            --var34;
                        }
                        while (~var35 > ~super.field6376 && ~(super.field6359[var5][var7][var35 + 1] & 4) != -1) {
                            ++var35;
                        }
                        label276: while (~var32 < -1) {
                            for (int var36 = var34; ~var35 <= ~var36; ++var36) {
                                if (~(4 & super.field6359[var5][var32 + -1][var36]) == -1) {
                                    break label276;
                                }
                            }
                            --var32;
                        }
                        label265: while (~super.field6351 < ~var33) {
                            for (int var37 = var34; ~var35 <= ~var37; ++var37) {
                                if (~(4 & super.field6359[var5][var33 - -1][var37]) == -1) {
                                    break label265;
                                }
                            }
                            ++var33;
                        }
                        if ((var33 - var32 - -1) * (var35 + 1 - var34) >= 4) {
                            int var38 = super.field6375[var5][var32][var34];
                            class398.method2180(4, var32 << 9, (var33 << 9) - -512, var34 << 9, (var35 << 9) - -512, var38, var38);
                            for (int var39 = var32; ~var33 <= ~var39; ++var39) {
                                for (int var40 = var34; ~var40 >= ~var35; ++var40) {
                                    super.field6359[var5][var39][var40] = (byte) class203.method1246(super.field6359[var5][var39][var40], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
        super.field6359 = null;
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(IIIZ)V", line = 1755)
    public class420(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class166.field2002, class649.field9287);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILoa;[B[Lle;II)V", line = 1758)
    public final void method2276(int arg0, class635 arg1, byte[] arg2, class277[] arg3, int arg4, int arg5) {
        ++field5588;
        class452 var7 = new class452(arg2);
        int var8 = arg4;
        while (true) {
            int var9 = var7.method2522(arg4 + 54);
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method2548(-29696);
                if (var11 == 0) {
                    break;
                }
                var10 += var11 + -1;
                int var12 = 63 & var10;
                int var13 = var10 >> 6 & 63;
                int var14 = var10 >> 12;
                int var15 = var7.method2541(93);
                int var16 = var15 >> 2;
                int var17 = 3 & var15;
                int var18 = arg0 + var13;
                int var19 = var12 - -arg5;
                if (~var18 < -1 && var19 > 0 && super.field6351 + -1 > var18 && ~var19 > ~(super.field6376 - 1)) {
                    class277 var20 = null;
                    if (!super.field6377) {
                        int var21 = var14;
                        if ((class379.field4922[1][var18][var19] & 2) == 2) {
                            var21 = var14 - 1;
                        }
                        if (~var21 <= -1) {
                            var20 = arg3[var21];
                        }
                    }
                    this.method2273(false, var14, var20, var14, var8, var19, var16, -1, arg1, var17, var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILle;IILoa;II)V", line = 1837)
    public final void method2277(int arg0, class277 arg1, int arg2, int arg3, class635 arg4, int arg5, int arg6) {
        ++field5585;
        class670 var8 = null;
        if (~arg0 == arg3) {
            var8 = (class670) class480.method2801(arg5, arg2, arg6);
        }
        if (~arg0 == -2) {
            var8 = (class670) class248.method1430(arg5, arg2, arg6);
        }
        if (arg0 == 2) {
            var8 = (class670) class396.method2163(arg5, arg2, arg6, field5592 != null ? field5592 : (field5592 = method2279("ql")));
        }
        if (arg0 == 3) {
            var8 = (class670) class606.method3380(arg5, arg2, arg6);
        }
        if (var8 != null) {
            class335 var9 = class195.field2339.method3729(var8.method444((byte) -86), (byte) 109);
            int var10 = var8.method447((byte) -91);
            int var11 = var8.method443((byte) -127);
            if (var9.method1896(-10086)) {
                class63.method424((byte) -110, arg5, arg6, arg2, var9);
            }
            if (var8.method454(arg3 ^ -118)) {
                var8.method446(arg4, (byte) -128);
            }
            if (~arg0 != -1) {
                if (arg0 == 1) {
                    class599 var12 = class248.method1430(arg5, arg2, arg6);
                    if (var12 instanceof class567) {
                        ((class567) var12).field8037 = null;
                        return;
                    }
                    class605.method3375(arg5, arg2, arg6);
                    return;
                }
                if (~arg0 != -3) {
                    if (~arg0 == -4) {
                        class344 var13 = class606.method3380(arg5, arg2, arg6);
                        if (var13 instanceof class68) {
                            ((class68) var13).field736 = null;
                        } else {
                            class39.method203(arg5, arg2, arg6);
                        }
                        if (var9.field4383 == 1) {
                            arg1.method1579(arg2, arg6, (byte) -57);
                            return;
                        }
                    }
                    return;
                }
                class354 var14 = class396.method2163(arg5, arg2, arg6, field5592 != null ? field5592 : (field5592 = method2279("ql")));
                if (var14 instanceof class557 && var14.field4642 == arg2 && var14.field4648 == arg6) {
                    ((class557) var14).field7955 = null;
                } else {
                    class634.method3545(arg5, arg2, arg6, field5592 != null ? field5592 : (field5592 = method2279("ql")));
                }
                if (~var9.field4383 != -1 && ~(arg2 - -var9.field4410) > ~super.field6351 && ~super.field6376 < ~(var9.field4410 + arg6) && var9.field4322 + arg2 < super.field6351 && ~super.field6376 < ~(var9.field4322 + arg6)) {
                    arg1.method1577(!var9.field4335, var11, arg2, var9.field4398, var9.field4322, arg6, 1, var9.field4410);
                    return;
                }
                return;
            }
            class244 var15 = class480.method2801(arg5, arg2, arg6);
            if (var15 instanceof class107) {
                ((class107) var15).field1243 = null;
            } else {
                class221.method1294(arg5, arg2, arg6);
            }
            if (var9.field4383 != 0) {
                arg1.method1569(var11, 102, arg6, var9.field4398, arg2, var10, !var9.field4335);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "(I)V", line = 1951)
    public static final void method2278(int arg0) {
        ++field5586;
        if (class477.field6938) {
            if (arg0 != 5580) {
                field5581 = -123;
            }
            class382 var1 = class657.method3708(class292.field3767, (byte) -112, class411.field5451);
            if (var1 != null && var1.field5053 != null) {
                class676 var2 = new class676();
                var2.field9580 = var1.field5053;
                var2.field9585 = var1;
                class364.method1998(var2);
            }
            class477.field6938 = false;
            field5591 = -1;
            class378.field4915 = -1;
            if (var1 != null) {
                class567.method3207((byte) -69, var1);
            }
        }
    }
}
