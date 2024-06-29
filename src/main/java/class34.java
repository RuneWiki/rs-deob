import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public class class34 extends class613 {

    @OriginalMember(owner = "client!rca", name = "X", descriptor = "I")
    private int field323 = 0;

    @OriginalMember(owner = "client!rca", name = "T", descriptor = "I")
    private int field320 = -1;

    @OriginalMember(owner = "client!rca", name = "bb", descriptor = "I")
    private int field327 = 0;

    @OriginalMember(owner = "client!rca", name = "lb", descriptor = "I")
    private int field337 = 0;

    @OriginalMember(owner = "client!rca", name = "Z", descriptor = "Z")
    public boolean field325 = false;

    @OriginalMember(owner = "client!rca", name = "mb", descriptor = "I")
    private int field338 = 0;

    @OriginalMember(owner = "client!rca", name = "nb", descriptor = "I")
    private int field339 = 0;

    @OriginalMember(owner = "client!rca", name = "P", descriptor = "Z")
    private boolean field316 = false;

    @OriginalMember(owner = "client!rca", name = "O", descriptor = "I")
    public int field315;

    @OriginalMember(owner = "client!rca", name = "rb", descriptor = "I")
    private int field343;

    @OriginalMember(owner = "client!rca", name = "cb", descriptor = "Llb;")
    private class257 field328;

    @OriginalMember(owner = "client!rca", name = "V", descriptor = "Lth;")
    public static class288 field322 = new class288();

    @OriginalMember(owner = "client!rca", name = "ob", descriptor = "[I")
    public static int[] field340 = new int[3];

    @OriginalMember(owner = "client!rca", name = "jb", descriptor = "F")
    public static float field335;

    @OriginalMember(owner = "client!rca", name = "L", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!rca", name = "M", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!rca", name = "N", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!rca", name = "Q", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!rca", name = "R", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!rca", name = "U", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!rca", name = "Y", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!rca", name = "ab", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!rca", name = "db", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!rca", name = "eb", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!rca", name = "fb", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!rca", name = "gb", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!rca", name = "hb", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!rca", name = "ib", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!rca", name = "kb", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!rca", name = "pb", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!rca", name = "qb", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!rca", name = "sb", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!rca", name = "S", descriptor = "Lwca;")
    private class339 field319;

    @OriginalMember(owner = "client!rca", name = "j", descriptor = "(I)V", line = 6)
    public final void method170(int arg0) {
        if (arg0 >= 20) {
            ++field313;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(I)V", line = 22)
    public final void method171(int arg0) {
        if (arg0 != 0) {
            this.field320 = 124;
        }
        ++field317;
        if (this.field319 != null) {
            this.field319.method1954();
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lr;Z)V", line = 35)
    public final void method172(class564 arg0, boolean arg1) {
        ++field312;
        class473 var3 = this.method178(arg0, 0, this.field343, (byte) 26);
        if (arg1) {
            this.finalize();
        }
        if (var3 != null) {
            class490 var4 = arg0.method950();
            var4.method23(super.field5179, super.field5178, super.field5176);
            this.method174(arg0, var4, var3, 0);
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lr;III)Z", line = 55)
    public final boolean method173(class564 arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 0) {
            return true;
        } else {
            ++field331;
            return false;
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lr;Lq;Lda;I)V", line = 67)
    private final void method174(class564 arg0, class490 arg1, class473 arg2, int arg3) {
        if (arg3 != 0) {
            field335 = 0.17610922F;
        }
        arg2.method1891(arg1);
        ++field333;
        class93[] var5 = arg2.method1910();
        class667[] var6 = arg2.method1897();
        if ((this.field319 == null || this.field319.field4270) && (var5 != null || var6 != null)) {
            this.field319 = class339.method1950(class678.field9539, true);
        }
        if (this.field319 != null) {
            this.field319.method1960(arg0, (long) class678.field9539, var5, var6, false);
            this.field319.method1949(super.field5166, super.field8635, super.field8634, super.field8627, super.field8630);
        }
    }

    @OriginalMember(owner = "client!rca", name = "e", descriptor = "(B)I", line = 96)
    public final int method175(byte arg0) {
        ++field321;
        return arg0 <= 119 ? 90 : this.field327;
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(IZI)Z", line = 115)
    public static final boolean method176(int arg0, boolean arg1, int arg2) {
        ++field332;
        if (!arg1) {
            field340 = null;
        }
        return ~(arg2 & 384) != -1;
    }

    @OriginalMember(owner = "client!rca", name = "i", descriptor = "(I)Z", line = 128)
    public final boolean method177(int arg0) {
        ++field342;
        return arg0 >= -103 ? false : this.field316;
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lr;IIB)Lda;", line = 142)
    private final class473 method178(class564 arg0, int arg1, int arg2, byte arg3) {
        int var5 = -82 / ((-51 - arg3) / 53);
        ++field330;
        class681 var6 = class63.field654.method2191(false, arg2);
        class274 var7 = class385.field5193[super.field5166];
        class274 var8 = ~super.field5169 <= -4 ? null : class385.field5193[super.field5169 - -1];
        return this.field325 ? var6.method3782(super.field5178, -1, arg0, class265.field3301, (byte) 2, 0, super.field5176, var7, -1, super.field5179, var8, arg1, true) : var6.method3782(super.field5178, this.field337, arg0, class265.field3301, (byte) 2, this.field339, super.field5176, var7, this.field320, super.field5179, var8, arg1, true);
    }

    @OriginalMember(owner = "client!rca", name = "<init>", descriptor = "(IIIIIIIIIIIII)V", line = 338)
    public class34(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field315 = arg1 + arg2;
        this.field338 = arg12;
        this.field343 = arg0;
        class681 var14 = class63.field654.method2191(false, this.field343);
        int var15 = var14.field9611;
        if (~var15 == 0) {
            this.field325 = true;
        } else {
            this.field328 = class265.field3301.method3043(var15, -8191);
            this.field325 = false;
        }
        if (this.field315 == arg2) {
            class635.method3570((byte) -91, false, super.field5179, this.field328, super.field5166, super.field5176, this.field337);
        }
    }

    @OriginalMember(owner = "client!rca", name = "finalize", descriptor = "()V", line = 161)
    protected final void finalize() {
        if (this.field319 != null) {
            this.field319.method1954();
        }
        ++field318;
    }

    @OriginalMember(owner = "client!rca", name = "g", descriptor = "(I)I", line = 175)
    public final int method179(int arg0) {
        if (arg0 != 3370) {
            return 22;
        } else {
            ++field336;
            return this.field323;
        }
    }

    @OriginalMember(owner = "client!rca", name = "h", descriptor = "(I)Z", line = 189)
    public final boolean method180(int arg0) {
        if (arg0 != -1) {
            this.method177(-80);
        }
        ++field341;
        return false;
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(IZ)V", line = 207)
    public final void method181(int arg0, boolean arg1) {
        ++field334;
        if (!this.field325) {
            this.field339 += arg0;
            while (~this.field339 < ~this.field328.field3235[this.field337]) {
                this.field339 -= this.field328.field3235[this.field337];
                ++this.field337;
                if (this.field337 >= this.field328.field3218.length) {
                    this.field325 = true;
                    break;
                }
            }
            if (!arg1) {
                this.method177(-26);
            }
            if (!this.field325) {
                class635.method3570((byte) -128, false, super.field5179, this.field328, super.field5166, super.field5176, this.field337);
            }
        }
    }

    @OriginalMember(owner = "client!rca", name = "c", descriptor = "(Lr;I)Lwj;", line = 239)
    public final class315 method182(class564 arg0, int arg1) {
        ++field326;
        class473 var3 = this.method178(arg0, 2048 | (this.field338 == 0 ? 0 : 5), this.field343, (byte) -121);
        if (var3 == null) {
            return null;
        } else {
            if (this.field338 != arg1) {
                var3.method1879(this.field338 * 2048);
            }
            class490 var4 = arg0.method950();
            var4.method23(super.field5179, super.field5178, super.field5176);
            this.method174(arg0, var4, var3, arg1);
            if (class460.field6553) {
                var3.method1875(var4, (class374) null, class682.field9623, 0);
            } else {
                var3.method1914(var4, (class374) null, 0);
            }
            if (this.field319 != null) {
                class332 var5 = this.field319.method1952();
                if (!class460.field6553) {
                    arg0.method1033(var5);
                } else {
                    arg0.method1048(var5, class682.field9623);
                }
            }
            this.field316 = var3.method1913();
            this.field323 = var3.method1869();
            this.field327 = var3.method1868();
            return null;
        }
    }

    @OriginalMember(owner = "client!rca", name = "c", descriptor = "(B)Z", line = 284)
    public final boolean method183(byte arg0) {
        int var2 = 107 % ((12 - arg0) / 62);
        ++field324;
        return false;
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(IIIILrb;Lr;Z)V", line = 294)
    public final void method184(int arg0, int arg1, int arg2, int arg3, class383 arg4, class564 arg5, boolean arg6) {
        if (arg2 != 2) {
            this.method171(-10);
        }
        ++field329;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rca", name = "d", descriptor = "(Lr;I)Llf;", line = 305)
    public final class676 method185(class564 arg0, int arg1) {
        if (arg1 <= 42) {
            return null;
        } else {
            ++field344;
            return null;
        }
    }

    @OriginalMember(owner = "client!rca", name = "b", descriptor = "(I)V", line = 316)
    public static void method186(int arg0) {
        if (arg0 != -1) {
            method176(-97, false, 101);
        }
        field322 = null;
        field340 = null;
    }
}
