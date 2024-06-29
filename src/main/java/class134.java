import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class134 extends class290 {

    @OriginalMember(owner = "client!li", name = "H", descriptor = "I")
    private int field2268 = 0;

    @OriginalMember(owner = "client!li", name = "P", descriptor = "Z")
    public boolean field2276 = false;

    @OriginalMember(owner = "client!li", name = "L", descriptor = "I")
    private int field2272 = 0;

    @OriginalMember(owner = "client!li", name = "U", descriptor = "I")
    private int field2281 = -1;

    @OriginalMember(owner = "client!li", name = "O", descriptor = "I")
    private int field2275 = 0;

    @OriginalMember(owner = "client!li", name = "M", descriptor = "I")
    private int field2273 = -32768;

    @OriginalMember(owner = "client!li", name = "x", descriptor = "I")
    public int field2259;

    @OriginalMember(owner = "client!li", name = "K", descriptor = "I")
    private int field2271;

    @OriginalMember(owner = "client!li", name = "C", descriptor = "I")
    private int field2264;

    @OriginalMember(owner = "client!li", name = "R", descriptor = "Lsq;")
    private class145 field2278;

    @OriginalMember(owner = "client!li", name = "S", descriptor = "Lvv;")
    public static class313 field2279 = new class313(96, -2);

    @OriginalMember(owner = "client!li", name = "ab", descriptor = "[I")
    public static int[] field2287 = new int[8];

    @OriginalMember(owner = "client!li", name = "y", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!li", name = "z", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!li", name = "A", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!li", name = "B", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!li", name = "D", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!li", name = "G", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!li", name = "I", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!li", name = "J", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!li", name = "N", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!li", name = "Q", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!li", name = "T", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!li", name = "V", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!li", name = "W", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!li", name = "X", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!li", name = "Y", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!li", name = "Z", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!li", name = "E", descriptor = "Lcc;")
    private class122 field2266;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ILza;Le;)V")
    private final void method1010(int arg0, class491 arg1, class530 arg2) {
        ++field2261;
        class345[] var4 = arg2.method777();
        class150[] var5 = arg2.method727();
        if (arg0 != 18171) {
            this.method1010(-46, (class491) null, (class530) null);
        }
        if ((this.field2266 == null || this.field2266.field2134) && (var4 != null || var5 != null)) {
            this.field2266 = new class122(class504.field7348);
        }
        if (this.field2266 != null) {
            this.field2266.method960(arg1, (long) class504.field7348, var4, var5, false);
            this.field2266.method971(super.field4720, super.field4718, super.field4722, super.field4717, super.field4713);
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IILza;IILvl;Z)V")
    public final void method39(int arg0, int arg1, class491 arg2, int arg3, int arg4, class243 arg5, boolean arg6) {
        ++field2280;
        if (arg0 == 0) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
    public class134(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field2272 = arg12;
        this.field2259 = arg1 + arg2;
        this.field2271 = arg0;
        this.field2264 = arg4;
        class526 var14 = class30.field482.method2630((byte) 105, this.field2271);
        int var15 = var14.field7752;
        if (~var15 == 0) {
            this.field2276 = true;
        } else {
            this.field2278 = class130.field2232.method634(-1271654143, var15);
            this.field2276 = false;
        }
        if (this.field2259 == arg2) {
            class172.method1167(super.field4714, this.field2268, super.field4720, super.field4716, false, this.field2278, (byte) 44);
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lza;ZII)Le;")
    private final class530 method1011(class491 arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            this.method40(24, (class491) null);
        }
        ++field2274;
        class526 var5 = class30.field482.method2630((byte) 105, arg2);
        class220 var6 = class511.field7488[super.field4720];
        class220 var7 = ~this.field2264 > -4 ? class511.field7488[this.field2264 + 1] : null;
        return !this.field2276 ? var5.method3123(var7, true, -21661, this.field2281, arg3, var6, this.field2275, this.field2268, super.field4728, arg0, super.field4714, super.field4716, class130.field2232) : var5.method3123(var7, true, -21661, -1, arg3, var6, 0, -1, super.field4728, arg0, super.field4714, super.field4716, class130.field2232);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(II)V")
    public static final void method1012(int arg0, int arg1) {
        ++field2284;
        if (arg1 == 0) {
            class266 var2 = class308.method1961(true, arg0, 14);
            var2.method1778(17991);
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V")
    public final void method1013(int arg0) {
        if (this.field2266 != null) {
            this.field2266.method962();
        }
        ++field2283;
        if (arg0 != 75) {
            field2279 = null;
        }
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(I)V")
    public static void method1014(int arg0) {
        field2279 = null;
        field2287 = null;
        if (arg0 < 64) {
            field2262 = -107;
        }
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(Z)V")
    public final void method36(boolean arg0) {
        ++field2263;
        if (arg0) {
            this.method42(false);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ZI)Z")
    public static final boolean method1015(boolean arg0, int arg1) {
        ++field2270;
        if (!arg0) {
            field2262 = 27;
        }
        return arg1 == 0 || ~arg1 == -2 || arg1 == 2;
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(I)I")
    public static final int method1016(int arg0) {
        ++field2265;
        if ((double) class210.field3339 == 3.0D) {
            return 37;
        } else if ((double) class210.field3339 == 4.0D) {
            return 50;
        } else {
            if (arg0 != -30326) {
                method1014(126);
            }
            if ((double) class210.field3339 == 6.0D) {
                return 75;
            } else {
                return (double) class210.field3339 == 8.0D ? 100 : 200;
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(ILza;)Lsr;")
    public final class430 method40(int arg0, class491 arg1) {
        ++field2286;
        class530 var3 = this.method1011(arg1, false, this.field2271, (~this.field2272 != -1 ? 5 : 0) | 2048);
        if (var3 == null) {
            return null;
        } else {
            if (this.field2272 != 0) {
                var3.method756(this.field2272 * 2048);
            }
            class202 var4 = arg1.method820();
            if (arg0 > -24) {
                this.field2278 = null;
            }
            var4.method1246(super.field4716, super.field4728, super.field4714);
            if (this.field2266 != null) {
                class66 var5 = this.field2266.method964();
                arg1.method853(var3, var5, var4, (class273) null, 0);
            } else {
                var3.method736(var4, (class273) null, 0);
            }
            this.field2273 = var3.method726();
            this.method1010(18171, arg1, var3);
            return null;
        }
    }

    @OriginalMember(owner = "client!li", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field2267;
        if (this.field2266 != null) {
            this.field2266.method962();
        }
    }

    @OriginalMember(owner = "client!li", name = "e", descriptor = "(I)I")
    public final int method325(int arg0) {
        ++field2285;
        if (arg0 != 5) {
            this.field2278 = null;
        }
        return this.field2273;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IB)V")
    public final void method1017(int arg0, byte arg1) {
        ++field2269;
        if (!this.field2276) {
            this.field2275 += arg0;
            if (arg1 != -49) {
                this.field2278 = null;
            }
            while (~this.field2278.field2375[this.field2268] > ~this.field2275) {
                this.field2275 -= this.field2278.field2375[this.field2268];
                ++this.field2268;
                if (~this.field2268 <= ~this.field2278.field2377.length) {
                    this.field2276 = true;
                    break;
                }
            }
            if (!this.field2276) {
                class172.method1167(super.field4714, this.field2268, super.field4720, super.field4716, false, this.field2278, (byte) 86);
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lza;III)Z")
    public final boolean method27(class491 arg0, int arg1, int arg2, int arg3) {
        ++field2282;
        if (arg1 <= 121) {
            method1015(false, -90);
        }
        return false;
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(BLza;)V")
    public final void method43(byte arg0, class491 arg1) {
        if (arg0 != 35) {
            this.method39(51, -121, (class491) null, -48, -43, (class243) null, false);
        }
        ++field2277;
        class530 var3 = this.method1011(arg1, false, this.field2271, 0);
        if (var3 != null) {
            this.method1010(18171, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(III)Lhc;")
    public static final class218 method1018(int arg0, int arg1, int arg2) {
        class465 var3 = class66.field977[arg0][arg1][arg2];
        return var3 == null ? null : var3.field6907;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Z)Z")
    public final boolean method42(boolean arg0) {
        if (arg0) {
            return false;
        } else {
            ++field2260;
            return false;
        }
    }
}
