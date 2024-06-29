import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class505 extends class283 {

    @OriginalMember(owner = "client!vi", name = "r", descriptor = "I")
    private int field6737 = 0;

    @OriginalMember(owner = "client!vi", name = "p", descriptor = "Ldw;")
    private class673 field6735 = new class673();

    @OriginalMember(owner = "client!vi", name = "t", descriptor = "I")
    public static int field6739 = 0;

    @OriginalMember(owner = "client!vi", name = "A", descriptor = "[I")
    public static int[] field6746 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "I")
    public static int field6730;

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "I")
    public static int field6731;

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "I")
    public static int field6733;

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "I")
    public static int field6734;

    @OriginalMember(owner = "client!vi", name = "q", descriptor = "I")
    public static int field6736;

    @OriginalMember(owner = "client!vi", name = "s", descriptor = "I")
    public static int field6738;

    @OriginalMember(owner = "client!vi", name = "u", descriptor = "I")
    public static int field6740;

    @OriginalMember(owner = "client!vi", name = "v", descriptor = "I")
    public static int field6741;

    @OriginalMember(owner = "client!vi", name = "w", descriptor = "I")
    public static int field6742;

    @OriginalMember(owner = "client!vi", name = "x", descriptor = "I")
    public static int field6743;

    @OriginalMember(owner = "client!vi", name = "y", descriptor = "I")
    public static int field6744;

    @OriginalMember(owner = "client!vi", name = "z", descriptor = "I")
    public static int field6745;

    @OriginalMember(owner = "client!vi", name = "B", descriptor = "Lce;")
    public static class285 field6747;

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "Leda;")
    public static class90 field6732;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)V", line = 5)
    private final void method2799(byte arg0) {
        ++field6731;
        int var2 = super.field4011++;
        if (super.field4011 >= 5000) {
            super.field4011 = 0;
        }
        this.field6737 = super.field4006[var2];
        Object var3 = super.field4007[var2];
        super.field4007[var2] = null;
        int var4 = 120 % ((36 - arg0) / 47);
        if (this.field6737 == 21) {
            class615.method3367(this.field6735, (class24) var3);
        } else if (~this.field6737 != -21) {
            if (this.field6737 >= 30 && ~this.field6737 >= -34) {
                ((class139) var3).method201(class350.field4797, class173.field2673, class364.field4927, class516.field6888, ~(this.field6737 + -30) == -1);
            } else if (this.field6737 >= 40 && ~this.field6737 >= -44) {
                ((class139) var3).method201(class350.field4797, class173.field2673, class364.field4927, class659.field9356, ~(this.field6737 + -40) == -1);
            } else if (~this.field6737 == -23) {
                class269.field3751.method387(-1, 1583160, 40, 127);
            } else {
                if (~this.field6737 != -24) {
                    if (this.field6737 == 24) {
                        class269.field3751.method400(0, (class65[]) null);
                        return;
                    }
                } else {
                    class269.field3751.method414();
                }
            }
        } else {
            class24 var5 = (class24) var3;
            if (var5.field411 != null) {
                var5.field411.method147(class269.field3751, true);
            }
            if (var5.field406 != null) {
                var5.field406.method147(class269.field3751, true);
            }
            if (var5.field396 != null) {
                var5.field396.method147(class269.field3751, true);
            }
            if (var5.field413 != null) {
                var5.field413.method147(class269.field3751, true);
            }
            if (var5.field422 != null) {
                var5.field422.method147(class269.field3751, true);
            }
            for (class684 var6 = var5.field409; var6 != null; var6 = var6.field9618) {
                var6.field9619.method147(class269.field3751, true);
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(BLd;IZ)V", line = 103)
    public final void method1411(byte arg0, class139 arg1, int arg2, boolean arg3) {
        super.field4006[super.field4004] = (byte) (!arg3 ? arg2 + 30 : arg2 + 40);
        ++field6742;
        super.field4007[super.field4004] = arg1;
        ++super.field4004;
        if (~super.field4004 <= -5001) {
            super.field4004 = 0;
        }
        if (arg0 < 86) {
            this.field6737 = 27;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZI)V", line = 121)
    public final void method1409(boolean arg0, int arg1) {
        super.field4006[super.field4004] = (byte) arg1;
        ++field6745;
        ++super.field4004;
        if (super.field4004 >= 5000) {
            super.field4004 = 0;
        }
        if (!arg0) {
            this.method1406((class24) null, (byte) -122);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIZIZI)V", line = 137)
    public static final void method2800(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5) {
        if (!arg2) {
            field6732 = null;
        }
        ++field6733;
        if (~(arg4 ? class344.field4718.field5429 : class344.field4718.field5450) != -1 && ~arg5 != -1 && class273.field3798 < 50 && ~arg3 != 0) {
            class653.field8828[class273.field3798++] = new class70((byte) (arg4 ? 3 : 2), arg3, arg5, arg0, arg1, 0);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lno;IIII)Lmn;", line = 155)
    public static final class340 method2801(class658 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 73) {
            field6732 = null;
        }
        ++field6736;
        if (!arg0.field9273 && (!class230.method1441(true, arg1) || !class230.method1441(true, arg4))) {
            return arg0.field9310 ? new class340(arg0, 34037, arg3, arg1, arg4) : new class340(arg0, arg3, arg1, arg4, class587.method3231(true, arg1), class587.method3231(true, arg4));
        } else {
            return new class340(arg0, 3553, arg3, arg1, arg4);
        }
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(Z)V", line = 174)
    public final void method1407(boolean arg0) {
        if (!arg0) {
            this.method2799((byte) -74);
        }
        ++field6738;
        while (super.field4011 != super.field4004) {
            this.method2799((byte) -81);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IB)V", line = 189)
    public final void method1408(int arg0, byte arg1) {
        if (arg1 != 6) {
            field6740 = 35;
        }
        ++field6734;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lfba;I)V", line = 200)
    public final void method1405(class24 arg0, int arg1) {
        ++field6743;
        super.field4006[super.field4004] = 21;
        super.field4007[super.field4004] = arg0;
        if (arg1 == 103) {
            ++super.field4004;
            if (super.field4004 >= 5000) {
                super.field4004 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)V", line = 219)
    public static void method2802(int arg0) {
        if (arg0 != -9050) {
            method2800(-9, 30, true, -1, true, -62);
        }
        field6732 = null;
        field6747 = null;
        field6746 = null;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILfba;)V", line = 247)
    public final void method1410(int arg0, class24 arg1) {
        super.field4006[super.field4004] = 20;
        ++field6730;
        if (arg0 < 42) {
            this.method1408(-70, (byte) 118);
        }
        super.field4007[super.field4004] = arg1;
        ++super.field4004;
        if (~super.field4004 <= -5001) {
            super.field4004 = 0;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Z)V", line = 268)
    public final void method1400(boolean arg0) {
        if (!arg0) {
            this.method1406((class24) null, (byte) -80);
        }
        ++field6741;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lfba;B)V", line = 283)
    public final void method1406(class24 arg0, byte arg1) {
        --super.field4011;
        ++field6744;
        if (arg1 > -69) {
            field6740 = -12;
        }
        if (super.field4011 < 0) {
            super.field4011 = 4999;
        }
        super.field4006[super.field4011] = 21;
        super.field4007[super.field4011] = arg0;
    }
}
