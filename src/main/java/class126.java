import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class126 extends class197 {

    @OriginalMember(owner = "client!pk", name = "v", descriptor = "I")
    private int field2047 = 0;

    @OriginalMember(owner = "client!pk", name = "q", descriptor = "Lpi;")
    private class329 field2042 = new class329();

    @OriginalMember(owner = "client!pk", name = "o", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!pk", name = "p", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!pk", name = "r", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!pk", name = "s", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!pk", name = "t", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!pk", name = "u", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!pk", name = "w", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!pk", name = "x", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!pk", name = "y", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!pk", name = "z", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(II)V", line = 3)
    public final void method855(int arg0, int arg1) {
        if (arg0 == 768) {
            ++field2050;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIFLfo;Z)V", line = 14)
    public final void method856(int arg0, int arg1, float arg2, class343 arg3, boolean arg4) {
        ++field2044;
        if (arg1 != 0) {
            this.field2047 = 65;
        }
        super.field3108[super.field3099] = (byte) (arg4 ? arg0 + 40 : arg0 + 30);
        super.field3112[super.field3099] = arg3;
        super.field3102[super.field3099] = arg2;
        ++super.field3099;
        if (~super.field3099 <= -5001) {
            super.field3099 = 0;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Loh;I)V", line = 33)
    public final void method857(class268 arg0, int arg1) {
        --super.field3107;
        ++field2040;
        if (arg1 > super.field3107) {
            super.field3107 = 4999;
        }
        super.field3108[super.field3107] = 21;
        super.field3112[super.field3107] = arg0;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)V", line = 49)
    public final void method858(byte arg0) {
        if (arg0 < -46) {
            while (super.field3107 != super.field3099) {
                this.method861(-9515);
            }
            ++field2045;
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(II)V", line = 67)
    public final void method859(int arg0, int arg1) {
        super.field3108[super.field3099] = (byte) arg0;
        ++field2046;
        if (arg1 != 768) {
            this.field2042 = null;
        }
        ++super.field3099;
        if (super.field3099 >= 5000) {
            super.field3099 = 0;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Z)V", line = 85)
    public final void method860(boolean arg0) {
        if (!arg0) {
            this.method857((class268) null, -5);
        }
        ++field2043;
    }

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "(I)V", line = 96)
    private final void method861(int arg0) {
        if (arg0 != -9515) {
            this.method856(-120, 47, 0.1742203F, (class343) null, false);
        }
        ++field2049;
        int var2 = super.field3107++;
        if (super.field3107 >= 5000) {
            super.field3107 = 0;
        }
        this.field2047 = super.field3108[var2];
        Object var3 = super.field3112[var2];
        super.field3112[var2] = null;
        if (this.field2047 == 21) {
            class376.method2267(this.field2042, (class268) var3);
        } else {
            if (~this.field2047 != -21) {
                if (~this.field2047 <= -31 && ~this.field2047 >= -34) {
                    class179.field2801.method1993(3000.0F, super.field3102[var2] * 1.5F);
                    ((class343) var3).method312(class7.field82, class248.field3812, class320.field4826, class358.field5313, this.field2047 + -30 == 0);
                    return;
                }
                if (this.field2047 >= 40 && ~this.field2047 >= -44) {
                    class179.field2801.method1993(3000.0F, super.field3102[var2] * 1.5F);
                    ((class343) var3).method312(class7.field82, class248.field3812, class320.field4826, class323.field4845, this.field2047 + -40 == 0);
                    return;
                }
                if (this.field2047 == 22) {
                    class179.field2801.method1940(-1, 1583160, 40, 127);
                    return;
                }
                if (~this.field2047 == -24) {
                    class179.field2801.method1958();
                    return;
                }
                if (this.field2047 == 24) {
                    class179.field2801.method1916(0, (class480[]) null);
                    return;
                }
            } else {
                class268 var4 = (class268) var3;
                if (var4.field4059 != null) {
                    var4.field4059.method172(false, class179.field2801);
                }
                if (var4.field4063 != null) {
                    var4.field4063.method172(false, class179.field2801);
                }
                if (var4.field4052 != null) {
                    var4.field4052.method172(false, class179.field2801);
                }
                if (var4.field4051 != null) {
                    var4.field4051.method172(false, class179.field2801);
                }
                if (var4.field4042 != null) {
                    var4.field4042.method172(false, class179.field2801);
                }
                for (class297 var5 = var4.field4045; var5 != null; var5 = var5.field4500) {
                    var5.field4505.method172(false, class179.field2801);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BLoh;)V", line = 193)
    public final void method862(byte arg0, class268 arg1) {
        if (arg0 != 94) {
            this.field2042 = null;
        }
        super.field3108[super.field3099] = 20;
        ++field2051;
        super.field3112[super.field3099] = arg1;
        ++super.field3099;
        if (~super.field3099 <= -5001) {
            super.field3099 = 0;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lqq;B)V", line = 210)
    public static final void method863(class318 arg0, byte arg1) {
        if (arg1 >= 6) {
            ++field2041;
            if (~class241.field3636 != ~class286.field4329.field3217) {
                if (class321.field4830 != null) {
                    if (class64.method445(class286.field4329.field3217, 2943, arg0)) {
                        class241.field3636 = class286.field4329.field3217;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(Loh;I)V", line = 232)
    public final void method864(class268 arg0, int arg1) {
        ++field2048;
        super.field3108[super.field3099] = 21;
        if (arg1 <= 103) {
            this.field2042 = null;
        }
        super.field3112[super.field3099] = arg0;
        ++super.field3099;
        if (super.field3099 >= 5000) {
            super.field3099 = 0;
        }
    }
}
