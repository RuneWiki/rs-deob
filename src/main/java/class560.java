import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class560 extends class252 {

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
    public static int field7889;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "I")
    public static int field7890;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "I")
    public static int field7891;

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "I")
    public static int field7892;

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "I")
    public static int field7893;

    @OriginalMember(owner = "client!cf", name = "t", descriptor = "I")
    public static int field7894;

    @OriginalMember(owner = "client!cf", name = "u", descriptor = "I")
    public static int field7895;

    @OriginalMember(owner = "client!cf", name = "v", descriptor = "I")
    public static int field7896;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "(I)Z", line = 3)
    public final boolean method792(int arg0) {
        ++field7889;
        if (arg0 != 6439) {
            this.method792(-75);
        }
        return false;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(ZI)V", line = 14)
    public final void method791(boolean arg0, int arg1) {
        ++field7890;
        if (arg1 != 1) {
            this.method794(true, 92);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z)V", line = 25)
    public final void method788(boolean arg0) {
        ++field7894;
        if (!arg0) {
            method3197(-46, true);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IZ)V", line = 36)
    public static final void method3197(int arg0, boolean arg1) {
        class685.field9652 = -1;
        class594.field8392 = -1;
        if (!arg1) {
            method3197(-40, false);
        }
        class599.field8465 = arg0;
        ++field7893;
        class596.field8425 = 0;
        class208.field2929 = null;
        class666.field9405 = false;
        class313.field4623 = 1;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(III)V", line = 56)
    public final void method796(int arg0, int arg1, int arg2) {
        if (arg2 <= -105) {
            ++field7892;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIZ)V", line = 66)
    public static final void method3198(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (class28 var5 = (class28) class436.field6382.method472((byte) -105); var5 != null; var5 = (class28) class436.field6382.method482(120)) {
            class568.method3229(var5, 110, arg0, arg1, arg3, arg2);
        }
        ++field7895;
        if (!arg4) {
            for (class28 var6 = (class28) class490.field6944.method472((byte) -110); var6 != null; var6 = (class28) class490.field6944.method482(-4)) {
                byte var11 = 1;
                class87 var12 = var6.field425.method2544(2);
                if (var6.field425.field6230) {
                    var11 = 0;
                } else if (~var6.field425.field6226 != ~var12.field1418 && var6.field425.field6226 != var12.field1451 && var6.field425.field6226 != var12.field1433 && var6.field425.field6226 != var12.field1440) {
                    if (~var6.field425.field6226 == ~var12.field1414 || ~var6.field425.field6226 == ~var12.field1464 || var6.field425.field6226 == var12.field1454 || var6.field425.field6226 == var12.field1423) {
                        var11 = 3;
                    }
                } else {
                    var11 = 2;
                }
                if (var6.field421 != var11) {
                    int var13 = class696.method3882((byte) 125, var6.field425);
                    class592 var14 = var6.field425.field8121;
                    if (var14.field8315 != null) {
                        var14 = var14.method3356(68, class61.field1163);
                    }
                    if (var14 != null && ~var13 != 0) {
                        if (~var6.field406 != ~var13 || !var14.field8355 != !var6.field404) {
                            if (var6.field430 != null) {
                                class627.field8780.method2114(var6.field430);
                                var6.field430 = null;
                            }
                            var6.field402 = null;
                            var6.field404 = var14.field8355;
                            var6.field428 = null;
                            var6.field406 = var13;
                        }
                    } else {
                        var6.field404 = false;
                        var6.field406 = -1;
                    }
                    var6.field421 = var11;
                }
                var6.field409 = var6.field425.field3024;
                var6.field413 = var6.field425.field3024 - -(var6.field425.method2553((byte) 122) << 8);
                var6.field416 = var6.field425.field3029;
                var6.field431 = var6.field425.field3029 + (var6.field425.method2553((byte) 78) << 8);
                class568.method3229(var6, -70, arg0, arg1, arg3, arg2);
            }
            for (class28 var7 = (class28) class423.field6151.method1407(-121); var7 != null; var7 = (class28) class423.field6151.method1413(true)) {
                byte var8 = 1;
                class87 var9 = var7.field429.method2544(2);
                if (var7.field429.field6230) {
                    var8 = 0;
                } else if (~var7.field429.field6226 != ~var9.field1418 && var7.field429.field6226 != var9.field1451 && var7.field429.field6226 != var9.field1433 && var7.field429.field6226 != var9.field1440) {
                    if (~var7.field429.field6226 == ~var9.field1414 || ~var7.field429.field6226 == ~var9.field1464 || ~var7.field429.field6226 == ~var9.field1454 || var7.field429.field6226 == var9.field1423) {
                        var8 = 3;
                    }
                } else {
                    var8 = 2;
                }
                if (var7.field421 != var8) {
                    int var10 = class595.method3369(var7.field429, false);
                    if (~var7.field406 != ~var10 || !var7.field429.field6998 != !var7.field404) {
                        if (var7.field430 != null) {
                            class627.field8780.method2114(var7.field430);
                            var7.field430 = null;
                        }
                        var7.field428 = null;
                        var7.field402 = null;
                        var7.field406 = var10;
                        var7.field404 = var7.field429.field6998;
                    }
                    var7.field421 = var8;
                }
                var7.field409 = var7.field429.field3024;
                var7.field413 = var7.field429.field3024 - -(var7.field429.method2553((byte) 104) << 8);
                var7.field416 = var7.field429.field3029;
                var7.field431 = var7.field429.field3029 + (var7.field429.method2553((byte) 99) << 8);
                class568.method3229(var7, -114, arg0, arg1, arg3, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lhea;)V", line = 199)
    public class560(class387 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZI)V", line = 203)
    public final void method794(boolean arg0, int arg1) {
        if (arg1 == -1) {
            ++field7896;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lbb;II)V", line = 218)
    public final void method790(class301 arg0, int arg1, int arg2) {
        ++field7891;
        super.field3884.method2337(false, arg0);
        super.field3884.method2308(arg2, arg1);
    }
}
