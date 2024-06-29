import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tha")
public class class486 extends class145 {

    @OriginalMember(owner = "client!tha", name = "N", descriptor = "I")
    public int field6914 = 99;

    @OriginalMember(owner = "client!tha", name = "O", descriptor = "I")
    public static int field6915 = 0;

    @OriginalMember(owner = "client!tha", name = "E", descriptor = "J")
    public static long field6905 = 0L;

    @OriginalMember(owner = "client!tha", name = "F", descriptor = "I")
    public static int field6906;

    @OriginalMember(owner = "client!tha", name = "G", descriptor = "I")
    public static int field6907;

    @OriginalMember(owner = "client!tha", name = "H", descriptor = "I")
    public static int field6908;

    @OriginalMember(owner = "client!tha", name = "I", descriptor = "I")
    public static int field6909;

    @OriginalMember(owner = "client!tha", name = "J", descriptor = "I")
    public static int field6910;

    @OriginalMember(owner = "client!tha", name = "K", descriptor = "I")
    public static int field6911;

    @OriginalMember(owner = "client!tha", name = "L", descriptor = "I")
    public static int field6912;

    @OriginalMember(owner = "client!tha", name = "M", descriptor = "I")
    public static int field6913;

    @OriginalMember(owner = "client!tha", name = "P", descriptor = "I")
    public static int field6916;

    @OriginalMember(owner = "client!tha", name = "Q", descriptor = "I")
    public static int field6917;

    @OriginalMember(owner = "client!tha", name = "R", descriptor = "I")
    public static int field6918;

    @OriginalMember(owner = "client!tha", name = "S", descriptor = "I")
    public static int field6919;

    @OriginalMember(owner = "client!tha", name = "T", descriptor = "I")
    public static int field6920;

    // $FF: synthetic field
    @OriginalMember(owner = "client!tha", name = "U", descriptor = "Ljava/lang/Class;")
    public static Class field6921;

    // $FF: synthetic method
    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2845(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "([BI[Lrl;Lha;II)V", line = 3)
    public final void method2835(byte[] arg0, int arg1, class685[] arg2, class454 arg3, int arg4, int arg5) {
        ++field6911;
        class179 var7 = new class179(arg0);
        if (arg1 != 4) {
            this.field6914 = 97;
        }
        int var8 = -1;
        while (true) {
            int var9 = var7.method1151(-127);
            if (~var9 == -1) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method1158(-32768);
                if (~var11 == -1) {
                    break;
                }
                var10 += var11 + -1;
                int var12 = var10 & 63;
                int var13 = var10 >> 6 & 63;
                int var14 = var10 >> 12;
                int var15 = var7.method1094(arg1 + 251);
                int var16 = var15 >> 2;
                int var17 = var15 & 3;
                int var18 = arg4 + var13;
                int var19 = arg5 + var12;
                if (~var18 < -1 && ~var19 < -1 && var18 < super.field1741 - 1 && ~var19 > ~(super.field1734 + -1)) {
                    class685 var20 = null;
                    if (!super.field1740) {
                        int var21 = var14;
                        if ((2 & class215.field2728[1][var18][var19]) == 2) {
                            var21 = var14 - 1;
                        }
                        if (var21 >= 0) {
                            var20 = arg2[var21];
                        }
                    }
                    this.method2841(arg3, var8, var14, var19, var17, -1, var16, var18, -69, var20, var14);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(III)V", line = 79)
    public static final void method2836(int arg0, int arg1, int arg2) {
        ++field6917;
        if (arg2 == 7) {
            if (class341.field4413 < class341.field4414) {
                class341.field4413 = (float) ((double) class341.field4413 / 30.0D + (double) class341.field4413);
                if (class341.field4414 < class341.field4413) {
                    class341.field4413 = class341.field4414;
                }
                class608.method3333((byte) 112);
                class341.field4420 = (int) class341.field4413 >> 1;
                class341.field4416 = class670.method3622((byte) 110, class341.field4420);
            } else if (class341.field4413 > class341.field4414) {
                class341.field4413 = (float) ((double) class341.field4413 - (double) class341.field4413 / 30.0D);
                if (class341.field4414 > class341.field4413) {
                    class341.field4413 = class341.field4414;
                }
                class608.method3333((byte) 82);
                class341.field4420 = (int) class341.field4413 >> 1;
                class341.field4416 = class670.method3622((byte) 103, class341.field4420);
            }
            if (class90.field1143 != -1 && ~class345.field4470 != 0) {
                int var3 = -class513.field7232 + class90.field1143;
                if (var3 < 2 || ~var3 < -3) {
                    var3 /= 8;
                }
                int var4 = -class758.field10552 + class345.field4470;
                class513.field7232 += var3;
                if (var4 < 2 || ~var4 < -3) {
                    var4 /= 8;
                }
                if (~var3 == -1 && ~var4 == -1) {
                    class90.field1143 = -1;
                    class345.field4470 = -1;
                }
                class758.field10552 -= -var4;
                class608.method3333((byte) -86);
            }
            if (~class383.field5336 >= -1) {
                class718.field10122 = -1;
                class610.field8449 = -1;
            } else {
                --class488.field6949;
                if (class488.field6949 == 0) {
                    class488.field6949 = 100;
                    --class383.field5336;
                }
            }
            if (class492.field6969 && class419.field5962 != null) {
                for (class110 var5 = (class110) class419.field5962.method3111(97); var5 != null; var5 = (class110) class419.field5962.method3116(-110)) {
                    class351 var6 = class341.field4406.method2765(36, var5.field1354.field7056);
                    if (var5.method753((byte) 112, arg0, arg1)) {
                        if (var6.field4626 != null) {
                            if (var6.field4626[4] != null) {
                                class425.method2528(1004, var6.field4624, -1, true, arg2 ^ -89, (long) var5.field1354.field7056, var6.field4626[4], (long) var5.field1354.field7056, false, var6.field4608, 0, false, -1);
                            }
                            if (var6.field4626[3] != null) {
                                class425.method2528(1006, var6.field4624, -1, true, arg2 ^ -89, (long) var5.field1354.field7056, var6.field4626[3], (long) var5.field1354.field7056, false, var6.field4608, 0, false, -1);
                            }
                            if (var6.field4626[2] != null) {
                                class425.method2528(1009, var6.field4624, -1, true, -123, (long) var5.field1354.field7056, var6.field4626[2], (long) var5.field1354.field7056, false, var6.field4608, 0, false, -1);
                            }
                            if (var6.field4626[1] != null) {
                                class425.method2528(1008, var6.field4624, -1, true, -117, (long) var5.field1354.field7056, var6.field4626[1], (long) var5.field1354.field7056, false, var6.field4608, 0, false, -1);
                            }
                            if (var6.field4626[0] != null) {
                                class425.method2528(1007, var6.field4624, -1, true, 123, (long) var5.field1354.field7056, var6.field4626[0], (long) var5.field1354.field7056, false, var6.field4608, 0, false, -1);
                            }
                        }
                        if (!var5.field1354.field7052) {
                            var5.field1354.field7052 = true;
                            class445.method2621(class68.field927, var5.field1354.field7056, var6.field4608);
                        }
                        if (var5.field1354.field7052) {
                            class445.method2621(class734.field10269, var5.field1354.field7056, var6.field4608);
                        }
                    } else if (var5.field1354.field7052) {
                        var5.field1354.field7052 = false;
                        class445.method2621(class7.field76, var5.field1354.field7056, var6.field4608);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tha", name = "<init>", descriptor = "(IIIZ)V", line = 216)
    public class486(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class347.field4487, class251.field3182);
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(IILrl;IBLha;I)V", line = 222)
    public final void method2837(int arg0, int arg1, class685 arg2, int arg3, byte arg4, class454 arg5, int arg6) {
        ++field6907;
        int var8 = 52 / ((-70 - arg4) / 43);
        class559 var9 = this.method2838(arg6, arg0, arg3, -83, arg1);
        if (var9 != null) {
            class290 var10 = class358.field5112.method890(var9.method735(24123), false);
            int var11 = var9.method741(95);
            int var12 = var9.method731(80);
            if (var10.method1743(27)) {
                class331.method1945(arg1, arg6, arg3, false, var10);
            }
            if (var9.method739((byte) -88)) {
                var9.method740(arg5, (byte) 98);
            }
            if (arg0 != 0) {
                if (~arg0 == -2) {
                    class651.method3513(arg6, arg3, arg1);
                    return;
                }
                if (~arg0 == -3) {
                    class146.method915(arg6, arg3, arg1, field6921 != null ? field6921 : (field6921 = method2845("op")));
                    if (var10.field3776 != 0 && var10.field3724 + arg3 < super.field1741 && ~(var10.field3724 + arg1) > ~super.field1734 && ~super.field1741 < ~(var10.field3762 + arg3) && ~(var10.field3762 + arg1) > ~super.field1734) {
                        arg2.method3791(arg3, var10.field3724, !var10.field3723, var10.field3762, -5096, var10.field3701, var12, arg1);
                    }
                    if (~var11 == -10) {
                        if ((var12 & 1) == 0) {
                            class480.method2811(arg3, 8, (byte) -122, arg1, arg6);
                            return;
                        }
                        class480.method2811(arg3, 16, (byte) -122, arg1, arg6);
                        return;
                    }
                } else {
                    if (arg0 != 3) {
                        return;
                    }
                    class736.method4118(arg6, arg3, arg1);
                    if (var10.field3776 != 1) {
                        return;
                    }
                    arg2.method3796(arg3, arg1, -128);
                }
                return;
            }
            class539.method3068(arg6, arg3, arg1);
            if (~var10.field3776 != -1) {
                arg2.method3795(arg3, var12, var11, !var10.field3723, arg1, (byte) -128, var10.field3701);
            }
            if (var10.field3737 == 1) {
                if (var12 != 0) {
                    if (var12 != 1) {
                        if (var12 != 2) {
                            if (var12 == 3) {
                                class480.method2811(arg3, 2, (byte) -122, arg1, arg6);
                                return;
                            }
                        } else {
                            class480.method2811(arg3 + 1, 1, (byte) -122, arg1, arg6);
                        }
                        return;
                    }
                    class480.method2811(arg3, 2, (byte) -122, arg1 + 1, arg6);
                    return;
                }
                class480.method2811(arg3, 1, (byte) -122, arg1, arg6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(IIIII)Lop;", line = 318)
    private final class559 method2838(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field6909;
        class559 var6 = null;
        if (arg1 == 0) {
            var6 = (class559) class548.method3123(arg0, arg2, arg4);
        }
        if (arg3 > -12) {
            field6915 = -79;
        }
        if (~arg1 == -2) {
            var6 = (class559) class457.method2676(arg0, arg2, arg4);
        }
        if (~arg1 == -3) {
            var6 = (class559) class730.method4079(arg0, arg2, arg4, field6921 != null ? field6921 : (field6921 = method2845("op")));
        }
        if (arg1 == 3) {
            var6 = (class559) class315.method1848(arg0, arg2, arg4);
        }
        return var6;
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(ILtn;ILha;I[IIIIII)V", line = 351)
    public final void method2839(int arg0, class179 arg1, int arg2, class454 arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field6912;
        if (!super.field1740) {
            boolean var12 = false;
            class711 var13 = null;
            if (arg5 != null) {
                arg5[0] = -1;
            }
            int var14 = (7 & arg2) * 8;
            int var15 = (7 & arg4) * 8;
            while (true) {
                while (arg1.field2354 < arg1.field2325.length) {
                    int var20 = arg1.method1094(255);
                    if (var20 == 0) {
                        var13 = new class711(arg1);
                    } else if (var20 == 1) {
                        int var34 = arg1.method1094(255);
                        if (~var34 < -1) {
                            for (int var35 = 0; var35 < var34; ++var35) {
                                class615 var36 = new class615(arg3, arg1, 2);
                                if (~var36.field8620 == -32) {
                                    class530 var37 = class545.field7652.method429((byte) 97, arg1.method1107(false));
                                    var36.method3376(var37.field7474, (byte) 124, var37.field7476, var37.field7475, var37.field7478);
                                }
                                if (arg3.method115() > 0) {
                                    class621 var38 = var36.field8615;
                                    int var39 = var38.method3402(true) >> 9;
                                    int var40 = var38.method3404(-1) >> 9;
                                    if (var36.field8605 == arg7 && var14 <= var39 && ~(var14 - -8) < ~var39 && var15 <= var40 && var15 + 8 > var40) {
                                        int var41 = class419.method2491(79, arg10, var38.method3404(-1) & 4095, 4095 & var38.method3402(true)) + (arg8 << 9);
                                        int var42 = var41 >> 9;
                                        int var43 = (arg0 << 9) + class219.method1372(4095 & var38.method3404(-1), var38.method3402(true) & 4095, arg10, 1);
                                        int var44 = var43 >> 9;
                                        if (~var42 <= -1 && var44 >= 0 && super.field1741 > var42 && var44 < super.field1734) {
                                            var38.method594(var43, false, super.field1742[arg7][var42][var44] - var38.method3403((byte) 76), var41);
                                            class241.method1504(var36);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var20 == 2) {
                        if (var13 == null) {
                            var13 = new class711();
                        }
                        var13.method3924(8, arg1);
                    } else if (var20 == 128) {
                        if (arg5 != null) {
                            arg5[0] = arg1.method1107(false);
                            arg5[1] = arg1.method1137((byte) -80);
                            arg5[2] = arg1.method1137((byte) -78);
                            arg5[3] = arg1.method1137((byte) -70);
                            arg5[4] = arg1.method1107(false);
                        } else {
                            arg1.field2354 += 10;
                        }
                    } else {
                        if (var20 != 129) {
                            throw new IllegalStateException("");
                        }
                        if (super.field1747 == null) {
                            super.field1747 = new byte[4][][];
                        }
                        for (int var21 = 0; var21 < 4; ++var21) {
                            byte var22 = arg1.method1133(8);
                            if (~var22 == -1 && super.field1747[arg9] != null) {
                                if (~arg7 <= ~var21) {
                                    int var23 = arg8;
                                    int var24 = arg8 + 7;
                                    int var25 = arg0;
                                    if (arg0 < 0) {
                                        var25 = 0;
                                    } else if (arg0 >= super.field1734) {
                                        var25 = super.field1734;
                                    }
                                    if (~arg8 <= -1) {
                                        if (~super.field1741 >= ~arg8) {
                                            var23 = super.field1741;
                                        }
                                    } else {
                                        var23 = 0;
                                    }
                                    if (~var24 > -1) {
                                        var24 = 0;
                                    } else if (~var24 <= ~super.field1741) {
                                        var24 = super.field1741;
                                    }
                                    int var26 = arg0 + 7;
                                    if (~var26 <= -1) {
                                        if (~super.field1734 >= ~var26) {
                                            var26 = super.field1734;
                                        }
                                    } else {
                                        var26 = 0;
                                    }
                                    while (~var23 > ~var24) {
                                        while (var25 < var26) {
                                            super.field1747[arg9][var23][var25] = 0;
                                            ++var25;
                                        }
                                        ++var23;
                                    }
                                }
                            } else if (var22 == 1) {
                                if (super.field1747[arg9] == null) {
                                    super.field1747[arg9] = new byte[super.field1741 - -1][super.field1734 - -1];
                                }
                                for (int var27 = 0; var27 < 64; var27 += 4) {
                                    for (int var28 = 0; ~var28 > -65; var28 += 4) {
                                        byte var29 = arg1.method1133(8);
                                        if (~var21 >= ~arg7) {
                                            for (int var30 = var27; var30 < var27 + 4; ++var30) {
                                                for (int var31 = var28; var28 + 4 > var31; ++var31) {
                                                    if (var30 >= var14 && ~var30 > ~(var14 + 8) && ~var31 <= ~var15 && ~(var15 + 8) < ~var15) {
                                                        int var32 = class576.method3226(arg10, var31 & 7, var30 & 7, (byte) 35) + arg8;
                                                        int var33 = class665.method3602(7 & var30, arg10, var31 & 7, 3) + arg0;
                                                        if (~var32 <= -1 && ~var32 > ~super.field1741 && ~var33 <= -1 && var33 < super.field1734) {
                                                            super.field1747[arg9][var32][var33] = var29;
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
                    class633.method3439(arg8 >> 3, -1, arg0 >> 3, var13);
                }
                if (!var12 && super.field1747 != null && super.field1747[arg9] != null) {
                    int var16 = arg8 + 7;
                    int var17 = arg0 + 7;
                    for (int var18 = arg8; ~var18 > ~var16; ++var18) {
                        for (int var19 = arg0; ~var19 > ~var17; ++var19) {
                            super.field1747[arg9][var18][var19] = 0;
                        }
                    }
                }
                if (arg6 > -92) {
                    field6915 = -41;
                    return;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(ZLha;I)V", line = 642)
    public final void method2840(boolean arg0, class454 arg1, int arg2) {
        if (arg2 <= 32) {
            this.method2840(true, (class454) null, -114);
        }
        ++field6913;
        class239.method1494();
        if (!arg0) {
            if (~super.field1743 < -2) {
                for (int var4 = 0; super.field1741 > var4; ++var4) {
                    for (int var5 = 0; ~super.field1734 < ~var5; ++var5) {
                        if (~(2 & class215.field2728[1][var4][var5]) == -3) {
                            class107.method737(var4, var5);
                        }
                    }
                }
            }
            for (int var6 = 0; super.field1743 > var6; ++var6) {
                for (int var7 = 0; super.field1734 >= var7; ++var7) {
                    for (int var8 = 0; ~super.field1741 <= ~var8; ++var8) {
                        if ((4 & super.field1724[var6][var8][var7]) != 0) {
                            int var9 = var8;
                            int var10 = var8;
                            int var11 = var7;
                            int var12 = var7;
                            while (var11 > 0 && ~(super.field1724[var6][var8][var11 + -1] & 4) != -1 && -var11 + var12 < 10) {
                                --var11;
                            }
                            while (~var12 > ~super.field1734 && ~(super.field1724[var6][var8][var12 + 1] & 4) != -1 && ~(-var11 + var12) > -11) {
                                ++var12;
                            }
                            label117: while (var9 > 0 && ~(-var9 + var10) > -11) {
                                for (int var13 = var11; var13 <= var12; ++var13) {
                                    if (~(super.field1724[var6][var9 + -1][var13] & 4) == -1) {
                                        break label117;
                                    }
                                }
                                --var9;
                            }
                            label104: while (var10 < super.field1741 && ~(-var9 + var10) > -11) {
                                for (int var14 = var11; var12 >= var14; ++var14) {
                                    if ((super.field1724[var6][var10 + 1][var14] & 4) == 0) {
                                        break label104;
                                    }
                                }
                                ++var10;
                            }
                            if (~((var12 - (var11 + -1)) * (-var9 + 1 + var10)) <= -5) {
                                int var15 = super.field1742[var6][var9][var11];
                                class170.method1062(4, var9 << 9, (var12 << 9) + 512, true, var11 << 9, var15, var15, var6, (var10 << 9) + 512);
                                for (int var16 = var9; ~var10 <= ~var16; ++var16) {
                                    for (int var17 = var11; ~var12 <= ~var17; ++var17) {
                                        super.field1724[var6][var16][var17] = (byte) class272.method1629(super.field1724[var6][var16][var17], -5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class661.method3582(16711680);
        }
        super.field1724 = null;
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(Lha;IIIIIIIILrl;I)V", line = 784)
    public final void method2841(class454 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class685 arg9, int arg10) {
        ++field6918;
        if (~class223.field2944.field619.method444((byte) -126) != -1 || class613.method3363(-17342, arg7, class553.field7772, arg2, arg3)) {
            if (~this.field6914 < ~arg10) {
                this.field6914 = arg10;
            }
            class290 var12 = class358.field5112.method890(arg1, false);
            if (class223.field2944.field621.method2399((byte) -128) != 0 || !var12.field3748) {
                int var13;
                int var14;
                if (arg4 != 1 && ~arg4 != -4) {
                    var13 = var12.field3724;
                    var14 = var12.field3762;
                } else {
                    var14 = var12.field3724;
                    var13 = var12.field3762;
                }
                int var15;
                int var16;
                if (~super.field1741 <= ~(arg7 + var13)) {
                    var15 = arg7 - -(var13 >> 1);
                    var16 = arg7 - -(var13 + 1 >> 1);
                } else {
                    var16 = arg7 + 1;
                    var15 = arg7;
                }
                int var17;
                int var18;
                if (super.field1734 < arg3 + var14) {
                    var17 = arg3;
                    var18 = arg3 + 1;
                } else {
                    var18 = (var14 + 1 >> 1) + arg3;
                    var17 = (var14 >> 1) + arg3;
                }
                class402 var19 = class517.field7282[arg2];
                int var20 = var19.method2381(-109, var15, var17) - (-var19.method2381(-92, var16, var17) + -var19.method2381(-96, var15, var18) + -var19.method2381(-96, var16, var18)) >> 2;
                int var21 = (arg7 << 9) - -(var13 << 8);
                int var22 = (arg3 << 9) + (var14 << 8);
                boolean var23 = class153.field1863 && !super.field1740 && var12.field3735;
                if (var12.method1743(27)) {
                    class274.method1642(arg7, (class546) null, arg3, arg10, (byte) -112, var12, arg4, (class124) null);
                }
                if (arg8 >= -55) {
                    this.field6914 = -48;
                }
                boolean var24 = arg5 == -1 && var12.field3744 == -1 && var12.field3770 == null && var12.field3685 == null && !var12.field3726;
                if (!class158.field2033 || (!class264.method1592((byte) -119, arg6) || var12.field3737 == 1) && (!class437.method2581(-18, arg6) || var12.field3737 != 0)) {
                    if (~arg6 == -23) {
                        if (class223.field2944.field610.method3087((byte) -121) != 0 || ~var12.field3738 != -1 || ~var12.field3776 == -2 || var12.field3698) {
                            class337 var25;
                            if (!var24) {
                                var25 = new class223(arg0, var12, arg10, arg2, var21, var20, var22, super.field1740, arg4, arg5);
                            } else {
                                class598 var26 = new class598(arg0, var12, arg10, arg2, var21, var20, var22, super.field1740, arg4, var23);
                                if (var26.method739((byte) -55)) {
                                    var26.method732(-10891, arg0);
                                }
                                var25 = var26;
                            }
                            class58.method458(arg10, arg7, arg3, var25);
                            if (~var12.field3776 == -2 && arg9 != null) {
                                arg9.method3806(arg7, 262144, arg3);
                            }
                        }
                    } else if (arg6 != 10 && ~arg6 != -12) {
                        if ((arg6 < 12 || arg6 > 17) && (~arg6 > -19 || ~arg6 < -22)) {
                            if (~arg6 == -1) {
                                int var29 = var12.field3737;
                                if (class757.field10545 && var12.field3737 == -1) {
                                    var29 = 1;
                                }
                                class525 var30;
                                if (!var24) {
                                    var30 = new class604(arg0, var12, arg10, arg2, var21, var20, var22, super.field1740, arg6, arg4, arg5);
                                } else {
                                    class651 var31 = new class651(arg0, var12, arg10, arg2, var21, var20, var22, super.field1740, arg6, arg4, var23);
                                    var30 = var31;
                                    if (var31.method739((byte) -70)) {
                                        var31.method732(-10891, arg0);
                                    }
                                }
                                class658.method3576(arg10, arg7, arg3, var30, (class525) null);
                                if (~arg4 == -1) {
                                    if (class153.field1863 && var12.field3755) {
                                        var19.method540(arg7, arg3, 50);
                                        var19.method540(arg7, arg3 + 1, 50);
                                    }
                                    if (var29 == 1 && !super.field1740) {
                                        class331.method1948(1, arg10, arg3, var12.field3778, 1188, var12.field3757, arg7);
                                    }
                                } else if (arg4 != 1) {
                                    if (arg4 != 2) {
                                        if (arg4 == 3) {
                                            if (class153.field1863 && var12.field3755) {
                                                var19.method540(arg7, arg3, 50);
                                                var19.method540(arg7 + 1, arg3, 50);
                                            }
                                            if (~var29 == -2 && !super.field1740) {
                                                class331.method1948(2, arg10, arg3, var12.field3778, 1188, var12.field3757, arg7);
                                            }
                                        }
                                    } else {
                                        if (class153.field1863 && var12.field3755) {
                                            var19.method540(arg7 + 1, arg3, 50);
                                            var19.method540(arg7 + 1, arg3 + 1, 50);
                                        }
                                        if (~var29 == -2 && !super.field1740) {
                                            class331.method1948(1, arg10, arg3, var12.field3778, 1188, -var12.field3757, arg7 + 1);
                                        }
                                    }
                                } else {
                                    if (class153.field1863 && var12.field3755) {
                                        var19.method540(arg7, arg3 + 1, 50);
                                        var19.method540(arg7 - -1, arg3 + 1, 50);
                                    }
                                    if (~var29 == -2 && !super.field1740) {
                                        class331.method1948(2, arg10, arg3 + 1, var12.field3778, 1188, -var12.field3757, arg7);
                                    }
                                }
                                if (~var12.field3776 != -1 && arg9 != null) {
                                    arg9.method3790((byte) -77, !var12.field3723, arg6, arg3, arg7, var12.field3701, arg4);
                                }
                                if (~var12.field3733 != -65) {
                                    class722.method3994(arg10, arg7, arg3, var12.field3733);
                                }
                            } else if (~arg6 == -2) {
                                class525 var33;
                                if (var24) {
                                    class651 var32 = new class651(arg0, var12, arg10, arg2, var21, var20, var22, super.field1740, arg6, arg4, var23);
                                    if (var32.method739((byte) 94)) {
                                        var32.method732(-10891, arg0);
                                    }
                                    var33 = var32;
                                } else {
                                    var33 = new class604(arg0, var12, arg10, arg2, var21, var20, var22, super.field1740, arg6, arg4, arg5);
                                }
                                class658.method3576(arg10, arg7, arg3, var33, (class525) null);
                                if (var12.field3755 && class153.field1863) {
                                    if (~arg4 == -1) {
                                        var19.method540(arg7, arg3 + 1, 50);
                                    } else if (~arg4 == -2) {
                                        var19.method540(arg7 - -1, arg3 + 1, 50);
                                    } else if (~arg4 == -3) {
                                        var19.method540(arg7 - -1, arg3, 50);
                                    } else if (~arg4 == -4) {
                                        var19.method540(arg7, arg3, 50);
                                    }
                                }
                                if (~var12.field3776 != -1 && arg9 != null) {
                                    arg9.method3790((byte) -107, !var12.field3723, arg6, arg3, arg7, var12.field3701, arg4);
                                }
                            } else if (~arg6 == -3) {
                                int var34 = 3 & arg4 + 1;
                                class525 var37;
                                class525 var38;
                                if (var24) {
                                    class651 var35 = new class651(arg0, var12, arg10, arg2, var21, var20, var22, super.field1740, arg6, arg4 + 4, var23);
                                    class651 var36 = new class651(arg0, var12, arg10, arg2, var21, var20, var22, super.field1740, arg6, var34, var23);
                                    if (var35.method739((byte) 86)) {
                                        var35.method732(-10891, arg0);
                                    }
                                    if (var36.method739((byte) 104)) {
                                        var36.method732(-10891, arg0);
                                    }
                                    var37 = var35;
                                    var38 = var36;
                                } else {
                                    var37 = new class604(arg0, var12, arg10, arg2, var21, var20, var22, super.field1740, arg6, arg4 + 4, arg5);
                                    var38 = new class604(arg0, var12, arg10, arg2, var21, var20, var22, super.field1740, arg6, var34, arg5);
                                }
                                class658.method3576(arg10, arg7, arg3, var37, var38);
                                if ((var12.field3737 == 1 || class757.field10545 && var12.field3737 == -1) && !super.field1740) {
                                    if (arg4 != 0) {
                                        if (~arg4 != -2) {
                                            if (arg4 == 2) {
                                                class331.method1948(1, arg10, arg3, var12.field3778, 1188, var12.field3757, arg7 + 1);
                                                class331.method1948(2, arg10, arg3, var12.field3778, 1188, var12.field3757, arg7);
                                            } else if (~arg4 == -4) {
                                                class331.method1948(1, arg10, arg3, var12.field3778, 1188, var12.field3757, arg7);
                                                class331.method1948(2, arg10, arg3, var12.field3778, 1188, var12.field3757, arg7);
                                            }
                                        } else {
                                            class331.method1948(1, arg10, arg3, var12.field3778, 1188, var12.field3757, arg7 + 1);
                                            class331.method1948(2, arg10, arg3 + 1, var12.field3778, 1188, var12.field3757, arg7);
                                        }
                                    } else {
                                        class331.method1948(1, arg10, arg3, var12.field3778, 1188, var12.field3757, arg7);
                                        class331.method1948(2, arg10, arg3 - -1, var12.field3778, 1188, var12.field3757, arg7);
                                    }
                                }
                                if (var12.field3776 != 0 && arg9 != null) {
                                    arg9.method3790((byte) -100, !var12.field3723, arg6, arg3, arg7, var12.field3701, arg4);
                                }
                                if (~var12.field3733 != -65) {
                                    class722.method3994(arg10, arg7, arg3, var12.field3733);
                                }
                            } else if (~arg6 == -4) {
                                class525 var39;
                                if (!var24) {
                                    var39 = new class604(arg0, var12, arg10, arg2, var21, var20, var22, super.field1740, arg6, arg4, arg5);
                                } else {
                                    class651 var40 = new class651(arg0, var12, arg10, arg2, var21, var20, var22, super.field1740, arg6, arg4, var23);
                                    if (var40.method739((byte) 34)) {
                                        var40.method732(-10891, arg0);
                                    }
                                    var39 = var40;
                                }
                                class658.method3576(arg10, arg7, arg3, var39, (class525) null);
                                if (var12.field3755 && class153.field1863) {
                                    if (~arg4 != -1) {
                                        if (arg4 == 1) {
                                            var19.method540(arg7 + 1, arg3 - -1, 50);
                                        } else if (arg4 != 2) {
                                            if (~arg4 == -4) {
                                                var19.method540(arg7, arg3, 50);
                                            }
                                        } else {
                                            var19.method540(arg7 + 1, arg3, 50);
                                        }
                                    } else {
                                        var19.method540(arg7, arg3 - -1, 50);
                                    }
                                }
                                if (var12.field3776 != 0 && arg9 != null) {
                                    arg9.method3790((byte) -70, !var12.field3723, arg6, arg3, arg7, var12.field3701, arg4);
                                }
                            } else if (~arg6 == -10) {
                                class451 var42;
                                if (var24) {
                                    class293 var41 = new class293(arg0, var12, arg10, arg2, var21, var20, var22, super.field1740, arg7, arg7, arg3, arg3, arg6, arg4, var23);
                                    var42 = var41;
                                    if (var41.method739((byte) -117)) {
                                        var41.method732(-10891, arg0);
                                    }
                                } else {
                                    var42 = new class107(arg0, var12, arg10, arg2, var21, var20, var22, super.field1740, arg7, arg7 - (-var13 + 1), arg3, arg3 + -1 + var14, arg6, arg4, arg5);
                                }
                                class264.method1594(var42, false);
                                if (var12.field3737 == 1 && !super.field1740) {
                                    byte var43;
                                    if (~(arg4 & 1) == -1) {
                                        var43 = 8;
                                    } else {
                                        var43 = 16;
                                    }
                                    class331.method1948(var43, arg10, arg3, var12.field3778, 1188, 0, arg7);
                                }
                                if (~var12.field3776 != -1 && arg9 != null) {
                                    arg9.method3793((byte) -36, var14, var12.field3701, arg7, arg3, var13, !var12.field3723);
                                }
                                if (var12.field3733 != 64) {
                                    class722.method3994(arg10, arg7, arg3, var12.field3733);
                                }
                            } else if (~arg6 == -5) {
                                class149 var44;
                                if (!var24) {
                                    var44 = new class135(arg0, var12, arg10, arg2, var21, var20, var22, super.field1740, 0, 0, arg6, arg4, arg5);
                                } else {
                                    class385 var45 = new class385(arg0, var12, arg10, arg2, var21, var20, var22, super.field1740, 0, 0, arg6, arg4);
                                    if (var45.method739((byte) -43)) {
                                        var45.method732(-10891, arg0);
                                    }
                                    var44 = var45;
                                }
                                class52.method428(arg10, arg7, arg3, var44, (class149) null);
                            } else if (~arg6 == -6) {
                                int var46 = 65;
                                class559 var47 = (class559) class548.method3123(arg10, arg7, arg3);
                                if (var47 != null) {
                                    var46 = 1 + class358.field5112.method890(var47.method735(24123), false).field3733;
                                }
                                class149 var49;
                                if (var24) {
                                    class385 var48 = new class385(arg0, var12, arg10, arg2, var21, var20, var22, super.field1740, class168.field2218[arg4] * var46, class662.field9076[arg4] * var46, arg6, arg4);
                                    var49 = var48;
                                    if (var48.method739((byte) 90)) {
                                        var48.method732(-10891, arg0);
                                    }
                                } else {
                                    var49 = new class135(arg0, var12, arg10, arg2, var21, var20, var22, super.field1740, class168.field2218[arg4] * var46, class662.field9076[arg4] * var46, arg6, arg4, arg5);
                                }
                                class52.method428(arg10, arg7, arg3, var49, (class149) null);
                            } else if (~arg6 == -7) {
                                int var50 = 33;
                                class559 var51 = (class559) class548.method3123(arg10, arg7, arg3);
                                if (var51 != null) {
                                    var50 = 1 + class358.field5112.method890(var51.method735(24123), false).field3733 / 2;
                                }
                                class149 var53;
                                if (var24) {
                                    class385 var52 = new class385(arg0, var12, arg10, arg2, var21, var20, var22, super.field1740, class168.field2218[arg4] * var50, class662.field9076[arg4] * var50, arg6, arg4 + 4);
                                    var53 = var52;
                                    if (var52.method739((byte) -61)) {
                                        var52.method732(-10891, arg0);
                                    }
                                } else {
                                    var53 = new class135(arg0, var12, arg10, arg2, var21, var20, var22, super.field1740, class363.field5160[arg4] * var50, class739.field10343[arg4] * var50, arg6, arg4 + 4, arg5);
                                }
                                class52.method428(arg10, arg7, arg3, var53, (class149) null);
                            } else if (~arg6 == -8) {
                                int var54 = arg4 - -2 & 3;
                                class149 var56;
                                if (var24) {
                                    class385 var55 = new class385(arg0, var12, arg10, arg2, var21, var20, var22, super.field1740, 0, 0, arg6, var54 + 4);
                                    if (var55.method739((byte) 124)) {
                                        var55.method732(-10891, arg0);
                                    }
                                    var56 = var55;
                                } else {
                                    var56 = new class135(arg0, var12, arg10, arg2, var21, var20, var22, super.field1740, 0, 0, arg6, var54 + 4, arg5);
                                }
                                class52.method428(arg10, arg7, arg3, var56, (class149) null);
                            } else if (~arg6 == -9) {
                                int var57 = arg4 + 2 & 3;
                                int var58 = 33;
                                class559 var59 = (class559) class548.method3123(arg10, arg7, arg3);
                                if (var59 != null) {
                                    var58 = 1 + class358.field5112.method890(var59.method735(24123), false).field3733 / 2;
                                }
                                class149 var62;
                                class149 var63;
                                if (var24) {
                                    class385 var60 = new class385(arg0, var12, arg10, arg2, var21, var20, var22, super.field1740, class363.field5160[arg4] * var58, class739.field10343[arg4] * var58, arg6, arg4 + 4);
                                    class385 var61 = new class385(arg0, var12, arg10, arg2, var21, var20, var22, super.field1740, 0, 0, arg6, var57 + 4);
                                    if (var60.method739((byte) -73)) {
                                        var60.method732(-10891, arg0);
                                    }
                                    var62 = var60;
                                    var63 = var61;
                                    if (var61.method739((byte) 60)) {
                                        var61.method732(-10891, arg0);
                                    }
                                } else {
                                    class135 var64 = new class135(arg0, var12, arg10, arg2, var21, var20, var22, super.field1740, class363.field5160[arg4] * var58, class739.field10343[arg4] * var58, arg6, arg4 + 4, arg5);
                                    var62 = var64;
                                    class135 var65 = new class135(arg0, var12, arg10, arg2, var21, var20, var22, super.field1740, 0, 0, arg6, var57 + 4, arg5);
                                    var63 = var65;
                                }
                                class52.method428(arg10, arg7, arg3, var62, var63);
                            }
                        } else {
                            class451 var28;
                            if (var24) {
                                class293 var27 = new class293(arg0, var12, arg10, arg2, var21, var20, var22, super.field1740, arg7, arg7 + var13 + -1, arg3, var14 + -1 + arg3, arg6, arg4, var23);
                                var28 = var27;
                                if (var27.method739((byte) 59)) {
                                    var27.method732(-10891, arg0);
                                }
                            } else {
                                var28 = new class107(arg0, var12, arg10, arg2, var21, var20, var22, super.field1740, arg7, arg7 + -1 + var13, arg3, arg3 + var14 + -1, arg6, arg4, arg5);
                            }
                            class264.method1594(var28, false);
                            if (class153.field1863 && !super.field1740 && arg6 >= 12 && ~arg6 >= -18 && ~arg6 != -14 && arg10 > 0 && ~var12.field3737 != -1) {
                                super.field1724[arg10][arg7][arg3] = (byte) class216.method1308(super.field1724[arg10][arg7][arg3], 4);
                            }
                            if (var12.field3776 != 0 && arg9 != null) {
                                arg9.method3793((byte) -36, var14, var12.field3701, arg7, arg3, var13, !var12.field3723);
                            }
                        }
                    } else {
                        class293 var66 = null;
                        int var68;
                        class451 var69;
                        if (var24) {
                            class293 var67 = new class293(arg0, var12, arg10, arg2, var21, var20, var22, super.field1740, arg7, arg7 + var13 + -1, arg3, var14 + -1 + arg3, arg6, arg4, var23);
                            var68 = var67.method1758(95);
                            var66 = var67;
                            var69 = var67;
                        } else {
                            var68 = 15;
                            var69 = new class107(arg0, var12, arg10, arg2, var21, var20, var22, super.field1740, arg7, arg7 + var13 - 1, arg3, arg3 + var14 - 1, arg6, arg4, arg5);
                        }
                        if (class264.method1594(var69, false)) {
                            if (var66 != null && var66.method739((byte) -34)) {
                                var66.method732(-10891, arg0);
                            }
                            if (var12.field3755 && class153.field1863) {
                                if (~var68 < -31) {
                                    var68 = 30;
                                }
                                for (int var70 = 0; var13 >= var70; ++var70) {
                                    for (int var71 = 0; ~var14 <= ~var71; ++var71) {
                                        var19.method540(arg7 + var70, arg3 - -var71, var68);
                                    }
                                }
                            }
                        }
                        if (~var12.field3776 != -1 && arg9 != null) {
                            arg9.method3793((byte) -36, var14, var12.field3701, arg7, arg3, var13, !var12.field3723);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(ILha;I[BIII[Lrl;III)V", line = 1410)
    public final void method2842(int arg0, class454 arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, class685[] arg7, int arg8, int arg9, int arg10) {
        ++field6906;
        class179 var12 = new class179(arg3);
        int var13 = arg2;
        while (true) {
            int var14 = var12.method1151(-109);
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method1158(arg2 ^ 32767);
                if (~var16 == -1) {
                    break;
                }
                var15 += var16 + -1;
                int var17 = 63 & var15;
                int var18 = var15 >> 6 & 63;
                int var19 = var15 >> 12;
                int var20 = var12.method1094(arg2 ^ -256);
                int var21 = var20 >> 2;
                int var22 = 3 & var20;
                if (arg6 == var19 && ~arg9 >= ~var18 && arg9 + 8 > var18 && arg0 <= var17 && ~(arg0 + 8) < ~var17) {
                    class290 var23 = class358.field5112.method890(var13, false);
                    int var24 = class87.method608(arg4, 7 & var17, -1, var23.field3762, var23.field3724, var22, var18 & 7) + arg5;
                    int var25 = class373.method2272(var22, var18 & 7, var23.field3724, arg4, 21, var23.field3762, var17 & 7) + arg10;
                    if (~var24 < -1 && ~var25 < -1 && ~var24 > ~(super.field1741 + -1) && ~var25 > ~(super.field1734 + -1)) {
                        class685 var26 = null;
                        if (!super.field1740) {
                            int var27 = arg8;
                            if ((2 & class215.field2728[1][var24][var25]) == 2) {
                                var27 = arg8 - 1;
                            }
                            if (var27 >= 0) {
                                var26 = arg7[var27];
                            }
                        }
                        this.method2841(arg1, var13, arg8, var25, var22 - -arg4 & 3, -1, var21, var24, arg2 + -102, var26, arg8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(Ltn;II[ILha;I)V", line = 1491)
    public final void method2843(class179 arg0, int arg1, int arg2, int[] arg3, class454 arg4, int arg5) {
        ++field6920;
        if (arg1 != 0) {
            method2836(-11, -55, 91);
        }
        if (!super.field1740) {
            boolean var7 = false;
            if (arg3 != null) {
                arg3[0] = -1;
            }
            class711 var8 = null;
            while (true) {
                while (arg0.field2354 < arg0.field2325.length) {
                    int var18 = arg0.method1094(arg1 + 255);
                    if (~var18 == -1) {
                        var8 = new class711(arg0);
                    } else if (var18 == 1) {
                        int var19 = arg0.method1094(255);
                        if (var19 > 0) {
                            for (int var20 = 0; ~var20 > ~var19; ++var20) {
                                class615 var21 = new class615(arg4, arg0, 2);
                                if (var21.field8620 == 31) {
                                    class530 var22 = class545.field7652.method429((byte) 97, arg0.method1107(false));
                                    var21.method3376(var22.field7474, (byte) 124, var22.field7476, var22.field7475, var22.field7478);
                                }
                                if (arg4.method115() > 0) {
                                    class621 var23 = var21.field8615;
                                    int var24 = (arg5 << 9) + var23.method3402(true);
                                    int var25 = var23.method3404(-1) + (arg2 << 9);
                                    int var26 = var24 >> 9;
                                    int var27 = var25 >> 9;
                                    if (var26 >= 0 && var27 >= 0 && super.field1741 > var26 && super.field1734 > var27) {
                                        var23.method594(var25, false, super.field1742[var21.field8605][var26][var27] - var23.method3403((byte) 13), var24);
                                        class241.method1504(var21);
                                    }
                                }
                            }
                        }
                    } else if (var18 == 2) {
                        if (var8 == null) {
                            var8 = new class711();
                        }
                        var8.method3924(8, arg0);
                    } else if (~var18 == -129) {
                        if (arg3 == null) {
                            arg0.field2354 += 10;
                        } else {
                            arg3[0] = arg0.method1107(false);
                            arg3[1] = arg0.method1137((byte) -101);
                            arg3[2] = arg0.method1137((byte) -93);
                            arg3[3] = arg0.method1137((byte) -115);
                            arg3[4] = arg0.method1107(false);
                        }
                    } else {
                        if (var18 != 129) {
                            throw new IllegalStateException("");
                        }
                        if (super.field1747 == null) {
                            super.field1747 = new byte[4][][];
                        }
                        var7 = true;
                        for (int var28 = 0; var28 < 4; ++var28) {
                            byte var29 = arg0.method1133(8);
                            if (var29 == 0 && super.field1747[var28] != null) {
                                int var30 = arg5;
                                int var31 = arg5 + 64;
                                int var32 = arg2;
                                if (~arg5 <= -1) {
                                    if (~arg5 <= ~super.field1741) {
                                        var30 = super.field1741;
                                    }
                                } else {
                                    var30 = 0;
                                }
                                if (~var31 <= -1) {
                                    if (var31 >= super.field1741) {
                                        var31 = super.field1741;
                                    }
                                } else {
                                    var31 = 0;
                                }
                                int var33 = arg2 - -64;
                                if (~arg2 > -1) {
                                    var32 = 0;
                                } else if (~arg2 <= ~super.field1734) {
                                    var32 = super.field1734;
                                }
                                if (var33 < 0) {
                                    var33 = 0;
                                } else if (~super.field1734 >= ~var33) {
                                    var33 = super.field1734;
                                }
                                while (var31 > var30) {
                                    while (~var33 < ~var32) {
                                        super.field1747[var28][var30][var32] = 0;
                                        ++var32;
                                    }
                                    ++var30;
                                }
                            } else if (var29 == 1) {
                                if (super.field1747[var28] == null) {
                                    super.field1747[var28] = new byte[super.field1741 + 1][super.field1734 + 1];
                                }
                                for (int var34 = 0; var34 < 64; var34 += 4) {
                                    for (int var35 = 0; ~var35 > -65; var35 += 4) {
                                        byte var36 = arg0.method1133(arg1 ^ 8);
                                        for (int var37 = var34 - -arg5; arg5 + var34 + 4 > var37; ++var37) {
                                            for (int var38 = arg2 + var35; var38 < var35 + 4 + arg2; ++var38) {
                                                if (var37 >= 0 && ~var37 > ~super.field1741 && ~var38 <= -1 && var38 < super.field1734) {
                                                    super.field1747[var28][var37][var38] = var36;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (~var29 == -3) {
                                if (super.field1747[var28] == null) {
                                    super.field1747[var28] = new byte[super.field1741 + 1][super.field1734 - -1];
                                }
                                if (var28 > 0) {
                                    int var39 = arg5;
                                    int var40 = arg5 + 64;
                                    int var41 = arg2;
                                    if (var40 >= 0) {
                                        if (~super.field1741 >= ~var40) {
                                            var40 = super.field1741;
                                        }
                                    } else {
                                        var40 = 0;
                                    }
                                    if (~arg5 > -1) {
                                        var39 = 0;
                                    } else if (super.field1741 <= arg5) {
                                        var39 = super.field1741;
                                    }
                                    int var42 = arg2 + 64;
                                    if (~arg2 <= -1) {
                                        if (~super.field1734 >= ~arg2) {
                                            var41 = super.field1734;
                                        }
                                    } else {
                                        var41 = 0;
                                    }
                                    if (~var42 > -1) {
                                        var42 = 0;
                                    } else if (~var42 <= ~super.field1734) {
                                        var42 = super.field1734;
                                    }
                                    while (~var40 < ~var39) {
                                        while (~var42 < ~var41) {
                                            super.field1747[var28][var39][var41] = super.field1747[var28 + -1][var39][var41];
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
                    for (int var9 = 0; var9 < 8; ++var9) {
                        for (int var10 = 0; ~var10 > -9; ++var10) {
                            int var11 = (arg5 >> 3) + var9;
                            int var12 = (arg2 >> 3) + var10;
                            if (~var11 <= -1 && ~(super.field1741 >> 3) < ~var11 && var12 >= 0 && ~(super.field1734 >> 3) < ~var12) {
                                class633.method3439(var11, arg1 + -1, var12, var8);
                            }
                        }
                    }
                }
                if (!var7 && super.field1747 != null) {
                    for (int var13 = 0; ~var13 > -5; ++var13) {
                        if (super.field1747[var13] != null) {
                            for (int var14 = 0; var14 < 16; ++var14) {
                                for (int var15 = 0; var15 < 16; ++var15) {
                                    int var16 = (arg5 >> 2) - -var14;
                                    int var17 = (arg2 >> 2) + var15;
                                    if (~var16 <= -1 && ~var16 > -27 && ~var17 <= -1 && var17 < 26) {
                                        super.field1747[var13][var16][var17] = 0;
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

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Throwable;)V", line = 1856)
    public static final void method2844(byte arg0, String arg1, Throwable arg2) {
        ++field6916;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class489.method2857(arg2, (byte) -96);
            }
            if (arg1 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            class113.method763(var3, (byte) 102);
            String var4 = class27.method274((byte) -128, ":", "%3a", var3);
            if (arg0 != -1) {
                field6908 = 38;
            }
            String var5 = class27.method274((byte) -128, "@", "%40", var4);
            String var6 = class27.method274((byte) -128, "&", "%26", var5);
            String var7 = class27.method274((byte) -127, "#", "%23", var6);
            if (class415.field5911 != null) {
                class435 var8 = class160.field2049.method1562(new URL(class415.field5911.getCodeBase(), "clienterror.ws?c=" + class5.field61 + "&u=" + (class33.field515 != null ? class33.field515 : String.valueOf(class607.field8426)) + "&v1=" + class256.field3243 + "&v2=" + class256.field3267 + "&e=" + var7), true);
                while (~var8.field6124 == -1) {
                    class517.method2965(1L, -123);
                }
                if (var8.field6124 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field6123;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }
}
