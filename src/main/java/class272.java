import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uia")
public class class272 extends class649 {

    @OriginalMember(owner = "client!uia", name = "f", descriptor = "[I")
    public static int[] field4170 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!uia", name = "m", descriptor = "F")
    public static float field4177;

    @OriginalMember(owner = "client!uia", name = "e", descriptor = "I")
    public static int field4169;

    @OriginalMember(owner = "client!uia", name = "g", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!uia", name = "h", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!uia", name = "i", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!uia", name = "j", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!uia", name = "k", descriptor = "I")
    public static int field4175;

    @OriginalMember(owner = "client!uia", name = "l", descriptor = "I")
    public static int field4176;

    @OriginalMember(owner = "client!uia", name = "n", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(Llh;ZLlh;)V")
    public static final void method1788(class205 arg0, boolean arg1, class205 arg2) {
        if (arg1) {
            method1791(-125);
        }
        ++field4173;
        if (arg2.field3450 != null) {
            arg2.method1507(1);
        }
        arg2.field3450 = arg0.field3450;
        arg2.field3449 = arg0;
        arg2.field3450.field3449 = arg2;
        arg2.field3449.field3450 = arg2;
    }

    @OriginalMember(owner = "client!uia", name = "c", descriptor = "(I)I")
    public final int method1789(int arg0) {
        ++field4169;
        if (arg0 != 3) {
            field4170 = null;
        }
        return super.field9223;
    }

    @OriginalMember(owner = "client!uia", name = "d", descriptor = "(I)V")
    public static final void method1790(int arg0) {
        ++field4178;
        if (class685.field9684 == null) {
            class581 var1 = new class581();
            byte[] var2 = var1.method3354(true, 128, 128, 16);
            class685.field9684 = class48.method481(var2, 117, false);
        }
        if (class289.field4447 == null) {
            class305 var3 = new class305();
            byte[] var4 = var3.method2007(128, 16, 117, 128);
            class289.field4447 = class48.method481(var4, 127, false);
        }
        if (arg0 >= -111) {
            field4177 = 9.3722536E-4F;
        }
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(I)I")
    public final int method135(int arg0) {
        ++field4171;
        int var2 = 82 % ((-18 - arg0) / 50);
        return 0;
    }

    @OriginalMember(owner = "client!uia", name = "<init>", descriptor = "(Lhs;)V")
    public class272(class358 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(II)I")
    public final int method133(int arg0, int arg1) {
        ++field4174;
        int var3 = super.field9224.method2290(-21318).method3487(arg0 + -32133);
        if (~var3 > -97) {
            return 3;
        } else if (arg1 > 1 && ~var3 > -129) {
            return 3;
        } else {
            if (arg0 != 18648) {
                this.method129(62, (byte) -73);
            }
            return arg1 > 3 && ~var3 > -193 ? 3 : 1;
        }
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(IB)V")
    public final void method129(int arg0, byte arg1) {
        if (arg1 >= -120) {
            this.method1792(25);
        }
        super.field9223 = arg0;
        ++field4172;
    }

    @OriginalMember(owner = "client!uia", name = "e", descriptor = "(I)V")
    public static void method1791(int arg0) {
        field4170 = null;
        if (arg0 != -19320) {
            method1790(-112);
        }
    }

    @OriginalMember(owner = "client!uia", name = "f", descriptor = "(I)Z")
    public final boolean method1792(int arg0) {
        if (arg0 != -16181) {
            field4170 = null;
        }
        ++field4176;
        int var2 = super.field9224.method2290(-21318).method3487(-13485);
        return ~var2 <= -97;
    }

    @OriginalMember(owner = "client!uia", name = "b", descriptor = "(I)V")
    public final void method134(int arg0) {
        ++field4175;
        int var2 = super.field9224.method2290(arg0 + -21319).method3487(arg0 + -13486);
        if (var2 < 96) {
            super.field9223 = 0;
        }
        if (arg0 == 1) {
            if (~super.field9223 < -2 && ~var2 > -129) {
                super.field9223 = 1;
            }
            if (~super.field9223 < -3 && ~var2 > -193) {
                super.field9223 = 2;
            }
            if (super.field9223 < 0 || ~super.field9223 < -4) {
                super.field9223 = this.method135(-85);
            }
        }
    }

    @OriginalMember(owner = "client!uia", name = "<init>", descriptor = "(ILhs;)V")
    public class272(int arg0, class358 arg1) {
        super(arg0, arg1);
    }
}
