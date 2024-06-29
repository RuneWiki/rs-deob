import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class218 extends class125 {

    @OriginalMember(owner = "client!ts", name = "p", descriptor = "I")
    public static int field3257 = 0;

    @OriginalMember(owner = "client!ts", name = "i", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!ts", name = "j", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!ts", name = "k", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!ts", name = "l", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!ts", name = "m", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!ts", name = "n", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!ts", name = "o", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!ts", name = "q", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!ts", name = "r", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!ts", name = "s", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!ts", name = "t", descriptor = "Ljava/lang/Object;")
    public static Object field3261;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lha;IIZ)Ler;")
    public static final class297 method1536(class543 arg0, int arg1, int arg2, boolean arg3) {
        ++field3254;
        if (~arg1 == 0) {
            return null;
        } else {
            if (class346.field4952 != null) {
                for (int var4 = 0; ~class346.field4952.length < ~var4; ++var4) {
                    if (~class346.field4952[var4] == ~arg1) {
                        return class461.field6565[var4];
                    }
                }
            }
            class297 var5 = (class297) class501.field7280.method2216(0, (long) arg1);
            if (var5 != null) {
                if (arg3 && var5.field4061 == null) {
                    class502 var6 = class534.method3234(class714.field10077, -121, arg1);
                    if (var6 == null) {
                        return null;
                    }
                    var5.field4061 = var6;
                }
                return var5;
            } else {
                class676[] var7 = class676.method3847(class595.field8457, arg1);
                int var8 = -47 % ((arg2 - -70) / 45);
                if (var7 == null) {
                    return null;
                } else {
                    class502 var9 = class534.method3234(class714.field10077, -121, arg1);
                    if (var9 == null) {
                        return null;
                    } else {
                        class297 var10;
                        if (!arg3) {
                            var10 = new class297(arg0.method322(var9, var7, true));
                        } else {
                            var10 = new class297(arg0.method322(var9, var7, true), var9);
                        }
                        class501.field7280.method2213((byte) -16, (long) arg1, var10);
                        return var10;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(BI)V")
    public final void method157(byte arg0, int arg1) {
        if (arg0 >= -32) {
            method1537((byte) 96);
        }
        super.field1732 = arg1;
        ++field3258;
        class517.method3141(94, super.field1732);
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(B)V")
    public static void method1537(byte arg0) {
        if (arg0 != -21) {
            field3261 = null;
        }
        field3261 = null;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIIIIII)I")
    public static final int method1538(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg4 & 3;
        ++field3253;
        if (~(1 & arg3) == -2) {
            int var8 = arg2;
            arg2 = arg5;
            arg5 = var8;
        }
        if (var7 == 0) {
            return arg0;
        } else {
            int var9 = -114 % ((59 - arg6) / 38);
            if (var7 == 1) {
                return arg1;
            } else {
                return ~var7 == -3 ? -arg2 - -1 + -arg0 + 7 : 8 - arg1 + -arg5;
            }
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(B)I")
    public final int method158(byte arg0) {
        int var2 = -49 / ((-63 - arg0) / 49);
        ++field3250;
        return super.field1733.method3303(-1).method2048(7) < 96 ? 0 : 2;
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(II)V")
    public static final void method1539(int arg0, int arg1) {
        ++field3255;
        if (arg0 != -18134) {
            method1538(94, -121, 45, -88, -34, 3, -97);
        }
        class501.field7280.method2207(arg1, arg0 ^ -18133);
    }

    @OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(Lgp;)V")
    public class218(class549 arg0) {
        super(arg0);
        class517.method3141(-92, super.field1732);
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(BIIIII)I")
    public static final int method1540(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3252;
        if (class95.field1372 == null) {
            return 0;
        } else if (arg0 != 125) {
            return 19;
        } else {
            if (arg5 < 3) {
                int var6 = arg2 >> 9;
                int var7 = arg3 >> 9;
                if (~arg1 > -1 || ~arg4 > -1 || ~(class184.field2546 + -1) > ~arg1 || ~arg4 < ~(class240.field3555 + -1)) {
                    return 0;
                }
                if (~var6 > -2 || ~var7 > -2 || var6 > class184.field2546 + -1 || ~var7 < ~(class240.field3555 - 1)) {
                    return 0;
                }
                boolean var8 = ~(class160.field2297[1][arg2 >> 9][arg3 >> 9] & 2) != -1;
                if (~(arg2 & 511) == -1) {
                    boolean var9 = ~(class160.field2297[1][var6 + -1][arg3 >> 9] & 2) != -1;
                    boolean var10 = ~(2 & class160.field2297[1][var6][arg3 >> 9]) != -1;
                    if (var9 == !var10) {
                        var8 = ~(2 & class160.field2297[1][arg1][arg4]) != -1;
                    }
                }
                if ((511 & arg3) == 0) {
                    boolean var11 = (2 & class160.field2297[1][arg2 >> 9][var7 + -1]) != 0;
                    boolean var12 = (class160.field2297[1][arg2 >> 9][var7] & 2) != 0;
                    if (var11 != var12) {
                        var8 = (2 & class160.field2297[1][arg1][arg4]) != 0;
                    }
                }
                if (var8) {
                    ++arg5;
                }
            }
            return class95.field1372[arg5].method2089(26448, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(ZI)I")
    public final int method155(boolean arg0, int arg1) {
        ++field3256;
        if (super.field1733.method3303(-1).method2048(7) < 96) {
            return 3;
        } else {
            return !arg0 ? 84 : 1;
        }
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(I)Z")
    public final boolean method1541(int arg0) {
        ++field3260;
        if (arg0 != -7558) {
            field3261 = null;
        }
        return ~super.field1733.method3303(arg0 + 7557).method2048(7) <= -97;
    }

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "(Z)I")
    public final int method1542(boolean arg0) {
        if (arg0) {
            return 23;
        } else {
            ++field3251;
            return super.field1732;
        }
    }

    @OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(ILgp;)V")
    public class218(int arg0, class549 arg1) {
        super(arg0, arg1);
        class517.method3141(58, super.field1732);
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(Z)V")
    public final void method156(boolean arg0) {
        if (arg0) {
            ++field3259;
            if (~super.field1733.method3303(-1).method2048(7) > -97) {
                super.field1732 = 0;
            }
            if (super.field1732 < 0 || super.field1732 > 2) {
                super.field1732 = this.method158((byte) 82);
            }
        }
    }
}
