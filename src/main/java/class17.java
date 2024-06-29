import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class17 extends class275 {

    @OriginalMember(owner = "client!ub", name = "Ic", descriptor = "I")
    public int field282 = -1;

    @OriginalMember(owner = "client!ub", name = "Oc", descriptor = "I")
    public int field288 = -1;

    @OriginalMember(owner = "client!ub", name = "Mc", descriptor = "[Z")
    public static boolean[] field286;

    @OriginalMember(owner = "client!ub", name = "yc", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!ub", name = "zc", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!ub", name = "Bc", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!ub", name = "Cc", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!ub", name = "Dc", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!ub", name = "Ec", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!ub", name = "Fc", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!ub", name = "Gc", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!ub", name = "Hc", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!ub", name = "Jc", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!ub", name = "Kc", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!ub", name = "Lc", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!ub", name = "Nc", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!ub", name = "Pc", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!ub", name = "Qc", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!ub", name = "Rc", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!ub", name = "Sc", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!ub", name = "Tc", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!ub", name = "Ac", descriptor = "Lmv;")
    public class258 field274;

    static {
        new class446("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
        field286 = new boolean[5];
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)Z", line = 4)
    public static final boolean method165(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            method169((byte) 46);
        }
        ++field281;
        return (540800 & arg0) != 0;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILa;IIILqa;Z)V", line = 20)
    public final void method166(int arg0, class444 arg1, int arg2, int arg3, int arg4, class165 arg5, boolean arg6) {
        if (arg2 >= -4) {
            this.field282 = -54;
        }
        ++field279;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILmv;)V", line = 32)
    public final void method167(int arg0, class258 arg1) {
        this.field274 = arg1;
        ++field292;
        if (arg0 == 8046) {
            if (super.field3911 != null) {
                super.field3911.method1529();
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BIIIIZ)V", line = 47)
    public final void method168(byte arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        super.field1866 = (byte) arg4;
        ++field287;
        if (~super.field3871 != 0 && ~class201.field2707.method489(arg0 + 23, super.field3871).field1314 == -2) {
            super.field3871 = -1;
        }
        if (~super.field3850 != 0) {
            class11 var7 = class239.field3360.method2836((byte) 83, super.field3850);
            if (var7.field201 && var7.field192 != -1 && class201.field2707.method489(127, var7.field192).field1314 == 1) {
                super.field3850 = -1;
            }
        }
        if (super.field3863 != -1) {
            class11 var8 = class239.field3360.method2836((byte) 48, super.field3863);
            if (var8.field201 && var8.field192 != -1 && ~class201.field2707.method489(122, var8.field192).field1314 == -2) {
                super.field3863 = -1;
            }
        }
        if (!arg5) {
            int var9 = arg2 - super.field3917[0];
            int var10 = arg3 - super.field3915[0];
            if (~var9 <= 7 && var9 <= 8 && var10 >= -8 && var10 <= 8) {
                if (super.field3918 < 9) {
                    ++super.field3918;
                }
                for (int var11 = super.field3918; ~var11 < -1; --var11) {
                    super.field3917[var11] = super.field3917[var11 + -1];
                    super.field3915[var11] = super.field3915[var11 + -1];
                    super.field3908[var11] = super.field3908[var11 - 1];
                }
                super.field3917[0] = arg2;
                super.field3915[0] = arg3;
                super.field3908[0] = 1;
                return;
            }
        }
        super.field3910 = 0;
        super.field3914 = 0;
        super.field3917[0] = arg2;
        super.field3918 = 0;
        super.field3915[0] = arg3;
        if (arg0 != 85) {
            this.method135(true, (class165) null);
        }
        super.field1867 = (super.field3917[0] << 7) + (arg1 << 6);
        super.field1862 = (super.field3915[0] << 7) + (arg1 << 6);
        if (super.field3911 != null) {
            super.field3911.method1529();
        }
    }

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "(B)V", line = 126)
    public static void method169(byte arg0) {
        field286 = null;
        if (arg0 < 41) {
            field286 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BIILqa;)Z", line = 149)
    public final boolean method138(byte arg0, int arg1, int arg2, class165 arg3) {
        ++field289;
        if (this.field274 != null && this.method173(131072, arg3, -98)) {
            class14 var5 = arg3.method751();
            int var6 = super.field3840.method1008(52);
            var5.method150(var6);
            if (arg0 < 121) {
                this.field274 = null;
            }
            var5.method146(super.field1867, super.field1873, super.field1862);
            boolean var7 = false;
            for (int var8 = 0; var8 < super.field3912.length; ++var8) {
                if (super.field3912[var8] != null && super.field3912[var8].method68(arg2, arg1, var5, ~this.field274.field3586 == -2)) {
                    var7 = true;
                    break;
                }
            }
            super.field3912[0] = super.field3912[1] = super.field3912[2] = super.field3912[3] = null;
            return var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(I)I", line = 187)
    public final int method170(int arg0) {
        ++field277;
        if (arg0 != -1) {
            this.method172(-41);
        }
        if (this.field274.field3627 != null) {
            class258 var2 = this.field274.method1660(class288.field4208, (byte) 74);
            if (var2 != null && ~var2.field3593 != 0) {
                return var2.field3593;
            }
        }
        return this.field274.field3593;
    }

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "(B)Z", line = 209)
    private final boolean method171(byte arg0) {
        int var2 = 79 % ((-30 - arg0) / 43);
        ++field290;
        return this.field274.field3596;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(ZLqa;)V", line = 219)
    public final void method135(boolean arg0, class165 arg1) {
        ++field291;
        if (this.field274 != null) {
            if (super.field3913 || this.method173(0, arg1, -82)) {
                this.method1763((byte) 125, arg1, super.field3912, super.field3913);
                super.field3912[0] = super.field3912[1] = super.field3912[2] = super.field3912[3] = null;
                if (arg0) {
                    this.field288 = -12;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "(I)Z", line = 243)
    public final boolean method172(int arg0) {
        ++field276;
        if (arg0 != 22386) {
            this.field274 = null;
        }
        return this.field274 != null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILqa;I)Z", line = 258)
    private final boolean method173(int arg0, class165 arg1, int arg2) {
        ++field285;
        int var4 = arg0;
        class485 var5 = this.method1759(-63);
        class91 var6 = ~super.field3871 != 0 && ~super.field3886 == -1 ? class201.field2707.method489(48, super.field3871) : null;
        class91 var7 = ~super.field3839 == 0 || super.field3829 && var6 != null ? null : class201.field2707.method489(125, super.field3839);
        int var8 = var5.field7143;
        int var9 = var5.field7155;
        if (~var8 != -1 || ~var9 != -1 || ~var5.field7168 != -1 || var5.field7160 != 0) {
            arg0 |= 7;
        }
        int var10 = 108 % ((-15 - arg2) / 40);
        boolean var11 = ~super.field3825 != -1 && class393.field6017 >= super.field3903 && super.field3896 > class393.field6017;
        if (var11) {
            arg0 |= 524288;
        }
        class334 var12 = super.field3912[0] = this.field274.method1659(super.field3877, super.field3834, class201.field2707, super.field3880, var7, arg1, arg0, super.field3827, super.field3842, var6, super.field3901, class288.field4208, super.field3818, 9, class509.field7483);
        if (var12 == null) {
            return false;
        } else {
            super.field3888 = var12.method77();
            this.method1772(0, var12);
            int var13 = super.field3840.method1008(52);
            if (~var8 == -1 && var9 == 0) {
                this.method1767(0, 117, var13, this.method637((byte) -117) << 7, 0, this.method637((byte) 83) << 7);
            } else {
                this.method1767(var5.field7147, 121, var13, var8, var5.field7139, var9);
                if (~super.field3822 != -1) {
                    super.field3912[0].method63(super.field3822);
                }
                if (~super.field3856 != -1) {
                    super.field3912[0].method36(super.field3856);
                }
                if (~super.field3815 != -1) {
                    super.field3912[0].method66(0, super.field3815, 0);
                }
            }
            if (var11) {
                var12.method78(super.field3873, super.field3826, super.field3881, 255 & super.field3825);
            }
            if (~super.field3850 != 0 && super.field3821 != -1) {
                class11 var14 = class239.field3360.method2836((byte) 15, super.field3850);
                boolean var15 = ~var14.field188 == -4 && (var8 != 0 || var9 != 0);
                int var16 = var4;
                if (var15) {
                    var16 = var4 | 7;
                } else {
                    if (~super.field3899 != -1) {
                        var16 = var4 | 5;
                    }
                    if (super.field3894 != 0) {
                        var16 |= 2;
                    }
                }
                class334 var17 = super.field3912[1] = var14.method110(arg1, super.field3821, super.field3861, var16, super.field3874, class201.field2707, (byte) 124);
                if (var17 != null) {
                    if (super.field3894 != 0) {
                        var17.method66(0, -super.field3894 << 0, 0);
                    }
                    if (~super.field3899 != -1) {
                        var17.method44(super.field3899 * 2048);
                    }
                    if (var15) {
                        if (~super.field3822 != -1) {
                            var17.method63(super.field3822);
                        }
                        if (super.field3856 != 0) {
                            var17.method36(super.field3856);
                        }
                        if (~super.field3815 != -1) {
                            var17.method66(0, super.field3815, 0);
                        }
                    }
                }
            } else {
                super.field3912[1] = null;
            }
            if (~super.field3863 != 0 && super.field3892 != -1) {
                class11 var18 = class239.field3360.method2836((byte) 105, super.field3863);
                boolean var19 = ~var18.field188 == -4 && (~var8 != -1 || var9 != 0);
                int var20 = var4;
                if (var19) {
                    var20 = var4 | 7;
                } else {
                    if (~super.field3837 != -1) {
                        var20 = var4 | 5;
                    }
                    if (~super.field3864 != -1) {
                        var20 |= 2;
                    }
                }
                class334 var21 = super.field3912[3] = var18.method109(super.field3892, 5, var20, super.field3847, arg1, super.field3846, class201.field2707);
                if (var21 != null) {
                    if (~super.field3864 != -1) {
                        var21.method66(0, -super.field3864 << 0, 0);
                    }
                    if (~super.field3837 != -1) {
                        var21.method44(super.field3837 * 2048);
                    }
                    if (var19) {
                        if (super.field3822 != 0) {
                            var21.method63(super.field3822);
                        }
                        if (super.field3856 != 0) {
                            var21.method36(super.field3856);
                        }
                        if (~super.field3815 != -1) {
                            var21.method66(0, super.field3815, 0);
                        }
                    }
                }
            } else {
                super.field3912[3] = null;
            }
            super.field3912[2] = null;
            if (super.field3909 != null) {
                if (~class393.field6017 > ~super.field3909.field4188) {
                    if (super.field3909.field4180 <= class393.field6017) {
                        class334 var22 = super.field3909.method1839((byte) 24, arg1, 7 | var4);
                        if (var22 != null) {
                            var22.method66(super.field3909.field4191 - super.field1867, -super.field1873 + super.field3909.field4185, -super.field1862 + super.field3909.field4196);
                            if (~var13 != -1) {
                                var22.method44(var13);
                            }
                            super.field3912[2] = var22;
                        }
                    }
                } else {
                    super.field3909 = null;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)I", line = 453)
    public final int method174(byte arg0) {
        ++field278;
        if (arg0 > -126) {
            this.method166(107, (class444) null, -106, -32, 127, (class165) null, true);
        }
        return super.field3888;
    }

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "(I)V", line = 466)
    public final void method175(int arg0) {
        ++field272;
        if (arg0 == 0) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(Z)Z", line = 477)
    public final boolean method176(boolean arg0) {
        if (!arg0) {
            return false;
        } else {
            ++field283;
            return false;
        }
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(Z)I", line = 488)
    public final int method177(boolean arg0) {
        ++field280;
        if (arg0) {
            this.field288 = -106;
        }
        if (this.field274.field3627 != null) {
            class258 var2 = this.field274.method1660(class288.field4208, (byte) 74);
            if (var2 != null && ~var2.field3569 != 0) {
                return var2.field3569;
            }
        }
        return this.field274.field3569;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIB)V", line = 511)
    public final void method178(int arg0, int arg1, byte arg2) {
        ++field293;
        int var4 = super.field3917[0];
        int var5 = super.field3915[0];
        if (~arg0 == -1) {
            ++var5;
        }
        if (arg0 == 1) {
            ++var4;
            ++var5;
        }
        if (~arg0 == -3) {
            ++var4;
        }
        if (~arg0 == -4) {
            --var5;
            ++var4;
        }
        if (~arg0 == -5) {
            --var5;
        }
        if (arg0 == 5) {
            --var4;
            --var5;
        }
        if (~arg0 == -7) {
            --var4;
        }
        if (~arg0 == -8) {
            --var4;
            ++var5;
        }
        if (~super.field3871 != 0 && ~class201.field2707.method489(28, super.field3871).field1314 == -2) {
            super.field3871 = -1;
        }
        if (super.field3850 != -1) {
            class11 var6 = class239.field3360.method2836((byte) -98, super.field3850);
            if (var6.field201 && ~var6.field192 != 0 && ~class201.field2707.method489(17, var6.field192).field1314 == -2) {
                super.field3850 = -1;
            }
        }
        if (arg2 <= -49) {
            if (~super.field3863 != 0) {
                class11 var7 = class239.field3360.method2836((byte) -104, super.field3863);
                if (var7.field201 && ~var7.field192 != 0 && class201.field2707.method489(127, var7.field192).field1314 == 1) {
                    super.field3863 = -1;
                }
            }
            if (~super.field3918 > -10) {
                ++super.field3918;
            }
            for (int var8 = super.field3918; ~var8 < -1; --var8) {
                super.field3917[var8] = super.field3917[var8 + -1];
                super.field3915[var8] = super.field3915[var8 + -1];
                super.field3908[var8] = super.field3908[var8 + -1];
            }
            super.field3917[0] = var4;
            super.field3908[0] = (byte) arg1;
            super.field3915[0] = var5;
        }
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)I", line = 606)
    public final int method179(int arg0) {
        ++field273;
        if (arg0 != 10544) {
            this.field282 = 38;
        }
        if (this.field274.field3627 != null) {
            class258 var2 = this.field274.method1660(class288.field4208, (byte) 74);
            if (var2 != null && var2.field3615 != -1) {
                return var2.field3615;
            }
        }
        return this.field274.field3615 != -1 ? this.field274.field3615 : super.method179(10544);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILqa;)Lou;", line = 631)
    public final class437 method136(int arg0, class165 arg1) {
        ++field284;
        if (this.field274 != null && this.method173(2048, arg1, 55)) {
            class14 var3 = arg1.method751();
            int var4 = super.field3840.method1008(97);
            var3.method150(var4);
            var3.method146(super.field1867, super.field1873, super.field1862);
            class485 var5 = this.method1759(75);
            class258 var6 = this.field274.field3627 == null ? this.field274 : this.field274.method1660(class288.field4208, (byte) 74);
            if (class203.field2716.field1153 && var6.field3618 && var5.field7188) {
                class91 var7 = super.field3871 != -1 && super.field3886 == 0 ? class201.field2707.method489(61, super.field3871) : null;
                class91 var8 = super.field3839 == -1 || super.field3829 && var7 != null ? null : class201.field2707.method489(arg0 + 73, super.field3839);
                int var9 = 0;
                if (~super.field3890 != -1) {
                    var9 = this.method1761((byte) 117);
                }
                class334 var10 = class222.method1500(var4, var8 != null ? super.field3818 : super.field3842, this.field274.field3592 & 65535, super.field3815, this.field274.field3605 & 65535, arg1, (byte) -62, var8 == null ? var7 : var8, super.field3856, 255 & this.field274.field3600, this.field274.field3624 & 255, super.field3822, var9, this.field274.field3586, super.field3912[0]);
                if (var10 != null) {
                    float var11 = arg1.method784();
                    float var12 = arg1.method741();
                    arg1.method814(false);
                    arg1.method748(var11, var12 + -150.0F);
                    var10.method53(var3, (class302) null, 0);
                    arg1.method748(var11, var12);
                    arg1.method814(true);
                }
            }
            class437 var13 = null;
            if (this.method171((byte) -115)) {
                var13 = class530.method3133(false, super.field3912.length);
            }
            if (super.field3911 == null) {
                arg1.method809(super.field3912, var3, var13 == null ? null : var13.field6608, 0);
            } else {
                class137 var14 = super.field3911.method1533();
                arg1.method807(super.field3912, var14, var3, var13 != null ? var13.field6608 : null, 0);
            }
            this.method1763((byte) 84, arg1, super.field3912, false);
            if (super.field3912[2] != null) {
                if (var4 != 0) {
                    super.field3912[2].method44(var4);
                }
                super.field3912[2].method66(super.field1867 - super.field3909.field4191, -super.field3909.field4185 + super.field1873, super.field1862 - super.field3909.field4196);
            }
            super.field3824 = class206.field2765;
            super.field3912[arg0] = super.field3912[1] = super.field3912[2] = super.field3912[3] = null;
            return var13;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(III)V", line = 711)
    public static final void method180(int arg0, int arg1, int arg2) {
        ++field275;
        class177 var3 = class344.method2229(arg0, arg1, (byte) 116);
        var3.method1191(107);
        var3.field2372 = arg2;
    }
}
