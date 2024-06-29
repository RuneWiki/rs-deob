import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class468 extends class403 {

    @OriginalMember(owner = "client!bn", name = "V", descriptor = "I")
    public static int field6535;

    @OriginalMember(owner = "client!bn", name = "Gb", descriptor = "I")
    public static int field6536;

    @OriginalMember(owner = "client!bn", name = "Hb", descriptor = "I")
    public static int field6537;

    @OriginalMember(owner = "client!bn", name = "Ib", descriptor = "I")
    public static int field6538;

    @OriginalMember(owner = "client!bn", name = "Lb", descriptor = "I")
    public static int field6541;

    @OriginalMember(owner = "client!bn", name = "Mb", descriptor = "I")
    public static int field6542;

    @OriginalMember(owner = "client!bn", name = "Nb", descriptor = "I")
    public static int field6543;

    @OriginalMember(owner = "client!bn", name = "Ob", descriptor = "I")
    public static int field6544;

    @OriginalMember(owner = "client!bn", name = "Qb", descriptor = "I")
    private int field6546;

    @OriginalMember(owner = "client!bn", name = "Rb", descriptor = "I")
    public static int field6547;

    @OriginalMember(owner = "client!bn", name = "Sb", descriptor = "I")
    public static int field6548;

    @OriginalMember(owner = "client!bn", name = "Tb", descriptor = "I")
    public static int field6549;

    @OriginalMember(owner = "client!bn", name = "Ub", descriptor = "I")
    public static int field6550;

    @OriginalMember(owner = "client!bn", name = "Jb", descriptor = "Ler;")
    public static class117 field6539;

    @OriginalMember(owner = "client!bn", name = "Kb", descriptor = "Lkl;")
    private class87 field6540;

    @OriginalMember(owner = "client!bn", name = "Pb", descriptor = "[Lwu;")
    public static class393[] field6545;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lbt;B)V")
    public static final void method2798(class48 arg0, byte arg1) {
        ++field6543;
        class321.field3974 = 0;
        class196.field2342 = 0;
        class148.field1836 = new class408();
        if (arg1 == 32) {
            class116.field1474 = new class360[1024];
            class345.field4326 = new class766[class384.field4906[class538.field7580] + 1];
            class413.field5388 = 0;
            class537.field7551 = 0;
            class552.method3237(arg0, (byte) -116);
            class656.method3704(arg1 + -24, arg0);
        }
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(I[I)V")
    public final void method2799(int arg0, int[] arg1) {
        ++field6537;
        this.field6540 = new class87(arg1);
        if (arg0 > -54) {
            this.method2803(-87, -83);
        }
    }

    @OriginalMember(owner = "client!bn", name = "x", descriptor = "(I)V")
    public final void method2800(int arg0) {
        ++field6538;
        this.field6546 = super.field5262 * arg0;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lkl;I)V")
    public final void method2801(class87 arg0, int arg1) {
        ++field6544;
        if (arg1 == 18760) {
            this.field6540 = arg0;
        }
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(I)V")
    public class468(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!bn", name = "m", descriptor = "(II)I")
    public final int method2802(int arg0, int arg1) {
        ++field6547;
        int var3 = this.field6546 >> 3;
        int var4 = -(this.field6546 & 7) + 8;
        int var5 = 0;
        if (arg1 != -20468) {
            field6545 = null;
        }
        this.field6546 += arg0;
        while (arg0 > var4) {
            var5 += (super.field5275[var3++] & class38.field557[var4]) << -var4 + arg0;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (~arg0 == ~var4) {
            var6 = (class38.field557[var4] & super.field5275[var3]) + var5;
        } else {
            var6 = (super.field5275[var3] >> -arg0 + var4 & class38.field557[arg0]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!bn", name = "n", descriptor = "(II)I")
    public final int method2803(int arg0, int arg1) {
        if (arg0 <= 75) {
            field6539 = null;
        }
        ++field6549;
        return arg1 * 8 + -this.field6546;
    }

    @OriginalMember(owner = "client!bn", name = "y", descriptor = "(I)Z")
    public final boolean method2804(int arg0) {
        ++field6548;
        int var2 = 255 & super.field5275[super.field5262] - this.field6540.method800(105);
        if (arg0 != 8) {
            this.field6540 = null;
        }
        return ~var2 <= -129;
    }

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "(Z)V")
    public static void method2805(boolean arg0) {
        if (!arg0) {
            field6539 = null;
        }
        field6539 = null;
        field6545 = null;
    }

    @OriginalMember(owner = "client!bn", name = "z", descriptor = "(I)V")
    public final void method2806(int arg0) {
        if (arg0 != -23187) {
            this.method2804(-107);
        }
        ++field6535;
        super.field5262 = (this.field6546 + 7) / 8;
    }

    @OriginalMember(owner = "client!bn", name = "n", descriptor = "(B)I")
    public final int method2807(byte arg0) {
        ++field6550;
        int var2 = 255 & super.field5275[super.field5262++] + -this.field6540.method799(107);
        if (~var2 > -129) {
            return var2;
        } else {
            if (arg0 >= -39) {
                this.field6546 = 39;
            }
            return (var2 + -128 << 8) + (super.field5275[super.field5262++] - this.field6540.method799(100) & 255);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(III[B)V")
    public final void method2808(int arg0, int arg1, int arg2, byte[] arg3) {
        ++field6541;
        for (int var5 = 0; ~var5 > ~arg2; ++var5) {
            arg3[var5 - -arg0] = (byte) (super.field5275[super.field5262++] + -this.field6540.method799(111));
        }
        if (arg1 != 32130) {
            this.field6540 = null;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Ldw;I)I")
    public static final int method2809(class748 arg0, int arg1) {
        if (arg1 != 5120) {
            return 64;
        } else {
            ++field6536;
            if (class748.field10378 == arg0) {
                return 5120;
            } else if (class748.field10380 != arg0) {
                if (class748.field10382 != arg0) {
                    if (class748.field10384 != arg0) {
                        if (class748.field10385 == arg0) {
                            return 5123;
                        } else if (class748.field10386 == arg0) {
                            return 5125;
                        } else if (class748.field10387 == arg0) {
                            return 5131;
                        } else if (class748.field10388 == arg0) {
                            return 5126;
                        } else {
                            throw new IllegalArgumentException("");
                        }
                    } else {
                        return 5121;
                    }
                } else {
                    return 5124;
                }
            } else {
                return 5122;
            }
        }
    }

    @OriginalMember(owner = "client!bn", name = "o", descriptor = "(II)V")
    public final void method2810(int arg0, int arg1) {
        ++field6542;
        super.field5275[super.field5262++] = (byte) (arg1 + this.field6540.method799(104));
        int var3 = 98 % ((5 - arg0) / 47);
    }
}
