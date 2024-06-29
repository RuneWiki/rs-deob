import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wja")
public class class282 extends class207 {

    @OriginalMember(owner = "client!wja", name = "n", descriptor = "Ljb;")
    public static class519 field4076 = new class519(112, 1);

    @OriginalMember(owner = "client!wja", name = "p", descriptor = "Lqj;")
    public static class535 field4078 = new class535(3000000, 200);

    @OriginalMember(owner = "client!wja", name = "o", descriptor = "D")
    public static double field4077;

    @OriginalMember(owner = "client!wja", name = "g", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!wja", name = "h", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!wja", name = "i", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!wja", name = "j", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!wja", name = "k", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!wja", name = "l", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!wja", name = "m", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!wja", name = "q", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!wja", name = "r", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!wja", name = "b", descriptor = "(I)I")
    public final int method36(int arg0) {
        ++field4069;
        if (arg0 >= -14) {
            field4077 = -1.0679460097831397D;
        }
        if (!super.field2668.method2254(90)) {
            return super.field2668.field5141.method2544(0) && class312.method2002(2, super.field2668.field5141.method2541(43)) ? 1 : 0;
        } else {
            return 2;
        }
    }

    @OriginalMember(owner = "client!wja", name = "a", descriptor = "(IB)V")
    public final void method41(int arg0, byte arg1) {
        super.field2669 = arg0;
        ++field4071;
        if (arg1 > -7) {
            method1841(116);
        }
    }

    @OriginalMember(owner = "client!wja", name = "a", descriptor = "(B)Z")
    public final boolean method1839(byte arg0) {
        ++field4074;
        if (arg0 != 8) {
            this.method39(89, (byte) -81);
        }
        return !super.field2668.method2254(81);
    }

    @OriginalMember(owner = "client!wja", name = "c", descriptor = "(I)I")
    public final int method1840(int arg0) {
        if (arg0 != 43) {
            field4077 = 1.1051174755944295D;
        }
        ++field4073;
        return super.field2669;
    }

    @OriginalMember(owner = "client!wja", name = "d", descriptor = "(I)V")
    public static void method1841(int arg0) {
        int var1 = 2 / ((49 - arg0) / 60);
        field4078 = null;
        field4076 = null;
    }

    @OriginalMember(owner = "client!wja", name = "<init>", descriptor = "(Lrd;)V")
    public class282(class355 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!wja", name = "a", descriptor = "(Lda;)V")
    public static final void method1842(class67 arg0) {
        class157.field2118 = arg0;
    }

    @OriginalMember(owner = "client!wja", name = "a", descriptor = "(I)V")
    public final void method37(int arg0) {
        if (super.field2668.method2254(121)) {
            super.field2669 = 2;
        }
        ++field4070;
        int var2 = 52 / ((arg0 - -58) / 48);
        if (super.field2669 < 0 || super.field2669 > 2) {
            super.field2669 = this.method36(-79);
        }
    }

    @OriginalMember(owner = "client!wja", name = "b", descriptor = "(IB)I")
    public final int method39(int arg0, byte arg1) {
        ++field4075;
        if (arg1 != 69) {
            return 47;
        } else {
            return super.field2668.method2254(arg1 + 14) ? 3 : 1;
        }
    }

    @OriginalMember(owner = "client!wja", name = "<init>", descriptor = "(ILrd;)V")
    public class282(int arg0, class355 arg1) {
        super(arg0, arg1);
    }
}
