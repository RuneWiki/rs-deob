import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mda")
public class class278 extends class481 implements class602 {

    @OriginalMember(owner = "client!mda", name = "S", descriptor = "B")
    private byte field4018;

    @OriginalMember(owner = "client!mda", name = "ib", descriptor = "Z")
    private boolean field4034;

    @OriginalMember(owner = "client!mda", name = "eb", descriptor = "S")
    private short field4030;

    @OriginalMember(owner = "client!mda", name = "G", descriptor = "Z")
    private boolean field4006;

    @OriginalMember(owner = "client!mda", name = "X", descriptor = "Z")
    private boolean field4023;

    @OriginalMember(owner = "client!mda", name = "M", descriptor = "B")
    private byte field4012;

    @OriginalMember(owner = "client!mda", name = "R", descriptor = "Z")
    private boolean field4017;

    @OriginalMember(owner = "client!mda", name = "Q", descriptor = "Lka;")
    public class497 field4016;

    @OriginalMember(owner = "client!mda", name = "ab", descriptor = "Lr;")
    private class195 field4026;

    @OriginalMember(owner = "client!mda", name = "C", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!mda", name = "D", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!mda", name = "E", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!mda", name = "F", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "client!mda", name = "H", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!mda", name = "I", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!mda", name = "J", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!mda", name = "K", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!mda", name = "N", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!mda", name = "O", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!mda", name = "P", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!mda", name = "T", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!mda", name = "U", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!mda", name = "V", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!mda", name = "W", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!mda", name = "Y", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!mda", name = "Z", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!mda", name = "bb", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!mda", name = "cb", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!mda", name = "db", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!mda", name = "fb", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!mda", name = "gb", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "client!mda", name = "hb", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!mda", name = "L", descriptor = "Lln;")
    private class398 field4011;

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "(B)Z")
    public final boolean method126(byte arg0) {
        if (arg0 != -34) {
            this.field4018 = -11;
        }
        ++field4009;
        return this.field4023;
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(I)I")
    public final int method1744(int arg0) {
        ++field4014;
        if (arg0 != 21215) {
            method1825((class214) null, 25, -35, 90, 92, -121);
        }
        return this.field4018;
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(ILfq;BIILha;Z)V")
    public final void method129(int arg0, class214 arg1, byte arg2, int arg3, int arg4, class66 arg5, boolean arg6) {
        if (arg2 != -103) {
            this.method777(68);
        }
        ++field4002;
        if (arg1 instanceof class278) {
            class278 var8 = (class278) arg1;
            if (this.field4016 != null && var8.field4016 != null) {
                this.field4016.method287(var8.field4016, arg3, arg0, arg4, arg6);
            }
        } else {
            if (arg1 instanceof class256) {
                class256 var9 = (class256) arg1;
                if (this.field4016 != null && var9.field3817 != null) {
                    this.field4016.method287(var9.field3817, arg3, arg0, arg4, arg6);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "(Z)I")
    public final int method767(boolean arg0) {
        if (arg0) {
            field4013 = 109;
        }
        ++field4029;
        return this.field4016 == null ? 0 : this.field4016.method264();
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(Luq;III)Leb;")
    public static final class651 method1822(class172 arg0, int arg1, int arg2, int arg3) {
        ++field4008;
        byte[] var4 = arg0.method1188(arg2, -18047, arg1);
        if (arg3 != 0) {
            method1825((class214) null, 76, -115, 94, -105, -58);
        }
        return var4 == null ? null : new class651(var4);
    }

    @OriginalMember(owner = "client!mda", name = "i", descriptor = "(I)Z")
    public final boolean method777(int arg0) {
        ++field4031;
        int var2 = -119 % ((arg0 - -34) / 59);
        return this.field4016 == null ? false : this.field4016.method272();
    }

    @OriginalMember(owner = "client!mda", name = "g", descriptor = "(I)Z")
    public final boolean method769(int arg0) {
        ++field4005;
        if (arg0 > -70) {
            this.method114((class66) null, (byte) 36);
        }
        if (this.field4016 != null) {
            return !this.field4016.method285();
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mda", name = "<init>", descriptor = "(Lha;Llp;IIIIIZIIZ)V")
    public class278(class66 arg0, class412 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, boolean arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class681.method3739(arg8, arg9, (byte) -19));
        this.field4018 = (byte) arg9;
        super.field2802 = arg4;
        this.field4034 = arg7;
        this.field4030 = (short) arg1.field5850;
        this.field4006 = ~arg1.field5905 != -1 && !arg7;
        this.field4023 = arg10;
        this.field4012 = (byte) arg8;
        super.field2810 = arg6;
        this.field4017 = arg0.method538() && arg1.field5927 && !this.field4034 && ~class125.field1721.field5156.method159(43) != -1;
        int var12 = 2048;
        if (this.field4023) {
            var12 |= 65536;
        }
        class786 var13 = this.method1824(this.field4017, var12, arg0, (byte) -123);
        if (var13 != null) {
            this.field4016 = var13.field10802;
            this.field4026 = var13.field10801;
            if (this.field4023) {
                this.field4016 = this.field4016.method271((byte) 0, var12, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(Lha;II)Lka;")
    private final class497 method1823(class66 arg0, int arg1, int arg2) {
        ++field4007;
        if (this.field4016 != null && arg0.method520(this.field4016.method260(), arg1) == 0) {
            return this.field4016;
        } else {
            class786 var4 = this.method1824(false, arg1, arg0, (byte) -124);
            if (arg2 != 0) {
                return null;
            } else {
                return var4 != null ? var4.field10802 : null;
            }
        }
    }

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "(Lha;B)V")
    public final void method1752(class66 arg0, byte arg1) {
        if (arg1 < -17) {
            ++field4024;
            Object var3 = null;
            class195 var5;
            if (this.field4026 == null && this.field4017) {
                class786 var4 = this.method1824(true, 262144, arg0, (byte) -124);
                var5 = var4 == null ? null : var4.field10801;
            } else {
                var5 = this.field4026;
                this.field4026 = null;
            }
            if (var5 != null) {
                class384.method2380(var5, super.field2809, super.field2802, super.field2810, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(ZILha;B)Lsw;")
    private final class786 method1824(boolean arg0, int arg1, class66 arg2, byte arg3) {
        ++field4019;
        if (arg3 > -121) {
            return null;
        } else {
            class412 var5 = class210.field2705.method1362(0, this.field4030 & 65535);
            class295 var6;
            class295 var7;
            if (this.field4034) {
                var6 = class737.field10008[super.field2809];
                var7 = class648.field8748[0];
            } else {
                var6 = class648.field8748[super.field2809];
                if (super.field2809 >= 3) {
                    var7 = null;
                } else {
                    var7 = class648.field8748[super.field2809 - -1];
                }
            }
            return var5.method2475(super.field2802, var7, this.field4012, arg1, arg0, arg2, (byte) -59, var6, (class711) null, super.field2815, this.field4018, super.field2810);
        }
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(B)Z")
    public final boolean method1747(byte arg0) {
        int var2 = -108 / ((arg0 - -41) / 60);
        ++field4003;
        return this.field4017;
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(Lha;B)V")
    public final void method1742(class66 arg0, byte arg1) {
        ++field4033;
        Object var3 = null;
        class195 var5;
        if (this.field4026 == null && this.field4017) {
            class786 var4 = this.method1824(true, 262144, arg0, (byte) -128);
            var5 = var4 == null ? null : var4.field10801;
        } else {
            var5 = this.field4026;
            this.field4026 = null;
        }
        if (var5 != null) {
            class526.method3052(var5, super.field2809, super.field2802, super.field2810, (boolean[]) null);
        }
        if (arg1 <= 68) {
            this.method1748(65);
        }
    }

    @OriginalMember(owner = "client!mda", name = "e", descriptor = "(Lha;B)V")
    public final void method131(class66 arg0, byte arg1) {
        ++field4027;
        if (arg1 != 53) {
            this.method769(-17);
        }
    }

    @OriginalMember(owner = "client!mda", name = "h", descriptor = "(I)V")
    public final void method127(int arg0) {
        this.field4023 = false;
        ++field4015;
        if (this.field4016 != null) {
            this.field4016.method270(this.field4016.method260() & -65537);
        }
        if (arg0 != -13127) {
            this.field4011 = null;
        }
    }

    @OriginalMember(owner = "client!mda", name = "c", descriptor = "(Lha;B)Lpia;")
    public final class104 method114(class66 arg0, byte arg1) {
        ++field4028;
        if (this.field4016 == null) {
            return null;
        } else {
            if (arg1 != 115) {
                this.method129(-37, (class214) null, (byte) 34, 6, 90, (class66) null, false);
            }
            class109 var3 = arg0.method475();
            var3.method814(super.field2802, super.field2815, super.field2810);
            class104 var4 = class568.method3241(1, (byte) -126, this.field4006);
            if (!class408.field5786) {
                this.field4016.method254(var3, var4.field1479[0], 0);
            } else {
                this.field4016.method258(var3, var4.field1479[0], class72.field972, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!mda", name = "d", descriptor = "(Lha;B)Lln;")
    public final class398 method119(class66 arg0, byte arg1) {
        if (arg1 >= -35) {
            return null;
        } else {
            if (this.field4011 == null) {
                this.field4011 = class122.method882(this.method1823(arg0, 0, 0), super.field2810, super.field2802, super.field2815, -126);
            }
            ++field4010;
            return this.field4011;
        }
    }

    @OriginalMember(owner = "client!mda", name = "c", descriptor = "(I)I")
    public final int method1750(int arg0) {
        ++field4022;
        return arg0 != 29244 ? -30 : this.field4012;
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(Z)V")
    public final void method1745(boolean arg0) {
        ++field4020;
        if (!arg0) {
            this.method126((byte) 123);
        }
        if (this.field4016 != null) {
            this.field4016.method274();
        }
    }

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "(I)I")
    public final int method1748(int arg0) {
        if (arg0 != 5875) {
            return 55;
        } else {
            ++field4004;
            return this.field4030 & 65535;
        }
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(Lfq;IIIII)V")
    public static final void method1825(class214 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; ++var11) {
            if (class504.field7090 != var11) {
                for (int var12 = var7; var12 <= var8; ++var12) {
                    if (var12 >= 0 && var12 < class196.field2540) {
                        for (int var13 = var9; var13 <= var10; ++var13) {
                            if (var13 >= 0 && var13 < class247.field3229 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class194 var14 = class443.field6387[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class645.field8694[var11].method1898(var13, var12, (byte) -76) + class645.field8694[var11].method1898(var13, var12 + 1, (byte) -4) + class645.field8694[var11].method1898(var13 + 1, var12, (byte) -73) + class645.field8694[var11].method1898(var13 + 1, var12 + 1, (byte) -89)) / 4 - (class645.field8694[arg1].method1898(arg3, arg2, (byte) -18) + class645.field8694[arg1].method1898(arg3, arg2 + 1, (byte) -9) + class645.field8694[arg1].method1898(arg3 + 1, arg2, (byte) -13) + class645.field8694[arg1].method1898(arg3 + 1, arg2 + 1, (byte) -93)) / 4;
                                    class481 var16 = var14.field2527;
                                    class481 var17 = var14.field2523;
                                    if (var16 != null && var16.method126((byte) -34)) {
                                        arg0.method129(var15, var16, (byte) -103, (var12 - arg2) * class30.field299 + (1 - arg4) * class281.field4067, (var13 - arg3) * class30.field299 + (1 - arg5) * class281.field4067, class34.field372, var6);
                                    }
                                    if (var17 != null && var17.method126((byte) -34)) {
                                        arg0.method129(var15, var17, (byte) -103, (var12 - arg2) * class30.field299 + (1 - arg4) * class281.field4067, (var13 - arg3) * class30.field299 + (1 - arg5) * class281.field4067, class34.field372, var6);
                                    }
                                    for (class511 var18 = var14.field2525; var18 != null; var18 = var18.field7127) {
                                        class539 var19 = var18.field7126;
                                        if (var19 != null && var19.method126((byte) -34) && (var19.field7466 == var12 || var7 == var12) && (var19.field7467 == var13 || var9 == var13)) {
                                            int var20 = var19.field7455 - var19.field7466 + 1;
                                            int var21 = var19.field7453 - var19.field7467 + 1;
                                            arg0.method129(var15, var19, (byte) -103, (var19.field7466 - arg2) * class30.field299 + (var20 - arg4) * class281.field4067, (var19.field7467 - arg3) * class30.field299 + (var21 - arg5) * class281.field4067, class34.field372, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                --var7;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!mda", name = "d", descriptor = "(B)I")
    public final int method774(byte arg0) {
        if (arg0 != 115) {
            this.method126((byte) 30);
        }
        ++field4032;
        return this.field4016 == null ? 0 : this.field4016.method265();
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(ILha;II)Z")
    public final boolean method122(int arg0, class66 arg1, int arg2, int arg3) {
        ++field4021;
        if (arg2 != 6238) {
            return false;
        } else {
            class497 var5 = this.method1823(arg1, 131072, 0);
            if (var5 != null) {
                class109 var6 = arg1.method475();
                var6.method814(super.field2802, super.field2815, super.field2810);
                return class408.field5786 ? var5.method245(arg0, arg3, var6, false, 0, class72.field972) : var5.method248(arg0, arg3, var6, false, 0);
            } else {
                return false;
            }
        }
    }
}
