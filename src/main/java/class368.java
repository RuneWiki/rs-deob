import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class368 extends class497 {

    @OriginalMember(owner = "client!tu", name = "t", descriptor = "Z")
    private boolean field5116 = false;

    @OriginalMember(owner = "client!tu", name = "n", descriptor = "Z")
    public static boolean field5110 = false;

    @OriginalMember(owner = "client!tu", name = "u", descriptor = "[I")
    public static int[] field5117 = new int[3];

    @OriginalMember(owner = "client!tu", name = "l", descriptor = "I")
    public static int field5108;

    @OriginalMember(owner = "client!tu", name = "m", descriptor = "I")
    public static int field5109;

    @OriginalMember(owner = "client!tu", name = "p", descriptor = "I")
    public static int field5112;

    @OriginalMember(owner = "client!tu", name = "q", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!tu", name = "r", descriptor = "I")
    public static int field5114;

    @OriginalMember(owner = "client!tu", name = "s", descriptor = "I")
    public static int field5115;

    @OriginalMember(owner = "client!tu", name = "v", descriptor = "I")
    public static int field5118;

    @OriginalMember(owner = "client!tu", name = "w", descriptor = "I")
    public static int field5119;

    @OriginalMember(owner = "client!tu", name = "x", descriptor = "I")
    public static int field5120;

    @OriginalMember(owner = "client!tu", name = "o", descriptor = "Lie;")
    public static class6 field5111;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IBI)V", line = 6)
    public final void method923(int arg0, byte arg1, int arg2) {
        if (arg1 > 5) {
            ++field5108;
        }
    }

    @OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Lpj;)V", line = 16)
    public class368(class156 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "(B)V", line = 20)
    public static void method2297(byte arg0) {
        field5117 = null;
        field5111 = null;
        if (arg0 != 84) {
            method2297((byte) -44);
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(III)V", line = 31)
    public static final void method2298(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            method2299(-76, (class281) null);
        }
        ++field5115;
        if (class571.field8060 != null) {
            int var3 = class703.field9803;
            int var4 = class422.field5771;
            class483.method2886(arg0, arg1, (byte) -57);
            if (~class763.field10520 == -1) {
                class523.field7393 = null;
                class523.field7393 = class571.field8060.method443(class571.field8060.method481(class194.field2992, class549.field7896), class571.field8060.method532(class194.field2992, class549.field7896));
            } else if (class763.field10520 == 1 && (class537.field7719 == null || class703.field9803 != var3 || ~class422.field5771 != ~var4)) {
                class537.field7719 = new class555[class703.field9803 * class422.field5771];
                for (int var5 = 0; var5 < class537.field7719.length; ++var5) {
                    class537.field7719[var5] = class571.field8060.method443(class571.field8060.method481(class103.field1192, class373.field5148), class571.field8060.method532(class103.field1192, class373.field5148));
                }
                class641.field8975 = new int[class703.field9803 * class422.field5771];
                class601.field8432 = 1;
            }
            class98.field1115 = true;
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(ZB)V", line = 86)
    public final void method928(boolean arg0, byte arg1) {
        super.field7086.method1080(class463.field6532, class776.field10666, -30);
        int var3 = -68 / ((24 - arg1) / 46);
        ++field5118;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IZ)V", line = 96)
    public final void method929(int arg0, boolean arg1) {
        ++field5114;
        class461 var3 = super.field7086.method1157(0);
        if (var3 != null && arg1) {
            super.field7086.method1192(-22137, 1);
            super.field7086.method1118(0, var3);
            super.field7086.method1081(103, class268.field3896);
            super.field7086.method1192(-22137, 1);
            super.field7086.method1080(class116.field1782, class776.field10666, -30);
            super.field7086.method1158(false, true, (byte) -95, class639.field8962, 2);
            super.field7086.method1082(0, class407.field5550, (byte) -112);
            class385 var4 = super.field7086.method1161(256);
            var4.method2395(81, super.field7086.method1113(1));
            super.field7086.method1152(125, class714.field9899);
            super.field7086.method1192(-22137, 0);
            this.field5116 = true;
        } else {
            super.field7086.method1082(0, class407.field5550, (byte) -112);
        }
        if (arg0 >= -83) {
            field5111 = null;
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(BILkja;)V", line = 127)
    public final void method925(byte arg0, int arg1, class684 arg2) {
        ++field5109;
        if (arg0 <= 83) {
            this.method923(10, (byte) 4, -76);
        }
        super.field7086.method1118(0, arg2);
        super.field7086.method1189(62, arg1);
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(I)Z", line = 139)
    public final boolean method921(int arg0) {
        ++field5119;
        int var2 = -110 % ((arg0 - 19) / 52);
        return true;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)V", line = 158)
    public final void method926(int arg0) {
        if (!this.field5116) {
            super.field7086.method1082(0, class605.field8453, (byte) -112);
        } else {
            super.field7086.method1192(-22137, 1);
            super.field7086.method1081(113, class29.field417);
            super.field7086.method1080(class463.field6532, class463.field6532, -30);
            super.field7086.method1180(2, (byte) 91, class683.field9465);
            super.field7086.method1082(0, class605.field8453, (byte) -112);
            super.field7086.method1182((byte) 117);
            super.field7086.method1118(0, (class684) null);
            super.field7086.method1192(-22137, 0);
            this.field5116 = false;
        }
        ++field5120;
        super.field7086.method1080(class463.field6532, class463.field6532, -30);
        if (arg0 != -339) {
            field5117 = null;
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(ILrn;)Z", line = 184)
    public static final boolean method2299(int arg0, class281 arg1) {
        ++field5112;
        if (arg1 == null) {
            return false;
        } else {
            if (arg0 != 2) {
                field5117 = null;
            }
            return class663.method3780(-arg1.field4079 + arg1.field4087, arg1.field4083, arg1.field4081, -arg1.field4081 + arg1.field4085, (byte) 90, arg1.field4079, arg1.field4078 - arg1.field4083);
        }
    }
}
