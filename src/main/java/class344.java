import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class344 extends class213 {

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "F")
    private float field5065 = 0.0F;

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "Lrba;")
    private class494 field5060;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
    public static int field5058;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "I")
    public static int field5059;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "I")
    public static int field5061;

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "I")
    public static int field5062;

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "I")
    public static int field5063;

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "I")
    public static int field5064;

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "I")
    public static int field5066;

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "I")
    public static int field5067;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(ZI)V")
    public final void method23(boolean arg0, int arg1) {
        ++field5062;
        super.field2766.method1917(false, class66.field868, class594.field8145);
        if (arg1 != -18) {
            this.field5060 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)V")
    public final void method28(int arg0, int arg1, int arg2) {
        super.field2766.method1969(1, arg0 ^ 9733);
        ++field5067;
        if (arg0 != -16595) {
            this.field5065 = 0.4885986F;
        }
        if (~(128 & arg1) != -1) {
            super.field2766.method1884((class619) null, -2);
        } else if ((1 & arg2) == 1) {
            if (this.field5060.field6681) {
                this.field5065 = (float) (super.field2766.field4453 % 4000) / 4000.0F;
                super.field2766.method1884(this.field5060.field6679, -2);
            } else {
                int var4 = super.field2766.field4453 % 4000 * 16 / 4000;
                super.field2766.method1884(this.field5060.field6678[var4], -2);
            }
        } else if (!this.field5060.field6681) {
            super.field2766.method1884(this.field5060.field6678[0], arg0 ^ 16595);
        } else {
            super.field2766.method1884(this.field5060.field6679, -2);
        }
        super.field2766.method1969(0, -26328);
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(ZI)V")
    public final void method17(boolean arg0, int arg1) {
        super.field2766.method1969(1, -26328);
        ++field5063;
        super.field2766.method1917(false, class66.field868, class129.field1635);
        super.field2766.method807(true, 0, false, -21480, class322.field4722);
        super.field2766.method1914(class668.field9495, 0, (byte) 115);
        super.field2766.method823(4, 0);
        super.field2766.method1969(0, -26328);
        super.field2766.method1883(-16777216, (byte) 83);
        super.field2766.method1914(class577.field7974, 0, (byte) 115);
        this.method871((byte) -35);
        if (arg1 <= 37) {
            method2169(-112, 60, 40);
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(III)V")
    public static final void method2169(int arg0, int arg1, int arg2) {
        ++field5061;
        class19 var3 = class364.method2236(arg1 + 1248116640, arg2, 12);
        var3.method110(arg1 ^ 12142);
        if (arg1 != 0) {
            method2169(93, -7, 124);
        }
        var3.field171 = arg0;
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(B)Z")
    public final boolean method22(byte arg0) {
        ++field5066;
        if (arg0 != 75) {
            this.field5065 = -2.3018022F;
        }
        return this.field5060.method2788(72);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IILaw;)V")
    public final void method19(int arg0, int arg1, class619 arg2) {
        if (arg1 != 8) {
            this.method23(false, 48);
        }
        ++field5059;
        super.field2766.method1884(arg2, -2);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
    public final void method871(byte arg0) {
        if (super.field2766.method1980(0) == 0) {
            class492 var2 = super.field2766.method2013(0);
            super.field2766.method1969(1, -26328);
            class492 var3 = super.field2766.method1993((byte) -26);
            var3.method597(var2);
            var3.method2781(0.125F, 1.0F, (byte) 73, 0.125F);
            var3.method2776(0.0F, -120, 0.0F, this.field5065);
            super.field2766.method1896(class564.field7724, (byte) -6);
            super.field2766.method1969(0, -26328);
        }
        ++field5064;
        int var4 = -27 % ((38 - arg0) / 46);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
    public final void method20(int arg0) {
        super.field2766.method1969(1, -26328);
        ++field5058;
        super.field2766.method1917(false, class594.field8145, class594.field8145);
        if (arg0 >= 32) {
            super.field2766.method1997(class322.field4722, 0, -92);
            super.field2766.method1914(class322.field4722, 0, (byte) 115);
            super.field2766.method823(4, 1);
            super.field2766.method1884((class619) null, -2);
            super.field2766.method1969(0, -26328);
            super.field2766.method1914(class322.field4722, 0, (byte) 115);
        }
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lsv;Lrba;)V")
    public class344(class312 arg0, class494 arg1) {
        super(arg0);
        this.field5060 = arg1;
    }
}
