import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class227 extends class210 {

    @OriginalMember(owner = "client!ui", name = "jc", descriptor = "I")
    public static int field4056 = 0;

    @OriginalMember(owner = "client!ui", name = "kc", descriptor = "I")
    public static int field4057 = -1;

    @OriginalMember(owner = "client!ui", name = "nc", descriptor = "[I")
    public static int[] field4060 = new int[5];

    @OriginalMember(owner = "client!ui", name = "uc", descriptor = "I")
    public static int field4067 = 0;

    @OriginalMember(owner = "client!ui", name = "wc", descriptor = "Lcf;")
    public static class93 field4069 = class147.method1066("violet:", -48);

    @OriginalMember(owner = "client!ui", name = "xc", descriptor = "Lcf;")
    public static class93 field4070 = class147.method1066("(U3", -48);

    @OriginalMember(owner = "client!ui", name = "Ac", descriptor = "Lcf;")
    public static class93 field4073 = class147.method1066("Ausw-=hlen", -48);

    @OriginalMember(owner = "client!ui", name = "tc", descriptor = "Lcf;")
    public static class93 field4066 = class147.method1066(")2", -48);

    @OriginalMember(owner = "client!ui", name = "Bc", descriptor = "Lcf;")
    public static class93 field4074 = class147.method1066(" steht bereits auf Ihrer Ignorieren)2Liste(Q", -48);

    @OriginalMember(owner = "client!ui", name = "lc", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!ui", name = "mc", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!ui", name = "oc", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!ui", name = "qc", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!ui", name = "rc", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!ui", name = "sc", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!ui", name = "vc", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!ui", name = "zc", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!ui", name = "Cc", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!ui", name = "pc", descriptor = "Lkj;")
    public class145 field4062;

    @OriginalMember(owner = "client!ui", name = "yc", descriptor = "[[[B")
    public static byte[][][] field4071;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIIIIIJILod;)V")
    public final void method106(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class91 arg10) {
        ++field4061;
        if (this.field4062 != null) {
            class31 var13 = ~super.field3840 != 0 && ~super.field3869 == -1 ? class131.method964(super.field3840, true) : null;
            class31 var14 = super.field3797 == -1 || ~super.field3797 == ~this.method1483(0).field800 && var13 != null ? null : class131.method964(super.field3797, true);
            class20 var15 = this.field4062.method1047(super.field3852, super.field3775, (byte) 74, super.field3811, super.field3767, super.field3796, super.field3817, var13, var14, super.field3862);
            if (var15 != null) {
                super.field3864 = var15.method93();
                class145 var16 = this.field4062;
                if (var16.field2523 != null) {
                    var16 = var16.method1058(249);
                }
                if (class154.field2697 && var16.field2503) {
                    class20 var17 = class163.method1179((byte) 120, super.field3784, this.field4062.field2556, this.field4062.field2505, this.field4062.field2566, arg0, var14 == null ? super.field3852 : super.field3862, super.field3859, super.field3868, this.field4062.field2536, var14 != null ? var14 : var13, super.field3795, var15, this.field4062.field2504);
                    var17.method106(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, super.field3824);
                }
                class20 var18 = null;
                this.method1480(-15429, var15);
                this.method1477(var15, arg0, (byte) -25);
                if (super.field3846 != -1 && super.field3847 != -1) {
                    class135 var19 = class188.method1359(super.field3846, -77);
                    var18 = var19.method984(super.field3829, (byte) 124, super.field3847, super.field3798);
                    if (var18 != null) {
                        var18.method117(0, -super.field3844, 0);
                        if (var19.field2358) {
                            if (class53.field882 != 0) {
                                var18.method107(class53.field882);
                            }
                            if (~field4067 != -1) {
                                var18.method109(field4067);
                            }
                            if (class191.field3494 != 0) {
                                var18.method117(0, class191.field3494, 0);
                            }
                        }
                    }
                }
                if (var18 != null) {
                    var15 = ((class62) var15).method394(var18);
                }
                if (~this.field4062.field2504 == -2) {
                    var15.field264 = true;
                }
                var15.method106(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.field3824);
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIII)V")
    public final void method95(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4058;
        if (this.field4062 != null) {
            ;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lkj;I)V")
    public final void method1561(class145 arg0, int arg1) {
        this.field4062 = arg0;
        ++field4072;
        if (arg1 != 14579) {
            field4074 = null;
        }
        if (super.field3824 != null) {
            super.field3824.method630();
        }
    }

    @OriginalMember(owner = "client!ui", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field4075;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "()I")
    public final int method93() {
        ++field4064;
        return super.field3864;
    }

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "(I)V")
    public static void method1562(int arg0) {
        field4060 = null;
        field4073 = null;
        field4069 = null;
        field4071 = null;
        field4070 = null;
        field4066 = null;
        field4074 = null;
        if (arg0 != 15) {
            field4060 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)Z")
    public final boolean method1478(byte arg0) {
        ++field4065;
        int var2 = -34 % ((arg0 - -57) / 46);
        return this.field4062 != null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IBILtg;)V")
    public static final void method1563(int arg0, byte arg1, int arg2, class181 arg3) {
        ++field4059;
        if (~class253.field4549 <= -3 || ~class268.field4769 != -1 || class263.field4695) {
            int var4 = -30 % ((arg1 - 40) / 54);
            class93 var5 = class38.method220((byte) -127);
            if (arg3 == null) {
                int var6 = class183.field3383.method1838(var5, arg0 - -4, arg2 - -15, 16777215, 0, class108.field1849, class47.field768);
                class195.method1396(15, arg0 - -4, var6 + class183.field3383.method1820(var5), arg2, 0);
            } else {
                class274 var7 = arg3.method1330((byte) -113, class140.field2434);
                if (var7 == null) {
                    var7 = class183.field3383;
                }
                var7.method1825(var5, arg0, arg2, arg3.field3270, arg3.field3252, arg3.field3180, arg3.field3232, arg3.field3183, arg3.field3288, class108.field1849, class47.field768, class149.field2623);
                class195.method1396(class149.field2623[3], class149.field2623[0], class149.field2623[2], class149.field2623[1], 0);
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "(I)I")
    public final int method1486(int arg0) {
        ++field4068;
        if (class78.field1460 != arg0 && this.field4062.field2523 != null) {
            class145 var2 = this.field4062.method1058(249);
            if (var2 != null && var2.field2533 != -1) {
                return var2.field2533;
            }
        }
        return super.field3861;
    }
}
