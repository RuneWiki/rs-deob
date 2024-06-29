import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class583 extends class532 {

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "F")
    private float field7962 = 0.0F;

    @OriginalMember(owner = "client!fi", name = "r", descriptor = "Lrfa;")
    private class213 field7965;

    @OriginalMember(owner = "client!fi", name = "q", descriptor = "Lbn;")
    public static class468 field7964 = new class468(15000);

    @OriginalMember(owner = "client!fi", name = "s", descriptor = "Llja;")
    public static class744 field7966 = new class744(41, 7);

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "I")
    public static int field7960;

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "I")
    public static int field7961;

    @OriginalMember(owner = "client!fi", name = "p", descriptor = "I")
    public static int field7963;

    @OriginalMember(owner = "client!fi", name = "t", descriptor = "I")
    public static int field7967;

    @OriginalMember(owner = "client!fi", name = "u", descriptor = "I")
    public static int field7968;

    @OriginalMember(owner = "client!fi", name = "v", descriptor = "I")
    public static int field7969;

    @OriginalMember(owner = "client!fi", name = "w", descriptor = "I")
    public static int field7970;

    @OriginalMember(owner = "client!fi", name = "x", descriptor = "I")
    public static int field7971;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZB)V", line = 3)
    public final void method702(boolean arg0, byte arg1) {
        ++field7970;
        super.field7494.method2691(false, 1);
        super.field7494.method2716(class75.field1039, 39, class555.field7726);
        super.field7494.method4(class507.field7214, true, (byte) 115, false, 0);
        super.field7494.method2703(class616.field8291, (byte) 68, 0);
        super.field7494.method30((byte) 25, 0);
        super.field7494.method2691(false, 0);
        super.field7494.method2673(-16777216, -88);
        super.field7494.method2703(class555.field7718, (byte) 115, 0);
        this.method697(111);
        if (arg1 != -10) {
            field7966 = null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)V", line = 24)
    public final void method699(boolean arg0) {
        ++field7969;
        super.field7494.method2691(false, 1);
        super.field7494.method2716(class269.field3180, 110, class269.field3180);
        super.field7494.method2694((byte) -49, 0, class507.field7214);
        super.field7494.method2703(class507.field7214, (byte) -87, 0);
        super.field7494.method30((byte) 25, 1);
        super.field7494.method2643(-2, (class315) null);
        super.field7494.method2691(arg0, 0);
        super.field7494.method2703(class507.field7214, (byte) 53, 0);
    }

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "(I)V", line = 41)
    public static void method3358(int arg0) {
        if (arg0 != 1) {
            method3359(-100, false, 21);
        }
        field7964 = null;
        field7966 = null;
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(B)Z", line = 53)
    public final boolean method703(byte arg0) {
        ++field7967;
        if (arg0 <= 126) {
            this.field7962 = -0.5265906F;
        }
        return this.field7965.method1339(-10521);
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lwg;Lrfa;)V", line = 67)
    public class583(class449 arg0, class213 arg1) {
        super(arg0);
        this.field7965 = arg1;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IZI)V", line = 75)
    public static final void method3359(int arg0, boolean arg1, int arg2) {
        if (~class301.field3602 != -2) {
            if (~class301.field3602 == -3) {
                if (!class769.field10572) {
                    class763.method4230(arg2, arg0, true);
                } else {
                    class763.method4230(arg2 + class793.method4373((byte) 97), class719.method4070((byte) 104) + arg0, !arg1);
                }
            }
        } else {
            class752.method4200(class677.field9289, (byte) -108, arg0, arg2);
        }
        ++field7971;
        class677.field9289 = null;
        if (!arg1) {
            class301.field3602 = 0;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IBI)V", line = 101)
    public final void method700(int arg0, byte arg1, int arg2) {
        ++field7968;
        super.field7494.method2691(false, 1);
        if (arg1 == 94) {
            if ((arg0 & 128) == 0) {
                if (~(arg2 & 1) == -2) {
                    if (!this.field7965.field2520) {
                        int var4 = super.field7494.field6229 % 4000 * 16 / 4000;
                        super.field7494.method2643(-2, this.field7965.field2519[var4]);
                    } else {
                        this.field7962 = (float) (super.field7494.field6229 % 4000) / 4000.0F;
                        super.field7494.method2643(arg1 ^ -96, this.field7965.field2517);
                    }
                } else if (this.field7965.field2520) {
                    super.field7494.method2643(-2, this.field7965.field2517);
                } else {
                    super.field7494.method2643(-2, this.field7965.field2519[0]);
                }
            } else {
                super.field7494.method2643(-2, (class315) null);
            }
            super.field7494.method2691(false, 0);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZILgaa;)V", line = 145)
    public final void method701(boolean arg0, int arg1, class315 arg2) {
        ++field7963;
        super.field7494.method2643(-2, arg2);
        if (!arg0) {
            field7966 = null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZI)V", line = 162)
    public final void method707(boolean arg0, int arg1) {
        ++field7961;
        super.field7494.method2716(class75.field1039, 121, class269.field3180);
        if (arg1 != 30902) {
            this.field7965 = null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)V", line = 173)
    public final void method697(int arg0) {
        if (super.field7494.method2655(124) == 0) {
            class256 var2 = super.field7494.method2701(128);
            super.field7494.method2691(false, 1);
            class256 var3 = super.field7494.method2710(-105);
            var3.method141(var2);
            var3.method1542(0.125F, 0, 0.125F, 1.0F);
            var3.method1538(0.0F, this.field7962, 0.0F, -2360);
            super.field7494.method2720(class444.field5955, (byte) 100);
            super.field7494.method2691(false, 0);
        }
        if (arg0 < 14) {
            this.field7962 = 0.019702377F;
        }
        ++field7960;
    }
}
