import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class314 extends class244 {

    @OriginalMember(owner = "client!td", name = "W", descriptor = "I")
    public int field4486 = 99;

    @OriginalMember(owner = "client!td", name = "H", descriptor = "I")
    public static int field4471 = 0;

    @OriginalMember(owner = "client!td", name = "I", descriptor = "[I")
    public static int[] field4472 = new int[2048];

    @OriginalMember(owner = "client!td", name = "J", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!td", name = "K", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!td", name = "L", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!td", name = "M", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!td", name = "N", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!td", name = "O", descriptor = "I")
    public static int field4478;

    @OriginalMember(owner = "client!td", name = "P", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!td", name = "Q", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!td", name = "R", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!td", name = "S", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!td", name = "T", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!td", name = "U", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!td", name = "V", descriptor = "I")
    public static int field4485;

    // $FF: synthetic field
    @OriginalMember(owner = "client!td", name = "X", descriptor = "Ljava/lang/Class;")
    public static Class field4487;

    // $FF: synthetic method
    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1967(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 3)
    public static final void method1955(String arg0, int arg1) {
        if (class285.field4100 == null) {
            class44.method284((byte) -114);
        }
        ++field4474;
        String[] var2 = class93.method541(arg0, '\n', 1);
        if (arg1 != 14715) {
            method1961((byte) -13);
        }
        for (int var3 = 0; var2.length > var3; ++var3) {
            for (int var4 = class463.field6856; var4 > 0; --var4) {
                class285.field4100[var4] = class285.field4100[var4 + -1];
            }
            class285.field4100[0] = var2[var3];
            if (~(class285.field4100.length - 1) < ~class463.field6856) {
                ++class463.field6856;
                if (~class401.field6017 < -1) {
                    ++class401.field6017;
                }
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lqa;B)V", line = 46)
    public final void method1956(class162 arg0, byte arg1) {
        ++field4478;
        class462.method2784(arg0);
        if (super.field3597 > 1) {
            for (int var3 = 0; var3 < super.field3579; ++var3) {
                for (int var4 = 0; super.field3595 > var4; ++var4) {
                    if (~(2 & class183.field2684[1][var3][var4]) == -3) {
                        class252.method1697(var3, var4);
                    }
                }
            }
        }
        if (arg1 != 0) {
            this.method1958(26, (class162) null, false, (class209) null, (int[]) null, 2);
        }
        for (int var5 = 0; var5 < super.field3597; ++var5) {
            for (int var6 = 0; var6 <= super.field3595; ++var6) {
                for (int var7 = 0; ~super.field3579 <= ~var7; ++var7) {
                    if ((1 & super.field3591[var5][var7][var6]) != 0) {
                        int var8 = var6;
                        int var9 = var6;
                        int var10 = var5;
                        while (~var9 > ~super.field3595 && (super.field3591[var5][var7][var9 - -1] & 1) != 0) {
                            ++var9;
                        }
                        while (var8 > 0 && ~(super.field3591[var5][var7][var8 + -1] & 1) != -1) {
                            --var8;
                        }
                        int var11 = var5;
                        label171: while (~var10 < -1) {
                            for (int var12 = var8; var9 >= var12; ++var12) {
                                if (~(1 & super.field3591[var10 + -1][var7][var12]) == -1) {
                                    break label171;
                                }
                            }
                            --var10;
                        }
                        label160: while (~var11 > -4) {
                            for (int var13 = var8; ~var13 >= ~var9; ++var13) {
                                if ((super.field3591[var11 + 1][var7][var13] & 1) == 0) {
                                    break label160;
                                }
                            }
                            ++var11;
                        }
                        int var14 = (-var8 + var9 + 1) * (var11 + 1 + -var10);
                        if (~var14 <= -3) {
                            short var15 = 240;
                            int var16 = super.field3587[var11][var7][var8] + -var15;
                            int var17 = super.field3587[var10][var7][var8];
                            class217.method1512(1, var7 << 7, var7 << 7, var8 << 7, (var9 << 7) - -128, var16, var17);
                            for (int var18 = var10; ~var11 <= ~var18; ++var18) {
                                for (int var19 = var8; var9 >= var19; ++var19) {
                                    super.field3591[var18][var7][var19] = (byte) class286.method1847(super.field3591[var18][var7][var19], -2);
                                }
                            }
                        }
                    }
                    if (~(super.field3591[var5][var7][var6] & 2) != -1) {
                        int var20 = var7;
                        int var21 = var7;
                        int var22 = var5;
                        while (~var21 > ~super.field3579 && (2 & super.field3591[var5][var21 + 1][var6]) != 0) {
                            ++var21;
                        }
                        while (var20 > 0 && (2 & super.field3591[var5][var20 + -1][var6]) != 0) {
                            --var20;
                        }
                        int var23 = var5;
                        label225: while (var22 > 0) {
                            for (int var24 = var20; ~var24 >= ~var21; ++var24) {
                                if ((super.field3591[var22 + -1][var24][var6] & 2) == 0) {
                                    break label225;
                                }
                            }
                            --var22;
                        }
                        label214: while (~var23 > -4) {
                            for (int var25 = var20; var25 <= var21; ++var25) {
                                if (~(super.field3591[var23 + 1][var25][var6] & 2) == -1) {
                                    break label214;
                                }
                            }
                            ++var23;
                        }
                        int var26 = (-var20 + 1 + var21) * (-var22 + 1 + var23);
                        if (var26 >= 2) {
                            short var27 = 240;
                            int var28 = super.field3587[var23][var20][var6] - var27;
                            int var29 = super.field3587[var22][var20][var6];
                            class217.method1512(2, var20 << 7, (var21 << 7) - -128, var6 << 7, var6 << 7, var28, var29);
                            for (int var30 = var22; ~var30 >= ~var23; ++var30) {
                                for (int var31 = var20; var31 <= var21; ++var31) {
                                    super.field3591[var30][var31][var6] = (byte) class286.method1847(super.field3591[var30][var31][var6], -3);
                                }
                            }
                        }
                    }
                    if ((super.field3591[var5][var7][var6] & 4) != 0) {
                        int var32 = var7;
                        int var33 = var7;
                        int var34 = var6;
                        int var35 = var6;
                        while (~var34 < -1 && ~(4 & super.field3591[var5][var7][var34 + -1]) != -1) {
                            --var34;
                        }
                        while (~var35 > ~super.field3595 && (super.field3591[var5][var7][var35 + 1] & 4) != 0) {
                            ++var35;
                        }
                        label279: while (var32 > 0) {
                            for (int var36 = var34; ~var35 <= ~var36; ++var36) {
                                if (~(4 & super.field3591[var5][var32 + -1][var36]) == -1) {
                                    break label279;
                                }
                            }
                            --var32;
                        }
                        label268: while (~var33 > ~super.field3579) {
                            for (int var37 = var34; ~var35 <= ~var37; ++var37) {
                                if ((4 & super.field3591[var5][var33 + 1][var37]) == 0) {
                                    break label268;
                                }
                            }
                            ++var33;
                        }
                        if ((var35 + 1 - var34) * (-var32 + var33 + 1) >= 4) {
                            int var38 = super.field3587[var5][var32][var34];
                            class217.method1512(4, var32 << 7, (var33 << 7) + 128, var34 << 7, (var35 << 7) + 128, var38, var38);
                            for (int var39 = var32; var33 >= var39; ++var39) {
                                for (int var40 = var34; ~var40 >= ~var35; ++var40) {
                                    super.field3591[var5][var39][var40] = (byte) class286.method1847(super.field3591[var5][var39][var40], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
        super.field3591 = null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "([BLqa;II[Lvb;B)V", line = 335)
    public final void method1957(byte[] arg0, class162 arg1, int arg2, int arg3, class130[] arg4, byte arg5) {
        ++field4481;
        class209 var7 = new class209(arg0);
        if (arg5 <= 8) {
            field4473 = -36;
        }
        int var8 = -1;
        while (true) {
            int var9 = var7.method1422((byte) 94);
            if (~var9 == -1) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method1434(16887);
                if (var11 == 0) {
                    break;
                }
                var10 += var11 + -1;
                int var12 = var10 & 63;
                int var13 = (var10 & 4065) >> 6;
                int var14 = var10 >> 12;
                int var15 = var7.method1428(32122);
                int var16 = var15 >> 2;
                int var17 = var15 & 3;
                int var18 = arg2 + var13;
                int var19 = arg3 + var12;
                if (var18 > 0 && var19 > 0 && ~var18 > ~(super.field3579 + -1) && var19 < super.field3595 + -1) {
                    class130 var20 = null;
                    if (!super.field3583) {
                        int var21 = var14;
                        if ((2 & class183.field2684[1][var18][var19]) == 2) {
                            var21 = var14 - 1;
                        }
                        if (~var21 <= -1) {
                            var20 = arg4[var21];
                        }
                    }
                    this.method1966(var16, var14, var18, arg1, var8, var20, var19, -1, var17, 653377575, var14);
                }
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILqa;ZLdh;[II)V", line = 409)
    public final void method1958(int arg0, class162 arg1, boolean arg2, class209 arg3, int[] arg4, int arg5) {
        ++field4477;
        if (!super.field3583) {
            boolean var7 = false;
            class234 var8 = null;
            if (!arg2) {
                field4473 = -33;
            }
            if (arg4 != null) {
                arg4[0] = -1;
            }
            while (true) {
                while (true) {
                    while (true) {
                        while (true) {
                            while (~arg3.field3036.length < ~arg3.field3037) {
                                int var18 = arg3.method1428(32122);
                                if (~var18 != -1) {
                                    if (~var18 != -2) {
                                        if (var18 != 2) {
                                            if (~var18 == -129) {
                                                if (arg4 != null) {
                                                    arg4[0] = arg3.method1450((byte) 79);
                                                    arg4[1] = arg3.method1447(29480);
                                                    arg4[2] = arg3.method1447(29480);
                                                    arg4[3] = arg3.method1447(29480);
                                                    arg4[4] = arg3.method1450((byte) 127);
                                                } else {
                                                    arg3.field3037 += 10;
                                                }
                                            } else {
                                                if (var18 != 129) {
                                                    throw new IllegalStateException("");
                                                }
                                                if (super.field3584 == null) {
                                                    super.field3584 = new byte[4][][];
                                                }
                                                for (int var19 = 0; ~var19 > -5; ++var19) {
                                                    byte var20 = arg3.method1417(false);
                                                    if (var20 == 0 && super.field3584[var19] != null) {
                                                        int var21 = arg5;
                                                        int var22 = arg5 - -64;
                                                        int var23 = arg0;
                                                        if (arg5 < 0) {
                                                            var21 = 0;
                                                        } else if (~super.field3579 >= ~arg5) {
                                                            var21 = super.field3579;
                                                        }
                                                        if (~arg0 > -1) {
                                                            var23 = 0;
                                                        } else if (~super.field3595 >= ~arg0) {
                                                            var23 = super.field3595;
                                                        }
                                                        if (~var22 > -1) {
                                                            var22 = 0;
                                                        } else if (~var22 <= ~super.field3579) {
                                                            var22 = super.field3579;
                                                        }
                                                        int var24 = arg0 - -64;
                                                        if (var24 < 0) {
                                                            var24 = 0;
                                                        } else if (~super.field3595 >= ~var24) {
                                                            var24 = super.field3595;
                                                        }
                                                        while (~var22 < ~var21) {
                                                            while (~var23 > ~var24) {
                                                                super.field3584[var19][var21][var23] = 0;
                                                                ++var23;
                                                            }
                                                            ++var21;
                                                        }
                                                    } else if (var20 == 1) {
                                                        if (super.field3584[var19] == null) {
                                                            super.field3584[var19] = new byte[super.field3579 - -1][super.field3595 + 1];
                                                        }
                                                        for (int var25 = 0; ~var25 > -65; var25 += 4) {
                                                            for (int var26 = 0; ~var26 > -65; var26 += 4) {
                                                                byte var27 = arg3.method1417(!arg2);
                                                                for (int var28 = var25 - -arg5; var28 < arg5 + var25 + 4; ++var28) {
                                                                    for (int var29 = arg0 + var26; ~var29 > ~(arg0 + 4 + var26); ++var29) {
                                                                        if (~var28 <= -1 && ~var28 > ~super.field3579 && ~var29 <= -1 && var29 < super.field3595) {
                                                                            super.field3584[var19][var28][var29] = var27;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else if (var20 == 2) {
                                                        if (super.field3584[var19] == null) {
                                                            super.field3584[var19] = new byte[super.field3579 + 1][super.field3595 + 1];
                                                        }
                                                        if (var19 > 0) {
                                                            int var30 = arg5;
                                                            int var31 = arg5 + 64;
                                                            int var32 = arg0;
                                                            if (~arg5 <= -1) {
                                                                if (~super.field3579 >= ~arg5) {
                                                                    var30 = super.field3579;
                                                                }
                                                            } else {
                                                                var30 = 0;
                                                            }
                                                            if (arg0 < 0) {
                                                                var32 = 0;
                                                            } else if (~super.field3595 >= ~arg0) {
                                                                var32 = super.field3595;
                                                            }
                                                            if (~var31 <= -1) {
                                                                if (super.field3579 <= var31) {
                                                                    var31 = super.field3579;
                                                                }
                                                            } else {
                                                                var31 = 0;
                                                            }
                                                            int var33 = arg0 + 64;
                                                            if (var33 < 0) {
                                                                var33 = 0;
                                                            } else if (var33 >= super.field3595) {
                                                                var33 = super.field3595;
                                                            }
                                                            while (var30 < var31) {
                                                                while (~var32 > ~var33) {
                                                                    super.field3584[var19][var30][var32] = super.field3584[var19 + -1][var30][var32];
                                                                    ++var32;
                                                                }
                                                                ++var30;
                                                            }
                                                        }
                                                    }
                                                }
                                                var7 = true;
                                            }
                                        } else {
                                            if (var8 == null) {
                                                var8 = new class234();
                                            }
                                            var8.method1594(arg3, 0);
                                        }
                                    } else {
                                        int var34 = arg3.method1428(32122);
                                        if (var34 > 0) {
                                            for (int var35 = 0; ~var34 < ~var35; ++var35) {
                                                class419 var36 = new class419(arg1, arg3, 0);
                                                if (~var36.field6302 == -32) {
                                                    class411 var37 = class449.field6685.method381(-9948, arg3.method1450((byte) 58));
                                                    var36.method2518(var37.field6186, var37.field6184, var37.field6182, var37.field6187, 768);
                                                }
                                                if (arg1.method1056() > 0) {
                                                    class107 var38 = var36.field6301;
                                                    int var39 = (arg5 << 7) + var38.method654((byte) 31);
                                                    int var40 = (arg0 << 7) + var38.method656(128);
                                                    int var41 = var39 >> 7;
                                                    int var42 = var40 >> 7;
                                                    if (var41 >= 0 && var42 >= 0 && ~super.field3579 < ~var41 && ~var42 > ~super.field3595) {
                                                        var38.method657(126, var40, var39, super.field3587[var36.field6299][var41][var42] - var38.method663(0));
                                                        if (~arg1.method1056() < -1) {
                                                            class525.method3106(var36);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    var8 = new class234(arg3);
                                }
                            }
                            if (var8 != null) {
                                for (int var9 = 0; var9 < 8; ++var9) {
                                    for (int var10 = 0; var10 < 8; ++var10) {
                                        int var11 = (arg5 >> 3) + var9;
                                        int var12 = (arg0 >> 3) + var10;
                                        if (var11 >= 0 && ~var11 > ~(super.field3579 >> 3) && ~var12 <= -1 && super.field3595 >> 3 > var12) {
                                            class304.method1911(var8, var11, var12, 0);
                                        }
                                    }
                                }
                            }
                            if (!var7 && super.field3584 != null) {
                                for (int var13 = 0; ~var13 > -5; ++var13) {
                                    if (super.field3584[var13] != null) {
                                        for (int var14 = 0; ~var14 > -17; ++var14) {
                                            for (int var15 = 0; var15 < 16; ++var15) {
                                                int var16 = (arg5 >> 2) + var14;
                                                int var17 = (arg0 >> 2) + var15;
                                                if (var16 >= 0 && var16 < 26 && ~var17 <= -1 && var17 < 26) {
                                                    super.field3584[var13][var16][var17] = 0;
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

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Ldh;IIIZ[IILqa;III)V", line = 782)
    public final void method1959(class209 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5, int arg6, class162 arg7, int arg8, int arg9, int arg10) {
        ++field4485;
        if (!super.field3583) {
            boolean var12 = false;
            class234 var13 = null;
            if (!arg4) {
                field4471 = 99;
            }
            if (arg5 != null) {
                arg5[0] = -1;
            }
            int var14 = (7 & arg2) * 8;
            int var15 = (7 & arg10) * 8;
            while (true) {
                int var21;
                label244: do {
                    while (true) {
                        while (~arg0.field3036.length < ~arg0.field3037) {
                            int var20 = arg0.method1428(32122);
                            if (~var20 != -1) {
                                if (~var20 == -2) {
                                    var21 = arg0.method1428(32122);
                                    continue label244;
                                }
                                if (~var20 == -3) {
                                    if (var13 == null) {
                                        var13 = new class234();
                                    }
                                    var13.method1594(arg0, 0);
                                } else if (var20 == 128) {
                                    if (arg5 != null) {
                                        arg5[0] = arg0.method1450((byte) 56);
                                        arg5[1] = arg0.method1447(29480);
                                        arg5[2] = arg0.method1447(29480);
                                        arg5[3] = arg0.method1447(29480);
                                        arg5[4] = arg0.method1450((byte) 66);
                                    } else {
                                        arg0.field3037 += 10;
                                    }
                                } else {
                                    if (~var20 != -130) {
                                        throw new IllegalStateException("");
                                    }
                                    if (super.field3584 == null) {
                                        super.field3584 = new byte[4][][];
                                    }
                                    for (int var32 = 0; ~var32 > -5; ++var32) {
                                        byte var33 = arg0.method1417(false);
                                        if (~var33 == -1 && super.field3584[arg3] != null) {
                                            if (~var32 >= ~arg9) {
                                                int var34 = arg1;
                                                int var35 = arg1 + 7;
                                                int var36 = arg8;
                                                if (~arg1 > -1) {
                                                    var34 = 0;
                                                } else if (~super.field3579 >= ~arg1) {
                                                    var34 = super.field3579;
                                                }
                                                if (~var35 > -1) {
                                                    var35 = 0;
                                                } else if (super.field3579 <= var35) {
                                                    var35 = super.field3579;
                                                }
                                                if (~arg8 > -1) {
                                                    var36 = 0;
                                                } else if (arg8 >= super.field3595) {
                                                    var36 = super.field3595;
                                                }
                                                int var37 = arg8 + 7;
                                                if (~var37 > -1) {
                                                    var37 = 0;
                                                } else if (~var37 <= ~super.field3595) {
                                                    var37 = super.field3595;
                                                }
                                                while (~var34 > ~var35) {
                                                    while (~var37 < ~var36) {
                                                        super.field3584[arg3][var34][var36] = 0;
                                                        ++var36;
                                                    }
                                                    ++var34;
                                                }
                                            }
                                        } else if (~var33 == -2) {
                                            if (super.field3584[arg3] == null) {
                                                super.field3584[arg3] = new byte[super.field3579 + 1][super.field3595 + 1];
                                            }
                                            for (int var38 = 0; ~var38 > -65; var38 += 4) {
                                                for (int var39 = 0; ~var39 > -65; var39 += 4) {
                                                    byte var40 = arg0.method1417(false);
                                                    if (arg9 >= var32) {
                                                        for (int var41 = var38; var41 < var38 - -4; ++var41) {
                                                            for (int var42 = var39; var42 < var39 + 4; ++var42) {
                                                                if (var14 <= var41 && var14 + 8 > var41 && var42 >= var15 && ~var15 > ~(var15 + 8)) {
                                                                    int var43 = arg1 - -class237.method1602(var42 & 7, 7, 7 & var41, arg6);
                                                                    int var44 = class154.method996(7 & var42, 7 & var41, true, arg6) + arg8;
                                                                    if (var43 >= 0 && ~super.field3579 < ~var43 && ~var44 <= -1 && var44 < super.field3595) {
                                                                        super.field3584[arg3][var43][var44] = var40;
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
                                var13 = new class234(arg0);
                            }
                        }
                        if (var13 != null) {
                            class304.method1911(var13, arg1 >> 3, arg8 >> 3, 0);
                        }
                        if (!var12 && super.field3584 != null && super.field3584[arg3] != null) {
                            int var16 = arg1 + 7;
                            int var17 = arg8 + 7;
                            for (int var18 = arg1; ~var16 < ~var18; ++var18) {
                                for (int var19 = arg8; ~var17 < ~var19; ++var19) {
                                    super.field3584[arg3][var18][var19] = 0;
                                }
                            }
                            return;
                        }
                        return;
                    }
                } while (~var21 >= -1);
                for (int var22 = 0; ~var22 > ~var21; ++var22) {
                    class419 var23 = new class419(arg7, arg0, 0);
                    if (var23.field6302 == 31) {
                        class411 var24 = class449.field6685.method381(-9948, arg0.method1450((byte) 62));
                        var23.method2518(var24.field6186, var24.field6184, var24.field6182, var24.field6187, 768);
                    }
                    if (~arg7.method1056() < -1) {
                        class107 var25 = var23.field6301;
                        int var26 = var25.method654((byte) 31) >> 7;
                        int var27 = var25.method656(128) >> 7;
                        if (~var23.field6299 == ~arg9 && var26 >= var14 && ~(var14 + 8) < ~var26 && ~var27 <= ~var15 && var15 + 8 > var27) {
                            int var28 = (arg1 << 7) + class474.method2834(false, 1023 & var25.method654((byte) 31), var25.method656(128) & 1023, arg6);
                            int var29 = var28 >> 7;
                            int var30 = (arg8 << 7) - -class20.method130(1023 & var25.method656(128), -124, arg6, 1023 & var25.method654((byte) 31));
                            int var31 = var30 >> 7;
                            if (~var29 <= -1 && var31 >= 0 && var29 < super.field3579 && ~super.field3595 < ~var31) {
                                var25.method657(-128, var30, var28, super.field3587[arg9][var29][var31] + -var25.method663(0));
                                if (~arg7.method1056() < -1) {
                                    class525.method3106(var23);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V", line = 1082)
    public static final void method1960(boolean arg0) {
        ++field4484;
        if (class90.field1360 != 0) {
            if (!arg0) {
                field4472 = null;
            }
            try {
                if (~(++class434.field6502) < -2001) {
                    if (class90.field1361 != null) {
                        class90.field1361.method2312(false);
                        class90.field1361 = null;
                    }
                    if (~class375.field5714 <= -2) {
                        class90.field1360 = 0;
                        client.field2856 = -5;
                        return;
                    }
                    class434.field6502 = 0;
                    ++class375.field5714;
                    class90.field1360 = 1;
                    if (~class64.field965 != ~class499.field7358) {
                        class499.field7358 = class64.field965;
                    } else {
                        class499.field7358 = class241.field3566;
                    }
                }
                if (~class90.field1360 == -2) {
                    class166.field2450 = class483.field7077.method2598(class285.field4101, class499.field7358, (byte) 102);
                    class90.field1360 = 2;
                }
                if (~class90.field1360 == -3) {
                    if (class166.field2450.field4032 == 2) {
                        throw new IOException();
                    }
                    if (~class166.field2450.field4032 != -2) {
                        return;
                    }
                    class90.field1361 = new class376((Socket) class166.field2450.field4030, class483.field7077);
                    class166.field2450 = null;
                    class90.field1361.method2311(class356.field5471.field3037, class356.field5471.field3036, 4900, 0);
                    class107.method664(128);
                    int var1 = class90.field1361.method2306((byte) 73);
                    class107.method664(128);
                    if (var1 != 21) {
                        class90.field1360 = 0;
                        client.field2856 = var1;
                        class90.field1361.method2312(false);
                        class90.field1361 = null;
                        return;
                    }
                    class90.field1360 = 3;
                }
                if (class90.field1360 == 3) {
                    if (~class90.field1361.method2310(110) > -2) {
                        return;
                    }
                    class264.field3868 = new String[class90.field1361.method2306((byte) -89)];
                    class90.field1360 = 4;
                }
                if (~class90.field1360 == -5) {
                    if (~class90.field1361.method2310(-118) <= ~(class264.field3868.length * 8)) {
                        class66.field1009.field3037 = 0;
                        class90.field1361.method2308(class66.field1009.field3036, 0, class264.field3868.length * 8, 32);
                        for (int var2 = 0; ~var2 > ~class264.field3868.length; ++var2) {
                            class264.field3868[var2] = class63.method372(0, class66.field1009.method1425(21985));
                        }
                        class90.field1360 = 0;
                        client.field2856 = 21;
                        class90.field1361.method2312(!arg0);
                        class90.field1361 = null;
                    }
                }
            } catch (IOException var3) {
                if (class90.field1361 != null) {
                    class90.field1361.method2312(false);
                    class90.field1361 = null;
                }
                if (class375.field5714 < 1) {
                    ++class375.field5714;
                    if (class64.field965 == class499.field7358) {
                        class499.field7358 = class241.field3566;
                    } else {
                        class499.field7358 = class64.field965;
                    }
                    class90.field1360 = 1;
                    class434.field6502 = 0;
                } else {
                    class90.field1360 = 0;
                    client.field2856 = -4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(IIIZ)V", line = 1228)
    public class314(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class335.field4729, class493.field7291);
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(B)[Lne;", line = 1232)
    public static final class207[] method1961(byte arg0) {
        ++field4476;
        if (arg0 != 44) {
            field4472 = null;
        }
        return new class207[] { class125.field1890, class498.field7351, class176.field2600, class317.field4558, class482.field7063, class511.field7465 };
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II)V", line = 1246)
    public static final void method1962(int arg0, int arg1) {
        class518.field7542 = arg0;
        ++field4483;
        class226 var2 = class359.field5506;
        synchronized (class359.field5506) {
            class359.field5506.method1540(0);
            if (arg1 >= -72) {
                field4473 = 71;
            }
        }
        class226 var3 = class111.field1596;
        synchronized (class111.field1596) {
            class111.field1596.method1540(0);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIILvb;Lqa;)V", line = 1271)
    public final void method1963(int arg0, int arg1, int arg2, int arg3, int arg4, class130 arg5, class162 arg6) {
        ++field4480;
        class351 var8 = null;
        if (arg2 == 0) {
            var8 = (class351) class426.method2557(arg1, arg4, arg3);
        }
        if (~arg2 == arg0) {
            var8 = (class351) class444.method2670(arg1, arg4, arg3);
        }
        if (arg2 == 2) {
            var8 = (class351) class342.method2093(arg1, arg4, arg3, field4487 != null ? field4487 : (field4487 = method1967("mq")));
        }
        if (~arg2 == -4) {
            var8 = (class351) class196.method1340(arg1, arg4, arg3);
        }
        if (var8 != null) {
            class519 var9 = class252.field3743.method2686(var8.method20(-30685), (byte) 111);
            int var10 = var8.method5((byte) -65);
            int var11 = var8.method17(arg0 + -110);
            if (var9.method3055((byte) -126)) {
                class287.method1851(78, arg3, arg1, var9, arg4);
            }
            if (var8.method7((byte) 73)) {
                var8.method11(-115, arg6);
            }
            if (~arg2 == -1) {
                class364 var12 = class426.method2557(arg1, arg4, arg3);
                if (!(var12 instanceof class350)) {
                    class348.method2115(arg1, arg4, arg3);
                } else {
                    ((class350) var12).field5382 = null;
                }
                if (var9.field7656 != 0) {
                    arg5.method867(var11, !var9.field7582, var10, arg3, var9.field7586, arg4, false);
                    return;
                }
            } else if (~arg2 != -2) {
                if (~arg2 == -3) {
                    class117 var13 = class342.method2093(arg1, arg4, arg3, field4487 != null ? field4487 : (field4487 = method1967("mq")));
                    if (var13 instanceof class120 && var13.field1762 == arg4 && ~var13.field1771 == ~arg3) {
                        ((class120) var13).field1809 = null;
                    } else {
                        class139.method924(arg1, arg4, arg3, field4487 != null ? field4487 : (field4487 = method1967("mq")));
                    }
                    if (var9.field7656 != 0 && ~(var9.field7648 + arg4) > ~super.field3579 && super.field3595 > var9.field7648 + arg3 && super.field3579 > var9.field7614 + arg4 && ~(var9.field7614 + arg3) > ~super.field3595) {
                        arg5.method872(!var9.field7582, var9.field7648, var11, (byte) -128, arg3, var9.field7614, arg4, var9.field7586);
                        return;
                    }
                    return;
                }
                if (arg2 == 3) {
                    class185 var14 = class196.method1340(arg1, arg4, arg3);
                    if (!(var14 instanceof class473)) {
                        class394.method2392(arg1, arg4, arg3);
                    } else {
                        ((class473) var14).field6965 = null;
                    }
                    if (var9.field7656 == 1) {
                        arg5.method869(arg4, arg0 + -23068, arg3);
                        return;
                    }
                }
            } else {
                class522 var15 = class444.method2670(arg1, arg4, arg3);
                if (!(var15 instanceof class484)) {
                    class87.method509(arg1, arg4, arg3);
                    return;
                }
                ((class484) var15).field7093 = null;
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I[Lvb;[BIIILqa;IBII)V", line = 1385)
    public final void method1964(int arg0, class130[] arg1, byte[] arg2, int arg3, int arg4, int arg5, class162 arg6, int arg7, byte arg8, int arg9, int arg10) {
        if (arg8 != 102) {
            method1962(108, 117);
        }
        ++field4482;
        class209 var12 = new class209(arg2);
        int var13 = -1;
        while (true) {
            int var14 = var12.method1422((byte) -23);
            if (~var14 == -1) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method1434(arg8 ^ 16785);
                if (var16 == 0) {
                    break;
                }
                var15 += var16 + -1;
                int var17 = 63 & var15;
                int var18 = 63 & var15 >> 6;
                int var19 = var15 >> 12;
                int var20 = var12.method1428(arg8 + 32020);
                int var21 = var20 >> 2;
                int var22 = var20 & 3;
                if (~arg9 == ~var19 && ~var18 <= ~arg10 && var18 < arg10 + 8 && ~var17 <= ~arg5 && ~var17 > ~(arg5 + 8)) {
                    class519 var23 = class252.field3743.method2686(var13, (byte) 106);
                    int var24 = class208.method1404(arg0, var23.field7648, var22, false, 7 & var17, 7 & var18, var23.field7614) + arg4;
                    int var25 = class405.method2436(arg0, var23.field7648, var23.field7614, var22, 7 & var18, -94, 7 & var17) + arg7;
                    if (~var24 < -1 && var25 > 0 && ~var24 > ~(super.field3579 - 1) && var25 < super.field3595 + -1) {
                        class130 var26 = null;
                        if (!super.field3583) {
                            int var27 = arg3;
                            if (~(class183.field2684[1][var24][var25] & 2) == -3) {
                                var27 = arg3 - 1;
                            }
                            if (~var27 <= -1) {
                                var26 = arg1[var27];
                            }
                        }
                        this.method1966(var21, arg3, var24, arg6, var13, var26, var25, -1, var22 - -arg0 & 3, 653377575, arg3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(B)V", line = 1466)
    public static void method1965(byte arg0) {
        if (arg0 != -13) {
            field4479 = 57;
        }
        field4472 = null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIILqa;ILvb;IIIII)V", line = 1476)
    public final void method1966(int arg0, int arg1, int arg2, class162 arg3, int arg4, class130 arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field4475;
        if (class426.field6401.method2532(arg9 + -653377574, class170.field2529) || class495.method2971(arg6, arg9 + -653377574, class271.field3942, arg10, arg2)) {
            if (~arg1 > ~this.field4486) {
                this.field4486 = arg1;
            }
            class519 var12 = class252.field3743.method2686(arg4, (byte) 101);
            if (!arg3.method1037() || !class426.field6401.field989 || !var12.field7592) {
                if (arg9 == 653377575) {
                    int var13;
                    int var14;
                    if (~arg8 != -2 && ~arg8 != -4) {
                        var13 = var12.field7648;
                        var14 = var12.field7614;
                    } else {
                        var13 = var12.field7614;
                        var14 = var12.field7648;
                    }
                    int var15;
                    int var16;
                    if (arg2 + var13 > super.field3579) {
                        var15 = arg2 - -1;
                        var16 = arg2;
                    } else {
                        var15 = (var13 - -1 >> 1) + arg2;
                        var16 = (var13 >> 1) + arg2;
                    }
                    int var17;
                    int var18;
                    if (~(arg6 + var14) >= ~super.field3595) {
                        var17 = (var14 + 1 >> 1) + arg6;
                        var18 = (var14 >> 1) + arg6;
                    } else {
                        var18 = arg6;
                        var17 = arg6 + 1;
                    }
                    class35 var19 = class86.field1324[arg10];
                    int var20 = var19.method201(var16, var18) - -var19.method201(var15, var18) + var19.method201(var16, var17) + var19.method201(var15, var17) >> 2;
                    int var21 = (arg2 << 7) - -(var13 << 6);
                    int var22 = (arg6 << 7) + (var14 << 6);
                    boolean var23 = class49.field797 && !super.field3583 && var12.field7607;
                    if (var12.method3055((byte) -124)) {
                        class102.method624(var12, (class239) null, arg8, arg6, (class167) null, (byte) 19, arg2, arg1);
                    }
                    boolean var24 = arg7 == -1 && ~var12.field7636 == 0 && var12.field7599 == null && var12.field7596 == null && !var12.field7619;
                    if (!class70.field1059 || (!class18.method116(arg0, 18289) || var12.field7576 == 1) && (!class13.method87(arg0, -2) || ~var12.field7576 != -1)) {
                        if (arg0 == 22) {
                            if (class426.field6401.field993 || ~var12.field7573 != -1 || var12.field7656 == 1 || var12.field7662) {
                                class185 var25;
                                if (!var24) {
                                    var25 = new class458(arg3, var12, arg1, arg10, var21, var20, var22, super.field3583, arg8, arg7);
                                } else {
                                    class219 var26 = new class219(arg3, var12, arg10, var21, var20, var22, super.field3583, arg8, var23);
                                    if (var26.method7((byte) 43)) {
                                        var26.method14(arg3, (byte) 72);
                                    }
                                    var25 = var26;
                                }
                                class185 var27 = class196.method1340(arg1, arg2, arg6);
                                if (!(var27 instanceof class473)) {
                                    class470.method2817(arg1, arg2, arg6, var25);
                                } else {
                                    ((class473) var27).field6965 = var25;
                                }
                                if (~var12.field7656 == -2 && arg5 != null) {
                                    arg5.method877(arg6, arg9 + -653377574, arg2);
                                }
                            }
                        } else if (arg0 != 10 && ~arg0 != -12) {
                            if ((arg0 < 12 || arg0 > 17) && (~arg0 > -19 || ~arg0 < -22)) {
                                if (~arg0 == -1) {
                                    int var31 = var12.field7576;
                                    if (class403.field6079 && ~var12.field7576 == 0) {
                                        var31 = 1;
                                    }
                                    class364 var33;
                                    if (var24) {
                                        class2 var32 = new class2(arg3, var12, arg10, var21, var20, var22, super.field3583, arg0, arg8, var23);
                                        var33 = var32;
                                        if (var32.method7((byte) 66)) {
                                            var32.method14(arg3, (byte) 72);
                                        }
                                    } else {
                                        var33 = new class372(arg3, var12, arg1, arg10, var21, var20, var22, super.field3583, arg0, arg8, arg7);
                                    }
                                    class364 var34 = class426.method2557(arg1, arg2, arg6);
                                    if (var34 instanceof class350) {
                                        ((class350) var34).field5382 = var33;
                                    } else {
                                        class422.method2540(arg1, arg2, arg6, var33, (class364) null);
                                    }
                                    if (class49.field797) {
                                        if (arg8 != 0) {
                                            if (arg8 == 1) {
                                                if (var12.field7615) {
                                                    var19.method198(arg2, arg6 - -1, 50);
                                                    var19.method198(arg2 + 1, arg6 - -1, 50);
                                                }
                                                if (~var31 == -2 && !super.field3583) {
                                                    super.field3591[arg1][arg2][arg6 + 1] = (byte) class18.method119(super.field3591[arg1][arg2][arg6 + 1], 2);
                                                }
                                            } else if (~arg8 == -3) {
                                                if (var12.field7615) {
                                                    var19.method198(arg2 + 1, arg6, 50);
                                                    var19.method198(arg2 - -1, arg6 + 1, 50);
                                                }
                                                if (~var31 == -2 && !super.field3583) {
                                                    super.field3591[arg1][arg2 + 1][arg6] = (byte) class18.method119(super.field3591[arg1][arg2 + 1][arg6], 1);
                                                }
                                            } else if (arg8 == 3) {
                                                if (var12.field7615) {
                                                    var19.method198(arg2, arg6, 50);
                                                    var19.method198(arg2 + 1, arg6, 50);
                                                }
                                                if (var31 == 1 && !super.field3583) {
                                                    super.field3591[arg1][arg2][arg6] = (byte) class18.method119(super.field3591[arg1][arg2][arg6], 2);
                                                }
                                            }
                                        } else {
                                            if (var12.field7615) {
                                                var19.method198(arg2, arg6, 50);
                                                var19.method198(arg2, arg6 + 1, 50);
                                            }
                                            if (~var31 == -2 && !super.field3583) {
                                                super.field3591[arg1][arg2][arg6] = (byte) class18.method119(super.field3591[arg1][arg2][arg6], 1);
                                            }
                                        }
                                    }
                                    if (var12.field7656 != 0 && arg5 != null) {
                                        arg5.method871(!var12.field7582, (byte) -128, arg6, arg0, var12.field7586, arg2, arg8);
                                    }
                                    if (~var12.field7621 != -17) {
                                        class398.method2403(arg1, arg2, arg6, var12.field7621);
                                    }
                                } else if (~arg0 == -2) {
                                    class364 var35;
                                    if (!var24) {
                                        var35 = new class372(arg3, var12, arg1, arg10, var21, var20, var22, super.field3583, arg0, arg8, arg7);
                                    } else {
                                        class2 var36 = new class2(arg3, var12, arg10, var21, var20, var22, super.field3583, arg0, arg8, var23);
                                        if (var36.method7((byte) 54)) {
                                            var36.method14(arg3, (byte) 72);
                                        }
                                        var35 = var36;
                                    }
                                    class364 var37 = class426.method2557(arg1, arg2, arg6);
                                    if (!(var37 instanceof class350)) {
                                        class422.method2540(arg1, arg2, arg6, var35, (class364) null);
                                    } else {
                                        ((class350) var37).field5382 = var35;
                                    }
                                    if (var12.field7615 && class49.field797) {
                                        if (~arg8 != -1) {
                                            if (~arg8 != -2) {
                                                if (arg8 != 2) {
                                                    if (~arg8 == -4) {
                                                        var19.method198(arg2, arg6, 50);
                                                    }
                                                } else {
                                                    var19.method198(arg2 + 1, arg6, 50);
                                                }
                                            } else {
                                                var19.method198(arg2 - -1, arg6 - -1, 50);
                                            }
                                        } else {
                                            var19.method198(arg2, arg6 - -1, 50);
                                        }
                                    }
                                    if (var12.field7656 != 0 && arg5 != null) {
                                        arg5.method871(!var12.field7582, (byte) -117, arg6, arg0, var12.field7586, arg2, arg8);
                                    }
                                } else if (~arg0 == -3) {
                                    int var38 = 3 & arg8 + 1;
                                    class364 var39;
                                    class364 var40;
                                    if (!var24) {
                                        var39 = new class372(arg3, var12, arg1, arg10, var21, var20, var22, super.field3583, arg0, arg8 + 4, arg7);
                                        var40 = new class372(arg3, var12, arg1, arg10, var21, var20, var22, super.field3583, arg0, var38, arg7);
                                    } else {
                                        class2 var41 = new class2(arg3, var12, arg10, var21, var20, var22, super.field3583, arg0, arg8 + 4, var23);
                                        class2 var42 = new class2(arg3, var12, arg10, var21, var20, var22, super.field3583, arg0, var38, var23);
                                        if (var41.method7((byte) 126)) {
                                            var41.method14(arg3, (byte) 72);
                                        }
                                        if (var42.method7((byte) 82)) {
                                            var42.method14(arg3, (byte) 72);
                                        }
                                        var39 = var41;
                                        var40 = var42;
                                    }
                                    class422.method2540(arg1, arg2, arg6, var39, var40);
                                    if (~var12.field7576 == -2 && class49.field797 && !super.field3583) {
                                        if (~arg8 != -1) {
                                            if (arg8 == 1) {
                                                super.field3591[arg1][arg2][arg6 + 1] = (byte) class18.method119(super.field3591[arg1][arg2][arg6 + 1], 2);
                                                super.field3591[arg1][arg2 - -1][arg6] = (byte) class18.method119(super.field3591[arg1][arg2 - -1][arg6], 1);
                                            } else if (arg8 == 2) {
                                                super.field3591[arg1][arg2 + 1][arg6] = (byte) class18.method119(super.field3591[arg1][arg2 + 1][arg6], 1);
                                                super.field3591[arg1][arg2][arg6] = (byte) class18.method119(super.field3591[arg1][arg2][arg6], 2);
                                            } else if (~arg8 == -4) {
                                                super.field3591[arg1][arg2][arg6] = (byte) class18.method119(super.field3591[arg1][arg2][arg6], 2);
                                                super.field3591[arg1][arg2][arg6] = (byte) class18.method119(super.field3591[arg1][arg2][arg6], 1);
                                            }
                                        } else {
                                            super.field3591[arg1][arg2][arg6] = (byte) class18.method119(super.field3591[arg1][arg2][arg6], 1);
                                            super.field3591[arg1][arg2][arg6 - -1] = (byte) class18.method119(super.field3591[arg1][arg2][arg6 - -1], 2);
                                        }
                                    }
                                    if (var12.field7656 != 0 && arg5 != null) {
                                        arg5.method871(!var12.field7582, (byte) 63, arg6, arg0, var12.field7586, arg2, arg8);
                                    }
                                    if (~var12.field7621 != -17) {
                                        class398.method2403(arg1, arg2, arg6, var12.field7621);
                                    }
                                } else if (~arg0 == -4) {
                                    class364 var43;
                                    if (!var24) {
                                        var43 = new class372(arg3, var12, arg1, arg10, var21, var20, var22, super.field3583, arg0, arg8, arg7);
                                    } else {
                                        class2 var44 = new class2(arg3, var12, arg10, var21, var20, var22, super.field3583, arg0, arg8, var23);
                                        var43 = var44;
                                        if (var44.method7((byte) 65)) {
                                            var44.method14(arg3, (byte) 72);
                                        }
                                    }
                                    class364 var45 = class426.method2557(arg1, arg2, arg6);
                                    if (!(var45 instanceof class350)) {
                                        class422.method2540(arg1, arg2, arg6, var43, (class364) null);
                                    } else {
                                        ((class350) var45).field5382 = var43;
                                    }
                                    if (var12.field7615 && class49.field797) {
                                        if (arg8 != 0) {
                                            if (~arg8 != -2) {
                                                if (~arg8 != -3) {
                                                    if (~arg8 == -4) {
                                                        var19.method198(arg2, arg6, 50);
                                                    }
                                                } else {
                                                    var19.method198(arg2 + 1, arg6, 50);
                                                }
                                            } else {
                                                var19.method198(arg2 + 1, arg6 + 1, 50);
                                            }
                                        } else {
                                            var19.method198(arg2, arg6 + 1, 50);
                                        }
                                    }
                                    if (~var12.field7656 != -1 && arg5 != null) {
                                        arg5.method871(!var12.field7582, (byte) -119, arg6, arg0, var12.field7586, arg2, arg8);
                                    }
                                } else if (~arg0 == -10) {
                                    class117 var46;
                                    if (!var24) {
                                        var46 = new class151(arg3, var12, arg1, arg10, var21, var20, var22, super.field3583, arg2, arg2 + var13 + -1, arg6, arg6 + var14 + -1, arg0, arg8, arg7);
                                    } else {
                                        class44 var47 = new class44(arg3, var12, arg1, arg10, var21, var20, var22, super.field3583, arg2, arg2, arg6, arg6, arg0, arg8, var23);
                                        if (var47.method7((byte) 48)) {
                                            var47.method14(arg3, (byte) 72);
                                        }
                                        var46 = var47;
                                    }
                                    class117 var48 = class342.method2093(arg1, arg2, arg6, field4487 != null ? field4487 : (field4487 = method1967("mq")));
                                    if (var48 instanceof class120 && var48.field1762 == arg2 && var48.field1771 == arg6) {
                                        ((class120) var48).field1809 = var46;
                                    } else {
                                        class114.method758(var46, false);
                                    }
                                    if (var12.field7656 != 0 && arg5 != null) {
                                        arg5.method873(var14, arg9 ^ 653377831, var13, !var12.field7582, arg2, arg6, var12.field7586);
                                    }
                                    if (var12.field7621 != 16) {
                                        class398.method2403(arg1, arg2, arg6, var12.field7621);
                                    }
                                } else if (~arg0 == -5) {
                                    class522 var49;
                                    if (!var24) {
                                        var49 = new class170(arg3, var12, arg1, arg10, var21, var20, var22, super.field3583, 0, 0, 0, arg0, arg8, arg7);
                                    } else {
                                        class211 var50 = new class211(arg3, var12, arg10, var21, var20, var22, super.field3583, 0, 0, 0, arg0, arg8);
                                        var49 = var50;
                                        if (var50.method7((byte) 79)) {
                                            var50.method14(arg3, (byte) 72);
                                        }
                                    }
                                    class522 var51 = class444.method2670(arg1, arg2, arg6);
                                    if (var51 instanceof class484) {
                                        ((class484) var51).field7093 = var49;
                                    } else {
                                        class269.method1776(arg1, arg2, arg6, var49, (class522) null);
                                    }
                                } else if (arg0 == 5) {
                                    int var52 = 17;
                                    class351 var53 = (class351) class426.method2557(arg1, arg2, arg6);
                                    if (var53 != null) {
                                        var52 = 1 + class252.field3743.method2686(var53.method20(-30685), (byte) 127).field7621;
                                    }
                                    class522 var54;
                                    if (!var24) {
                                        var54 = new class170(arg3, var12, arg1, arg10, var21, var20, var22, super.field3583, 0, class386.field5850[arg8] * var52, class426.field6400[arg8] * var52, arg0, arg8, arg7);
                                    } else {
                                        class211 var55 = new class211(arg3, var12, arg10, var21, var20, var22, super.field3583, 0, class386.field5850[arg8] * var52, class426.field6400[arg8] * var52, arg0, arg8);
                                        if (var55.method7((byte) 62)) {
                                            var55.method14(arg3, (byte) 72);
                                        }
                                        var54 = var55;
                                    }
                                    class522 var56 = class444.method2670(arg1, arg2, arg6);
                                    if (var56 instanceof class484) {
                                        ((class484) var56).field7093 = var54;
                                    } else {
                                        class269.method1776(arg1, arg2, arg6, var54, (class522) null);
                                    }
                                } else if (arg0 == 6) {
                                    int var57 = 9;
                                    class351 var58 = (class351) class426.method2557(arg1, arg2, arg6);
                                    if (var58 != null) {
                                        var57 = class252.field3743.method2686(var58.method20(arg9 + -653408260), (byte) 105).field7621 / 2 + 1;
                                    }
                                    class522 var59;
                                    if (!var24) {
                                        var59 = new class170(arg3, var12, arg1, arg10, var21, var20, var22, super.field3583, arg8, class64.field967[arg8] * var57, class475.field6995[arg8] * var57, arg0, arg8 + 4, arg7);
                                    } else {
                                        class211 var60 = new class211(arg3, var12, arg10, var21, var20, var22, super.field3583, arg8, class386.field5850[arg8] * var57, class426.field6400[arg8] * var57, arg0, arg8 + 4);
                                        if (var60.method7((byte) 77)) {
                                            var60.method14(arg3, (byte) 72);
                                        }
                                        var59 = var60;
                                    }
                                    class522 var61 = class444.method2670(arg1, arg2, arg6);
                                    if (var61 instanceof class484) {
                                        ((class484) var61).field7093 = var59;
                                    } else {
                                        class269.method1776(arg1, arg2, arg6, var59, (class522) null);
                                    }
                                } else if (~arg0 == -8) {
                                    int var62 = 3 & arg8 - -2;
                                    class522 var63;
                                    if (!var24) {
                                        var63 = new class170(arg3, var12, arg1, arg10, var21, var20, var22, super.field3583, var62, 0, 0, arg0, var62 + 4, arg7);
                                    } else {
                                        class211 var64 = new class211(arg3, var12, arg10, var21, var20, var22, super.field3583, var62, 0, 0, arg0, var62 - -4);
                                        var63 = var64;
                                        if (var64.method7((byte) 16)) {
                                            var64.method14(arg3, (byte) 72);
                                        }
                                    }
                                    class522 var65 = class444.method2670(arg1, arg2, arg6);
                                    if (var65 instanceof class484) {
                                        ((class484) var65).field7093 = var63;
                                    } else {
                                        class269.method1776(arg1, arg2, arg6, var63, (class522) null);
                                    }
                                } else if (~arg0 == -9) {
                                    int var66 = 3 & arg8 + 2;
                                    int var67 = 9;
                                    class351 var68 = (class351) class426.method2557(arg1, arg2, arg6);
                                    if (var68 != null) {
                                        var67 = 1 + class252.field3743.method2686(var68.method20(arg9 + -653408260), (byte) 104).field7621 / 2;
                                    }
                                    class522 var71;
                                    class522 var72;
                                    if (!var24) {
                                        class170 var69 = new class170(arg3, var12, arg1, arg10, var21, var20, var22, super.field3583, arg8, class64.field967[arg8] * var67, class475.field6995[arg8] * var67, arg0, arg8 + 4, arg7);
                                        class170 var70 = new class170(arg3, var12, arg1, arg10, var21, var20, var22, super.field3583, arg8, 0, 0, arg0, var66 + 4, arg7);
                                        var71 = var69;
                                        var72 = var70;
                                    } else {
                                        class211 var73 = new class211(arg3, var12, arg10, var21, var20, var22, super.field3583, arg8, class64.field967[arg8] * var67, class475.field6995[arg8] * var67, arg0, arg8 + 4);
                                        class211 var74 = new class211(arg3, var12, arg10, var21, var20, var22, super.field3583, arg8, 0, 0, arg0, var66 + 4);
                                        if (var73.method7((byte) 31)) {
                                            var73.method14(arg3, (byte) 72);
                                        }
                                        var71 = var73;
                                        var72 = var74;
                                        if (var74.method7((byte) 97)) {
                                            var74.method14(arg3, (byte) 72);
                                        }
                                    }
                                    class269.method1776(arg1, arg2, arg6, var71, var72);
                                }
                            } else {
                                class117 var29;
                                if (var24) {
                                    class44 var28 = new class44(arg3, var12, arg1, arg10, var21, var20, var22, super.field3583, arg2, arg2 + var13 + -1, arg6, var14 + -1 + arg6, arg0, arg8, var23);
                                    if (var28.method7((byte) 42)) {
                                        var28.method14(arg3, (byte) 72);
                                    }
                                    var29 = var28;
                                } else {
                                    var29 = new class151(arg3, var12, arg1, arg10, var21, var20, var22, super.field3583, arg2, var13 + -1 + arg2, arg6, var14 - 1 + arg6, arg0, arg8, arg7);
                                }
                                class117 var30 = class342.method2093(arg1, arg2, arg6, field4487 != null ? field4487 : (field4487 = method1967("mq")));
                                if (var30 instanceof class120 && ~var30.field1762 == ~arg2 && ~var30.field1771 == ~arg6) {
                                    ((class120) var30).field1809 = var29;
                                } else {
                                    class114.method758(var29, false);
                                }
                                if (class49.field797 && !super.field3583 && arg0 >= 12 && arg0 <= 17 && arg0 != 13 && ~arg1 < -1 && ~var12.field7576 != -1) {
                                    super.field3591[arg1][arg2][arg6] = (byte) class18.method119(super.field3591[arg1][arg2][arg6], 4);
                                }
                                if (var12.field7656 != 0 && arg5 != null) {
                                    arg5.method873(var14, arg9 ^ 653377831, var13, !var12.field7582, arg2, arg6, var12.field7586);
                                }
                            }
                        } else {
                            class44 var75 = null;
                            int var76;
                            class117 var77;
                            if (!var24) {
                                var76 = 15;
                                var77 = new class151(arg3, var12, arg1, arg10, var21, var20, var22, super.field3583, arg2, var13 + -1 + arg2, arg6, arg6 + var14 + -1, arg0, arg8, arg7);
                            } else {
                                class44 var78 = new class44(arg3, var12, arg1, arg10, var21, var20, var22, super.field3583, arg2, arg2 + -1 + var13, arg6, arg6 + var14 + -1, arg0, arg8, var23);
                                var76 = var78.method281(-24408);
                                var77 = var78;
                                var75 = var78;
                            }
                            class117 var79 = class342.method2093(arg1, arg2, arg6, field4487 != null ? field4487 : (field4487 = method1967("mq")));
                            boolean var80 = false;
                            if (var79 instanceof class120 && var79.field1762 == arg2 && var79.field1771 == arg6) {
                                var80 = true;
                                ((class120) var79).field1809 = var77;
                            }
                            if (var80 || class114.method758(var77, false)) {
                                if (var75 != null && var75.method7((byte) 70)) {
                                    var75.method14(arg3, (byte) 72);
                                }
                                if (var12.field7615 && class49.field797) {
                                    if (var76 > 30) {
                                        var76 = 30;
                                    }
                                    for (int var81 = 0; ~var13 <= ~var81; ++var81) {
                                        for (int var82 = 0; ~var14 <= ~var82; ++var82) {
                                            var19.method198(arg2 + var81, arg6 + var82, var76);
                                        }
                                    }
                                }
                            }
                            if (var12.field7656 != 0 && arg5 != null) {
                                arg5.method873(var14, 256, var13, !var12.field7582, arg2, arg6, var12.field7586);
                            }
                        }
                    }
                }
            }
        }
    }
}
