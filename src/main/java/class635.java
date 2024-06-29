import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class635 extends class649 {

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
    public static int field8934 = 0;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public static int field8927;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
    public static int field8928;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public static int field8929;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    public static int field8930;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public static int field8931;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public static int field8932;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    public static int field8933;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    public static int field8935;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
    public static int field8936;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IB)V")
    public final void method129(int arg0, byte arg1) {
        if (arg1 > -120) {
            field8934 = 72;
        }
        ++field8932;
        super.field9223 = arg0;
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lhs;)V")
    public class635(class358 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)I")
    public final int method3596(int arg0) {
        if (arg0 != 3) {
            field8934 = -95;
        }
        ++field8935;
        return super.field9223;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)I")
    public final int method135(int arg0) {
        int var2 = 79 % ((-18 - arg0) / 50);
        ++field8931;
        return 1;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(III)Z")
    public static final boolean method3597(int arg0, int arg1, int arg2) {
        if (arg2 != 9943) {
            field8934 = -102;
        }
        ++field8929;
        return false;
    }

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "(I)Z")
    public final boolean method3598(int arg0) {
        ++field8933;
        if (arg0 != -16181) {
            field8934 = -125;
        }
        if (super.field9224.method2291(-11) == class565.field8012) {
            return !super.field9224.method2294((byte) -109);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZIIII)V")
    public static final void method3599(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field8928;
        if (arg0 || class567.field8048 != arg3 || ~class319.field4745 != ~arg2 || ~class582.field8234 != ~class405.field6003 && class654.field9289.field5453.method3878(3) != 1) {
            class319.field4745 = arg2;
            class567.field8048 = arg3;
            class405.field6003 = class582.field8234;
            if (~class654.field9289.field5453.method3878(arg4 + 4) == -2) {
                class405.field6003 = 0;
            }
            class658.method3704(arg4 ^ 5696, arg1);
            class104.method853(class594.field8343, class641.field9005.method3621(arg4 + 118, class467.field6804), class364.field5573, (byte) -10, class74.field1105, true);
            int var5 = class265.field4123;
            int var6 = class723.field10155;
            class265.field4123 = (-(class191.field3229 >> 4) + class567.field8048) * 8;
            class723.field10155 = (-(class314.field4720 >> 4) + class319.field4745) * 8;
            class158.field2456 = class729.method4027(class567.field8048 * 8, class319.field4745 * 8);
            class254.field4024 = null;
            int var7 = -var5 + class265.field4123;
            int var8 = class723.field10155 - var6;
            if (~arg1 != -12) {
                boolean var9 = false;
                class356.field5394 = 0;
                int var10 = class191.field3229 * 512 + -512;
                int var11 = class314.field4720 * 512 + -512;
                for (int var12 = 0; class271.field4162 > var12; ++var12) {
                    class53 var13 = class501.field7280[var12];
                    if (var13 != null) {
                        class461 var14 = var13.field847;
                        var14.field9477 -= var7 * 512;
                        var14.field9475 -= var8 * 512;
                        if (var14.field9477 >= 0 && var10 >= var14.field9477 && ~var14.field9475 <= -1 && ~var11 <= ~var14.field9475) {
                            boolean var15 = true;
                            for (int var16 = 0; ~var16 > -11; ++var16) {
                                var14.field1702[var16] -= var7;
                                var14.field1704[var16] -= var8;
                                if (var14.field1702[var16] < 0 || var14.field1702[var16] >= class191.field3229 || ~var14.field1704[var16] > -1 || ~var14.field1704[var16] <= ~class314.field4720) {
                                    var15 = false;
                                }
                            }
                            if (var15) {
                                class45.field758[class356.field5394++] = var14.field1628;
                            } else {
                                var14.method2829(-11847, (class504) null);
                                var13.method636((byte) 97);
                                var9 = true;
                            }
                        } else {
                            var14.method2829(arg4 ^ 11846, (class504) null);
                            var9 = true;
                            var13.method636((byte) 97);
                        }
                    }
                }
                if (var9) {
                    class271.field4162 = class332.field4881.method3511(0);
                    class332.field4881.method3515(class501.field7280, 118);
                }
            } else {
                for (int var17 = 0; class271.field4162 > var17; ++var17) {
                    class53 var30 = class501.field7280[var17];
                    if (var30 != null) {
                        class461 var31 = var30.field847;
                        for (int var32 = 0; var32 < 10; ++var32) {
                            var31.field1702[var32] -= var7;
                            var31.field1704[var32] -= var8;
                        }
                        var31.field9477 -= var7 * 512;
                        var31.field9475 -= var8 * 512;
                    }
                }
            }
            for (int var18 = 0; ~var18 > -2049; ++var18) {
                class573 var28 = class279.field4271[var18];
                if (var28 != null) {
                    for (int var29 = 0; ~var29 > -11; ++var29) {
                        var28.field1702[var29] -= var7;
                        var28.field1704[var29] -= var8;
                    }
                    var28.field9475 -= var8 * 512;
                    var28.field9477 -= var7 * 512;
                }
            }
            class251[] var19 = class541.field7732;
            for (int var20 = 0; var20 < var19.length; ++var20) {
                class251 var27 = var19[var20];
                if (var27 != null) {
                    var27.field3996 -= var8 * 512;
                    var27.field4000 -= var7 * 512;
                }
            }
            for (class248 var21 = (class248) class641.field9057.method3463((byte) -50); var21 != null; var21 = (class248) class641.field9057.method3469((byte) 107)) {
                var21.field3971 -= var7;
                var21.field3964 -= var8;
                if (~class157.field2437 != -5 && (~var21.field3971 > -1 || var21.field3964 < 0 || class191.field3229 <= var21.field3971 || var21.field3964 >= class314.field4720)) {
                    var21.method636((byte) 97);
                }
            }
            if (~class157.field2437 != -5) {
                for (class477 var22 = (class477) class665.field9441.method3508((byte) -37); var22 != null; var22 = (class477) class665.field9441.method3520(-1)) {
                    int var23 = (int) (16383L & var22.field1039);
                    int var24 = -class265.field4123 + var23;
                    int var25 = (int) (16383L & var22.field1039 >> 14);
                    int var26 = var25 - class723.field10155;
                    if (var24 < 0 || ~var26 > -1 || ~var24 <= ~class191.field3229 || var26 >= class314.field4720) {
                        var22.method636((byte) 97);
                    }
                }
            }
            if (~class404.field5991 != -1) {
                class257.field4036 -= var8;
                class404.field5991 -= var7;
            }
            class327.method2114(47);
            if (~arg1 == -12) {
                if (~class639.field8978 != -5) {
                    class639.field8978 = 1;
                    class275.field4202 = -1;
                    class87.field1279 = -1;
                } else {
                    class590.field8319 -= var7 * 512;
                    class141.field2213 -= var8 * 512;
                    class617.field8705 -= var8 * 512;
                    class701.field9907 -= var7 * 512;
                }
            } else {
                class497.field7212 -= var7 * 512;
                class379.field5702 -= var7;
                class64.field1035 -= var8;
                class618.field8709 -= var7;
                class168.field2922 -= var8;
                class329.field4857 -= var8 * 512;
                if (Math.abs(var7) > class191.field3229 || Math.abs(var8) > class314.field4720) {
                    class525.method3121(-11701);
                }
            }
            class4.method18(352);
            class175.method1375(false);
            class85.field1253.method3465(0);
            class645.field9194.method3465(0);
            class383.field5749.method3269(arg4 ^ arg4);
            class430.method2675((byte) 29);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)I")
    public final int method133(int arg0, int arg1) {
        ++field8930;
        if (arg0 != 18648) {
            field8934 = -67;
        }
        if (super.field9224.method2291(-11) == class565.field8012) {
            if (super.field9224.method2294((byte) -128)) {
                return 3;
            } else {
                return arg1 != 0 && super.field9224.field5427.method3956(3) != 1 ? 2 : 1;
            }
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(ILhs;)V")
    public class635(int arg0, class358 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
    public final void method134(int arg0) {
        ++field8936;
        if (super.field9224.method2291(-11) == class565.field8012) {
            if (super.field9224.method2294((byte) -109)) {
                super.field9223 = 0;
            }
        } else {
            super.field9223 = 1;
        }
        if (arg0 != 1) {
            method3599(false, 74, 18, 87, -21);
        }
        if (~super.field9223 != -1 && ~super.field9223 != -2) {
            super.field9223 = this.method135(arg0 ^ -69);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIII[II)Z")
    public static final boolean method3600(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7) {
        ++field8927;
        if (arg0 < 0) {
            arg0 = 0;
        }
        int var8 = -42 % ((-38 - arg2) / 32);
        if (arg1 > class124.field1907) {
            arg1 = class124.field1907;
        }
        if (~arg0 <= ~arg1) {
            return true;
        } else {
            int var9 = arg0 + -1 + arg4;
            int var10 = -arg0 + arg1 >> 2;
            int var11 = arg0 * arg7 + arg5;
            if (class445.field6456 == 1) {
                class699.field9884 += var10;
                while (true) {
                    --var10;
                    if (~var10 > -1) {
                        int var12 = -arg0 + arg1 & 3;
                        while (true) {
                            --var12;
                            if (~var12 > -1) {
                                return true;
                            }
                            ++var9;
                            if (~arg6[var9] < ~var11) {
                                arg6[var9] = var11;
                            }
                            var11 += arg7;
                        }
                    }
                    ++var9;
                    if (arg6[var9] > var11) {
                        arg6[var9] = var11;
                    }
                    int var13 = arg7 + var11;
                    ++var9;
                    if (var13 < arg6[var9]) {
                        arg6[var9] = var13;
                    }
                    int var14 = arg7 + var13;
                    ++var9;
                    if (arg6[var9] > var14) {
                        arg6[var9] = var14;
                    }
                    int var15 = arg7 + var14;
                    ++var9;
                    if (var15 < arg6[var9]) {
                        arg6[var9] = var15;
                    }
                    var11 = arg7 + var15;
                }
            } else {
                int var16 = var11 - 38400;
                while (true) {
                    --var10;
                    if (var10 < 0) {
                        int var17 = 3 & -arg0 + arg1;
                        while (true) {
                            --var17;
                            if (var17 < 0) {
                                return true;
                            }
                            ++var9;
                            if (arg6[var9] > var16) {
                                return false;
                            }
                            var16 += arg7;
                        }
                    }
                    ++var9;
                    if (~arg6[var9] < ~var16) {
                        return false;
                    }
                    int var18 = arg7 + var16;
                    ++var9;
                    if (arg6[var9] > var18) {
                        return false;
                    }
                    int var19 = arg7 + var18;
                    ++var9;
                    if (~arg6[var9] < ~var19) {
                        return false;
                    }
                    int var20 = arg7 + var19;
                    int var10000 = ~var20;
                    ++var9;
                    if (var10000 > ~arg6[var9]) {
                        return false;
                    }
                    var16 = arg7 + var20;
                }
            }
        }
    }
}
