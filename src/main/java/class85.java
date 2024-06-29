import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class85 extends class11 {

    @OriginalMember(owner = "client!hu", name = "I", descriptor = "I")
    public int field1465 = 99;

    @OriginalMember(owner = "client!hu", name = "K", descriptor = "I")
    public static int field1467 = 0;

    @OriginalMember(owner = "client!hu", name = "S", descriptor = "I")
    public static int field1475 = 0;

    @OriginalMember(owner = "client!hu", name = "H", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!hu", name = "J", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!hu", name = "N", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!hu", name = "O", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!hu", name = "P", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!hu", name = "Q", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!hu", name = "R", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!hu", name = "T", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!hu", name = "U", descriptor = "I")
    public static int field1477;

    // $FF: synthetic field
    @OriginalMember(owner = "client!hu", name = "V", descriptor = "Ljava/lang/Class;")
    public static Class field1478;

    @OriginalMember(owner = "client!hu", name = "M", descriptor = "[Lf;")
    public static class529[] field1469;

    @OriginalMember(owner = "client!hu", name = "L", descriptor = "[Lmp;")
    public static class531[] field1468;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(ILbr;Lqa;IIBI)V")
    public final void method653(int arg0, class268 arg1, class162 arg2, int arg3, int arg4, byte arg5, int arg6) {
        ++field1466;
        class248 var8 = null;
        if (~arg3 == -1) {
            var8 = (class248) class310.method2028(arg0, arg6, arg4);
        }
        if (~arg3 == -2) {
            var8 = (class248) class462.method2745(arg0, arg6, arg4);
        }
        if (~arg3 == -3) {
            var8 = (class248) class367.method2294(arg0, arg6, arg4, field1478 != null ? field1478 : (field1478 = method662("pa")));
        }
        if (arg3 == 3) {
            var8 = (class248) class412.method2496(arg0, arg6, arg4);
        }
        if (var8 != null) {
            class79 var9 = class319.field4807.method2874(var8.method17((byte) -117), -17045);
            int var10 = var8.method12(3765);
            int var11 = var8.method19((byte) -69);
            if (var9.method627((byte) -23)) {
                class363.method2280(arg0, var9, arg6, -588, arg4);
            }
            if (var8.method8(117)) {
                var8.method9(arg2, -116);
            }
            if (arg3 != 0) {
                if (~arg3 != -2) {
                    if (arg3 != 2) {
                        if (~arg3 == -4) {
                            class480 var12 = class412.method2496(arg0, arg6, arg4);
                            if (var12 instanceof class244) {
                                ((class244) var12).field3512 = null;
                            } else {
                                class28.method325(arg0, arg6, arg4);
                            }
                            if (~var9.field1381 == -2) {
                                arg1.method1720(arg6, arg4, (byte) 105);
                            }
                        }
                    } else {
                        class417 var13 = class367.method2294(arg0, arg6, arg4, field1478 != null ? field1478 : (field1478 = method662("pa")));
                        if (var13 instanceof class65 && var13.field6231 == arg6 && ~var13.field6238 == ~arg4) {
                            ((class65) var13).field1109 = null;
                        } else {
                            class492.method2932(arg0, arg6, arg4, field1478 != null ? field1478 : (field1478 = method662("pa")));
                        }
                        if (~var9.field1381 != -1 && ~super.field195 < ~(var9.field1345 + arg6) && ~(var9.field1345 + arg4) > ~super.field194 && ~super.field195 < ~(var9.field1384 + arg6) && super.field194 > var9.field1384 + arg4) {
                            arg1.method1731(!var9.field1362, var9.field1372, var11, arg6, var9.field1345, var9.field1384, (byte) 115, arg4);
                        }
                    }
                } else {
                    class506 var14 = class462.method2745(arg0, arg6, arg4);
                    if (!(var14 instanceof class36)) {
                        class118.method880(arg0, arg6, arg4);
                    } else {
                        ((class36) var14).field697 = null;
                    }
                }
            } else {
                class241 var15 = class310.method2028(arg0, arg6, arg4);
                if (var15 instanceof class167) {
                    ((class167) var15).field2594 = null;
                } else {
                    class41.method409(arg0, arg6, arg4);
                }
                if (~var9.field1381 != -1) {
                    arg1.method1725(-24484, arg6, arg4, var10, var11, var9.field1372, !var9.field1362);
                }
            }
        }
        if (arg5 != 87) {
            this.method659(-63, (class162) null, -21, 15, 2, 19, (class268) null, -106, 19, -78, -58);
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Lqa;I)V")
    public final void method654(class162 arg0, int arg1) {
        class242.method1581(arg0);
        ++field1470;
        if (arg1 < super.field168) {
            for (int var3 = 0; var3 < super.field195; ++var3) {
                for (int var4 = 0; ~super.field194 < ~var4; ++var4) {
                    if (~(2 & class260.field3784[1][var3][var4]) == -3) {
                        class350.method2222(var3, var4);
                    }
                }
            }
        }
        for (int var5 = 0; var5 < super.field168; ++var5) {
            for (int var6 = 0; var6 <= super.field194; ++var6) {
                for (int var7 = 0; super.field195 >= var7; ++var7) {
                    if ((1 & super.field166[var5][var7][var6]) != 0) {
                        int var8 = var6;
                        int var9 = var6;
                        int var10 = var5;
                        while (~var8 < -1 && ~(super.field166[var5][var7][var8 + -1] & 1) != -1) {
                            --var8;
                        }
                        while (var9 < super.field194 && (super.field166[var5][var7][var9 + 1] & 1) != 0) {
                            ++var9;
                        }
                        int var11 = var5;
                        label167: while (var10 > 0) {
                            for (int var12 = var8; var12 <= var9; ++var12) {
                                if ((1 & super.field166[var10 + -1][var7][var12]) == 0) {
                                    break label167;
                                }
                            }
                            --var10;
                        }
                        label156: while (var11 < 3) {
                            for (int var13 = var8; ~var13 >= ~var9; ++var13) {
                                if ((super.field166[var11 + 1][var7][var13] & 1) == 0) {
                                    break label156;
                                }
                            }
                            ++var11;
                        }
                        int var14 = (-var8 + var9 - -1) * (-var10 + 1 + var11);
                        if (~var14 <= -3) {
                            short var15 = 240;
                            int var16 = super.field183[var11][var7][var8] - var15;
                            int var17 = super.field183[var10][var7][var8];
                            class353.method2242(1, var7 << 7, var7 << 7, var8 << 7, (var9 << 7) + 128, var16, var17);
                            for (int var18 = var10; ~var11 <= ~var18; ++var18) {
                                for (int var19 = var8; ~var19 >= ~var9; ++var19) {
                                    super.field166[var18][var7][var19] = (byte) class207.method1405(super.field166[var18][var7][var19], -2);
                                }
                            }
                        }
                    }
                    if (~(2 & super.field166[var5][var7][var6]) != -1) {
                        int var20 = var7;
                        int var21 = var7;
                        int var22 = var5;
                        while (~super.field195 < ~var21 && (2 & super.field166[var5][var21 + 1][var6]) != 0) {
                            ++var21;
                        }
                        while (var20 > 0 && ~(super.field166[var5][var20 - 1][var6] & 2) != -1) {
                            --var20;
                        }
                        int var23 = var5;
                        label221: while (var22 > 0) {
                            for (int var24 = var20; ~var24 >= ~var21; ++var24) {
                                if (~(2 & super.field166[var22 + -1][var24][var6]) == -1) {
                                    break label221;
                                }
                            }
                            --var22;
                        }
                        label210: while (var23 < 3) {
                            for (int var25 = var20; var21 >= var25; ++var25) {
                                if (~(2 & super.field166[var23 - -1][var25][var6]) == -1) {
                                    break label210;
                                }
                            }
                            ++var23;
                        }
                        int var26 = (var23 + 1 - var22) * (-var20 + var21 + 1);
                        if (var26 >= 2) {
                            short var27 = 240;
                            int var28 = super.field183[var23][var20][var6] + -var27;
                            int var29 = super.field183[var22][var20][var6];
                            class353.method2242(2, var20 << 7, (var21 << 7) + 128, var6 << 7, var6 << 7, var28, var29);
                            for (int var30 = var22; ~var23 <= ~var30; ++var30) {
                                for (int var31 = var20; ~var31 >= ~var21; ++var31) {
                                    super.field166[var30][var31][var6] = (byte) class207.method1405(super.field166[var30][var31][var6], -3);
                                }
                            }
                        }
                    }
                    if ((super.field166[var5][var7][var6] & 4) != 0) {
                        int var32 = var7;
                        int var33 = var7;
                        int var34 = var6;
                        int var35 = var6;
                        while (~var34 < -1 && ~(super.field166[var5][var7][var34 + -1] & 4) != -1) {
                            --var34;
                        }
                        while (var35 < super.field194 && ~(4 & super.field166[var5][var7][var35 + 1]) != -1) {
                            ++var35;
                        }
                        label275: while (var32 > 0) {
                            for (int var36 = var34; ~var36 >= ~var35; ++var36) {
                                if (~(4 & super.field166[var5][var32 + -1][var36]) == -1) {
                                    break label275;
                                }
                            }
                            --var32;
                        }
                        label264: while (~super.field195 < ~var33) {
                            for (int var37 = var34; ~var35 <= ~var37; ++var37) {
                                if (~(4 & super.field166[var5][var33 - -1][var37]) == -1) {
                                    break label264;
                                }
                            }
                            ++var33;
                        }
                        if (~((-var32 + var33 + 1) * (-var34 + 1 + var35)) <= -5) {
                            int var38 = super.field183[var5][var32][var34];
                            class353.method2242(4, var32 << 7, (var33 << 7) - -128, var34 << 7, (var35 << 7) - -128, var38, var38);
                            for (int var39 = var32; var39 <= var33; ++var39) {
                                for (int var40 = var34; var40 <= var35; ++var40) {
                                    super.field166[var5][var39][var40] = (byte) class207.method1405(super.field166[var5][var39][var40], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
        super.field166 = null;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "([IIBILcu;Lqa;)V")
    public final void method655(int[] arg0, int arg1, byte arg2, int arg3, class145 arg4, class162 arg5) {
        ++field1476;
        if (!super.field189) {
            boolean var7 = false;
            class226 var8 = null;
            if (arg0 != null) {
                arg0[0] = -1;
            }
            if (arg2 != -5) {
                this.field1465 = 36;
            }
            while (true) {
                int var19;
                label315: do {
                    while (true) {
                        while (~arg4.field2289 > ~arg4.field2270.length) {
                            int var18 = arg4.method1063((byte) 105);
                            if (~var18 != -1) {
                                if (var18 == 1) {
                                    var19 = arg4.method1063((byte) 123);
                                    continue label315;
                                }
                                if (~var18 == -3) {
                                    if (var8 == null) {
                                        var8 = new class226();
                                    }
                                    var8.method1481(arg4, arg2 ^ -2758);
                                } else if (~var18 == -129) {
                                    if (arg0 == null) {
                                        arg4.field2289 += 10;
                                    } else {
                                        arg0[0] = arg4.method1069((byte) -39);
                                        arg0[1] = arg4.method1122(65280);
                                        arg0[2] = arg4.method1122(65280);
                                        arg0[3] = arg4.method1122(class125.method953(arg2, -65285));
                                        arg0[4] = arg4.method1069((byte) -19);
                                    }
                                } else {
                                    if (var18 != 129) {
                                        throw new IllegalStateException("");
                                    }
                                    if (super.field180 == null) {
                                        super.field180 = new byte[4][][];
                                    }
                                    for (int var28 = 0; ~var28 > -5; ++var28) {
                                        byte var29 = arg4.method1093(15);
                                        if (var29 == 0 && super.field180[var28] != null) {
                                            int var30 = arg3;
                                            int var31 = arg3 + 64;
                                            int var32 = arg1;
                                            if (~arg1 > -1) {
                                                var32 = 0;
                                            } else if (~arg1 <= ~super.field194) {
                                                var32 = super.field194;
                                            }
                                            int var33 = arg1 + 64;
                                            if (var31 < 0) {
                                                var31 = 0;
                                            } else if (super.field195 <= var31) {
                                                var31 = super.field195;
                                            }
                                            if (arg3 >= 0) {
                                                if (super.field195 <= arg3) {
                                                    var30 = super.field195;
                                                }
                                            } else {
                                                var30 = 0;
                                            }
                                            if (var33 >= 0) {
                                                if (~var33 <= ~super.field194) {
                                                    var33 = super.field194;
                                                }
                                            } else {
                                                var33 = 0;
                                            }
                                            while (var30 < var31) {
                                                while (var32 < var33) {
                                                    super.field180[var28][var30][var32] = 0;
                                                    ++var32;
                                                }
                                                ++var30;
                                            }
                                        } else if (var29 == 1) {
                                            if (super.field180[var28] == null) {
                                                super.field180[var28] = new byte[super.field195 + 1][super.field194 - -1];
                                            }
                                            for (int var34 = 0; ~var34 > -65; var34 += 4) {
                                                for (int var35 = 0; var35 < 64; var35 += 4) {
                                                    byte var36 = arg4.method1093(15);
                                                    for (int var37 = arg3 + var34; ~var37 > ~(var34 - -arg3 + 4); ++var37) {
                                                        for (int var38 = arg1 + var35; arg1 + var35 + 4 > var38; ++var38) {
                                                            if (var37 >= 0 && ~var37 > ~super.field195 && ~var38 <= -1 && ~var38 > ~super.field194) {
                                                                super.field180[var28][var37][var38] = var36;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (~var29 == -3) {
                                            if (super.field180[var28] == null) {
                                                super.field180[var28] = new byte[super.field195 + 1][super.field194 + 1];
                                            }
                                            if (~var28 < -1) {
                                                int var39 = arg3;
                                                int var40 = arg3 + 64;
                                                int var41 = arg1;
                                                if (~arg3 <= -1) {
                                                    if (super.field195 <= arg3) {
                                                        var39 = super.field195;
                                                    }
                                                } else {
                                                    var39 = 0;
                                                }
                                                if (~arg1 > -1) {
                                                    var41 = 0;
                                                } else if (super.field194 <= arg1) {
                                                    var41 = super.field194;
                                                }
                                                int var42 = arg1 + 64;
                                                if (var40 < 0) {
                                                    var40 = 0;
                                                } else if (super.field195 <= var40) {
                                                    var40 = super.field195;
                                                }
                                                if (~var42 <= -1) {
                                                    if (~var42 <= ~super.field194) {
                                                        var42 = super.field194;
                                                    }
                                                } else {
                                                    var42 = 0;
                                                }
                                                while (var40 > var39) {
                                                    while (var41 < var42) {
                                                        super.field180[var28][var39][var41] = super.field180[var28 + -1][var39][var41];
                                                        ++var41;
                                                    }
                                                    ++var39;
                                                }
                                            }
                                        }
                                    }
                                    var7 = true;
                                }
                            } else {
                                var8 = new class226(arg4);
                            }
                        }
                        if (var8 != null) {
                            for (int var9 = 0; ~var9 > -9; ++var9) {
                                for (int var10 = 0; ~var10 > -9; ++var10) {
                                    int var11 = (arg3 >> 3) + var9;
                                    int var12 = (arg1 >> 3) + var10;
                                    if (~var11 <= -1 && ~(super.field195 >> 3) < ~var11 && var12 >= 0 && ~var12 > ~(super.field194 >> 3)) {
                                        class78.method620(false, var12, var8, var11);
                                    }
                                }
                            }
                        }
                        if (!var7 && super.field180 != null) {
                            for (int var13 = 0; ~var13 > -5; ++var13) {
                                if (super.field180[var13] != null) {
                                    for (int var14 = 0; var14 < 16; ++var14) {
                                        for (int var15 = 0; ~var15 > -17; ++var15) {
                                            int var16 = (arg3 >> 2) + var14;
                                            int var17 = (arg1 >> 2) - -var15;
                                            if (var16 >= 0 && ~var16 > -27 && var17 >= 0 && var17 < 26) {
                                                super.field180[var13][var16][var17] = 0;
                                            }
                                        }
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    }
                } while (~var19 >= -1);
                for (int var20 = 0; ~var20 > ~var19; ++var20) {
                    class459 var21 = new class459(arg5, arg4, 0);
                    if (var21.field6874 == 31) {
                        class257 var22 = class511.field7544.method2026(arg4.method1069((byte) -28), (byte) -128);
                        var21.method2732(var22.field3735, (byte) -93, var22.field3734, var22.field3738, var22.field3730);
                    }
                    if (arg5.method293() > 0) {
                        class462 var23 = var21.field6877;
                        int var24 = var23.method2752(arg2 ^ 25276) + (arg3 << 7);
                        int var25 = (arg1 << 7) + var23.method2744(-254);
                        int var26 = var24 >> 7;
                        int var27 = var25 >> 7;
                        if (var26 >= 0 && ~var27 <= -1 && var26 < super.field195 && var27 < super.field194) {
                            var23.method1413(var24, (byte) -18, var25, super.field183[var21.field6871][var26][var27] + -var23.method2746((byte) -118));
                            if (arg5.method293() > 0) {
                                class390.method2409(var21);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(II[B[Lbr;ILqa;)V")
    public final void method656(int arg0, int arg1, byte[] arg2, class268[] arg3, int arg4, class162 arg5) {
        if (arg4 == -25337) {
            ++field1464;
            class145 var7 = new class145(arg2);
            int var8 = -1;
            while (true) {
                int var9 = var7.method1073((byte) 113);
                if (var9 == 0) {
                    return;
                }
                var8 += var9;
                int var10 = 0;
                while (true) {
                    int var11 = var7.method1119(-91);
                    if (~var11 == -1) {
                        break;
                    }
                    var10 += var11 - 1;
                    int var12 = 63 & var10;
                    int var13 = var10 >> 6 & 63;
                    int var14 = var10 >> 12;
                    int var15 = var7.method1063((byte) -78);
                    int var16 = var15 >> 2;
                    int var17 = var15 & 3;
                    int var18 = arg0 + var13;
                    int var19 = arg1 + var12;
                    if (var18 > 0 && var19 > 0 && ~(super.field195 + -1) < ~var18 && var19 < super.field194 - 1) {
                        class268 var20 = null;
                        if (!super.field189) {
                            int var21 = var14;
                            if ((2 & class260.field3784[1][var18][var19]) == 2) {
                                var21 = var14 - 1;
                            }
                            if (var21 >= 0) {
                                var20 = arg3[var21];
                            }
                        }
                        this.method659(var19, arg5, 5, var17, var16, -1, var20, var18, var14, var8, var14);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(I)V")
    public static void method657(int arg0) {
        field1469 = null;
        field1468 = null;
        if (arg0 <= 25) {
            method661(-115, -67, 117, 90, -35, false, false);
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(ILcu;II[ILqa;IIIII)V")
    public final void method658(int arg0, class145 arg1, int arg2, int arg3, int[] arg4, class162 arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field1474;
        if (!super.field189) {
            boolean var12 = false;
            class226 var13 = null;
            if (arg4 != null) {
                arg4[0] = -1;
            }
            int var14 = (arg3 & 7) * 8;
            int var15 = (arg0 & 7) * 8;
            while (true) {
                int var21;
                label243: do {
                    while (true) {
                        while (~arg1.field2270.length < ~arg1.field2289) {
                            int var20 = arg1.method1063((byte) 113);
                            if (var20 != 0) {
                                if (~var20 == -2) {
                                    var21 = arg1.method1063((byte) 112);
                                    continue label243;
                                }
                                if (var20 == 2) {
                                    if (var13 == null) {
                                        var13 = new class226();
                                    }
                                    var13.method1481(arg1, 2753);
                                } else if (~var20 == -129) {
                                    if (arg4 != null) {
                                        arg4[0] = arg1.method1069((byte) -58);
                                        arg4[1] = arg1.method1122(65280);
                                        arg4[2] = arg1.method1122(65280);
                                        arg4[3] = arg1.method1122(65280);
                                        arg4[4] = arg1.method1069((byte) -75);
                                    } else {
                                        arg1.field2289 += 10;
                                    }
                                } else {
                                    if (~var20 != -130) {
                                        throw new IllegalStateException("");
                                    }
                                    if (super.field180 == null) {
                                        super.field180 = new byte[4][][];
                                    }
                                    for (int var32 = 0; ~var32 > -5; ++var32) {
                                        byte var33 = arg1.method1093(15);
                                        if (~var33 == -1 && super.field180[arg7] != null) {
                                            if (~arg8 <= ~var32) {
                                                int var34 = arg9;
                                                int var35 = arg9 + 7;
                                                int var36 = arg6;
                                                if (~arg6 > -1) {
                                                    var36 = 0;
                                                } else if (~arg6 <= ~super.field194) {
                                                    var36 = super.field194;
                                                }
                                                if (arg9 < 0) {
                                                    var34 = 0;
                                                } else if (super.field195 <= arg9) {
                                                    var34 = super.field195;
                                                }
                                                if (~var35 <= -1) {
                                                    if (super.field195 <= var35) {
                                                        var35 = super.field195;
                                                    }
                                                } else {
                                                    var35 = 0;
                                                }
                                                int var37 = arg6 - -7;
                                                if (~var37 <= -1) {
                                                    if (~var37 <= ~super.field194) {
                                                        var37 = super.field194;
                                                    }
                                                } else {
                                                    var37 = 0;
                                                }
                                                while (~var35 < ~var34) {
                                                    while (var36 < var37) {
                                                        super.field180[arg7][var34][var36] = 0;
                                                        ++var36;
                                                    }
                                                    ++var34;
                                                }
                                            }
                                        } else if (~var33 == -2) {
                                            if (super.field180[arg7] == null) {
                                                super.field180[arg7] = new byte[super.field195 - -1][super.field194 + 1];
                                            }
                                            for (int var38 = 0; var38 < 64; var38 += 4) {
                                                for (int var39 = 0; var39 < 64; var39 += 4) {
                                                    byte var40 = arg1.method1093(15);
                                                    if (~arg8 <= ~var32) {
                                                        for (int var41 = var38; ~var41 > ~(var38 - -4); ++var41) {
                                                            for (int var42 = var39; var39 - -4 > var42; ++var42) {
                                                                if (~var14 >= ~var41 && ~(var14 - -8) < ~var41 && ~var42 <= ~var15 && var15 < var15 - -8) {
                                                                    int var43 = class185.method1293(7 & var42, var41 & 7, arg10, false) + arg9;
                                                                    int var44 = class21.method172((byte) 127, arg10, 7 & var41, 7 & var42) + arg6;
                                                                    if (~var43 <= -1 && ~var43 > ~super.field195 && ~var44 <= -1 && ~var44 > ~super.field194) {
                                                                        super.field180[arg7][var43][var44] = var40;
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
                                var13 = new class226(arg1);
                            }
                        }
                        if (arg2 > -101) {
                            return;
                        }
                        if (var13 != null) {
                            class78.method620(false, arg6 >> 3, var13, arg9 >> 3);
                        }
                        if (!var12 && super.field180 != null && super.field180[arg7] != null) {
                            int var16 = arg9 + 7;
                            int var17 = arg6 - -7;
                            for (int var18 = arg9; ~var18 > ~var16; ++var18) {
                                for (int var19 = arg6; var19 < var17; ++var19) {
                                    super.field180[arg7][var18][var19] = 0;
                                }
                            }
                            return;
                        }
                        return;
                    }
                } while (~var21 >= -1);
                for (int var22 = 0; var22 < var21; ++var22) {
                    class459 var23 = new class459(arg5, arg1, 0);
                    if (var23.field6874 == 31) {
                        class257 var24 = class511.field7544.method2026(arg1.method1069((byte) -54), (byte) -124);
                        var23.method2732(var24.field3735, (byte) -34, var24.field3734, var24.field3738, var24.field3730);
                    }
                    if (~arg5.method293() < -1) {
                        class462 var25 = var23.field6877;
                        int var26 = var25.method2752(-25273) >> 7;
                        int var27 = var25.method2744(-254) >> 7;
                        if (~var23.field6871 == ~arg8 && ~var26 <= ~var14 && ~var26 > ~(var14 + 8) && var15 <= var27 && ~var27 > ~(var15 + 8)) {
                            int var28 = (arg9 << 7) + class498.method2985(1023 & var25.method2744(-254), true, arg10, var25.method2752(-25273) & 1023);
                            int var29 = class358.method2257(1023, arg10, 1023 & var25.method2752(-25273), 1023 & var25.method2744(-254)) + (arg6 << 7);
                            int var30 = var28 >> 7;
                            int var31 = var29 >> 7;
                            if (~var30 <= -1 && var31 >= 0 && ~var30 > ~super.field195 && super.field194 > var31) {
                                var25.method1413(var28, (byte) -61, var29, super.field183[arg8][var30][var31] + -var25.method2746((byte) -34));
                                if (~arg5.method293() < -1) {
                                    class390.method2409(var23);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(IIIZ)V")
    public class85(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class106.field1773, class43.field831);
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(ILqa;IIIILbr;IIII)V")
    public final void method659(int arg0, class162 arg1, int arg2, int arg3, int arg4, int arg5, class268 arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field1471;
        if (class443.field6623.method2840(255, class169.field2624) || class114.method850(arg0, arg7, arg8, class430.field6392, 99)) {
            if (this.field1465 > arg10) {
                this.field1465 = arg10;
            }
            class79 var12 = class319.field4807.method2874(arg9, -17045);
            if (!arg1.method202() || !class443.field6623.field616 || !var12.field1319) {
                int var13;
                int var14;
                if (~arg3 != -2 && ~arg3 != -4) {
                    var13 = var12.field1345;
                    var14 = var12.field1384;
                } else {
                    var14 = var12.field1345;
                    var13 = var12.field1384;
                }
                int var15;
                int var16;
                if (super.field195 >= arg7 - -var13) {
                    var15 = (var13 >> 1) + arg7;
                    var16 = arg7 - -(var13 - -1 >> 1);
                } else {
                    var15 = arg7;
                    var16 = arg7 + 1;
                }
                int var17;
                int var18;
                if (arg0 + var14 <= super.field194) {
                    var17 = (var14 >> 1) + arg0;
                    var18 = (var14 + 1 >> 1) + arg0;
                } else {
                    var18 = arg0 + 1;
                    var17 = arg0;
                }
                class35 var19 = class88.field1546[arg8];
                int var20 = var19.method376(var15, var17) + (var19.method376(var16, var17) - (-var19.method376(var15, var18) + -var19.method376(var16, var18))) >> 2;
                int var21 = (arg7 << 7) + (var13 << 6);
                int var22 = (arg0 << 7) + (var14 << 6);
                boolean var23 = class462.field6925 && !super.field189 && var12.field1326;
                if (var12.method627((byte) -23)) {
                    class228.method1490(arg10, arg3, (byte) 117, var12, arg0, (class256) null, (class255) null, arg7);
                }
                boolean var24 = arg5 == -1 && ~var12.field1348 == 0 && var12.field1312 == null && var12.field1370 == null && !var12.field1347;
                if (!class118.field1945 || (!class188.method1318(10793, arg4) || var12.field1390 == 1) && (!class135.method1011(arg4, (byte) 66) || var12.field1390 != 0)) {
                    if (arg4 == 22) {
                        if (class443.field6623.field593 || ~var12.field1357 != -1 || var12.field1381 == 1 || var12.field1392) {
                            class480 var25;
                            if (!var24) {
                                var25 = new class460(arg1, var12, arg10, arg8, var21, var20, var22, super.field189, arg3, arg5);
                            } else {
                                class2 var26 = new class2(arg1, var12, arg8, var21, var20, var22, super.field189, arg3, var23);
                                if (var26.method8(113)) {
                                    var26.method15(-13300, arg1);
                                }
                                var25 = var26;
                            }
                            class480 var27 = class412.method2496(arg10, arg7, arg0);
                            if (var27 instanceof class244) {
                                ((class244) var27).field3512 = var25;
                            } else {
                                class441.method2645(arg10, arg7, arg0, var25);
                            }
                            if (~var12.field1381 == -2 && arg6 != null) {
                                arg6.method1727(-17012, arg7, arg0);
                            }
                        }
                    } else if (~arg4 != -11 && arg4 != 11) {
                        if (~arg4 <= -13 && arg4 <= 17 || arg4 >= 18 && ~arg4 >= -22) {
                            class417 var28;
                            if (!var24) {
                                var28 = new class305(arg1, var12, arg10, arg8, var21, var20, var22, super.field189, arg7, arg7 + var13 + -1, arg0, arg0 + -1 - -var14, arg4, arg3, arg5);
                            } else {
                                class331 var29 = new class331(arg1, var12, arg10, arg8, var21, var20, var22, super.field189, arg7, arg7 - (-var13 - -1), arg0, var14 - 1 + arg0, arg4, arg3, var23);
                                if (var29.method8(arg2 + 91)) {
                                    var29.method15(arg2 ^ -13303, arg1);
                                }
                                var28 = var29;
                            }
                            class417 var30 = class367.method2294(arg10, arg7, arg0, field1478 != null ? field1478 : (field1478 = method662("pa")));
                            if (var30 instanceof class65 && var30.field6231 == arg7 && ~var30.field6238 == ~arg0) {
                                ((class65) var30).field1109 = var28;
                            } else {
                                class84.method651(var28, false);
                            }
                            if (class462.field6925 && !super.field189 && ~arg4 <= -13 && ~arg4 >= -18 && ~arg4 != -14 && ~arg10 < -1 && ~var12.field1390 != -1) {
                                super.field166[arg10][arg7][arg0] = (byte) class121.method909(super.field166[arg10][arg7][arg0], 4);
                            }
                            if (var12.field1381 != 0 && arg6 != null) {
                                arg6.method1734(false, !var12.field1362, var14, var13, arg0, var12.field1372, arg7);
                            }
                        } else if (~arg4 == -1) {
                            int var31 = var12.field1390;
                            if (class343.field5161 && ~var12.field1390 == 0) {
                                var31 = 1;
                            }
                            class241 var32;
                            if (!var24) {
                                var32 = new class66(arg1, var12, arg10, arg8, var21, var20, var22, super.field189, arg4, arg3, arg5);
                            } else {
                                class213 var33 = new class213(arg1, var12, arg8, var21, var20, var22, super.field189, arg4, arg3, var23);
                                if (var33.method8(97)) {
                                    var33.method15(-13300, arg1);
                                }
                                var32 = var33;
                            }
                            class241 var34 = class310.method2028(arg10, arg7, arg0);
                            if (!(var34 instanceof class167)) {
                                class163.method1205(arg10, arg7, arg0, var32, (class241) null);
                            } else {
                                ((class167) var34).field2594 = var32;
                            }
                            if (class462.field6925) {
                                if (~arg3 != -1) {
                                    if (~arg3 != -2) {
                                        if (~arg3 != -3) {
                                            if (arg3 == 3) {
                                                if (var12.field1325) {
                                                    var19.method373(arg7, arg0, 50);
                                                    var19.method373(arg7 - -1, arg0, 50);
                                                }
                                                if (var31 == 1 && !super.field189) {
                                                    super.field166[arg10][arg7][arg0] = (byte) class121.method909(super.field166[arg10][arg7][arg0], 2);
                                                }
                                            }
                                        } else {
                                            if (var12.field1325) {
                                                var19.method373(arg7 - -1, arg0, 50);
                                                var19.method373(arg7 + 1, arg0 + 1, 50);
                                            }
                                            if (var31 == 1 && !super.field189) {
                                                super.field166[arg10][arg7 - -1][arg0] = (byte) class121.method909(super.field166[arg10][arg7 - -1][arg0], 1);
                                            }
                                        }
                                    } else {
                                        if (var12.field1325) {
                                            var19.method373(arg7, arg0 - -1, 50);
                                            var19.method373(arg7 + 1, arg0 - -1, 50);
                                        }
                                        if (var31 == 1 && !super.field189) {
                                            super.field166[arg10][arg7][arg0 - -1] = (byte) class121.method909(super.field166[arg10][arg7][arg0 - -1], 2);
                                        }
                                    }
                                } else {
                                    if (var12.field1325) {
                                        var19.method373(arg7, arg0, 50);
                                        var19.method373(arg7, arg0 - -1, 50);
                                    }
                                    if (~var31 == -2 && !super.field189) {
                                        super.field166[arg10][arg7][arg0] = (byte) class121.method909(super.field166[arg10][arg7][arg0], 1);
                                    }
                                }
                            }
                            if (var12.field1381 != 0 && arg6 != null) {
                                arg6.method1724(arg3, arg7, arg4, !var12.field1362, arg0, var12.field1372, false);
                            }
                            if (~var12.field1337 != -17) {
                                class348.method2211(arg10, arg7, arg0, var12.field1337);
                            }
                        } else if (arg4 == 1) {
                            class241 var36;
                            if (var24) {
                                class213 var35 = new class213(arg1, var12, arg8, var21, var20, var22, super.field189, arg4, arg3, var23);
                                var36 = var35;
                                if (var35.method8(arg2 ^ 118)) {
                                    var35.method15(-13300, arg1);
                                }
                            } else {
                                var36 = new class66(arg1, var12, arg10, arg8, var21, var20, var22, super.field189, arg4, arg3, arg5);
                            }
                            class241 var37 = class310.method2028(arg10, arg7, arg0);
                            if (var37 instanceof class167) {
                                ((class167) var37).field2594 = var36;
                            } else {
                                class163.method1205(arg10, arg7, arg0, var36, (class241) null);
                            }
                            if (var12.field1325 && class462.field6925) {
                                if (~arg3 != -1) {
                                    if (~arg3 != -2) {
                                        if (~arg3 == -3) {
                                            var19.method373(arg7 + 1, arg0, 50);
                                        } else if (~arg3 == -4) {
                                            var19.method373(arg7, arg0, 50);
                                        }
                                    } else {
                                        var19.method373(arg7 + 1, arg0 + 1, 50);
                                    }
                                } else {
                                    var19.method373(arg7, arg0 + 1, 50);
                                }
                            }
                            if (var12.field1381 != 0 && arg6 != null) {
                                arg6.method1724(arg3, arg7, arg4, !var12.field1362, arg0, var12.field1372, false);
                            }
                        } else if (~arg4 == -3) {
                            int var38 = arg3 + 1 & 3;
                            class241 var41;
                            class241 var42;
                            if (var24) {
                                class213 var39 = new class213(arg1, var12, arg8, var21, var20, var22, super.field189, arg4, arg3 + 4, var23);
                                class213 var40 = new class213(arg1, var12, arg8, var21, var20, var22, super.field189, arg4, var38, var23);
                                if (var39.method8(arg2 + 105)) {
                                    var39.method15(-13300, arg1);
                                }
                                if (var40.method8(arg2 + 91)) {
                                    var40.method15(-13300, arg1);
                                }
                                var41 = var39;
                                var42 = var40;
                            } else {
                                var41 = new class66(arg1, var12, arg10, arg8, var21, var20, var22, super.field189, arg4, arg3 + 4, arg5);
                                var42 = new class66(arg1, var12, arg10, arg8, var21, var20, var22, super.field189, arg4, var38, arg5);
                            }
                            class163.method1205(arg10, arg7, arg0, var41, var42);
                            if (var12.field1390 == 1 && class462.field6925 && !super.field189) {
                                if (arg3 != 0) {
                                    if (~arg3 != -2) {
                                        if (~arg3 == -3) {
                                            super.field166[arg10][arg7 + 1][arg0] = (byte) class121.method909(super.field166[arg10][arg7 + 1][arg0], 1);
                                            super.field166[arg10][arg7][arg0] = (byte) class121.method909(super.field166[arg10][arg7][arg0], 2);
                                        } else if (arg3 == 3) {
                                            super.field166[arg10][arg7][arg0] = (byte) class121.method909(super.field166[arg10][arg7][arg0], 2);
                                            super.field166[arg10][arg7][arg0] = (byte) class121.method909(super.field166[arg10][arg7][arg0], 1);
                                        }
                                    } else {
                                        super.field166[arg10][arg7][arg0 + 1] = (byte) class121.method909(super.field166[arg10][arg7][arg0 + 1], 2);
                                        super.field166[arg10][arg7 + 1][arg0] = (byte) class121.method909(super.field166[arg10][arg7 + 1][arg0], 1);
                                    }
                                } else {
                                    super.field166[arg10][arg7][arg0] = (byte) class121.method909(super.field166[arg10][arg7][arg0], 1);
                                    super.field166[arg10][arg7][arg0 + 1] = (byte) class121.method909(super.field166[arg10][arg7][arg0 + 1], 2);
                                }
                            }
                            if (var12.field1381 != 0 && arg6 != null) {
                                arg6.method1724(arg3, arg7, arg4, !var12.field1362, arg0, var12.field1372, false);
                            }
                            if (~var12.field1337 != -17) {
                                class348.method2211(arg10, arg7, arg0, var12.field1337);
                            }
                        } else if (~arg4 == -4) {
                            class241 var43;
                            if (!var24) {
                                var43 = new class66(arg1, var12, arg10, arg8, var21, var20, var22, super.field189, arg4, arg3, arg5);
                            } else {
                                class213 var44 = new class213(arg1, var12, arg8, var21, var20, var22, super.field189, arg4, arg3, var23);
                                var43 = var44;
                                if (var44.method8(102)) {
                                    var44.method15(-13300, arg1);
                                }
                            }
                            class241 var45 = class310.method2028(arg10, arg7, arg0);
                            if (var45 instanceof class167) {
                                ((class167) var45).field2594 = var43;
                            } else {
                                class163.method1205(arg10, arg7, arg0, var43, (class241) null);
                            }
                            if (var12.field1325 && class462.field6925) {
                                if (arg3 != 0) {
                                    if (arg3 == 1) {
                                        var19.method373(arg7 + 1, arg0 + 1, 50);
                                    } else if (~arg3 == -3) {
                                        var19.method373(arg7 - -1, arg0, 50);
                                    } else if (arg3 == 3) {
                                        var19.method373(arg7, arg0, 50);
                                    }
                                } else {
                                    var19.method373(arg7, arg0 + 1, 50);
                                }
                            }
                            if (~var12.field1381 != -1 && arg6 != null) {
                                arg6.method1724(arg3, arg7, arg4, !var12.field1362, arg0, var12.field1372, false);
                            }
                        } else if (arg4 == 9) {
                            class417 var46;
                            if (!var24) {
                                var46 = new class305(arg1, var12, arg10, arg8, var21, var20, var22, super.field189, arg7, arg7 - 1 + var13, arg0, var14 + -1 + arg0, arg4, arg3, arg5);
                            } else {
                                class331 var47 = new class331(arg1, var12, arg10, arg8, var21, var20, var22, super.field189, arg7, arg7, arg0, arg0, arg4, arg3, var23);
                                var46 = var47;
                                if (var47.method8(115)) {
                                    var47.method15(-13300, arg1);
                                }
                            }
                            class417 var48 = class367.method2294(arg10, arg7, arg0, field1478 != null ? field1478 : (field1478 = method662("pa")));
                            if (var48 instanceof class65 && var48.field6231 == arg7 && ~var48.field6238 == ~arg0) {
                                ((class65) var48).field1109 = var46;
                            } else {
                                class84.method651(var46, false);
                            }
                            if (~var12.field1381 != -1 && arg6 != null) {
                                arg6.method1734(false, !var12.field1362, var14, var13, arg0, var12.field1372, arg7);
                            }
                            if (var12.field1337 != 16) {
                                class348.method2211(arg10, arg7, arg0, var12.field1337);
                            }
                        } else if (arg4 == 4) {
                            class506 var49;
                            if (!var24) {
                                var49 = new class369(arg1, var12, arg10, arg8, var21, var20, var22, super.field189, 0, 0, 0, arg4, arg3, arg5);
                            } else {
                                class339 var50 = new class339(arg1, var12, arg8, var21, var20, var22, super.field189, 0, 0, 0, arg4, arg3);
                                if (var50.method8(109)) {
                                    var50.method15(-13300, arg1);
                                }
                                var49 = var50;
                            }
                            class506 var51 = class462.method2745(arg10, arg7, arg0);
                            if (var51 instanceof class36) {
                                ((class36) var51).field697 = var49;
                            } else {
                                class26.method318(arg10, arg7, arg0, var49, (class506) null);
                            }
                        } else if (arg2 == arg4) {
                            int var52 = 17;
                            class248 var53 = (class248) class310.method2028(arg10, arg7, arg0);
                            if (var53 != null) {
                                var52 = 1 + class319.field4807.method2874(var53.method17((byte) -115), -17045).field1337;
                            }
                            class506 var54;
                            if (!var24) {
                                var54 = new class369(arg1, var12, arg10, arg8, var21, var20, var22, super.field189, 0, class239.field3437[arg3] * var52, class353.field5406[arg3] * var52, arg4, arg3, arg5);
                            } else {
                                class339 var55 = new class339(arg1, var12, arg8, var21, var20, var22, super.field189, 0, class239.field3437[arg3] * var52, class353.field5406[arg3] * var52, arg4, arg3);
                                var54 = var55;
                                if (var55.method8(102)) {
                                    var55.method15(-13300, arg1);
                                }
                            }
                            class506 var56 = class462.method2745(arg10, arg7, arg0);
                            if (!(var56 instanceof class36)) {
                                class26.method318(arg10, arg7, arg0, var54, (class506) null);
                            } else {
                                ((class36) var56).field697 = var54;
                            }
                        } else if (~arg4 == -7) {
                            int var57 = 9;
                            class248 var58 = (class248) class310.method2028(arg10, arg7, arg0);
                            if (var58 != null) {
                                var57 = 1 + class319.field4807.method2874(var58.method17((byte) 29), -17045).field1337 / 2;
                            }
                            class506 var60;
                            if (var24) {
                                class339 var59 = new class339(arg1, var12, arg8, var21, var20, var22, super.field189, arg3, class239.field3437[arg3] * var57, class353.field5406[arg3] * var57, arg4, arg3 + 4);
                                var60 = var59;
                                if (var59.method8(111)) {
                                    var59.method15(-13300, arg1);
                                }
                            } else {
                                var60 = new class369(arg1, var12, arg10, arg8, var21, var20, var22, super.field189, arg3, class453.field6773[arg3] * var57, class341.field5148[arg3] * var57, arg4, arg3 + 4, arg5);
                            }
                            class506 var61 = class462.method2745(arg10, arg7, arg0);
                            if (var61 instanceof class36) {
                                ((class36) var61).field697 = var60;
                            } else {
                                class26.method318(arg10, arg7, arg0, var60, (class506) null);
                            }
                        } else if (~arg4 == -8) {
                            int var62 = arg3 + 2 & 3;
                            class506 var63;
                            if (!var24) {
                                var63 = new class369(arg1, var12, arg10, arg8, var21, var20, var22, super.field189, var62, 0, 0, arg4, var62 + 4, arg5);
                            } else {
                                class339 var64 = new class339(arg1, var12, arg8, var21, var20, var22, super.field189, var62, 0, 0, arg4, var62 + 4);
                                if (var64.method8(126)) {
                                    var64.method15(-13300, arg1);
                                }
                                var63 = var64;
                            }
                            class506 var65 = class462.method2745(arg10, arg7, arg0);
                            if (var65 instanceof class36) {
                                ((class36) var65).field697 = var63;
                            } else {
                                class26.method318(arg10, arg7, arg0, var63, (class506) null);
                            }
                        } else if (arg4 == 8) {
                            int var66 = 3 & arg3 - -2;
                            int var67 = 9;
                            class248 var68 = (class248) class310.method2028(arg10, arg7, arg0);
                            if (var68 != null) {
                                var67 = class319.field4807.method2874(var68.method17((byte) -100), -17045).field1337 / 2 - -1;
                            }
                            class506 var71;
                            class506 var72;
                            if (var24) {
                                class339 var69 = new class339(arg1, var12, arg8, var21, var20, var22, super.field189, arg3, class453.field6773[arg3] * var67, class341.field5148[arg3] * var67, arg4, arg3 + 4);
                                class339 var70 = new class339(arg1, var12, arg8, var21, var20, var22, super.field189, arg3, 0, 0, arg4, var66 - -4);
                                if (var69.method8(arg2 ^ 110)) {
                                    var69.method15(-13300, arg1);
                                }
                                if (var70.method8(arg2 + 109)) {
                                    var70.method15(-13300, arg1);
                                }
                                var71 = var69;
                                var72 = var70;
                            } else {
                                class369 var73 = new class369(arg1, var12, arg10, arg8, var21, var20, var22, super.field189, arg3, class453.field6773[arg3] * var67, class341.field5148[arg3] * var67, arg4, arg3 + 4, arg5);
                                var71 = var73;
                                class369 var74 = new class369(arg1, var12, arg10, arg8, var21, var20, var22, super.field189, arg3, 0, 0, arg4, var66 - -4, arg5);
                                var72 = var74;
                            }
                            class26.method318(arg10, arg7, arg0, var71, var72);
                        }
                    } else {
                        class331 var75 = null;
                        class417 var77;
                        int var78;
                        if (var24) {
                            class331 var76 = new class331(arg1, var12, arg10, arg8, var21, var20, var22, super.field189, arg7, arg7 + var13 + -1, arg0, arg0 + -1 + var14, arg4, arg3, var23);
                            var77 = var76;
                            var78 = var76.method2125(0);
                            var75 = var76;
                        } else {
                            var77 = new class305(arg1, var12, arg10, arg8, var21, var20, var22, super.field189, arg7, arg7 + var13 + -1, arg0, arg0 + var14 + -1, arg4, arg3, arg5);
                            var78 = 15;
                        }
                        class417 var79 = class367.method2294(arg10, arg7, arg0, field1478 != null ? field1478 : (field1478 = method662("pa")));
                        boolean var80 = false;
                        if (var79 instanceof class65 && var79.field6231 == arg7 && var79.field6238 == arg0) {
                            ((class65) var79).field1109 = var77;
                            var80 = true;
                        }
                        if (var80 || class84.method651(var77, false)) {
                            if (var75 != null && var75.method8(103)) {
                                var75.method15(-13300, arg1);
                            }
                            if (var12.field1325 && class462.field6925) {
                                if (var78 > 30) {
                                    var78 = 30;
                                }
                                for (int var81 = 0; ~var13 <= ~var81; ++var81) {
                                    for (int var82 = 0; var14 >= var82; ++var82) {
                                        var19.method373(arg7 + var81, arg0 + var82, var78);
                                    }
                                }
                            }
                        }
                        if (~var12.field1381 != -1 && arg6 != null) {
                            arg6.method1734(false, !var12.field1362, var14, var13, arg0, var12.field1372, arg7);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(I[Lbr;II[BIIILqa;II)V")
    public final void method660(int arg0, class268[] arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, class162 arg8, int arg9, int arg10) {
        ++field1472;
        class145 var12 = new class145(arg4);
        int var13 = -1;
        while (true) {
            int var14 = var12.method1073((byte) 97);
            if (var14 == 0) {
                if (arg10 > -120) {
                    this.method653(-123, (class268) null, (class162) null, 18, 60, (byte) -128, 88);
                    return;
                }
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method1119(61);
                if (var16 == 0) {
                    break;
                }
                var15 += var16 + -1;
                int var17 = var15 & 63;
                int var18 = (4068 & var15) >> 6;
                int var19 = var15 >> 12;
                int var20 = var12.method1063((byte) -14);
                int var21 = var20 >> 2;
                int var22 = var20 & 3;
                if (arg0 == var19 && ~var18 <= ~arg2 && ~(arg2 + 8) < ~var18 && ~arg6 >= ~var17 && ~var17 > ~(arg6 + 8)) {
                    class79 var23 = class319.field4807.method2874(var13, -17045);
                    int var24 = arg3 + class421.method2546(arg5, var23.field1345, 0, var18 & 7, var23.field1384, var22, 7 & var17);
                    int var25 = class500.method2996(var22, var23.field1345, var18 & 7, true, arg5, var17 & 7, var23.field1384) + arg7;
                    if (var24 > 0 && var25 > 0 && super.field195 - 1 > var24 && super.field194 + -1 > var25) {
                        class268 var26 = null;
                        if (!super.field189) {
                            int var27 = arg9;
                            if ((class260.field3784[1][var24][var25] & 2) == 2) {
                                var27 = arg9 - 1;
                            }
                            if (~var27 <= -1) {
                                var26 = arg1[var27];
                            }
                        }
                        this.method659(var25, arg8, 5, 3 & arg5 + var22, var21, -1, var26, var24, arg9, var13, arg9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IIIIIZZ)V")
    public static final void method661(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        class426.field6345 = arg0;
        class177.field2697 = 1 << class426.field6345;
        class130.field2075 = class177.field2697 >> 1;
        class8.field138 = (int) Math.sqrt((double) (class130.field2075 * class130.field2075 + class130.field2075 * class130.field2075));
        class350.field5379 = class177.field2697 >> 2;
        class3.field104 = class177.field2697;
        class151.field2408 = arg2;
        class261.field3792 = arg3;
        class369.field5579 = arg4;
        class40.field733 = new class429[arg1][class151.field2408][class261.field3792];
        class43.field829 = new class35[arg1];
        if (arg5) {
            class98.field1633 = new int[class151.field2408][class261.field3792];
            class407.field6111 = new byte[class151.field2408][class261.field3792];
            class360.field5465 = new byte[class151.field2408][class261.field3792];
            class268.field3870 = new class429[1][class151.field2408][class261.field3792];
            class335.field5061 = new class35[1];
        } else {
            class98.field1633 = null;
            class407.field6111 = null;
            class360.field5465 = null;
            class268.field3870 = null;
            class335.field5061 = null;
        }
        if (arg6) {
            class217.field3128 = new long[arg1][arg2][arg3];
            class448.field6723 = new class459[65535];
            class54.field940 = new boolean[65535];
            class161.field2494 = 0;
        } else {
            class217.field3128 = null;
            class448.field6723 = null;
            class54.field940 = null;
            class161.field2494 = 0;
        }
        class102.method763(false);
        field1468 = new class531[1000];
        class441.field6585 = 0;
        class501.field7390 = new class531[1000];
        class492.field7279 = 0;
        class504.field7445 = new int[arg1][class151.field2408 + 1][class261.field3792 + 1];
        class123.field1993 = new class417[5000];
        class256.field3696 = 0;
        class62.field1078 = new boolean[class369.field5579 + class369.field5579 + 1][class369.field5579 + class369.field5579 + 1];
        class20.field352 = new boolean[class369.field5579 + class369.field5579 + 2][class369.field5579 + class369.field5579 + 2];
        class318.field4777 = null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method662(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class342("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
    }
}
