import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class83 extends class77 {

    @OriginalMember(owner = "client!dv", name = "L", descriptor = "I")
    public int field1446 = 99;

    @OriginalMember(owner = "client!dv", name = "S", descriptor = "Lvv;")
    public static class313 field1453 = new class313(35, -1);

    @OriginalMember(owner = "client!dv", name = "T", descriptor = "Lvv;")
    public static class313 field1454 = new class313(36, 14);

    @OriginalMember(owner = "client!dv", name = "X", descriptor = "[B")
    public static byte[] field1458 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!dv", name = "M", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!dv", name = "N", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!dv", name = "O", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!dv", name = "P", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!dv", name = "Q", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!dv", name = "R", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!dv", name = "U", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!dv", name = "V", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!dv", name = "W", descriptor = "I")
    public static int field1457;

    // $FF: synthetic field
    @OriginalMember(owner = "client!dv", name = "Y", descriptor = "Ljava/lang/Class;")
    public static Class field1459;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(ILza;)V")
    public final void method595(int arg0, class491 arg1) {
        class42.method311(arg1);
        ++field1451;
        if (super.field1321 > 1) {
            for (int var3 = 0; var3 < super.field1331; ++var3) {
                for (int var4 = 0; ~var4 > ~super.field1339; ++var4) {
                    if (~(2 & class192.field2982[1][var3][var4]) == -3) {
                        class115.method924(var3, var4);
                    }
                }
            }
        }
        for (int var5 = 0; ~super.field1321 < ~var5; ++var5) {
            for (int var6 = 0; ~var6 >= ~super.field1339; ++var6) {
                for (int var7 = 0; ~super.field1331 <= ~var7; ++var7) {
                    if ((1 & super.field1330[var5][var7][var6]) != 0) {
                        int var8 = var6;
                        int var9 = var6;
                        int var10 = var5;
                        while (var8 > 0 && ~(super.field1330[var5][var7][var8 + -1] & 1) != -1) {
                            --var8;
                        }
                        while (super.field1339 > var9 && (1 & super.field1330[var5][var7][var9 + 1]) != 0) {
                            ++var9;
                        }
                        int var11 = var5;
                        label172: while (~var10 < -1) {
                            for (int var12 = var8; var9 >= var12; ++var12) {
                                if (~(1 & super.field1330[var10 + -1][var7][var12]) == -1) {
                                    break label172;
                                }
                            }
                            --var10;
                        }
                        label161: while (var11 < 3) {
                            for (int var13 = var8; var13 <= var9; ++var13) {
                                if ((1 & super.field1330[var11 + 1][var7][var13]) == 0) {
                                    break label161;
                                }
                            }
                            ++var11;
                        }
                        int var14 = (-var10 + var11 - -1) * (-var8 + var9 + 1);
                        if (~var14 <= -3) {
                            short var15 = 240;
                            int var16 = super.field1348[var11][var7][var8] + -var15;
                            int var17 = super.field1348[var10][var7][var8];
                            class431.method2622(1, var7 << 7, var7 << 7, var8 << 7, (var9 << 7) + 128, var16, var17);
                            for (int var18 = var10; var18 <= var11; ++var18) {
                                for (int var19 = var8; ~var19 >= ~var9; ++var19) {
                                    super.field1330[var18][var7][var19] = (byte) class344.method2224(super.field1330[var18][var7][var19], -2);
                                }
                            }
                        }
                    }
                    if ((super.field1330[var5][var7][var6] & 2) != 0) {
                        int var20 = var7;
                        int var21 = var7;
                        int var22 = var5;
                        while (~super.field1331 < ~var21 && ~(2 & super.field1330[var5][var21 + 1][var6]) != -1) {
                            ++var21;
                        }
                        while (var20 > 0 && ~(2 & super.field1330[var5][var20 + -1][var6]) != -1) {
                            --var20;
                        }
                        int var23 = var5;
                        label226: while (~var22 < -1) {
                            for (int var24 = var20; var24 <= var21; ++var24) {
                                if (~(2 & super.field1330[var22 + -1][var24][var6]) == -1) {
                                    break label226;
                                }
                            }
                            --var22;
                        }
                        label215: while (var23 < 3) {
                            for (int var25 = var20; ~var21 <= ~var25; ++var25) {
                                if ((2 & super.field1330[var23 + 1][var25][var6]) == 0) {
                                    break label215;
                                }
                            }
                            ++var23;
                        }
                        int var26 = (var21 + 1 - var20) * (var23 + 1 + -var22);
                        if (~var26 <= -3) {
                            short var27 = 240;
                            int var28 = super.field1348[var23][var20][var6] + -var27;
                            int var29 = super.field1348[var22][var20][var6];
                            class431.method2622(2, var20 << 7, (var21 << 7) - -128, var6 << 7, var6 << 7, var28, var29);
                            for (int var30 = var22; var23 >= var30; ++var30) {
                                for (int var31 = var20; ~var31 >= ~var21; ++var31) {
                                    super.field1330[var30][var31][var6] = (byte) class344.method2224(super.field1330[var30][var31][var6], -3);
                                }
                            }
                        }
                    }
                    if ((super.field1330[var5][var7][var6] & 4) != 0) {
                        int var32 = var7;
                        int var33 = var7;
                        int var34;
                        for (var34 = var6; ~var34 < -1 && ~(4 & super.field1330[var5][var7][var34 + -1]) != -1; --var34) {
                        }
                        int var35;
                        for (var35 = var6; var35 < super.field1339 && (4 & super.field1330[var5][var7][var35 + 1]) != 0; ++var35) {
                        }
                        label280: while (~var32 < -1) {
                            for (int var36 = var34; var36 <= var35; ++var36) {
                                if ((super.field1330[var5][var32 + -1][var36] & 4) == 0) {
                                    break label280;
                                }
                            }
                            --var32;
                        }
                        label269: while (~var33 > ~super.field1331) {
                            for (int var37 = var34; var37 <= var35; ++var37) {
                                if (~(super.field1330[var5][var33 + 1][var37] & 4) == -1) {
                                    break label269;
                                }
                            }
                            ++var33;
                        }
                        if ((-var34 + var35 - -1) * (-var32 + var33 + 1) >= 4) {
                            int var38 = super.field1348[var5][var32][var34];
                            class431.method2622(4, var32 << 7, (var33 << 7) - -128, var34 << 7, (var35 << 7) - -128, var38, var38);
                            for (int var39 = var32; ~var33 <= ~var39; ++var39) {
                                for (int var40 = var34; var40 <= var35; ++var40) {
                                    super.field1330[var5][var39][var40] = (byte) class344.method2224(super.field1330[var5][var39][var40], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
        super.field1330 = null;
        if (arg0 != 1727080551) {
            this.method599(-63, 51, -103, (class251[]) null, (class491) null, -22, 57, -62, 33, -94, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(Lza;I[IILia;I)V")
    public final void method596(class491 arg0, int arg1, int[] arg2, int arg3, class23 arg4, int arg5) {
        ++field1450;
        if (!super.field1319) {
            if (arg1 != 22700) {
                field1454 = null;
            }
            boolean var7 = false;
            class284 var8 = null;
            if (arg2 != null) {
                arg2[0] = -1;
            }
            while (true) {
                while (true) {
                    while (true) {
                        while (true) {
                            while (~arg4.field302.length < ~arg4.field301) {
                                int var18 = arg4.method126((byte) -72);
                                if (var18 != 0) {
                                    if (~var18 != -2) {
                                        if (~var18 != -3) {
                                            if (~var18 == -129) {
                                                if (arg2 == null) {
                                                    arg4.field301 += 10;
                                                } else {
                                                    arg2[0] = arg4.method132(104);
                                                    arg2[1] = arg4.method170(492756037);
                                                    arg2[2] = arg4.method170(492756037);
                                                    arg2[3] = arg4.method170(492756037);
                                                    arg2[4] = arg4.method132(65);
                                                }
                                            } else {
                                                if (~var18 != -130) {
                                                    throw new IllegalStateException("");
                                                }
                                                if (super.field1328 == null) {
                                                    super.field1328 = new byte[4][][];
                                                }
                                                var7 = true;
                                                for (int var19 = 0; var19 < 4; ++var19) {
                                                    byte var20 = arg4.method167(-2);
                                                    if (~var20 == -1 && super.field1328[var19] != null) {
                                                        int var21 = arg5;
                                                        int var22 = arg5 - -64;
                                                        int var23 = arg3;
                                                        if (~arg5 > -1) {
                                                            var21 = 0;
                                                        } else if (~super.field1331 >= ~arg5) {
                                                            var21 = super.field1331;
                                                        }
                                                        if (~var22 <= -1) {
                                                            if (~var22 <= ~super.field1331) {
                                                                var22 = super.field1331;
                                                            }
                                                        } else {
                                                            var22 = 0;
                                                        }
                                                        int var24 = arg3 + 64;
                                                        if (arg3 < 0) {
                                                            var23 = 0;
                                                        } else if (arg3 >= super.field1339) {
                                                            var23 = super.field1339;
                                                        }
                                                        if (~var24 <= -1) {
                                                            if (super.field1339 <= var24) {
                                                                var24 = super.field1339;
                                                            }
                                                        } else {
                                                            var24 = 0;
                                                        }
                                                        while (var21 < var22) {
                                                            while (var24 > var23) {
                                                                super.field1328[var19][var21][var23] = 0;
                                                                ++var23;
                                                            }
                                                            ++var21;
                                                        }
                                                    } else if (~var20 != -2) {
                                                        if (~var20 == -3) {
                                                            if (super.field1328[var19] == null) {
                                                                super.field1328[var19] = new byte[super.field1331 + 1][super.field1339 + 1];
                                                            }
                                                            if (var19 > 0) {
                                                                int var25 = arg5;
                                                                int var26 = arg5 + 64;
                                                                int var27 = arg3;
                                                                int var28 = arg3 + 64;
                                                                if (arg3 < 0) {
                                                                    var27 = 0;
                                                                } else if (super.field1339 <= arg3) {
                                                                    var27 = super.field1339;
                                                                }
                                                                if (~var26 > -1) {
                                                                    var26 = 0;
                                                                } else if (~super.field1331 >= ~var26) {
                                                                    var26 = super.field1331;
                                                                }
                                                                if (~arg5 <= -1) {
                                                                    if (~arg5 <= ~super.field1331) {
                                                                        var25 = super.field1331;
                                                                    }
                                                                } else {
                                                                    var25 = 0;
                                                                }
                                                                if (var28 < 0) {
                                                                    var28 = 0;
                                                                } else if (~super.field1339 >= ~var28) {
                                                                    var28 = super.field1339;
                                                                }
                                                                while (~var25 > ~var26) {
                                                                    while (~var28 < ~var27) {
                                                                        super.field1328[var19][var25][var27] = super.field1328[var19 + -1][var25][var27];
                                                                        ++var27;
                                                                    }
                                                                    ++var25;
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        if (super.field1328[var19] == null) {
                                                            super.field1328[var19] = new byte[super.field1331 - -1][super.field1339 + 1];
                                                        }
                                                        for (int var29 = 0; ~var29 > -65; var29 += 4) {
                                                            for (int var30 = 0; ~var30 > -65; var30 += 4) {
                                                                byte var31 = arg4.method167(-2);
                                                                for (int var32 = var29 - -arg5; var32 < arg5 + var29 + 4; ++var32) {
                                                                    for (int var33 = arg3 + var30; var30 - -4 + arg3 > var33; ++var33) {
                                                                        if (var32 >= 0 && ~super.field1331 < ~var32 && var33 >= 0 && ~var33 > ~super.field1339) {
                                                                            super.field1328[var19][var32][var33] = var31;
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
                                                var8 = new class284();
                                            }
                                            var8.method1853(-1, arg4);
                                        }
                                    } else {
                                        int var34 = arg4.method126((byte) -75);
                                        if (var34 > 0) {
                                            for (int var35 = 0; ~var35 > ~var34; ++var35) {
                                                class429 var36 = new class429(arg0, arg4, 0);
                                                if (~var36.field6427 == -32) {
                                                    class469 var37 = class343.field5367.method406(arg4.method132(36), 9869);
                                                    var36.method2614(var37.field6961, (byte) 106, var37.field6963, var37.field6959, var37.field6962);
                                                }
                                                if (arg0.method883() > 0) {
                                                    class450 var38 = var36.field6429;
                                                    int var39 = (arg5 << 7) + var38.method2700(false);
                                                    int var40 = var38.method2696((byte) 123) - -(arg3 << 7);
                                                    int var41 = var39 >> 7;
                                                    int var42 = var40 >> 7;
                                                    if (~var41 <= -1 && var42 >= 0 && var41 < super.field1331 && ~var42 > ~super.field1339) {
                                                        var38.method1111(var40, (byte) -96, super.field1348[var36.field6440][var41][var42] - var38.method2697(124), var39);
                                                        class508.method2988(var36);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    var8 = new class284(arg4);
                                }
                            }
                            if (var8 != null) {
                                for (int var9 = 0; var9 < 8; ++var9) {
                                    for (int var10 = 0; var10 < 8; ++var10) {
                                        int var11 = (arg5 >> 3) + var9;
                                        int var12 = (arg3 >> 3) - -var10;
                                        if (~var11 <= -1 && super.field1331 >> 3 > var11 && var12 >= 0 && super.field1339 >> 3 > var12) {
                                            class70.method491(var8, var12, arg1 + -22694, var11);
                                        }
                                    }
                                }
                            }
                            if (!var7 && super.field1328 != null) {
                                for (int var13 = 0; var13 < 4; ++var13) {
                                    if (super.field1328[var13] != null) {
                                        for (int var14 = 0; ~var14 > -17; ++var14) {
                                            for (int var15 = 0; ~var15 > -17; ++var15) {
                                                int var16 = (arg5 >> 2) + var14;
                                                int var17 = (arg3 >> 2) + var15;
                                                if (var16 >= 0 && var16 < 26 && ~var17 <= -1 && var17 < 26) {
                                                    super.field1328[var13][var16][var17] = 0;
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

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(ILza;[BII[Lir;)V")
    public final void method597(int arg0, class491 arg1, byte[] arg2, int arg3, int arg4, class251[] arg5) {
        if (arg4 != 27401) {
            field1457 = 64;
        }
        ++field1456;
        class23 var7 = new class23(arg2);
        int var8 = -1;
        while (true) {
            int var9 = var7.method179(-72);
            if (~var9 == -1) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method123(false);
                if (~var11 == -1) {
                    break;
                }
                var10 += var11 + -1;
                int var12 = var10 & 63;
                int var13 = (4086 & var10) >> 6;
                int var14 = var10 >> 12;
                int var15 = var7.method126((byte) -102);
                int var16 = var15 >> 2;
                int var17 = var15 & 3;
                int var18 = var13 - -arg3;
                int var19 = arg0 + var12;
                if (~var18 < -1 && var19 > 0 && var18 < super.field1331 + -1 && var19 < super.field1339 + -1) {
                    class251 var20 = null;
                    if (!super.field1319) {
                        int var21 = var14;
                        if (~(2 & class192.field2982[1][var18][var19]) == -3) {
                            var21 = var14 - 1;
                        }
                        if (var21 >= 0) {
                            var20 = arg5[var21];
                        }
                    }
                    this.method602(var14, var8, var17, -1, var16, -77, var19, arg1, var18, var20, var14);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "(I)V")
    public static final void method598(int arg0) {
        class261.field4357.method152(class362.field5635.method2918((byte) 1), (byte) -38);
        ++field1447;
        class261.field4357.method152(class374.field5817.method2918((byte) 1), (byte) -38);
        class261.field4357.method152(class487.field7132.method2918((byte) 1), (byte) -38);
        class261.field4357.method152(class480.field7081.method2918((byte) 1), (byte) -38);
        class261.field4357.method152(class471.field6971.method2918((byte) 1), (byte) -38);
        class261.field4357.method152(class388.field5971.method2918((byte) 1), (byte) -38);
        class261.field4357.method152(class29.field472.method2918((byte) 1), (byte) -38);
        class261.field4357.method152(class81.field1407.method2918((byte) 1), (byte) -38);
        class261.field4357.method152(class536.field7881.method2918((byte) 1), (byte) -38);
        class261.field4357.method152(class205.field3246.method2918((byte) 1), (byte) -38);
        class261.field4357.method152(class467.field6939.method2918((byte) 1), (byte) -38);
        class261.field4357.method152(class226.field3886.method2918((byte) 1), (byte) -38);
        class261.field4357.method152(class488.field7142.method2918((byte) 1), (byte) -38);
        class261.field4357.method152(class147.field2392.method2918((byte) 1), (byte) -38);
        class261.field4357.method152(class298.field4799.method2918((byte) 1), (byte) -38);
        class261.field4357.method152(class316.field4978.method2918((byte) 1), (byte) -38);
        class261.field4357.method152(class82.field1445.method2918((byte) 1), (byte) -38);
        class261.field4357.method152(class536.field7870.method2918((byte) 1), (byte) -38);
        class261.field4357.method152(class18.field198.method2918((byte) 1), (byte) -38);
        class261.field4357.method152(class490.field7161.method2918((byte) 1), (byte) -38);
        class261.field4357.method152(class388.field5969.method2918((byte) 1), (byte) -38);
        class261.field4357.method152(class516.field7627.method2918((byte) 1), (byte) -38);
        if (arg0 >= -52) {
            field1457 = 120;
        }
        class261.field4357.method152(class451.field6719.method2918((byte) 1), (byte) -38);
        class261.field4357.method152(class208.field3292.method2918((byte) 1), (byte) -38);
        class261.field4357.method152(class358.field5574.method2918((byte) 1), (byte) -38);
        class261.field4357.method152(class236.field4087.method2918((byte) 1), (byte) -38);
        class261.field4357.method152(class191.field2968.method2918((byte) 1), (byte) -38);
        class261.field4357.method152(class177.field2803.method2918((byte) 1), (byte) -38);
        class261.field4357.method152(class362.field5639.method2918((byte) 1), (byte) -38);
        class261.field4357.method152(class295.field4754.method2918((byte) 1), (byte) -38);
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(III[Lir;Lza;IIIII[B)V")
    public final void method599(int arg0, int arg1, int arg2, class251[] arg3, class491 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, byte[] arg10) {
        ++field1448;
        if (arg6 != 7) {
            this.method599(111, 87, 55, (class251[]) null, (class491) null, -79, 86, 6, -26, -101, (byte[]) null);
        }
        class23 var12 = new class23(arg10);
        int var13 = -1;
        while (true) {
            int var14 = var12.method179(-107);
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method123(false);
                if (var16 == 0) {
                    break;
                }
                var15 += var16 + -1;
                int var17 = 63 & var15;
                int var18 = (4046 & var15) >> 6;
                int var19 = var15 >> 12;
                int var20 = var12.method126((byte) -86);
                int var21 = var20 >> 2;
                int var22 = 3 & var20;
                if (arg1 == var19 && ~var18 <= ~arg0 && ~var18 > ~(arg0 + 8) && ~arg9 >= ~var17 && var17 < arg9 + 8) {
                    class39 var23 = class61.field928.method791(var13, true);
                    int var24 = class116.method929(-126, arg8, var23.field611, var18 & 7, var22, var17 & 7, var23.field647) + arg5;
                    int var25 = class525.method3106(var23.field647, var22, var23.field611, var18 & 7, arg8, -13930, var17 & 7) + arg7;
                    if (~var24 < -1 && var25 > 0 && var24 < super.field1331 + -1 && super.field1339 + -1 > var25) {
                        class251 var26 = null;
                        if (!super.field1319) {
                            int var27 = arg2;
                            if (~(class192.field2982[1][var24][var25] & 2) == -3) {
                                var27 = arg2 - 1;
                            }
                            if (var27 >= 0) {
                                var26 = arg3[var27];
                            }
                        }
                        this.method602(arg2, var13, 3 & arg8 + var22, -1, var21, 114, var25, arg4, var24, var26, arg2);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(Lza;IILir;ZII)V")
    public final void method600(class491 arg0, int arg1, int arg2, class251 arg3, boolean arg4, int arg5, int arg6) {
        ++field1449;
        class518 var8 = null;
        if (arg1 == 0) {
            var8 = (class518) class134.method1018(arg6, arg2, arg5);
        }
        if (~arg1 == -2) {
            var8 = (class518) class158.method1103(arg6, arg2, arg5);
        }
        if (arg1 == 2) {
            var8 = (class518) class491.method2868(arg6, arg2, arg5, field1459 != null ? field1459 : (field1459 = method604("jg")));
        }
        if (arg4) {
            this.method599(-49, -103, 8, (class251[]) null, (class491) null, -101, 121, -59, 115, 71, (byte[]) null);
        }
        if (~arg1 == -4) {
            var8 = (class518) class373.method2346(arg6, arg2, arg5);
        }
        if (var8 != null) {
            class39 var9 = class61.field928.method791(var8.method28((byte) -118), true);
            int var10 = var8.method29(126);
            int var11 = var8.method38(5638);
            if (var9.method297(160)) {
                class316.method2004((byte) 11, arg2, var9, arg6, arg5);
            }
            if (var8.method33((byte) 83)) {
                var8.method34(25747, arg0);
            }
            if (arg1 == 0) {
                class218 var12 = class134.method1018(arg6, arg2, arg5);
                if (var12 instanceof class435) {
                    ((class435) var12).field6487 = null;
                } else {
                    class483.method2835(arg6, arg2, arg5);
                }
                if (~var9.field614 != -1) {
                    arg3.method1707(!var9.field644, var9.field658, var10, true, arg2, var11, arg5);
                    return;
                }
            } else if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 == -4) {
                        class125 var13 = class373.method2346(arg6, arg2, arg5);
                        if (!(var13 instanceof class208)) {
                            class208.method1359(arg6, arg2, arg5);
                        } else {
                            ((class208) var13).field3276 = null;
                        }
                        if (~var9.field614 == -2) {
                            arg3.method1702(arg2, (byte) 112, arg5);
                            return;
                        }
                    }
                    return;
                }
                class290 var14 = class491.method2868(arg6, arg2, arg5, field1459 != null ? field1459 : (field1459 = method604("jg")));
                if (var14 instanceof class193 && var14.field4718 == arg2 && ~var14.field4717 == ~arg5) {
                    ((class193) var14).field2996 = null;
                } else {
                    class335.method2117(arg6, arg2, arg5, field1459 != null ? field1459 : (field1459 = method604("jg")));
                }
                if (~var9.field614 != -1 && super.field1331 > var9.field611 + arg2 && ~(var9.field611 + arg5) > ~super.field1339 && ~super.field1331 < ~(arg2 - -var9.field647) && ~(arg5 - -var9.field647) > ~super.field1339) {
                    arg3.method1709(var11, var9.field658, arg2, -94, arg5, !var9.field644, var9.field647, var9.field611);
                    return;
                }
            } else {
                class192 var15 = class158.method1103(arg6, arg2, arg5);
                if (!(var15 instanceof class37)) {
                    class94.method661(arg6, arg2, arg5);
                    return;
                }
                ((class37) var15).field550 = null;
            }
        }
    }

    @OriginalMember(owner = "client!dv", name = "d", descriptor = "(I)V")
    public static void method601(int arg0) {
        field1458 = null;
        field1453 = null;
        if (arg0 != 1) {
            field1454 = null;
        }
        field1454 = null;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(IIIIIIILza;ILir;I)V")
    public final void method602(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class491 arg7, int arg8, class251 arg9, int arg10) {
        ++field1452;
        if (class510.field7403.method1188(class511.field7485, -117) || class5.method18(arg10, 87, arg8, class229.field3994, arg6)) {
            if (this.field1446 > arg0) {
                this.field1446 = arg0;
            }
            class39 var12 = class61.field928.method791(arg1, true);
            if (!arg7.method912() || !class510.field7403.field5125 || !var12.field616) {
                int var13;
                int var14;
                if (~arg2 != -2 && arg2 != 3) {
                    var13 = var12.field611;
                    var14 = var12.field647;
                } else {
                    var14 = var12.field611;
                    var13 = var12.field647;
                }
                int var15;
                int var16;
                if (super.field1331 >= arg8 + var13) {
                    var15 = (var13 >> 1) + arg8;
                    var16 = (var13 + 1 >> 1) + arg8;
                } else {
                    var15 = arg8;
                    var16 = arg8 + 1;
                }
                int var17;
                int var18;
                if (~(arg6 - -var14) >= ~super.field1339) {
                    var17 = (var14 >> 1) + arg6;
                    var18 = (var14 + 1 >> 1) + arg6;
                } else {
                    var18 = arg6 - -1;
                    var17 = arg6;
                }
                class220 var19 = class360.field5592[arg10];
                int var20 = var19.method1516(var15, var17) + var19.method1516(var16, var17) - -var19.method1516(var15, var18) + var19.method1516(var16, var18) >> 2;
                int var21 = (arg8 << 7) + (var13 << 6);
                int var22 = (arg6 << 7) + (var14 << 6);
                boolean var23 = class129.field2225 && !super.field1319 && var12.field646;
                if (var12.method297(160)) {
                    class465.method2768(arg0, (byte) -122, (class166) null, arg2, var12, arg8, (class265) null, arg6);
                }
                boolean var24 = ~arg3 == 0 && var12.field659 == -1 && var12.field608 == null && var12.field575 == null && !var12.field580;
                if (!class205.field3245 || (!class460.method2742(arg4, -107) || ~var12.field593 == -2) && (!class189.method1279(arg4, -18) || ~var12.field593 != -1)) {
                    if (~arg4 == -23) {
                        if (class510.field7403.field5118 || var12.field618 != 0 || ~var12.field614 == -2 || var12.field643) {
                            class125 var26;
                            if (var24) {
                                class375 var25 = new class375(arg7, var12, arg10, var21, var20, var22, super.field1319, arg2, var23);
                                if (var25.method33((byte) -63)) {
                                    var25.method26((byte) 111, arg7);
                                }
                                var26 = var25;
                            } else {
                                var26 = new class6(arg7, var12, arg0, arg10, var21, var20, var22, super.field1319, arg2, arg3);
                            }
                            class125 var27 = class373.method2346(arg0, arg8, arg6);
                            if (var27 instanceof class208) {
                                ((class208) var27).field3276 = var26;
                            } else {
                                class389.method2434(arg0, arg8, arg6, var26);
                            }
                            if (var12.field614 == 1 && arg9 != null) {
                                arg9.method1713(arg8, 262144, arg6);
                            }
                        }
                    } else if (~arg4 != -11 && ~arg4 != -12) {
                        if (arg4 >= 12 && arg4 <= 17 || ~arg4 <= -19 && ~arg4 >= -22) {
                            class290 var29;
                            if (var24) {
                                class361 var28 = new class361(arg7, var12, arg0, arg10, var21, var20, var22, super.field1319, arg8, var13 + -1 + arg8, arg6, arg6 + var14 - 1, arg4, arg2, var23);
                                if (var28.method33((byte) 109)) {
                                    var28.method26((byte) 111, arg7);
                                }
                                var29 = var28;
                            } else {
                                var29 = new class438(arg7, var12, arg0, arg10, var21, var20, var22, super.field1319, arg8, arg8 - -var13 - 1, arg6, arg6 + var14 + -1, arg4, arg2, arg3);
                            }
                            class290 var30 = class491.method2868(arg0, arg8, arg6, field1459 != null ? field1459 : (field1459 = method604("jg")));
                            if (var30 instanceof class193 && var30.field4718 == arg8 && var30.field4717 == arg6) {
                                ((class193) var30).field2996 = var29;
                            } else {
                                class177.method1198(var29, false);
                            }
                            if (class129.field2225 && !super.field1319 && ~arg4 <= -13 && ~arg4 >= -18 && ~arg4 != -14 && arg0 > 0 && var12.field593 != 0) {
                                super.field1330[arg0][arg8][arg6] = (byte) class338.method2141(super.field1330[arg0][arg8][arg6], 4);
                            }
                            if (var12.field614 != 0 && arg9 != null) {
                                arg9.method1710(!var12.field644, (byte) 61, var12.field658, var14, arg8, var13, arg6);
                            }
                        } else {
                            int var31 = -99 % ((arg5 - 26) / 59);
                            if (~arg4 == -1) {
                                int var32 = var12.field593;
                                if (class125.field2174 && var12.field593 == -1) {
                                    var32 = 1;
                                }
                                class218 var34;
                                if (var24) {
                                    class386 var33 = new class386(arg7, var12, arg10, var21, var20, var22, super.field1319, arg4, arg2, var23);
                                    if (var33.method33((byte) 97)) {
                                        var33.method26((byte) 111, arg7);
                                    }
                                    var34 = var33;
                                } else {
                                    var34 = new class324(arg7, var12, arg0, arg10, var21, var20, var22, super.field1319, arg4, arg2, arg3);
                                }
                                class218 var35 = class134.method1018(arg0, arg8, arg6);
                                if (!(var35 instanceof class435)) {
                                    class373.method2347(arg0, arg8, arg6, var34, (class218) null);
                                } else {
                                    ((class435) var35).field6487 = var34;
                                }
                                if (class129.field2225) {
                                    if (arg2 == 0) {
                                        if (var12.field665) {
                                            var19.method1511(arg8, arg6, 50);
                                            var19.method1511(arg8, arg6 + 1, 50);
                                        }
                                        if (~var32 == -2 && !super.field1319) {
                                            super.field1330[arg0][arg8][arg6] = (byte) class338.method2141(super.field1330[arg0][arg8][arg6], 1);
                                        }
                                    } else if (~arg2 == -2) {
                                        if (var12.field665) {
                                            var19.method1511(arg8, arg6 + 1, 50);
                                            var19.method1511(arg8 - -1, arg6 + 1, 50);
                                        }
                                        if (var32 == 1 && !super.field1319) {
                                            super.field1330[arg0][arg8][arg6 + 1] = (byte) class338.method2141(super.field1330[arg0][arg8][arg6 + 1], 2);
                                        }
                                    } else if (arg2 == 2) {
                                        if (var12.field665) {
                                            var19.method1511(arg8 + 1, arg6, 50);
                                            var19.method1511(arg8 - -1, arg6 + 1, 50);
                                        }
                                        if (~var32 == -2 && !super.field1319) {
                                            super.field1330[arg0][arg8 - -1][arg6] = (byte) class338.method2141(super.field1330[arg0][arg8 - -1][arg6], 1);
                                        }
                                    } else if (arg2 == 3) {
                                        if (var12.field665) {
                                            var19.method1511(arg8, arg6, 50);
                                            var19.method1511(arg8 - -1, arg6, 50);
                                        }
                                        if (var32 == 1 && !super.field1319) {
                                            super.field1330[arg0][arg8][arg6] = (byte) class338.method2141(super.field1330[arg0][arg8][arg6], 2);
                                        }
                                    }
                                }
                                if (~var12.field614 != -1 && arg9 != null) {
                                    arg9.method1714(!var12.field644, arg8, arg6, 536870912, arg4, var12.field658, arg2);
                                }
                                if (~var12.field623 != -17) {
                                    class125.method982(arg0, arg8, arg6, var12.field623);
                                }
                            } else if (arg4 == 1) {
                                class218 var36;
                                if (!var24) {
                                    var36 = new class324(arg7, var12, arg0, arg10, var21, var20, var22, super.field1319, arg4, arg2, arg3);
                                } else {
                                    class386 var37 = new class386(arg7, var12, arg10, var21, var20, var22, super.field1319, arg4, arg2, var23);
                                    var36 = var37;
                                    if (var37.method33((byte) 107)) {
                                        var37.method26((byte) 111, arg7);
                                    }
                                }
                                class218 var38 = class134.method1018(arg0, arg8, arg6);
                                if (var38 instanceof class435) {
                                    ((class435) var38).field6487 = var36;
                                } else {
                                    class373.method2347(arg0, arg8, arg6, var36, (class218) null);
                                }
                                if (var12.field665 && class129.field2225) {
                                    if (~arg2 == -1) {
                                        var19.method1511(arg8, arg6 + 1, 50);
                                    } else if (~arg2 != -2) {
                                        if (~arg2 != -3) {
                                            if (arg2 == 3) {
                                                var19.method1511(arg8, arg6, 50);
                                            }
                                        } else {
                                            var19.method1511(arg8 + 1, arg6, 50);
                                        }
                                    } else {
                                        var19.method1511(arg8 + 1, arg6 + 1, 50);
                                    }
                                }
                                if (var12.field614 != 0 && arg9 != null) {
                                    arg9.method1714(!var12.field644, arg8, arg6, 536870912, arg4, var12.field658, arg2);
                                }
                            } else if (arg4 == 2) {
                                int var39 = 3 & arg2 + 1;
                                class218 var40;
                                class218 var41;
                                if (!var24) {
                                    var40 = new class324(arg7, var12, arg0, arg10, var21, var20, var22, super.field1319, arg4, arg2 + 4, arg3);
                                    var41 = new class324(arg7, var12, arg0, arg10, var21, var20, var22, super.field1319, arg4, var39, arg3);
                                } else {
                                    class386 var42 = new class386(arg7, var12, arg10, var21, var20, var22, super.field1319, arg4, arg2 + 4, var23);
                                    class386 var43 = new class386(arg7, var12, arg10, var21, var20, var22, super.field1319, arg4, var39, var23);
                                    if (var42.method33((byte) -45)) {
                                        var42.method26((byte) 111, arg7);
                                    }
                                    if (var43.method33((byte) 107)) {
                                        var43.method26((byte) 111, arg7);
                                    }
                                    var40 = var42;
                                    var41 = var43;
                                }
                                class373.method2347(arg0, arg8, arg6, var40, var41);
                                if (~var12.field593 == -2 && class129.field2225 && !super.field1319) {
                                    if (arg2 == 0) {
                                        super.field1330[arg0][arg8][arg6] = (byte) class338.method2141(super.field1330[arg0][arg8][arg6], 1);
                                        super.field1330[arg0][arg8][arg6 + 1] = (byte) class338.method2141(super.field1330[arg0][arg8][arg6 + 1], 2);
                                    } else if (arg2 != 1) {
                                        if (arg2 == 2) {
                                            super.field1330[arg0][arg8 + 1][arg6] = (byte) class338.method2141(super.field1330[arg0][arg8 + 1][arg6], 1);
                                            super.field1330[arg0][arg8][arg6] = (byte) class338.method2141(super.field1330[arg0][arg8][arg6], 2);
                                        } else if (~arg2 == -4) {
                                            super.field1330[arg0][arg8][arg6] = (byte) class338.method2141(super.field1330[arg0][arg8][arg6], 2);
                                            super.field1330[arg0][arg8][arg6] = (byte) class338.method2141(super.field1330[arg0][arg8][arg6], 1);
                                        }
                                    } else {
                                        super.field1330[arg0][arg8][arg6 + 1] = (byte) class338.method2141(super.field1330[arg0][arg8][arg6 + 1], 2);
                                        super.field1330[arg0][arg8 - -1][arg6] = (byte) class338.method2141(super.field1330[arg0][arg8 - -1][arg6], 1);
                                    }
                                }
                                if (~var12.field614 != -1 && arg9 != null) {
                                    arg9.method1714(!var12.field644, arg8, arg6, 536870912, arg4, var12.field658, arg2);
                                }
                                if (var12.field623 != 16) {
                                    class125.method982(arg0, arg8, arg6, var12.field623);
                                }
                            } else if (arg4 == 3) {
                                class218 var45;
                                if (var24) {
                                    class386 var44 = new class386(arg7, var12, arg10, var21, var20, var22, super.field1319, arg4, arg2, var23);
                                    if (var44.method33((byte) 55)) {
                                        var44.method26((byte) 111, arg7);
                                    }
                                    var45 = var44;
                                } else {
                                    var45 = new class324(arg7, var12, arg0, arg10, var21, var20, var22, super.field1319, arg4, arg2, arg3);
                                }
                                class218 var46 = class134.method1018(arg0, arg8, arg6);
                                if (var46 instanceof class435) {
                                    ((class435) var46).field6487 = var45;
                                } else {
                                    class373.method2347(arg0, arg8, arg6, var45, (class218) null);
                                }
                                if (var12.field665 && class129.field2225) {
                                    if (arg2 != 0) {
                                        if (arg2 == 1) {
                                            var19.method1511(arg8 + 1, arg6 - -1, 50);
                                        } else if (~arg2 == -3) {
                                            var19.method1511(arg8 + 1, arg6, 50);
                                        } else if (arg2 == 3) {
                                            var19.method1511(arg8, arg6, 50);
                                        }
                                    } else {
                                        var19.method1511(arg8, arg6 + 1, 50);
                                    }
                                }
                                if (~var12.field614 != -1 && arg9 != null) {
                                    arg9.method1714(!var12.field644, arg8, arg6, 536870912, arg4, var12.field658, arg2);
                                }
                            } else if (arg4 == 9) {
                                class290 var48;
                                if (var24) {
                                    class361 var47 = new class361(arg7, var12, arg0, arg10, var21, var20, var22, super.field1319, arg8, arg8, arg6, arg6, arg4, arg2, var23);
                                    var48 = var47;
                                    if (var47.method33((byte) -96)) {
                                        var47.method26((byte) 111, arg7);
                                    }
                                } else {
                                    var48 = new class438(arg7, var12, arg0, arg10, var21, var20, var22, super.field1319, arg8, arg8 - (-var13 + 1), arg6, arg6 - 1 + var14, arg4, arg2, arg3);
                                }
                                class290 var49 = class491.method2868(arg0, arg8, arg6, field1459 != null ? field1459 : (field1459 = method604("jg")));
                                if (var49 instanceof class193 && ~var49.field4718 == ~arg8 && var49.field4717 == arg6) {
                                    ((class193) var49).field2996 = var48;
                                } else {
                                    class177.method1198(var48, false);
                                }
                                if (~var12.field614 != -1 && arg9 != null) {
                                    arg9.method1710(!var12.field644, (byte) 43, var12.field658, var14, arg8, var13, arg6);
                                }
                                if (var12.field623 != 16) {
                                    class125.method982(arg0, arg8, arg6, var12.field623);
                                }
                            } else if (~arg4 == -5) {
                                class192 var50;
                                if (!var24) {
                                    var50 = new class371(arg7, var12, arg0, arg10, var21, var20, var22, super.field1319, 0, 0, 0, arg4, arg2, arg3);
                                } else {
                                    class108 var51 = new class108(arg7, var12, arg10, var21, var20, var22, super.field1319, 0, 0, 0, arg4, arg2);
                                    var50 = var51;
                                    if (var51.method33((byte) 113)) {
                                        var51.method26((byte) 111, arg7);
                                    }
                                }
                                class192 var52 = class158.method1103(arg0, arg8, arg6);
                                if (var52 instanceof class37) {
                                    ((class37) var52).field550 = var50;
                                } else {
                                    class235.method1617(arg0, arg8, arg6, var50, (class192) null);
                                }
                            } else if (arg4 == 5) {
                                int var53 = 17;
                                class518 var54 = (class518) class134.method1018(arg0, arg8, arg6);
                                if (var54 != null) {
                                    var53 = class61.field928.method791(var54.method28((byte) -118), true).field623 - -1;
                                }
                                class192 var56;
                                if (var24) {
                                    class108 var55 = new class108(arg7, var12, arg10, var21, var20, var22, super.field1319, 0, class73.field1259[arg2] * var53, class215.field3751[arg2] * var53, arg4, arg2);
                                    var56 = var55;
                                    if (var55.method33((byte) 117)) {
                                        var55.method26((byte) 111, arg7);
                                    }
                                } else {
                                    var56 = new class371(arg7, var12, arg0, arg10, var21, var20, var22, super.field1319, 0, class73.field1259[arg2] * var53, class215.field3751[arg2] * var53, arg4, arg2, arg3);
                                }
                                class192 var57 = class158.method1103(arg0, arg8, arg6);
                                if (var57 instanceof class37) {
                                    ((class37) var57).field550 = var56;
                                } else {
                                    class235.method1617(arg0, arg8, arg6, var56, (class192) null);
                                }
                            } else if (~arg4 == -7) {
                                int var58 = 9;
                                class518 var59 = (class518) class134.method1018(arg0, arg8, arg6);
                                if (var59 != null) {
                                    var58 = 1 + class61.field928.method791(var59.method28((byte) -118), true).field623 / 2;
                                }
                                class192 var60;
                                if (!var24) {
                                    var60 = new class371(arg7, var12, arg0, arg10, var21, var20, var22, super.field1319, arg2, class222.field3820[arg2] * var58, class306.field4883[arg2] * var58, arg4, arg2 + 4, arg3);
                                } else {
                                    class108 var61 = new class108(arg7, var12, arg10, var21, var20, var22, super.field1319, arg2, class73.field1259[arg2] * var58, class215.field3751[arg2] * var58, arg4, arg2 + 4);
                                    if (var61.method33((byte) -98)) {
                                        var61.method26((byte) 111, arg7);
                                    }
                                    var60 = var61;
                                }
                                class192 var62 = class158.method1103(arg0, arg8, arg6);
                                if (var62 instanceof class37) {
                                    ((class37) var62).field550 = var60;
                                } else {
                                    class235.method1617(arg0, arg8, arg6, var60, (class192) null);
                                }
                            } else if (~arg4 == -8) {
                                int var63 = 3 & arg2 + 2;
                                class192 var65;
                                if (var24) {
                                    class108 var64 = new class108(arg7, var12, arg10, var21, var20, var22, super.field1319, var63, 0, 0, arg4, var63 + 4);
                                    var65 = var64;
                                    if (var64.method33((byte) -50)) {
                                        var64.method26((byte) 111, arg7);
                                    }
                                } else {
                                    var65 = new class371(arg7, var12, arg0, arg10, var21, var20, var22, super.field1319, var63, 0, 0, arg4, var63 + 4, arg3);
                                }
                                class192 var66 = class158.method1103(arg0, arg8, arg6);
                                if (!(var66 instanceof class37)) {
                                    class235.method1617(arg0, arg8, arg6, var65, (class192) null);
                                } else {
                                    ((class37) var66).field550 = var65;
                                }
                            } else if (arg4 == 8) {
                                int var67 = 3 & arg2 + 2;
                                int var68 = 9;
                                class518 var69 = (class518) class134.method1018(arg0, arg8, arg6);
                                if (var69 != null) {
                                    var68 = 1 + class61.field928.method791(var69.method28((byte) -118), true).field623 / 2;
                                }
                                class192 var71;
                                class192 var73;
                                if (!var24) {
                                    class371 var70 = new class371(arg7, var12, arg0, arg10, var21, var20, var22, super.field1319, arg2, class222.field3820[arg2] * var68, class306.field4883[arg2] * var68, arg4, arg2 + 4, arg3);
                                    var71 = var70;
                                    class371 var72 = new class371(arg7, var12, arg0, arg10, var21, var20, var22, super.field1319, arg2, 0, 0, arg4, var67 + 4, arg3);
                                    var73 = var72;
                                } else {
                                    class108 var74 = new class108(arg7, var12, arg10, var21, var20, var22, super.field1319, arg2, class222.field3820[arg2] * var68, class306.field4883[arg2] * var68, arg4, arg2 + 4);
                                    class108 var75 = new class108(arg7, var12, arg10, var21, var20, var22, super.field1319, arg2, 0, 0, arg4, var67 + 4);
                                    if (var74.method33((byte) 62)) {
                                        var74.method26((byte) 111, arg7);
                                    }
                                    var71 = var74;
                                    var73 = var75;
                                    if (var75.method33((byte) 118)) {
                                        var75.method26((byte) 111, arg7);
                                    }
                                }
                                class235.method1617(arg0, arg8, arg6, var71, var73);
                            }
                        }
                    } else {
                        class361 var76 = null;
                        int var77;
                        class290 var78;
                        if (!var24) {
                            var77 = 15;
                            var78 = new class438(arg7, var12, arg0, arg10, var21, var20, var22, super.field1319, arg8, arg8 + -1 - -var13, arg6, var14 + -1 + arg6, arg4, arg2, arg3);
                        } else {
                            class361 var79 = new class361(arg7, var12, arg0, arg10, var21, var20, var22, super.field1319, arg8, arg8 + var13 - 1, arg6, arg6 + -1 + var14, arg4, arg2, var23);
                            var78 = var79;
                            var76 = var79;
                            var77 = var79.method2307(15);
                        }
                        class290 var80 = class491.method2868(arg0, arg8, arg6, field1459 != null ? field1459 : (field1459 = method604("jg")));
                        boolean var81 = false;
                        if (var80 instanceof class193 && var80.field4718 == arg8 && ~var80.field4717 == ~arg6) {
                            var81 = true;
                            ((class193) var80).field2996 = var78;
                        }
                        if (var81 || class177.method1198(var78, false)) {
                            if (var76 != null && var76.method33((byte) 83)) {
                                var76.method26((byte) 111, arg7);
                            }
                            if (var12.field665 && class129.field2225) {
                                if (var77 > 30) {
                                    var77 = 30;
                                }
                                for (int var82 = 0; ~var82 >= ~var13; ++var82) {
                                    for (int var83 = 0; var14 >= var83; ++var83) {
                                        var19.method1511(arg8 + var82, arg6 + var83, var77);
                                    }
                                }
                            }
                        }
                        if (~var12.field614 != -1 && arg9 != null) {
                            arg9.method1710(!var12.field644, (byte) 102, var12.field658, var14, arg8, var13, arg6);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "([IIILza;IIIILia;IB)V")
    public final void method603(int[] arg0, int arg1, int arg2, class491 arg3, int arg4, int arg5, int arg6, int arg7, class23 arg8, int arg9, byte arg10) {
        ++field1455;
        if (!super.field1319) {
            boolean var12 = false;
            class284 var13 = null;
            if (arg0 != null) {
                arg0[0] = -1;
            }
            int var14 = (arg6 & 7) * 8;
            int var15 = (arg9 & 7) * 8;
            while (true) {
                while (arg8.field302.length > arg8.field301) {
                    int var20 = arg8.method126((byte) -101);
                    if (var20 == 0) {
                        var13 = new class284(arg8);
                    } else if (var20 == 1) {
                        int var34 = arg8.method126((byte) -123);
                        if (var34 > 0) {
                            for (int var35 = 0; var34 > var35; ++var35) {
                                class429 var36 = new class429(arg3, arg8, 0);
                                if (var36.field6427 == 31) {
                                    class469 var37 = class343.field5367.method406(arg8.method132(106), 9869);
                                    var36.method2614(var37.field6961, (byte) 106, var37.field6963, var37.field6959, var37.field6962);
                                }
                                if (arg3.method883() > 0) {
                                    class450 var38 = var36.field6429;
                                    int var39 = var38.method2700(false) >> 7;
                                    int var40 = var38.method2696((byte) 119) >> 7;
                                    if (var36.field6440 == arg4 && ~var14 >= ~var39 && ~(var14 + 8) < ~var39 && ~var15 >= ~var40 && ~var40 > ~(var15 - -8)) {
                                        int var41 = (arg2 << 7) + class57.method391(1023 & var38.method2700(false), arg7, 106, var38.method2696((byte) 122) & 1023);
                                        int var42 = (arg1 << 7) - -class276.method1819(arg7, var38.method2696((byte) 121) & 1023, var38.method2700(false) & 1023, -1);
                                        int var43 = var41 >> 7;
                                        int var44 = var42 >> 7;
                                        if (~var43 <= -1 && var44 >= 0 && super.field1331 > var43 && var44 < super.field1339) {
                                            var38.method1111(var42, (byte) -103, super.field1348[arg4][var43][var44] + -var38.method2697(123), var41);
                                            class508.method2988(var36);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (~var20 == -3) {
                        if (var13 == null) {
                            var13 = new class284();
                        }
                        var13.method1853(-1, arg8);
                    } else if (var20 == 128) {
                        if (arg0 != null) {
                            arg0[0] = arg8.method132(arg10 + 153);
                            arg0[1] = arg8.method170(492756037);
                            arg0[2] = arg8.method170(492756037);
                            arg0[3] = arg8.method170(arg10 + 492756088);
                            arg0[4] = arg8.method132(122);
                        } else {
                            arg8.field301 += 10;
                        }
                    } else {
                        if (~var20 != -130) {
                            throw new IllegalStateException("");
                        }
                        if (super.field1328 == null) {
                            super.field1328 = new byte[4][][];
                        }
                        for (int var21 = 0; var21 < 4; ++var21) {
                            byte var22 = arg8.method167(arg10 + 49);
                            if (var22 == 0 && super.field1328[arg5] != null) {
                                if (~var21 >= ~arg4) {
                                    int var23 = arg2;
                                    int var24 = arg2 + 7;
                                    int var25 = arg1;
                                    if (arg1 < 0) {
                                        var25 = 0;
                                    } else if (super.field1339 <= arg1) {
                                        var25 = super.field1339;
                                    }
                                    int var26 = arg1 - -7;
                                    if (var24 < 0) {
                                        var24 = 0;
                                    } else if (~var24 <= ~super.field1331) {
                                        var24 = super.field1331;
                                    }
                                    if (~arg2 > -1) {
                                        var23 = 0;
                                    } else if (super.field1331 <= arg2) {
                                        var23 = super.field1331;
                                    }
                                    if (~var26 <= -1) {
                                        if (~var26 <= ~super.field1339) {
                                            var26 = super.field1339;
                                        }
                                    } else {
                                        var26 = 0;
                                    }
                                    while (var23 < var24) {
                                        while (~var25 > ~var26) {
                                            super.field1328[arg5][var23][var25] = 0;
                                            ++var25;
                                        }
                                        ++var23;
                                    }
                                }
                            } else if (var22 == 1) {
                                if (super.field1328[arg5] == null) {
                                    super.field1328[arg5] = new byte[super.field1331 - -1][super.field1339 + 1];
                                }
                                for (int var27 = 0; var27 < 64; var27 += 4) {
                                    for (int var28 = 0; ~var28 > -65; var28 += 4) {
                                        byte var29 = arg8.method167(arg10 ^ 51);
                                        if (arg4 >= var21) {
                                            for (int var30 = var27; ~(var27 + 4) < ~var30; ++var30) {
                                                for (int var31 = var28; ~(var28 + 4) < ~var31; ++var31) {
                                                    if (var14 <= var30 && var30 < var14 + 8 && var15 <= var31 && var15 < var15 + 8) {
                                                        int var32 = arg2 + class339.method2144(true, var31 & 7, arg7, var30 & 7);
                                                        int var33 = arg1 + class396.method2477(arg7, var30 & 7, var31 & 7, (byte) 88);
                                                        if (var32 >= 0 && super.field1331 > var32 && var33 >= 0 && ~var33 > ~super.field1339) {
                                                            super.field1328[arg5][var32][var33] = var29;
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
                    class70.method491(var13, arg1 >> 3, 6, arg2 >> 3);
                }
                if (arg10 != -51) {
                    return;
                }
                if (!var12 && super.field1328 != null && super.field1328[arg5] != null) {
                    int var16 = arg2 + 7;
                    int var17 = arg1 + 7;
                    for (int var18 = arg2; var16 > var18; ++var18) {
                        for (int var19 = arg1; var17 > var19; ++var19) {
                            super.field1328[arg5][var18][var19] = 0;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(IIIZ)V")
    public class83(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class300.field4809, class1.field7);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method604(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
