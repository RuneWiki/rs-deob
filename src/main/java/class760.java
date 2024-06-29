import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class760 extends class285 {

    @OriginalMember(owner = "client!ms", name = "G", descriptor = "I")
    public int field10600 = 99;

    @OriginalMember(owner = "client!ms", name = "J", descriptor = "I")
    public static int field10603 = 0;

    @OriginalMember(owner = "client!ms", name = "F", descriptor = "I")
    public static int field10599;

    @OriginalMember(owner = "client!ms", name = "H", descriptor = "I")
    public static int field10601;

    @OriginalMember(owner = "client!ms", name = "I", descriptor = "I")
    public static int field10602;

    @OriginalMember(owner = "client!ms", name = "K", descriptor = "I")
    public static int field10604;

    @OriginalMember(owner = "client!ms", name = "L", descriptor = "I")
    public static int field10605;

    @OriginalMember(owner = "client!ms", name = "M", descriptor = "I")
    public static int field10606;

    @OriginalMember(owner = "client!ms", name = "N", descriptor = "I")
    public static int field10607;

    @OriginalMember(owner = "client!ms", name = "O", descriptor = "I")
    public static int field10608;

    @OriginalMember(owner = "client!ms", name = "P", descriptor = "I")
    public static int field10609;

    @OriginalMember(owner = "client!ms", name = "Q", descriptor = "I")
    public static int field10610;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ms", name = "R", descriptor = "Ljava/lang/Class;")
    public static Class field10611;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method4230(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(IIIZ)V", line = 3)
    public class760(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class301.field4067, class130.field1685);
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIILha;Lji;[I)V", line = 8)
    public final void method4220(int arg0, int arg1, int arg2, class60 arg3, class611 arg4, int[] arg5) {
        ++field10609;
        if (!super.field3769) {
            boolean var7 = false;
            if (arg0 != 17685) {
                this.field10600 = 114;
            }
            class308 var8 = null;
            if (arg5 != null) {
                arg5[0] = -1;
            }
            while (true) {
                while (true) {
                    while (true) {
                        while (arg4.field8529.length > arg4.field8520) {
                            int var18 = arg4.method3428((byte) -125);
                            if (~var18 != -1) {
                                if (~var18 != -2) {
                                    if (var18 == 2) {
                                        if (var8 == null) {
                                            var8 = new class308();
                                        }
                                        var8.method1861(-50, arg4);
                                    } else if (var18 == 128) {
                                        if (arg5 != null) {
                                            arg5[0] = arg4.method3402((byte) 127);
                                            arg5[1] = arg4.method3413(false);
                                            arg5[2] = arg4.method3413(false);
                                            arg5[3] = arg4.method3413(false);
                                            arg5[4] = arg4.method3402((byte) 127);
                                        } else {
                                            arg4.field8520 += 10;
                                        }
                                    } else {
                                        if (~var18 != -130) {
                                            throw new IllegalStateException("");
                                        }
                                        if (super.field3786 == null) {
                                            super.field3786 = new byte[4][][];
                                        }
                                        var7 = true;
                                        for (int var19 = 0; var19 < 4; ++var19) {
                                            byte var20 = arg4.method3390((byte) -19);
                                            if (~var20 == -1 && super.field3786[var19] != null) {
                                                int var21 = arg2;
                                                int var22 = arg2 + 64;
                                                int var23 = arg1;
                                                if (~arg2 <= -1) {
                                                    if (~super.field3767 >= ~arg2) {
                                                        var21 = super.field3767;
                                                    }
                                                } else {
                                                    var21 = 0;
                                                }
                                                if (~arg1 <= -1) {
                                                    if (~super.field3766 >= ~arg1) {
                                                        var23 = super.field3766;
                                                    }
                                                } else {
                                                    var23 = 0;
                                                }
                                                int var24 = arg1 + 64;
                                                if (var22 >= 0) {
                                                    if (~super.field3767 >= ~var22) {
                                                        var22 = super.field3767;
                                                    }
                                                } else {
                                                    var22 = 0;
                                                }
                                                if (var24 >= 0) {
                                                    if (var24 >= super.field3766) {
                                                        var24 = super.field3766;
                                                    }
                                                } else {
                                                    var24 = 0;
                                                }
                                                while (var22 > var21) {
                                                    while (~var24 < ~var23) {
                                                        super.field3786[var19][var21][var23] = 0;
                                                        ++var23;
                                                    }
                                                    ++var21;
                                                }
                                            } else if (~var20 == -2) {
                                                if (super.field3786[var19] == null) {
                                                    super.field3786[var19] = new byte[super.field3767 - -1][super.field3766 + 1];
                                                }
                                                for (int var25 = 0; ~var25 > -65; var25 += 4) {
                                                    for (int var26 = 0; ~var26 > -65; var26 += 4) {
                                                        byte var27 = arg4.method3390((byte) -19);
                                                        for (int var28 = arg2 + var25; ~var28 > ~(var25 - (-arg2 + -4)); ++var28) {
                                                            for (int var29 = var26 - -arg1; var29 < arg1 + var26 + 4; ++var29) {
                                                                if (var28 >= 0 && ~var28 > ~super.field3767 && ~var29 <= -1 && ~var29 > ~super.field3766) {
                                                                    super.field3786[var19][var28][var29] = var27;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (~var20 == -3) {
                                                if (super.field3786[var19] == null) {
                                                    super.field3786[var19] = new byte[super.field3767 + 1][super.field3766 + 1];
                                                }
                                                if (~var19 < -1) {
                                                    int var30 = arg2;
                                                    int var31 = arg2 - -64;
                                                    int var32 = arg1;
                                                    if (~arg1 > -1) {
                                                        var32 = 0;
                                                    } else if (~arg1 <= ~super.field3766) {
                                                        var32 = super.field3766;
                                                    }
                                                    if (var31 >= 0) {
                                                        if (~super.field3767 >= ~var31) {
                                                            var31 = super.field3767;
                                                        }
                                                    } else {
                                                        var31 = 0;
                                                    }
                                                    int var33 = arg1 - -64;
                                                    if (~arg2 > -1) {
                                                        var30 = 0;
                                                    } else if (~arg2 <= ~super.field3767) {
                                                        var30 = super.field3767;
                                                    }
                                                    if (var33 >= 0) {
                                                        if (~var33 <= ~super.field3766) {
                                                            var33 = super.field3766;
                                                        }
                                                    } else {
                                                        var33 = 0;
                                                    }
                                                    while (~var30 > ~var31) {
                                                        while (~var33 < ~var32) {
                                                            super.field3786[var19][var30][var32] = super.field3786[var19 + -1][var30][var32];
                                                            ++var32;
                                                        }
                                                        ++var30;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    int var34 = arg4.method3428((byte) -103);
                                    if (var34 > 0) {
                                        for (int var35 = 0; var34 > var35; ++var35) {
                                            class669 var36 = new class669(arg3, arg4, 2);
                                            if (~var36.field9304 == -32) {
                                                class732 var37 = class537.field7293.method2675(arg0 ^ -17714, arg4.method3402((byte) 127));
                                                var36.method3771(var37.field10199, var37.field10195, var37.field10193, (byte) -103, var37.field10197);
                                            }
                                            if (~arg3.method455() < -1) {
                                                class551 var38 = var36.field9295;
                                                int var39 = (arg2 << 9) + var38.method3130(7019);
                                                int var40 = var38.method3136(28699) - -(arg1 << 9);
                                                int var41 = var39 >> 9;
                                                int var42 = var40 >> 9;
                                                if (~var41 <= -1 && ~var42 <= -1 && ~var41 > ~super.field3767 && ~var42 > ~super.field3766) {
                                                    var38.method2926(var40, (byte) -123, var39, super.field3778[var36.field9298][var41][var42] + -var38.method3137((byte) 96));
                                                    class473.method2665(var36);
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                var8 = new class308(arg4);
                            }
                        }
                        if (var8 != null) {
                            for (int var9 = 0; var9 < 8; ++var9) {
                                for (int var10 = 0; var10 < 8; ++var10) {
                                    int var11 = (arg2 >> 3) - -var9;
                                    int var12 = (arg1 >> 3) - -var10;
                                    if (~var11 <= -1 && super.field3767 >> 3 > var11 && ~var12 <= -1 && var12 < super.field3766 >> 3) {
                                        class719.method4045(var12, var11, (byte) 71, var8);
                                    }
                                }
                            }
                        }
                        if (!var7 && super.field3786 != null) {
                            for (int var13 = 0; ~var13 > -5; ++var13) {
                                if (super.field3786[var13] != null) {
                                    for (int var14 = 0; var14 < 16; ++var14) {
                                        for (int var15 = 0; var15 < 16; ++var15) {
                                            int var16 = (arg2 >> 2) + var14;
                                            int var17 = (arg1 >> 2) - -var15;
                                            if (~var16 <= -1 && var16 < 26 && var17 >= 0 && ~var17 > -27) {
                                                super.field3786[var13][var16][var17] = 0;
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

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIIII)Lrl;", line = 380)
    public final class722 method4221(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field10599;
        class722 var6 = null;
        if (~arg1 == arg3) {
            var6 = (class722) class537.method2958(arg2, arg4, arg0);
        }
        if (~arg1 == -2) {
            var6 = (class722) class278.method1659(arg2, arg4, arg0);
        }
        if (arg1 == 2) {
            var6 = (class722) class300.method1797(arg2, arg4, arg0, field10611 != null ? field10611 : (field10611 = method4230("rl")));
        }
        if (~arg1 == -4) {
            var6 = (class722) class531.method2936(arg2, arg4, arg0);
        }
        return var6;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "([Lpfa;II[BIIIIILha;I)V", line = 404)
    public final void method4222(class298[] arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class60 arg9, int arg10) {
        ++field10610;
        class611 var12 = new class611(arg3);
        int var13 = -5 % ((arg10 - -7) / 41);
        int var14 = -1;
        while (true) {
            int var15 = var12.method3407(3893);
            if (~var15 == -1) {
                return;
            }
            var14 += var15;
            int var16 = 0;
            while (true) {
                int var17 = var12.method3396(1689622712);
                if (var17 == 0) {
                    break;
                }
                var16 += var17 - 1;
                int var18 = var16 & 63;
                int var19 = (var16 & 4071) >> 6;
                int var20 = var16 >> 12;
                int var21 = var12.method3428((byte) -127);
                int var22 = var21 >> 2;
                int var23 = var21 & 3;
                if (~arg2 == ~var20 && var19 >= arg6 && ~var19 > ~(arg6 - -8) && ~var18 <= ~arg7 && var18 < arg7 + 8) {
                    class685 var24 = class707.field9894.method4109(var14, (byte) 119);
                    int var25 = class206.method1153(var19 & 7, var23, false, var18 & 7, arg8, var24.field9603, var24.field9588) + arg5;
                    int var26 = class614.method3461(var24.field9588, arg8, var23, 7 & var19, 7 & var18, var24.field9603, (byte) -23) + arg4;
                    if (var25 > 0 && ~var26 < -1 && ~(super.field3767 + -1) < ~var25 && var26 < super.field3766 - 1) {
                        class298 var27 = null;
                        if (!super.field3769) {
                            int var28 = arg1;
                            if ((class114.field1506[1][var25][var26] & 2) == 2) {
                                var28 = arg1 - 1;
                            }
                            if (var28 >= 0) {
                                var27 = arg0[var28];
                            }
                        }
                        this.method4226(var14, var26, -1, arg1, false, var25, arg9, 3 & arg8 + var23, var22, arg1, var27);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Ljava/lang/Throwable;ILjava/lang/String;)V", line = 484)
    public static final void method4223(Throwable arg0, int arg1, String arg2) {
        ++field10602;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class380.method2226(arg0, (byte) -24);
            }
            if (arg1 > -120) {
                field10603 = 20;
            }
            if (arg2 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            class301.method1807(var3, (byte) -80);
            String var4 = class430.method2453("%3a", 4185, ":", var3);
            String var5 = class430.method2453("%40", 4185, "@", var4);
            String var6 = class430.method2453("%26", 4185, "&", var5);
            String var7 = class430.method2453("%23", 4185, "#", var6);
            if (class646.field8991 != null) {
                class107 var8 = class450.field6290.method4134(-108, new URL(class646.field8991.getCodeBase(), "clienterror.ws?c=" + class159.field2003 + "&u=" + (class212.field2541 == null ? String.valueOf(class701.field9843) : class212.field2541) + "&v1=" + class739.field10304 + "&v2=" + class739.field10300 + "&e=" + var7));
                while (~var8.field1419 == -1) {
                    class267.method1599(0, 1L);
                }
                if (var8.field1419 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field1418;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(II[IIILji;Lha;IZII)V", line = 535)
    public final void method4224(int arg0, int arg1, int[] arg2, int arg3, int arg4, class611 arg5, class60 arg6, int arg7, boolean arg8, int arg9, int arg10) {
        ++field10604;
        if (!super.field3769) {
            if (!arg8) {
                this.field10600 = -44;
            }
            boolean var12 = false;
            class308 var13 = null;
            if (arg2 != null) {
                arg2[0] = -1;
            }
            int var14 = (7 & arg0) * 8;
            int var15 = (arg1 & 7) * 8;
            while (true) {
                while (arg5.field8520 < arg5.field8529.length) {
                    int var20 = arg5.method3428((byte) -116);
                    if (var20 == 0) {
                        var13 = new class308(arg5);
                    } else if (~var20 == -2) {
                        int var21 = arg5.method3428((byte) -105);
                        if (~var21 < -1) {
                            for (int var22 = 0; var22 < var21; ++var22) {
                                class669 var23 = new class669(arg6, arg5, 2);
                                if (var23.field9304 == 31) {
                                    class732 var24 = class537.field7293.method2675(-37, arg5.method3402((byte) 127));
                                    var23.method3771(var24.field10199, var24.field10195, var24.field10193, (byte) -98, var24.field10197);
                                }
                                if (arg6.method455() > 0) {
                                    class551 var25 = var23.field9295;
                                    int var26 = var25.method3130(7019) >> 9;
                                    int var27 = var25.method3136(28699) >> 9;
                                    if (var23.field9298 == arg9 && ~var26 <= ~var14 && var26 < var14 + 8 && ~var27 <= ~var15 && var15 + 8 > var27) {
                                        int var28 = (arg3 << 9) + class753.method4188(4095 & var25.method3136(28699), arg7, var25.method3130(7019) & 4095, -7175);
                                        int var29 = var28 >> 9;
                                        int var30 = (arg4 << 9) - -class49.method288(7, arg7, 4095 & var25.method3136(28699), 4095 & var25.method3130(7019));
                                        int var31 = var30 >> 9;
                                        if (~var29 <= -1 && ~var31 <= -1 && ~super.field3767 < ~var29 && super.field3766 > var31) {
                                            var25.method2926(var30, (byte) -122, var28, super.field3778[arg9][var29][var31] - var25.method3137((byte) 72));
                                            class473.method2665(var23);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (~var20 == -3) {
                        if (var13 == null) {
                            var13 = new class308();
                        }
                        var13.method1861(-50, arg5);
                    } else if (var20 == 128) {
                        if (arg2 != null) {
                            arg2[0] = arg5.method3402((byte) 127);
                            arg2[1] = arg5.method3413(!arg8);
                            arg2[2] = arg5.method3413(false);
                            arg2[3] = arg5.method3413(false);
                            arg2[4] = arg5.method3402((byte) 127);
                        } else {
                            arg5.field8520 += 10;
                        }
                    } else {
                        if (~var20 != -130) {
                            throw new IllegalStateException("");
                        }
                        if (super.field3786 == null) {
                            super.field3786 = new byte[4][][];
                        }
                        for (int var32 = 0; ~var32 > -5; ++var32) {
                            byte var33 = arg5.method3390((byte) -19);
                            if (~var33 == -1 && super.field3786[arg10] != null) {
                                if (var32 <= arg9) {
                                    int var34 = arg3;
                                    int var35 = arg3 + 7;
                                    int var36 = arg4;
                                    if (arg4 < 0) {
                                        var36 = 0;
                                    } else if (arg4 >= super.field3766) {
                                        var36 = super.field3766;
                                    }
                                    int var37 = arg4 + 7;
                                    if (arg3 < 0) {
                                        var34 = 0;
                                    } else if (arg3 >= super.field3767) {
                                        var34 = super.field3767;
                                    }
                                    if (var35 >= 0) {
                                        if (~super.field3767 >= ~var35) {
                                            var35 = super.field3767;
                                        }
                                    } else {
                                        var35 = 0;
                                    }
                                    if (var37 >= 0) {
                                        if (var37 >= super.field3766) {
                                            var37 = super.field3766;
                                        }
                                    } else {
                                        var37 = 0;
                                    }
                                    while (~var35 < ~var34) {
                                        while (~var36 > ~var37) {
                                            super.field3786[arg10][var34][var36] = 0;
                                            ++var36;
                                        }
                                        ++var34;
                                    }
                                }
                            } else if (var33 == 1) {
                                if (super.field3786[arg10] == null) {
                                    super.field3786[arg10] = new byte[super.field3767 + 1][super.field3766 + 1];
                                }
                                for (int var38 = 0; ~var38 > -65; var38 += 4) {
                                    for (int var39 = 0; ~var39 > -65; var39 += 4) {
                                        byte var40 = arg5.method3390((byte) -19);
                                        if (~arg9 <= ~var32) {
                                            for (int var41 = var38; ~var41 > ~(var38 - -4); ++var41) {
                                                for (int var42 = var39; var42 < var39 + 4; ++var42) {
                                                    if (~var14 >= ~var41 && ~(var14 + 8) < ~var41 && var15 <= var42 && ~var15 > ~(var15 + 8)) {
                                                        int var43 = arg3 - -class49.method284(7 & var41, 0, 7 & var42, arg7);
                                                        int var44 = class650.method3671(var41 & 7, var42 & 7, arg7, (byte) -122) + arg4;
                                                        if (var43 >= 0 && ~super.field3767 < ~var43 && ~var44 <= -1 && ~super.field3766 < ~var44) {
                                                            super.field3786[arg10][var43][var44] = var40;
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
                    class719.method4045(arg4 >> 3, arg3 >> 3, (byte) 31, var13);
                }
                if (!var12 && super.field3786 != null && super.field3786[arg10] != null) {
                    int var16 = arg3 + 7;
                    int var17 = arg4 - -7;
                    for (int var18 = arg3; ~var18 > ~var16; ++var18) {
                        for (int var19 = arg4; ~var17 < ~var19; ++var19) {
                            super.field3786[arg10][var18][var19] = 0;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(III)V", line = 836)
    public static final void method4225(int arg0, int arg1, int arg2) {
        ++field10607;
        if (arg1 < -1) {
            class252 var3 = class150.method916(arg2, -101, 7);
            var3.method1502((byte) -103);
            var3.field3251 = arg0;
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIIIZILha;IIILpfa;)V", line = 856)
    public final void method4226(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, class60 arg6, int arg7, int arg8, int arg9, class298 arg10) {
        ++field10601;
        if (class11.field68.field5548.method186((byte) 120) != 0 || class351.method2038(arg1, arg3, arg5, class131.field1693, 55)) {
            if (~this.field10600 < ~arg9) {
                this.field10600 = arg9;
            }
            class685 var12 = class707.field9894.method4109(arg0, (byte) 119);
            if (class11.field68.field5521.method3358((byte) 121) != 0 || !var12.field9592) {
                int var13;
                int var14;
                if (~arg7 != -2 && ~arg7 != -4) {
                    var13 = var12.field9603;
                    var14 = var12.field9588;
                } else {
                    var13 = var12.field9588;
                    var14 = var12.field9603;
                }
                int var15;
                int var16;
                if (~(arg5 - -var13) < ~super.field3767) {
                    var15 = arg5 - -1;
                    var16 = arg5;
                } else {
                    var16 = (var13 >> 1) + arg5;
                    var15 = (var13 - -1 >> 1) + arg5;
                }
                int var17;
                int var18;
                if (~super.field3766 <= ~(arg1 - -var14)) {
                    var17 = (var14 >> 1) + arg1;
                    var18 = arg1 - -(var14 + 1 >> 1);
                } else {
                    var18 = arg1 + 1;
                    var17 = arg1;
                }
                class281 var19 = class25.field188[arg3];
                int var20 = var19.method1685(var17, -12639, var16) + (var19.method1685(var17, -12639, var15) + var19.method1685(var18, -12639, var16) - -var19.method1685(var18, -12639, var15)) >> 2;
                int var21 = (arg5 << 9) + (var13 << 8);
                if (arg4) {
                    this.method4229((class298[]) null, 36, (byte) -79, (byte[]) null, (class60) null, 13);
                }
                int var22 = (arg1 << 9) + (var14 << 8);
                boolean var23 = class11.field63 && !super.field3769 && var12.field9621;
                if (var12.method3881(103)) {
                    class333.method1978((class83) null, var12, arg5, arg7, 3, arg1, arg9, (class215) null);
                }
                boolean var24 = ~arg2 == 0 && ~var12.field9547 == 0 && var12.field9589 == null && var12.field9528 == null && !var12.field9619 && !var12.field9596;
                if (!class709.field9906 || (!class463.method2579(-4, arg8) || var12.field9564 == 1) && (!class329.method1954(arg8, (byte) 85) || var12.field9564 != 0)) {
                    if (~arg8 == -23) {
                        if (class11.field68.field5498.method4055((byte) 121) != 0 || var12.field9610 != 0 || ~var12.field9611 == -2 || var12.field9578) {
                            class142 var26;
                            if (var24) {
                                class754 var25 = new class754(arg6, var12, arg9, arg3, var21, var20, var22, super.field3769, arg7, var23);
                                var26 = var25;
                                if (var25.method682(!arg4)) {
                                    var25.method679(arg6, 24447);
                                }
                            } else {
                                var26 = new class98(arg6, var12, arg9, arg3, var21, var20, var22, super.field3769, arg7, arg2);
                            }
                            class296.method1768(arg9, arg5, arg1, var26);
                            if (~var12.field9611 == -2 && arg10 != null) {
                                arg10.method1784(arg5, (byte) -14, arg1);
                            }
                        }
                    } else if (arg8 != 10 && arg8 != 11) {
                        if ((arg8 < 12 || arg8 > 17) && (arg8 < 18 || ~arg8 < -22)) {
                            if (arg8 == 0) {
                                int var29 = var12.field9564;
                                if (class101.field1338 && var12.field9564 == -1) {
                                    var29 = 1;
                                }
                                class719 var30;
                                if (!var24) {
                                    var30 = new class534(arg6, var12, arg9, arg3, var21, var20, var22, super.field3769, arg8, arg7, arg2);
                                } else {
                                    class138 var31 = new class138(arg6, var12, arg9, arg3, var21, var20, var22, super.field3769, arg8, arg7, var23);
                                    var30 = var31;
                                    if (var31.method682(true)) {
                                        var31.method679(arg6, 24447);
                                    }
                                }
                                class25.method98(arg9, arg5, arg1, var30, (class719) null);
                                if (~arg7 == -1) {
                                    if (class11.field63 && var12.field9553) {
                                        var19.method1528(arg5, arg1, 50);
                                        var19.method1528(arg5, arg1 + 1, 50);
                                    }
                                    if (var29 == 1 && !super.field3769) {
                                        class670.method3773(arg5, arg9, arg1, var12.field9560, var12.field9598, 1, 8);
                                    }
                                } else if (arg7 != 1) {
                                    if (arg7 != 2) {
                                        if (arg7 == 3) {
                                            if (class11.field63 && var12.field9553) {
                                                var19.method1528(arg5, arg1, 50);
                                                var19.method1528(arg5 + 1, arg1, 50);
                                            }
                                            if (~var29 == -2 && !super.field3769) {
                                                class670.method3773(arg5, arg9, arg1, var12.field9560, var12.field9598, 2, 8);
                                            }
                                        }
                                    } else {
                                        if (class11.field63 && var12.field9553) {
                                            var19.method1528(arg5 + 1, arg1, 50);
                                            var19.method1528(arg5 + 1, arg1 - -1, 50);
                                        }
                                        if (~var29 == -2 && !super.field3769) {
                                            class670.method3773(arg5 + 1, arg9, arg1, -var12.field9560, var12.field9598, 1, 8);
                                        }
                                    }
                                } else {
                                    if (class11.field63 && var12.field9553) {
                                        var19.method1528(arg5, arg1 - -1, 50);
                                        var19.method1528(arg5 + 1, arg1 - -1, 50);
                                    }
                                    if (var29 == 1 && !super.field3769) {
                                        class670.method3773(arg5, arg9, arg1 + 1, -var12.field9560, var12.field9598, 2, 8);
                                    }
                                }
                                if (var12.field9611 != 0 && arg10 != null) {
                                    arg10.method1783(arg1, var12.field9568, !var12.field9567, arg7, arg5, arg8, (byte) 122);
                                }
                                if (~var12.field9575 != -65) {
                                    class753.method4193(arg9, arg5, arg1, var12.field9575);
                                }
                            } else if (arg8 == 1) {
                                class719 var32;
                                if (!var24) {
                                    var32 = new class534(arg6, var12, arg9, arg3, var21, var20, var22, super.field3769, arg8, arg7, arg2);
                                } else {
                                    class138 var33 = new class138(arg6, var12, arg9, arg3, var21, var20, var22, super.field3769, arg8, arg7, var23);
                                    if (var33.method682(!arg4)) {
                                        var33.method679(arg6, 24447);
                                    }
                                    var32 = var33;
                                }
                                class25.method98(arg9, arg5, arg1, var32, (class719) null);
                                if (var12.field9553 && class11.field63) {
                                    if (~arg7 == -1) {
                                        var19.method1528(arg5, arg1 + 1, 50);
                                    } else if (~arg7 != -2) {
                                        if (~arg7 == -3) {
                                            var19.method1528(arg5 + 1, arg1, 50);
                                        } else if (~arg7 == -4) {
                                            var19.method1528(arg5, arg1, 50);
                                        }
                                    } else {
                                        var19.method1528(arg5 + 1, arg1 - -1, 50);
                                    }
                                }
                                if (~var12.field9611 != -1 && arg10 != null) {
                                    arg10.method1783(arg1, var12.field9568, !var12.field9567, arg7, arg5, arg8, (byte) 104);
                                }
                            } else if (~arg8 == -3) {
                                int var34 = 3 & arg7 + 1;
                                class719 var37;
                                class719 var38;
                                if (var24) {
                                    class138 var35 = new class138(arg6, var12, arg9, arg3, var21, var20, var22, super.field3769, arg8, arg7 + 4, var23);
                                    class138 var36 = new class138(arg6, var12, arg9, arg3, var21, var20, var22, super.field3769, arg8, var34, var23);
                                    if (var35.method682(true)) {
                                        var35.method679(arg6, 24447);
                                    }
                                    var37 = var35;
                                    if (var36.method682(true)) {
                                        var36.method679(arg6, 24447);
                                    }
                                    var38 = var36;
                                } else {
                                    var37 = new class534(arg6, var12, arg9, arg3, var21, var20, var22, super.field3769, arg8, arg7 + 4, arg2);
                                    var38 = new class534(arg6, var12, arg9, arg3, var21, var20, var22, super.field3769, arg8, var34, arg2);
                                }
                                class25.method98(arg9, arg5, arg1, var37, var38);
                                if ((var12.field9564 == 1 || class101.field1338 && ~var12.field9564 == 0) && !super.field3769) {
                                    if (~arg7 == -1) {
                                        class670.method3773(arg5, arg9, arg1, var12.field9560, var12.field9598, 1, 8);
                                        class670.method3773(arg5, arg9, arg1 - -1, var12.field9560, var12.field9598, 2, 8);
                                    } else if (arg7 != 1) {
                                        if (~arg7 != -3) {
                                            if (~arg7 == -4) {
                                                class670.method3773(arg5, arg9, arg1, var12.field9560, var12.field9598, 1, 8);
                                                class670.method3773(arg5, arg9, arg1, var12.field9560, var12.field9598, 2, 8);
                                            }
                                        } else {
                                            class670.method3773(arg5 - -1, arg9, arg1, var12.field9560, var12.field9598, 1, 8);
                                            class670.method3773(arg5, arg9, arg1, var12.field9560, var12.field9598, 2, 8);
                                        }
                                    } else {
                                        class670.method3773(arg5 + 1, arg9, arg1, var12.field9560, var12.field9598, 1, 8);
                                        class670.method3773(arg5, arg9, arg1 + 1, var12.field9560, var12.field9598, 2, 8);
                                    }
                                }
                                if (~var12.field9611 != -1 && arg10 != null) {
                                    arg10.method1783(arg1, var12.field9568, !var12.field9567, arg7, arg5, arg8, (byte) 70);
                                }
                                if (~var12.field9575 != -65) {
                                    class753.method4193(arg9, arg5, arg1, var12.field9575);
                                }
                            } else if (arg8 == 3) {
                                class719 var39;
                                if (!var24) {
                                    var39 = new class534(arg6, var12, arg9, arg3, var21, var20, var22, super.field3769, arg8, arg7, arg2);
                                } else {
                                    class138 var40 = new class138(arg6, var12, arg9, arg3, var21, var20, var22, super.field3769, arg8, arg7, var23);
                                    var39 = var40;
                                    if (var40.method682(true)) {
                                        var40.method679(arg6, 24447);
                                    }
                                }
                                class25.method98(arg9, arg5, arg1, var39, (class719) null);
                                if (var12.field9553 && class11.field63) {
                                    if (arg7 != 0) {
                                        if (arg7 == 1) {
                                            var19.method1528(arg5 + 1, arg1 + 1, 50);
                                        } else if (~arg7 == -3) {
                                            var19.method1528(arg5 + 1, arg1, 50);
                                        } else if (arg7 == 3) {
                                            var19.method1528(arg5, arg1, 50);
                                        }
                                    } else {
                                        var19.method1528(arg5, arg1 + 1, 50);
                                    }
                                }
                                if (~var12.field9611 != -1 && arg10 != null) {
                                    arg10.method1783(arg1, var12.field9568, !var12.field9567, arg7, arg5, arg8, (byte) 126);
                                }
                            } else if (arg8 == 9) {
                                class752 var42;
                                if (var24) {
                                    class265 var41 = new class265(arg6, var12, arg9, arg3, var21, var20, var22, super.field3769, arg5, arg5, arg1, arg1, arg8, arg7, var23);
                                    var42 = var41;
                                    if (var41.method682(true)) {
                                        var41.method679(arg6, 24447);
                                    }
                                } else {
                                    var42 = new class536(arg6, var12, arg9, arg3, var21, var20, var22, super.field3769, arg5, arg5 + var13 + -1, arg1, var14 + -1 + arg1, arg8, arg7, arg2);
                                }
                                class202.method1119(var42, false);
                                if (~var12.field9564 == -2 && !super.field3769) {
                                    byte var43;
                                    if ((1 & arg7) == 0) {
                                        var43 = 8;
                                    } else {
                                        var43 = 16;
                                    }
                                    class670.method3773(arg5, arg9, arg1, 0, var12.field9598, var43, 8);
                                }
                                if (~var12.field9611 != -1 && arg10 != null) {
                                    arg10.method1787(0, !var12.field9567, arg5, var14, var13, var12.field9568, arg1);
                                }
                                if (~var12.field9575 != -65) {
                                    class753.method4193(arg9, arg5, arg1, var12.field9575);
                                }
                            } else if (arg8 == 4) {
                                class744 var44;
                                if (!var24) {
                                    var44 = new class312(arg6, var12, arg9, arg3, var21, var20, var22, super.field3769, 0, 0, arg8, arg7, arg2);
                                } else {
                                    class561 var45 = new class561(arg6, var12, arg9, arg3, var21, var20, var22, super.field3769, 0, 0, arg8, arg7);
                                    if (var45.method682(!arg4)) {
                                        var45.method679(arg6, 24447);
                                    }
                                    var44 = var45;
                                }
                                class142.method886(arg9, arg5, arg1, var44, (class744) null);
                            } else if (~arg8 == -6) {
                                int var46 = 65;
                                class722 var47 = (class722) class537.method2958(arg9, arg5, arg1);
                                if (var47 != null) {
                                    var46 = 1 + class707.field9894.method4109(var47.method680(30472), (byte) 119).field9575;
                                }
                                class744 var48;
                                if (!var24) {
                                    var48 = new class312(arg6, var12, arg9, arg3, var21, var20, var22, super.field3769, class363.field4808[arg7] * var46, class750.field10395[arg7] * var46, arg8, arg7, arg2);
                                } else {
                                    class561 var49 = new class561(arg6, var12, arg9, arg3, var21, var20, var22, super.field3769, class363.field4808[arg7] * var46, class750.field10395[arg7] * var46, arg8, arg7);
                                    if (var49.method682(true)) {
                                        var49.method679(arg6, 24447);
                                    }
                                    var48 = var49;
                                }
                                class142.method886(arg9, arg5, arg1, var48, (class744) null);
                            } else if (arg8 == 6) {
                                int var50 = 33;
                                class722 var51 = (class722) class537.method2958(arg9, arg5, arg1);
                                if (var51 != null) {
                                    var50 = 1 + class707.field9894.method4109(var51.method680(30472), (byte) 119).field9575 / 2;
                                }
                                class744 var53;
                                if (var24) {
                                    class561 var52 = new class561(arg6, var12, arg9, arg3, var21, var20, var22, super.field3769, class363.field4808[arg7] * var50, class750.field10395[arg7] * var50, arg8, arg7 + 4);
                                    var53 = var52;
                                    if (var52.method682(true)) {
                                        var52.method679(arg6, 24447);
                                    }
                                } else {
                                    var53 = new class312(arg6, var12, arg9, arg3, var21, var20, var22, super.field3769, class205.field2427[arg7] * var50, class25.field189[arg7] * var50, arg8, arg7 + 4, arg2);
                                }
                                class142.method886(arg9, arg5, arg1, var53, (class744) null);
                            } else if (arg8 == 7) {
                                int var54 = 3 & arg7 - -2;
                                class744 var55;
                                if (!var24) {
                                    var55 = new class312(arg6, var12, arg9, arg3, var21, var20, var22, super.field3769, 0, 0, arg8, var54 + 4, arg2);
                                } else {
                                    class561 var56 = new class561(arg6, var12, arg9, arg3, var21, var20, var22, super.field3769, 0, 0, arg8, var54 + 4);
                                    var55 = var56;
                                    if (var56.method682(true)) {
                                        var56.method679(arg6, 24447);
                                    }
                                }
                                class142.method886(arg9, arg5, arg1, var55, (class744) null);
                            } else if (~arg8 == -9) {
                                int var57 = 3 & arg7 + 2;
                                int var58 = 33;
                                class722 var59 = (class722) class537.method2958(arg9, arg5, arg1);
                                if (var59 != null) {
                                    var58 = class707.field9894.method4109(var59.method680(30472), (byte) 119).field9575 / 2 - -1;
                                }
                                class744 var62;
                                class744 var63;
                                if (!var24) {
                                    class312 var60 = new class312(arg6, var12, arg9, arg3, var21, var20, var22, super.field3769, class205.field2427[arg7] * var58, class25.field189[arg7] * var58, arg8, arg7 + 4, arg2);
                                    class312 var61 = new class312(arg6, var12, arg9, arg3, var21, var20, var22, super.field3769, 0, 0, arg8, var57 + 4, arg2);
                                    var62 = var60;
                                    var63 = var61;
                                } else {
                                    class561 var64 = new class561(arg6, var12, arg9, arg3, var21, var20, var22, super.field3769, class205.field2427[arg7] * var58, class25.field189[arg7] * var58, arg8, arg7 + 4);
                                    class561 var65 = new class561(arg6, var12, arg9, arg3, var21, var20, var22, super.field3769, 0, 0, arg8, var57 + 4);
                                    if (var64.method682(true)) {
                                        var64.method679(arg6, 24447);
                                    }
                                    if (var65.method682(true)) {
                                        var65.method679(arg6, 24447);
                                    }
                                    var62 = var64;
                                    var63 = var65;
                                }
                                class142.method886(arg9, arg5, arg1, var62, var63);
                            }
                        } else {
                            class752 var27;
                            if (!var24) {
                                var27 = new class536(arg6, var12, arg9, arg3, var21, var20, var22, super.field3769, arg5, arg5 + -1 + var13, arg1, arg1 + -1 + var14, arg8, arg7, arg2);
                            } else {
                                class265 var28 = new class265(arg6, var12, arg9, arg3, var21, var20, var22, super.field3769, arg5, arg5 + -1 + var13, arg1, arg1 - (-var14 - -1), arg8, arg7, var23);
                                if (var28.method682(!arg4)) {
                                    var28.method679(arg6, 24447);
                                }
                                var27 = var28;
                            }
                            class202.method1119(var27, false);
                            if (class11.field63 && !super.field3769 && arg8 >= 12 && arg8 <= 17 && ~arg8 != -14 && arg9 > 0 && ~var12.field9564 != -1) {
                                super.field3781[arg9][arg5][arg1] = (byte) class344.method2020(super.field3781[arg9][arg5][arg1], 4);
                            }
                            if (var12.field9611 != 0 && arg10 != null) {
                                arg10.method1787(0, !var12.field9567, arg5, var14, var13, var12.field9568, arg1);
                            }
                        }
                    } else {
                        class265 var66 = null;
                        int var68;
                        class752 var69;
                        if (var24) {
                            class265 var67 = new class265(arg6, var12, arg9, arg3, var21, var20, var22, super.field3769, arg5, arg5 + var13 + -1, arg1, var14 + -1 + arg1, arg8, arg7, var23);
                            var68 = var67.method1587(94);
                            var69 = var67;
                            var66 = var67;
                        } else {
                            var69 = new class536(arg6, var12, arg9, arg3, var21, var20, var22, super.field3769, arg5, arg5 + -1 - -var13, arg1, var14 + -1 + arg1, arg8, arg7, arg2);
                            var68 = 15;
                        }
                        if (class202.method1119(var69, false)) {
                            if (var66 != null && var66.method682(true)) {
                                var66.method679(arg6, 24447);
                            }
                            if (var12.field9553 && class11.field63) {
                                if (~var68 < -31) {
                                    var68 = 30;
                                }
                                for (int var70 = 0; ~var70 >= ~var13; ++var70) {
                                    for (int var71 = 0; var71 <= var14; ++var71) {
                                        var19.method1528(arg5 + var70, arg1 + var71, var68);
                                    }
                                }
                            }
                        }
                        if (var12.field9611 != 0 && arg10 != null) {
                            arg10.method1787(0, !var12.field9567, arg5, var14, var13, var12.field9568, arg1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(ZBLha;)V", line = 1482)
    public final void method4227(boolean arg0, byte arg1, class60 arg2) {
        class69.method516();
        ++field10608;
        if (arg1 == 105) {
            if (!arg0) {
                if (super.field3774 > 1) {
                    for (int var4 = 0; var4 < super.field3767; ++var4) {
                        for (int var5 = 0; ~super.field3766 < ~var5; ++var5) {
                            if (~(2 & class114.field1506[1][var4][var5]) == -3) {
                                class325.method1938(var4, var5);
                            }
                        }
                    }
                }
                for (int var6 = 0; super.field3774 > var6; ++var6) {
                    for (int var7 = 0; ~var7 >= ~super.field3766; ++var7) {
                        for (int var8 = 0; var8 <= super.field3767; ++var8) {
                            if ((super.field3781[var6][var8][var7] & 4) != 0) {
                                int var9 = var8;
                                int var10 = var8;
                                int var11 = var7;
                                int var12 = var7;
                                while (~var11 < -1 && (4 & super.field3781[var6][var8][var11 + -1]) != 0 && ~(-var11 + var12) > -11) {
                                    --var11;
                                }
                                while (var12 < super.field3766 && ~(4 & super.field3781[var6][var8][var12 + 1]) != -1 && ~(-var11 + var12) > -11) {
                                    ++var12;
                                }
                                label117: while (var9 > 0 && ~(-var9 + var10) > -11) {
                                    for (int var13 = var11; var13 <= var12; ++var13) {
                                        if ((super.field3781[var6][var9 + -1][var13] & 4) == 0) {
                                            break label117;
                                        }
                                    }
                                    --var9;
                                }
                                label104: while (var10 < super.field3767 && ~(-var9 + var10) > -11) {
                                    for (int var14 = var11; ~var14 >= ~var12; ++var14) {
                                        if (~(super.field3781[var6][var10 + 1][var14] & 4) == -1) {
                                            break label104;
                                        }
                                    }
                                    ++var10;
                                }
                                if (~((-var9 + var10 + 1) * (-var11 + var12 + 1)) <= -5) {
                                    int var15 = super.field3778[var6][var9][var11];
                                    class294.method1754(var9 << 9, (var12 << 9) + 512, false, 4, var6, (var10 << 9) + 512, var15, var11 << 9, var15);
                                    for (int var16 = var9; var10 >= var16; ++var16) {
                                        for (int var17 = var11; var17 <= var12; ++var17) {
                                            super.field3781[var6][var16][var17] = (byte) class321.method1919(super.field3781[var6][var16][var17], -5);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                class402.method2326(31398);
            }
            super.field3781 = null;
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IILha;Lpfa;III)V", line = 1621)
    public final void method4228(int arg0, int arg1, class60 arg2, class298 arg3, int arg4, int arg5, int arg6) {
        ++field10605;
        class722 var8 = this.method4221(arg0, arg5, arg1, -1, arg6);
        if (var8 != null) {
            class685 var9 = class707.field9894.method4109(var8.method680(30472), (byte) 119);
            int var10 = var8.method686((byte) 20);
            int var11 = var8.method685(4657);
            if (var9.method3881(95)) {
                class615.method3462(var9, -22015, arg0, arg1, arg6);
            }
            if (var8.method682(true)) {
                var8.method678(-25163, arg2);
            }
            if (~arg5 == -1) {
                class129.method818(arg1, arg6, arg0);
                if (var9.field9611 != 0) {
                    arg3.method1775(var10, var9.field9568, (byte) 84, !var9.field9567, arg6, var11, arg0);
                }
                if (var9.field9564 == 1) {
                    if (var11 != 0) {
                        if (~var11 == -2) {
                            class76.method564(2, arg1, arg6, arg0 + 1, 64);
                        } else if (var11 != 2) {
                            if (var11 == 3) {
                                class76.method564(2, arg1, arg6, arg0, arg4 + 63);
                            }
                        } else {
                            class76.method564(1, arg1, arg6 - -1, arg0, arg4 ^ 65);
                        }
                    } else {
                        class76.method564(1, arg1, arg6, arg0, 64);
                    }
                }
            } else if (~arg5 == -2) {
                class29.method117(arg1, arg6, arg0);
            } else if (~arg5 != -3) {
                if (arg5 == 3) {
                    class503.method2803(arg1, arg6, arg0);
                    if (var9.field9611 == 1) {
                        arg3.method1786(false, arg6, arg0);
                    }
                }
            } else {
                class526.method2919(arg1, arg6, arg0, field10611 != null ? field10611 : (field10611 = method4230("rl")));
                if (~var9.field9611 != -1 && ~super.field3767 < ~(arg6 - -var9.field9603) && ~(var9.field9603 + arg0) > ~super.field3766 && ~(var9.field9588 + arg6) > ~super.field3767 && super.field3766 > arg0 - -var9.field9588) {
                    arg3.method1789(var9.field9603, var9.field9568, var11, var9.field9588, arg0, !var9.field9567, 131072, arg6);
                }
                if (~var10 == -10) {
                    if ((var11 & 1) == 0) {
                        class76.method564(8, arg1, arg6, arg0, 64);
                    } else {
                        class76.method564(16, arg1, arg6, arg0, 64);
                    }
                }
            }
        }
        if (arg4 != 1) {
            field10603 = 81;
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "([Lpfa;IB[BLha;I)V", line = 1717)
    public final void method4229(class298[] arg0, int arg1, byte arg2, byte[] arg3, class60 arg4, int arg5) {
        ++field10606;
        if (arg2 >= -13) {
            this.method4220(-109, 44, -116, (class60) null, (class611) null, (int[]) null);
        }
        class611 var7 = new class611(arg3);
        int var8 = -1;
        while (true) {
            int var9 = var7.method3407(3893);
            if (~var9 == -1) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method3396(1689622712);
                if (var11 == 0) {
                    break;
                }
                var10 += var11 + -1;
                int var12 = 63 & var10;
                int var13 = (4074 & var10) >> 6;
                int var14 = var10 >> 12;
                int var15 = var7.method3428((byte) 50);
                int var16 = var15 >> 2;
                int var17 = 3 & var15;
                int var18 = arg5 + var13;
                int var19 = arg1 + var12;
                if (~var18 < -1 && ~var19 < -1 && ~var18 > ~(super.field3767 - 1) && super.field3766 + -1 > var19) {
                    class298 var20 = null;
                    if (!super.field3769) {
                        int var21 = var14;
                        if ((class114.field1506[1][var18][var19] & 2) == 2) {
                            var21 = var14 - 1;
                        }
                        if (~var21 <= -1) {
                            var20 = arg0[var21];
                        }
                    }
                    this.method4226(var8, var19, -1, var14, false, var18, arg4, var17, var16, var14, var20);
                }
            }
        }
    }
}
