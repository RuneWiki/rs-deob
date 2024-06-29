import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class46 extends class521 {

    @OriginalMember(owner = "client!pv", name = "Fc", descriptor = "I")
    public int field707 = -1;

    @OriginalMember(owner = "client!pv", name = "Vc", descriptor = "I")
    public int field723 = -1;

    @OriginalMember(owner = "client!pv", name = "Kc", descriptor = "Ljp;")
    public static class55 field712 = new class55(4, -2);

    @OriginalMember(owner = "client!pv", name = "Tc", descriptor = "Lpu;")
    public static class179 field721 = new class179("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

    @OriginalMember(owner = "client!pv", name = "bd", descriptor = "I")
    public static int field729 = 16777215;

    @OriginalMember(owner = "client!pv", name = "fd", descriptor = "I")
    public static int field733 = 0;

    @OriginalMember(owner = "client!pv", name = "Dc", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!pv", name = "Ec", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!pv", name = "Gc", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!pv", name = "Hc", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!pv", name = "Ic", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!pv", name = "Jc", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!pv", name = "Lc", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!pv", name = "Mc", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!pv", name = "Nc", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!pv", name = "Oc", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!pv", name = "Pc", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!pv", name = "Rc", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!pv", name = "Sc", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!pv", name = "Uc", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!pv", name = "Wc", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!pv", name = "Xc", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!pv", name = "Yc", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!pv", name = "Zc", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!pv", name = "ad", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!pv", name = "dd", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!pv", name = "ed", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!pv", name = "Qc", descriptor = "Lju;")
    public class171 field718;

    @OriginalMember(owner = "client!pv", name = "cd", descriptor = "Lum;")
    public static class83 field730;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pv", name = "gd", descriptor = "Ljava/lang/Class;")
    public static Class field734;

    // $FF: synthetic method
    @OriginalMember(owner = "client!pv", name = "b", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method317(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(I)I", line = 4)
    public final int method303(int arg0) {
        ++field726;
        if (this.field718.field2611 != null) {
            class171 var2 = this.field718.method1221(class288.field4476, arg0 + -2048);
            if (var2 != null && var2.field2598 != -1) {
                return var2.field2598;
            }
        }
        if (arg0 != 2048) {
            method309(-63, (byte) 68);
        }
        return this.field718.field2598;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(B)I", line = 26)
    public final int method304(byte arg0) {
        ++field711;
        if (this.field718.field2611 != null) {
            class171 var2 = this.field718.method1221(class288.field4476, 0);
            if (var2 != null && var2.field2621 != -1) {
                return var2.field2621;
            }
        }
        if (arg0 >= -62) {
            return 36;
        } else {
            return this.field718.field2621 == -1 ? super.method304((byte) -89) : this.field718.field2621;
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(Lza;III)Z", line = 49)
    public final boolean method109(class299 arg0, int arg1, int arg2, int arg3) {
        ++field724;
        if (this.field718 != null && this.method305(131072, arg0, 0)) {
            class517 var5 = arg0.method538();
            int var6 = super.field7592.method1881(false);
            var5.method960(var6);
            var5.method957(super.field1275, super.field1278, super.field1279);
            if (arg2 <= 23) {
                return true;
            } else {
                boolean var7 = false;
                for (int var8 = 0; var8 < super.field7657.length; ++var8) {
                    if (super.field7657[var8] != null && super.field7657[var8].method638(arg1, arg3, var5, this.field718.field2594 == 1)) {
                        var7 = true;
                        break;
                    }
                }
                super.field7657[0] = super.field7657[1] = super.field7657[2] = super.field7657[3] = null;
                return var7;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(ILza;I)Z", line = 89)
    private final boolean method305(int arg0, class299 arg1, int arg2) {
        ++field720;
        int var4 = arg0;
        class477 var5 = this.method3101(~arg2);
        class61 var6 = ~super.field7644 != 0 && super.field7588 == 0 ? class393.field5735.method1538(arg2 + -4031, super.field7644) : null;
        class61 var7 = super.field7590 == -1 || super.field7596 && var6 != null ? null : class393.field5735.method1538(-4031, super.field7590);
        int var8 = var5.field7012;
        int var9 = var5.field7001;
        if (~var8 != -1 || var9 != 0 || var5.field7007 != 0 || ~var5.field6976 != -1) {
            arg0 |= 7;
        }
        boolean var10 = ~super.field7638 != -1 && class446.field6625 >= super.field7555 && class446.field6625 < super.field7615;
        if (var10) {
            arg0 |= 524288;
        }
        class289 var11 = super.field7657[0] = this.field718.method1220(var6, super.field7605, var7, super.field7631, class315.field4808, super.field7611, class393.field5735, super.field7584, super.field7606, true, arg1, super.field7586, super.field7551, class288.field4476, arg0);
        if (var11 == null) {
            return false;
        } else {
            super.field7630 = var11.method654();
            this.method3107(false, var11);
            int var12 = super.field7592.method1881(false);
            if (var8 == 0 && var9 == 0) {
                this.method3106(this.method3045(0) << 7, var12, 0, this.method3045(0) << 7, arg2 ^ -124, 0);
            } else {
                this.method3106(var9, var12, var5.field6992, var8, -125, var5.field7015);
                if (super.field7607 != 0) {
                    super.field7657[0].method666(super.field7607);
                }
                if (~super.field7579 != -1) {
                    super.field7657[0].method639(super.field7579);
                }
                if (~super.field7613 != -1) {
                    super.field7657[0].method678(0, super.field7613, 0);
                }
            }
            if (var10) {
                var11.method664(super.field7576, super.field7573, super.field7640, super.field7638 & 255);
            }
            if (super.field7561 != -1 && super.field7591 != -1) {
                class434 var13 = class232.field3490.method2625((byte) 116, super.field7561);
                boolean var14 = ~var13.field6442 == -4 && (var8 != 0 || ~var9 != -1);
                int var15 = var4;
                if (!var14) {
                    if (~super.field7617 != -1) {
                        var15 = var4 | 5;
                    }
                    if (super.field7599 != 0) {
                        var15 |= 2;
                    }
                } else {
                    var15 = var4 | 7;
                }
                class289 var16 = super.field7657[1] = var13.method2691(var15, class393.field5735, super.field7635, arg2 + 90, super.field7594, super.field7591, arg1);
                if (var16 != null) {
                    if (super.field7599 != 0) {
                        var16.method678(0, -super.field7599 << 0, 0);
                    }
                    if (super.field7617 != 0) {
                        var16.method667(super.field7617 * 2048);
                    }
                    if (var14) {
                        if (super.field7607 != 0) {
                            var16.method666(super.field7607);
                        }
                        if (super.field7579 != 0) {
                            var16.method639(super.field7579);
                        }
                        if (super.field7613 != 0) {
                            var16.method678(0, super.field7613, 0);
                        }
                    }
                }
            } else {
                super.field7657[1] = null;
            }
            if (~super.field7621 != arg2 && super.field7559 != -1) {
                class434 var17 = class232.field3490.method2625((byte) 116, super.field7621);
                boolean var18 = var17.field6442 == 3 && (var8 != 0 || var9 != 0);
                int var19 = var4;
                if (var18) {
                    var19 = var4 | 7;
                } else {
                    if (~super.field7553 != -1) {
                        var19 = var4 | 5;
                    }
                    if (~super.field7641 != -1) {
                        var19 |= 2;
                    }
                }
                class289 var20 = super.field7657[3] = var17.method2699(super.field7633, super.field7559, var19, class393.field5735, (byte) -76, super.field7645, arg1);
                if (var20 != null) {
                    if (~super.field7641 != -1) {
                        var20.method678(0, -super.field7641 << 0, 0);
                    }
                    if (~super.field7553 != -1) {
                        var20.method667(super.field7553 * 2048);
                    }
                    if (var18) {
                        if (super.field7607 != 0) {
                            var20.method666(super.field7607);
                        }
                        if (super.field7579 != 0) {
                            var20.method639(super.field7579);
                        }
                        if (~super.field7613 != -1) {
                            var20.method678(0, super.field7613, 0);
                        }
                    }
                }
            } else {
                super.field7657[3] = null;
            }
            super.field7657[2] = null;
            if (super.field7650 != null) {
                if (~class446.field6625 > ~super.field7650.field2514) {
                    if (~class446.field6625 <= ~super.field7650.field2524) {
                        class289 var21 = super.field7650.method1193(7 | var4, -1, arg1);
                        if (var21 != null) {
                            var21.method678(-super.field1275 + super.field7650.field2529, -super.field1278 + super.field7650.field2531, -super.field1279 + super.field7650.field2516);
                            if (~var12 != -1) {
                                var21.method667(var12);
                            }
                            super.field7657[2] = var21;
                        }
                    }
                } else {
                    super.field7650 = null;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(IIIIZI)V", line = 283)
    public final void method306(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        super.field1274 = (byte) arg0;
        ++field705;
        if (~super.field7644 != 0 && class393.field5735.method1538(-4031, super.field7644).field951 == 1) {
            super.field7644 = -1;
        }
        if (~super.field7561 != 0) {
            class434 var7 = class232.field3490.method2625((byte) 116, super.field7561);
            if (var7.field6446 && var7.field6450 != -1 && class393.field5735.method1538(-4031, var7.field6450).field951 == 1) {
                super.field7561 = -1;
            }
        }
        if (super.field7621 != -1) {
            class434 var8 = class232.field3490.method2625((byte) 116, super.field7621);
            if (var8.field6446 && ~var8.field6450 != 0 && class393.field5735.method1538(-4031, var8.field6450).field951 == 1) {
                super.field7621 = -1;
            }
        }
        if (arg2 != -9) {
            field729 = 4;
        }
        if (!arg4) {
            int var9 = -super.field7654[0] + arg5;
            int var10 = arg1 - super.field7653[0];
            if (var9 >= -8 && ~var9 >= -9 && ~var10 <= 7 && ~var10 >= -9) {
                if (~super.field7658 > -10) {
                    ++super.field7658;
                }
                for (int var11 = super.field7658; ~var11 < -1; --var11) {
                    super.field7654[var11] = super.field7654[var11 + -1];
                    super.field7653[var11] = super.field7653[var11 + -1];
                    super.field7649[var11] = super.field7649[var11 + -1];
                }
                super.field7654[0] = arg5;
                super.field7653[0] = arg1;
                super.field7649[0] = 1;
                return;
            }
        }
        super.field7655 = 0;
        super.field7654[0] = arg5;
        super.field7658 = 0;
        super.field7652 = 0;
        super.field7653[0] = arg1;
        super.field1275 = (super.field7654[0] << 7) - -(arg3 << 6);
        super.field1279 = (super.field7653[0] << 7) + (arg3 << 6);
        if (super.field7659 != null) {
            super.field7659.method2426();
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(Lza;IIILps;IZ)V", line = 361)
    public final void method102(class299 arg0, int arg1, int arg2, int arg3, class352 arg4, int arg5, boolean arg6) {
        if (arg3 != -750) {
            this.method108(-24);
        }
        ++field708;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "(BI)I", line = 372)
    public static final int method307(byte arg0, int arg1) {
        int var8 = arg1 - 1;
        ++field719;
        int var2 = 80 % ((arg0 - 56) / 52);
        int var3 = var8 | var8 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return var7 + 1;
    }

    @OriginalMember(owner = "client!pv", name = "j", descriptor = "(I)V", line = 389)
    public static final void method308(int arg0) {
        ++field706;
        for (class167 var1 = (class167) class148.field2205.method295((byte) 120); var1 != null; var1 = (class167) class148.field2205.method296(true)) {
            if (class348.field5192 == null) {
                var1.method947((byte) 109);
            } else if (var1.field2514 <= class446.field6625) {
                int var3 = class184.field2828[var1.field2532];
                if (var3 == 0) {
                    class501 var4 = class454.method2781(var1.field2526, var1.field2517, var1.field2525);
                    if (var4 instanceof class435) {
                        class147.method1048(var1.field2526, var1.field2517, var1.field2525);
                        class435 var5 = (class435) var4;
                        if (var5.field6478 != null) {
                            class450.method2765(var1.field2526, var1.field2517, var1.field2525, var5.field6478, (class501) null);
                        }
                    }
                } else if (var3 == 1) {
                    class202 var6 = class124.method921(var1.field2526, var1.field2517, var1.field2525);
                    if (var6 instanceof class275) {
                        class343.method2208(var1.field2526, var1.field2517, var1.field2525);
                        class275 var7 = (class275) var6;
                        if (var7.field4321 != null) {
                            class224.method1546(var1.field2526, var1.field2517, var1.field2525, var7.field4321, (class202) null);
                        }
                    }
                } else if (var3 == 2) {
                    class76 var8 = class35.method217(var1.field2526, var1.field2517, var1.field2525, field734 != null ? field734 : (field734 = method317("bs")));
                    if (var8 instanceof class451) {
                        class312.method2071(var1.field2526, var1.field2517, var1.field2525, field734 != null ? field734 : (field734 = method317("bs")));
                        class451 var9 = (class451) var8;
                        if (var9.field6699 != null) {
                            class321.method2123(var9.field6699, false);
                        }
                    }
                } else if (var3 == 3) {
                    class481 var10 = class404.method2542(var1.field2526, var1.field2517, var1.field2525);
                    if (var10 instanceof class195) {
                        class174.method1241(var1.field2526, var1.field2517, var1.field2525);
                        class195 var11 = (class195) var10;
                        if (var11.field3048 != null) {
                            class397.method2507(var1.field2526, var1.field2517, var1.field2525, var11.field3048);
                        }
                    }
                }
                var1.method947((byte) 116);
            } else if (class446.field6625 == var1.field2524) {
                int var12 = class184.field2828[var1.field2532];
                if (~var12 == -1) {
                    class501 var13 = class454.method2781(var1.field2526, var1.field2517, var1.field2525);
                    if (var13 instanceof class435) {
                        var1.method947((byte) 99);
                    } else if (class178.method1261(var1.field2526, var1.field2517, var1.field2525) != null) {
                        var1.method947((byte) 91);
                    } else {
                        class435 var14 = new class435(var1.field2532, var1.field2528, var1.field2529, var1.field2531, var1.field2516, var13);
                        class450.method2765(var1.field2526, var1.field2517, var1.field2525, var14, (class501) null);
                    }
                } else if (var12 == 1) {
                    class202 var15 = class124.method921(var1.field2526, var1.field2517, var1.field2525);
                    if (var15 instanceof class275) {
                        var1.method947((byte) 108);
                    } else if (class86.method764(var1.field2526, var1.field2517, var1.field2525) != null) {
                        var1.method947((byte) 108);
                    } else {
                        class275 var16 = new class275(var1.field2532, var1.field2528, var1.field2529, var1.field2531, var1.field2516, var15);
                        class224.method1546(var1.field2526, var1.field2517, var1.field2525, var16, (class202) null);
                    }
                } else if (~var12 != -3) {
                    if (~var12 == -4) {
                        class481 var17 = class404.method2542(var1.field2526, var1.field2517, var1.field2525);
                        if (var17 instanceof class195) {
                            var1.method947((byte) 101);
                        } else {
                            class195 var18 = new class195(var1.field2529, var1.field2531, var1.field2516, var17);
                            class397.method2507(var1.field2526, var1.field2517, var1.field2525, var18);
                        }
                    }
                } else {
                    class76 var19 = class35.method217(var1.field2526, var1.field2517, var1.field2525, field734 != null ? field734 : (field734 = method317("bs")));
                    if (var19 instanceof class451) {
                        var1.method947((byte) 99);
                    } else {
                        class312.method2071(var1.field2526, var1.field2517, var1.field2525, field734 != null ? field734 : (field734 = method317("bs")));
                        class395 var20 = class247.field3693.method2281(var1.field2520, -9380);
                        int var21;
                        int var22;
                        if (~var1.field2528 != -2 && var1.field2528 != 3) {
                            var21 = var20.field5830;
                            var22 = var20.field5826;
                        } else {
                            var21 = var20.field5826;
                            var22 = var20.field5830;
                        }
                        class451 var23 = new class451(var1.field2532, var1.field2528, var1.field2526, var1.field2529, var1.field2531, var1.field2516, var1.field2517, var1.field2517 + var22 + -1, var1.field2525, var1.field2525 + -1 + var21, var19);
                        class321.method2123(var23, false);
                    }
                }
            }
        }
        int var2 = -122 / ((65 - arg0) / 47);
    }

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "(IB)I", line = 594)
    public static final int method309(int arg0, byte arg1) {
        ++field728;
        if (arg1 != -101) {
            return 122;
        } else if (arg0 == 6406) {
            return 1;
        } else if (arg0 != 6409) {
            if (arg0 == 32841) {
                return 1;
            } else if (~arg0 != -6411) {
                if (arg0 != 6407) {
                    if (~arg0 == -6409) {
                        return 4;
                    } else {
                        throw new IllegalArgumentException("");
                    }
                } else {
                    return 3;
                }
            } else {
                return 2;
            }
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!pv", name = "f", descriptor = "(B)Z", line = 629)
    private final boolean method310(byte arg0) {
        ++field709;
        if (arg0 != 49) {
            field727 = -41;
        }
        return this.field718.field2612;
    }

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "(Z)Z", line = 641)
    public final boolean method311(boolean arg0) {
        ++field715;
        if (this.field718 == null) {
            return false;
        } else {
            return !arg0;
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(Z)I", line = 656)
    public final int method101(boolean arg0) {
        ++field717;
        if (arg0) {
            this.field718 = null;
        }
        return super.field7630;
    }

    @OriginalMember(owner = "client!pv", name = "e", descriptor = "(B)I", line = 667)
    public final int method312(byte arg0) {
        if (arg0 < 65) {
            field730 = null;
        }
        ++field713;
        if (this.field718.field2611 != null) {
            class171 var2 = this.field718.method1221(class288.field4476, 0);
            if (var2 != null && ~var2.field2605 != 0) {
                return var2.field2605;
            }
        }
        return this.field718.field2605;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(ILza;)V", line = 691)
    public final void method98(int arg0, class299 arg1) {
        ++field716;
        if (this.field718 != null) {
            if (super.field7651 || this.method305(0, arg1, 0)) {
                this.method3102(super.field7651, arg1, super.field7657, arg0 + -31103);
                if (arg0 != 31203) {
                    field729 = 127;
                }
                super.field7657[0] = super.field7657[1] = super.field7657[2] = super.field7657[3] = null;
            }
        }
    }

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "(ILza;)Lhp;", line = 716)
    public final class293 method110(int arg0, class299 arg1) {
        ++field731;
        if (this.field718 != null && this.method305(2048, arg1, 0)) {
            class517 var3 = arg1.method538();
            int var4 = super.field7592.method1881(false);
            var3.method960(var4);
            var3.method957(super.field1275, super.field1278, super.field1279);
            class477 var5 = this.method3101(-1);
            class171 var6 = this.field718.field2611 != null ? this.field718.method1221(class288.field4476, 0) : this.field718;
            if (class40.field667.field4201 && var6.field2629 && var5.field7025) {
                class61 var7 = super.field7644 != -1 && ~super.field7588 == -1 ? class393.field5735.method1538(-4031, super.field7644) : null;
                class61 var8 = ~super.field7590 == 0 || super.field7596 && var7 != null ? null : class393.field5735.method1538(arg0 ^ -4031, super.field7590);
                int var9 = 0;
                if (~super.field7625 != -1) {
                    var9 = this.method3105(~arg0);
                }
                class289 var10 = class335.method2181(super.field7613, this.field718.field2632 & 65535, arg1, var9, super.field7657[0], var4, super.field7579, var8 != null ? var8 : var7, this.field718.field2606 & 65535, this.field718.field2596 & 255, var8 != null ? super.field7586 : super.field7551, arg0 ^ -113, this.field718.field2594, super.field7607, 255 & this.field718.field2636);
                if (var10 != null) {
                    float var11 = arg1.method498();
                    float var12 = arg1.method575();
                    arg1.method509(false);
                    arg1.method606(var11, var12 - 150.0F);
                    var10.method673(var3, (class41) null, 0);
                    arg1.method606(var11, var12);
                    arg1.method509(true);
                }
            }
            class293 var13 = null;
            if (this.method310((byte) 49)) {
                var13 = class467.method2844(-22755, super.field7657.length);
            }
            if (super.field7659 == null) {
                arg1.method603(super.field7657, var3, var13 == null ? null : var13.field4524, 0);
            } else {
                class320 var14 = super.field7659.method2424();
                arg1.method531(super.field7657, var14, var3, var13 != null ? var13.field4524 : null, 0);
            }
            this.method3102(false, arg1, super.field7657, 100);
            if (super.field7657[2] != null) {
                if (var4 != 0) {
                    super.field7657[2].method667(var4);
                }
                super.field7657[2].method678(-super.field7650.field2529 + super.field1275, -super.field7650.field2531 + super.field1278, -super.field7650.field2516 + super.field1279);
            }
            super.field7657[arg0] = super.field7657[1] = super.field7657[2] = super.field7657[3] = null;
            super.field7581 = class334.field5036;
            return var13;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(IBI)V", line = 796)
    public final void method313(int arg0, byte arg1, int arg2) {
        ++field714;
        int var4 = super.field7654[0];
        int var5 = super.field7653[0];
        if (~arg2 == -1) {
            ++var5;
        }
        if (arg2 == 1) {
            ++var5;
            ++var4;
        }
        if (arg1 < 123) {
            field730 = null;
        }
        if (arg2 == 2) {
            ++var4;
        }
        if (arg2 == 3) {
            --var5;
            ++var4;
        }
        if (~arg2 == -5) {
            --var5;
        }
        if (~arg2 == -6) {
            --var5;
            --var4;
        }
        if (arg2 == 6) {
            --var4;
        }
        if (arg2 == 7) {
            --var4;
            ++var5;
        }
        if (~super.field7644 != 0 && class393.field5735.method1538(-4031, super.field7644).field951 == 1) {
            super.field7644 = -1;
        }
        if (super.field7561 != -1) {
            class434 var6 = class232.field3490.method2625((byte) 116, super.field7561);
            if (var6.field6446 && var6.field6450 != -1 && class393.field5735.method1538(-4031, var6.field6450).field951 == 1) {
                super.field7561 = -1;
            }
        }
        if (~super.field7621 != 0) {
            class434 var7 = class232.field3490.method2625((byte) 116, super.field7621);
            if (var7.field6446 && var7.field6450 != -1 && class393.field5735.method1538(-4031, var7.field6450).field951 == 1) {
                super.field7621 = -1;
            }
        }
        if (super.field7658 < 9) {
            ++super.field7658;
        }
        for (int var8 = super.field7658; ~var8 < -1; --var8) {
            super.field7654[var8] = super.field7654[var8 + -1];
            super.field7653[var8] = super.field7653[var8 + -1];
            super.field7649[var8] = super.field7649[var8 + -1];
        }
        super.field7654[0] = var4;
        super.field7649[0] = (byte) arg0;
        super.field7653[0] = var5;
    }

    @OriginalMember(owner = "client!pv", name = "d", descriptor = "(I)V", line = 901)
    public final void method108(int arg0) {
        ++field725;
        int var2 = -84 % ((arg0 - 48) / 37);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "(III)Z", line = 911)
    public static final boolean method314(int arg0, int arg1, int arg2) {
        ++field710;
        if (arg2 >= -50) {
            return false;
        } else {
            return (arg1 & 384) != 0;
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(ILju;)V", line = 923)
    public final void method315(int arg0, class171 arg1) {
        this.field718 = arg1;
        if (arg0 != 32841) {
            this.method310((byte) 74);
        }
        ++field722;
        if (super.field7659 != null) {
            super.field7659.method2426();
        }
    }

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "(B)Z", line = 938)
    public final boolean method107(byte arg0) {
        if (arg0 != -88) {
            return false;
        } else {
            ++field732;
            return false;
        }
    }

    @OriginalMember(owner = "client!pv", name = "k", descriptor = "(I)V", line = 958)
    public static void method316(int arg0) {
        field721 = null;
        if (arg0 != 20627) {
            field729 = -42;
        }
        field730 = null;
        field712 = null;
    }
}
