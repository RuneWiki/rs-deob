import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public class class460 extends class127 {

    @OriginalMember(owner = "client!fea", name = "N", descriptor = "I")
    public int field6670 = 99;

    @OriginalMember(owner = "client!fea", name = "Q", descriptor = "I")
    public static int field6673 = 1405;

    @OriginalMember(owner = "client!fea", name = "K", descriptor = "Lnf;")
    public static class19 field6667 = new class19();

    @OriginalMember(owner = "client!fea", name = "H", descriptor = "I")
    public static int field6664;

    @OriginalMember(owner = "client!fea", name = "I", descriptor = "I")
    public static int field6665;

    @OriginalMember(owner = "client!fea", name = "J", descriptor = "I")
    public static int field6666;

    @OriginalMember(owner = "client!fea", name = "L", descriptor = "I")
    public static int field6668;

    @OriginalMember(owner = "client!fea", name = "M", descriptor = "I")
    public static int field6669;

    @OriginalMember(owner = "client!fea", name = "P", descriptor = "I")
    public static int field6672;

    @OriginalMember(owner = "client!fea", name = "R", descriptor = "I")
    public static int field6674;

    @OriginalMember(owner = "client!fea", name = "S", descriptor = "I")
    public static int field6675;

    @OriginalMember(owner = "client!fea", name = "T", descriptor = "I")
    public static int field6676;

    @OriginalMember(owner = "client!fea", name = "U", descriptor = "Lla;")
    public static class422 field6677;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fea", name = "V", descriptor = "Ljava/lang/Class;")
    public static Class field6678;

    @OriginalMember(owner = "client!fea", name = "O", descriptor = "[Lit;")
    public static class34[] field6671;

    // $FF: synthetic method
    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2821(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(I[IILofa;ILha;)V", line = 3)
    public final void method2811(int arg0, int[] arg1, int arg2, class301 arg3, int arg4, class544 arg5) {
        ++field6676;
        if (!super.field1968) {
            boolean var7 = false;
            if (arg1 != null) {
                arg1[0] = -1;
            }
            class22 var8 = null;
            while (true) {
                while (true) {
                    while (true) {
                        while (true) {
                            while (arg3.field4534 < arg3.field4543.length) {
                                int var18 = arg3.method1987(-89);
                                if (var18 != 0) {
                                    if (~var18 != -2) {
                                        if (~var18 != -3) {
                                            if (var18 != 128) {
                                                if (var18 != 129) {
                                                    throw new IllegalStateException("");
                                                }
                                                if (super.field1974 == null) {
                                                    super.field1974 = new byte[4][][];
                                                }
                                                var7 = true;
                                                for (int var19 = 0; ~var19 > -5; ++var19) {
                                                    byte var20 = arg3.method1984(4);
                                                    if (~var20 == -1 && super.field1974[var19] != null) {
                                                        int var21 = arg2;
                                                        int var22 = arg2 + 64;
                                                        int var23 = arg4;
                                                        if (arg2 >= 0) {
                                                            if (arg2 >= super.field1978) {
                                                                var21 = super.field1978;
                                                            }
                                                        } else {
                                                            var21 = 0;
                                                        }
                                                        int var24 = arg4 + 64;
                                                        if (arg4 < 0) {
                                                            var23 = 0;
                                                        } else if (arg4 >= super.field1982) {
                                                            var23 = super.field1982;
                                                        }
                                                        if (~var22 > -1) {
                                                            var22 = 0;
                                                        } else if (~var22 <= ~super.field1978) {
                                                            var22 = super.field1978;
                                                        }
                                                        if (~var24 > -1) {
                                                            var24 = 0;
                                                        } else if (var24 >= super.field1982) {
                                                            var24 = super.field1982;
                                                        }
                                                        while (~var22 < ~var21) {
                                                            while (var24 > var23) {
                                                                super.field1974[var19][var21][var23] = 0;
                                                                ++var23;
                                                            }
                                                            ++var21;
                                                        }
                                                    } else if (~var20 == -2) {
                                                        if (super.field1974[var19] == null) {
                                                            super.field1974[var19] = new byte[super.field1978 + 1][super.field1982 + 1];
                                                        }
                                                        for (int var25 = 0; var25 < 64; var25 += 4) {
                                                            for (int var26 = 0; var26 < 64; var26 += 4) {
                                                                byte var27 = arg3.method1984(arg0 + 4);
                                                                for (int var28 = arg2 + var25; ~(arg2 + 4 + var25) < ~var28; ++var28) {
                                                                    for (int var29 = var26 - -arg4; var29 < var26 + 4 + arg4; ++var29) {
                                                                        if (~var28 <= -1 && ~var28 > ~super.field1978 && ~var29 <= -1 && super.field1982 > var29) {
                                                                            super.field1974[var19][var28][var29] = var27;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else if (~var20 == -3) {
                                                        if (super.field1974[var19] == null) {
                                                            super.field1974[var19] = new byte[super.field1978 + 1][super.field1982 + 1];
                                                        }
                                                        if (var19 > 0) {
                                                            int var30 = arg2;
                                                            int var31 = arg2 + 64;
                                                            int var32 = arg4;
                                                            if (~arg2 <= -1) {
                                                                if (super.field1978 <= arg2) {
                                                                    var30 = super.field1978;
                                                                }
                                                            } else {
                                                                var30 = 0;
                                                            }
                                                            if (~var31 > -1) {
                                                                var31 = 0;
                                                            } else if (~super.field1978 >= ~var31) {
                                                                var31 = super.field1978;
                                                            }
                                                            if (~arg4 > -1) {
                                                                var32 = 0;
                                                            } else if (~arg4 <= ~super.field1982) {
                                                                var32 = super.field1982;
                                                            }
                                                            int var33 = arg4 + 64;
                                                            if (var33 < 0) {
                                                                var33 = 0;
                                                            } else if (super.field1982 <= var33) {
                                                                var33 = super.field1982;
                                                            }
                                                            while (var31 > var30) {
                                                                while (var33 > var32) {
                                                                    super.field1974[var19][var30][var32] = super.field1974[var19 - 1][var30][var32];
                                                                    ++var32;
                                                                }
                                                                ++var30;
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (arg1 != null) {
                                                arg1[0] = arg3.method1989((byte) -127);
                                                arg1[1] = arg3.method1977((byte) 19);
                                                arg1[2] = arg3.method1977((byte) 96);
                                                arg1[3] = arg3.method1977((byte) -124);
                                                arg1[4] = arg3.method1989((byte) -48);
                                            } else {
                                                arg3.field4534 += 10;
                                            }
                                        } else {
                                            if (var8 == null) {
                                                var8 = new class22();
                                            }
                                            var8.method121(-5491, arg3);
                                        }
                                    } else {
                                        int var34 = arg3.method1987(-44);
                                        if (~var34 < -1) {
                                            for (int var35 = 0; var34 > var35; ++var35) {
                                                class639 var36 = new class639(arg5, arg3, 2);
                                                if (~var36.field8973 == -32) {
                                                    class204 var37 = class451.field6568.method2395((byte) 5, arg3.method1989((byte) -30));
                                                    var36.method3617(var37.field3438, var37.field3441, 54, var37.field3439, var37.field3436);
                                                }
                                                if (~arg5.method356() < -1) {
                                                    class759 var38 = var36.field8979;
                                                    int var39 = var38.method4228(-120) + (arg2 << 9);
                                                    int var40 = var38.method4223((byte) -74) - -(arg4 << 9);
                                                    int var41 = var39 >> 9;
                                                    int var42 = var40 >> 9;
                                                    if (var41 >= 0 && var42 >= 0 && ~super.field1978 < ~var41 && ~super.field1982 < ~var42) {
                                                        var38.method8(var39, var40, super.field1962[var36.field8965][var41][var42] - var38.method4221((byte) -7), (byte) -28);
                                                        class129.method1043(var36);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    var8 = new class22(arg3);
                                }
                            }
                            if (arg0 != 0) {
                                method2818(1, (String) null);
                            }
                            if (var8 != null) {
                                for (int var9 = 0; var9 < 8; ++var9) {
                                    for (int var10 = 0; ~var10 > -9; ++var10) {
                                        int var11 = (arg2 >> 3) + var9;
                                        int var12 = (arg4 >> 3) - -var10;
                                        if (~var11 <= -1 && var11 < super.field1978 >> 3 && var12 >= 0 && super.field1982 >> 3 > var12) {
                                            class581.method3352(false, var11, var8, var12);
                                        }
                                    }
                                }
                            }
                            if (!var7 && super.field1974 != null) {
                                for (int var13 = 0; var13 < 4; ++var13) {
                                    if (super.field1974[var13] != null) {
                                        for (int var14 = 0; var14 < 16; ++var14) {
                                            for (int var15 = 0; ~var15 > -17; ++var15) {
                                                int var16 = (arg2 >> 2) - -var14;
                                                int var17 = (arg4 >> 2) + var15;
                                                if (~var16 <= -1 && ~var16 > -27 && var17 >= 0 && var17 < 26) {
                                                    super.field1974[var13][var16][var17] = 0;
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

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(IIIILha;IIILup;ZI)V", line = 373)
    public final void method2812(int arg0, int arg1, int arg2, int arg3, class544 arg4, int arg5, int arg6, int arg7, class238 arg8, boolean arg9, int arg10) {
        ++field6666;
        if (class654.field9289.field5453.method3878(3) != 0 || class26.method147((byte) -112, arg7, class405.field6003, arg2, arg1)) {
            if (~this.field6670 < ~arg0) {
                this.field6670 = arg0;
            }
            class595 var12 = class576.field8167.method3074(0, arg6);
            if (~class654.field9289.field5448.method3596(3) != -1 || !var12.field8397) {
                int var13;
                int var14;
                if (~arg3 != -2 && arg3 != 3) {
                    var13 = var12.field8384;
                    var14 = var12.field8429;
                } else {
                    var14 = var12.field8384;
                    var13 = var12.field8429;
                }
                int var15;
                int var16;
                if (arg1 + var13 <= super.field1978) {
                    var15 = (var13 >> 1) + arg1;
                    var16 = (var13 + 1 >> 1) + arg1;
                } else {
                    var15 = arg1;
                    var16 = arg1 + 1;
                }
                int var17;
                int var18;
                if (~(arg7 + var14) < ~super.field1982) {
                    var17 = arg7;
                    var18 = arg7 - -1;
                } else {
                    var18 = arg7 - -(var14 + 1 >> 1);
                    var17 = (var14 >> 1) + arg7;
                }
                class339 var19 = class211.field3511[arg2];
                int var20 = var19.method2160(-93, var17, var15) - -var19.method2160(-106, var17, var16) - (-var19.method2160(-77, var18, var15) - var19.method2160(-76, var18, var16)) >> 2;
                int var21 = (arg1 << 9) - -(var13 << 8);
                int var22 = (arg7 << 9) + (var14 << 8);
                boolean var23 = class357.field5400 && !super.field1968 && var12.field8391;
                if (var12.method3415(-64)) {
                    class52.method498((class573) null, arg0, arg1, var12, (byte) -112, arg3, (class461) null, arg7);
                }
                if (arg9) {
                    field6667 = null;
                }
                boolean var24 = ~arg10 == 0 && var12.field8433 == -1 && var12.field8357 == null && var12.field8351 == null && !var12.field8441;
                if (!class219.field3581 || (!class556.method3240(65532, arg5) || ~var12.field8420 == -2) && (!class149.method1135((byte) 67, arg5) || var12.field8420 != 0)) {
                    if (~arg5 == -23) {
                        if (class654.field9289.field5433.method4141(3) != 0 || var12.field8426 != 0 || var12.field8368 == 1 || var12.field8375) {
                            class713 var25;
                            if (!var24) {
                                var25 = new class545(arg4, var12, arg0, arg2, var21, var20, var22, super.field1968, arg3, arg10);
                            } else {
                                class125 var26 = new class125(arg4, var12, arg0, arg2, var21, var20, var22, super.field1968, arg3, var23);
                                var25 = var26;
                                if (var26.method88((byte) 91)) {
                                    var26.method91(arg4, true);
                                }
                            }
                            class347.method2216(arg0, arg1, arg7, var25);
                            if (~var12.field8368 == -2 && arg8 != null) {
                                arg8.method1647(arg7, arg1, true);
                            }
                        }
                    } else if (arg5 != 10 && arg5 != 11) {
                        if ((~arg5 > -13 || arg5 > 17) && (~arg5 > -19 || ~arg5 < -22)) {
                            if (~arg5 == -1) {
                                int var29 = var12.field8420;
                                if (class127.field1984 && ~var12.field8420 == 0) {
                                    var29 = 1;
                                }
                                class194 var31;
                                if (var24) {
                                    class496 var30 = new class496(arg4, var12, arg0, arg2, var21, var20, var22, super.field1968, arg5, arg3, var23);
                                    if (var30.method88((byte) 115)) {
                                        var30.method91(arg4, !arg9);
                                    }
                                    var31 = var30;
                                } else {
                                    var31 = new class16(arg4, var12, arg0, arg2, var21, var20, var22, super.field1968, arg5, arg3, arg10);
                                }
                                class556.method3239(arg0, arg1, arg7, var31, (class194) null);
                                if (arg3 == 0) {
                                    if (class357.field5400 && var12.field8398) {
                                        var19.method625(arg1, arg7, 50);
                                        var19.method625(arg1, arg7 + 1, 50);
                                    }
                                    if (var29 == 1 && !super.field1968) {
                                        class322.method2089(-5474, 1, arg1, var12.field8440, arg0, var12.field8353, arg7);
                                    }
                                } else if (arg3 == 1) {
                                    if (class357.field5400 && var12.field8398) {
                                        var19.method625(arg1, arg7 + 1, 50);
                                        var19.method625(arg1 + 1, arg7 - -1, 50);
                                    }
                                    if (~var29 == -2 && !super.field1968) {
                                        class322.method2089(-5474, 2, arg1, var12.field8440, arg0, -var12.field8353, arg7 + 1);
                                    }
                                } else if (arg3 == 2) {
                                    if (class357.field5400 && var12.field8398) {
                                        var19.method625(arg1 + 1, arg7, 50);
                                        var19.method625(arg1 + 1, arg7 + 1, 50);
                                    }
                                    if (var29 == 1 && !super.field1968) {
                                        class322.method2089(-5474, 1, arg1 + 1, var12.field8440, arg0, -var12.field8353, arg7);
                                    }
                                } else if (arg3 == 3) {
                                    if (class357.field5400 && var12.field8398) {
                                        var19.method625(arg1, arg7, 50);
                                        var19.method625(arg1 + 1, arg7, 50);
                                    }
                                    if (var29 == 1 && !super.field1968) {
                                        class322.method2089(-5474, 2, arg1, var12.field8440, arg0, var12.field8353, arg7);
                                    }
                                }
                                if (~var12.field8368 != -1 && arg8 != null) {
                                    arg8.method1643(arg1, arg7, !var12.field8418, var12.field8383, arg3, arg5, -128);
                                }
                                if (var12.field8369 != 64) {
                                    class93.method780(arg0, arg1, arg7, var12.field8369);
                                }
                            } else if (~arg5 == -2) {
                                class194 var32;
                                if (!var24) {
                                    var32 = new class16(arg4, var12, arg0, arg2, var21, var20, var22, super.field1968, arg5, arg3, arg10);
                                } else {
                                    class496 var33 = new class496(arg4, var12, arg0, arg2, var21, var20, var22, super.field1968, arg5, arg3, var23);
                                    if (var33.method88((byte) 103)) {
                                        var33.method91(arg4, true);
                                    }
                                    var32 = var33;
                                }
                                class556.method3239(arg0, arg1, arg7, var32, (class194) null);
                                if (var12.field8398 && class357.field5400) {
                                    if (arg3 == 0) {
                                        var19.method625(arg1, arg7 + 1, 50);
                                    } else if (arg3 == 1) {
                                        var19.method625(arg1 + 1, arg7 + 1, 50);
                                    } else if (~arg3 == -3) {
                                        var19.method625(arg1 - -1, arg7, 50);
                                    } else if (~arg3 == -4) {
                                        var19.method625(arg1, arg7, 50);
                                    }
                                }
                                if (~var12.field8368 != -1 && arg8 != null) {
                                    arg8.method1643(arg1, arg7, !var12.field8418, var12.field8383, arg3, arg5, -128);
                                }
                            } else if (arg5 == 2) {
                                int var34 = arg3 + 1 & 3;
                                class194 var37;
                                class194 var38;
                                if (var24) {
                                    class496 var35 = new class496(arg4, var12, arg0, arg2, var21, var20, var22, super.field1968, arg5, arg3 + 4, var23);
                                    class496 var36 = new class496(arg4, var12, arg0, arg2, var21, var20, var22, super.field1968, arg5, var34, var23);
                                    if (var35.method88((byte) 121)) {
                                        var35.method91(arg4, true);
                                    }
                                    var37 = var35;
                                    if (var36.method88((byte) 88)) {
                                        var36.method91(arg4, true);
                                    }
                                    var38 = var36;
                                } else {
                                    var37 = new class16(arg4, var12, arg0, arg2, var21, var20, var22, super.field1968, arg5, arg3 - -4, arg10);
                                    var38 = new class16(arg4, var12, arg0, arg2, var21, var20, var22, super.field1968, arg5, var34, arg10);
                                }
                                class556.method3239(arg0, arg1, arg7, var37, var38);
                                if ((var12.field8420 == 1 || class127.field1984 && var12.field8420 == -1) && !super.field1968) {
                                    if (arg3 == 0) {
                                        class322.method2089(-5474, 1, arg1, var12.field8440, arg0, var12.field8353, arg7);
                                        class322.method2089(-5474, 2, arg1, var12.field8440, arg0, var12.field8353, arg7 + 1);
                                    } else if (arg3 != 1) {
                                        if (arg3 == 2) {
                                            class322.method2089(-5474, 1, arg1 + 1, var12.field8440, arg0, var12.field8353, arg7);
                                            class322.method2089(-5474, 2, arg1, var12.field8440, arg0, var12.field8353, arg7);
                                        } else if (arg3 == 3) {
                                            class322.method2089(-5474, 1, arg1, var12.field8440, arg0, var12.field8353, arg7);
                                            class322.method2089(-5474, 2, arg1, var12.field8440, arg0, var12.field8353, arg7);
                                        }
                                    } else {
                                        class322.method2089(-5474, 1, arg1 + 1, var12.field8440, arg0, var12.field8353, arg7);
                                        class322.method2089(-5474, 2, arg1, var12.field8440, arg0, var12.field8353, arg7 + 1);
                                    }
                                }
                                if (var12.field8368 != 0 && arg8 != null) {
                                    arg8.method1643(arg1, arg7, !var12.field8418, var12.field8383, arg3, arg5, -127);
                                }
                                if (~var12.field8369 != -65) {
                                    class93.method780(arg0, arg1, arg7, var12.field8369);
                                }
                            } else if (arg5 == 3) {
                                class194 var40;
                                if (var24) {
                                    class496 var39 = new class496(arg4, var12, arg0, arg2, var21, var20, var22, super.field1968, arg5, arg3, var23);
                                    var40 = var39;
                                    if (var39.method88((byte) 120)) {
                                        var39.method91(arg4, true);
                                    }
                                } else {
                                    var40 = new class16(arg4, var12, arg0, arg2, var21, var20, var22, super.field1968, arg5, arg3, arg10);
                                }
                                class556.method3239(arg0, arg1, arg7, var40, (class194) null);
                                if (var12.field8398 && class357.field5400) {
                                    if (~arg3 != -1) {
                                        if (arg3 == 1) {
                                            var19.method625(arg1 + 1, arg7 + 1, 50);
                                        } else if (arg3 != 2) {
                                            if (arg3 == 3) {
                                                var19.method625(arg1, arg7, 50);
                                            }
                                        } else {
                                            var19.method625(arg1 - -1, arg7, 50);
                                        }
                                    } else {
                                        var19.method625(arg1, arg7 - -1, 50);
                                    }
                                }
                                if (~var12.field8368 != -1 && arg8 != null) {
                                    arg8.method1643(arg1, arg7, !var12.field8418, var12.field8383, arg3, arg5, -128);
                                }
                            } else if (~arg5 == -10) {
                                class559 var41;
                                if (!var24) {
                                    var41 = new class196(arg4, var12, arg0, arg2, var21, var20, var22, super.field1968, arg1, arg1 - -var13 + -1, arg7, arg7 + -1 - -var14, arg5, arg3, arg10);
                                } else {
                                    class235 var42 = new class235(arg4, var12, arg0, arg2, var21, var20, var22, super.field1968, arg1, arg1, arg7, arg7, arg5, arg3, var23);
                                    if (var42.method88((byte) 103)) {
                                        var42.method91(arg4, true);
                                    }
                                    var41 = var42;
                                }
                                class719.method3967(var41, false);
                                if (var12.field8420 == 1 && !super.field1968) {
                                    byte var43;
                                    if (~(arg3 & 1) == -1) {
                                        var43 = 8;
                                    } else {
                                        var43 = 16;
                                    }
                                    class322.method2089(-5474, var43, arg1, var12.field8440, arg0, 0, arg7);
                                }
                                if (var12.field8368 != 0 && arg8 != null) {
                                    arg8.method1641(var13, -1, arg7, arg1, !var12.field8418, var12.field8383, var14);
                                }
                                if (~var12.field8369 != -65) {
                                    class93.method780(arg0, arg1, arg7, var12.field8369);
                                }
                            } else if (~arg5 == -5) {
                                class466 var44;
                                if (!var24) {
                                    var44 = new class93(arg4, var12, arg0, arg2, var21, var20, var22, super.field1968, 0, 0, arg5, arg3, arg10);
                                } else {
                                    class734 var45 = new class734(arg4, var12, arg0, arg2, var21, var20, var22, super.field1968, 0, 0, arg5, arg3);
                                    if (var45.method88((byte) 58)) {
                                        var45.method91(arg4, true);
                                    }
                                    var44 = var45;
                                }
                                class734.method4097(arg0, arg1, arg7, var44, (class466) null);
                            } else if (~arg5 == -6) {
                                int var46 = 65;
                                class523 var47 = (class523) class486.method2948(arg0, arg1, arg7);
                                if (var47 != null) {
                                    var46 = 1 + class576.field8167.method3074(0, var47.method87(2836)).field8369;
                                }
                                class466 var49;
                                if (var24) {
                                    class734 var48 = new class734(arg4, var12, arg0, arg2, var21, var20, var22, super.field1968, class512.field7445[arg3] * var46, class41.field719[arg3] * var46, arg5, arg3);
                                    if (var48.method88((byte) 91)) {
                                        var48.method91(arg4, true);
                                    }
                                    var49 = var48;
                                } else {
                                    var49 = new class93(arg4, var12, arg0, arg2, var21, var20, var22, super.field1968, class512.field7445[arg3] * var46, class41.field719[arg3] * var46, arg5, arg3, arg10);
                                }
                                class734.method4097(arg0, arg1, arg7, var49, (class466) null);
                            } else if (arg5 == 6) {
                                int var50 = 33;
                                class523 var51 = (class523) class486.method2948(arg0, arg1, arg7);
                                if (var51 != null) {
                                    var50 = 1 + class576.field8167.method3074(0, var51.method87(2836)).field8369 / 2;
                                }
                                class466 var52;
                                if (!var24) {
                                    var52 = new class93(arg4, var12, arg0, arg2, var21, var20, var22, super.field1968, class27.field269[arg3] * var50, class168.field2924[arg3] * var50, arg5, arg3 + 4, arg10);
                                } else {
                                    class734 var53 = new class734(arg4, var12, arg0, arg2, var21, var20, var22, super.field1968, class512.field7445[arg3] * var50, class41.field719[arg3] * var50, arg5, arg3 - -4);
                                    var52 = var53;
                                    if (var53.method88((byte) 65)) {
                                        var53.method91(arg4, true);
                                    }
                                }
                                class734.method4097(arg0, arg1, arg7, var52, (class466) null);
                            } else if (arg5 == 7) {
                                int var54 = 3 & arg3 + 2;
                                class466 var55;
                                if (!var24) {
                                    var55 = new class93(arg4, var12, arg0, arg2, var21, var20, var22, super.field1968, 0, 0, arg5, var54 + 4, arg10);
                                } else {
                                    class734 var56 = new class734(arg4, var12, arg0, arg2, var21, var20, var22, super.field1968, 0, 0, arg5, var54 + 4);
                                    if (var56.method88((byte) 82)) {
                                        var56.method91(arg4, !arg9);
                                    }
                                    var55 = var56;
                                }
                                class734.method4097(arg0, arg1, arg7, var55, (class466) null);
                            } else if (arg5 == 8) {
                                int var57 = arg3 - -2 & 3;
                                int var58 = 33;
                                class523 var59 = (class523) class486.method2948(arg0, arg1, arg7);
                                if (var59 != null) {
                                    var58 = class576.field8167.method3074(0, var59.method87(2836)).field8369 / 2 - -1;
                                }
                                class466 var61;
                                class466 var63;
                                if (!var24) {
                                    class93 var60 = new class93(arg4, var12, arg0, arg2, var21, var20, var22, super.field1968, class27.field269[arg3] * var58, class168.field2924[arg3] * var58, arg5, arg3 + 4, arg10);
                                    var61 = var60;
                                    class93 var62 = new class93(arg4, var12, arg0, arg2, var21, var20, var22, super.field1968, 0, 0, arg5, var57 + 4, arg10);
                                    var63 = var62;
                                } else {
                                    class734 var64 = new class734(arg4, var12, arg0, arg2, var21, var20, var22, super.field1968, class27.field269[arg3] * var58, class168.field2924[arg3] * var58, arg5, arg3 - -4);
                                    class734 var65 = new class734(arg4, var12, arg0, arg2, var21, var20, var22, super.field1968, 0, 0, arg5, var57 + 4);
                                    if (var64.method88((byte) 105)) {
                                        var64.method91(arg4, true);
                                    }
                                    var61 = var64;
                                    var63 = var65;
                                    if (var65.method88((byte) 82)) {
                                        var65.method91(arg4, true);
                                    }
                                }
                                class734.method4097(arg0, arg1, arg7, var61, var63);
                            }
                        } else {
                            class559 var27;
                            if (!var24) {
                                var27 = new class196(arg4, var12, arg0, arg2, var21, var20, var22, super.field1968, arg1, arg1 + var13 + -1, arg7, arg7 + -1 + var14, arg5, arg3, arg10);
                            } else {
                                class235 var28 = new class235(arg4, var12, arg0, arg2, var21, var20, var22, super.field1968, arg1, arg1 + var13 + -1, arg7, arg7 - 1 + var14, arg5, arg3, var23);
                                var27 = var28;
                                if (var28.method88((byte) 106)) {
                                    var28.method91(arg4, true);
                                }
                            }
                            class719.method3967(var27, false);
                            if (class357.field5400 && !super.field1968 && arg5 >= 12 && ~arg5 >= -18 && arg5 != 13 && ~arg0 < -1 && ~var12.field8420 != -1) {
                                super.field1970[arg0][arg1][arg7] = (byte) class112.method903(super.field1970[arg0][arg1][arg7], 4);
                            }
                            if (~var12.field8368 != -1 && arg8 != null) {
                                arg8.method1641(var13, -1, arg7, arg1, !var12.field8418, var12.field8383, var14);
                            }
                        }
                    } else {
                        class235 var66 = null;
                        class559 var68;
                        int var69;
                        if (var24) {
                            class235 var67 = new class235(arg4, var12, arg0, arg2, var21, var20, var22, super.field1968, arg1, arg1 + var13 + -1, arg7, arg7 - -var14 + -1, arg5, arg3, var23);
                            var68 = var67;
                            var66 = var67;
                            var69 = var67.method1620((byte) -32);
                        } else {
                            var68 = new class196(arg4, var12, arg0, arg2, var21, var20, var22, super.field1968, arg1, arg1 + var13 + -1, arg7, arg7 - -var14 + -1, arg5, arg3, arg10);
                            var69 = 15;
                        }
                        if (class719.method3967(var68, false)) {
                            if (var66 != null && var66.method88((byte) 60)) {
                                var66.method91(arg4, true);
                            }
                            if (var12.field8398 && class357.field5400) {
                                if (~var69 < -31) {
                                    var69 = 30;
                                }
                                for (int var70 = 0; var70 <= var13; ++var70) {
                                    for (int var71 = 0; ~var14 <= ~var71; ++var71) {
                                        var19.method625(arg1 + var70, arg7 + var71, var69);
                                    }
                                }
                            }
                        }
                        if (var12.field8368 != 0 && arg8 != null) {
                            arg8.method1641(var13, -1, arg7, arg1, !var12.field8418, var12.field8383, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(IIILup;IILha;)V", line = 996)
    public final void method2813(int arg0, int arg1, int arg2, class238 arg3, int arg4, int arg5, class544 arg6) {
        if (arg1 >= -29) {
            field6667 = null;
        }
        ++field6664;
        class523 var8 = this.method2815(arg5, arg4, arg0, arg2, true);
        if (var8 != null) {
            class595 var9 = class576.field8167.method3074(0, var8.method87(2836));
            int var10 = var8.method85((byte) -72);
            int var11 = var8.method98(-12194);
            if (var9.method3415(-25)) {
                class340.method2164(arg5, arg2, var9, -1, arg4);
            }
            if (var8.method88((byte) 48)) {
                var8.method96((byte) 89, arg6);
            }
            if (~arg0 != -1) {
                if (arg0 != 1) {
                    if (arg0 != 2) {
                        if (~arg0 == -4) {
                            class380.method2393(arg5, arg2, arg4);
                            if (~var9.field8368 == -2) {
                                arg3.method1649((byte) 70, arg4, arg2);
                                return;
                            }
                        }
                    } else {
                        class499.method3032(arg5, arg2, arg4, field6678 != null ? field6678 : (field6678 = method2821("tw")));
                        if (var9.field8368 != 0 && ~(var9.field8384 + arg2) > ~super.field1978 && var9.field8384 + arg4 < super.field1982 && super.field1978 > var9.field8429 + arg2 && ~(var9.field8429 + arg4) > ~super.field1982) {
                            arg3.method1642(arg2, arg4, var9.field8384, var11, 11313, var9.field8383, !var9.field8418, var9.field8429);
                        }
                        if (~var10 != -10) {
                            return;
                        }
                        if ((1 & var11) == 0) {
                            class223.method1577(arg5, (byte) -64, arg2, arg4, 8);
                            return;
                        }
                        class223.method1577(arg5, (byte) -64, arg2, arg4, 16);
                    }
                    return;
                } else {
                    class357.method2280(arg5, arg2, arg4);
                    return;
                }
            }
            class99.method816(arg5, arg2, arg4);
            if (~var9.field8368 != -1) {
                arg3.method1638(!var9.field8418, arg2, var10, var11, var9.field8383, arg4, true);
            }
            if (~var9.field8420 == -2) {
                if (~var11 != -1) {
                    if (~var11 == -2) {
                        class223.method1577(arg5, (byte) -64, arg2, arg4 + 1, 2);
                        return;
                    }
                    if (~var11 == -3) {
                        class223.method1577(arg5, (byte) -64, arg2 + 1, arg4, 1);
                        return;
                    }
                    if (~var11 == -4) {
                        class223.method1577(arg5, (byte) -64, arg2, arg4, 2);
                        return;
                    }
                } else {
                    class223.method1577(arg5, (byte) -64, arg2, arg4, 1);
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(IZLha;)V", line = 1090)
    public final void method2814(int arg0, boolean arg1, class544 arg2) {
        if (arg0 != 0) {
            method2820(27);
        }
        ++field6675;
        class277.method1816();
        if (!arg1) {
            if (super.field1963 > 1) {
                for (int var4 = 0; ~super.field1978 < ~var4; ++var4) {
                    for (int var5 = 0; var5 < super.field1982; ++var5) {
                        if ((class434.field6341[1][var4][var5] & 2) == 2) {
                            class674.method3764(var4, var5);
                        }
                    }
                }
            }
            for (int var6 = 0; super.field1963 > var6; ++var6) {
                for (int var7 = 0; var7 <= super.field1982; ++var7) {
                    for (int var8 = 0; ~var8 >= ~super.field1978; ++var8) {
                        if ((super.field1970[var6][var8][var7] & 4) != 0) {
                            int var9 = var8;
                            int var10 = var8;
                            int var11 = var7;
                            int var12 = var7;
                            while (var11 > 0 && (super.field1970[var6][var8][var11 + -1] & 4) != 0 && ~(-var11 + var12) > -11) {
                                --var11;
                            }
                            while (super.field1982 > var12 && ~(super.field1970[var6][var8][var12 + 1] & 4) != -1 && -var11 + var12 < 10) {
                                ++var12;
                            }
                            label117: while (var9 > 0 && ~(var10 - var9) > -11) {
                                for (int var13 = var11; ~var12 <= ~var13; ++var13) {
                                    if (~(super.field1970[var6][var9 + -1][var13] & 4) == -1) {
                                        break label117;
                                    }
                                }
                                --var9;
                            }
                            label104: while (~var10 > ~super.field1978 && ~(var10 - var9) > -11) {
                                for (int var14 = var11; var14 <= var12; ++var14) {
                                    if (~(super.field1970[var6][var10 + 1][var14] & 4) == -1) {
                                        break label104;
                                    }
                                }
                                ++var10;
                            }
                            if ((var12 - (var11 + -1)) * (var10 - var9 + 1) >= 4) {
                                int var15 = super.field1962[var6][var9][var11];
                                class554.method3233((var12 << 9) + 512, 6, 4, var11 << 9, var9 << 9, var6, var15, var15, (var10 << 9) + 512);
                                for (int var16 = var9; var16 <= var10; ++var16) {
                                    for (int var17 = var11; ~var17 >= ~var12; ++var17) {
                                        super.field1970[var6][var16][var17] = (byte) class636.method3603(super.field1970[var6][var16][var17], -5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class710.method3932(arg0 ^ 44);
        }
        super.field1970 = null;
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(IIIIZ)Ltw;", line = 1228)
    private final class523 method2815(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field6668;
        class523 var6 = null;
        if (!arg4) {
            this.method2819(101, -109, -128, -114, -38, (byte[]) null, (class544) null, 54, -54, (class238[]) null, 111);
        }
        if (arg2 == 0) {
            var6 = (class523) class486.method2948(arg0, arg3, arg1);
        }
        if (arg2 == 1) {
            var6 = (class523) class55.method521(arg0, arg3, arg1);
        }
        if (arg2 == 2) {
            var6 = (class523) class140.method1093(arg0, arg3, arg1, field6678 != null ? field6678 : (field6678 = method2821("tw")));
        }
        if (arg2 == 3) {
            var6 = (class523) class558.method3243(arg0, arg3, arg1);
        }
        return var6;
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(BIIIILofa;Lha;III[I)V", line = 1257)
    public final void method2816(byte arg0, int arg1, int arg2, int arg3, int arg4, class301 arg5, class544 arg6, int arg7, int arg8, int arg9, int[] arg10) {
        ++field6672;
        if (!super.field1968) {
            boolean var12 = false;
            class22 var13 = null;
            if (arg10 != null) {
                arg10[0] = -1;
            }
            int var14 = (arg3 & 7) * 8;
            int var15 = (7 & arg1) * 8;
            while (true) {
                while (true) {
                    while (true) {
                        while (true) {
                            while (arg5.field4534 < arg5.field4543.length) {
                                int var21 = arg5.method1987(-68);
                                if (var21 != 0) {
                                    if (~var21 != -2) {
                                        if (var21 != 2) {
                                            if (var21 != 128) {
                                                if (~var21 != -130) {
                                                    throw new IllegalStateException("");
                                                }
                                                if (super.field1974 == null) {
                                                    super.field1974 = new byte[4][][];
                                                }
                                                for (int var22 = 0; ~var22 > -5; ++var22) {
                                                    byte var23 = arg5.method1984(4);
                                                    if (~var23 == -1 && super.field1974[arg4] != null) {
                                                        if (~var22 >= ~arg2) {
                                                            int var24 = arg8;
                                                            int var25 = arg8 + 7;
                                                            int var26 = arg7;
                                                            if (~arg8 <= -1) {
                                                                if (arg8 >= super.field1978) {
                                                                    var24 = super.field1978;
                                                                }
                                                            } else {
                                                                var24 = 0;
                                                            }
                                                            if (arg7 >= 0) {
                                                                if (~super.field1982 >= ~arg7) {
                                                                    var26 = super.field1982;
                                                                }
                                                            } else {
                                                                var26 = 0;
                                                            }
                                                            if (~var25 > -1) {
                                                                var25 = 0;
                                                            } else if (~var25 <= ~super.field1978) {
                                                                var25 = super.field1978;
                                                            }
                                                            int var27 = arg7 - -7;
                                                            if (var27 >= 0) {
                                                                if (super.field1982 <= var27) {
                                                                    var27 = super.field1982;
                                                                }
                                                            } else {
                                                                var27 = 0;
                                                            }
                                                            while (~var25 < ~var24) {
                                                                while (var27 > var26) {
                                                                    super.field1974[arg4][var24][var26] = 0;
                                                                    ++var26;
                                                                }
                                                                ++var24;
                                                            }
                                                        }
                                                    } else if (var23 == 1) {
                                                        if (super.field1974[arg4] == null) {
                                                            super.field1974[arg4] = new byte[super.field1978 + 1][super.field1982 - -1];
                                                        }
                                                        for (int var28 = 0; var28 < 64; var28 += 4) {
                                                            for (int var29 = 0; var29 < 64; var29 += 4) {
                                                                byte var30 = arg5.method1984(4);
                                                                if (var22 <= arg2) {
                                                                    for (int var31 = var28; ~(var28 - -4) < ~var31; ++var31) {
                                                                        for (int var32 = var29; var32 < var29 + 4; ++var32) {
                                                                            if (var14 <= var31 && ~var31 > ~(var14 + 8) && ~var15 >= ~var32 && var15 + 8 > var15) {
                                                                                int var33 = arg8 - -class673.method3759((byte) -122, 7 & var31, var32 & 7, arg9);
                                                                                int var34 = class671.method3753(7 & var32, var31 & 7, arg9, (byte) -127) + arg7;
                                                                                if (var33 >= 0 && ~var33 > ~super.field1978 && var34 >= 0 && super.field1982 > var34) {
                                                                                    super.field1974[arg4][var33][var34] = var30;
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
                                                arg10[0] = arg5.method1989((byte) -111);
                                                arg10[1] = arg5.method1977((byte) 93);
                                                arg10[2] = arg5.method1977((byte) -121);
                                                arg10[3] = arg5.method1977((byte) 62);
                                                arg10[4] = arg5.method1989((byte) -99);
                                            } else {
                                                arg5.field4534 += 10;
                                            }
                                        } else {
                                            if (var13 == null) {
                                                var13 = new class22();
                                            }
                                            var13.method121(-5491, arg5);
                                        }
                                    } else {
                                        int var35 = arg5.method1987(-121);
                                        if (~var35 < -1) {
                                            for (int var36 = 0; var36 < var35; ++var36) {
                                                class639 var37 = new class639(arg6, arg5, 2);
                                                if (~var37.field8973 == -32) {
                                                    class204 var38 = class451.field6568.method2395((byte) 29, arg5.method1989((byte) -118));
                                                    var37.method3617(var38.field3438, var38.field3441, 79, var38.field3439, var38.field3436);
                                                }
                                                if (arg6.method356() > 0) {
                                                    class759 var39 = var37.field8979;
                                                    int var40 = var39.method4228(-116) >> 9;
                                                    int var41 = var39.method4223((byte) -63) >> 9;
                                                    if (~var37.field8965 == ~arg2 && var40 >= var14 && ~var40 > ~(var14 + 8) && ~var41 <= ~var15 && ~(var15 - -8) < ~var41) {
                                                        int var42 = (arg8 << 9) - -class454.method2789(var39.method4223((byte) -17) & 4095, 4095 & var39.method4228(-118), 13127, arg9);
                                                        int var43 = (arg7 << 9) + class418.method2570(var39.method4223((byte) -10) & 4095, arg9, var39.method4228(-114) & 4095, -125);
                                                        int var44 = var42 >> 9;
                                                        int var45 = var43 >> 9;
                                                        if (~var44 <= -1 && var45 >= 0 && ~var44 > ~super.field1978 && super.field1982 > var45) {
                                                            var39.method8(var42, var43, super.field1962[arg2][var44][var45] - var39.method4221((byte) -7), (byte) -28);
                                                            class129.method1043(var37);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    var13 = new class22(arg5);
                                }
                            }
                            if (var13 != null) {
                                class581.method3352(false, arg8 >> 3, var13, arg7 >> 3);
                            }
                            int var16 = 38 % ((53 - arg0) / 43);
                            if (!var12 && super.field1974 != null && super.field1974[arg4] != null) {
                                int var17 = arg8 - -7;
                                int var18 = arg7 + 7;
                                for (int var19 = arg8; var19 < var17; ++var19) {
                                    for (int var20 = arg7; ~var20 > ~var18; ++var20) {
                                        super.field1974[arg4][var19][var20] = 0;
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

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "([Lup;ILha;I[BI)V", line = 1548)
    public final void method2817(class238[] arg0, int arg1, class544 arg2, int arg3, byte[] arg4, int arg5) {
        ++field6669;
        class301 var7 = new class301(arg4);
        int var8 = arg3;
        while (true) {
            int var9 = var7.method1941(arg3 + 32768);
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method1968((byte) 24);
                if (~var11 == -1) {
                    break;
                }
                var10 += var11 + -1;
                int var12 = 63 & var10;
                int var13 = 63 & var10 >> 6;
                int var14 = var10 >> 12;
                int var15 = var7.method1987(arg3 + -2);
                int var16 = var15 >> 2;
                int var17 = 3 & var15;
                int var18 = arg5 + var13;
                int var19 = arg1 + var12;
                if (var18 > 0 && ~var19 < -1 && ~(super.field1978 - 1) < ~var18 && var19 < super.field1982 + -1) {
                    class238 var20 = null;
                    if (!super.field1968) {
                        int var21 = var14;
                        if ((2 & class434.field6341[1][var18][var19]) == 2) {
                            var21 = var14 - 1;
                        }
                        if (~var21 <= -1) {
                            var20 = arg0[var21];
                        }
                    }
                    this.method2812(var14, var18, var14, var17, arg2, var16, var8, var19, var20, false, -1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fea", name = "<init>", descriptor = "(IIIZ)V", line = 1619)
    public class460(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class497.field7205, class338.field4951);
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 1625)
    public static final boolean method2818(int arg0, String arg1) {
        ++field6665;
        if (arg0 != -1) {
            method2820(72);
        }
        return class602.field8515.containsKey(arg1);
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(IIIII[BLha;II[Lup;I)V", line = 1644)
    public final void method2819(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, class544 arg6, int arg7, int arg8, class238[] arg9, int arg10) {
        ++field6674;
        class301 var12 = new class301(arg5);
        int var13 = arg2;
        while (true) {
            int var14 = var12.method1941(32767);
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method1968((byte) 45);
                if (~var16 == -1) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 63;
                int var18 = (var15 & 4079) >> 6;
                int var19 = var15 >> 12;
                int var20 = var12.method1987(-10);
                int var21 = var20 >> 2;
                int var22 = 3 & var20;
                if (~arg1 == ~var19 && arg7 <= var18 && ~var18 > ~(arg7 + 8) && arg0 <= var17 && arg0 + 8 > var17) {
                    class595 var23 = class576.field8167.method3074(~arg2, var13);
                    int var24 = arg10 - -class377.method2377(var23.field8429, var18 & 7, (byte) -32, arg3, var17 & 7, var22, var23.field8384);
                    int var25 = arg8 - -class335.method2147(var18 & 7, var22, 0, 7 & var17, var23.field8384, arg3, var23.field8429);
                    if (~var24 < -1 && var25 > 0 && ~(super.field1978 + -1) < ~var24 && ~var25 > ~(super.field1982 + -1)) {
                        class238 var26 = null;
                        if (!super.field1968) {
                            int var27 = arg4;
                            if (~(2 & class434.field6341[1][var24][var25]) == -3) {
                                var27 = arg4 - 1;
                            }
                            if (var27 >= 0) {
                                var26 = arg9[var27];
                            }
                        }
                        this.method2812(arg4, var24, arg4, 3 & var22 - -arg3, arg6, var21, var13, var25, var26, false, -1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(I)V", line = 1725)
    public static void method2820(int arg0) {
        field6667 = null;
        field6677 = null;
        if (arg0 != 3614) {
            field6673 = -44;
        }
        field6671 = null;
    }
}
