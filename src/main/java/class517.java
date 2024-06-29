import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class517 extends class305 {

    @OriginalMember(owner = "client!cn", name = "i", descriptor = "I")
    public static int field7383;

    @OriginalMember(owner = "client!cn", name = "j", descriptor = "I")
    public static int field7384;

    @OriginalMember(owner = "client!cn", name = "k", descriptor = "I")
    public static int field7385;

    @OriginalMember(owner = "client!cn", name = "l", descriptor = "I")
    public static int field7386;

    @OriginalMember(owner = "client!cn", name = "m", descriptor = "I")
    public static int field7387;

    @OriginalMember(owner = "client!cn", name = "n", descriptor = "I")
    public static int field7388;

    @OriginalMember(owner = "client!cn", name = "o", descriptor = "I")
    public static int field7389;

    @OriginalMember(owner = "client!cn", name = "p", descriptor = "I")
    public static int field7390;

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "(II)I")
    public final int method306(int arg0, int arg1) {
        ++field7384;
        if (arg0 != 31401) {
            field7387 = -77;
        }
        return 1;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lcs;BIIIIIILha;III)V")
    public static final void method3051(class342 arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class60 arg8, int arg9, int arg10, int arg11) {
        if (~arg2 < ~arg10 && ~(arg10 - -arg9) < ~arg2 && ~arg5 < ~(arg7 + -13) && ~(arg7 + 3) < ~arg5 && arg0.field4960) {
            arg4 = arg11;
        }
        ++field7386;
        int[] var12 = null;
        if (class88.method713(0, arg0.field4972)) {
            var12 = class336.field4876.method2079((int) arg0.field4971, (byte) -79).field8219;
        } else if (arg0.field4961 == -1) {
            if (!class615.method3555(arg0.field4972, 5066)) {
                if (class348.method2203((byte) 87, arg0.field4972)) {
                    Object var13 = null;
                    class211 var14;
                    if (~arg0.field4972 == -1009) {
                        var14 = class239.field3470.method388((int) arg0.field4971, 100);
                    } else {
                        var14 = class239.field3470.method388((int) (arg0.field4971 >>> 32 & 2147483647L), 100);
                    }
                    if (var14.field3172 != null) {
                        var14 = var14.method1442((byte) -50, class83.field1160);
                    }
                    if (var14 != null) {
                        var12 = var14.field3098;
                    }
                }
            } else {
                class432 var15 = (class432) class497.field7067.method2287((long) ((int) arg0.field4971), (byte) -117);
                if (var15 != null) {
                    class282 var16 = var15.field6439;
                    class348 var17 = var16.field4008;
                    if (var17.field5076 != null) {
                        var17 = var17.method2207(107, class83.field1160);
                    }
                    if (var17 != null) {
                        var12 = var17.field5045;
                    }
                }
            }
        } else {
            var12 = class336.field4876.method2079(arg0.field4961, (byte) -91).field8219;
        }
        String var18 = class180.method1277((byte) -85, arg0);
        if (var12 != null) {
            var18 = var18 + class518.method3056(0, var12);
        }
        if (arg1 >= -53) {
            field7387 = 79;
        }
        class298.field4225.method558(arg10 - -3, arg4, arg7, var18, 0, class259.field3701, class409.field6169, 118);
        if (arg0.field4965) {
            class385.field5817.method3142(class335.field4827.method587(89, var18) + arg10 + 5, arg7 + -12);
        }
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(ILhb;)V")
    public class517(int arg0, class728 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)I")
    public final int method305(byte arg0) {
        if (arg0 != 68) {
            return -12;
        } else {
            ++field7390;
            return 1;
        }
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(I)V")
    public static final void method3052(int arg0) {
        class85.field1210 = new class417[500];
        class233.field3398 = 0;
        class44.field480 = 0;
        class31.field316 = new class417[500];
        ++field7383;
        class574.field8113 = class504.field7164;
        class315.field4461 = new class417[1000];
        class411.field6179 = 0;
        class262.field3715 = false;
        class266.field3799 = arg0;
        class240.field3494 = new class417[2000];
        class70.field986 = new int[class409.field6165][class34.field356 - -1][class565.field8040 + 1];
        class664.field9302 = class504.field7164;
        if (class118.field1620 instanceof class696) {
            class24.field247 = false;
        } else {
            class24.field247 = true;
        }
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(II)V")
    public final void method303(int arg0, int arg1) {
        super.field4320 = arg1;
        ++field7385;
        if (arg0 != -27751) {
            this.method305((byte) -18);
        }
    }

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "(I)I")
    public final int method3053(int arg0) {
        ++field7389;
        if (arg0 != 17503) {
            this.method303(106, 32);
        }
        return super.field4320;
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lhb;)V")
    public class517(class728 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(B)V")
    public final void method308(byte arg0) {
        ++field7388;
        if (arg0 < -40) {
            if (super.field4320 != 1 && super.field4320 != 0) {
                super.field4320 = this.method305((byte) 68);
            }
        }
    }
}
