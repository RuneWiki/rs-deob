import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class426 extends class465 implements class49 {

    @OriginalMember(owner = "client!vm", name = "T", descriptor = "Z")
    private boolean field6046;

    @OriginalMember(owner = "client!vm", name = "lb", descriptor = "Z")
    private boolean field6064;

    @OriginalMember(owner = "client!vm", name = "ab", descriptor = "B")
    private byte field6053;

    @OriginalMember(owner = "client!vm", name = "hb", descriptor = "B")
    private byte field6060;

    @OriginalMember(owner = "client!vm", name = "gb", descriptor = "S")
    private short field6059;

    @OriginalMember(owner = "client!vm", name = "V", descriptor = "Z")
    private boolean field6048;

    @OriginalMember(owner = "client!vm", name = "I", descriptor = "Z")
    private boolean field6035;

    @OriginalMember(owner = "client!vm", name = "S", descriptor = "Lda;")
    public class473 field6045;

    @OriginalMember(owner = "client!vm", name = "Q", descriptor = "Lha;")
    private class120 field6043;

    @OriginalMember(owner = "client!vm", name = "X", descriptor = "[Lej;")
    public static class479[] field6050 = new class479[14];

    @OriginalMember(owner = "client!vm", name = "H", descriptor = "I")
    public static int field6034;

    @OriginalMember(owner = "client!vm", name = "J", descriptor = "I")
    public static int field6036;

    @OriginalMember(owner = "client!vm", name = "L", descriptor = "I")
    public static int field6038;

    @OriginalMember(owner = "client!vm", name = "M", descriptor = "I")
    public static int field6039;

    @OriginalMember(owner = "client!vm", name = "N", descriptor = "I")
    public static int field6040;

    @OriginalMember(owner = "client!vm", name = "O", descriptor = "I")
    public static int field6041;

    @OriginalMember(owner = "client!vm", name = "P", descriptor = "I")
    public static int field6042;

    @OriginalMember(owner = "client!vm", name = "R", descriptor = "I")
    public static int field6044;

    @OriginalMember(owner = "client!vm", name = "U", descriptor = "I")
    public static int field6047;

    @OriginalMember(owner = "client!vm", name = "W", descriptor = "I")
    public static int field6049;

    @OriginalMember(owner = "client!vm", name = "Y", descriptor = "I")
    public static int field6051;

    @OriginalMember(owner = "client!vm", name = "Z", descriptor = "I")
    public static int field6052;

    @OriginalMember(owner = "client!vm", name = "bb", descriptor = "I")
    public static int field6054;

    @OriginalMember(owner = "client!vm", name = "cb", descriptor = "I")
    public static int field6055;

    @OriginalMember(owner = "client!vm", name = "db", descriptor = "I")
    public static int field6056;

    @OriginalMember(owner = "client!vm", name = "eb", descriptor = "I")
    public static int field6057;

    @OriginalMember(owner = "client!vm", name = "fb", descriptor = "I")
    public static int field6058;

    @OriginalMember(owner = "client!vm", name = "ib", descriptor = "I")
    public static int field6061;

    @OriginalMember(owner = "client!vm", name = "jb", descriptor = "I")
    public static int field6062;

    @OriginalMember(owner = "client!vm", name = "kb", descriptor = "I")
    public static int field6063;

    @OriginalMember(owner = "client!vm", name = "mb", descriptor = "I")
    public static int field6065;

    @OriginalMember(owner = "client!vm", name = "nb", descriptor = "I")
    public static int field6066;

    @OriginalMember(owner = "client!vm", name = "ob", descriptor = "I")
    public static int field6067;

    @OriginalMember(owner = "client!vm", name = "K", descriptor = "Llf;")
    private class676 field6037;

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(Lr;I)V", line = 4)
    public final void method230(class564 arg0, int arg1) {
        ++field6036;
        Object var3 = null;
        if (arg1 != 21670) {
            this.method237(true);
        }
        class120 var5;
        if (this.field6043 == null && this.field6035) {
            class65 var4 = this.method2462(arg0, 262144, arg1 + -21783, true);
            var5 = var4 == null ? null : var4.field664;
        } else {
            var5 = this.field6043;
            this.field6043 = null;
        }
        if (var5 != null) {
            class254.method1500(var5, super.field5169, super.field5179, super.field5176, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIILrb;Lr;Z)V", line = 32)
    public final void method184(int arg0, int arg1, int arg2, int arg3, class383 arg4, class564 arg5, boolean arg6) {
        if (!(arg4 instanceof class426)) {
            if (arg4 instanceof class156) {
                class156 var8 = (class156) arg4;
                if (this.field6045 != null && var8.field1733 != null) {
                    this.field6045.method1916(var8.field1733, arg1, arg0, arg3, arg6);
                }
            }
        } else {
            class426 var9 = (class426) arg4;
            if (this.field6045 != null && var9.field6045 != null) {
                this.field6045.method1916(var9.field6045, arg1, arg0, arg3, arg6);
            }
        }
        ++field6058;
        if (arg2 != 2) {
            this.method238(-95);
        }
    }

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "(B)Z", line = 65)
    public final boolean method183(byte arg0) {
        int var2 = -17 / ((arg0 - 12) / 62);
        ++field6047;
        return this.field6046;
    }

    @OriginalMember(owner = "client!vm", name = "h", descriptor = "(I)Z", line = 78)
    public final boolean method180(int arg0) {
        ++field6063;
        if (arg0 != -1) {
            this.method179(95);
        }
        return true;
    }

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "(Lr;I)Llf;", line = 89)
    public final class676 method185(class564 arg0, int arg1) {
        if (this.field6037 == null) {
            this.field6037 = class191.method1166(0, super.field5176, this.method2460((byte) -38, 0, arg0), super.field5178, super.field5179);
        }
        if (arg1 <= 42) {
            this.field6059 = 121;
        }
        ++field6041;
        return this.field6037;
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Lr;Lqp;IIIIIZIIZ)V", line = 104)
    public class426(class564 arg0, class638 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, boolean arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class661.method3676(arg9, 2870, arg8));
        super.field5176 = arg6;
        this.field6046 = arg10;
        this.field6064 = ~arg1.field9035 != -1 && !arg7;
        this.field6053 = (byte) arg8;
        this.field6060 = (byte) arg9;
        this.field6059 = (short) arg1.field9021;
        super.field5179 = arg4;
        this.field6048 = arg7;
        this.field6035 = arg0.method972() && arg1.field9067 && !this.field6048 && class639.field9075.method2720((byte) -95, class430.field6109) != 0;
        int var12 = 2048;
        if (this.field6046) {
            var12 |= 65536;
        }
        class65 var13 = this.method2462(arg0, var12, 110, this.field6035);
        if (var13 != null) {
            this.field6045 = var13.field665;
            this.field6043 = var13.field664;
            if (this.field6046) {
                this.field6045 = this.field6045.method1877((byte) 0, var12, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "(I)I", line = 142)
    public final int method179(int arg0) {
        if (arg0 != 3370) {
            this.field6060 = 117;
        }
        ++field6066;
        return this.field6045 == null ? 0 : this.field6045.method1869();
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(B)Z", line = 155)
    public final boolean method236(byte arg0) {
        if (arg0 >= -33) {
            this.field6060 = -71;
        }
        ++field6056;
        return this.field6035;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lr;Z)V", line = 167)
    public final void method172(class564 arg0, boolean arg1) {
        if (!arg1) {
            ++field6055;
        }
    }

    @OriginalMember(owner = "client!vm", name = "i", descriptor = "(I)Z", line = 178)
    public final boolean method177(int arg0) {
        ++field6054;
        if (arg0 >= -103) {
            return true;
        } else {
            return this.field6045 != null ? this.field6045.method1913() : false;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(ZC)Z", line = 193)
    public static final boolean method2459(boolean arg0, char arg1) {
        ++field6049;
        if (!arg0) {
            method2463(62);
        }
        return arg1 == 160 || arg1 == ' ' || arg1 == '_' || ~arg1 == -46;
    }

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "(Lr;I)Lwj;", line = 211)
    public final class315 method182(class564 arg0, int arg1) {
        if (arg1 != 0) {
            this.field6043 = null;
        }
        ++field6034;
        if (this.field6045 == null) {
            return null;
        } else {
            class490 var3 = arg0.method950();
            var3.method23(super.field5179, super.field5178, super.field5176);
            class315 var4 = null;
            if (this.field6064) {
                var4 = class419.method2349((byte) 125, 1);
            }
            if (class460.field6553) {
                this.field6045.method1875(var3, var4 != null ? var4.field3912[0] : null, class682.field9623, 0);
            } else {
                this.field6045.method1914(var3, var4 != null ? var4.field3912[0] : null, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lr;III)Z", line = 240)
    public final boolean method173(class564 arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 0) {
            return false;
        } else {
            ++field6051;
            class473 var5 = this.method2460((byte) -60, 131072, arg0);
            if (var5 != null) {
                class490 var6 = arg0.method950();
                var6.method23(super.field5179, super.field5178, super.field5176);
                return class460.field6553 ? var5.method1896(arg1, arg3, var6, false, class682.field9623) : var5.method1867(arg1, arg3, var6, false);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(BILr;)Lda;", line = 263)
    private final class473 method2460(byte arg0, int arg1, class564 arg2) {
        int var4 = -33 % ((82 - arg0) / 38);
        ++field6057;
        if (this.field6045 != null && ~arg2.method973(this.field6045.method1861(), arg1) == -1) {
            return this.field6045;
        } else {
            class65 var5 = this.method2462(arg2, arg1, -30, false);
            return var5 == null ? null : var5.field665;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IB)Lfg;", line = 287)
    public static final class174 method2461(int arg0, byte arg1) {
        if (arg1 != -24) {
            method2459(true, (char) 65452);
        }
        ++field6061;
        if (arg0 != 0) {
            if (arg0 == 1) {
                if ((double) class482.field6942 == 3.0D) {
                    return class681.field9605;
                }
                if ((double) class482.field6942 == 4.0D) {
                    return class268.field3334;
                }
                if ((double) class482.field6942 == 6.0D) {
                    return class313.field3888;
                }
                if ((double) class482.field6942 >= 8.0D) {
                    return class611.field8613;
                }
            } else if (~arg0 == -3) {
                if ((double) class482.field6942 == 3.0D) {
                    return class313.field3888;
                }
                if ((double) class482.field6942 == 4.0D) {
                    return class611.field8613;
                }
                if ((double) class482.field6942 == 6.0D) {
                    return class409.field5465;
                }
                if ((double) class482.field6942 >= 8.0D) {
                    return class696.field9774;
                }
            }
        } else {
            if ((double) class482.field6942 == 3.0D) {
                return class519.field7381;
            }
            if ((double) class482.field6942 == 4.0D) {
                return class442.field6249;
            }
            if ((double) class482.field6942 == 6.0D) {
                return class681.field9605;
            }
            if ((double) class482.field6942 >= 8.0D) {
                return class268.field3334;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)I", line = 354)
    public final int method241(byte arg0) {
        if (arg0 != 29) {
            return -19;
        } else {
            ++field6067;
            return this.field6053;
        }
    }

    @OriginalMember(owner = "client!vm", name = "j", descriptor = "(I)V", line = 365)
    public final void method170(int arg0) {
        ++field6038;
        if (arg0 > 20) {
            this.field6046 = false;
            if (this.field6045 != null) {
                this.field6045.method1907(this.field6045.method1861() & -65537);
            }
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V", line = 380)
    public final void method234(int arg0) {
        if (this.field6045 != null) {
            this.field6045.method1872();
        }
        ++field6065;
        if (arg0 > -51) {
            method2459(false, 'p');
        }
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(I)I", line = 395)
    public final int method238(int arg0) {
        ++field6042;
        if (arg0 != 6518) {
            this.method230((class564) null, -70);
        }
        return 65535 & this.field6059;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lr;I)V", line = 414)
    public final void method232(class564 arg0, int arg1) {
        ++field6040;
        Object var3 = null;
        if (arg1 != 6905) {
            this.method182((class564) null, -54);
        }
        class120 var5;
        if (this.field6043 == null && this.field6035) {
            class65 var4 = this.method2462(arg0, 262144, arg1 ^ -6800, true);
            var5 = var4 != null ? var4.field664 : null;
        } else {
            var5 = this.field6043;
            this.field6043 = null;
        }
        if (var5 != null) {
            class249.method1467(var5, super.field5169, super.field5179, super.field5176, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "(B)I", line = 442)
    public final int method175(byte arg0) {
        ++field6039;
        if (arg0 < 119) {
            method2459(true, (char) 65476);
        }
        return this.field6045 == null ? 0 : this.field6045.method1868();
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Z)I", line = 453)
    public final int method237(boolean arg0) {
        ++field6052;
        if (arg0) {
            this.method185((class564) null, 40);
        }
        return this.field6060;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lr;IIZ)Lhi;", line = 465)
    private final class65 method2462(class564 arg0, int arg1, int arg2, boolean arg3) {
        ++field6044;
        class638 var5 = class364.field4891.method2134(this.field6059 & 65535, true);
        int var6 = 52 % ((39 - arg2) / 54);
        class274 var7;
        class274 var8;
        if (this.field6048) {
            var7 = class666.field9303[super.field5169];
            var8 = class385.field5193[0];
        } else {
            var7 = class385.field5193[super.field5169];
            if (super.field5169 >= 3) {
                var8 = null;
            } else {
                var8 = class385.field5193[super.field5169 + 1];
            }
        }
        return var5.method3584(super.field5179, super.field5178, arg0, super.field5176, var7, arg1, this.field6053, (byte) -91, arg3, this.field6060, var8);
    }

    @OriginalMember(owner = "client!vm", name = "m", descriptor = "(I)V", line = 494)
    public static void method2463(int arg0) {
        field6050 = null;
        if (arg0 != -5924) {
            method2459(true, (char) 65504);
        }
    }
}
