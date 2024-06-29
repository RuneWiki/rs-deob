import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public class class259 extends class264 {

    @OriginalMember(owner = "client!kw", name = "m", descriptor = "F")
    public static float field3636 = 0.25F;

    @OriginalMember(owner = "client!kw", name = "r", descriptor = "[Z")
    public static boolean[] field3641 = new boolean[5];

    @OriginalMember(owner = "client!kw", name = "k", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!kw", name = "l", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!kw", name = "n", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!kw", name = "o", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!kw", name = "q", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!kw", name = "s", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!kw", name = "t", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!kw", name = "u", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!kw", name = "v", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!kw", name = "w", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!kw", name = "x", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!kw", name = "p", descriptor = "[[Lvm;")
    public static class713[][] field3639;

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1701(int arg0, String arg1) {
        ++field3640;
        if (!arg1.equals("")) {
            ++class174.field2454;
            class731 var2 = class155.method1222(260, class58.field818, class237.field3417);
            var2.field10211.method851((byte) -2, class233.method1612(1, arg1));
            var2.field10211.method880(true, arg1);
            int var3 = 24 % ((-44 - arg0) / 33);
            class533.method3088(var2, 0);
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(III)Lev;")
    public static final class719 method1702(int arg0, int arg1, int arg2) {
        class379 var3 = class378.field5427[arg0][arg1][arg2];
        return var3 == null ? null : var3.field5439;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(BI)I")
    public final int method666(byte arg0, int arg1) {
        ++field3644;
        int var3 = super.field3731.method3634(0).method2858(arg0 + 2311);
        if (~var3 > -97) {
            return 3;
        } else {
            if (arg0 != 112) {
                this.method1704(-115);
            }
            if (arg1 > 1 && ~var3 > -129) {
                return 3;
            } else {
                return ~arg1 < -4 && var3 < 192 ? 3 : 1;
            }
        }
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(B)I")
    public final int method1703(byte arg0) {
        if (arg0 >= -31) {
            field3636 = -0.6549848F;
        }
        ++field3634;
        return super.field3733;
    }

    @OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(ILmfa;)V")
    public class259(int arg0, class640 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!kw", name = "c", descriptor = "(I)Z")
    public final boolean method1704(int arg0) {
        ++field3647;
        int var2 = super.field3731.method3634(0).method2858(2423);
        if (var2 < 96) {
            return false;
        } else {
            if (arg0 != 14996) {
                this.method663((byte) 111);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIZII)V")
    public static final void method1705(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        ++field3638;
        int var6 = -arg0 + arg1;
        int var7 = -arg4 + arg2;
        if (var6 != 0) {
            if (var7 == 0) {
                class650.method3722(arg0, arg5, arg1, arg4, 0);
            } else if (arg3) {
                int var8 = (var7 << 12) / var6;
                int var9 = -(arg0 * var8 >> 12) + arg4;
                int var10;
                int var11;
                if (arg1 < class450.field6463) {
                    var10 = var9 - -(class450.field6463 * var8 >> 12);
                    var11 = class450.field6463;
                } else if (class285.field4372 < arg1) {
                    var10 = (class285.field4372 * var8 >> 12) + var9;
                    var11 = class285.field4372;
                } else {
                    var11 = arg1;
                    var10 = arg2;
                }
                int var12;
                int var13;
                if (arg0 >= class450.field6463) {
                    if (class285.field4372 < arg0) {
                        var12 = var9 - -(class285.field4372 * var8 >> 12);
                        var13 = class285.field4372;
                    } else {
                        var12 = arg4;
                        var13 = arg0;
                    }
                } else {
                    var13 = class450.field6463;
                    var12 = (class450.field6463 * var8 >> 12) + var9;
                }
                if (var12 < class738.field10297) {
                    var13 = (-var9 + class738.field10297 << 12) / var8;
                    var12 = class738.field10297;
                } else if (var12 > class414.field5846) {
                    var13 = (-var9 + class414.field5846 << 12) / var8;
                    var12 = class414.field5846;
                }
                if (class738.field10297 > var10) {
                    var10 = class738.field10297;
                    var11 = (class738.field10297 - var9 << 12) / var8;
                } else if (~class414.field5846 > ~var10) {
                    var10 = class414.field5846;
                    var11 = (-var9 + class414.field5846 << 12) / var8;
                }
                class634.method3613(var12, var10, 80, var11, var13, arg5);
            }
        } else {
            if (~var7 != -1) {
                class784.method4294((byte) 59, arg4, arg2, arg5, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(BI)V")
    public final void method659(byte arg0, int arg1) {
        if (arg0 >= -114) {
            this.method660(41);
        }
        ++field3643;
        super.field3733 = arg1;
    }

    @OriginalMember(owner = "client!kw", name = "d", descriptor = "(I)V")
    public static final void method1706(int arg0) {
        ++class718.field10101;
        ++field3645;
        class731 var1 = class155.method1222(260, class238.field3428, class237.field3417);
        if (arg0 >= -4) {
            field3636 = 1.1436691F;
        }
        var1.field10211.method860(class92.field1197, (byte) 123);
        class533.method3088(var1, 0);
    }

    @OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(Lmfa;)V")
    public class259(class640 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIIII[[[BIIBIILha;)V")
    public static final void method1707(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[][][] arg6, int arg7, int arg8, byte arg9, int arg10, int arg11, class66 arg12) {
        ++field3635;
        if (arg10 != 0 && arg4 != 0) {
            if (arg10 == 9) {
                arg11 = arg11 + 1 & 3;
                arg10 = 1;
            }
            if (arg9 != -105) {
                field3646 = -123;
            }
            if (~arg10 == -11) {
                arg10 = 1;
                arg11 = arg11 + 3 & 3;
            }
            if (~arg10 == -12) {
                arg10 = 8;
                arg11 = 3 & arg11 - -3;
            }
            arg12.method511(arg0, arg3, arg8, arg2, arg5, arg7, arg6[arg10 + -1][arg11], arg4, arg1);
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(B)I")
    public final int method663(byte arg0) {
        if (arg0 != -38) {
            this.method1703((byte) 36);
        }
        ++field3637;
        return 0;
    }

    @OriginalMember(owner = "client!kw", name = "e", descriptor = "(I)V")
    public static void method1708(int arg0) {
        field3639 = null;
        field3641 = null;
        if (arg0 != -97) {
            method1702(86, 34, -84);
        }
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(I)V")
    public final void method660(int arg0) {
        ++field3642;
        int var2 = super.field3731.method3634(0).method2858(2423);
        if (~var2 > -97) {
            super.field3733 = 0;
        }
        if (~super.field3733 < -2 && ~var2 > -129) {
            super.field3733 = 1;
        }
        if (~super.field3733 < -3 && var2 < 192) {
            super.field3733 = 2;
        }
        if (super.field3733 < 0 || super.field3733 > 3) {
            super.field3733 = this.method663((byte) -38);
        }
        int var3 = 114 / ((arg0 - 1) / 41);
    }
}
