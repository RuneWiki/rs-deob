import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class678 extends class103 {

    @OriginalMember(owner = "client!n", name = "H", descriptor = "I")
    public int field9651 = 99;

    @OriginalMember(owner = "client!n", name = "K", descriptor = "Liv;")
    public static class565 field9654 = new class565();

    @OriginalMember(owner = "client!n", name = "I", descriptor = "I")
    public static int field9652;

    @OriginalMember(owner = "client!n", name = "J", descriptor = "I")
    public static int field9653;

    @OriginalMember(owner = "client!n", name = "L", descriptor = "I")
    public static int field9655;

    @OriginalMember(owner = "client!n", name = "M", descriptor = "I")
    public static int field9656;

    @OriginalMember(owner = "client!n", name = "N", descriptor = "I")
    public static int field9657;

    @OriginalMember(owner = "client!n", name = "O", descriptor = "I")
    public static int field9658;

    @OriginalMember(owner = "client!n", name = "P", descriptor = "I")
    public static int field9659;

    @OriginalMember(owner = "client!n", name = "Q", descriptor = "I")
    public static int field9660;

    @OriginalMember(owner = "client!n", name = "S", descriptor = "I")
    public static int field9662;

    @OriginalMember(owner = "client!n", name = "G", descriptor = "Lou;")
    public static class262 field9650;

    // $FF: synthetic field
    @OriginalMember(owner = "client!n", name = "T", descriptor = "Ljava/lang/Class;")
    public static Class field9663;

    @OriginalMember(owner = "client!n", name = "R", descriptor = "[[Z")
    public static boolean[][] field9661;

    // $FF: synthetic method
    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3840(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V", line = 3)
    public static void method3831(int arg0) {
        field9654 = null;
        if (arg0 != 0) {
            method3831(82);
        }
        field9661 = null;
        field9650 = null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lr;I[Lnea;[BII)V", line = 16)
    public final void method3832(class98 arg0, int arg1, class538[] arg2, byte[] arg3, int arg4, int arg5) {
        ++field9653;
        class465 var7 = new class465(arg3);
        int var8 = -1;
        if (arg5 != 63) {
            method3831(-33);
        }
        while (true) {
            int var9 = var7.method2723(arg5 ^ 117);
            if (~var9 == -1) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method2720(-128);
                if (~var11 == -1) {
                    break;
                }
                var10 += var11 + -1;
                int var12 = var10 & 63;
                int var13 = (var10 & 4055) >> 6;
                int var14 = var10 >> 12;
                int var15 = var7.method2705(arg5 ^ -99);
                int var16 = var15 >> 2;
                int var17 = var15 & 3;
                int var18 = var13 - -arg1;
                int var19 = arg4 + var12;
                if (~var18 < -1 && ~var19 < -1 && ~var18 > ~(super.field1698 - 1) && var19 < super.field1702 + -1) {
                    class538 var20 = null;
                    if (!super.field1679) {
                        int var21 = var14;
                        if (~(class548.field8052[1][var18][var19] & 2) == -3) {
                            var21 = var14 - 1;
                        }
                        if (~var21 <= -1) {
                            var20 = arg2[var21];
                        }
                    }
                    this.method3836(var19, var14, var8, var17, var20, var14, arg5 ^ 72, -1, var18, arg0, var16);
                }
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BIII)V", line = 91)
    public static final void method3833(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 13) {
            method3831(120);
        }
        class548.field8052 = new byte[arg3][arg2][arg1];
        ++field9657;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lr;IZ)V", line = 102)
    public final void method3834(class98 arg0, int arg1, boolean arg2) {
        ++field9652;
        class240.method1557();
        if (!arg2) {
            if (~super.field1683 < -2) {
                for (int var4 = 0; var4 < super.field1698; ++var4) {
                    for (int var5 = 0; ~var5 > ~super.field1702; ++var5) {
                        if (~(2 & class548.field8052[1][var4][var5]) == -3) {
                            class600.method3422(var4, var5);
                        }
                    }
                }
            }
            for (int var6 = 0; ~var6 > ~super.field1683; ++var6) {
                for (int var7 = 0; ~super.field1702 <= ~var7; ++var7) {
                    for (int var8 = 0; ~super.field1698 <= ~var8; ++var8) {
                        if (~(super.field1700[var6][var8][var7] & 4) != -1) {
                            int var9 = var8;
                            int var10 = var8;
                            int var11 = var7;
                            int var12 = var7;
                            while (~var11 < -1 && ~(super.field1700[var6][var8][var11 + -1] & 4) != -1 && var12 - var11 < 10) {
                                --var11;
                            }
                            while (super.field1702 > var12 && ~(4 & super.field1700[var6][var8][var12 + 1]) != -1 && var12 - var11 < 10) {
                                ++var12;
                            }
                            label118: while (~var9 < -1 && -var9 + var10 < 10) {
                                for (int var13 = var11; var13 <= var12; ++var13) {
                                    if ((4 & super.field1700[var6][var9 + -1][var13]) == 0) {
                                        break label118;
                                    }
                                }
                                --var9;
                            }
                            label105: while (~super.field1698 < ~var10 && ~(-var9 + var10) > -11) {
                                for (int var14 = var11; var14 <= var12; ++var14) {
                                    if ((4 & super.field1700[var6][var10 + 1][var14]) == 0) {
                                        break label105;
                                    }
                                }
                                ++var10;
                            }
                            if (~((-var9 + var10 + 1) * (-var11 + var12 + 1)) <= -5) {
                                int var15 = super.field1692[var6][var9][var11];
                                class284.method1756(var15, -13159, var15, (var10 << 9) + 512, var6, var11 << 9, (var12 << 9) + 512, 4, var9 << 9);
                                for (int var16 = var9; var10 >= var16; ++var16) {
                                    for (int var17 = var11; ~var12 <= ~var17; ++var17) {
                                        super.field1700[var6][var16][var17] = (byte) class248.method1593(super.field1700[var6][var16][var17], -5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class534.method3134(-10363);
        }
        if (arg1 == -6997) {
            super.field1700 = null;
        }
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(IIIZ)V", line = 980)
    public class678(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class344.field4826, class621.field8844);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ILnea;Lr;IIII)V", line = 252)
    public final void method3835(int arg0, class538 arg1, class98 arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field9655;
        class394 var8 = null;
        if (~arg3 == -1) {
            var8 = (class394) class454.method2636(arg6, arg4, arg0);
        }
        if (arg5 != 4) {
            this.method3838(39, 9, 32, -95, (class465) null, (class98) null, (byte) 0, (int[]) null, 63, -79, 50);
        }
        if (arg3 == 1) {
            var8 = (class394) class681.method3856(arg6, arg4, arg0);
        }
        if (arg3 == 2) {
            var8 = (class394) class31.method286(arg6, arg4, arg0, field9663 != null ? field9663 : (field9663 = method3840("sw")));
        }
        if (arg3 == 3) {
            var8 = (class394) class415.method2469(arg6, arg4, arg0);
        }
        if (var8 != null) {
            class119 var9 = class14.field224.method2834(arg5 ^ 4, var8.method903(arg5 ^ 127));
            int var10 = var8.method907(false);
            int var11 = var8.method904(-15140);
            if (var9.method963(-23465)) {
                class428.method2516(arg6, arg0, arg4, arg5 ^ 5, var9);
            }
            if (var8.method908(false)) {
                var8.method912(arg5 ^ 20284, arg2);
            }
            if (arg3 == 0) {
                class127.method1006(arg6, arg4, arg0);
                if (~var9.field1921 != -1) {
                    arg1.method3162(arg0, !var9.field1960, var10, true, arg4, var9.field1879, var11);
                }
                if (~var9.field1891 == -2) {
                    if (~var11 == -1) {
                        class580.method3359(1, false, arg6, arg0, arg4);
                        return;
                    }
                    if (~var11 == -2) {
                        class580.method3359(2, false, arg6, arg0 + 1, arg4);
                        return;
                    }
                    if (var11 == 2) {
                        class580.method3359(1, false, arg6, arg0, arg4 + 1);
                        return;
                    }
                    if (~var11 == -4) {
                        class580.method3359(2, false, arg6, arg0, arg4);
                        return;
                    }
                }
                return;
            }
            if (~arg3 == -2) {
                class334.method1993(arg6, arg4, arg0);
                return;
            }
            if (arg3 != 2) {
                if (~arg3 == -4) {
                    class366.method2201(arg6, arg4, arg0);
                    if (var9.field1921 == 1) {
                        arg1.method3155(-125, arg4, arg0);
                        return;
                    }
                }
                return;
            }
            class595.method3403(arg6, arg4, arg0, field9663 != null ? field9663 : (field9663 = method3840("sw")));
            if (~var9.field1921 != -1 && ~(var9.field1965 + arg4) > ~super.field1698 && var9.field1965 + arg0 < super.field1702 && arg4 - -var9.field1876 < super.field1698 && ~(arg0 - -var9.field1876) > ~super.field1702) {
                arg1.method3152(var9.field1876, arg0, !var9.field1960, var9.field1879, var9.field1965, var11, (byte) -37, arg4);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIILnea;IIIILr;I)V", line = 353)
    public final void method3836(int arg0, int arg1, int arg2, int arg3, class538 arg4, int arg5, int arg6, int arg7, int arg8, class98 arg9, int arg10) {
        ++field9660;
        if (class525.field7713.method3471(class76.field1182, false) || class470.method2774(arg8, -120, arg0, class132.field2149, arg5)) {
            if (this.field9651 > arg1) {
                this.field9651 = arg1;
            }
            class119 var12 = class14.field224.method2834(0, arg2);
            if (!arg9.method785() || !class525.field7713.field5979 || !var12.field1925) {
                int var13;
                int var14;
                if (arg3 != 1 && arg3 != 3) {
                    var13 = var12.field1876;
                    var14 = var12.field1965;
                } else {
                    var14 = var12.field1876;
                    var13 = var12.field1965;
                }
                int var15;
                int var16;
                if (super.field1698 >= arg8 - -var14) {
                    var15 = arg8 - -(var14 >> 1);
                    var16 = arg8 - -(var14 + 1 >> 1);
                } else {
                    var16 = arg8 + 1;
                    var15 = arg8;
                }
                int var17;
                int var18;
                if (~super.field1702 > ~(arg0 + var13)) {
                    var17 = arg0 + 1;
                    var18 = arg0;
                } else {
                    var18 = (var13 >> 1) + arg0;
                    var17 = (var13 + 1 >> 1) + arg0;
                }
                class682 var19 = class687.field9745[arg5];
                int var20 = var19.method3858(var18, var15, (byte) 91) + var19.method3858(var18, var16, (byte) 75) + var19.method3858(var17, var15, (byte) 50) + var19.method3858(var17, var16, (byte) 22) >> 2;
                int var21 = (arg8 << 9) - -(var14 << 8);
                int var22 = (arg0 << 9) - -(var13 << 8);
                boolean var23 = class180.field2849 && !super.field1679 && var12.field1917;
                if (var12.method963(-23465)) {
                    class531.method3125((class88) null, (class270) null, arg1, 2, arg0, arg8, arg3, var12);
                }
                boolean var24 = arg7 == -1 && var12.field1905 == -1 && var12.field1962 == null && var12.field1924 == null && !var12.field1878;
                if (!class669.field9444 || (!class336.method1999(-23706, arg10) || ~var12.field1891 == -2) && (!class699.method3931(arg10, 17) || var12.field1891 != 0)) {
                    if (~arg10 == -23) {
                        if (class525.field7713.field5962 || ~var12.field1903 != -1 || ~var12.field1921 == -2 || var12.field1898) {
                            class686 var26;
                            if (var24) {
                                class320 var25 = new class320(arg9, var12, arg1, arg5, var21, var20, var22, super.field1679, arg3, var23);
                                if (var25.method908(false)) {
                                    var25.method911(arg9, (byte) 31);
                                }
                                var26 = var25;
                            } else {
                                var26 = new class583(arg9, var12, arg1, arg5, var21, var20, var22, super.field1679, arg3, arg7);
                            }
                            class203.method1408(arg1, arg8, arg0, var26);
                            if (~var12.field1921 == -2 && arg4 != null) {
                                arg4.method3161(arg0, arg8, 116);
                            }
                        }
                    } else if (arg10 != 10 && arg10 != 11) {
                        if (arg10 >= 12 && ~arg10 >= -18 || arg10 >= 18 && arg10 <= 21) {
                            class144 var28;
                            if (var24) {
                                class332 var27 = new class332(arg9, var12, arg1, arg5, var21, var20, var22, super.field1679, arg8, var14 + -1 + arg8, arg0, arg0 - (-var13 - -1), arg10, arg3, var23);
                                var28 = var27;
                                if (var27.method908(false)) {
                                    var27.method911(arg9, (byte) 31);
                                }
                            } else {
                                var28 = new class223(arg9, var12, arg1, arg5, var21, var20, var22, super.field1679, arg8, arg8 + -1 + var14, arg0, var13 + -1 + arg0, arg10, arg3, arg7);
                            }
                            class333.method1985(var28, false);
                            if (class180.field2849 && !super.field1679 && arg10 >= 12 && arg10 <= 17 && ~arg10 != -14 && arg1 > 0 && ~var12.field1891 != -1) {
                                super.field1700[arg1][arg8][arg0] = (byte) class460.method2676(super.field1700[arg1][arg8][arg0], 4);
                            }
                            if (var12.field1921 != 0 && arg4 != null) {
                                arg4.method3157(var12.field1879, !var12.field1960, var14, var13, arg0, arg8, -82);
                            }
                        } else if (arg10 == 0) {
                            int var29 = var12.field1891;
                            if (class674.field9614 && var12.field1891 == -1) {
                                var29 = 1;
                            }
                            class197 var31;
                            if (var24) {
                                class564 var30 = new class564(arg9, var12, arg1, arg5, var21, var20, var22, super.field1679, arg10, arg3, var23);
                                if (var30.method908(false)) {
                                    var30.method911(arg9, (byte) 31);
                                }
                                var31 = var30;
                            } else {
                                var31 = new class501(arg9, var12, arg1, arg5, var21, var20, var22, super.field1679, arg10, arg3, arg7);
                            }
                            class205.method1416(arg1, arg8, arg0, var31, (class197) null);
                            if (arg3 != 0) {
                                if (arg3 == 1) {
                                    if (class180.field2849 && var12.field1957) {
                                        var19.method1368(arg8, arg0 + 1, 50);
                                        var19.method1368(arg8 + 1, arg0 + 1, 50);
                                    }
                                    if (var29 == 1 && !super.field1679) {
                                        class22.method218(2, arg1, arg0 + 1, arg8, 127, -var12.field1912, var12.field1939);
                                    }
                                } else if (~arg3 == -3) {
                                    if (class180.field2849 && var12.field1957) {
                                        var19.method1368(arg8 - -1, arg0, 50);
                                        var19.method1368(arg8 + 1, arg0 + 1, 50);
                                    }
                                    if (~var29 == -2 && !super.field1679) {
                                        class22.method218(1, arg1, arg0, arg8 - -1, -79, -var12.field1912, var12.field1939);
                                    }
                                } else if (arg3 == 3) {
                                    if (class180.field2849 && var12.field1957) {
                                        var19.method1368(arg8, arg0, 50);
                                        var19.method1368(arg8 + 1, arg0, 50);
                                    }
                                    if (var29 == 1 && !super.field1679) {
                                        class22.method218(2, arg1, arg0, arg8, 102, var12.field1912, var12.field1939);
                                    }
                                }
                            } else {
                                if (class180.field2849 && var12.field1957) {
                                    var19.method1368(arg8, arg0, 50);
                                    var19.method1368(arg8, arg0 - -1, 50);
                                }
                                if (var29 == 1 && !super.field1679) {
                                    class22.method218(1, arg1, arg0, arg8, 120, var12.field1912, var12.field1939);
                                }
                            }
                            if (~var12.field1921 != -1 && arg4 != null) {
                                arg4.method3167(arg8, !var12.field1960, arg10, arg0, false, arg3, var12.field1879);
                            }
                            if (~var12.field1896 != -65) {
                                class515.method3056(arg1, arg8, arg0, var12.field1896);
                            }
                        } else if (~arg10 == -2) {
                            class197 var33;
                            if (var24) {
                                class564 var32 = new class564(arg9, var12, arg1, arg5, var21, var20, var22, super.field1679, arg10, arg3, var23);
                                if (var32.method908(false)) {
                                    var32.method911(arg9, (byte) 31);
                                }
                                var33 = var32;
                            } else {
                                var33 = new class501(arg9, var12, arg1, arg5, var21, var20, var22, super.field1679, arg10, arg3, arg7);
                            }
                            class205.method1416(arg1, arg8, arg0, var33, (class197) null);
                            if (var12.field1957 && class180.field2849) {
                                if (~arg3 == -1) {
                                    var19.method1368(arg8, arg0 - -1, 50);
                                } else if (~arg3 != -2) {
                                    if (arg3 == 2) {
                                        var19.method1368(arg8 - -1, arg0, 50);
                                    } else if (arg3 == 3) {
                                        var19.method1368(arg8, arg0, 50);
                                    }
                                } else {
                                    var19.method1368(arg8 - -1, arg0 - -1, 50);
                                }
                            }
                            if (~var12.field1921 != -1 && arg4 != null) {
                                arg4.method3167(arg8, !var12.field1960, arg10, arg0, false, arg3, var12.field1879);
                            }
                        } else if (~arg10 == -3) {
                            int var34 = 3 & arg3 + 1;
                            class197 var35;
                            class197 var36;
                            if (!var24) {
                                var35 = new class501(arg9, var12, arg1, arg5, var21, var20, var22, super.field1679, arg10, arg3 + 4, arg7);
                                var36 = new class501(arg9, var12, arg1, arg5, var21, var20, var22, super.field1679, arg10, var34, arg7);
                            } else {
                                class564 var37 = new class564(arg9, var12, arg1, arg5, var21, var20, var22, super.field1679, arg10, arg3 - -4, var23);
                                class564 var38 = new class564(arg9, var12, arg1, arg5, var21, var20, var22, super.field1679, arg10, var34, var23);
                                if (var37.method908(false)) {
                                    var37.method911(arg9, (byte) 31);
                                }
                                var36 = var38;
                                var35 = var37;
                                if (var38.method908(false)) {
                                    var38.method911(arg9, (byte) 31);
                                }
                            }
                            class205.method1416(arg1, arg8, arg0, var35, var36);
                            if ((~var12.field1891 == -2 || class674.field9614 && ~var12.field1891 == 0) && !super.field1679) {
                                if (~arg3 != -1) {
                                    if (~arg3 == -2) {
                                        class22.method218(1, arg1, arg0, arg8 + 1, 120, var12.field1912, var12.field1939);
                                        class22.method218(2, arg1, arg0 + 1, arg8, 57, var12.field1912, var12.field1939);
                                    } else if (~arg3 != -3) {
                                        if (~arg3 == -4) {
                                            class22.method218(1, arg1, arg0, arg8, 69, var12.field1912, var12.field1939);
                                            class22.method218(2, arg1, arg0, arg8, 95, var12.field1912, var12.field1939);
                                        }
                                    } else {
                                        class22.method218(1, arg1, arg0, arg8 + 1, 53, var12.field1912, var12.field1939);
                                        class22.method218(2, arg1, arg0, arg8, -117, var12.field1912, var12.field1939);
                                    }
                                } else {
                                    class22.method218(1, arg1, arg0, arg8, -103, var12.field1912, var12.field1939);
                                    class22.method218(2, arg1, arg0 + 1, arg8, 88, var12.field1912, var12.field1939);
                                }
                            }
                            if (~var12.field1921 != -1 && arg4 != null) {
                                arg4.method3167(arg8, !var12.field1960, arg10, arg0, false, arg3, var12.field1879);
                            }
                            if (~var12.field1896 != -65) {
                                class515.method3056(arg1, arg8, arg0, var12.field1896);
                            }
                        } else if (~arg10 == -4) {
                            class197 var39;
                            if (!var24) {
                                var39 = new class501(arg9, var12, arg1, arg5, var21, var20, var22, super.field1679, arg10, arg3, arg7);
                            } else {
                                class564 var40 = new class564(arg9, var12, arg1, arg5, var21, var20, var22, super.field1679, arg10, arg3, var23);
                                if (var40.method908(false)) {
                                    var40.method911(arg9, (byte) 31);
                                }
                                var39 = var40;
                            }
                            class205.method1416(arg1, arg8, arg0, var39, (class197) null);
                            if (var12.field1957 && class180.field2849) {
                                if (~arg3 != -1) {
                                    if (arg3 == 1) {
                                        var19.method1368(arg8 - -1, arg0 - -1, 50);
                                    } else if (~arg3 != -3) {
                                        if (~arg3 == -4) {
                                            var19.method1368(arg8, arg0, 50);
                                        }
                                    } else {
                                        var19.method1368(arg8 + 1, arg0, 50);
                                    }
                                } else {
                                    var19.method1368(arg8, arg0 + 1, 50);
                                }
                            }
                            if (var12.field1921 != 0 && arg4 != null) {
                                arg4.method3167(arg8, !var12.field1960, arg10, arg0, false, arg3, var12.field1879);
                            }
                        } else if (arg10 == 9) {
                            class144 var42;
                            if (var24) {
                                class332 var41 = new class332(arg9, var12, arg1, arg5, var21, var20, var22, super.field1679, arg8, arg8, arg0, arg0, arg10, arg3, var23);
                                var42 = var41;
                                if (var41.method908(false)) {
                                    var41.method911(arg9, (byte) 31);
                                }
                            } else {
                                var42 = new class223(arg9, var12, arg1, arg5, var21, var20, var22, super.field1679, arg8, arg8 + var14 - 1, arg0, var13 + -1 + arg0, arg10, arg3, arg7);
                            }
                            class333.method1985(var42, false);
                            if (var12.field1921 != 0 && arg4 != null) {
                                arg4.method3157(var12.field1879, !var12.field1960, var14, var13, arg0, arg8, -39);
                            }
                            if (~var12.field1896 != -65) {
                                class515.method3056(arg1, arg8, arg0, var12.field1896);
                            }
                        } else {
                            if (arg6 <= 96) {
                                method3831(-71);
                            }
                            if (arg10 == 4) {
                                class306 var43;
                                if (!var24) {
                                    var43 = new class112(arg9, var12, arg1, arg5, var21, var20, var22, super.field1679, 0, 0, arg10, arg3, arg7);
                                } else {
                                    class542 var44 = new class542(arg9, var12, arg1, arg5, var21, var20, var22, super.field1679, 0, 0, arg10, arg3);
                                    if (var44.method908(false)) {
                                        var44.method911(arg9, (byte) 31);
                                    }
                                    var43 = var44;
                                }
                                class141.method1106(arg1, arg8, arg0, var43, (class306) null);
                            } else if (~arg10 == -6) {
                                int var45 = 65;
                                class394 var46 = (class394) class454.method2636(arg1, arg8, arg0);
                                if (var46 != null) {
                                    var45 = class14.field224.method2834(0, var46.method903(121)).field1896 - -1;
                                }
                                class306 var47;
                                if (!var24) {
                                    var47 = new class112(arg9, var12, arg1, arg5, var21, var20, var22, super.field1679, class105.field1748[arg3] * var45, class71.field1146[arg3] * var45, arg10, arg3, arg7);
                                } else {
                                    class542 var48 = new class542(arg9, var12, arg1, arg5, var21, var20, var22, super.field1679, class105.field1748[arg3] * var45, class71.field1146[arg3] * var45, arg10, arg3);
                                    if (var48.method908(false)) {
                                        var48.method911(arg9, (byte) 31);
                                    }
                                    var47 = var48;
                                }
                                class141.method1106(arg1, arg8, arg0, var47, (class306) null);
                            } else if (arg10 == 6) {
                                int var49 = 33;
                                class394 var50 = (class394) class454.method2636(arg1, arg8, arg0);
                                if (var50 != null) {
                                    var49 = 1 + class14.field224.method2834(0, var50.method903(100)).field1896 / 2;
                                }
                                class306 var51;
                                if (!var24) {
                                    var51 = new class112(arg9, var12, arg1, arg5, var21, var20, var22, super.field1679, class233.field3454[arg3] * var49, class86.field1287[arg3] * var49, arg10, arg3 + 4, arg7);
                                } else {
                                    class542 var52 = new class542(arg9, var12, arg1, arg5, var21, var20, var22, super.field1679, class105.field1748[arg3] * var49, class71.field1146[arg3] * var49, arg10, arg3 - -4);
                                    if (var52.method908(false)) {
                                        var52.method911(arg9, (byte) 31);
                                    }
                                    var51 = var52;
                                }
                                class141.method1106(arg1, arg8, arg0, var51, (class306) null);
                            } else if (arg10 == 7) {
                                int var53 = 3 & arg3 + 2;
                                class306 var55;
                                if (var24) {
                                    class542 var54 = new class542(arg9, var12, arg1, arg5, var21, var20, var22, super.field1679, 0, 0, arg10, var53 + 4);
                                    if (var54.method908(false)) {
                                        var54.method911(arg9, (byte) 31);
                                    }
                                    var55 = var54;
                                } else {
                                    var55 = new class112(arg9, var12, arg1, arg5, var21, var20, var22, super.field1679, 0, 0, arg10, var53 - -4, arg7);
                                }
                                class141.method1106(arg1, arg8, arg0, var55, (class306) null);
                            } else if (arg10 == 8) {
                                int var56 = arg3 + 2 & 3;
                                int var57 = 33;
                                class394 var58 = (class394) class454.method2636(arg1, arg8, arg0);
                                if (var58 != null) {
                                    var57 = 1 + class14.field224.method2834(0, var58.method903(114)).field1896 / 2;
                                }
                                class306 var61;
                                class306 var62;
                                if (!var24) {
                                    class112 var59 = new class112(arg9, var12, arg1, arg5, var21, var20, var22, super.field1679, class233.field3454[arg3] * var57, class86.field1287[arg3] * var57, arg10, arg3 - -4, arg7);
                                    class112 var60 = new class112(arg9, var12, arg1, arg5, var21, var20, var22, super.field1679, 0, 0, arg10, var56 - -4, arg7);
                                    var61 = var59;
                                    var62 = var60;
                                } else {
                                    class542 var63 = new class542(arg9, var12, arg1, arg5, var21, var20, var22, super.field1679, class233.field3454[arg3] * var57, class86.field1287[arg3] * var57, arg10, arg3 + 4);
                                    class542 var64 = new class542(arg9, var12, arg1, arg5, var21, var20, var22, super.field1679, 0, 0, arg10, var56 + 4);
                                    if (var63.method908(false)) {
                                        var63.method911(arg9, (byte) 31);
                                    }
                                    var62 = var64;
                                    var61 = var63;
                                    if (var64.method908(false)) {
                                        var64.method911(arg9, (byte) 31);
                                    }
                                }
                                class141.method1106(arg1, arg8, arg0, var61, var62);
                            }
                        }
                    } else {
                        class332 var65 = null;
                        int var66;
                        class144 var67;
                        if (!var24) {
                            var66 = 15;
                            var67 = new class223(arg9, var12, arg1, arg5, var21, var20, var22, super.field1679, arg8, var14 - 1 + arg8, arg0, arg0 - (-var13 + 1), arg10, arg3, arg7);
                        } else {
                            class332 var68 = new class332(arg9, var12, arg1, arg5, var21, var20, var22, super.field1679, arg8, arg8 + var14 - 1, arg0, arg0 + var13 + -1, arg10, arg3, var23);
                            var67 = var68;
                            var65 = var68;
                            var66 = var68.method1971((byte) -104);
                        }
                        if (class333.method1985(var67, false)) {
                            if (var65 != null && var65.method908(false)) {
                                var65.method911(arg9, (byte) 31);
                            }
                            if (var12.field1957 && class180.field2849) {
                                if (~var66 < -31) {
                                    var66 = 30;
                                }
                                for (int var69 = 0; ~var69 >= ~var14; ++var69) {
                                    for (int var70 = 0; var13 >= var70; ++var70) {
                                        var19.method1368(arg8 + var69, arg0 + var70, var66);
                                    }
                                }
                            }
                        }
                        if (var12.field1921 != 0 && arg4 != null) {
                            arg4.method3157(var12.field1879, !var12.field1960, var14, var13, arg0, arg8, -36);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "([Lnea;IILr;III[BIII)V", line = 987)
    public final void method3837(class538[] arg0, int arg1, int arg2, class98 arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8, int arg9, int arg10) {
        ++field9662;
        class465 var12 = new class465(arg7);
        int var13 = arg5;
        while (true) {
            int var14 = var12.method2723(arg5 + 122);
            if (~var14 == -1) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method2720(-128);
                if (var16 == 0) {
                    break;
                }
                var15 += var16 + -1;
                int var17 = var15 & 63;
                int var18 = var15 >> 6 & 63;
                int var19 = var15 >> 12;
                int var20 = var12.method2705(-29);
                int var21 = var20 >> 2;
                int var22 = 3 & var20;
                if (arg9 == var19 && var18 >= arg6 && arg6 - -8 > var18 && ~arg1 >= ~var17 && var17 < arg1 + 8) {
                    class119 var23 = class14.field224.method2834(0, var13);
                    int var24 = arg2 + class676.method3827(var23.field1965, var23.field1876, 7 & var17, var18 & 7, var22, arg8, (byte) -32);
                    int var25 = class386.method2357(false, var23.field1965, arg8, var22, var23.field1876, var18 & 7, var17 & 7) + arg4;
                    if (~var24 < -1 && ~var25 < -1 && super.field1698 + -1 > var24 && ~(super.field1702 - 1) < ~var25) {
                        class538 var26 = null;
                        if (!super.field1679) {
                            int var27 = arg10;
                            if ((class548.field8052[1][var24][var25] & 2) == 2) {
                                var27 = arg10 - 1;
                            }
                            if (~var27 <= -1) {
                                var26 = arg0[var27];
                            }
                        }
                        this.method3836(var25, arg10, var13, arg8 + var22 & 3, var26, arg10, 118, -1, var24, arg3, var21);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIILek;Lr;B[IIII)V", line = 1064)
    public final void method3838(int arg0, int arg1, int arg2, int arg3, class465 arg4, class98 arg5, byte arg6, int[] arg7, int arg8, int arg9, int arg10) {
        ++field9656;
        if (!super.field1679) {
            boolean var12 = false;
            if (arg7 != null) {
                arg7[0] = -1;
            }
            int var13 = 10 % ((-48 - arg6) / 55);
            class63 var14 = null;
            int var15 = (arg10 & 7) * 8;
            int var16 = (7 & arg3) * 8;
            while (true) {
                int var22;
                label237: do {
                    while (true) {
                        while (~arg4.field6719.length < ~arg4.field6710) {
                            int var21 = arg4.method2705(-88);
                            if (~var21 != -1) {
                                if (~var21 == -2) {
                                    var22 = arg4.method2705(-123);
                                    continue label237;
                                }
                                if (~var21 == -3) {
                                    if (var14 == null) {
                                        var14 = new class63();
                                    }
                                    var14.method524(false, arg4);
                                } else if (var21 == 128) {
                                    if (arg7 != null) {
                                        arg7[0] = arg4.method2755((byte) -94);
                                        arg7[1] = arg4.method2744(-1);
                                        arg7[2] = arg4.method2744(-1);
                                        arg7[3] = arg4.method2744(-1);
                                        arg7[4] = arg4.method2755((byte) -121);
                                    } else {
                                        arg4.field6710 += 10;
                                    }
                                } else {
                                    if (~var21 != -130) {
                                        throw new IllegalStateException("");
                                    }
                                    if (super.field1696 == null) {
                                        super.field1696 = new byte[4][][];
                                    }
                                    for (int var33 = 0; var33 < 4; ++var33) {
                                        byte var34 = arg4.method2712(-112);
                                        if (~var34 == -1 && super.field1696[arg1] != null) {
                                            if (arg9 >= var33) {
                                                int var35 = arg2;
                                                int var36 = arg2 + 7;
                                                int var37 = arg0;
                                                if (arg0 >= 0) {
                                                    if (~super.field1702 >= ~arg0) {
                                                        var37 = super.field1702;
                                                    }
                                                } else {
                                                    var37 = 0;
                                                }
                                                if (~arg2 > -1) {
                                                    var35 = 0;
                                                } else if (arg2 >= super.field1698) {
                                                    var35 = super.field1698;
                                                }
                                                int var38 = arg0 + 7;
                                                if (~var36 > -1) {
                                                    var36 = 0;
                                                } else if (super.field1698 <= var36) {
                                                    var36 = super.field1698;
                                                }
                                                if (~var38 > -1) {
                                                    var38 = 0;
                                                } else if (~super.field1702 >= ~var38) {
                                                    var38 = super.field1702;
                                                }
                                                while (~var35 > ~var36) {
                                                    while (var38 > var37) {
                                                        super.field1696[arg1][var35][var37] = 0;
                                                        ++var37;
                                                    }
                                                    ++var35;
                                                }
                                            }
                                        } else if (var34 == 1) {
                                            if (super.field1696[arg1] == null) {
                                                super.field1696[arg1] = new byte[super.field1698 - -1][super.field1702 + 1];
                                            }
                                            for (int var39 = 0; var39 < 64; var39 += 4) {
                                                for (int var40 = 0; var40 < 64; var40 += 4) {
                                                    byte var41 = arg4.method2712(-101);
                                                    if (arg9 >= var33) {
                                                        for (int var42 = var39; var42 < var39 + 4; ++var42) {
                                                            for (int var43 = var40; var43 < var40 + 4; ++var43) {
                                                                if (~var42 <= ~var15 && var42 < var15 + 8 && ~var43 <= ~var16 && ~(var16 + 8) < ~var16) {
                                                                    int var44 = arg2 + class70.method577(arg8, 7 & var42, 7 & var43, (byte) 127);
                                                                    int var45 = class112.method910(var43 & 7, var42 & 7, arg8, (byte) -17) + arg0;
                                                                    if (var44 >= 0 && super.field1698 > var44 && ~var45 <= -1 && super.field1702 > var45) {
                                                                        super.field1696[arg1][var44][var45] = var41;
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
                                var14 = new class63(arg4);
                            }
                        }
                        if (var14 != null) {
                            class323.method1935(0, arg2 >> 3, arg0 >> 3, var14);
                        }
                        if (!var12 && super.field1696 != null && super.field1696[arg1] != null) {
                            int var17 = arg2 + 7;
                            int var18 = arg0 + 7;
                            for (int var19 = arg2; var19 < var17; ++var19) {
                                for (int var20 = arg0; ~var18 < ~var20; ++var20) {
                                    super.field1696[arg1][var19][var20] = 0;
                                }
                            }
                            return;
                        }
                        return;
                    }
                } while (~var22 >= -1);
                for (int var23 = 0; var23 < var22; ++var23) {
                    class8 var24 = new class8(arg5, arg4, 2);
                    if (var24.field98 == 31) {
                        class301 var25 = class27.field385.method571(31, arg4.method2755((byte) -72));
                        var24.method31(1202077096, var25.field4220, var25.field4217, var25.field4215, var25.field4221);
                    }
                    if (~arg5.method802() < -1) {
                        class289 var26 = var24.field90;
                        int var27 = var26.method1776((byte) -116) >> 9;
                        int var28 = var26.method1771(true) >> 9;
                        if (var24.field79 == arg9 && var15 <= var27 && var27 < var15 - -8 && ~var16 >= ~var28 && ~var28 > ~(var16 + 8)) {
                            int var29 = (arg2 << 9) - -class438.method2564(var26.method1771(true) & 4095, 4095, arg8, 4095 & var26.method1776((byte) -116));
                            int var30 = class226.method1491(16836, arg8, 4095 & var26.method1771(true), var26.method1776((byte) -116) & 4095) + (arg0 << 9);
                            int var31 = var29 >> 9;
                            int var32 = var30 >> 9;
                            if (var31 >= 0 && ~var32 <= -1 && super.field1698 > var31 && ~super.field1702 < ~var32) {
                                var26.method1770((byte) 108, var29, super.field1692[arg9][var31][var32] + -var26.method1775((byte) 81), var30);
                                class132.method1025(var24);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ILek;[ILr;II)V", line = 1355)
    public final void method3839(int arg0, class465 arg1, int[] arg2, class98 arg3, int arg4, int arg5) {
        ++field9659;
        if (!super.field1679) {
            boolean var7 = false;
            if (arg2 != null) {
                arg2[0] = -1;
            }
            class63 var8 = null;
            if (arg4 != -10814) {
                this.method3836(95, 76, 60, 118, (class538) null, 56, 25, -47, -22, (class98) null, 0);
            }
            while (true) {
                while (arg1.field6710 < arg1.field6719.length) {
                    int var18 = arg1.method2705(-85);
                    if (var18 == 0) {
                        var8 = new class63(arg1);
                    } else if (var18 == 1) {
                        int var19 = arg1.method2705(arg4 + 10722);
                        if (var19 > 0) {
                            for (int var20 = 0; ~var19 < ~var20; ++var20) {
                                class8 var21 = new class8(arg3, arg1, 2);
                                if (var21.field98 == 31) {
                                    class301 var22 = class27.field385.method571(31, arg1.method2755((byte) -71));
                                    var21.method31(1202077096, var22.field4220, var22.field4217, var22.field4215, var22.field4221);
                                }
                                if (~arg3.method802() < -1) {
                                    class289 var23 = var21.field90;
                                    int var24 = var23.method1776((byte) -116) - -(arg5 << 9);
                                    int var25 = (arg0 << 9) + var23.method1771(true);
                                    int var26 = var24 >> 9;
                                    int var27 = var25 >> 9;
                                    if (var26 >= 0 && ~var27 <= -1 && ~var26 > ~super.field1698 && super.field1702 > var27) {
                                        var23.method1770((byte) -38, var24, super.field1692[var21.field79][var26][var27] - var23.method1775((byte) 91), var25);
                                        class132.method1025(var21);
                                    }
                                }
                            }
                        }
                    } else if (var18 == 2) {
                        if (var8 == null) {
                            var8 = new class63();
                        }
                        var8.method524(false, arg1);
                    } else if (var18 == 128) {
                        if (arg2 == null) {
                            arg1.field6710 += 10;
                        } else {
                            arg2[0] = arg1.method2755((byte) -96);
                            arg2[1] = arg1.method2744(class565.method3310(arg4, 10813));
                            arg2[2] = arg1.method2744(-1);
                            arg2[3] = arg1.method2744(-1);
                            arg2[4] = arg1.method2755((byte) -108);
                        }
                    } else {
                        if (~var18 != -130) {
                            throw new IllegalStateException("");
                        }
                        if (super.field1696 == null) {
                            super.field1696 = new byte[4][][];
                        }
                        var7 = true;
                        for (int var28 = 0; ~var28 > -5; ++var28) {
                            byte var29 = arg1.method2712(-123);
                            if (var29 == 0 && super.field1696[var28] != null) {
                                int var30 = arg5;
                                int var31 = arg5 + 64;
                                int var32 = arg0;
                                if (~arg5 > -1) {
                                    var30 = 0;
                                } else if (arg5 >= super.field1698) {
                                    var30 = super.field1698;
                                }
                                if (~var31 <= -1) {
                                    if (~var31 <= ~super.field1698) {
                                        var31 = super.field1698;
                                    }
                                } else {
                                    var31 = 0;
                                }
                                if (arg0 >= 0) {
                                    if (~super.field1702 >= ~arg0) {
                                        var32 = super.field1702;
                                    }
                                } else {
                                    var32 = 0;
                                }
                                int var33 = arg0 + 64;
                                if (~var33 > -1) {
                                    var33 = 0;
                                } else if (super.field1702 <= var33) {
                                    var33 = super.field1702;
                                }
                                while (var30 < var31) {
                                    while (~var33 < ~var32) {
                                        super.field1696[var28][var30][var32] = 0;
                                        ++var32;
                                    }
                                    ++var30;
                                }
                            } else if (var29 != 1) {
                                if (~var29 == -3) {
                                    if (super.field1696[var28] == null) {
                                        super.field1696[var28] = new byte[super.field1698 - -1][super.field1702 + 1];
                                    }
                                    if (~var28 < -1) {
                                        int var34 = arg5;
                                        int var35 = arg5 + 64;
                                        int var36 = arg0;
                                        if (var35 < 0) {
                                            var35 = 0;
                                        } else if (~var35 <= ~super.field1698) {
                                            var35 = super.field1698;
                                        }
                                        if (~arg0 > -1) {
                                            var36 = 0;
                                        } else if (super.field1702 <= arg0) {
                                            var36 = super.field1702;
                                        }
                                        int var37 = arg0 + 64;
                                        if (arg5 >= 0) {
                                            if (arg5 >= super.field1698) {
                                                var34 = super.field1698;
                                            }
                                        } else {
                                            var34 = 0;
                                        }
                                        if (~var37 > -1) {
                                            var37 = 0;
                                        } else if (~super.field1702 >= ~var37) {
                                            var37 = super.field1702;
                                        }
                                        while (var34 < var35) {
                                            while (var37 > var36) {
                                                super.field1696[var28][var34][var36] = super.field1696[var28 + -1][var34][var36];
                                                ++var36;
                                            }
                                            ++var34;
                                        }
                                    }
                                }
                            } else {
                                if (super.field1696[var28] == null) {
                                    super.field1696[var28] = new byte[super.field1698 + 1][super.field1702 + 1];
                                }
                                for (int var38 = 0; ~var38 > -65; var38 += 4) {
                                    for (int var39 = 0; var39 < 64; var39 += 4) {
                                        byte var40 = arg1.method2712(-101);
                                        for (int var41 = arg5 + var38; arg5 + var38 + 4 > var41; ++var41) {
                                            for (int var42 = arg0 + var39; arg0 + var39 + 4 > var42; ++var42) {
                                                if (var41 >= 0 && super.field1698 > var41 && var42 >= 0 && super.field1702 > var42) {
                                                    super.field1696[var28][var41][var42] = var40;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (var8 != null) {
                    for (int var9 = 0; ~var9 > -9; ++var9) {
                        for (int var10 = 0; ~var10 > -9; ++var10) {
                            int var11 = (arg5 >> 3) - -var9;
                            int var12 = (arg0 >> 3) + var10;
                            if (~var11 <= -1 && var11 < super.field1698 >> 3 && ~var12 <= -1 && super.field1702 >> 3 > var12) {
                                class323.method1935(0, var11, var12, var8);
                            }
                        }
                    }
                }
                if (!var7 && super.field1696 != null) {
                    for (int var13 = 0; var13 < 4; ++var13) {
                        if (super.field1696[var13] != null) {
                            for (int var14 = 0; ~var14 > -17; ++var14) {
                                for (int var15 = 0; var15 < 16; ++var15) {
                                    int var16 = (arg5 >> 2) + var14;
                                    int var17 = (arg0 >> 2) + var15;
                                    if (~var16 <= -1 && ~var16 > -27 && var17 >= 0 && var17 < 26) {
                                        super.field1696[var13][var16][var17] = 0;
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
