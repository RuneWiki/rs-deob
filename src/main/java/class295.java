import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class295 extends class105 {

    @OriginalMember(owner = "client!tp", name = "T", descriptor = "I")
    public int field3849 = 99;

    @OriginalMember(owner = "client!tp", name = "O", descriptor = "I")
    public static int field3845 = 100;

    @OriginalMember(owner = "client!tp", name = "W", descriptor = "Z")
    public static boolean field3852 = false;

    @OriginalMember(owner = "client!tp", name = "G", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!tp", name = "H", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!tp", name = "I", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!tp", name = "K", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!tp", name = "L", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!tp", name = "M", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!tp", name = "N", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!tp", name = "Q", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!tp", name = "R", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!tp", name = "S", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!tp", name = "U", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!tp", name = "V", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!tp", name = "J", descriptor = "Lwu;")
    public static class557 field3840;

    // $FF: synthetic field
    @OriginalMember(owner = "client!tp", name = "X", descriptor = "Ljava/lang/Class;")
    public static Class field3853;

    // $FF: synthetic method
    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1738(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(III)Z", line = 3)
    public static final boolean method1725(int arg0, int arg1, int arg2) {
        ++field3838;
        int var3 = 53 % ((arg1 - 47) / 57);
        return (65536 & arg0) != 0;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(I[Lnt;Lha;I[BI)V", line = 14)
    public final void method1726(int arg0, class141[] arg1, class545 arg2, int arg3, byte[] arg4, int arg5) {
        ++field3843;
        class26 var7 = new class26(arg4);
        if (arg0 != 9186) {
            field3845 = 100;
        }
        int var8 = -1;
        while (true) {
            int var9 = var7.method180(arg0 + -9072);
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method190(-27226);
                if (var11 == 0) {
                    break;
                }
                var10 += var11 + -1;
                int var12 = 63 & var10;
                int var13 = 63 & var10 >> 6;
                int var14 = var10 >> 12;
                int var15 = var7.method194((byte) 119);
                int var16 = var15 >> 2;
                int var17 = var15 & 3;
                int var18 = arg3 + var13;
                int var19 = arg5 + var12;
                if (~var18 < -1 && ~var19 < -1 && super.field1520 + -1 > var18 && ~var19 > ~(super.field1514 + -1)) {
                    class141 var20 = null;
                    if (!super.field1519) {
                        int var21 = var14;
                        if (~(class429.field5916[1][var18][var19] & 2) == -3) {
                            var21 = var14 - 1;
                        }
                        if (var21 >= 0) {
                            var20 = arg1[var21];
                        }
                    }
                    this.method1731(var20, -1, arg2, var17, (byte) -102, var14, var8, var19, var16, var14, var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "([IIIIILvj;IIILha;I)V", line = 94)
    public final void method1727(int[] arg0, int arg1, int arg2, int arg3, int arg4, class26 arg5, int arg6, int arg7, int arg8, class545 arg9, int arg10) {
        ++field3851;
        if (!super.field1519) {
            boolean var12 = false;
            if (arg3 != 4397) {
                method1737(76, -94, 4, false, -19, 94);
            }
            if (arg0 != null) {
                arg0[0] = -1;
            }
            class364 var13 = null;
            int var14 = (arg7 & 7) * 8;
            int var15 = (arg6 & 7) * 8;
            while (true) {
                while (true) {
                    while (true) {
                        while (true) {
                            while (arg5.field279.length > arg5.field330) {
                                int var20 = arg5.method194((byte) 119);
                                if (~var20 != -1) {
                                    if (~var20 != -2) {
                                        if (var20 != 2) {
                                            if (var20 == 128) {
                                                if (arg0 != null) {
                                                    arg0[0] = arg5.method193(2);
                                                    arg0[1] = arg5.method173(-3);
                                                    arg0[2] = arg5.method173(-3);
                                                    arg0[3] = arg5.method173(class450.method2703(arg3, -4400));
                                                    arg0[4] = arg5.method193(2);
                                                } else {
                                                    arg5.field330 += 10;
                                                }
                                            } else {
                                                if (~var20 != -130) {
                                                    throw new IllegalStateException("");
                                                }
                                                if (super.field1530 == null) {
                                                    super.field1530 = new byte[4][][];
                                                }
                                                for (int var21 = 0; var21 < 4; ++var21) {
                                                    byte var22 = arg5.method195(arg3 ^ 4525);
                                                    if (~var22 == -1 && super.field1530[arg10] != null) {
                                                        if (var21 <= arg1) {
                                                            int var23 = arg4;
                                                            int var24 = arg4 + 7;
                                                            int var25 = arg2;
                                                            if (arg4 < 0) {
                                                                var23 = 0;
                                                            } else if (~super.field1520 >= ~arg4) {
                                                                var23 = super.field1520;
                                                            }
                                                            if (~var24 <= -1) {
                                                                if (~super.field1520 >= ~var24) {
                                                                    var24 = super.field1520;
                                                                }
                                                            } else {
                                                                var24 = 0;
                                                            }
                                                            if (arg2 < 0) {
                                                                var25 = 0;
                                                            } else if (~arg2 <= ~super.field1514) {
                                                                var25 = super.field1514;
                                                            }
                                                            int var26 = arg2 + 7;
                                                            if (var26 < 0) {
                                                                var26 = 0;
                                                            } else if (~super.field1514 >= ~var26) {
                                                                var26 = super.field1514;
                                                            }
                                                            while (~var23 > ~var24) {
                                                                while (var26 > var25) {
                                                                    super.field1530[arg10][var23][var25] = 0;
                                                                    ++var25;
                                                                }
                                                                ++var23;
                                                            }
                                                        }
                                                    } else if (~var22 == -2) {
                                                        if (super.field1530[arg10] == null) {
                                                            super.field1530[arg10] = new byte[super.field1520 + 1][super.field1514 + 1];
                                                        }
                                                        for (int var27 = 0; var27 < 64; var27 += 4) {
                                                            for (int var28 = 0; var28 < 64; var28 += 4) {
                                                                byte var29 = arg5.method195(128);
                                                                if (~var21 >= ~arg1) {
                                                                    for (int var30 = var27; var30 < var27 + 4; ++var30) {
                                                                        for (int var31 = var28; var31 < var28 + 4; ++var31) {
                                                                            if (var30 >= var14 && var14 + 8 > var30 && var31 >= var15 && ~(var15 + 8) < ~var15) {
                                                                                int var32 = arg4 - -class259.method1612(arg3 + -33497, 7 & var30, 7 & var31, arg8);
                                                                                int var33 = class576.method3433(7 & var31, arg8, arg3 + -4397, var30 & 7) + arg2;
                                                                                if (~var32 <= -1 && var32 < super.field1520 && ~var33 <= -1 && ~var33 > ~super.field1514) {
                                                                                    super.field1530[arg10][var32][var33] = var29;
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
                                            if (var13 == null) {
                                                var13 = new class364();
                                            }
                                            var13.method2043((byte) -98, arg5);
                                        }
                                    } else {
                                        int var34 = arg5.method194((byte) 119);
                                        if (~var34 < -1) {
                                            for (int var35 = 0; ~var35 > ~var34; ++var35) {
                                                class519 var36 = new class519(arg9, arg5, 2);
                                                if (var36.field7241 == 31) {
                                                    class326 var37 = class125.field1706.method3565(arg5.method193(2), false);
                                                    var36.method3080(var37.field4196, (byte) 109, var37.field4197, var37.field4200, var37.field4201);
                                                }
                                                if (~arg9.method2124() < -1) {
                                                    class757 var38 = var36.field7244;
                                                    int var39 = var38.method4203(20918) >> 9;
                                                    int var40 = var38.method4205((byte) 8) >> 9;
                                                    if (~var36.field7249 == ~arg1 && ~var39 <= ~var14 && var14 + 8 > var39 && var40 >= var15 && ~(var15 - -8) < ~var40) {
                                                        int var41 = (arg4 << 9) + class191.method1268((byte) -88, arg8, var38.method4205((byte) 8) & 4095, var38.method4203(arg3 ^ 16539) & 4095);
                                                        int var42 = var41 >> 9;
                                                        int var43 = class544.method3252(arg8, 4095 & var38.method4203(20918), -24, 4095 & var38.method4205((byte) 8)) + (arg2 << 9);
                                                        int var44 = var43 >> 9;
                                                        if (var42 >= 0 && var44 >= 0 && ~super.field1520 < ~var42 && var44 < super.field1514) {
                                                            var38.method2618(super.field1527[arg1][var42][var44] - var38.method4212(-54), (byte) -108, var43, var41);
                                                            class502.method3001(var36);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    var13 = new class364(arg5);
                                }
                            }
                            if (var13 != null) {
                                class638.method3712(arg2 >> 3, -1958, var13, arg4 >> 3);
                            }
                            if (!var12 && super.field1530 != null && super.field1530[arg10] != null) {
                                int var16 = arg4 + 7;
                                int var17 = arg2 + 7;
                                for (int var18 = arg4; ~var16 < ~var18; ++var18) {
                                    for (int var19 = arg2; var17 > var19; ++var19) {
                                        super.field1530[arg10][var18][var19] = 0;
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

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V", line = 386)
    public static void method1728(int arg0) {
        if (arg0 != 0) {
            method1737(-23, -128, -103, false, -19, 110);
        }
        field3840 = null;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(FIFIIFFIFILgaa;)[B", line = 396)
    public static final byte[] method1729(float arg0, int arg1, float arg2, int arg3, int arg4, float arg5, float arg6, int arg7, float arg8, int arg9, class71 arg10) {
        ++field3839;
        if (arg9 < 81) {
            method1737(37, 66, -99, true, -103, 34);
        }
        byte[] var11 = new byte[arg1 * arg4 * arg7];
        class500.method2989(arg3, arg10, arg8, 0, var11, arg7, (byte) -123, arg5, arg6, arg1, arg4, arg2, arg0);
        return var11;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(II[Lnt;IILha;IZ[BII)V", line = 410)
    public final void method1730(int arg0, int arg1, class141[] arg2, int arg3, int arg4, class545 arg5, int arg6, boolean arg7, byte[] arg8, int arg9, int arg10) {
        ++field3848;
        if (arg7) {
            class26 var12 = new class26(arg8);
            int var13 = -1;
            while (true) {
                int var14 = var12.method180(75);
                if (var14 == 0) {
                    return;
                }
                var13 += var14;
                int var15 = 0;
                while (true) {
                    int var16 = var12.method190(-27226);
                    if (~var16 == -1) {
                        break;
                    }
                    var15 += var16 + -1;
                    int var17 = var15 & 63;
                    int var18 = 63 & var15 >> 6;
                    int var19 = var15 >> 12;
                    int var20 = var12.method194((byte) 119);
                    int var21 = var20 >> 2;
                    int var22 = 3 & var20;
                    if (arg0 == var19 && ~arg4 >= ~var18 && ~var18 > ~(arg4 + 8) && var17 >= arg1 && var17 < arg1 + 8) {
                        class30 var23 = class264.field3604.method3188(var13, (byte) -57);
                        int var24 = class608.method3554((byte) -39, var23.field440, var17 & 7, var23.field446, 7 & var18, var22, arg9) + arg6;
                        int var25 = arg3 + class426.method2595(arg9, var23.field446, 7, 7 & var17, var23.field440, var22, var18 & 7);
                        if (~var24 < -1 && var25 > 0 && ~(super.field1520 + -1) < ~var24 && ~(super.field1514 + -1) < ~var25) {
                            class141 var26 = null;
                            if (!super.field1519) {
                                int var27 = arg10;
                                if ((class429.field5916[1][var24][var25] & 2) == 2) {
                                    var27 = arg10 - 1;
                                }
                                if (var27 >= 0) {
                                    var26 = arg2[var27];
                                }
                            }
                            this.method1731(var26, -1, arg5, var22 - -arg9 & 3, (byte) -107, arg10, var13, var25, var21, arg10, var24);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lnt;ILha;IBIIIIII)V", line = 491)
    public final void method1731(class141 arg0, int arg1, class545 arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field3850;
        if (class674.field9500.field5113.method3798(0) != 0 || client.method2687(arg9, arg10, arg7, class183.field2654, -105)) {
            if (this.field3849 > arg5) {
                this.field3849 = arg5;
            }
            class30 var12 = class264.field3604.method3188(arg6, (byte) -57);
            if (class674.field9500.field5130.method1257(0) != 0 || !var12.field388) {
                int var13;
                int var14;
                if (arg3 != 1 && ~arg3 != -4) {
                    var13 = var12.field446;
                    var14 = var12.field440;
                } else {
                    var14 = var12.field446;
                    var13 = var12.field440;
                }
                int var15;
                int var16;
                if (~super.field1520 <= ~(arg10 - -var14)) {
                    var15 = arg10 - -(var14 >> 1);
                    var16 = (var14 - -1 >> 1) + arg10;
                } else {
                    var15 = arg10;
                    var16 = arg10 - -1;
                }
                int var17;
                int var18;
                if (arg7 - -var13 <= super.field1514) {
                    var17 = (var13 - -1 >> 1) + arg7;
                    var18 = (var13 >> 1) + arg7;
                } else {
                    var18 = arg7;
                    var17 = arg7 + 1;
                }
                class339 var19 = class52.field741[arg9];
                int var20 = var19.method1959(124, var18, var15) - -var19.method1959(126, var18, var16) - (-var19.method1959(127, var17, var15) - var19.method1959(127, var17, var16)) >> 2;
                int var21 = (arg10 << 9) + (var14 << 8);
                int var22 = (arg7 << 9) + (var13 << 8);
                boolean var23 = class400.field5545 && !super.field1519 && var12.field384;
                if (var12.method215(0)) {
                    class143.method937(arg7, var12, arg5, 19126, (class55) null, arg10, arg3, (class655) null);
                }
                boolean var24 = ~arg1 == 0 && ~var12.field387 == 0 && var12.field465 == null && var12.field455 == null && !var12.field379;
                if (!class111.field1587 || (!class70.method448(0, arg8) || var12.field417 == 1) && (!class374.method2257((byte) 58, arg8) || var12.field417 != 0)) {
                    if (~arg8 == -23) {
                        if (~class674.field9500.field5131.method2840(0) != -1 || ~var12.field467 != -1 || var12.field469 == 1 || var12.field461) {
                            class50 var25;
                            if (!var24) {
                                var25 = new class313(arg2, var12, arg5, arg9, var21, var20, var22, super.field1519, arg3, arg1);
                            } else {
                                class707 var26 = new class707(arg2, var12, arg5, arg9, var21, var20, var22, super.field1519, arg3, var23);
                                if (var26.method281(true)) {
                                    var26.method270(arg2, -6060);
                                }
                                var25 = var26;
                            }
                            class209.method1380(arg5, arg10, arg7, var25);
                            if (var12.field469 == 1 && arg0 != null) {
                                arg0.method914(arg7, (byte) 114, arg10);
                            }
                        }
                    } else if (arg8 != 10 && ~arg8 != -12) {
                        if ((arg8 < 12 || arg8 > 17) && (~arg8 > -19 || arg8 > 21)) {
                            if (~arg8 == -1) {
                                int var29 = var12.field417;
                                if (class591.field8483 && ~var12.field417 == 0) {
                                    var29 = 1;
                                }
                                class217 var30;
                                if (!var24) {
                                    var30 = new class314(arg2, var12, arg5, arg9, var21, var20, var22, super.field1519, arg8, arg3, arg1);
                                } else {
                                    class619 var31 = new class619(arg2, var12, arg5, arg9, var21, var20, var22, super.field1519, arg8, arg3, var23);
                                    var30 = var31;
                                    if (var31.method281(true)) {
                                        var31.method270(arg2, -6060);
                                    }
                                }
                                class744.method4145(arg5, arg10, arg7, var30, (class217) null);
                                if (~arg3 != -1) {
                                    if (arg3 != 1) {
                                        if (~arg3 != -3) {
                                            if (arg3 == 3) {
                                                if (class400.field5545 && var12.field377) {
                                                    var19.method516(arg10, arg7, 50);
                                                    var19.method516(arg10 + 1, arg7, 50);
                                                }
                                                if (var29 == 1 && !super.field1519) {
                                                    class604.method3544(arg7, var12.field399, 106, arg10, arg5, var12.field466, 2);
                                                }
                                            }
                                        } else {
                                            if (class400.field5545 && var12.field377) {
                                                var19.method516(arg10 + 1, arg7, 50);
                                                var19.method516(arg10 + 1, arg7 + 1, 50);
                                            }
                                            if (~var29 == -2 && !super.field1519) {
                                                class604.method3544(arg7, var12.field399, 113, arg10 + 1, arg5, -var12.field466, 1);
                                            }
                                        }
                                    } else {
                                        if (class400.field5545 && var12.field377) {
                                            var19.method516(arg10, arg7 + 1, 50);
                                            var19.method516(arg10 + 1, arg7 + 1, 50);
                                        }
                                        if (~var29 == -2 && !super.field1519) {
                                            class604.method3544(arg7 - -1, var12.field399, 127, arg10, arg5, -var12.field466, 2);
                                        }
                                    }
                                } else {
                                    if (class400.field5545 && var12.field377) {
                                        var19.method516(arg10, arg7, 50);
                                        var19.method516(arg10, arg7 + 1, 50);
                                    }
                                    if (~var29 == -2 && !super.field1519) {
                                        class604.method3544(arg7, var12.field399, 117, arg10, arg5, var12.field466, 1);
                                    }
                                }
                                if (var12.field469 != 0 && arg0 != null) {
                                    arg0.method915(arg8, arg7, arg10, (byte) -81, var12.field409, !var12.field441, arg3);
                                }
                                if (~var12.field430 != -65) {
                                    class416.method2533(arg5, arg10, arg7, var12.field430);
                                }
                            } else if (arg8 == 1) {
                                class217 var32;
                                if (!var24) {
                                    var32 = new class314(arg2, var12, arg5, arg9, var21, var20, var22, super.field1519, arg8, arg3, arg1);
                                } else {
                                    class619 var33 = new class619(arg2, var12, arg5, arg9, var21, var20, var22, super.field1519, arg8, arg3, var23);
                                    if (var33.method281(true)) {
                                        var33.method270(arg2, -6060);
                                    }
                                    var32 = var33;
                                }
                                class744.method4145(arg5, arg10, arg7, var32, (class217) null);
                                if (var12.field377 && class400.field5545) {
                                    if (~arg3 == -1) {
                                        var19.method516(arg10, arg7 + 1, 50);
                                    } else if (arg3 != 1) {
                                        if (arg3 != 2) {
                                            if (arg3 == 3) {
                                                var19.method516(arg10, arg7, 50);
                                            }
                                        } else {
                                            var19.method516(arg10 + 1, arg7, 50);
                                        }
                                    } else {
                                        var19.method516(arg10 + 1, arg7 - -1, 50);
                                    }
                                }
                                if (var12.field469 != 0 && arg0 != null) {
                                    arg0.method915(arg8, arg7, arg10, (byte) -81, var12.field409, !var12.field441, arg3);
                                }
                            } else {
                                if (arg4 >= -54) {
                                    this.method1731((class141) null, 63, (class545) null, -74, (byte) -53, 2, -9, 104, 123, -115, 63);
                                }
                                if (~arg8 == -3) {
                                    int var34 = 3 & arg3 - -1;
                                    class217 var37;
                                    class217 var38;
                                    if (var24) {
                                        class619 var35 = new class619(arg2, var12, arg5, arg9, var21, var20, var22, super.field1519, arg8, arg3 + 4, var23);
                                        class619 var36 = new class619(arg2, var12, arg5, arg9, var21, var20, var22, super.field1519, arg8, var34, var23);
                                        if (var35.method281(true)) {
                                            var35.method270(arg2, -6060);
                                        }
                                        var37 = var35;
                                        if (var36.method281(true)) {
                                            var36.method270(arg2, -6060);
                                        }
                                        var38 = var36;
                                    } else {
                                        var37 = new class314(arg2, var12, arg5, arg9, var21, var20, var22, super.field1519, arg8, arg3 + 4, arg1);
                                        var38 = new class314(arg2, var12, arg5, arg9, var21, var20, var22, super.field1519, arg8, var34, arg1);
                                    }
                                    class744.method4145(arg5, arg10, arg7, var37, var38);
                                    if ((~var12.field417 == -2 || class591.field8483 && ~var12.field417 == 0) && !super.field1519) {
                                        if (arg3 == 0) {
                                            class604.method3544(arg7, var12.field399, 74, arg10, arg5, var12.field466, 1);
                                            class604.method3544(arg7 - -1, var12.field399, 94, arg10, arg5, var12.field466, 2);
                                        } else if (arg3 == 1) {
                                            class604.method3544(arg7, var12.field399, 76, arg10 + 1, arg5, var12.field466, 1);
                                            class604.method3544(arg7 - -1, var12.field399, 112, arg10, arg5, var12.field466, 2);
                                        } else if (arg3 != 2) {
                                            if (~arg3 == -4) {
                                                class604.method3544(arg7, var12.field399, 97, arg10, arg5, var12.field466, 1);
                                                class604.method3544(arg7, var12.field399, 79, arg10, arg5, var12.field466, 2);
                                            }
                                        } else {
                                            class604.method3544(arg7, var12.field399, 80, arg10 + 1, arg5, var12.field466, 1);
                                            class604.method3544(arg7, var12.field399, 94, arg10, arg5, var12.field466, 2);
                                        }
                                    }
                                    if (var12.field469 != 0 && arg0 != null) {
                                        arg0.method915(arg8, arg7, arg10, (byte) -81, var12.field409, !var12.field441, arg3);
                                    }
                                    if (~var12.field430 != -65) {
                                        class416.method2533(arg5, arg10, arg7, var12.field430);
                                    }
                                } else if (arg8 == 3) {
                                    class217 var40;
                                    if (var24) {
                                        class619 var39 = new class619(arg2, var12, arg5, arg9, var21, var20, var22, super.field1519, arg8, arg3, var23);
                                        if (var39.method281(true)) {
                                            var39.method270(arg2, -6060);
                                        }
                                        var40 = var39;
                                    } else {
                                        var40 = new class314(arg2, var12, arg5, arg9, var21, var20, var22, super.field1519, arg8, arg3, arg1);
                                    }
                                    class744.method4145(arg5, arg10, arg7, var40, (class217) null);
                                    if (var12.field377 && class400.field5545) {
                                        if (arg3 != 0) {
                                            if (~arg3 == -2) {
                                                var19.method516(arg10 + 1, arg7 + 1, 50);
                                            } else if (~arg3 != -3) {
                                                if (~arg3 == -4) {
                                                    var19.method516(arg10, arg7, 50);
                                                }
                                            } else {
                                                var19.method516(arg10 + 1, arg7, 50);
                                            }
                                        } else {
                                            var19.method516(arg10, arg7 + 1, 50);
                                        }
                                    }
                                    if (var12.field469 != 0 && arg0 != null) {
                                        arg0.method915(arg8, arg7, arg10, (byte) -81, var12.field409, !var12.field441, arg3);
                                    }
                                } else if (~arg8 == -10) {
                                    class743 var42;
                                    if (var24) {
                                        class79 var41 = new class79(arg2, var12, arg5, arg9, var21, var20, var22, super.field1519, arg10, arg10, arg7, arg7, arg8, arg3, var23);
                                        if (var41.method281(true)) {
                                            var41.method270(arg2, -6060);
                                        }
                                        var42 = var41;
                                    } else {
                                        var42 = new class541(arg2, var12, arg5, arg9, var21, var20, var22, super.field1519, arg10, arg10 - -var14 - 1, arg7, arg7 + var13 + -1, arg8, arg3, arg1);
                                    }
                                    class257.method1603(var42, false);
                                    if (var12.field417 == 1 && !super.field1519) {
                                        byte var43;
                                        if ((arg3 & 1) == 0) {
                                            var43 = 8;
                                        } else {
                                            var43 = 16;
                                        }
                                        class604.method3544(arg7, var12.field399, 114, arg10, arg5, 0, var43);
                                    }
                                    if (var12.field469 != 0 && arg0 != null) {
                                        arg0.method911(1, var14, !var12.field441, arg10, var12.field409, var13, arg7);
                                    }
                                    if (~var12.field430 != -65) {
                                        class416.method2533(arg5, arg10, arg7, var12.field430);
                                    }
                                } else if (~arg8 == -5) {
                                    class95 var45;
                                    if (var24) {
                                        class733 var44 = new class733(arg2, var12, arg5, arg9, var21, var20, var22, super.field1519, 0, 0, arg8, arg3);
                                        if (var44.method281(true)) {
                                            var44.method270(arg2, -6060);
                                        }
                                        var45 = var44;
                                    } else {
                                        var45 = new class40(arg2, var12, arg5, arg9, var21, var20, var22, super.field1519, 0, 0, arg8, arg3, arg1);
                                    }
                                    class674.method3867(arg5, arg10, arg7, var45, (class95) null);
                                } else if (arg8 == 5) {
                                    int var46 = 65;
                                    class649 var47 = (class649) class204.method1367(arg5, arg10, arg7);
                                    if (var47 != null) {
                                        var46 = class264.field3604.method3188(var47.method275(24263), (byte) -57).field430 + 1;
                                    }
                                    class95 var48;
                                    if (!var24) {
                                        var48 = new class40(arg2, var12, arg5, arg9, var21, var20, var22, super.field1519, class238.field3314[arg3] * var46, class92.field1244[arg3] * var46, arg8, arg3, arg1);
                                    } else {
                                        class733 var49 = new class733(arg2, var12, arg5, arg9, var21, var20, var22, super.field1519, class238.field3314[arg3] * var46, class92.field1244[arg3] * var46, arg8, arg3);
                                        if (var49.method281(true)) {
                                            var49.method270(arg2, -6060);
                                        }
                                        var48 = var49;
                                    }
                                    class674.method3867(arg5, arg10, arg7, var48, (class95) null);
                                } else if (~arg8 == -7) {
                                    int var50 = 33;
                                    class649 var51 = (class649) class204.method1367(arg5, arg10, arg7);
                                    if (var51 != null) {
                                        var50 = 1 + class264.field3604.method3188(var51.method275(24263), (byte) -57).field430 / 2;
                                    }
                                    class95 var53;
                                    if (var24) {
                                        class733 var52 = new class733(arg2, var12, arg5, arg9, var21, var20, var22, super.field1519, class238.field3314[arg3] * var50, class92.field1244[arg3] * var50, arg8, arg3 + 4);
                                        if (var52.method281(true)) {
                                            var52.method270(arg2, -6060);
                                        }
                                        var53 = var52;
                                    } else {
                                        var53 = new class40(arg2, var12, arg5, arg9, var21, var20, var22, super.field1519, class293.field3829[arg3] * var50, class80.field1101[arg3] * var50, arg8, arg3 - -4, arg1);
                                    }
                                    class674.method3867(arg5, arg10, arg7, var53, (class95) null);
                                } else if (arg8 == 7) {
                                    int var54 = arg3 + 2 & 3;
                                    class95 var55;
                                    if (!var24) {
                                        var55 = new class40(arg2, var12, arg5, arg9, var21, var20, var22, super.field1519, 0, 0, arg8, var54 + 4, arg1);
                                    } else {
                                        class733 var56 = new class733(arg2, var12, arg5, arg9, var21, var20, var22, super.field1519, 0, 0, arg8, var54 + 4);
                                        if (var56.method281(true)) {
                                            var56.method270(arg2, -6060);
                                        }
                                        var55 = var56;
                                    }
                                    class674.method3867(arg5, arg10, arg7, var55, (class95) null);
                                } else if (arg8 == 8) {
                                    int var57 = 3 & arg3 + 2;
                                    int var58 = 33;
                                    class649 var59 = (class649) class204.method1367(arg5, arg10, arg7);
                                    if (var59 != null) {
                                        var58 = 1 + class264.field3604.method3188(var59.method275(24263), (byte) -57).field430 / 2;
                                    }
                                    class95 var62;
                                    class95 var63;
                                    if (var24) {
                                        class733 var60 = new class733(arg2, var12, arg5, arg9, var21, var20, var22, super.field1519, class293.field3829[arg3] * var58, class80.field1101[arg3] * var58, arg8, arg3 + 4);
                                        class733 var61 = new class733(arg2, var12, arg5, arg9, var21, var20, var22, super.field1519, 0, 0, arg8, var57 + 4);
                                        if (var60.method281(true)) {
                                            var60.method270(arg2, -6060);
                                        }
                                        if (var61.method281(true)) {
                                            var61.method270(arg2, -6060);
                                        }
                                        var62 = var61;
                                        var63 = var60;
                                    } else {
                                        class40 var64 = new class40(arg2, var12, arg5, arg9, var21, var20, var22, super.field1519, class293.field3829[arg3] * var58, class80.field1101[arg3] * var58, arg8, arg3 - -4, arg1);
                                        class40 var65 = new class40(arg2, var12, arg5, arg9, var21, var20, var22, super.field1519, 0, 0, arg8, var57 - -4, arg1);
                                        var63 = var64;
                                        var62 = var65;
                                    }
                                    class674.method3867(arg5, arg10, arg7, var63, var62);
                                }
                            }
                        } else {
                            class743 var27;
                            if (!var24) {
                                var27 = new class541(arg2, var12, arg5, arg9, var21, var20, var22, super.field1519, arg10, arg10 + var14 + -1, arg7, arg7 - -var13 - 1, arg8, arg3, arg1);
                            } else {
                                class79 var28 = new class79(arg2, var12, arg5, arg9, var21, var20, var22, super.field1519, arg10, arg10 - -var14 - 1, arg7, var13 + -1 + arg7, arg8, arg3, var23);
                                var27 = var28;
                                if (var28.method281(true)) {
                                    var28.method270(arg2, -6060);
                                }
                            }
                            class257.method1603(var27, false);
                            if (class400.field5545 && !super.field1519 && ~arg8 <= -13 && arg8 <= 17 && arg8 != 13 && ~arg5 < -1 && var12.field417 != 0) {
                                super.field1515[arg5][arg10][arg7] = (byte) class747.method4153(super.field1515[arg5][arg10][arg7], 4);
                            }
                            if (~var12.field469 != -1 && arg0 != null) {
                                arg0.method911(1, var14, !var12.field441, arg10, var12.field409, var13, arg7);
                            }
                        }
                    } else {
                        class79 var66 = null;
                        class743 var67;
                        int var68;
                        if (!var24) {
                            var67 = new class541(arg2, var12, arg5, arg9, var21, var20, var22, super.field1519, arg10, arg10 + var14 - 1, arg7, arg7 - (-var13 + 1), arg8, arg3, arg1);
                            var68 = 15;
                        } else {
                            class79 var69 = new class79(arg2, var12, arg5, arg9, var21, var20, var22, super.field1519, arg10, arg10 - (-var14 - -1), arg7, var13 + -1 + arg7, arg8, arg3, var23);
                            var68 = var69.method475(0);
                            var66 = var69;
                            var67 = var69;
                        }
                        if (class257.method1603(var67, false)) {
                            if (var66 != null && var66.method281(true)) {
                                var66.method270(arg2, -6060);
                            }
                            if (var12.field377 && class400.field5545) {
                                if (~var68 < -31) {
                                    var68 = 30;
                                }
                                for (int var70 = 0; var14 >= var70; ++var70) {
                                    for (int var71 = 0; var71 <= var13; ++var71) {
                                        var19.method516(arg10 - -var70, arg7 + var71, var68);
                                    }
                                }
                            }
                        }
                        if (var12.field469 != 0 && arg0 != null) {
                            arg0.method911(1, var14, !var12.field441, arg10, var12.field409, var13, arg7);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(IIIZ)V", line = 1130)
    public class295(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class124.field1690, class304.field3958);
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(ZILha;Lvj;I[I)V", line = 1133)
    public final void method1732(boolean arg0, int arg1, class545 arg2, class26 arg3, int arg4, int[] arg5) {
        ++field3844;
        if (!super.field1519) {
            boolean var7 = arg0;
            if (arg5 != null) {
                arg5[0] = -1;
            }
            class364 var8 = null;
            while (true) {
                while (~arg3.field279.length < ~arg3.field330) {
                    int var18 = arg3.method194((byte) 119);
                    if (var18 == 0) {
                        var8 = new class364(arg3);
                    } else if (var18 == 1) {
                        int var34 = arg3.method194((byte) 119);
                        if (~var34 < -1) {
                            for (int var35 = 0; ~var34 < ~var35; ++var35) {
                                class519 var36 = new class519(arg2, arg3, 2);
                                if (var36.field7241 == 31) {
                                    class326 var37 = class125.field1706.method3565(arg3.method193(2), false);
                                    var36.method3080(var37.field4196, (byte) -57, var37.field4197, var37.field4200, var37.field4201);
                                }
                                if (~arg2.method2124() < -1) {
                                    class757 var38 = var36.field7244;
                                    int var39 = (arg1 << 9) + var38.method4203(20918);
                                    int var40 = var38.method4205((byte) 8) - -(arg4 << 9);
                                    int var41 = var39 >> 9;
                                    int var42 = var40 >> 9;
                                    if (var41 >= 0 && ~var42 <= -1 && var41 < super.field1520 && var42 < super.field1514) {
                                        var38.method2618(super.field1527[var36.field7249][var41][var42] + -var38.method4212(-54), (byte) -108, var40, var39);
                                        class502.method3001(var36);
                                    }
                                }
                            }
                        }
                    } else if (var18 == 2) {
                        if (var8 == null) {
                            var8 = new class364();
                        }
                        var8.method2043((byte) -98, arg3);
                    } else if (~var18 == -129) {
                        if (arg5 == null) {
                            arg3.field330 += 10;
                        } else {
                            arg5[0] = arg3.method193(2);
                            arg5[1] = arg3.method173(-3);
                            arg5[2] = arg3.method173(-3);
                            arg5[3] = arg3.method173(-3);
                            arg5[4] = arg3.method193(2);
                        }
                    } else {
                        if (var18 != 129) {
                            throw new IllegalStateException("");
                        }
                        if (super.field1530 == null) {
                            super.field1530 = new byte[4][][];
                        }
                        for (int var19 = 0; ~var19 > -5; ++var19) {
                            byte var20 = arg3.method195(128);
                            if (~var20 == -1 && super.field1530[var19] != null) {
                                int var21 = arg1;
                                int var22 = arg1 + 64;
                                int var23 = arg4;
                                if (~var22 > -1) {
                                    var22 = 0;
                                } else if (~var22 <= ~super.field1520) {
                                    var22 = super.field1520;
                                }
                                if (~arg4 <= -1) {
                                    if (super.field1514 <= arg4) {
                                        var23 = super.field1514;
                                    }
                                } else {
                                    var23 = 0;
                                }
                                if (~arg1 <= -1) {
                                    if (~arg1 <= ~super.field1520) {
                                        var21 = super.field1520;
                                    }
                                } else {
                                    var21 = 0;
                                }
                                int var24 = arg4 - -64;
                                if (var24 >= 0) {
                                    if (~super.field1514 >= ~var24) {
                                        var24 = super.field1514;
                                    }
                                } else {
                                    var24 = 0;
                                }
                                while (~var21 > ~var22) {
                                    while (var24 > var23) {
                                        super.field1530[var19][var21][var23] = 0;
                                        ++var23;
                                    }
                                    ++var21;
                                }
                            } else if (var20 == 1) {
                                if (super.field1530[var19] == null) {
                                    super.field1530[var19] = new byte[super.field1520 + 1][super.field1514 + 1];
                                }
                                for (int var25 = 0; var25 < 64; var25 += 4) {
                                    for (int var26 = 0; ~var26 > -65; var26 += 4) {
                                        byte var27 = arg3.method195(128);
                                        for (int var28 = var25 - -arg1; arg1 + var25 + 4 > var28; ++var28) {
                                            for (int var29 = var26 - -arg4; arg4 + 4 + var26 > var29; ++var29) {
                                                if (~var28 <= -1 && var28 < super.field1520 && var29 >= 0 && super.field1514 > var29) {
                                                    super.field1530[var19][var28][var29] = var27;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (~var20 == -3) {
                                if (super.field1530[var19] == null) {
                                    super.field1530[var19] = new byte[super.field1520 - -1][super.field1514 + 1];
                                }
                                if (var19 > 0) {
                                    int var30 = arg1;
                                    int var31 = arg1 - -64;
                                    int var32 = arg4;
                                    if (~var31 <= -1) {
                                        if (var31 >= super.field1520) {
                                            var31 = super.field1520;
                                        }
                                    } else {
                                        var31 = 0;
                                    }
                                    int var33 = arg4 - -64;
                                    if (~arg1 > -1) {
                                        var30 = 0;
                                    } else if (~arg1 <= ~super.field1520) {
                                        var30 = super.field1520;
                                    }
                                    if (~arg4 <= -1) {
                                        if (~arg4 <= ~super.field1514) {
                                            var32 = super.field1514;
                                        }
                                    } else {
                                        var32 = 0;
                                    }
                                    if (var33 >= 0) {
                                        if (super.field1514 <= var33) {
                                            var33 = super.field1514;
                                        }
                                    } else {
                                        var33 = 0;
                                    }
                                    while (var31 > var30) {
                                        while (var33 > var32) {
                                            super.field1530[var19][var30][var32] = super.field1530[var19 + -1][var30][var32];
                                            ++var32;
                                        }
                                        ++var30;
                                    }
                                }
                            }
                        }
                        var7 = true;
                    }
                }
                if (var8 != null) {
                    for (int var9 = 0; var9 < 8; ++var9) {
                        for (int var10 = 0; var10 < 8; ++var10) {
                            int var11 = (arg1 >> 3) + var9;
                            int var12 = (arg4 >> 3) + var10;
                            if (~var11 <= -1 && ~(super.field1520 >> 3) < ~var11 && ~var12 <= -1 && super.field1514 >> 3 > var12) {
                                class638.method3712(var12, -1958, var8, var11);
                            }
                        }
                    }
                }
                if (!var7 && super.field1530 != null) {
                    for (int var13 = 0; ~var13 > -5; ++var13) {
                        if (super.field1530[var13] != null) {
                            for (int var14 = 0; var14 < 16; ++var14) {
                                for (int var15 = 0; ~var15 > -17; ++var15) {
                                    int var16 = (arg1 >> 2) + var14;
                                    int var17 = (arg4 >> 2) + var15;
                                    if (var16 >= 0 && ~var16 > -27 && ~var17 <= -1 && ~var17 > -27) {
                                        super.field1530[var13][var16][var17] = 0;
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

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lnt;ILha;IBII)V", line = 1492)
    public final void method1733(class141 arg0, int arg1, class545 arg2, int arg3, byte arg4, int arg5, int arg6) {
        ++field3842;
        class649 var8 = this.method1735(arg3, arg6, arg5, (byte) -94, arg1);
        if (var8 != null) {
            class30 var9 = class264.field3604.method3188(var8.method275(24263), (byte) -57);
            int var10 = var8.method276(-25963);
            int var11 = var8.method269(-17174);
            if (var9.method215(0)) {
                class248.method1576(var9, arg1, arg6, arg5, 102);
            }
            if (var8.method281(true)) {
                var8.method272(24139, arg2);
            }
            if (arg3 != 0) {
                if (~arg3 == -2) {
                    class254.method1599(arg5, arg1, arg6);
                } else if (arg3 == 2) {
                    class340.method1961(arg5, arg1, arg6, field3853 != null ? field3853 : (field3853 = method1738("vea")));
                    if (~var9.field469 != -1 && super.field1520 > var9.field440 + arg1 && var9.field440 + arg6 < super.field1514 && var9.field446 + arg1 < super.field1520 && arg6 - -var9.field446 < super.field1514) {
                        arg0.method927(!var9.field441, var11, var9.field409, var9.field440, arg1, 23270, var9.field446, arg6);
                    }
                    if (var10 == 9) {
                        if (~(var11 & 1) == -1) {
                            class292.method1717((byte) 102, arg5, arg6, 8, arg1);
                        } else {
                            class292.method1717((byte) 109, arg5, arg6, 16, arg1);
                        }
                    }
                } else if (arg3 == 3) {
                    class260.method1616(arg5, arg1, arg6);
                    if (var9.field469 == 1) {
                        arg0.method925(arg6, arg1, (byte) -122);
                    }
                }
            } else {
                class330.method1920(arg5, arg1, arg6);
                if (~var9.field469 != -1) {
                    arg0.method913(arg1, true, var11, var10, arg6, var9.field409, !var9.field441);
                }
                if (~var9.field417 == -2) {
                    if (~var11 != -1) {
                        if (var11 != 1) {
                            if (~var11 != -3) {
                                if (~var11 == -4) {
                                    class292.method1717((byte) -108, arg5, arg6, 2, arg1);
                                }
                            } else {
                                class292.method1717((byte) -124, arg5, arg6, 1, arg1 - -1);
                            }
                        } else {
                            class292.method1717((byte) 116, arg5, arg6 - -1, 2, arg1);
                        }
                    } else {
                        class292.method1717((byte) 103, arg5, arg6, 1, arg1);
                    }
                }
            }
        }
        if (arg4 > -45) {
            this.field3849 = -106;
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lha;ZZ)V", line = 1588)
    public final void method1734(class545 arg0, boolean arg1, boolean arg2) {
        ++field3846;
        class632.method3676();
        if (!arg1) {
            if (super.field1524 > 1) {
                for (int var4 = 0; ~super.field1520 < ~var4; ++var4) {
                    for (int var5 = 0; ~var5 > ~super.field1514; ++var5) {
                        if ((2 & class429.field5916[1][var4][var5]) == 2) {
                            class544.method3244(var4, var5);
                        }
                    }
                }
            }
            for (int var6 = 0; var6 < super.field1524; ++var6) {
                for (int var7 = 0; super.field1514 >= var7; ++var7) {
                    for (int var8 = 0; ~super.field1520 <= ~var8; ++var8) {
                        if ((4 & super.field1515[var6][var8][var7]) != 0) {
                            int var9 = var8;
                            int var10 = var8;
                            int var11 = var7;
                            int var12 = var7;
                            while (var11 > 0 && ~(super.field1515[var6][var8][var11 + -1] & 4) != -1 && ~(var12 - var11) > -11) {
                                --var11;
                            }
                            while (super.field1514 > var12 && (super.field1515[var6][var8][var12 + 1] & 4) != 0 && ~(var12 - var11) > -11) {
                                ++var12;
                            }
                            label118: while (var9 > 0 && var10 - var9 < 10) {
                                for (int var13 = var11; ~var12 <= ~var13; ++var13) {
                                    if ((4 & super.field1515[var6][var9 + -1][var13]) == 0) {
                                        break label118;
                                    }
                                }
                                --var9;
                            }
                            label105: while (super.field1520 > var10 && ~(-var9 + var10) > -11) {
                                for (int var14 = var11; ~var12 <= ~var14; ++var14) {
                                    if (~(4 & super.field1515[var6][var10 + 1][var14]) == -1) {
                                        break label105;
                                    }
                                }
                                ++var10;
                            }
                            if (~((var10 + 1 - var9) * (-var11 + var12 + 1)) <= -5) {
                                int var15 = super.field1527[var6][var9][var11];
                                class464.method2771(var9 << 9, (var10 << 9) + 512, (var12 << 9) - -512, var6, 4, var15, (byte) 43, var11 << 9, var15);
                                for (int var16 = var9; var16 <= var10; ++var16) {
                                    for (int var17 = var11; var12 >= var17; ++var17) {
                                        super.field1515[var6][var16][var17] = (byte) class136.method878(super.field1515[var6][var16][var17], -5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class133.method838(14);
        }
        super.field1515 = null;
        if (!arg2) {
            method1729(0.816531F, 56, -0.8196734F, 38, -51, -2.0597608F, -0.5155173F, 28, 0.494462F, 88, (class71) null);
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIIBI)Lvea;", line = 1726)
    private final class649 method1735(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        ++field3841;
        class649 var6 = null;
        if (arg0 == 0) {
            var6 = (class649) class204.method1367(arg2, arg4, arg1);
        }
        if (arg0 == 1) {
            var6 = (class649) class744.method4146(arg2, arg4, arg1);
        }
        if (arg0 == 2) {
            var6 = (class649) class151.method970(arg2, arg4, arg1, field3853 != null ? field3853 : (field3853 = method1738("vea")));
        }
        if (~arg0 == -4) {
            var6 = (class649) class340.method1963(arg2, arg4, arg1);
        }
        if (arg3 > -92) {
            field3852 = true;
        }
        return var6;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(II)V", line = 1751)
    public static final void method1736(int arg0, int arg1) {
        ++field3847;
        if (arg0 != arg1) {
            if (class325.field4188[arg0]) {
                class602.field8614.method3313(arg1 + -12352, arg0);
                class491.field6599[arg0] = null;
                class13.field185[arg0] = null;
                class325.field4188[arg0] = false;
            }
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIIZII)V", line = 1773)
    public static final void method1737(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg2 >= class490.field6592 && arg5 <= class116.field1628 && class675.field9512 <= arg4 && arg1 <= class395.field5484) {
            class16.method80(arg5, arg0, -334506528, arg1, arg4, arg2);
        } else {
            class451.method2710(arg1, arg2, (byte) 119, arg0, arg5, arg4);
        }
        ++field3837;
        if (arg3) {
            method1725(-42, 60, 92);
        }
    }
}
