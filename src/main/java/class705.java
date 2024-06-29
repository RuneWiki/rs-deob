import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!waa")
public class class705 extends class305 {

    @OriginalMember(owner = "client!waa", name = "o", descriptor = "Lmia;")
    public static class63 field9933 = new class63(70, 0);

    @OriginalMember(owner = "client!waa", name = "i", descriptor = "I")
    public static int field9927;

    @OriginalMember(owner = "client!waa", name = "j", descriptor = "I")
    public static int field9928;

    @OriginalMember(owner = "client!waa", name = "k", descriptor = "I")
    public static int field9929;

    @OriginalMember(owner = "client!waa", name = "l", descriptor = "I")
    public static int field9930;

    @OriginalMember(owner = "client!waa", name = "m", descriptor = "I")
    public static int field9931;

    @OriginalMember(owner = "client!waa", name = "n", descriptor = "I")
    public static int field9932;

    @OriginalMember(owner = "client!waa", name = "p", descriptor = "I")
    public static int field9934;

    @OriginalMember(owner = "client!waa", name = "q", descriptor = "I")
    public static int field9935;

    @OriginalMember(owner = "client!waa", name = "r", descriptor = "I")
    public static int field9936;

    @OriginalMember(owner = "client!waa", name = "s", descriptor = "I")
    public static int field9937;

    @OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(ILhb;)V")
    public class705(int arg0, class728 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "(B)V")
    public final void method308(byte arg0) {
        ++field9930;
        if (arg0 <= -40) {
            if (super.field4323.method4107(true) == class555.field7936) {
                if (super.field4323.method4110(-22215)) {
                    super.field4320 = 0;
                }
            } else {
                super.field4320 = 1;
            }
            if (~super.field4320 != -1 && ~super.field4320 != -2) {
                super.field4320 = this.method305((byte) 68);
            }
        }
    }

    @OriginalMember(owner = "client!waa", name = "c", descriptor = "(II)I")
    public final int method306(int arg0, int arg1) {
        if (arg0 != 31401) {
            method4010();
        }
        ++field9932;
        if (super.field4323.method4107(true) == class555.field7936) {
            if (super.field4323.method4110(-22215)) {
                return 3;
            } else {
                return ~arg1 != -1 && super.field4323.field10207.method3961(17503) != 1 ? 2 : 1;
            }
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(B)I")
    public final int method305(byte arg0) {
        if (arg0 != 68) {
            method4011(-125, 115, 97, -53, (class60) null, -89, -127, -96);
        }
        ++field9927;
        return 1;
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(ILns;)I")
    public static final int method4007(int arg0, class405 arg1) {
        ++field9935;
        if (arg1.field6088 == arg0) {
            return 0;
        } else {
            if (~arg1.field6125 != 0) {
                class405 var2 = null;
                if (~arg1.field6125 > -32769) {
                    class432 var3 = (class432) class497.field7067.method2287((long) arg1.field6125, (byte) -117);
                    if (var3 != null) {
                        var2 = var3.field6439;
                    }
                } else if (arg1.field6125 >= 32768) {
                    var2 = class314.field4456[arg1.field6125 + -32768];
                }
                if (var2 != null) {
                    int var4 = -var2.field8423 + arg1.field8423;
                    int var5 = arg1.field8428 - var2.field8428;
                    if (~var4 != -1 || ~var5 != -1) {
                        arg1.method2584((int) (Math.atan2((double) var4, (double) var5) * 2607.5945876176133D) & 16383, (byte) -127);
                    }
                }
            }
            if (!(arg1 instanceof class689)) {
                if (arg1 instanceof class282) {
                    class282 var6 = (class282) arg1;
                    if (var6.field4005 != -1 && (var6.field6130 == 0 || ~var6.field6132 < -1)) {
                        int var7 = -((-class361.field5224 + var6.field4005 - class361.field5224) * 256) + var6.field8423;
                        int var8 = var6.field8428 - (-class582.field8288 + -class582.field8288 + var6.field3987) * 256;
                        if (~var7 != -1 || ~var8 != -1) {
                            var6.method2584((int) (2607.5945876176133D * Math.atan2((double) var7, (double) var8)) & 16383, (byte) -101);
                        }
                        var6.field4005 = -1;
                    }
                }
            } else {
                class689 var9 = (class689) arg1;
                if (~var9.field9535 != 0 && (var9.field6130 == 0 || ~var9.field6132 < -1)) {
                    var9.method2584(var9.field9535, (byte) -111);
                    var9.field9535 = -1;
                }
            }
            return arg1.method2586(arg0 + -124);
        }
    }

    @OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(Lhb;)V")
    public class705(class728 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(Z)V")
    public static void method4008(boolean arg0) {
        field9933 = null;
        if (arg0) {
            field9936 = 78;
        }
    }

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "(II)V")
    public final void method303(int arg0, int arg1) {
        ++field9934;
        super.field4320 = arg1;
        if (arg0 != -27751) {
            field9933 = null;
        }
    }

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "(I)I")
    public final int method4009(int arg0) {
        ++field9931;
        if (arg0 != 17503) {
            field9936 = -55;
        }
        return super.field4320;
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "()V")
    public static final void method4010() {
        for (int var0 = 0; var0 < class449.field6662.length; ++var0) {
            class449.field6662[var0].method1385();
        }
        class449.field6662 = null;
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(IIIILha;III)V")
    public static final void method4011(int arg0, int arg1, int arg2, int arg3, class60 arg4, int arg5, int arg6, int arg7) {
        int var8 = -73 / ((arg3 - -37) / 45);
        class502.field7152 = arg4;
        ++field9928;
        class234.field3411 = class502.field7152.method515();
        class421.field6280 = class502.field7152.method515();
        class111.field1551 = class502.field7152.method515();
        class634.field8902 = arg6;
        class22.field234 = 1;
        class386.field5833 = 0;
        class437.field6477 = arg7;
        class9.field126 = arg0;
        class753.field10520 = null;
        class656.field9195 = arg5;
        class672.field9372 = 0;
        class74.method624(arg1, arg2, 46);
    }

    @OriginalMember(owner = "client!waa", name = "c", descriptor = "(I)Z")
    public final boolean method4012(int arg0) {
        ++field9929;
        if (arg0 != 2) {
            return false;
        } else if (super.field4323.method4107(true) == class555.field7936) {
            return !super.field4323.method4110(arg0 ^ -22213);
        } else {
            return false;
        }
    }
}
