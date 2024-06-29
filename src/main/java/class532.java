import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public class class532 extends class227 {

    @OriginalMember(owner = "client!pca", name = "tc", descriptor = "I")
    public int field6911 = -1;

    @OriginalMember(owner = "client!pca", name = "Nc", descriptor = "I")
    public int field6931 = -1;

    @OriginalMember(owner = "client!pca", name = "Ic", descriptor = "I")
    public static int field6926 = 0;

    @OriginalMember(owner = "client!pca", name = "uc", descriptor = "I")
    public static int field6912;

    @OriginalMember(owner = "client!pca", name = "vc", descriptor = "I")
    public static int field6913;

    @OriginalMember(owner = "client!pca", name = "xc", descriptor = "I")
    public static int field6915;

    @OriginalMember(owner = "client!pca", name = "yc", descriptor = "I")
    public static int field6916;

    @OriginalMember(owner = "client!pca", name = "zc", descriptor = "I")
    public static int field6917;

    @OriginalMember(owner = "client!pca", name = "Ac", descriptor = "I")
    public static int field6918;

    @OriginalMember(owner = "client!pca", name = "Bc", descriptor = "I")
    public static int field6919;

    @OriginalMember(owner = "client!pca", name = "Cc", descriptor = "I")
    public static int field6920;

    @OriginalMember(owner = "client!pca", name = "Dc", descriptor = "I")
    public static int field6921;

    @OriginalMember(owner = "client!pca", name = "Ec", descriptor = "I")
    public static int field6922;

    @OriginalMember(owner = "client!pca", name = "Fc", descriptor = "I")
    public static int field6923;

    @OriginalMember(owner = "client!pca", name = "Gc", descriptor = "I")
    public static int field6924;

    @OriginalMember(owner = "client!pca", name = "Hc", descriptor = "I")
    public static int field6925;

    @OriginalMember(owner = "client!pca", name = "Jc", descriptor = "I")
    public static int field6927;

    @OriginalMember(owner = "client!pca", name = "Kc", descriptor = "I")
    public static int field6928;

    @OriginalMember(owner = "client!pca", name = "Lc", descriptor = "I")
    public static int field6929;

    @OriginalMember(owner = "client!pca", name = "Mc", descriptor = "I")
    public static int field6930;

    @OriginalMember(owner = "client!pca", name = "Oc", descriptor = "I")
    public static int field6932;

    @OriginalMember(owner = "client!pca", name = "wc", descriptor = "Ljf;")
    public class699 field6914;

    @OriginalMember(owner = "client!pca", name = "c", descriptor = "(B)Z")
    private final boolean method2825(byte arg0) {
        ++field6918;
        int var2 = 34 % ((arg0 - 1) / 53);
        return this.field6914.field9685;
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(Z)I")
    public final int method1266(boolean arg0) {
        if (arg0) {
            this.method2826(true, -105, (class43) null);
        }
        ++field6921;
        if (this.field6914.field9714 != null) {
            class699 var2 = this.field6914.method3823(class397.field5054, -32574);
            if (var2 != null && ~var2.field9721 != 0) {
                return var2.field9721;
            }
        }
        return this.field6914.field9721;
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(ZILoa;)Z")
    private final boolean method2826(boolean arg0, int arg1, class43 arg2) {
        ++field6916;
        if (!arg0) {
            this.method1266(false);
        }
        int var4 = arg1;
        class501 var5 = this.method1435((byte) -53);
        class348 var6 = super.field3021 != -1 && super.field2939 == 0 ? class552.field7163.method3031(-106, super.field3021) : null;
        class348 var7 = ~super.field3025 == 0 || super.field2976 && var6 != null ? null : class552.field7163.method3031(56, super.field3025);
        int var8 = var5.field6590;
        int var9 = var5.field6576;
        if (~var8 != -1 || ~var9 != -1 || ~var5.field6599 != -1 || var5.field6584 != 0) {
            arg1 |= 7;
        }
        boolean var10 = super.field3027 != 0 && super.field2948 <= class424.field5503 && ~super.field2989 < ~class424.field5503;
        if (var10) {
            arg1 |= 524288;
        }
        class107 var11 = super.field3035[0] = this.field6914.method3824(var7, arg1, super.field2941, super.field2974, super.field2943, arg2, class552.field7163, var6, super.field2972, super.field2990, (byte) -93, class397.field5054, super.field2991, super.field3015, class536.field6983);
        if (var11 == null) {
            return false;
        } else {
            super.field2958 = var11.method816();
            this.method1426(var11, (byte) 119);
            int var12 = super.field2988.method2307(arg0);
            if (~var8 == -1 && var9 == 0) {
                this.method1430(this.method1265(108) << 9, var12, 0, 2, 0, this.method1265(100) << 9);
            } else {
                this.method1430(var9, var12, var5.field6605, 2, var5.field6591, var8);
                if (super.field2945 != 0) {
                    super.field3035[0].method800(super.field2945);
                }
                if (~super.field2942 != -1) {
                    super.field3035[0].method803(super.field2942);
                }
                if (~super.field2995 != -1) {
                    super.field3035[0].method804(0, super.field2995, 0);
                }
            }
            if (var10) {
                var11.method835(super.field2978, super.field2950, super.field2997, super.field3027 & 255);
            }
            if (super.field2984 != -1 && ~super.field2949 != 0) {
                class322 var13 = class91.field1202.method986(super.field2984, false);
                boolean var14 = var13.field4162 == 3 && (~var8 != -1 || ~var9 != -1);
                int var15 = var4;
                if (var14) {
                    var15 = var4 | 7;
                } else {
                    if (~super.field2971 != -1) {
                        var15 = var4 | 5;
                    }
                    if (~super.field2968 != -1) {
                        var15 |= 2;
                    }
                }
                class107 var16 = super.field3035[1] = var13.method1866(var15, super.field2949, class552.field7163, super.field2987, (byte) -124, super.field2952, arg2);
                if (var16 != null) {
                    if (super.field2968 != 0) {
                        var16.method804(0, -super.field2968 << 2, 0);
                    }
                    if (~super.field2971 != -1) {
                        var16.method822(super.field2971 * 2048);
                    }
                    if (var14) {
                        if (~super.field2945 != -1) {
                            var16.method800(super.field2945);
                        }
                        if (super.field2942 != 0) {
                            var16.method803(super.field2942);
                        }
                        if (~super.field2995 != -1) {
                            var16.method804(0, super.field2995, 0);
                        }
                    }
                }
            } else {
                super.field3035[1] = null;
            }
            if (super.field3006 != -1 && super.field3026 != -1) {
                class322 var17 = class91.field1202.method986(super.field3006, false);
                boolean var18 = var17.field4162 == 3 && (var8 != 0 || var9 != 0);
                int var19 = var4;
                if (var18) {
                    var19 = var4 | 7;
                } else {
                    if (super.field3022 != 0) {
                        var19 = var4 | 5;
                    }
                    if (super.field2981 != 0) {
                        var19 |= 2;
                    }
                }
                class107 var20 = super.field3035[3] = var17.method1861(super.field2969, var19, arg2, 0, super.field3023, super.field3026, class552.field7163);
                if (var20 != null) {
                    if (super.field2981 != 0) {
                        var20.method804(0, -super.field2981 << 2, 0);
                    }
                    if (~super.field3022 != -1) {
                        var20.method822(super.field3022 * 2048);
                    }
                    if (var18) {
                        if (~super.field2945 != -1) {
                            var20.method800(super.field2945);
                        }
                        if (~super.field2942 != -1) {
                            var20.method803(super.field2942);
                        }
                        if (super.field2995 != 0) {
                            var20.method804(0, super.field2995, 0);
                        }
                    }
                }
            } else {
                super.field3035[3] = null;
            }
            super.field3035[2] = null;
            if (super.field3033 != null) {
                if (super.field3033.field6969 <= class424.field5503) {
                    super.field3033 = null;
                } else if (class424.field5503 >= super.field3033.field6967) {
                    class107 var21 = super.field3033.method2847(arg0, var4 | 7, arg2);
                    if (var21 != null) {
                        var21.method804(-super.field506 + super.field3033.field6957, -super.field510 + super.field3033.field6961 + 5, super.field3033.field6970 - super.field503);
                        if (var12 != 0) {
                            var21.method822(var12);
                        }
                        super.field3035[2] = var21;
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(III)V")
    public final void method2827(int arg0, int arg1, int arg2) {
        ++field6923;
        int var4 = super.field3030[0];
        int var5 = super.field3039[0];
        if (~arg1 == -1) {
            ++var5;
        }
        if (~arg1 == -2) {
            ++var5;
            ++var4;
        }
        if (~arg1 == -3) {
            ++var4;
        }
        if (~arg1 == -4) {
            --var5;
            ++var4;
        }
        if (arg1 == 4) {
            --var5;
        }
        if (arg1 == 5) {
            --var5;
            --var4;
        }
        if (arg1 == 6) {
            --var4;
        }
        if (super.field3021 != -1 && class552.field7163.method3031(87, super.field3021).field4465 == 1) {
            super.field3021 = -1;
            super.field2979 = null;
        }
        if (~arg1 == -8) {
            ++var5;
            --var4;
        }
        if (super.field2984 != -1) {
            class322 var6 = class91.field1202.method986(super.field2984, false);
            if (var6.field4166 && ~var6.field4173 != 0 && ~class552.field7163.method3031(82, var6.field4173).field4465 == -2) {
                super.field2984 = -1;
            }
        }
        if (~super.field3006 != 0) {
            class322 var7 = class91.field1202.method986(super.field3006, false);
            if (var7.field4166 && var7.field4173 != -1 && class552.field7163.method3031(46, var7.field4173).field4465 == 1) {
                super.field3006 = -1;
            }
        }
        if (super.field3038 < 9) {
            ++super.field3038;
        }
        for (int var8 = super.field3038; var8 > 0; --var8) {
            super.field3030[var8] = super.field3030[var8 + -1];
            super.field3039[var8] = super.field3039[var8 + -1];
            super.field3032[var8] = super.field3032[var8 - 1];
        }
        super.field3030[0] = var4;
        if (arg0 != -12647) {
            this.method71((class43) null, (byte) -43);
        }
        super.field3039[0] = var5;
        super.field3032[0] = (byte) arg2;
    }

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "(Z)I")
    public final int method1423(boolean arg0) {
        ++field6924;
        if (this.field6914.field9714 != null) {
            class699 var2 = this.field6914.method3823(class397.field5054, -32574);
            if (var2 != null && ~var2.field9683 != 0) {
                return var2.field9683;
            }
        }
        if (!arg0) {
            return -65;
        } else {
            return ~this.field6914.field9683 == 0 ? super.method1423(true) : this.field6914.field9683;
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(IILoa;ILcq;ZI)V")
    public final void method73(int arg0, int arg1, class43 arg2, int arg3, class274 arg4, boolean arg5, int arg6) {
        ++field6917;
        if (arg6 <= -2) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!pca", name = "d", descriptor = "(I)I")
    public final int method270(int arg0) {
        ++field6925;
        if (arg0 != 2495) {
            this.method74(-63, 63, (class43) null, -22);
        }
        return super.field2958;
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(IIIIZI)V")
    public final void method2828(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg3 == 4) {
            super.field508 = (byte) arg5;
            ++field6932;
            if (super.field3021 != -1 && class552.field7163.method3031(arg3 + 88, super.field3021).field4465 == 1) {
                super.field2979 = null;
                super.field3021 = -1;
            }
            if (~super.field2984 != 0) {
                class322 var7 = class91.field1202.method986(super.field2984, false);
                if (var7.field4166 && ~var7.field4173 != 0 && class552.field7163.method3031(-94, var7.field4173).field4465 == 1) {
                    super.field2984 = -1;
                }
            }
            if (~super.field3006 != 0) {
                class322 var8 = class91.field1202.method986(super.field3006, false);
                if (var8.field4166 && var8.field4173 != -1 && ~class552.field7163.method3031(62, var8.field4173).field4465 == -2) {
                    super.field3006 = -1;
                }
            }
            if (!arg4) {
                int var9 = -super.field3030[0] + arg2;
                int var10 = arg1 - super.field3039[0];
                if (var9 >= -8 && var9 <= 8 && var10 >= -8 && ~var10 >= -9) {
                    if (~super.field3038 > -10) {
                        ++super.field3038;
                    }
                    for (int var11 = super.field3038; ~var11 < -1; --var11) {
                        super.field3030[var11] = super.field3030[var11 + -1];
                        super.field3039[var11] = super.field3039[var11 + -1];
                        super.field3032[var11] = super.field3032[var11 + -1];
                    }
                    super.field3030[0] = arg2;
                    super.field3032[0] = 1;
                    super.field3039[0] = arg1;
                    return;
                }
            }
            super.field3036 = 0;
            super.field3037 = 0;
            super.field3038 = 0;
            super.field3030[0] = arg2;
            super.field3039[0] = arg1;
            super.field506 = (super.field3030[0] << 9) + (arg0 << 8);
            super.field503 = (super.field3039[0] << 9) - -(arg0 << 8);
            if (super.field3034 != null) {
                super.field3034.method1464();
            }
        }
    }

    @OriginalMember(owner = "client!pca", name = "d", descriptor = "(Loa;I)Lcd;")
    public final class564 method72(class43 arg0, int arg1) {
        ++field6920;
        return arg1 != 21098 ? null : null;
    }

    @OriginalMember(owner = "client!pca", name = "d", descriptor = "(B)V")
    public final void method77(byte arg0) {
        if (arg0 != 7) {
            this.method2827(51, 7, -9);
        }
        ++field6929;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(B)I")
    public final int method1276(byte arg0) {
        ++field6927;
        if (this.field6914.field9714 != null) {
            class699 var2 = this.field6914.method3823(class397.field5054, -32574);
            if (var2 != null && var2.field9754 != -1) {
                return var2.field9754;
            }
        }
        if (arg0 != -127) {
            this.field6914 = null;
        }
        return this.field6914.field9754;
    }

    @OriginalMember(owner = "client!pca", name = "f", descriptor = "(B)Z")
    public final boolean method2829(byte arg0) {
        ++field6930;
        int var2 = -106 / ((arg0 - -14) / 37);
        return this.field6914 != null;
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(BLjf;)V")
    public final void method2830(byte arg0, class699 arg1) {
        this.field6914 = arg1;
        ++field6919;
        if (super.field3034 != null) {
            super.field3034.method1464();
        }
        if (arg0 != -75) {
            this.field6914 = null;
        }
    }

    @OriginalMember(owner = "client!pca", name = "c", descriptor = "(Loa;I)V")
    public final void method67(class43 arg0, int arg1) {
        ++field6912;
        if (this.field6914 != null) {
            if (super.field3040 || this.method2826(true, 0, arg0)) {
                class151 var3 = arg0.method402();
                var3.method138(super.field2988.method2307(true));
                var3.method143(super.field506, super.field510 - 20, super.field503);
                this.method1428(super.field3035, arg0, super.field3040, arg1 + -106, var3);
                super.field3035[0] = super.field3035[1] = super.field3035[arg1] = super.field3035[3] = null;
            }
        }
    }

    @OriginalMember(owner = "client!pca", name = "c", descriptor = "(I)Z")
    public final boolean method78(int arg0) {
        if (arg0 != 0) {
            this.field6911 = 15;
        }
        ++field6915;
        return false;
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(Loa;B)Lpl;")
    public final class215 method71(class43 arg0, byte arg1) {
        ++field6913;
        if (this.field6914 != null && this.method2826(true, 2048, arg0)) {
            class151 var3 = arg0.method402();
            int var4 = super.field2988.method2307(true);
            var3.method138(var4);
            var3.method143(super.field506, super.field510 + -20, super.field503);
            class501 var5 = this.method1435((byte) -15);
            class699 var6 = this.field6914.field9714 != null ? this.field6914.method3823(class397.field5054, -32574) : this.field6914;
            if (class260.field3509.field1269 && var6.field9704 && var5.field6604) {
                class348 var7 = ~super.field3021 != 0 && ~super.field2939 == -1 ? class552.field7163.method3031(-116, super.field3021) : null;
                class348 var8 = super.field3025 == -1 || super.field2976 && var7 != null ? null : class552.field7163.method3031(45, super.field3025);
                int var9 = 0;
                if (super.field2954 != 0) {
                    var9 = this.method1421(-97);
                }
                class107 var10 = class99.method741(var8 != null ? super.field2941 : super.field3015, super.field2945, var4, super.field3035[0], var8 != null ? var8 : var7, this.field6914.field9750 & 255, arg0, this.field6914.field9735 & 65535, this.field6914.field9711, var9, super.field2942, 255 & this.field6914.field9748, super.field2995, false, 65535 & this.field6914.field9693);
                if (var10 != null) {
                    arg0.method391(false);
                    var10.method827(var3, (class108) null, 0);
                    arg0.method391(true);
                }
            }
            var3.method138(var4);
            var3.method143(super.field506, super.field510 + -5, super.field503);
            class215 var11 = null;
            if (this.method2825((byte) -63)) {
                var11 = class207.method1331(true, super.field3035.length);
            }
            int var12 = -95 / ((12 - arg1) / 41);
            this.method1428(super.field3035, arg0, false, -128, var3);
            if (super.field3034 != null) {
                class282 var13 = super.field3034.method1468();
                arg0.method349(super.field3035, var13, var3, var11 != null ? var11.field2770 : null, 0);
            } else {
                arg0.method366(super.field3035, var3, var11 == null ? null : var11.field2770, 0);
            }
            super.field3004 = class413.field5318;
            super.field3035[0] = super.field3035[1] = super.field3035[2] = super.field3035[3] = null;
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(IILoa;I)Z")
    public final boolean method74(int arg0, int arg1, class43 arg2, int arg3) {
        ++field6922;
        if (this.field6914 != null && this.method2826(true, 131072, arg2)) {
            class151 var5 = arg2.method402();
            int var6 = super.field2988.method2307(true);
            var5.method138(var6);
            var5.method143(super.field506, super.field510, super.field503);
            if (arg3 > -98) {
                return false;
            } else {
                boolean var7 = false;
                for (int var8 = 0; var8 < super.field3035.length; ++var8) {
                    if (super.field3035[var8] != null) {
                        boolean var9 = this.field6914.field9756 != -1 ? this.field6914.field9756 == 1 : this.field6914.field9711 == 1;
                        boolean var10 = super.field3035[var8].method832(arg1, arg0, var5, var9);
                        if (var10) {
                            var7 = true;
                            break;
                        }
                    }
                }
                super.field3035[0] = super.field3035[1] = super.field3035[2] = super.field3035[3] = null;
                return var7;
            }
        } else {
            return false;
        }
    }
}
