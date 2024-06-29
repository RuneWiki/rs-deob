import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class296 extends class32 {

    @OriginalMember(owner = "client!qg", name = "Kb", descriptor = "Lgd;")
    public static class206 field3948 = new class206(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

    @OriginalMember(owner = "client!qg", name = "Lb", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!qg", name = "Mb", descriptor = "I")
    private int field3950;

    @OriginalMember(owner = "client!qg", name = "Nb", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!qg", name = "Ob", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!qg", name = "Pb", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!qg", name = "Rb", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!qg", name = "Sb", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!qg", name = "Tb", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!qg", name = "Ub", descriptor = "I")
    public static int field3958;

    @OriginalMember(owner = "client!qg", name = "Vb", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!qg", name = "Wb", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!qg", name = "Xb", descriptor = "I")
    public static int field3961;

    @OriginalMember(owner = "client!qg", name = "Qb", descriptor = "Lsq;")
    private class108 field3954;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qg", name = "Yb", descriptor = "Ljava/lang/Class;")
    public static Class field3962;

    // $FF: synthetic method
    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1671(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "(I)I", line = 6)
    public final int method1660(int arg0) {
        ++field3957;
        int var2 = 255 & super.field472[super.field456++] + -this.field3954.method666((byte) 63);
        if (~var2 > -129) {
            return var2;
        } else {
            if (arg0 != 17529) {
                this.field3950 = -31;
            }
            return (super.field472[super.field456++] - this.field3954.method666((byte) 63) & 255) + (var2 + -128 << 8);
        }
    }

    @OriginalMember(owner = "client!qg", name = "r", descriptor = "(B)V", line = 26)
    public final void method1661(byte arg0) {
        ++field3961;
        super.field456 = (this.field3950 + 7) / 8;
        if (arg0 >= -23) {
            this.field3954 = null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "([BIII)V", line = 38)
    public final void method1662(byte[] arg0, int arg1, int arg2, int arg3) {
        ++field3949;
        if (arg2 != -4658) {
            field3948 = null;
        }
        for (int var5 = 0; var5 < arg1; ++var5) {
            arg0[arg3 + var5] = (byte) (super.field472[super.field456++] + -this.field3954.method666((byte) 63));
        }
    }

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "(II)V", line = 55)
    public final void method1663(int arg0, int arg1) {
        if (arg1 <= 103) {
            field3958 = 110;
        }
        ++field3951;
        super.field472[super.field456++] = (byte) (this.field3954.method666((byte) 63) + arg0);
    }

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "(BI)I", line = 71)
    public final int method1664(byte arg0, int arg1) {
        ++field3959;
        int var3 = this.field3950 >> 3;
        int var4 = 8 - (this.field3950 & 7);
        this.field3950 += arg1;
        if (arg0 != -13) {
            this.method1666((byte) 26);
        }
        int var5 = 0;
        while (var4 < arg1) {
            var5 += (super.field472[var3++] & class239.field3189[var4]) << -var4 + arg1;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg1 == var4) {
            var6 = (class239.field3189[var4] & super.field472[var3]) + var5;
        } else {
            var6 = (super.field472[var3] >> -arg1 + var4 & class239.field3189[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "(I)V", line = 102)
    public final void method1665(int arg0) {
        ++field3956;
        this.field3950 = super.field456 * 8;
        if (arg0 != -2) {
            this.method1662((byte[]) null, -98, 100, -96);
        }
    }

    @OriginalMember(owner = "client!qg", name = "s", descriptor = "(B)Z", line = 122)
    public final boolean method1666(byte arg0) {
        ++field3960;
        int var2 = super.field472[super.field456] + -this.field3954.method665(110) & 255;
        if (arg0 > -77) {
            return true;
        } else {
            return ~var2 <= -129;
        }
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(I)V", line = 139)
    public class296(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "([IB)V", line = 147)
    public final void method1667(int[] arg0, byte arg1) {
        ++field3955;
        this.field3954 = new class108(arg0);
        if (arg1 != 85) {
            this.field3950 = 55;
        }
    }

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "(I)V", line = 161)
    public static void method1668(int arg0) {
        field3948 = null;
        if (arg0 != -13077) {
            field3958 = -102;
        }
    }

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "(BI)I", line = 171)
    public final int method1669(byte arg0, int arg1) {
        if (arg0 > -17) {
            return -56;
        } else {
            ++field3953;
            return arg1 * 8 + -this.field3950;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIILwm;IIBII)V", line = 185)
    public static final void method1670(int arg0, int arg1, int arg2, class364 arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
        ++field3952;
        class381 var9 = (class381) class413.method2478(arg7, arg4, arg8);
        if (arg6 != 50) {
            field3958 = 58;
        }
        if (var9 != null) {
            class88 var10 = class1.field23.method935(var9.method13(62), (byte) -60);
            int var11 = 3 & var9.method9(arg6 ^ -819);
            int var12 = var9.method4(-10666);
            if (var10.field1235 == -1) {
                int var13 = arg1;
                if (var10.field1265 > 0) {
                    var13 = arg0;
                }
                if (var12 == 0 || ~var12 == -3) {
                    if (var11 != 0) {
                        if (var11 == 1) {
                            arg3.method2224(arg2, arg6 + 16334, 4, arg5, var13);
                        } else if (~var11 == -3) {
                            arg3.method2215(var13, arg2 + 3, arg5, 4, (byte) -110);
                        } else if (~var11 == -4) {
                            arg3.method2224(arg2, 16384, 4, arg5 + 3, var13);
                        }
                    } else {
                        arg3.method2215(var13, arg2, arg5, 4, (byte) -82);
                    }
                }
                if (~var12 == -4) {
                    if (var11 != 0) {
                        if (var11 != 1) {
                            if (var11 == 2) {
                                arg3.method2222(1, arg2 + 3, arg5 - -3, var13, 127, 1);
                            } else if (~var11 == -4) {
                                arg3.method2222(1, arg2, arg5 + 3, var13, 98, 1);
                            }
                        } else {
                            arg3.method2222(1, arg2 + 3, arg5, var13, 102, 1);
                        }
                    } else {
                        arg3.method2222(1, arg2, arg5, var13, 104, 1);
                    }
                }
                if (~var12 == -3) {
                    if (~var11 != -1) {
                        if (~var11 != -2) {
                            if (~var11 == -3) {
                                arg3.method2224(arg2, 16384, 4, arg5 + 3, var13);
                            } else if (var11 == 3) {
                                arg3.method2215(var13, arg2, arg5, 4, (byte) -85);
                            }
                        } else {
                            arg3.method2215(var13, arg2 - -3, arg5, 4, (byte) -96);
                        }
                    } else {
                        arg3.method2224(arg2, arg6 ^ 16434, 4, arg5, var13);
                    }
                }
            } else {
                class444.method2607(var11, var10, arg5, arg2, arg3, false);
            }
        }
        class381 var14 = (class381) class4.method29(arg7, arg4, arg8, field3962 != null ? field3962 : (field3962 = method1671("id")));
        if (var14 != null) {
            class88 var15 = class1.field23.method935(var14.method13(98), (byte) 49);
            int var16 = var14.method9(arg6 + -819) & 3;
            int var17 = var14.method4(arg6 + -10716);
            if (var15.field1235 == -1) {
                if (~var17 == -10) {
                    int var18 = -1118482;
                    if (var15.field1265 > 0) {
                        var18 = -1179648;
                    }
                    if (var16 != 0 && ~var16 != -3) {
                        arg3.method2220(arg5, arg2 + 3, arg2, arg6 + 7990, var18, arg5 + 3);
                    } else {
                        arg3.method2220(arg5 + 3, arg2 + 3, arg2, 8040, var18, arg5);
                    }
                }
            } else {
                class444.method2607(var16, var15, arg5, arg2, arg3, false);
            }
        }
        class381 var19 = (class381) class146.method870(arg7, arg4, arg8);
        if (var19 != null) {
            class88 var20 = class1.field23.method935(var19.method13(65), (byte) 79);
            int var21 = 3 & var19.method9(-769);
            if (var20.field1235 != -1) {
                class444.method2607(var21, var20, arg5, arg2, arg3, false);
                return;
            }
        }
    }
}
