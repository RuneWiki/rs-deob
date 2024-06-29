import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sia")
public class class766 extends class497 {

    @OriginalMember(owner = "client!sia", name = "t", descriptor = "F")
    private float field10549 = 0.0F;

    @OriginalMember(owner = "client!sia", name = "p", descriptor = "Lui;")
    private class240 field10545;

    @OriginalMember(owner = "client!sia", name = "o", descriptor = "I")
    public static int field10544 = 0;

    @OriginalMember(owner = "client!sia", name = "l", descriptor = "I")
    public static int field10541;

    @OriginalMember(owner = "client!sia", name = "m", descriptor = "I")
    public static int field10542;

    @OriginalMember(owner = "client!sia", name = "n", descriptor = "I")
    public static int field10543;

    @OriginalMember(owner = "client!sia", name = "q", descriptor = "I")
    public static int field10546;

    @OriginalMember(owner = "client!sia", name = "r", descriptor = "I")
    public static int field10547;

    @OriginalMember(owner = "client!sia", name = "s", descriptor = "I")
    public static int field10548;

    @OriginalMember(owner = "client!sia", name = "v", descriptor = "I")
    public static int field10551;

    @OriginalMember(owner = "client!sia", name = "w", descriptor = "I")
    public static int field10552;

    @OriginalMember(owner = "client!sia", name = "u", descriptor = "J")
    public static long field10550;

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(IZ)V", line = 3)
    public final void method929(int arg0, boolean arg1) {
        ++field10542;
        super.field7086.method1192(-22137, 1);
        if (arg0 >= -83) {
            field10550 = 64L;
        }
        super.field7086.method1080(class624.field8745, class776.field10666, -30);
        super.field7086.method1158(false, true, (byte) -103, class605.field8453, 0);
        super.field7086.method1082(0, class639.field8962, (byte) -112);
        super.field7086.method1110(0, (byte) -109);
        super.field7086.method1192(-22137, 0);
        super.field7086.method1159((byte) -98, -16777216);
        super.field7086.method1082(0, class683.field9465, (byte) -112);
        this.method1301(false);
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(I)V", line = 28)
    public final void method926(int arg0) {
        ++field10548;
        super.field7086.method1192(-22137, 1);
        super.field7086.method1080(class463.field6532, class463.field6532, -30);
        super.field7086.method1180(0, (byte) 91, class605.field8453);
        super.field7086.method1082(0, class605.field8453, (byte) -112);
        super.field7086.method1110(1, (byte) -119);
        super.field7086.method1118(0, (class684) null);
        super.field7086.method1192(-22137, 0);
        if (arg0 != -339) {
            this.field10549 = -1.4291743F;
        }
        super.field7086.method1082(0, class605.field8453, (byte) -112);
    }

    @OriginalMember(owner = "client!sia", name = "b", descriptor = "(Z)V", line = 53)
    public final void method1301(boolean arg0) {
        if (arg0) {
            this.field10545 = null;
        }
        ++field10551;
        if (~super.field7086.method1131(-45) == -1) {
            class385 var2 = super.field7086.method1199(true);
            super.field7086.method1192(-22137, 1);
            class385 var3 = super.field7086.method1161(256);
            var3.method1884(var2);
            var3.method2411(0.125F, 0.125F, 1.0F, (byte) -125);
            var3.method2405(117, 0.0F, this.field10549, 0.0F);
            super.field7086.method1152(124, class714.field9899);
            super.field7086.method1192(-22137, 0);
        }
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(BILkja;)V", line = 80)
    public final void method925(byte arg0, int arg1, class684 arg2) {
        if (arg0 < 83) {
            this.method925((byte) 32, 17, (class684) null);
        }
        ++field10546;
        super.field7086.method1118(0, arg2);
    }

    @OriginalMember(owner = "client!sia", name = "b", descriptor = "(I)Z", line = 91)
    public final boolean method921(int arg0) {
        int var2 = 124 % ((19 - arg0) / 52);
        ++field10547;
        return this.field10545.method1598((byte) -74);
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(ZB)V", line = 102)
    public final void method928(boolean arg0, byte arg1) {
        super.field7086.method1080(class463.field6532, class776.field10666, -30);
        ++field10543;
        int var3 = -75 % ((arg1 - 24) / 46);
    }

    @OriginalMember(owner = "client!sia", name = "<init>", descriptor = "(Lpj;Lui;)V", line = 112)
    public class766(class156 arg0, class240 arg1) {
        super(arg0);
        this.field10545 = arg1;
    }

    @OriginalMember(owner = "client!sia", name = "b", descriptor = "(II)V", line = 120)
    public static final void method4236(int arg0, int arg1) {
        ++field10552;
        if (class580.field8171 != arg1) {
            class768.field10571 = class350.field4898 = class193.field2978[arg1];
            class74.method590(false);
            class663.field9226 = new int[class768.field10571][class350.field4898];
            class9.field81 = new int[class768.field10571][class350.field4898];
            class650.field9080 = new int[4][class768.field10571 >> 3][class350.field4898 >> 3];
            for (int var2 = 0; ~var2 > -5; ++var2) {
                class346.field4838[var2] = class103.method726(class768.field10571, -120, class350.field4898);
            }
            class724.field10022 = new byte[4][class768.field10571][class350.field4898];
            class502.method3034(true, arg0, class768.field10571, class350.field4898);
            class154.method1054(0, class768.field10571 >> 3, class37.field491, class350.field4898 >> 3);
            class580.field8171 = arg1;
        }
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(IBI)V", line = 150)
    public final void method923(int arg0, byte arg1, int arg2) {
        if (arg1 >= 5) {
            super.field7086.method1192(-22137, 1);
            ++field10541;
            if ((128 & arg0) != 0) {
                super.field7086.method1118(0, (class684) null);
            } else if ((1 & arg2) != 1) {
                if (!this.field10545.field3604) {
                    super.field7086.method1118(0, this.field10545.field3599[0]);
                } else {
                    super.field7086.method1118(0, this.field10545.field3600);
                }
            } else if (this.field10545.field3604) {
                this.field10549 = (float) (super.field7086.field2434 % 4000) / 4000.0F;
                super.field7086.method1118(0, this.field10545.field3600);
            } else {
                int var4 = super.field7086.field2434 % 4000 * 16 / 4000;
                super.field7086.method1118(0, this.field10545.field3599[var4]);
            }
            super.field7086.method1192(-22137, 0);
        }
    }
}
