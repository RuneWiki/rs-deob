import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class335 extends class302 {

    @OriginalMember(owner = "client!hf", name = "Q", descriptor = "I")
    public int field4640 = 99;

    @OriginalMember(owner = "client!hf", name = "R", descriptor = "Z")
    public static boolean field4641 = false;

    @OriginalMember(owner = "client!hf", name = "F", descriptor = "Llb;")
    public static class465 field4629 = new class465(8);

    @OriginalMember(owner = "client!hf", name = "G", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!hf", name = "H", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!hf", name = "I", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!hf", name = "J", descriptor = "I")
    public static int field4633;

    @OriginalMember(owner = "client!hf", name = "K", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!hf", name = "L", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!hf", name = "M", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!hf", name = "N", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!hf", name = "O", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!hf", name = "P", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!hf", name = "S", descriptor = "Llg;")
    public static class352 field4642;

    // $FF: synthetic field
    @OriginalMember(owner = "client!hf", name = "T", descriptor = "Ljava/lang/Class;")
    public static Class field4643;

    // $FF: synthetic method
    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2051(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIZI[Lvba;IILqa;II[B)V", line = 5)
    public final void method2040(int arg0, int arg1, boolean arg2, int arg3, class37[] arg4, int arg5, int arg6, class208 arg7, int arg8, int arg9, byte[] arg10) {
        if (arg2) {
            field4629 = null;
        }
        ++field4632;
        class148 var12 = new class148(arg10);
        int var13 = -1;
        while (true) {
            int var14 = var12.method1051(-6105);
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method1055(1957696096);
                if (var16 == 0) {
                    break;
                }
                var15 += var16 + -1;
                int var17 = 63 & var15;
                int var18 = (4056 & var15) >> 6;
                int var19 = var15 >> 12;
                int var20 = var12.method1032((byte) -33);
                int var21 = var20 >> 2;
                int var22 = var20 & 3;
                if (~arg8 == ~var19 && var18 >= arg6 && arg6 + 8 > var18 && ~var17 <= ~arg1 && ~(arg1 + 8) < ~var17) {
                    class145 var23 = class216.field3172.method1505(-24044, var13);
                    int var24 = arg3 - -class214.method1410(arg2, var22, var23.field2108, var23.field2067, 7 & var18, 7 & var17, arg5);
                    int var25 = arg0 + class118.method850(7 & var17, arg5, var22, var23.field2108, (byte) 103, 7 & var18, var23.field2067);
                    if (var24 > 0 && ~var25 < -1 && var24 < super.field4138 - 1 && var25 < super.field4149 + -1) {
                        class37 var26 = null;
                        if (!super.field4139) {
                            int var27 = arg9;
                            if ((class146.field2114[1][var24][var25] & 2) == 2) {
                                var27 = arg9 - 1;
                            }
                            if (~var27 <= -1) {
                                var26 = arg4[var27];
                            }
                        }
                        this.method2044(var24, arg7, var21, var25, -77, var13, var26, -1, arg5 + var22 & 3, arg9, arg9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lqa;I[Lvba;I[BI)V", line = 87)
    public final void method2041(class208 arg0, int arg1, class37[] arg2, int arg3, byte[] arg4, int arg5) {
        ++field4635;
        class148 var7 = new class148(arg4);
        if (arg5 <= 94) {
            method2047(50, -71, 87, 126, -97, 115, -1, 44, 88);
        }
        int var8 = -1;
        while (true) {
            int var9 = var7.method1051(-6105);
            if (~var9 == -1) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method1055(1957696096);
                if (~var11 == -1) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = 63 & var10;
                int var13 = var10 >> 6 & 63;
                int var14 = var10 >> 12;
                int var15 = var7.method1032((byte) -33);
                int var16 = var15 >> 2;
                int var17 = var15 & 3;
                int var18 = arg1 + var13;
                int var19 = arg3 + var12;
                if (var18 > 0 && ~var19 < -1 && ~var18 > ~(super.field4138 + -1) && ~var19 > ~(super.field4149 + -1)) {
                    class37 var20 = null;
                    if (!super.field4139) {
                        int var21 = var14;
                        if (~(class146.field2114[1][var18][var19] & 2) == -3) {
                            var21 = var14 - 1;
                        }
                        if (~var21 <= -1) {
                            var20 = arg2[var21];
                        }
                    }
                    this.method2044(var18, arg0, var16, var19, -38, var8, var20, -1, var17, var14, var14);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(IIIZ)V", line = 164)
    public class335(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class391.field5388, class437.field5844);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lqa;I)V", line = 169)
    public final void method2042(class208 arg0, int arg1) {
        ++field4633;
        class643.method3716(arg0);
        if (super.field4140 > 1) {
            for (int var3 = 0; ~var3 > ~super.field4138; ++var3) {
                for (int var4 = 0; super.field4149 > var4; ++var4) {
                    if ((class146.field2114[1][var3][var4] & 2) == 2) {
                        class426.method2503(var3, var4);
                    }
                }
            }
        }
        int var5 = -5 / ((2 - arg1) / 42);
        for (int var6 = 0; var6 < super.field4140; ++var6) {
            for (int var7 = 0; super.field4149 >= var7; ++var7) {
                for (int var8 = 0; ~super.field4138 <= ~var8; ++var8) {
                    if (~(super.field4142[var6][var8][var7] & 1) != -1) {
                        int var9 = var7;
                        int var10 = var7;
                        int var11 = var6;
                        while (var10 < super.field4149 && (super.field4142[var6][var8][var10 + 1] & 1) != 0) {
                            ++var10;
                        }
                        int var12 = var6;
                        while (~var9 < -1 && ~(super.field4142[var6][var8][var9 + -1] & 1) != -1) {
                            --var9;
                        }
                        label166: while (var11 > 0) {
                            for (int var13 = var9; var10 >= var13; ++var13) {
                                if (~(1 & super.field4142[var11 + -1][var8][var13]) == -1) {
                                    break label166;
                                }
                            }
                            --var11;
                        }
                        label155: while (var12 < 3) {
                            for (int var14 = var9; ~var14 >= ~var10; ++var14) {
                                if (~(1 & super.field4142[var12 + 1][var8][var14]) == -1) {
                                    break label155;
                                }
                            }
                            ++var12;
                        }
                        int var15 = (var12 - (var11 + -1)) * (-var9 + var10 + 1);
                        if (var15 >= 2) {
                            short var16 = 240;
                            int var17 = super.field4150[var12][var8][var9] + -var16;
                            int var18 = super.field4150[var11][var8][var9];
                            class7.method27(1, var8 << 7, var8 << 7, var9 << 7, (var10 << 7) + 128, var17, var18);
                            for (int var19 = var11; var19 <= var12; ++var19) {
                                for (int var20 = var9; ~var20 >= ~var10; ++var20) {
                                    super.field4142[var19][var8][var20] = (byte) class37.method245(super.field4142[var19][var8][var20], -2);
                                }
                            }
                        }
                    }
                    if (~(2 & super.field4142[var6][var8][var7]) != -1) {
                        int var21 = var8;
                        int var22 = var8;
                        int var23 = var6;
                        int var24 = var6;
                        while (var21 > 0 && (super.field4142[var6][var21 + -1][var7] & 2) != 0) {
                            --var21;
                        }
                        while (var22 < super.field4138 && (super.field4142[var6][var22 + 1][var7] & 2) != 0) {
                            ++var22;
                        }
                        label220: while (var23 > 0) {
                            for (int var25 = var21; var25 <= var22; ++var25) {
                                if ((super.field4142[var23 + -1][var25][var7] & 2) == 0) {
                                    break label220;
                                }
                            }
                            --var23;
                        }
                        label209: while (~var24 > -4) {
                            for (int var26 = var21; ~var22 <= ~var26; ++var26) {
                                if ((super.field4142[var24 - -1][var26][var7] & 2) == 0) {
                                    break label209;
                                }
                            }
                            ++var24;
                        }
                        int var27 = (var22 + 1 - var21) * (var24 + 1 + -var23);
                        if (var27 >= 2) {
                            short var28 = 240;
                            int var29 = super.field4150[var24][var21][var7] + -var28;
                            int var30 = super.field4150[var23][var21][var7];
                            class7.method27(2, var21 << 7, (var22 << 7) + 128, var7 << 7, var7 << 7, var29, var30);
                            for (int var31 = var23; ~var31 >= ~var24; ++var31) {
                                for (int var32 = var21; ~var22 <= ~var32; ++var32) {
                                    super.field4142[var31][var32][var7] = (byte) class37.method245(super.field4142[var31][var32][var7], -3);
                                }
                            }
                        }
                    }
                    if (~(super.field4142[var6][var8][var7] & 4) != -1) {
                        int var33 = var8;
                        int var34 = var8;
                        int var35 = var7;
                        int var36 = var7;
                        while (var35 > 0 && ~(super.field4142[var6][var8][var35 + -1] & 4) != -1) {
                            --var35;
                        }
                        while (~var36 > ~super.field4149 && (4 & super.field4142[var6][var8][var36 + 1]) != 0) {
                            ++var36;
                        }
                        label273: while (~var33 < -1) {
                            for (int var37 = var35; ~var36 <= ~var37; ++var37) {
                                if (~(super.field4142[var6][var33 - 1][var37] & 4) == -1) {
                                    break label273;
                                }
                            }
                            --var33;
                        }
                        label262: while (var34 < super.field4138) {
                            for (int var38 = var35; var38 <= var36; ++var38) {
                                if (~(super.field4142[var6][var34 + 1][var38] & 4) == -1) {
                                    break label262;
                                }
                            }
                            ++var34;
                        }
                        if ((var34 + 1 - var33) * (-var35 + 1 + var36) >= 4) {
                            int var39 = super.field4150[var6][var33][var35];
                            class7.method27(4, var33 << 7, (var34 << 7) + 128, var35 << 7, (var36 << 7) + 128, var39, var39);
                            for (int var40 = var33; ~var34 <= ~var40; ++var40) {
                                for (int var41 = var35; var41 <= var36; ++var41) {
                                    super.field4142[var6][var40][var41] = (byte) class37.method245(super.field4142[var6][var40][var41], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
        super.field4142 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIBLvba;Lqa;II)V", line = 457)
    public final void method2043(int arg0, int arg1, byte arg2, class37 arg3, class208 arg4, int arg5, int arg6) {
        ++field4631;
        class231 var8 = null;
        if (arg0 == 0) {
            var8 = (class231) class169.method1205(arg5, arg6, arg1);
        }
        if (arg0 == 1) {
            var8 = (class231) class420.method2476(arg5, arg6, arg1);
        }
        if (~arg0 == -3) {
            var8 = (class231) class624.method3650(arg5, arg6, arg1, field4643 != null ? field4643 : (field4643 = method2051("up")));
        }
        if (~arg0 == -4) {
            var8 = (class231) class440.method2560(arg5, arg6, arg1);
        }
        if (arg2 != -85) {
            this.method2040(-91, -13, true, -114, (class37[]) null, -26, 45, (class208) null, 123, 6, (byte[]) null);
        }
        if (var8 != null) {
            class145 var9 = class216.field3172.method1505(arg2 + -23959, var8.method183(-19248));
            int var10 = var8.method173((byte) 88);
            int var11 = var8.method170(-127);
            if (var9.method981(-10454)) {
                class29.method203(false, arg5, arg1, var9, arg6);
            }
            if (var8.method192((byte) -41)) {
                var8.method178((byte) 115, arg4);
            }
            if (arg0 == 0) {
                class113 var12 = class169.method1205(arg5, arg6, arg1);
                if (var12 instanceof class458) {
                    ((class458) var12).field6479 = null;
                } else {
                    class582.method3472(arg5, arg6, arg1);
                }
                if (var9.field2100 != 0) {
                    arg3.method236(!var9.field2095, var11, arg2 ^ -40, arg1, var9.field2078, arg6, var10);
                    return;
                }
            } else if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 == -4) {
                        class238 var13 = class440.method2560(arg5, arg6, arg1);
                        if (!(var13 instanceof class296)) {
                            class135.method936(arg5, arg6, arg1);
                        } else {
                            ((class296) var13).field4056 = null;
                        }
                        if (~var9.field2100 == -2) {
                            arg3.method234(arg1, -3, arg6);
                            return;
                        }
                    }
                    return;
                }
                class577 var14 = class624.method3650(arg5, arg6, arg1, field4643 != null ? field4643 : (field4643 = method2051("up")));
                if (var14 instanceof class399 && var14.field8504 == arg6 && ~var14.field8509 == ~arg1) {
                    ((class399) var14).field5483 = null;
                } else {
                    class409.method2408(arg5, arg6, arg1, field4643 != null ? field4643 : (field4643 = method2051("up")));
                }
                if (~var9.field2100 != -1 && var9.field2108 + arg6 < super.field4138 && ~super.field4149 < ~(var9.field2108 + arg1) && ~super.field4138 < ~(var9.field2067 + arg6) && super.field4149 > var9.field2067 + arg1) {
                    arg3.method244(arg1, var11, var9.field2108, var9.field2067, var9.field2078, !var9.field2095, arg6, (byte) 111);
                    return;
                }
            } else {
                class323 var15 = class420.method2476(arg5, arg6, arg1);
                if (var15 instanceof class355) {
                    ((class355) var15).field4836 = null;
                    return;
                }
                class435.method2538(arg5, arg6, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILqa;IIIILvba;IIII)V", line = 571)
    public final void method2044(int arg0, class208 arg1, int arg2, int arg3, int arg4, int arg5, class37 arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field4639;
        if (class56.field668.method1472(class526.field7533, (byte) 121) || class615.method3610(15488, class447.field6263, arg3, arg0, arg9)) {
            if (arg10 < this.field4640) {
                this.field4640 = arg10;
            }
            class145 var12 = class216.field3172.method1505(-24044, arg5);
            if (!arg1.method430() || !class56.field668.field6847 || !var12.field2040) {
                if (arg4 >= -29) {
                    method2047(117, 64, -11, -82, -82, -57, 113, -128, -44);
                }
                int var13;
                int var14;
                if (arg8 != 1 && ~arg8 != -4) {
                    var13 = var12.field2108;
                    var14 = var12.field2067;
                } else {
                    var14 = var12.field2108;
                    var13 = var12.field2067;
                }
                int var15;
                int var16;
                if (arg0 + var13 <= super.field4138) {
                    var15 = arg0 - -(var13 >> 1);
                    var16 = arg0 - -(var13 + 1 >> 1);
                } else {
                    var15 = arg0;
                    var16 = arg0 + 1;
                }
                int var17;
                int var18;
                if (~(arg3 + var14) >= ~super.field4149) {
                    var17 = arg3 - -(var14 + 1 >> 1);
                    var18 = arg3 - -(var14 >> 1);
                } else {
                    var18 = arg3;
                    var17 = arg3 - -1;
                }
                class176 var19 = class165.field2609[arg9];
                int var20 = var19.method1239(var15, var18) + var19.method1239(var16, var18) + var19.method1239(var15, var17) + var19.method1239(var16, var17) >> 2;
                int var21 = (arg0 << 7) + (var13 << 6);
                int var22 = (arg3 << 7) + (var14 << 6);
                boolean var23 = class487.field6924 && !super.field4139 && var12.field2064;
                if (var12.method981(-10454)) {
                    class300.method1836((byte) 84, (class571) null, var12, arg10, (class373) null, arg0, arg3, arg8);
                }
                boolean var24 = ~arg7 == 0 && var12.field2031 == -1 && var12.field2104 == null && var12.field2028 == null && !var12.field2101;
                if (!class427.field5746 || (!class610.method3584(-10, arg2) || var12.field2060 == 1) && (!class238.method1520(arg2, -63) || var12.field2060 != 0)) {
                    if (~arg2 == -23) {
                        if (class56.field668.field6837 || var12.field2056 != 0 || ~var12.field2100 == -2 || var12.field2037) {
                            class238 var26;
                            if (var24) {
                                class513 var25 = new class513(arg1, var12, arg9, var21, var20, var22, super.field4139, arg8, var23);
                                var26 = var25;
                                if (var25.method192((byte) -41)) {
                                    var25.method174((byte) -118, arg1);
                                }
                            } else {
                                var26 = new class312(arg1, var12, arg10, arg9, var21, var20, var22, super.field4139, arg8, arg7);
                            }
                            class238 var27 = class440.method2560(arg10, arg0, arg3);
                            if (!(var27 instanceof class296)) {
                                class328.method1985(arg10, arg0, arg3, var26);
                            } else {
                                ((class296) var27).field4056 = var26;
                            }
                            if (~var12.field2100 == -2 && arg6 != null) {
                                arg6.method233(arg0, 36, arg3);
                            }
                        }
                    } else if (arg2 != 10 && arg2 != 11) {
                        if (arg2 >= 12 && arg2 <= 17 || ~arg2 <= -19 && ~arg2 >= -22) {
                            class577 var28;
                            if (!var24) {
                                var28 = new class584(arg1, var12, arg10, arg9, var21, var20, var22, super.field4139, arg0, var13 + -1 + arg0, arg3, arg3 + var14 + -1, arg2, arg8, arg7);
                            } else {
                                class27 var29 = new class27(arg1, var12, arg10, arg9, var21, var20, var22, super.field4139, arg0, arg0 + var13 + -1, arg3, arg3 - -var14 - 1, arg2, arg8, var23);
                                var28 = var29;
                                if (var29.method192((byte) -41)) {
                                    var29.method174((byte) -107, arg1);
                                }
                            }
                            class577 var30 = class624.method3650(arg10, arg0, arg3, field4643 != null ? field4643 : (field4643 = method2051("up")));
                            if (var30 instanceof class399 && var30.field8504 == arg0 && var30.field8509 == arg3) {
                                ((class399) var30).field5483 = var28;
                            } else {
                                class320.method1933(var28, false);
                            }
                            if (class487.field6924 && !super.field4139 && arg2 >= 12 && ~arg2 >= -18 && arg2 != 13 && ~arg10 < -1 && ~var12.field2060 != -1) {
                                super.field4142[arg10][arg0][arg3] = (byte) class473.method2847(super.field4142[arg10][arg0][arg3], 4);
                            }
                            if (~var12.field2100 != -1 && arg6 != null) {
                                arg6.method240(arg0, (byte) 80, var12.field2078, var13, !var12.field2095, var14, arg3);
                            }
                        } else if (arg2 == 0) {
                            int var31 = var12.field2060;
                            if (class236.field3415 && var12.field2060 == -1) {
                                var31 = 1;
                            }
                            class113 var33;
                            if (var24) {
                                class200 var32 = new class200(arg1, var12, arg9, var21, var20, var22, super.field4139, arg2, arg8, var23);
                                var33 = var32;
                                if (var32.method192((byte) -41)) {
                                    var32.method174((byte) -39, arg1);
                                }
                            } else {
                                var33 = new class43(arg1, var12, arg10, arg9, var21, var20, var22, super.field4139, arg2, arg8, arg7);
                            }
                            class113 var34 = class169.method1205(arg10, arg0, arg3);
                            if (var34 instanceof class458) {
                                ((class458) var34).field6479 = var33;
                            } else {
                                class129.method907(arg10, arg0, arg3, var33, (class113) null);
                            }
                            if (class487.field6924) {
                                if (arg8 != 0) {
                                    if (~arg8 == -2) {
                                        if (var12.field2066) {
                                            var19.method1238(arg0, arg3 + 1, 50);
                                            var19.method1238(arg0 - -1, arg3 + 1, 50);
                                        }
                                        if (var31 == 1 && !super.field4139) {
                                            super.field4142[arg10][arg0][arg3 + 1] = (byte) class473.method2847(super.field4142[arg10][arg0][arg3 + 1], 2);
                                        }
                                    } else if (~arg8 != -3) {
                                        if (arg8 == 3) {
                                            if (var12.field2066) {
                                                var19.method1238(arg0, arg3, 50);
                                                var19.method1238(arg0 - -1, arg3, 50);
                                            }
                                            if (var31 == 1 && !super.field4139) {
                                                super.field4142[arg10][arg0][arg3] = (byte) class473.method2847(super.field4142[arg10][arg0][arg3], 2);
                                            }
                                        }
                                    } else {
                                        if (var12.field2066) {
                                            var19.method1238(arg0 + 1, arg3, 50);
                                            var19.method1238(arg0 - -1, arg3 + 1, 50);
                                        }
                                        if (var31 == 1 && !super.field4139) {
                                            super.field4142[arg10][arg0 + 1][arg3] = (byte) class473.method2847(super.field4142[arg10][arg0 + 1][arg3], 1);
                                        }
                                    }
                                } else {
                                    if (var12.field2066) {
                                        var19.method1238(arg0, arg3, 50);
                                        var19.method1238(arg0, arg3 - -1, 50);
                                    }
                                    if (var31 == 1 && !super.field4139) {
                                        super.field4142[arg10][arg0][arg3] = (byte) class473.method2847(super.field4142[arg10][arg0][arg3], 1);
                                    }
                                }
                            }
                            if (var12.field2100 != 0 && arg6 != null) {
                                arg6.method239(arg8, arg0, !var12.field2095, arg2, var12.field2078, arg3, (byte) -62);
                            }
                            if (~var12.field2045 != -17) {
                                class77.method593(arg10, arg0, arg3, var12.field2045);
                            }
                        } else if (~arg2 == -2) {
                            class113 var36;
                            if (var24) {
                                class200 var35 = new class200(arg1, var12, arg9, var21, var20, var22, super.field4139, arg2, arg8, var23);
                                if (var35.method192((byte) -41)) {
                                    var35.method174((byte) -58, arg1);
                                }
                                var36 = var35;
                            } else {
                                var36 = new class43(arg1, var12, arg10, arg9, var21, var20, var22, super.field4139, arg2, arg8, arg7);
                            }
                            class113 var37 = class169.method1205(arg10, arg0, arg3);
                            if (!(var37 instanceof class458)) {
                                class129.method907(arg10, arg0, arg3, var36, (class113) null);
                            } else {
                                ((class458) var37).field6479 = var36;
                            }
                            if (var12.field2066 && class487.field6924) {
                                if (arg8 != 0) {
                                    if (~arg8 == -2) {
                                        var19.method1238(arg0 + 1, arg3 + 1, 50);
                                    } else if (arg8 == 2) {
                                        var19.method1238(arg0 + 1, arg3, 50);
                                    } else if (arg8 == 3) {
                                        var19.method1238(arg0, arg3, 50);
                                    }
                                } else {
                                    var19.method1238(arg0, arg3 + 1, 50);
                                }
                            }
                            if (~var12.field2100 != -1 && arg6 != null) {
                                arg6.method239(arg8, arg0, !var12.field2095, arg2, var12.field2078, arg3, (byte) -62);
                            }
                        } else if (~arg2 == -3) {
                            int var38 = 3 & arg8 - -1;
                            class113 var39;
                            class113 var40;
                            if (!var24) {
                                var39 = new class43(arg1, var12, arg10, arg9, var21, var20, var22, super.field4139, arg2, arg8 + 4, arg7);
                                var40 = new class43(arg1, var12, arg10, arg9, var21, var20, var22, super.field4139, arg2, var38, arg7);
                            } else {
                                class200 var41 = new class200(arg1, var12, arg9, var21, var20, var22, super.field4139, arg2, arg8 + 4, var23);
                                class200 var42 = new class200(arg1, var12, arg9, var21, var20, var22, super.field4139, arg2, var38, var23);
                                if (var41.method192((byte) -41)) {
                                    var41.method174((byte) -106, arg1);
                                }
                                var39 = var41;
                                var40 = var42;
                                if (var42.method192((byte) -41)) {
                                    var42.method174((byte) -51, arg1);
                                }
                            }
                            class129.method907(arg10, arg0, arg3, var39, var40);
                            if (var12.field2060 == 1 && class487.field6924 && !super.field4139) {
                                if (arg8 != 0) {
                                    if (arg8 != 1) {
                                        if (arg8 != 2) {
                                            if (arg8 == 3) {
                                                super.field4142[arg10][arg0][arg3] = (byte) class473.method2847(super.field4142[arg10][arg0][arg3], 2);
                                                super.field4142[arg10][arg0][arg3] = (byte) class473.method2847(super.field4142[arg10][arg0][arg3], 1);
                                            }
                                        } else {
                                            super.field4142[arg10][arg0 + 1][arg3] = (byte) class473.method2847(super.field4142[arg10][arg0 + 1][arg3], 1);
                                            super.field4142[arg10][arg0][arg3] = (byte) class473.method2847(super.field4142[arg10][arg0][arg3], 2);
                                        }
                                    } else {
                                        super.field4142[arg10][arg0][arg3 + 1] = (byte) class473.method2847(super.field4142[arg10][arg0][arg3 + 1], 2);
                                        super.field4142[arg10][arg0 + 1][arg3] = (byte) class473.method2847(super.field4142[arg10][arg0 + 1][arg3], 1);
                                    }
                                } else {
                                    super.field4142[arg10][arg0][arg3] = (byte) class473.method2847(super.field4142[arg10][arg0][arg3], 1);
                                    super.field4142[arg10][arg0][arg3 + 1] = (byte) class473.method2847(super.field4142[arg10][arg0][arg3 + 1], 2);
                                }
                            }
                            if (~var12.field2100 != -1 && arg6 != null) {
                                arg6.method239(arg8, arg0, !var12.field2095, arg2, var12.field2078, arg3, (byte) -62);
                            }
                            if (var12.field2045 != 16) {
                                class77.method593(arg10, arg0, arg3, var12.field2045);
                            }
                        } else if (arg2 == 3) {
                            class113 var43;
                            if (!var24) {
                                var43 = new class43(arg1, var12, arg10, arg9, var21, var20, var22, super.field4139, arg2, arg8, arg7);
                            } else {
                                class200 var44 = new class200(arg1, var12, arg9, var21, var20, var22, super.field4139, arg2, arg8, var23);
                                if (var44.method192((byte) -41)) {
                                    var44.method174((byte) -51, arg1);
                                }
                                var43 = var44;
                            }
                            class113 var45 = class169.method1205(arg10, arg0, arg3);
                            if (!(var45 instanceof class458)) {
                                class129.method907(arg10, arg0, arg3, var43, (class113) null);
                            } else {
                                ((class458) var45).field6479 = var43;
                            }
                            if (var12.field2066 && class487.field6924) {
                                if (~arg8 == -1) {
                                    var19.method1238(arg0, arg3 + 1, 50);
                                } else if (~arg8 == -2) {
                                    var19.method1238(arg0 + 1, arg3 + 1, 50);
                                } else if (arg8 == 2) {
                                    var19.method1238(arg0 + 1, arg3, 50);
                                } else if (arg8 == 3) {
                                    var19.method1238(arg0, arg3, 50);
                                }
                            }
                            if (~var12.field2100 != -1 && arg6 != null) {
                                arg6.method239(arg8, arg0, !var12.field2095, arg2, var12.field2078, arg3, (byte) -62);
                            }
                        } else if (~arg2 == -10) {
                            class577 var46;
                            if (!var24) {
                                var46 = new class584(arg1, var12, arg10, arg9, var21, var20, var22, super.field4139, arg0, arg0 + var13 + -1, arg3, arg3 - -var14 + -1, arg2, arg8, arg7);
                            } else {
                                class27 var47 = new class27(arg1, var12, arg10, arg9, var21, var20, var22, super.field4139, arg0, arg0, arg3, arg3, arg2, arg8, var23);
                                var46 = var47;
                                if (var47.method192((byte) -41)) {
                                    var47.method174((byte) -118, arg1);
                                }
                            }
                            class577 var48 = class624.method3650(arg10, arg0, arg3, field4643 != null ? field4643 : (field4643 = method2051("up")));
                            if (var48 instanceof class399 && ~var48.field8504 == ~arg0 && ~var48.field8509 == ~arg3) {
                                ((class399) var48).field5483 = var46;
                            } else {
                                class320.method1933(var46, false);
                            }
                            if (var12.field2100 != 0 && arg6 != null) {
                                arg6.method240(arg0, (byte) 80, var12.field2078, var13, !var12.field2095, var14, arg3);
                            }
                            if (var12.field2045 != 16) {
                                class77.method593(arg10, arg0, arg3, var12.field2045);
                            }
                        } else if (~arg2 == -5) {
                            class323 var49;
                            if (!var24) {
                                var49 = new class354(arg1, var12, arg10, arg9, var21, var20, var22, super.field4139, 0, 0, 0, arg2, arg8, arg7);
                            } else {
                                class367 var50 = new class367(arg1, var12, arg9, var21, var20, var22, super.field4139, 0, 0, 0, arg2, arg8);
                                var49 = var50;
                                if (var50.method192((byte) -41)) {
                                    var50.method174((byte) -52, arg1);
                                }
                            }
                            class323 var51 = class420.method2476(arg10, arg0, arg3);
                            if (var51 instanceof class355) {
                                ((class355) var51).field4836 = var49;
                            } else {
                                class592.method3516(arg10, arg0, arg3, var49, (class323) null);
                            }
                        } else if (arg2 == 5) {
                            int var52 = 17;
                            class231 var53 = (class231) class169.method1205(arg10, arg0, arg3);
                            if (var53 != null) {
                                var52 = 1 + class216.field3172.method1505(-24044, var53.method183(-19248)).field2045;
                            }
                            class323 var55;
                            if (var24) {
                                class367 var54 = new class367(arg1, var12, arg9, var21, var20, var22, super.field4139, 0, class349.field4782[arg8] * var52, class240.field3451[arg8] * var52, arg2, arg8);
                                if (var54.method192((byte) -41)) {
                                    var54.method174((byte) -52, arg1);
                                }
                                var55 = var54;
                            } else {
                                var55 = new class354(arg1, var12, arg10, arg9, var21, var20, var22, super.field4139, 0, class349.field4782[arg8] * var52, class240.field3451[arg8] * var52, arg2, arg8, arg7);
                            }
                            class323 var56 = class420.method2476(arg10, arg0, arg3);
                            if (var56 instanceof class355) {
                                ((class355) var56).field4836 = var55;
                            } else {
                                class592.method3516(arg10, arg0, arg3, var55, (class323) null);
                            }
                        } else if (~arg2 == -7) {
                            int var57 = 9;
                            class231 var58 = (class231) class169.method1205(arg10, arg0, arg3);
                            if (var58 != null) {
                                var57 = class216.field3172.method1505(-24044, var58.method183(-19248)).field2045 / 2 - -1;
                            }
                            class323 var59;
                            if (!var24) {
                                var59 = new class354(arg1, var12, arg10, arg9, var21, var20, var22, super.field4139, arg8, class216.field3173[arg8] * var57, class552.field8228[arg8] * var57, arg2, arg8 - -4, arg7);
                            } else {
                                class367 var60 = new class367(arg1, var12, arg9, var21, var20, var22, super.field4139, arg8, class349.field4782[arg8] * var57, class240.field3451[arg8] * var57, arg2, arg8 - -4);
                                var59 = var60;
                                if (var60.method192((byte) -41)) {
                                    var60.method174((byte) -72, arg1);
                                }
                            }
                            class323 var61 = class420.method2476(arg10, arg0, arg3);
                            if (!(var61 instanceof class355)) {
                                class592.method3516(arg10, arg0, arg3, var59, (class323) null);
                            } else {
                                ((class355) var61).field4836 = var59;
                            }
                        } else if (arg2 == 7) {
                            int var62 = 3 & arg8 + 2;
                            class323 var63;
                            if (!var24) {
                                var63 = new class354(arg1, var12, arg10, arg9, var21, var20, var22, super.field4139, var62, 0, 0, arg2, var62 + 4, arg7);
                            } else {
                                class367 var64 = new class367(arg1, var12, arg9, var21, var20, var22, super.field4139, var62, 0, 0, arg2, var62 - -4);
                                if (var64.method192((byte) -41)) {
                                    var64.method174((byte) -53, arg1);
                                }
                                var63 = var64;
                            }
                            class323 var65 = class420.method2476(arg10, arg0, arg3);
                            if (var65 instanceof class355) {
                                ((class355) var65).field4836 = var63;
                            } else {
                                class592.method3516(arg10, arg0, arg3, var63, (class323) null);
                            }
                        } else if (arg2 == 8) {
                            int var66 = 3 & arg8 - -2;
                            int var67 = 9;
                            class231 var68 = (class231) class169.method1205(arg10, arg0, arg3);
                            if (var68 != null) {
                                var67 = class216.field3172.method1505(-24044, var68.method183(-19248)).field2045 / 2 - -1;
                            }
                            class323 var70;
                            class323 var72;
                            if (!var24) {
                                class354 var69 = new class354(arg1, var12, arg10, arg9, var21, var20, var22, super.field4139, arg8, class216.field3173[arg8] * var67, class552.field8228[arg8] * var67, arg2, arg8 + 4, arg7);
                                var70 = var69;
                                class354 var71 = new class354(arg1, var12, arg10, arg9, var21, var20, var22, super.field4139, arg8, 0, 0, arg2, var66 + 4, arg7);
                                var72 = var71;
                            } else {
                                class367 var73 = new class367(arg1, var12, arg9, var21, var20, var22, super.field4139, arg8, class216.field3173[arg8] * var67, class552.field8228[arg8] * var67, arg2, arg8 - -4);
                                class367 var74 = new class367(arg1, var12, arg9, var21, var20, var22, super.field4139, arg8, 0, 0, arg2, var66 - -4);
                                if (var73.method192((byte) -41)) {
                                    var73.method174((byte) -111, arg1);
                                }
                                var70 = var73;
                                var72 = var74;
                                if (var74.method192((byte) -41)) {
                                    var74.method174((byte) -44, arg1);
                                }
                            }
                            class592.method3516(arg10, arg0, arg3, var70, var72);
                        }
                    } else {
                        class27 var75 = null;
                        class577 var77;
                        int var78;
                        if (var24) {
                            class27 var76 = new class27(arg1, var12, arg10, arg9, var21, var20, var22, super.field4139, arg0, var13 + -1 + arg0, arg3, var14 + -1 + arg3, arg2, arg8, var23);
                            var75 = var76;
                            var77 = var76;
                            var78 = var76.method185(8);
                        } else {
                            var78 = 15;
                            var77 = new class584(arg1, var12, arg10, arg9, var21, var20, var22, super.field4139, arg0, arg0 + var13 + -1, arg3, var14 + -1 + arg3, arg2, arg8, arg7);
                        }
                        class577 var79 = class624.method3650(arg10, arg0, arg3, field4643 != null ? field4643 : (field4643 = method2051("up")));
                        boolean var80 = false;
                        if (var79 instanceof class399 && var79.field8504 == arg0 && ~var79.field8509 == ~arg3) {
                            ((class399) var79).field5483 = var77;
                            var80 = true;
                        }
                        if (var80 || class320.method1933(var77, false)) {
                            if (var75 != null && var75.method192((byte) -41)) {
                                var75.method174((byte) -118, arg1);
                            }
                            if (var12.field2066 && class487.field6924) {
                                if (var78 > 30) {
                                    var78 = 30;
                                }
                                for (int var81 = 0; var13 >= var81; ++var81) {
                                    for (int var82 = 0; ~var14 <= ~var82; ++var82) {
                                        var19.method1238(arg0 + var81, arg3 + var82, var78);
                                    }
                                }
                            }
                        }
                        if (var12.field2100 != 0 && arg6 != null) {
                            arg6.method240(arg0, (byte) 80, var12.field2078, var13, !var12.field2095, var14, arg3);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V", line = 1294)
    public static void method2045(int arg0) {
        field4629 = null;
        field4642 = null;
        if (arg0 >= -80) {
            method2046(-37, (class373) null);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILks;)I", line = 1306)
    public static final int method2046(int arg0, class373 arg1) {
        ++field4630;
        int var2 = arg1.field5160;
        class226 var3 = arg1.method947(false);
        if (arg0 != 128) {
            method2045(74);
        }
        if (!arg1.field1921) {
            if (~arg1.field1898 != ~var3.field3265 && ~arg1.field1898 != ~var3.field3282 && arg1.field1898 != var3.field3262 && arg1.field1898 != var3.field3309) {
                if (~arg1.field1898 == ~var3.field3293 || ~arg1.field1898 == ~var3.field3273 || ~arg1.field1898 == ~var3.field3292 || arg1.field1898 == var3.field3271) {
                    var2 = arg1.field5166;
                }
            } else {
                var2 = arg1.field5156;
            }
        } else {
            var2 = arg1.field5151;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIIIIII)V", line = 1332)
    public static final void method2047(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg5 != -1) {
            field4629 = null;
        }
        ++field4637;
        if (class325.method1953(arg2, (byte) -119)) {
            if (class484.field6903[arg2] == null) {
                class218.method1416(arg8, class302.field4135[arg2], arg0, -1441981280, arg6, arg4, arg1, -1, arg3, arg7);
            } else {
                class218.method1416(arg8, class484.field6903[arg2], arg0, arg5 + -1441981279, arg6, arg4, arg1, -1, arg3, arg7);
            }
        } else if (arg7 != -1) {
            class104.field1511[arg7] = true;
        } else {
            for (int var9 = 0; var9 < 100; ++var9) {
                class104.field1511[var9] = true;
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILqa;[IIILgw;)V", line = 1370)
    public final void method2048(int arg0, class208 arg1, int[] arg2, int arg3, int arg4, class148 arg5) {
        ++field4634;
        if (!super.field4139) {
            boolean var7 = false;
            if (arg0 != -27786) {
                field4629 = null;
            }
            if (arg2 != null) {
                arg2[0] = -1;
            }
            class261 var8 = null;
            while (true) {
                while (~arg5.field2177 > ~arg5.field2146.length) {
                    int var18 = arg5.method1032((byte) -33);
                    if (~var18 == -1) {
                        var8 = new class261(arg5);
                    } else if (~var18 == -2) {
                        int var19 = arg5.method1032((byte) -33);
                        if (~var19 < -1) {
                            for (int var20 = 0; var20 < var19; ++var20) {
                                class420 var21 = new class420(arg1, arg5, 0);
                                if (~var21.field5696 == -32) {
                                    class619 var22 = class116.field1639.method810(arg0 + 27911, arg5.method1045(true));
                                    var21.method2477(arg0 ^ -28298, var22.field9142, var22.field9141, var22.field9138, var22.field9144);
                                }
                                if (~arg1.method513() < -1) {
                                    class405 var23 = var21.field5683;
                                    int var24 = var23.method2388((byte) -119) - -(arg3 << 7);
                                    int var25 = (arg4 << 7) + var23.method2389(arg0 + 17625);
                                    int var26 = var24 >> 7;
                                    int var27 = var25 >> 7;
                                    if (var26 >= 0 && var27 >= 0 && ~super.field4138 < ~var26 && ~super.field4149 < ~var27) {
                                        var23.method1437((byte) 24, var25, super.field4150[var21.field5689][var26][var27] + -var23.method2383(2039035457), var24);
                                        class88.method662(var21);
                                    }
                                }
                            }
                        }
                    } else if (var18 == 2) {
                        if (var8 == null) {
                            var8 = new class261();
                        }
                        var8.method1657(arg5, (byte) 42);
                    } else if (var18 == 128) {
                        if (arg2 != null) {
                            arg2[0] = arg5.method1045(true);
                            arg2[1] = arg5.method1047(0);
                            arg2[2] = arg5.method1047(0);
                            arg2[3] = arg5.method1047(class354.method2138(arg0, -27786));
                            arg2[4] = arg5.method1045(true);
                        } else {
                            arg5.field2177 += 10;
                        }
                    } else {
                        if (~var18 != -130) {
                            throw new IllegalStateException("");
                        }
                        if (super.field4148 == null) {
                            super.field4148 = new byte[4][][];
                        }
                        for (int var28 = 0; ~var28 > -5; ++var28) {
                            byte var29 = arg5.method1062(arg0 + 6598);
                            if (~var29 == -1 && super.field4148[var28] != null) {
                                int var30 = arg3;
                                int var31 = arg3 + 64;
                                int var32 = arg4;
                                if (~var31 > -1) {
                                    var31 = 0;
                                } else if (~var31 <= ~super.field4138) {
                                    var31 = super.field4138;
                                }
                                int var33 = arg4 + 64;
                                if (arg4 >= 0) {
                                    if (super.field4149 <= arg4) {
                                        var32 = super.field4149;
                                    }
                                } else {
                                    var32 = 0;
                                }
                                if (arg3 >= 0) {
                                    if (~super.field4138 >= ~arg3) {
                                        var30 = super.field4138;
                                    }
                                } else {
                                    var30 = 0;
                                }
                                if (~var33 <= -1) {
                                    if (~super.field4149 >= ~var33) {
                                        var33 = super.field4149;
                                    }
                                } else {
                                    var33 = 0;
                                }
                                while (~var30 > ~var31) {
                                    while (var32 < var33) {
                                        super.field4148[var28][var30][var32] = 0;
                                        ++var32;
                                    }
                                    ++var30;
                                }
                            } else if (~var29 != -2) {
                                if (var29 == 2) {
                                    if (super.field4148[var28] == null) {
                                        super.field4148[var28] = new byte[super.field4138 - -1][super.field4149 + 1];
                                    }
                                    if (~var28 < -1) {
                                        int var34 = arg3;
                                        int var35 = arg3 + 64;
                                        int var36 = arg4;
                                        if (arg3 >= 0) {
                                            if (~arg3 <= ~super.field4138) {
                                                var34 = super.field4138;
                                            }
                                        } else {
                                            var34 = 0;
                                        }
                                        if (~arg4 > -1) {
                                            var36 = 0;
                                        } else if (super.field4149 <= arg4) {
                                            var36 = super.field4149;
                                        }
                                        int var37 = arg4 - -64;
                                        if (var35 < 0) {
                                            var35 = 0;
                                        } else if (~super.field4138 >= ~var35) {
                                            var35 = super.field4138;
                                        }
                                        if (var37 < 0) {
                                            var37 = 0;
                                        } else if (var37 >= super.field4149) {
                                            var37 = super.field4149;
                                        }
                                        while (~var34 > ~var35) {
                                            while (var36 < var37) {
                                                super.field4148[var28][var34][var36] = super.field4148[var28 + -1][var34][var36];
                                                ++var36;
                                            }
                                            ++var34;
                                        }
                                    }
                                }
                            } else {
                                if (super.field4148[var28] == null) {
                                    super.field4148[var28] = new byte[super.field4138 - -1][super.field4149 - -1];
                                }
                                for (int var38 = 0; var38 < 64; var38 += 4) {
                                    for (int var39 = 0; ~var39 > -65; var39 += 4) {
                                        byte var40 = arg5.method1062(-21188);
                                        for (int var41 = var38 - -arg3; ~(var38 - (-arg3 + -4)) < ~var41; ++var41) {
                                            for (int var42 = arg4 + var39; ~(arg4 - -4 + var39) < ~var42; ++var42) {
                                                if (~var41 <= -1 && var41 < super.field4138 && ~var42 <= -1 && super.field4149 > var42) {
                                                    super.field4148[var28][var41][var42] = var40;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        var7 = true;
                    }
                }
                if (var8 != null) {
                    for (int var9 = 0; ~var9 > -9; ++var9) {
                        for (int var10 = 0; var10 < 8; ++var10) {
                            int var11 = (arg3 >> 3) + var9;
                            int var12 = (arg4 >> 3) - -var10;
                            if (var11 >= 0 && ~var11 > ~(super.field4138 >> 3) && ~var12 <= -1 && ~var12 > ~(super.field4149 >> 3)) {
                                class68.method535(var8, (byte) 44, var12, var11);
                            }
                        }
                    }
                }
                if (!var7 && super.field4148 != null) {
                    for (int var13 = 0; var13 < 4; ++var13) {
                        if (super.field4148[var13] != null) {
                            for (int var14 = 0; ~var14 > -17; ++var14) {
                                for (int var15 = 0; ~var15 > -17; ++var15) {
                                    int var16 = (arg3 >> 2) - -var14;
                                    int var17 = (arg4 >> 2) + var15;
                                    if (~var16 <= -1 && var16 < 26 && ~var17 <= -1 && var17 < 26) {
                                        super.field4148[var13][var16][var17] = 0;
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

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIJIZILjava/lang/String;ZIILjava/lang/String;)V", line = 1738)
    public static final void method2049(int arg0, int arg1, long arg2, int arg3, boolean arg4, int arg5, String arg6, boolean arg7, int arg8, int arg9, String arg10) {
        ++field4638;
        if (!class446.field6245 && class103.field1484 < 500) {
            if (arg3 >= 121) {
                int var12 = ~arg1 == 0 ? class574.field8454 : arg1;
                class583 var13 = new class583(arg6, arg10, var12, arg5, arg8, arg2, arg9, arg0, arg4, arg7);
                class174.field2677.method131(var13, 0);
                ++class103.field1484;
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I[IIIIILqa;ILgw;II)V", line = 1759)
    public final void method2050(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, class208 arg6, int arg7, class148 arg8, int arg9, int arg10) {
        ++field4636;
        if (arg9 <= 41) {
            this.method2042((class208) null, -42);
        }
        if (!super.field4139) {
            boolean var12 = false;
            if (arg1 != null) {
                arg1[0] = -1;
            }
            class261 var13 = null;
            int var14 = (arg0 & 7) * 8;
            int var15 = (7 & arg4) * 8;
            while (true) {
                while (arg8.field2146.length > arg8.field2177) {
                    int var20 = arg8.method1032((byte) -33);
                    if (var20 == 0) {
                        var13 = new class261(arg8);
                    } else if (~var20 == -2) {
                        int var34 = arg8.method1032((byte) -33);
                        if (~var34 < -1) {
                            for (int var35 = 0; ~var35 > ~var34; ++var35) {
                                class420 var36 = new class420(arg6, arg8, 0);
                                if (~var36.field5696 == -32) {
                                    class619 var37 = class116.field1639.method810(127, arg8.method1045(true));
                                    var36.method2477(512, var37.field9142, var37.field9141, var37.field9138, var37.field9144);
                                }
                                if (arg6.method513() > 0) {
                                    class405 var38 = var36.field5683;
                                    int var39 = var38.method2388((byte) -117) >> 7;
                                    int var40 = var38.method2389(-10161) >> 7;
                                    if (~var36.field5689 == ~arg2 && var39 >= var14 && var14 - -8 > var39 && var15 <= var40 && ~var40 > ~(var15 - -8)) {
                                        int var41 = (arg7 << 7) + class386.method2296(var38.method2388((byte) -127) & 1023, (byte) 113, arg10, var38.method2389(-10161) & 1023);
                                        int var42 = (arg5 << 7) - -class599.method3542(var38.method2389(-10161) & 1023, var38.method2388((byte) 121) & 1023, arg10, (byte) 104);
                                        int var43 = var41 >> 7;
                                        int var44 = var42 >> 7;
                                        if (var43 >= 0 && ~var44 <= -1 && ~super.field4138 < ~var43 && super.field4149 > var44) {
                                            var38.method1437((byte) 72, var42, super.field4150[arg2][var43][var44] + -var38.method2383(2039035457), var41);
                                            class88.method662(var36);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var20 == 2) {
                        if (var13 == null) {
                            var13 = new class261();
                        }
                        var13.method1657(arg8, (byte) 42);
                    } else if (var20 == 128) {
                        if (arg1 == null) {
                            arg8.field2177 += 10;
                        } else {
                            arg1[0] = arg8.method1045(true);
                            arg1[1] = arg8.method1047(0);
                            arg1[2] = arg8.method1047(0);
                            arg1[3] = arg8.method1047(0);
                            arg1[4] = arg8.method1045(true);
                        }
                    } else {
                        if (var20 != 129) {
                            throw new IllegalStateException("");
                        }
                        if (super.field4148 == null) {
                            super.field4148 = new byte[4][][];
                        }
                        for (int var21 = 0; ~var21 > -5; ++var21) {
                            byte var22 = arg8.method1062(-21188);
                            if (~var22 == -1 && super.field4148[arg3] != null) {
                                if (~arg2 <= ~var21) {
                                    int var23 = arg7;
                                    int var24 = arg7 + 7;
                                    int var25 = arg5;
                                    if (var24 < 0) {
                                        var24 = 0;
                                    } else if (var24 >= super.field4138) {
                                        var24 = super.field4138;
                                    }
                                    if (~arg7 <= -1) {
                                        if (arg7 >= super.field4138) {
                                            var23 = super.field4138;
                                        }
                                    } else {
                                        var23 = 0;
                                    }
                                    int var26 = arg5 - -7;
                                    if (arg5 < 0) {
                                        var25 = 0;
                                    } else if (super.field4149 <= arg5) {
                                        var25 = super.field4149;
                                    }
                                    if (~var26 <= -1) {
                                        if (~super.field4149 >= ~var26) {
                                            var26 = super.field4149;
                                        }
                                    } else {
                                        var26 = 0;
                                    }
                                    while (~var23 > ~var24) {
                                        while (var26 > var25) {
                                            super.field4148[arg3][var23][var25] = 0;
                                            ++var25;
                                        }
                                        ++var23;
                                    }
                                }
                            } else if (var22 == 1) {
                                if (super.field4148[arg3] == null) {
                                    super.field4148[arg3] = new byte[super.field4138 + 1][super.field4149 + 1];
                                }
                                for (int var27 = 0; var27 < 64; var27 += 4) {
                                    for (int var28 = 0; ~var28 > -65; var28 += 4) {
                                        byte var29 = arg8.method1062(-21188);
                                        if (var21 <= arg2) {
                                            for (int var30 = var27; var27 - -4 > var30; ++var30) {
                                                for (int var31 = var28; ~(var28 + 4) < ~var31; ++var31) {
                                                    if (~var14 >= ~var30 && ~(var14 + 8) < ~var30 && ~var15 >= ~var31 && var15 < var15 - -8) {
                                                        int var32 = class392.method2331(arg10, 18779, var31 & 7, 7 & var30) + arg7;
                                                        int var33 = arg5 - -class102.method771(var30 & 7, -2, arg10, var31 & 7);
                                                        if (var32 >= 0 && var32 < super.field4138 && ~var33 <= -1 && super.field4149 > var33) {
                                                            super.field4148[arg3][var32][var33] = var29;
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
                    class68.method535(var13, (byte) 66, arg5 >> 3, arg7 >> 3);
                }
                if (!var12 && super.field4148 != null && super.field4148[arg3] != null) {
                    int var16 = arg7 - -7;
                    int var17 = arg5 + 7;
                    for (int var18 = arg7; var16 > var18; ++var18) {
                        for (int var19 = arg5; var19 < var17; ++var19) {
                            super.field4148[arg3][var18][var19] = 0;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }
}
