import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class157 extends class523 {

    @OriginalMember(owner = "client!ct", name = "R", descriptor = "I")
    public int field2555 = 99;

    @OriginalMember(owner = "client!ct", name = "L", descriptor = "J")
    public static volatile long field2549 = 0L;

    @OriginalMember(owner = "client!ct", name = "J", descriptor = "Lfja;")
    public static class783 field2547 = new class783(67, 28);

    @OriginalMember(owner = "client!ct", name = "I", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!ct", name = "M", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!ct", name = "N", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!ct", name = "O", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!ct", name = "P", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!ct", name = "Q", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!ct", name = "S", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!ct", name = "T", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!ct", name = "U", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!ct", name = "V", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!ct", name = "W", descriptor = "I")
    public static int field2560;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ct", name = "X", descriptor = "Ljava/lang/Class;")
    public static Class field2561;

    @OriginalMember(owner = "client!ct", name = "K", descriptor = "[Z")
    public static boolean[] field2548;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1224(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(BLgj;)V", line = 3)
    public static final void method1213(byte arg0, class662 arg1) {
        class700.field9652 = 0;
        class315.field4313 = 0;
        if (arg0 == -78) {
            ++field2560;
            class450.field6170 = new class239();
            class425.field5810 = new class176[1024];
            class653.field9050 = new class788[class522.field7072[class393.field5437] - -1];
            class6.field116 = 0;
            class193.field2951 = 0;
            class445.method2581(arg1, 71);
            class664.method3756(arg1, false);
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIIILjo;ILha;)V", line = 22)
    public final void method1214(int arg0, int arg1, int arg2, int arg3, class355 arg4, int arg5, class66 arg6) {
        ++field2546;
        int var8 = -116 / ((23 - arg3) / 52);
        class237 var9 = this.method1219(arg5, arg2, arg1, arg0, 45);
        if (var9 != null) {
            class445 var10 = class414.field5670.method2319(var9.method1032(false), false);
            int var11 = var9.method1034(-127);
            int var12 = var9.method1033(-23);
            if (var10.method2591(0)) {
                class453.method2618(arg1, arg5, var10, false, arg2);
            }
            if (var9.method1036((byte) -46)) {
                var9.method1039(arg6, 115);
            }
            if (~arg0 != -1) {
                if (arg0 != 1) {
                    if (arg0 != 2) {
                        if (arg0 == 3) {
                            class537.method3040(arg5, arg1, arg2);
                            if (var10.field6041 == 1) {
                                arg4.method2185(arg2, -262145, arg1);
                                return;
                            }
                        }
                        return;
                    }
                    class45.method331(arg5, arg1, arg2, field2561 != null ? field2561 : (field2561 = method1224("bea")));
                    if (var10.field6041 != 0 && ~super.field7101 < ~(var10.field6100 + arg1) && ~super.field7105 < ~(var10.field6100 + arg2) && ~super.field7101 < ~(arg1 - -var10.field6053) && super.field7105 > var10.field6053 + arg2) {
                        arg4.method2182(var10.field6068, arg1, !var10.field6124, arg2, var12, 126, var10.field6053, var10.field6100);
                    }
                    if (~var11 == -10) {
                        if ((var12 & 1) != 0) {
                            class672.method3794(16, 31907, arg2, arg1, arg5);
                            return;
                        }
                        class672.method3794(8, 31907, arg2, arg1, arg5);
                        return;
                    }
                } else {
                    class33.method197(arg5, arg1, arg2);
                }
                return;
            }
            class245.method1634(arg5, arg1, arg2);
            if (~var10.field6041 != -1) {
                arg4.method2187(var12, var11, arg1, arg2, !var10.field6124, var10.field6068, -55);
            }
            if (~var10.field6059 == -2) {
                if (~var12 == -1) {
                    class672.method3794(1, 31907, arg2, arg1, arg5);
                    return;
                }
                if (~var12 != -2) {
                    if (~var12 == -3) {
                        class672.method3794(1, 31907, arg2, arg1 + 1, arg5);
                        return;
                    }
                    if (~var12 == -4) {
                        class672.method3794(2, 31907, arg2, arg1, arg5);
                        return;
                    }
                } else {
                    class672.method3794(2, 31907, arg2 + 1, arg1, arg5);
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(II[B[Ljo;IIIIIILha;)V", line = 119)
    public final void method1215(int arg0, int arg1, byte[] arg2, class355[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class66 arg10) {
        ++field2553;
        if (arg6 != -19629) {
            this.method1215(-64, 15, (byte[]) null, (class355[]) null, -127, -100, 115, 60, -86, 114, (class66) null);
        }
        class93 var12 = new class93(arg2);
        int var13 = -1;
        while (true) {
            int var14 = var12.method761((byte) 71);
            if (~var14 == -1) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method746(false);
                if (var16 == 0) {
                    break;
                }
                var15 += var16 + -1;
                int var17 = 63 & var15;
                int var18 = (4095 & var15) >> 6;
                int var19 = var15 >> 12;
                int var20 = var12.method793((byte) 27);
                int var21 = var20 >> 2;
                int var22 = 3 & var20;
                if (~arg7 == ~var19 && var18 >= arg5 && arg5 - -8 > var18 && ~var17 <= ~arg0 && arg0 - -8 > var17) {
                    class445 var23 = class414.field5670.method2319(var13, false);
                    int var24 = class759.method4199(var22, var17 & 7, 7 & var18, arg8, var23.field6100, var23.field6053, -8987) + arg9;
                    int var25 = class20.method137(7 & var17, arg8, var22, var23.field6100, var23.field6053, var18 & 7, (byte) 63) + arg1;
                    if (var24 > 0 && ~var25 < -1 && super.field7101 - 1 > var24 && var25 < super.field7105 - 1) {
                        class355 var26 = null;
                        if (!super.field7093) {
                            int var27 = arg4;
                            if ((class554.field7832[1][var24][var25] & 2) == 2) {
                                var27 = arg4 - 1;
                            }
                            if (var27 >= 0) {
                                var26 = arg3[var27];
                            }
                        }
                        this.method1220(3 & arg8 + var22, -1, arg4, var25, arg10, var13, var26, var21, var24, arg4, false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IZ)I", line = 199)
    public static final int method1216(int arg0, boolean arg1) {
        if (!arg1) {
            field2547 = null;
        }
        ++field2554;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var3 = arg0 * 6 + -61440;
        int var4 = (arg0 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lfca;II[ILha;I)V", line = 222)
    public final void method1217(class93 arg0, int arg1, int arg2, int[] arg3, class66 arg4, int arg5) {
        ++field2551;
        if (!super.field7093) {
            if (arg1 != 0) {
                this.method1214(31, -3, 90, -118, (class355) null, -90, (class66) null);
            }
            boolean var7 = false;
            if (arg3 != null) {
                arg3[0] = -1;
            }
            class28 var8 = null;
            while (true) {
                while (arg0.field1442 < arg0.field1413.length) {
                    int var18 = arg0.method793((byte) 16);
                    if (var18 == 0) {
                        var8 = new class28(arg0);
                    } else if (~var18 == -2) {
                        int var19 = arg0.method793((byte) 119);
                        if (~var19 < -1) {
                            for (int var20 = 0; var20 < var19; ++var20) {
                                class199 var21 = new class199(arg4, arg0, 2);
                                if (~var21.field3006 == -32) {
                                    class223 var22 = class526.field7142.method1724((byte) -80, arg0.method763(120));
                                    var21.method1430(var22.field3255, false, var22.field3261, var22.field3257, var22.field3249);
                                }
                                if (~arg4.method493() < -1) {
                                    class307 var23 = var21.field3001;
                                    int var24 = var23.method1962(0) + (arg2 << 9);
                                    int var25 = (arg5 << 9) + var23.method1958(true);
                                    int var26 = var24 >> 9;
                                    int var27 = var25 >> 9;
                                    if (~var26 <= -1 && ~var27 <= -1 && ~var26 > ~super.field7101 && super.field7105 > var27) {
                                        var23.method1399(super.field7103[var21.field3015][var26][var27] + -var23.method1961(-128), var24, -27297, var25);
                                        class312.method1982(var21);
                                    }
                                }
                            }
                        }
                    } else if (var18 == 2) {
                        if (var8 == null) {
                            var8 = new class28();
                        }
                        var8.method182(arg0, (byte) 114);
                    } else if (~var18 == -129) {
                        if (arg3 != null) {
                            arg3[0] = arg0.method763(10);
                            arg3[1] = arg0.method774(-4);
                            arg3[2] = arg0.method774(-4);
                            arg3[3] = arg0.method774(-4);
                            arg3[4] = arg0.method763(124);
                        } else {
                            arg0.field1442 += 10;
                        }
                    } else {
                        if (var18 != 129) {
                            throw new IllegalStateException("");
                        }
                        if (super.field7088 == null) {
                            super.field7088 = new byte[4][][];
                        }
                        var7 = true;
                        for (int var28 = 0; ~var28 > -5; ++var28) {
                            byte var29 = arg0.method766((byte) 122);
                            if (~var29 == -1 && super.field7088[var28] != null) {
                                int var30 = arg2;
                                int var31 = arg2 + 64;
                                int var32 = arg5;
                                if (arg5 < 0) {
                                    var32 = 0;
                                } else if (~super.field7105 >= ~arg5) {
                                    var32 = super.field7105;
                                }
                                if (var31 >= 0) {
                                    if (~var31 <= ~super.field7101) {
                                        var31 = super.field7101;
                                    }
                                } else {
                                    var31 = 0;
                                }
                                if (~arg2 <= -1) {
                                    if (super.field7101 <= arg2) {
                                        var30 = super.field7101;
                                    }
                                } else {
                                    var30 = 0;
                                }
                                int var33 = arg5 + 64;
                                if (~var33 > -1) {
                                    var33 = 0;
                                } else if (super.field7105 <= var33) {
                                    var33 = super.field7105;
                                }
                                while (var31 > var30) {
                                    while (~var33 < ~var32) {
                                        super.field7088[var28][var30][var32] = 0;
                                        ++var32;
                                    }
                                    ++var30;
                                }
                            } else if (~var29 == -2) {
                                if (super.field7088[var28] == null) {
                                    super.field7088[var28] = new byte[super.field7101 + 1][super.field7105 - -1];
                                }
                                for (int var34 = 0; var34 < 64; var34 += 4) {
                                    for (int var35 = 0; ~var35 > -65; var35 += 4) {
                                        byte var36 = arg0.method766((byte) 122);
                                        for (int var37 = arg2 + var34; var37 < arg2 + 4 + var34; ++var37) {
                                            for (int var38 = arg5 + var35; ~(var35 - -4 + arg5) < ~var38; ++var38) {
                                                if (var37 >= 0 && ~var37 > ~super.field7101 && var38 >= 0 && var38 < super.field7105) {
                                                    super.field7088[var28][var37][var38] = var36;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (~var29 == -3) {
                                if (super.field7088[var28] == null) {
                                    super.field7088[var28] = new byte[super.field7101 + 1][super.field7105 + 1];
                                }
                                if (~var28 < -1) {
                                    int var39 = arg2;
                                    int var40 = arg2 + 64;
                                    int var41 = arg5;
                                    if (var40 >= 0) {
                                        if (~super.field7101 >= ~var40) {
                                            var40 = super.field7101;
                                        }
                                    } else {
                                        var40 = 0;
                                    }
                                    int var42 = arg5 + 64;
                                    if (arg2 >= 0) {
                                        if (~super.field7101 >= ~arg2) {
                                            var39 = super.field7101;
                                        }
                                    } else {
                                        var39 = 0;
                                    }
                                    if (arg5 >= 0) {
                                        if (~arg5 <= ~super.field7105) {
                                            var41 = super.field7105;
                                        }
                                    } else {
                                        var41 = 0;
                                    }
                                    if (~var42 > -1) {
                                        var42 = 0;
                                    } else if (var42 >= super.field7105) {
                                        var42 = super.field7105;
                                    }
                                    while (var40 > var39) {
                                        while (var42 > var41) {
                                            super.field7088[var28][var39][var41] = super.field7088[var28 + -1][var39][var41];
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
                            int var11 = (arg2 >> 3) + var9;
                            int var12 = (arg5 >> 3) + var10;
                            if (var11 >= 0 && ~var11 > ~(super.field7101 >> 3) && var12 >= 0 && super.field7105 >> 3 > var12) {
                                class57.method405(var8, 25485, var11, var12);
                            }
                        }
                    }
                }
                if (!var7 && super.field7088 != null) {
                    for (int var13 = 0; var13 < 4; ++var13) {
                        if (super.field7088[var13] != null) {
                            for (int var14 = 0; var14 < 16; ++var14) {
                                for (int var15 = 0; ~var15 > -17; ++var15) {
                                    int var16 = (arg2 >> 2) + var14;
                                    int var17 = (arg5 >> 2) + var15;
                                    if (var16 >= 0 && ~var16 > -27 && ~var17 <= -1 && ~var17 > -27) {
                                        super.field7088[var13][var16][var17] = 0;
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

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lha;[BIII[Ljo;)V", line = 594)
    public final void method1218(class66 arg0, byte[] arg1, int arg2, int arg3, int arg4, class355[] arg5) {
        if (arg4 > -5) {
            field2547 = null;
        }
        ++field2559;
        class93 var7 = new class93(arg1);
        int var8 = -1;
        while (true) {
            int var9 = var7.method761((byte) 112);
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method746(false);
                if (~var11 == -1) {
                    break;
                }
                var10 += var11 + -1;
                int var12 = 63 & var10;
                int var13 = var10 >> 6 & 63;
                int var14 = var10 >> 12;
                int var15 = var7.method793((byte) 108);
                int var16 = var15 >> 2;
                int var17 = var15 & 3;
                int var18 = var13 - -arg2;
                int var19 = var12 - -arg3;
                if (~var18 < -1 && ~var19 < -1 && ~(super.field7101 + -1) < ~var18 && super.field7105 + -1 > var19) {
                    class355 var20 = null;
                    if (!super.field7093) {
                        int var21 = var14;
                        if (~(class554.field7832[1][var18][var19] & 2) == -3) {
                            var21 = var14 - 1;
                        }
                        if (~var21 <= -1) {
                            var20 = arg5[var21];
                        }
                    }
                    this.method1220(var17, -1, var14, var19, arg0, var8, var20, var16, var18, var14, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(IIIZ)V", line = 1331)
    public class157(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class523.field7116, class713.field9818);
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIIII)Lbea;", line = 674)
    public final class237 method1219(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 <= 24) {
            return null;
        } else {
            ++field2552;
            class237 var6 = null;
            if (~arg3 == -1) {
                var6 = (class237) class454.method2624(arg0, arg2, arg1);
            }
            if (~arg3 == -2) {
                var6 = (class237) class728.method4037(arg0, arg2, arg1);
            }
            if (~arg3 == -3) {
                var6 = (class237) class614.method3480(arg0, arg2, arg1, field2561 != null ? field2561 : (field2561 = method1224("bea")));
            }
            if (~arg3 == -4) {
                var6 = (class237) class572.method3313(arg0, arg2, arg1);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIIILha;ILjo;IIIZ)V", line = 701)
    public final void method1220(int arg0, int arg1, int arg2, int arg3, class66 arg4, int arg5, class355 arg6, int arg7, int arg8, int arg9, boolean arg10) {
        ++field2556;
        if (class111.field1911.field6734.method3639((byte) 78) != 0 || class652.method3654(18334, arg8, arg3, arg2, class426.field5820)) {
            if (~arg9 > ~this.field2555) {
                this.field2555 = arg9;
            }
            class445 var12 = class414.field5670.method2319(arg5, arg10);
            if (class111.field1911.field6743.method3385((byte) 121) != 0 || !var12.field6077) {
                if (arg10) {
                    this.method1220(-102, -19, 28, 6, (class66) null, -32, (class355) null, 67, -73, -128, true);
                }
                int var13;
                int var14;
                if (~arg0 != -2 && arg0 != 3) {
                    var13 = var12.field6053;
                    var14 = var12.field6100;
                } else {
                    var13 = var12.field6100;
                    var14 = var12.field6053;
                }
                int var15;
                int var16;
                if (~(arg8 + var14) >= ~super.field7101) {
                    var15 = (var14 + 1 >> 1) + arg8;
                    var16 = (var14 >> 1) + arg8;
                } else {
                    var16 = arg8;
                    var15 = arg8 - -1;
                }
                int var17;
                int var18;
                if (~(arg3 - -var13) < ~super.field7105) {
                    var17 = arg3;
                    var18 = arg3 + 1;
                } else {
                    var17 = (var13 >> 1) + arg3;
                    var18 = arg3 - -(var13 + 1 >> 1);
                }
                class296 var19 = class745.field10286[arg2];
                int var20 = var19.method1897((byte) -34, var17, var16) + var19.method1897((byte) -34, var17, var15) + (var19.method1897((byte) -34, var18, var16) - -var19.method1897((byte) -34, var18, var15)) >> 2;
                int var21 = (arg8 << 9) + (var14 << 8);
                int var22 = (arg3 << 9) + (var13 << 8);
                boolean var23 = class777.field10728 && !super.field7093 && var12.field6096;
                if (var12.method2591(0)) {
                    class129.method1095(arg3, arg9, var12, arg0, arg8, (class771) null, (class666) null, (byte) 105);
                }
                boolean var24 = arg1 == -1 && ~var12.field6089 == 0 && var12.field6054 == null && var12.field6028 == null && !var12.field6049 && !var12.field6111;
                if (!class535.field7251 || (!class651.method3646(arg7, -87) || var12.field6059 == 1) && (!class429.method2523(4095, arg7) || var12.field6059 != 0)) {
                    if (arg7 == 22) {
                        if (class111.field1911.field6716.method3547((byte) 81) != 0 || var12.field6050 != 0 || ~var12.field6041 == -2 || var12.field6064) {
                            class436 var26;
                            if (var24) {
                                class117 var25 = new class117(arg4, var12, arg9, arg2, var21, var20, var22, super.field7093, arg0, var23);
                                var26 = var25;
                                if (var25.method1036((byte) -63)) {
                                    var25.method1040(arg4, (byte) 55);
                                }
                            } else {
                                var26 = new class412(arg4, var12, arg9, arg2, var21, var20, var22, super.field7093, arg0, arg1);
                            }
                            class390.method2363(arg9, arg8, arg3, var26);
                            if (var12.field6041 == 1 && arg6 != null) {
                                arg6.method2184(arg10, arg8, arg3);
                            }
                        }
                    } else if (~arg7 != -11 && arg7 != 11) {
                        if ((arg7 < 12 || ~arg7 < -18) && (~arg7 > -19 || arg7 > 21)) {
                            if (arg7 == 0) {
                                int var29 = var12.field6059;
                                if (class13.field196 && ~var12.field6059 == 0) {
                                    var29 = 1;
                                }
                                class373 var31;
                                if (var24) {
                                    class357 var30 = new class357(arg4, var12, arg9, arg2, var21, var20, var22, super.field7093, arg7, arg0, var23);
                                    var31 = var30;
                                    if (var30.method1036((byte) -125)) {
                                        var30.method1040(arg4, (byte) 55);
                                    }
                                } else {
                                    var31 = new class263(arg4, var12, arg9, arg2, var21, var20, var22, super.field7093, arg7, arg0, arg1);
                                }
                                class524.method2983(arg9, arg8, arg3, var31, (class373) null);
                                if (~arg0 == -1) {
                                    if (class777.field10728 && var12.field6119) {
                                        var19.method1894(arg8, arg3, 50);
                                        var19.method1894(arg8, arg3 + 1, 50);
                                    }
                                    if (var29 == 1 && !super.field7093) {
                                        class659.method3708(arg9, var12.field6074, arg8, arg3, 1, var12.field6108, -94);
                                    }
                                } else if (arg0 == 1) {
                                    if (class777.field10728 && var12.field6119) {
                                        var19.method1894(arg8, arg3 + 1, 50);
                                        var19.method1894(arg8 + 1, arg3 - -1, 50);
                                    }
                                    if (~var29 == -2 && !super.field7093) {
                                        class659.method3708(arg9, -var12.field6074, arg8, arg3 + 1, 2, var12.field6108, -43);
                                    }
                                } else if (arg0 != 2) {
                                    if (arg0 == 3) {
                                        if (class777.field10728 && var12.field6119) {
                                            var19.method1894(arg8, arg3, 50);
                                            var19.method1894(arg8 + 1, arg3, 50);
                                        }
                                        if (var29 == 1 && !super.field7093) {
                                            class659.method3708(arg9, var12.field6074, arg8, arg3, 2, var12.field6108, -14);
                                        }
                                    }
                                } else {
                                    if (class777.field10728 && var12.field6119) {
                                        var19.method1894(arg8 + 1, arg3, 50);
                                        var19.method1894(arg8 - -1, arg3 + 1, 50);
                                    }
                                    if (var29 == 1 && !super.field7093) {
                                        class659.method3708(arg9, -var12.field6074, arg8 + 1, arg3, 1, var12.field6108, -62);
                                    }
                                }
                                if (var12.field6041 != 0 && arg6 != null) {
                                    arg6.method2191(arg0, arg3, (byte) 59, !var12.field6124, arg7, var12.field6068, arg8);
                                }
                                if (var12.field6034 != 64) {
                                    class675.method3805(arg9, arg8, arg3, var12.field6034);
                                }
                            } else if (arg7 == 1) {
                                class373 var32;
                                if (!var24) {
                                    var32 = new class263(arg4, var12, arg9, arg2, var21, var20, var22, super.field7093, arg7, arg0, arg1);
                                } else {
                                    class357 var33 = new class357(arg4, var12, arg9, arg2, var21, var20, var22, super.field7093, arg7, arg0, var23);
                                    var32 = var33;
                                    if (var33.method1036((byte) -63)) {
                                        var33.method1040(arg4, (byte) 55);
                                    }
                                }
                                class524.method2983(arg9, arg8, arg3, var32, (class373) null);
                                if (var12.field6119 && class777.field10728) {
                                    if (~arg0 == -1) {
                                        var19.method1894(arg8, arg3 + 1, 50);
                                    } else if (arg0 == 1) {
                                        var19.method1894(arg8 - -1, arg3 + 1, 50);
                                    } else if (~arg0 == -3) {
                                        var19.method1894(arg8 - -1, arg3, 50);
                                    } else if (arg0 == 3) {
                                        var19.method1894(arg8, arg3, 50);
                                    }
                                }
                                if (var12.field6041 != 0 && arg6 != null) {
                                    arg6.method2191(arg0, arg3, (byte) 59, !var12.field6124, arg7, var12.field6068, arg8);
                                }
                            } else if (arg7 == 2) {
                                int var34 = 3 & arg0 + 1;
                                class373 var35;
                                class373 var36;
                                if (!var24) {
                                    var35 = new class263(arg4, var12, arg9, arg2, var21, var20, var22, super.field7093, arg7, arg0 + 4, arg1);
                                    var36 = new class263(arg4, var12, arg9, arg2, var21, var20, var22, super.field7093, arg7, var34, arg1);
                                } else {
                                    class357 var37 = new class357(arg4, var12, arg9, arg2, var21, var20, var22, super.field7093, arg7, arg0 + 4, var23);
                                    class357 var38 = new class357(arg4, var12, arg9, arg2, var21, var20, var22, super.field7093, arg7, var34, var23);
                                    if (var37.method1036((byte) -51)) {
                                        var37.method1040(arg4, (byte) 55);
                                    }
                                    var35 = var37;
                                    if (var38.method1036((byte) -128)) {
                                        var38.method1040(arg4, (byte) 55);
                                    }
                                    var36 = var38;
                                }
                                class524.method2983(arg9, arg8, arg3, var35, var36);
                                if ((~var12.field6059 == -2 || class13.field196 && var12.field6059 == -1) && !super.field7093) {
                                    if (arg0 == 0) {
                                        class659.method3708(arg9, var12.field6074, arg8, arg3, 1, var12.field6108, -118);
                                        class659.method3708(arg9, var12.field6074, arg8, arg3 - -1, 2, var12.field6108, -79);
                                    } else if (~arg0 == -2) {
                                        class659.method3708(arg9, var12.field6074, arg8 + 1, arg3, 1, var12.field6108, -21);
                                        class659.method3708(arg9, var12.field6074, arg8, arg3 + 1, 2, var12.field6108, -83);
                                    } else if (arg0 != 2) {
                                        if (arg0 == 3) {
                                            class659.method3708(arg9, var12.field6074, arg8, arg3, 1, var12.field6108, -56);
                                            class659.method3708(arg9, var12.field6074, arg8, arg3, 2, var12.field6108, -124);
                                        }
                                    } else {
                                        class659.method3708(arg9, var12.field6074, arg8 + 1, arg3, 1, var12.field6108, -124);
                                        class659.method3708(arg9, var12.field6074, arg8, arg3, 2, var12.field6108, -21);
                                    }
                                }
                                if (~var12.field6041 != -1 && arg6 != null) {
                                    arg6.method2191(arg0, arg3, (byte) 59, !var12.field6124, arg7, var12.field6068, arg8);
                                }
                                if (~var12.field6034 != -65) {
                                    class675.method3805(arg9, arg8, arg3, var12.field6034);
                                }
                            } else if (arg7 == 3) {
                                class373 var40;
                                if (var24) {
                                    class357 var39 = new class357(arg4, var12, arg9, arg2, var21, var20, var22, super.field7093, arg7, arg0, var23);
                                    var40 = var39;
                                    if (var39.method1036((byte) -66)) {
                                        var39.method1040(arg4, (byte) 55);
                                    }
                                } else {
                                    var40 = new class263(arg4, var12, arg9, arg2, var21, var20, var22, super.field7093, arg7, arg0, arg1);
                                }
                                class524.method2983(arg9, arg8, arg3, var40, (class373) null);
                                if (var12.field6119 && class777.field10728) {
                                    if (arg0 == 0) {
                                        var19.method1894(arg8, arg3 + 1, 50);
                                    } else if (arg0 != 1) {
                                        if (arg0 == 2) {
                                            var19.method1894(arg8 + 1, arg3, 50);
                                        } else if (~arg0 == -4) {
                                            var19.method1894(arg8, arg3, 50);
                                        }
                                    } else {
                                        var19.method1894(arg8 + 1, arg3 + 1, 50);
                                    }
                                }
                                if (~var12.field6041 != -1 && arg6 != null) {
                                    arg6.method2191(arg0, arg3, (byte) 59, !var12.field6124, arg7, var12.field6068, arg8);
                                }
                            } else if (arg7 == 9) {
                                class597 var41;
                                if (!var24) {
                                    var41 = new class313(arg4, var12, arg9, arg2, var21, var20, var22, super.field7093, arg8, arg8 - 1 + var14, arg3, var13 + -1 + arg3, arg7, arg0, arg1);
                                } else {
                                    class142 var42 = new class142(arg4, var12, arg9, arg2, var21, var20, var22, super.field7093, arg8, arg8, arg3, arg3, arg7, arg0, var23);
                                    var41 = var42;
                                    if (var42.method1036((byte) -111)) {
                                        var42.method1040(arg4, (byte) 55);
                                    }
                                }
                                class737.method4088(var41, false);
                                if (var12.field6059 == 1 && !super.field7093) {
                                    byte var43;
                                    if (~(arg0 & 1) == -1) {
                                        var43 = 8;
                                    } else {
                                        var43 = 16;
                                    }
                                    class659.method3708(arg9, 0, arg8, arg3, var43, var12.field6108, -125);
                                }
                                if (var12.field6041 != 0 && arg6 != null) {
                                    arg6.method2180(!var12.field6124, var14, arg3, var13, -3924, arg8, var12.field6068);
                                }
                                if (var12.field6034 != 64) {
                                    class675.method3805(arg9, arg8, arg3, var12.field6034);
                                }
                            } else if (~arg7 == -5) {
                                class524 var44;
                                if (!var24) {
                                    var44 = new class717(arg4, var12, arg9, arg2, var21, var20, var22, super.field7093, 0, 0, arg7, arg0, arg1);
                                } else {
                                    class622 var45 = new class622(arg4, var12, arg9, arg2, var21, var20, var22, super.field7093, 0, 0, arg7, arg0);
                                    var44 = var45;
                                    if (var45.method1036((byte) -67)) {
                                        var45.method1040(arg4, (byte) 55);
                                    }
                                }
                                class655.method3680(arg9, arg8, arg3, var44, (class524) null);
                            } else if (arg7 == 5) {
                                int var46 = 65;
                                class237 var47 = (class237) class454.method2624(arg9, arg8, arg3);
                                if (var47 != null) {
                                    var46 = 1 + class414.field5670.method2319(var47.method1032(false), false).field6034;
                                }
                                class524 var48;
                                if (!var24) {
                                    var48 = new class717(arg4, var12, arg9, arg2, var21, var20, var22, super.field7093, class662.field9196[arg0] * var46, class141.field2376[arg0] * var46, arg7, arg0, arg1);
                                } else {
                                    class622 var49 = new class622(arg4, var12, arg9, arg2, var21, var20, var22, super.field7093, class662.field9196[arg0] * var46, class141.field2376[arg0] * var46, arg7, arg0);
                                    if (var49.method1036((byte) -104)) {
                                        var49.method1040(arg4, (byte) 55);
                                    }
                                    var48 = var49;
                                }
                                class655.method3680(arg9, arg8, arg3, var48, (class524) null);
                            } else if (arg7 == 6) {
                                int var50 = 33;
                                class237 var51 = (class237) class454.method2624(arg9, arg8, arg3);
                                if (var51 != null) {
                                    var50 = 1 + class414.field5670.method2319(var51.method1032(false), false).field6034 / 2;
                                }
                                class524 var52;
                                if (!var24) {
                                    var52 = new class717(arg4, var12, arg9, arg2, var21, var20, var22, super.field7093, class124.field2205[arg0] * var50, class728.field9996[arg0] * var50, arg7, arg0 + 4, arg1);
                                } else {
                                    class622 var53 = new class622(arg4, var12, arg9, arg2, var21, var20, var22, super.field7093, class662.field9196[arg0] * var50, class141.field2376[arg0] * var50, arg7, arg0 + 4);
                                    var52 = var53;
                                    if (var53.method1036((byte) -58)) {
                                        var53.method1040(arg4, (byte) 55);
                                    }
                                }
                                class655.method3680(arg9, arg8, arg3, var52, (class524) null);
                            } else if (~arg7 == -8) {
                                int var54 = 3 & arg0 + 2;
                                class524 var55;
                                if (!var24) {
                                    var55 = new class717(arg4, var12, arg9, arg2, var21, var20, var22, super.field7093, 0, 0, arg7, var54 + 4, arg1);
                                } else {
                                    class622 var56 = new class622(arg4, var12, arg9, arg2, var21, var20, var22, super.field7093, 0, 0, arg7, var54 + 4);
                                    var55 = var56;
                                    if (var56.method1036((byte) -91)) {
                                        var56.method1040(arg4, (byte) 55);
                                    }
                                }
                                class655.method3680(arg9, arg8, arg3, var55, (class524) null);
                            } else if (~arg7 == -9) {
                                int var57 = arg0 + 2 & 3;
                                int var58 = 33;
                                class237 var59 = (class237) class454.method2624(arg9, arg8, arg3);
                                if (var59 != null) {
                                    var58 = 1 + class414.field5670.method2319(var59.method1032(false), false).field6034 / 2;
                                }
                                class524 var62;
                                class524 var63;
                                if (var24) {
                                    class622 var60 = new class622(arg4, var12, arg9, arg2, var21, var20, var22, super.field7093, class124.field2205[arg0] * var58, class728.field9996[arg0] * var58, arg7, arg0 + 4);
                                    class622 var61 = new class622(arg4, var12, arg9, arg2, var21, var20, var22, super.field7093, 0, 0, arg7, var57 + 4);
                                    if (var60.method1036((byte) -98)) {
                                        var60.method1040(arg4, (byte) 55);
                                    }
                                    if (var61.method1036((byte) -46)) {
                                        var61.method1040(arg4, (byte) 55);
                                    }
                                    var62 = var60;
                                    var63 = var61;
                                } else {
                                    class717 var64 = new class717(arg4, var12, arg9, arg2, var21, var20, var22, super.field7093, class124.field2205[arg0] * var58, class728.field9996[arg0] * var58, arg7, arg0 + 4, arg1);
                                    class717 var65 = new class717(arg4, var12, arg9, arg2, var21, var20, var22, super.field7093, 0, 0, arg7, var57 + 4, arg1);
                                    var62 = var64;
                                    var63 = var65;
                                }
                                class655.method3680(arg9, arg8, arg3, var62, var63);
                            }
                        } else {
                            class597 var28;
                            if (var24) {
                                class142 var27 = new class142(arg4, var12, arg9, arg2, var21, var20, var22, super.field7093, arg8, var14 + -1 + arg8, arg3, var13 + -1 + arg3, arg7, arg0, var23);
                                if (var27.method1036((byte) -62)) {
                                    var27.method1040(arg4, (byte) 55);
                                }
                                var28 = var27;
                            } else {
                                var28 = new class313(arg4, var12, arg9, arg2, var21, var20, var22, super.field7093, arg8, arg8 + -1 + var14, arg3, arg3 + var13 + -1, arg7, arg0, arg1);
                            }
                            class737.method4088(var28, false);
                            if (class777.field10728 && !super.field7093 && arg7 >= 12 && arg7 <= 17 && arg7 != 13 && ~arg9 < -1 && ~var12.field6059 != -1) {
                                super.field7099[arg9][arg8][arg3] = (byte) class530.method3011(super.field7099[arg9][arg8][arg3], 4);
                            }
                            if (~var12.field6041 != -1 && arg6 != null) {
                                arg6.method2180(!var12.field6124, var14, arg3, var13, -3924, arg8, var12.field6068);
                            }
                        }
                    } else {
                        class142 var66 = null;
                        int var67;
                        class597 var68;
                        if (!var24) {
                            var67 = 15;
                            var68 = new class313(arg4, var12, arg9, arg2, var21, var20, var22, super.field7093, arg8, arg8 + -1 + var14, arg3, arg3 + -1 + var13, arg7, arg0, arg1);
                        } else {
                            class142 var69 = new class142(arg4, var12, arg9, arg2, var21, var20, var22, super.field7093, arg8, arg8 + var14 + -1, arg3, arg3 + -1 + var13, arg7, arg0, var23);
                            var66 = var69;
                            var68 = var69;
                            var67 = var69.method1155(96);
                        }
                        if (class737.method4088(var68, false)) {
                            if (var66 != null && var66.method1036((byte) -88)) {
                                var66.method1040(arg4, (byte) 55);
                            }
                            if (var12.field6119 && class777.field10728) {
                                if (~var67 < -31) {
                                    var67 = 30;
                                }
                                for (int var70 = 0; ~var70 >= ~var14; ++var70) {
                                    for (int var71 = 0; var71 <= var13; ++var71) {
                                        var19.method1894(arg8 + var70, arg3 - -var71, var67);
                                    }
                                }
                            }
                        }
                        if (~var12.field6041 != -1 && arg6 != null) {
                            arg6.method2180(!var12.field6124, var14, arg3, var13, -3924, arg8, var12.field6068);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(III[IILfca;Lha;IIII)V", line = 1339)
    public final void method1221(int arg0, int arg1, int arg2, int[] arg3, int arg4, class93 arg5, class66 arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field2558;
        if (!super.field7093) {
            boolean var12 = false;
            if (arg3 != null) {
                arg3[0] = -1;
            }
            class28 var13 = null;
            int var14 = (7 & arg2) * arg7;
            int var15 = (arg4 & 7) * 8;
            while (true) {
                while (arg5.field1442 < arg5.field1413.length) {
                    int var20 = arg5.method793((byte) 119);
                    if (var20 == 0) {
                        var13 = new class28(arg5);
                    } else if (~var20 == -2) {
                        int var34 = arg5.method793((byte) 22);
                        if (var34 > 0) {
                            for (int var35 = 0; ~var34 < ~var35; ++var35) {
                                class199 var36 = new class199(arg6, arg5, 2);
                                if (~var36.field3006 == -32) {
                                    class223 var37 = class526.field7142.method1724((byte) -67, arg5.method763(-40));
                                    var36.method1430(var37.field3255, false, var37.field3261, var37.field3257, var37.field3249);
                                }
                                if (arg6.method493() > 0) {
                                    class307 var38 = var36.field3001;
                                    int var39 = var38.method1962(arg7 ^ 8) >> 9;
                                    int var40 = var38.method1958(true) >> 9;
                                    if (var36.field3015 == arg0 && ~var39 <= ~var14 && ~(var14 + 8) < ~var39 && ~var15 >= ~var40 && var40 < var15 - -8) {
                                        int var41 = (arg8 << 9) - -class429.method2524(var38.method1962(0) & 4095, arg1, var38.method1958(true) & 4095, (byte) -34);
                                        int var42 = var41 >> 9;
                                        int var43 = class739.method4095(arg7 + -39, var38.method1958(true) & 4095, arg1, var38.method1962(arg7 ^ 8) & 4095) + (arg10 << 9);
                                        int var44 = var43 >> 9;
                                        if (~var42 <= -1 && ~var44 <= -1 && var42 < super.field7101 && super.field7105 > var44) {
                                            var38.method1399(super.field7103[arg0][var42][var44] + -var38.method1961(arg7 ^ -120), var41, -27297, var43);
                                            class312.method1982(var36);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var20 == 2) {
                        if (var13 == null) {
                            var13 = new class28();
                        }
                        var13.method182(arg5, (byte) -84);
                    } else if (var20 == 128) {
                        if (arg3 == null) {
                            arg5.field1442 += 10;
                        } else {
                            arg3[0] = arg5.method763(arg7 + -64);
                            arg3[1] = arg5.method774(-4);
                            arg3[2] = arg5.method774(-4);
                            arg3[3] = arg5.method774(arg7 + -12);
                            arg3[4] = arg5.method763(-93);
                        }
                    } else {
                        if (~var20 != -130) {
                            throw new IllegalStateException("");
                        }
                        if (super.field7088 == null) {
                            super.field7088 = new byte[4][][];
                        }
                        for (int var21 = 0; ~var21 > -5; ++var21) {
                            byte var22 = arg5.method766((byte) 122);
                            if (var22 == 0 && super.field7088[arg9] != null) {
                                if (arg0 >= var21) {
                                    int var23 = arg8;
                                    int var24 = arg8 + 7;
                                    int var25 = arg10;
                                    if (arg8 < 0) {
                                        var23 = 0;
                                    } else if (~super.field7101 >= ~arg8) {
                                        var23 = super.field7101;
                                    }
                                    if (var24 < 0) {
                                        var24 = 0;
                                    } else if (var24 >= super.field7101) {
                                        var24 = super.field7101;
                                    }
                                    int var26 = arg10 + 7;
                                    if (~arg10 > -1) {
                                        var25 = 0;
                                    } else if (super.field7105 <= arg10) {
                                        var25 = super.field7105;
                                    }
                                    if (~var26 > -1) {
                                        var26 = 0;
                                    } else if (var26 >= super.field7105) {
                                        var26 = super.field7105;
                                    }
                                    while (~var24 < ~var23) {
                                        while (var25 < var26) {
                                            super.field7088[arg9][var23][var25] = 0;
                                            ++var25;
                                        }
                                        ++var23;
                                    }
                                }
                            } else if (~var22 == -2) {
                                if (super.field7088[arg9] == null) {
                                    super.field7088[arg9] = new byte[super.field7101 + 1][super.field7105 + 1];
                                }
                                for (int var27 = 0; var27 < 64; var27 += 4) {
                                    for (int var28 = 0; var28 < 64; var28 += 4) {
                                        byte var29 = arg5.method766((byte) 122);
                                        if (~var21 >= ~arg0) {
                                            for (int var30 = var27; var27 + 4 > var30; ++var30) {
                                                for (int var31 = var28; ~var31 > ~(var28 + 4); ++var31) {
                                                    if (var14 <= var30 && ~(var14 + 8) < ~var30 && var15 <= var31 && ~(var15 + 8) < ~var15) {
                                                        int var32 = class180.method1354(arg1, 7 & var30, (byte) 113, var31 & 7) + arg8;
                                                        int var33 = class239.method1592(arg1, 7 & var30, var31 & 7, false) + arg10;
                                                        if (~var32 <= -1 && ~var32 > ~super.field7101 && var33 >= 0 && ~var33 > ~super.field7105) {
                                                            super.field7088[arg9][var32][var33] = var29;
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
                    class57.method405(var13, 25485, arg8 >> 3, arg10 >> 3);
                }
                if (!var12 && super.field7088 != null && super.field7088[arg9] != null) {
                    int var16 = arg8 - -7;
                    int var17 = arg10 - -7;
                    for (int var18 = arg8; ~var16 < ~var18; ++var18) {
                        for (int var19 = arg10; ~var19 > ~var17; ++var19) {
                            super.field7088[arg9][var18][var19] = 0;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(I)V", line = 1628)
    public static void method1222(int arg0) {
        if (arg0 > -44) {
            method1213((byte) -22, (class662) null);
        }
        field2548 = null;
        field2547 = null;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lha;IZ)V", line = 1640)
    public final void method1223(class66 arg0, int arg1, boolean arg2) {
        class365.method2229();
        ++field2550;
        if (arg1 == -27772) {
            if (!arg2) {
                if (super.field7090 > 1) {
                    for (int var4 = 0; var4 < super.field7101; ++var4) {
                        for (int var5 = 0; ~super.field7105 < ~var5; ++var5) {
                            if (~(2 & class554.field7832[1][var4][var5]) == -3) {
                                class300.method1928(var4, var5);
                            }
                        }
                    }
                }
                for (int var6 = 0; var6 < super.field7090; ++var6) {
                    for (int var7 = 0; ~super.field7105 <= ~var7; ++var7) {
                        for (int var8 = 0; var8 <= super.field7101; ++var8) {
                            if (~(super.field7099[var6][var8][var7] & 4) != -1) {
                                int var9 = var8;
                                int var10 = var8;
                                int var11 = var7;
                                int var12 = var7;
                                while (var11 > 0 && ~(4 & super.field7099[var6][var8][var11 - 1]) != -1 && -var11 + var12 < 10) {
                                    --var11;
                                }
                                while (~var12 > ~super.field7105 && (super.field7099[var6][var8][var12 - -1] & 4) != 0 && var12 - var11 < 10) {
                                    ++var12;
                                }
                                label117: while (var9 > 0 && -var9 + var10 < 10) {
                                    for (int var13 = var11; ~var12 <= ~var13; ++var13) {
                                        if (~(super.field7099[var6][var9 + -1][var13] & 4) == -1) {
                                            break label117;
                                        }
                                    }
                                    --var9;
                                }
                                label104: while (super.field7101 > var10 && -var9 + var10 < 10) {
                                    for (int var14 = var11; ~var14 >= ~var12; ++var14) {
                                        if ((4 & super.field7099[var6][var10 + 1][var14]) == 0) {
                                            break label104;
                                        }
                                    }
                                    ++var10;
                                }
                                if (~((-var9 + var10 - -1) * (-var11 + 1 + var12)) <= -5) {
                                    int var15 = super.field7103[var6][var9][var11];
                                    class507.method2896(var6, var15, var9 << 9, var11 << 9, (var10 << 9) + 512, var15, 4, (var12 << 9) + 512, -1343492568);
                                    for (int var16 = var9; var16 <= var10; ++var16) {
                                        for (int var17 = var11; var12 >= var17; ++var17) {
                                            super.field7099[var6][var16][var17] = (byte) class204.method1456(super.field7099[var6][var16][var17], -5);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                class422.method2497(0);
            }
            super.field7099 = null;
        }
    }
}
