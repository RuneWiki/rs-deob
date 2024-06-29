import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class166 extends class306 {

    @OriginalMember(owner = "client!wq", name = "P", descriptor = "I")
    public int field2455 = 99;

    @OriginalMember(owner = "client!wq", name = "F", descriptor = "Ljava/lang/String;")
    public static String field2445;

    @OriginalMember(owner = "client!wq", name = "K", descriptor = "Ljava/lang/String;")
    public static String field2450;

    @OriginalMember(owner = "client!wq", name = "O", descriptor = "Lnga;")
    public static class510 field2454;

    @OriginalMember(owner = "client!wq", name = "D", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!wq", name = "E", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!wq", name = "G", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!wq", name = "H", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!wq", name = "I", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!wq", name = "J", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!wq", name = "L", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!wq", name = "M", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!wq", name = "N", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!wq", name = "Q", descriptor = "I")
    public static int field2456;

    // $FF: synthetic field
    @OriginalMember(owner = "client!wq", name = "R", descriptor = "Ljava/lang/Class;")
    public static Class field2457;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IILbb;II)V")
    public static final void method1229(int arg0, int arg1, class332 arg2, int arg3, int arg4) {
        ++field2452;
        long var5 = (long) (arg1 << 14 | arg0 << 28 | arg3);
        class694 var7 = (class694) class136.field2123.method4203(true, var5);
        if (var7 == null) {
            class694 var8 = new class694();
            class136.field2123.method4211(var8, (byte) 63, var5);
            var8.field9759.method1526(arg2, 96);
        } else {
            class253 var9 = class558.field7942.method721(-16, arg2.field4685);
            int var10 = var9.field3643;
            if (~var9.field3623 == arg4) {
                var10 = (arg2.field4683 - -1) * var10;
            }
            for (class332 var11 = (class332) var7.field9759.method1522(true); var11 != null; var11 = (class332) var7.field9759.method1527((byte) 76)) {
                class253 var12 = class558.field7942.method721(arg4 + 129, var11.field4685);
                int var13 = var12.field3643;
                if (~var12.field3623 == -2) {
                    var13 = (var11.field4683 + 1) * var13;
                }
                if (var10 > var13) {
                    class319.method2054(arg2, 28, var11);
                    return;
                }
            }
            var7.field9759.method1526(arg2, 86);
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIIIIIBI)V")
    public static final void method1230(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        ++field2446;
        int var8 = arg3 + -334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (-class488.field6955 + class475.field6800) * var8 / 100 + class488.field6955;
        int var10 = arg7 * var9 >> 8;
        class220.field3129 = class220.field3141 * var9 >> 8;
        int var11 = 16383 & -arg0 + 16384;
        int var12 = -arg2 + 16384 & 16383;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class316.field4487[var11] * -var10 >> 14;
            var15 = class316.field4490[var11] * var10 >> 14;
        }
        if (~var12 != -1) {
            var13 = class316.field4487[var12] * var15 >> 14;
            var15 = class316.field4490[var12] * var15 >> 14;
        }
        if (arg6 > -38) {
            field2454 = null;
        }
        class239.field3371 = arg2;
        class260.field3810 = -var15 + arg4;
        class694.field9754 = arg0;
        class136.field2118 = -var14 + arg5;
        class685.field9660 = -var13 + arg1;
        class717.field10039 = 0;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "([IZILud;Lha;I)V")
    public final void method1231(int[] arg0, boolean arg1, int arg2, class35 arg3, class58 arg4, int arg5) {
        ++field2443;
        if (!super.field4309) {
            boolean var7 = arg1;
            if (arg0 != null) {
                arg0[0] = -1;
            }
            class154 var8 = null;
            while (true) {
                while (true) {
                    while (true) {
                        while (true) {
                            while (arg3.field469 < arg3.field483.length) {
                                int var18 = arg3.method273(255);
                                if (~var18 != -1) {
                                    if (var18 != 1) {
                                        if (var18 != 2) {
                                            if (~var18 == -129) {
                                                if (arg0 == null) {
                                                    arg3.field469 += 10;
                                                } else {
                                                    arg0[0] = arg3.method253(-13900);
                                                    arg0[1] = arg3.method225((byte) 77);
                                                    arg0[2] = arg3.method225((byte) 97);
                                                    arg0[3] = arg3.method225((byte) 90);
                                                    arg0[4] = arg3.method253(-13900);
                                                }
                                            } else {
                                                if (var18 != 129) {
                                                    throw new IllegalStateException("");
                                                }
                                                if (super.field4316 == null) {
                                                    super.field4316 = new byte[4][][];
                                                }
                                                var7 = true;
                                                for (int var19 = 0; var19 < 4; ++var19) {
                                                    byte var20 = arg3.method277((byte) 15);
                                                    if (~var20 == -1 && super.field4316[var19] != null) {
                                                        int var21 = arg2;
                                                        int var22 = arg2 + 64;
                                                        int var23 = arg5;
                                                        if (~arg2 > -1) {
                                                            var21 = 0;
                                                        } else if (~super.field4315 >= ~arg2) {
                                                            var21 = super.field4315;
                                                        }
                                                        if (~var22 <= -1) {
                                                            if (~super.field4315 >= ~var22) {
                                                                var22 = super.field4315;
                                                            }
                                                        } else {
                                                            var22 = 0;
                                                        }
                                                        int var24 = arg5 + 64;
                                                        if (~arg5 > -1) {
                                                            var23 = 0;
                                                        } else if (arg5 >= super.field4318) {
                                                            var23 = super.field4318;
                                                        }
                                                        if (~var24 <= -1) {
                                                            if (~super.field4318 >= ~var24) {
                                                                var24 = super.field4318;
                                                            }
                                                        } else {
                                                            var24 = 0;
                                                        }
                                                        while (~var21 > ~var22) {
                                                            while (~var23 > ~var24) {
                                                                super.field4316[var19][var21][var23] = 0;
                                                                ++var23;
                                                            }
                                                            ++var21;
                                                        }
                                                    } else if (~var20 != -2) {
                                                        if (~var20 == -3) {
                                                            if (super.field4316[var19] == null) {
                                                                super.field4316[var19] = new byte[super.field4315 + 1][super.field4318 + 1];
                                                            }
                                                            if (var19 > 0) {
                                                                int var25 = arg2;
                                                                int var26 = arg2 + 64;
                                                                int var27 = arg5;
                                                                if (arg2 >= 0) {
                                                                    if (arg2 >= super.field4315) {
                                                                        var25 = super.field4315;
                                                                    }
                                                                } else {
                                                                    var25 = 0;
                                                                }
                                                                if (~var26 <= -1) {
                                                                    if (var26 >= super.field4315) {
                                                                        var26 = super.field4315;
                                                                    }
                                                                } else {
                                                                    var26 = 0;
                                                                }
                                                                if (~arg5 <= -1) {
                                                                    if (super.field4318 <= arg5) {
                                                                        var27 = super.field4318;
                                                                    }
                                                                } else {
                                                                    var27 = 0;
                                                                }
                                                                int var28 = arg5 + 64;
                                                                if (var28 < 0) {
                                                                    var28 = 0;
                                                                } else if (var28 >= super.field4318) {
                                                                    var28 = super.field4318;
                                                                }
                                                                while (var26 > var25) {
                                                                    while (~var27 > ~var28) {
                                                                        super.field4316[var19][var25][var27] = super.field4316[var19 + -1][var25][var27];
                                                                        ++var27;
                                                                    }
                                                                    ++var25;
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        if (super.field4316[var19] == null) {
                                                            super.field4316[var19] = new byte[super.field4315 + 1][super.field4318 - -1];
                                                        }
                                                        for (int var29 = 0; var29 < 64; var29 += 4) {
                                                            for (int var30 = 0; ~var30 > -65; var30 += 4) {
                                                                byte var31 = arg3.method277((byte) -120);
                                                                for (int var32 = arg2 + var29; var32 < arg2 + 4 + var29; ++var32) {
                                                                    for (int var33 = arg5 + var30; var33 < var30 + 4 + arg5; ++var33) {
                                                                        if (~var32 <= -1 && var32 < super.field4315 && ~var33 <= -1 && var33 < super.field4318) {
                                                                            super.field4316[var19][var32][var33] = var31;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            if (var8 == null) {
                                                var8 = new class154();
                                            }
                                            var8.method1179(arg3, 8);
                                        }
                                    } else {
                                        int var34 = arg3.method273(255);
                                        if (var34 > 0) {
                                            for (int var35 = 0; var35 < var34; ++var35) {
                                                class122 var36 = new class122(arg4, arg3, 2);
                                                if (var36.field1888 == 31) {
                                                    class317 var37 = class341.field4798.method960((byte) -126, arg3.method253(-13900));
                                                    var36.method972((byte) 116, var37.field4498, var37.field4500, var37.field4496, var37.field4495);
                                                }
                                                if (arg4.method615() > 0) {
                                                    class36 var38 = var36.field1891;
                                                    int var39 = var38.method290((byte) 60) - -(arg2 << 9);
                                                    int var40 = (arg5 << 9) + var38.method291(0);
                                                    int var41 = var39 >> 9;
                                                    int var42 = var40 >> 9;
                                                    if (var41 >= 0 && ~var42 <= -1 && var41 < super.field4315 && ~super.field4318 < ~var42) {
                                                        var38.method141(super.field4328[var36.field1882][var41][var42] - var38.method298(arg1), var40, var39, -17180);
                                                        class284.method1854(var36);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    var8 = new class154(arg3);
                                }
                            }
                            if (var8 != null) {
                                for (int var9 = 0; ~var9 > -9; ++var9) {
                                    for (int var10 = 0; var10 < 8; ++var10) {
                                        int var11 = (arg2 >> 3) - -var9;
                                        int var12 = (arg5 >> 3) - -var10;
                                        if (~var11 <= -1 && var11 < super.field4315 >> 3 && var12 >= 0 && ~(super.field4318 >> 3) < ~var12) {
                                            class405.method2486(var12, var8, 4382, var11);
                                        }
                                    }
                                }
                            }
                            if (!var7 && super.field4316 != null) {
                                for (int var13 = 0; var13 < 4; ++var13) {
                                    if (super.field4316[var13] != null) {
                                        for (int var14 = 0; var14 < 16; ++var14) {
                                            for (int var15 = 0; ~var15 > -17; ++var15) {
                                                int var16 = (arg2 >> 2) + var14;
                                                int var17 = (arg5 >> 2) + var15;
                                                if (~var16 <= -1 && var16 < 26 && ~var17 <= -1 && var17 < 26) {
                                                    super.field4316[var13][var16][var17] = 0;
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

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIIII)Lwk;")
    private final class141 method1232(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2453;
        class141 var6 = null;
        if (~arg2 == -1) {
            var6 = (class141) class654.method3688(arg3, arg4, arg0);
        }
        if (arg2 == 1) {
            var6 = (class141) class140.method1107(arg3, arg4, arg0);
        }
        if (~arg2 == -3) {
            var6 = (class141) class470.method2853(arg3, arg4, arg0, field2457 != null ? field2457 : (field2457 = method1240("wk")));
        }
        if (arg1 != -4028) {
            this.method1233(-60, (byte) 81, (class716) null, (class58) null, 80, -1, 122);
        }
        if (arg2 == 3) {
            var6 = (class141) class158.method1202(arg3, arg4, arg0);
        }
        return var6;
    }

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(IIIZ)V")
    public class166(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class332.field4686, class174.field2537);
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IBLjn;Lha;III)V")
    public final void method1233(int arg0, byte arg1, class716 arg2, class58 arg3, int arg4, int arg5, int arg6) {
        int var8 = 21 / ((arg1 - -7) / 55);
        ++field2447;
        class141 var9 = this.method1232(arg4, -4028, arg5, arg6, arg0);
        if (var9 != null) {
            class414 var10 = class66.field1181.method131(2, var9.method1109((byte) 24));
            int var11 = var9.method1112((byte) -111);
            int var12 = var9.method1111(false);
            if (var10.method2515(true)) {
                class582.method3370(66, arg6, arg0, var10, arg4);
            }
            if (var9.method1113(-24333)) {
                var9.method1108(arg3, -45);
            }
            if (arg5 != 0) {
                if (~arg5 != -2) {
                    if (arg5 == 2) {
                        class160.method1211(arg6, arg0, arg4, field2457 != null ? field2457 : (field2457 = method1240("wk")));
                        if (~var10.field5803 != -1 && arg0 - -var10.field5800 < super.field4315 && ~(arg4 - -var10.field5800) > ~super.field4318 && super.field4315 > arg0 - -var10.field5732 && arg4 - -var10.field5732 < super.field4318) {
                            arg2.method3986(!var10.field5762, var12, arg4, -101, var10.field5800, arg0, var10.field5732, var10.field5748);
                        }
                        if (~var11 == -10) {
                            if ((var12 & 1) != 0) {
                                class289.method1870(74, 16, arg4, arg6, arg0);
                                return;
                            }
                            class289.method1870(32, 8, arg4, arg6, arg0);
                            return;
                        }
                        return;
                    }
                    if (~arg5 == -4) {
                        class689.method3872(arg6, arg0, arg4);
                        if (~var10.field5803 == -2) {
                            arg2.method3996(arg0, (byte) 112, arg4);
                            return;
                        }
                    }
                } else {
                    class268.method1794(arg6, arg0, arg4);
                }
                return;
            }
            class213.method1489(arg6, arg0, arg4);
            if (~var10.field5803 != -1) {
                arg2.method3997(!var10.field5762, arg0, (byte) -126, var12, var10.field5748, arg4, var11);
            }
            if (~var10.field5717 == -2) {
                if (~var12 != -1) {
                    if (~var12 != -2) {
                        if (~var12 != -3) {
                            if (var12 == 3) {
                                class289.method1870(55, 2, arg4, arg6, arg0);
                                return;
                            }
                        } else {
                            class289.method1870(56, 1, arg4, arg6, arg0 + 1);
                        }
                        return;
                    }
                    class289.method1870(108, 2, arg4 + 1, arg6, arg0);
                    return;
                }
                class289.method1870(42, 1, arg4, arg6, arg0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(I)V")
    public static void method1234(int arg0) {
        if (arg0 < 108) {
            field2445 = null;
        }
        field2445 = null;
        field2450 = null;
        field2454 = null;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Ljn;IIIILha;IIIBI)V")
    public final void method1235(class716 arg0, int arg1, int arg2, int arg3, int arg4, class58 arg5, int arg6, int arg7, int arg8, byte arg9, int arg10) {
        ++field2444;
        if (~class471.field6781.field6704.method2015(27669) != -1 || class328.method2096(arg3, (byte) -73, arg8, arg6, class569.field8104)) {
            if (~this.field2455 < ~arg1) {
                this.field2455 = arg1;
            }
            class414 var12 = class66.field1181.method131(2, arg2);
            if (class471.field6781.field6696.method3214(27669) != 0 || !var12.field5728) {
                int var13;
                int var14;
                if (~arg10 != -2 && arg10 != 3) {
                    var13 = var12.field5732;
                    var14 = var12.field5800;
                } else {
                    var14 = var12.field5732;
                    var13 = var12.field5800;
                }
                int var15;
                int var16;
                if (super.field4315 >= arg3 + var14) {
                    var15 = (var14 >> 1) + arg3;
                    var16 = (var14 + 1 >> 1) + arg3;
                } else {
                    var16 = arg3 - -1;
                    var15 = arg3;
                }
                int var17;
                int var18;
                if (super.field4318 < arg6 + var13) {
                    var17 = arg6;
                    var18 = arg6 + 1;
                } else {
                    var18 = (var13 + 1 >> 1) + arg6;
                    var17 = (var13 >> 1) + arg6;
                }
                class278 var19 = class138.field2153[arg8];
                int var20 = var19.method1825(var17, -128, var15) + var19.method1825(var17, -128, var16) - (-var19.method1825(var18, -128, var15) - var19.method1825(var18, -128, var16)) >> 2;
                int var21 = (arg3 << 9) + (var14 << 8);
                int var22 = (arg6 << 9) + (var13 << 8);
                boolean var23 = class577.field8163 && !super.field4309 && var12.field5783;
                if (var12.method2515(true)) {
                    class229.method1575(arg1, (class84) null, var12, (class349) null, arg10, -1, arg6, arg3);
                }
                boolean var24 = ~arg4 == 0 && ~var12.field5802 == 0 && var12.field5796 == null && var12.field5720 == null && !var12.field5721;
                if (!class199.field2868 || (!class68.method711(arg7, arg9 + 25) || var12.field5717 == 1) && (!class228.method1571((byte) 123, arg7) || ~var12.field5717 != -1)) {
                    if (~arg7 == -23) {
                        if (class471.field6781.field6665.method3026(arg9 + 27797) != 0 || var12.field5737 != 0 || ~var12.field5803 == -2 || var12.field5747) {
                            class578 var25;
                            if (!var24) {
                                var25 = new class208(arg5, var12, arg1, arg8, var21, var20, var22, super.field4309, arg10, arg4);
                            } else {
                                class249 var26 = new class249(arg5, var12, arg1, arg8, var21, var20, var22, super.field4309, arg10, var23);
                                if (var26.method1113(-24333)) {
                                    var26.method1110((byte) 68, arg5);
                                }
                                var25 = var26;
                            }
                            class397.method2466(arg1, arg3, arg6, var25);
                            if (var12.field5803 == 1 && arg0 != null) {
                                arg0.method3987(arg6, arg3, 512);
                            }
                        }
                    } else if (arg7 != 10 && arg7 != 11) {
                        if ((~arg7 > -13 || ~arg7 < -18) && (~arg7 > -19 || arg7 > 21)) {
                            if (~arg7 == -1) {
                                int var29 = var12.field5717;
                                if (class364.field5108 && ~var12.field5717 == 0) {
                                    var29 = 1;
                                }
                                class455 var30;
                                if (!var24) {
                                    var30 = new class527(arg5, var12, arg1, arg8, var21, var20, var22, super.field4309, arg7, arg10, arg4);
                                } else {
                                    class601 var31 = new class601(arg5, var12, arg1, arg8, var21, var20, var22, super.field4309, arg7, arg10, var23);
                                    if (var31.method1113(-24333)) {
                                        var31.method1110((byte) 72, arg5);
                                    }
                                    var30 = var31;
                                }
                                class555.method3248(arg1, arg3, arg6, var30, (class455) null);
                                if (~arg10 != -1) {
                                    if (arg10 == 1) {
                                        if (class577.field8163 && var12.field5715) {
                                            var19.method1093(arg3, arg6 + 1, 50);
                                            var19.method1093(arg3 + 1, arg6 + 1, 50);
                                        }
                                        if (var29 == 1 && !super.field4309) {
                                            class504.method3028(arg1, var12.field5738, -var12.field5754, 27865, arg3, 2, arg6 + 1);
                                        }
                                    } else if (arg10 == 2) {
                                        if (class577.field8163 && var12.field5715) {
                                            var19.method1093(arg3 + 1, arg6, 50);
                                            var19.method1093(arg3 + 1, arg6 + 1, 50);
                                        }
                                        if (~var29 == -2 && !super.field4309) {
                                            class504.method3028(arg1, var12.field5738, -var12.field5754, 27865, arg3 + 1, 1, arg6);
                                        }
                                    } else if (arg10 == 3) {
                                        if (class577.field8163 && var12.field5715) {
                                            var19.method1093(arg3, arg6, 50);
                                            var19.method1093(arg3 + 1, arg6, 50);
                                        }
                                        if (var29 == 1 && !super.field4309) {
                                            class504.method3028(arg1, var12.field5738, var12.field5754, 27865, arg3, 2, arg6);
                                        }
                                    }
                                } else {
                                    if (class577.field8163 && var12.field5715) {
                                        var19.method1093(arg3, arg6, 50);
                                        var19.method1093(arg3, arg6 + 1, 50);
                                    }
                                    if (~var29 == -2 && !super.field4309) {
                                        class504.method3028(arg1, var12.field5738, var12.field5754, 27865, arg3, 1, arg6);
                                    }
                                }
                                if (var12.field5803 != 0 && arg0 != null) {
                                    arg0.method3999(arg3, arg9 + 255, !var12.field5762, arg10, arg6, arg7, var12.field5748);
                                }
                                if (var12.field5798 != 64) {
                                    class199.method1394(arg1, arg3, arg6, var12.field5798);
                                }
                            } else if (~arg7 == -2) {
                                class455 var33;
                                if (var24) {
                                    class601 var32 = new class601(arg5, var12, arg1, arg8, var21, var20, var22, super.field4309, arg7, arg10, var23);
                                    if (var32.method1113(-24333)) {
                                        var32.method1110((byte) 11, arg5);
                                    }
                                    var33 = var32;
                                } else {
                                    var33 = new class527(arg5, var12, arg1, arg8, var21, var20, var22, super.field4309, arg7, arg10, arg4);
                                }
                                class555.method3248(arg1, arg3, arg6, var33, (class455) null);
                                if (var12.field5715 && class577.field8163) {
                                    if (~arg10 == -1) {
                                        var19.method1093(arg3, arg6 + 1, 50);
                                    } else if (~arg10 == -2) {
                                        var19.method1093(arg3 + 1, arg6 - -1, 50);
                                    } else if (arg10 != 2) {
                                        if (arg10 == 3) {
                                            var19.method1093(arg3, arg6, 50);
                                        }
                                    } else {
                                        var19.method1093(arg3 + 1, arg6, 50);
                                    }
                                }
                                if (~var12.field5803 != -1 && arg0 != null) {
                                    arg0.method3999(arg3, -125, !var12.field5762, arg10, arg6, arg7, var12.field5748);
                                }
                            } else if (~arg7 == -3) {
                                int var34 = arg10 + 1 & 3;
                                class455 var35;
                                class455 var36;
                                if (!var24) {
                                    var35 = new class527(arg5, var12, arg1, arg8, var21, var20, var22, super.field4309, arg7, arg10 + 4, arg4);
                                    var36 = new class527(arg5, var12, arg1, arg8, var21, var20, var22, super.field4309, arg7, var34, arg4);
                                } else {
                                    class601 var37 = new class601(arg5, var12, arg1, arg8, var21, var20, var22, super.field4309, arg7, arg10 - -4, var23);
                                    class601 var38 = new class601(arg5, var12, arg1, arg8, var21, var20, var22, super.field4309, arg7, var34, var23);
                                    if (var37.method1113(arg9 ^ 24435)) {
                                        var37.method1110((byte) 32, arg5);
                                    }
                                    var36 = var38;
                                    var35 = var37;
                                    if (var38.method1113(-24333)) {
                                        var38.method1110((byte) 81, arg5);
                                    }
                                }
                                class555.method3248(arg1, arg3, arg6, var35, var36);
                                if ((~var12.field5717 == -2 || class364.field5108 && ~var12.field5717 == 0) && !super.field4309) {
                                    if (~arg10 == -1) {
                                        class504.method3028(arg1, var12.field5738, var12.field5754, 27865, arg3, 1, arg6);
                                        class504.method3028(arg1, var12.field5738, var12.field5754, 27865, arg3, 2, arg6 + 1);
                                    } else if (~arg10 == -2) {
                                        class504.method3028(arg1, var12.field5738, var12.field5754, 27865, arg3 - -1, 1, arg6);
                                        class504.method3028(arg1, var12.field5738, var12.field5754, 27865, arg3, 2, arg6 + 1);
                                    } else if (~arg10 != -3) {
                                        if (~arg10 == -4) {
                                            class504.method3028(arg1, var12.field5738, var12.field5754, arg9 + 27993, arg3, 1, arg6);
                                            class504.method3028(arg1, var12.field5738, var12.field5754, 27865, arg3, 2, arg6);
                                        }
                                    } else {
                                        class504.method3028(arg1, var12.field5738, var12.field5754, 27865, arg3 - -1, 1, arg6);
                                        class504.method3028(arg1, var12.field5738, var12.field5754, 27865, arg3, 2, arg6);
                                    }
                                }
                                if (var12.field5803 != 0 && arg0 != null) {
                                    arg0.method3999(arg3, 1, !var12.field5762, arg10, arg6, arg7, var12.field5748);
                                }
                                if (var12.field5798 != 64) {
                                    class199.method1394(arg1, arg3, arg6, var12.field5798);
                                }
                            } else {
                                if (arg9 != -128) {
                                    field2454 = null;
                                }
                                if (~arg7 == -4) {
                                    class455 var39;
                                    if (!var24) {
                                        var39 = new class527(arg5, var12, arg1, arg8, var21, var20, var22, super.field4309, arg7, arg10, arg4);
                                    } else {
                                        class601 var40 = new class601(arg5, var12, arg1, arg8, var21, var20, var22, super.field4309, arg7, arg10, var23);
                                        if (var40.method1113(-24333)) {
                                            var40.method1110((byte) 21, arg5);
                                        }
                                        var39 = var40;
                                    }
                                    class555.method3248(arg1, arg3, arg6, var39, (class455) null);
                                    if (var12.field5715 && class577.field8163) {
                                        if (~arg10 != -1) {
                                            if (~arg10 != -2) {
                                                if (arg10 == 2) {
                                                    var19.method1093(arg3 + 1, arg6, 50);
                                                } else if (~arg10 == -4) {
                                                    var19.method1093(arg3, arg6, 50);
                                                }
                                            } else {
                                                var19.method1093(arg3 + 1, arg6 + 1, 50);
                                            }
                                        } else {
                                            var19.method1093(arg3, arg6 - -1, 50);
                                        }
                                    }
                                    if (~var12.field5803 != -1 && arg0 != null) {
                                        arg0.method3999(arg3, 126, !var12.field5762, arg10, arg6, arg7, var12.field5748);
                                    }
                                } else if (arg7 == 9) {
                                    class113 var42;
                                    if (var24) {
                                        class485 var41 = new class485(arg5, var12, arg1, arg8, var21, var20, var22, super.field4309, arg3, arg3, arg6, arg6, arg7, arg10, var23);
                                        var42 = var41;
                                        if (var41.method1113(arg9 + -24205)) {
                                            var41.method1110((byte) 62, arg5);
                                        }
                                    } else {
                                        var42 = new class344(arg5, var12, arg1, arg8, var21, var20, var22, super.field4309, arg3, arg3 + var14 + -1, arg6, arg6 + var13 + -1, arg7, arg10, arg4);
                                    }
                                    class714.method3977(var42, false);
                                    if (~var12.field5717 == -2 && !super.field4309) {
                                        byte var43;
                                        if (~(arg10 & 1) == -1) {
                                            var43 = 8;
                                        } else {
                                            var43 = 16;
                                        }
                                        class504.method3028(arg1, var12.field5738, 0, arg9 ^ -27815, arg3, var43, arg6);
                                    }
                                    if (var12.field5803 != 0 && arg0 != null) {
                                        arg0.method3993(false, !var12.field5762, arg6, arg3, var12.field5748, var13, var14);
                                    }
                                    if (var12.field5798 != 64) {
                                        class199.method1394(arg1, arg3, arg6, var12.field5798);
                                    }
                                } else if (arg7 == 4) {
                                    class535 var44;
                                    if (!var24) {
                                        var44 = new class187(arg5, var12, arg1, arg8, var21, var20, var22, super.field4309, 0, 0, arg7, arg10, arg4);
                                    } else {
                                        class144 var45 = new class144(arg5, var12, arg1, arg8, var21, var20, var22, super.field4309, 0, 0, arg7, arg10);
                                        if (var45.method1113(-24333)) {
                                            var45.method1110((byte) 61, arg5);
                                        }
                                        var44 = var45;
                                    }
                                    class535.method3137(arg1, arg3, arg6, var44, (class535) null);
                                } else if (arg7 == 5) {
                                    int var46 = 65;
                                    class141 var47 = (class141) class654.method3688(arg1, arg3, arg6);
                                    if (var47 != null) {
                                        var46 = 1 + class66.field1181.method131(arg9 ^ -126, var47.method1109((byte) -113)).field5798;
                                    }
                                    class535 var48;
                                    if (!var24) {
                                        var48 = new class187(arg5, var12, arg1, arg8, var21, var20, var22, super.field4309, class559.field7952[arg10] * var46, class142.field2181[arg10] * var46, arg7, arg10, arg4);
                                    } else {
                                        class144 var49 = new class144(arg5, var12, arg1, arg8, var21, var20, var22, super.field4309, class559.field7952[arg10] * var46, class142.field2181[arg10] * var46, arg7, arg10);
                                        var48 = var49;
                                        if (var49.method1113(arg9 + -24205)) {
                                            var49.method1110((byte) 21, arg5);
                                        }
                                    }
                                    class535.method3137(arg1, arg3, arg6, var48, (class535) null);
                                } else if (~arg7 == -7) {
                                    int var50 = 33;
                                    class141 var51 = (class141) class654.method3688(arg1, arg3, arg6);
                                    if (var51 != null) {
                                        var50 = class66.field1181.method131(arg9 + 130, var51.method1109((byte) 107)).field5798 / 2 - -1;
                                    }
                                    class535 var52;
                                    if (!var24) {
                                        var52 = new class187(arg5, var12, arg1, arg8, var21, var20, var22, super.field4309, class651.field9184[arg10] * var50, class519.field7369[arg10] * var50, arg7, arg10 - -4, arg4);
                                    } else {
                                        class144 var53 = new class144(arg5, var12, arg1, arg8, var21, var20, var22, super.field4309, class559.field7952[arg10] * var50, class142.field2181[arg10] * var50, arg7, arg10 - -4);
                                        if (var53.method1113(-24333)) {
                                            var53.method1110((byte) 64, arg5);
                                        }
                                        var52 = var53;
                                    }
                                    class535.method3137(arg1, arg3, arg6, var52, (class535) null);
                                } else if (~arg7 == -8) {
                                    int var54 = 3 & arg10 + 2;
                                    class535 var56;
                                    if (var24) {
                                        class144 var55 = new class144(arg5, var12, arg1, arg8, var21, var20, var22, super.field4309, 0, 0, arg7, var54 + 4);
                                        var56 = var55;
                                        if (var55.method1113(arg9 ^ 24435)) {
                                            var55.method1110((byte) 64, arg5);
                                        }
                                    } else {
                                        var56 = new class187(arg5, var12, arg1, arg8, var21, var20, var22, super.field4309, 0, 0, arg7, var54 - -4, arg4);
                                    }
                                    class535.method3137(arg1, arg3, arg6, var56, (class535) null);
                                } else if (~arg7 == -9) {
                                    int var57 = 3 & arg10 + 2;
                                    int var58 = 33;
                                    class141 var59 = (class141) class654.method3688(arg1, arg3, arg6);
                                    if (var59 != null) {
                                        var58 = class66.field1181.method131(2, var59.method1109((byte) -94)).field5798 / 2 + 1;
                                    }
                                    class535 var62;
                                    class535 var63;
                                    if (var24) {
                                        class144 var60 = new class144(arg5, var12, arg1, arg8, var21, var20, var22, super.field4309, class651.field9184[arg10] * var58, class519.field7369[arg10] * var58, arg7, arg10 + 4);
                                        class144 var61 = new class144(arg5, var12, arg1, arg8, var21, var20, var22, super.field4309, 0, 0, arg7, var57 + 4);
                                        if (var60.method1113(-24333)) {
                                            var60.method1110((byte) 73, arg5);
                                        }
                                        if (var61.method1113(-24333)) {
                                            var61.method1110((byte) 21, arg5);
                                        }
                                        var62 = var61;
                                        var63 = var60;
                                    } else {
                                        class187 var64 = new class187(arg5, var12, arg1, arg8, var21, var20, var22, super.field4309, class651.field9184[arg10] * var58, class519.field7369[arg10] * var58, arg7, arg10 - -4, arg4);
                                        var63 = var64;
                                        class187 var65 = new class187(arg5, var12, arg1, arg8, var21, var20, var22, super.field4309, 0, 0, arg7, var57 + 4, arg4);
                                        var62 = var65;
                                    }
                                    class535.method3137(arg1, arg3, arg6, var63, var62);
                                }
                            }
                        } else {
                            class113 var28;
                            if (var24) {
                                class485 var27 = new class485(arg5, var12, arg1, arg8, var21, var20, var22, super.field4309, arg3, arg3 + var14 + -1, arg6, arg6 - -var13 + -1, arg7, arg10, var23);
                                var28 = var27;
                                if (var27.method1113(-24333)) {
                                    var27.method1110((byte) 74, arg5);
                                }
                            } else {
                                var28 = new class344(arg5, var12, arg1, arg8, var21, var20, var22, super.field4309, arg3, var14 + -1 + arg3, arg6, arg6 + -1 + var13, arg7, arg10, arg4);
                            }
                            class714.method3977(var28, false);
                            if (class577.field8163 && !super.field4309 && ~arg7 <= -13 && arg7 <= 17 && ~arg7 != -14 && arg1 > 0 && ~var12.field5717 != -1) {
                                super.field4311[arg1][arg3][arg6] = (byte) class164.method1221(super.field4311[arg1][arg3][arg6], 4);
                            }
                            if (~var12.field5803 != -1 && arg0 != null) {
                                arg0.method3993(false, !var12.field5762, arg6, arg3, var12.field5748, var13, var14);
                            }
                        }
                    } else {
                        class485 var66 = null;
                        class113 var68;
                        int var69;
                        if (var24) {
                            class485 var67 = new class485(arg5, var12, arg1, arg8, var21, var20, var22, super.field4309, arg3, arg3 - -var14 + -1, arg6, var13 - 1 + arg6, arg7, arg10, var23);
                            var68 = var67;
                            var69 = var67.method2918(4);
                            var66 = var67;
                        } else {
                            var68 = new class344(arg5, var12, arg1, arg8, var21, var20, var22, super.field4309, arg3, arg3 + var14 + -1, arg6, arg6 - -var13 + -1, arg7, arg10, arg4);
                            var69 = 15;
                        }
                        if (class714.method3977(var68, false)) {
                            if (var66 != null && var66.method1113(-24333)) {
                                var66.method1110((byte) 121, arg5);
                            }
                            if (var12.field5715 && class577.field8163) {
                                if (var69 > 30) {
                                    var69 = 30;
                                }
                                for (int var70 = 0; var14 >= var70; ++var70) {
                                    for (int var71 = 0; var71 <= var13; ++var71) {
                                        var19.method1093(arg3 - -var70, arg6 - -var71, var69);
                                    }
                                }
                            }
                        }
                        if (var12.field5803 != 0 && arg0 != null) {
                            arg0.method3993(false, !var12.field5762, arg6, arg3, var12.field5748, var13, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIBLha;IIIILud;I[I)V")
    public final void method1236(int arg0, int arg1, byte arg2, class58 arg3, int arg4, int arg5, int arg6, int arg7, class35 arg8, int arg9, int[] arg10) {
        ++field2448;
        if (!super.field4309) {
            boolean var12 = false;
            if (arg10 != null) {
                arg10[0] = -1;
            }
            class154 var13 = null;
            int var14 = (arg7 & 7) * 8;
            int var15 = (arg9 & 7) * 8;
            while (true) {
                while (true) {
                    while (true) {
                        while (true) {
                            while (~arg8.field469 > ~arg8.field483.length) {
                                int var20 = arg8.method273(255);
                                if (~var20 != -1) {
                                    if (~var20 != -2) {
                                        if (~var20 != -3) {
                                            if (~var20 != -129) {
                                                if (~var20 != -130) {
                                                    throw new IllegalStateException("");
                                                }
                                                if (super.field4316 == null) {
                                                    super.field4316 = new byte[4][][];
                                                }
                                                for (int var21 = 0; var21 < 4; ++var21) {
                                                    byte var22 = arg8.method277((byte) -128);
                                                    if (~var22 == -1 && super.field4316[arg4] != null) {
                                                        if (~arg0 <= ~var21) {
                                                            int var23 = arg5;
                                                            int var24 = arg5 - -7;
                                                            int var25 = arg6;
                                                            if (arg5 >= 0) {
                                                                if (~arg5 <= ~super.field4315) {
                                                                    var23 = super.field4315;
                                                                }
                                                            } else {
                                                                var23 = 0;
                                                            }
                                                            int var26 = arg6 + 7;
                                                            if (~var24 <= -1) {
                                                                if (var24 >= super.field4315) {
                                                                    var24 = super.field4315;
                                                                }
                                                            } else {
                                                                var24 = 0;
                                                            }
                                                            if (~arg6 > -1) {
                                                                var25 = 0;
                                                            } else if (super.field4318 <= arg6) {
                                                                var25 = super.field4318;
                                                            }
                                                            if (~var26 <= -1) {
                                                                if (var26 >= super.field4318) {
                                                                    var26 = super.field4318;
                                                                }
                                                            } else {
                                                                var26 = 0;
                                                            }
                                                            while (~var24 < ~var23) {
                                                                while (~var25 > ~var26) {
                                                                    super.field4316[arg4][var23][var25] = 0;
                                                                    ++var25;
                                                                }
                                                                ++var23;
                                                            }
                                                        }
                                                    } else if (~var22 == -2) {
                                                        if (super.field4316[arg4] == null) {
                                                            super.field4316[arg4] = new byte[super.field4315 + 1][super.field4318 + 1];
                                                        }
                                                        for (int var27 = 0; ~var27 > -65; var27 += 4) {
                                                            for (int var28 = 0; var28 < 64; var28 += 4) {
                                                                byte var29 = arg8.method277((byte) -120);
                                                                if (var21 <= arg0) {
                                                                    for (int var30 = var27; var30 < var27 + 4; ++var30) {
                                                                        for (int var31 = var28; var31 < var28 + 4; ++var31) {
                                                                            if (~var14 >= ~var30 && ~var30 > ~(var14 + 8) && var31 >= var15 && var15 + 8 > var15) {
                                                                                int var32 = arg5 - -class740.method4121(arg1, -28675, var30 & 7, var31 & 7);
                                                                                int var33 = arg6 + class317.method2039(var30 & 7, var31 & 7, arg1, -2);
                                                                                if (~var32 <= -1 && var32 < super.field4315 && ~var33 <= -1 && ~var33 > ~super.field4318) {
                                                                                    super.field4316[arg4][var32][var33] = var29;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (arg10 != null) {
                                                arg10[0] = arg8.method253(-13900);
                                                arg10[1] = arg8.method225((byte) 87);
                                                arg10[2] = arg8.method225((byte) 102);
                                                arg10[3] = arg8.method225((byte) 103);
                                                arg10[4] = arg8.method253(-13900);
                                            } else {
                                                arg8.field469 += 10;
                                            }
                                        } else {
                                            if (var13 == null) {
                                                var13 = new class154();
                                            }
                                            var13.method1179(arg8, 8);
                                        }
                                    } else {
                                        int var34 = arg8.method273(255);
                                        if (var34 > 0) {
                                            for (int var35 = 0; ~var34 < ~var35; ++var35) {
                                                class122 var36 = new class122(arg3, arg8, 2);
                                                if (~var36.field1888 == -32) {
                                                    class317 var37 = class341.field4798.method960((byte) -117, arg8.method253(-13900));
                                                    var36.method972((byte) 120, var37.field4498, var37.field4500, var37.field4496, var37.field4495);
                                                }
                                                if (arg3.method615() > 0) {
                                                    class36 var38 = var36.field1891;
                                                    int var39 = var38.method290((byte) 88) >> 9;
                                                    int var40 = var38.method291(0) >> 9;
                                                    if (var36.field1882 == arg0 && ~var14 >= ~var39 && var14 + 8 > var39 && var15 <= var40 && ~(var15 + 8) < ~var40) {
                                                        int var41 = (arg5 << 9) - -class576.method3341(arg1, var38.method290((byte) -120) & 4095, var38.method291(0) & 4095, false);
                                                        int var42 = var41 >> 9;
                                                        int var43 = class376.method2358(var38.method291(0) & 4095, arg1, -48, 4095 & var38.method290((byte) -110)) + (arg6 << 9);
                                                        int var44 = var43 >> 9;
                                                        if (var42 >= 0 && var44 >= 0 && var42 < super.field4315 && var44 < super.field4318) {
                                                            var38.method141(super.field4328[arg0][var42][var44] + -var38.method298(false), var43, var41, -17180);
                                                            class284.method1854(var36);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    var13 = new class154(arg8);
                                }
                            }
                            if (var13 != null) {
                                class405.method2486(arg6 >> 3, var13, 4382, arg5 >> 3);
                            }
                            if (!var12 && super.field4316 != null && super.field4316[arg4] != null) {
                                int var16 = arg5 + 7;
                                int var17 = arg6 + 7;
                                for (int var18 = arg5; ~var16 < ~var18; ++var18) {
                                    for (int var19 = arg6; var19 < var17; ++var19) {
                                        super.field4316[arg4][var18][var19] = 0;
                                    }
                                }
                            }
                            if (arg2 <= 101) {
                                method1229(79, 15, (class332) null, 124, -115);
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(I[BB[Ljn;Lha;I)V")
    public final void method1237(int arg0, byte[] arg1, byte arg2, class716[] arg3, class58 arg4, int arg5) {
        ++field2451;
        class35 var7 = new class35(arg1);
        int var8 = -1;
        int var9 = -19 / ((arg2 - 19) / 58);
        while (true) {
            int var10 = var7.method235(-951);
            if (~var10 == -1) {
                return;
            }
            var8 += var10;
            int var11 = 0;
            while (true) {
                int var12 = var7.method232((byte) 2);
                if (var12 == 0) {
                    break;
                }
                var11 += var12 + -1;
                int var13 = var11 & 63;
                int var14 = (4048 & var11) >> 6;
                int var15 = var11 >> 12;
                int var16 = var7.method273(255);
                int var17 = var16 >> 2;
                int var18 = 3 & var16;
                int var19 = arg5 + var14;
                int var20 = arg0 + var13;
                if (var19 > 0 && ~var20 < -1 && var19 < super.field4315 - 1 && var20 < super.field4318 - 1) {
                    class716 var21 = null;
                    if (!super.field4309) {
                        int var22 = var15;
                        if (~(class435.field6078[1][var19][var20] & 2) == -3) {
                            var22 = var15 - 1;
                        }
                        if (~var22 <= -1) {
                            var21 = arg3[var22];
                        }
                    }
                    this.method1235(var21, var15, var8, var19, -1, arg4, var20, var17, var15, (byte) -128, var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(ZLha;I)V")
    public final void method1238(boolean arg0, class58 arg1, int arg2) {
        class680.method3840();
        ++field2456;
        if (!arg0) {
            if (super.field4329 > 1) {
                for (int var4 = 0; ~var4 > ~super.field4315; ++var4) {
                    for (int var5 = 0; super.field4318 > var5; ++var5) {
                        if (~(2 & class435.field6078[1][var4][var5]) == -3) {
                            class371.method2331(var4, var5);
                        }
                    }
                }
            }
            for (int var6 = 0; var6 < super.field4329; ++var6) {
                for (int var7 = 0; super.field4318 >= var7; ++var7) {
                    for (int var8 = 0; super.field4315 >= var8; ++var8) {
                        if ((super.field4311[var6][var8][var7] & 4) != 0) {
                            int var9 = var8;
                            int var10 = var8;
                            int var11 = var7;
                            int var12 = var7;
                            while (var11 > 0 && ~(4 & super.field4311[var6][var8][var11 - 1]) != -1 && ~(var12 - var11) > -11) {
                                --var11;
                            }
                            while (~var12 > ~super.field4318 && ~(4 & super.field4311[var6][var8][var12 + 1]) != -1 && var12 - var11 < 10) {
                                ++var12;
                            }
                            label118: while (var9 > 0 && -var9 + var10 < 10) {
                                for (int var13 = var11; var13 <= var12; ++var13) {
                                    if ((4 & super.field4311[var6][var9 + -1][var13]) == 0) {
                                        break label118;
                                    }
                                }
                                --var9;
                            }
                            label105: while (super.field4315 > var10 && var10 - var9 < 10) {
                                for (int var14 = var11; var14 <= var12; ++var14) {
                                    if ((super.field4311[var6][var10 + 1][var14] & 4) == 0) {
                                        break label105;
                                    }
                                }
                                ++var10;
                            }
                            if (~((-var9 + var10 + 1) * (-var11 + 1 + var12)) <= -5) {
                                int var15 = super.field4328[var6][var9][var11];
                                class92.method848(arg2 + 42, 4, (var12 << 9) - -512, var15, var9 << 9, var15, var11 << 9, (var10 << 9) - -512, var6);
                                for (int var16 = var9; ~var10 <= ~var16; ++var16) {
                                    for (int var17 = var11; var17 <= var12; ++var17) {
                                        super.field4311[var6][var16][var17] = (byte) class555.method3246(super.field4311[var6][var16][var17], -5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class58.method549(-83);
        }
        if (arg2 == 4) {
            super.field4311 = null;
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(II[BIIILha;I[Ljn;II)V")
    public final void method1239(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, class58 arg6, int arg7, class716[] arg8, int arg9, int arg10) {
        ++field2449;
        class35 var12 = new class35(arg2);
        int var13 = arg7;
        while (true) {
            int var14 = var12.method235(-951);
            if (~var14 == -1) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method232((byte) -126);
                if (~var16 == -1) {
                    break;
                }
                var15 += var16 + -1;
                int var17 = var15 & 63;
                int var18 = (4039 & var15) >> 6;
                int var19 = var15 >> 12;
                int var20 = var12.method273(255);
                int var21 = var20 >> 2;
                int var22 = var20 & 3;
                if (~arg9 == ~var19 && ~var18 <= ~arg0 && ~var18 > ~(arg0 + 8) && var17 >= arg1 && arg1 + 8 > var17) {
                    class414 var23 = class66.field1181.method131(arg7 ^ -3, var13);
                    int var24 = class745.method4148(var18 & 7, arg4, -99, 7 & var17, var22, var23.field5800, var23.field5732) + arg3;
                    int var25 = class265.method1785(var23.field5732, var17 & 7, arg4, var22, 7 & var18, var23.field5800, 102) + arg10;
                    if (var24 > 0 && ~var25 < -1 && super.field4315 + -1 > var24 && var25 < super.field4318 + -1) {
                        class716 var26 = null;
                        if (!super.field4309) {
                            int var27 = arg5;
                            if ((2 & class435.field6078[1][var24][var25]) == 2) {
                                var27 = arg5 - 1;
                            }
                            if (~var27 <= -1) {
                                var26 = arg8[var27];
                            }
                        }
                        this.method1235(var26, arg5, var13, var24, -1, arg6, var25, var21, arg5, (byte) -128, 3 & var22 - -arg4);
                    }
                }
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1240(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        String var0 = "Unknown";
        try {
            var0 = System.getProperty("java.vendor").toLowerCase();
        } catch (Exception var11) {
        }
        var0.toLowerCase();
        String var1 = "Unknown";
        try {
            var1 = System.getProperty("java.version").toLowerCase();
        } catch (Exception var10) {
        }
        var1.toLowerCase();
        String var2 = "Unknown";
        try {
            var2 = System.getProperty("os.name").toLowerCase();
        } catch (Exception var9) {
        }
        field2445 = var2.toLowerCase();
        String var3 = "Unknown";
        try {
            var3 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var8) {
        }
        field2450 = var3.toLowerCase();
        String var4 = "Unknown";
        try {
            var4 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var7) {
        }
        var4.toLowerCase();
        String var5 = "~/";
        try {
            var5 = System.getProperty("user.home").toLowerCase();
        } catch (Exception var6) {
        }
        new File(var5);
        field2454 = new class510(3000000, 200);
    }
}
