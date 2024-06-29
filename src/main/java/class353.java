import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public abstract class class353 extends class295 {

    @OriginalMember(owner = "client!ml", name = "M", descriptor = "S")
    public short field4697;

    @OriginalMember(owner = "client!ml", name = "L", descriptor = "S")
    public short field4696;

    @OriginalMember(owner = "client!ml", name = "B", descriptor = "I")
    public static int field4687;

    @OriginalMember(owner = "client!ml", name = "C", descriptor = "I")
    public static int field4688;

    @OriginalMember(owner = "client!ml", name = "D", descriptor = "I")
    public static int field4689;

    @OriginalMember(owner = "client!ml", name = "E", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!ml", name = "F", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!ml", name = "G", descriptor = "I")
    public static int field4692;

    @OriginalMember(owner = "client!ml", name = "H", descriptor = "I")
    public static int field4693;

    @OriginalMember(owner = "client!ml", name = "I", descriptor = "I")
    public static int field4694;

    @OriginalMember(owner = "client!ml", name = "J", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!ml", name = "O", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!ml", name = "N", descriptor = "Ljt;")
    public static class90 field4698;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)V", line = 3)
    public static final void method2030(int arg0, int arg1) {
        int var2 = 17 / ((arg1 - -80) / 33);
        ++field4691;
        class606.field8430 = new int[arg0];
        class287.field3953 = new int[arg0];
        class185.field2691 = new int[arg0];
        class360.field4760 = new int[arg0];
        class338.field4528 = new int[arg0];
    }

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "(I)Z", line = 17)
    public final boolean method1324(int arg0) {
        ++field4695;
        if (arg0 > -104) {
            this.method1322((byte) -93);
        }
        return class147.field2093[(super.field4042 >> class588.field8259) - -class36.field428 + -class167.field2435][(super.field4047 >> class588.field8259) + -field4699 + class36.field428];
    }

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "(I)V", line = 28)
    public static void method2031(int arg0) {
        int var1 = -58 / ((arg0 - 66) / 47);
        field4698 = null;
    }

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "(B)Z", line = 38)
    public final boolean method1322(byte arg0) {
        if (arg0 != -54) {
            return false;
        } else {
            ++field4690;
            return class372.method2142(super.field4047 >> class588.field8259, super.field4042 >> class588.field8259, this.method217(120), super.field4050, (byte) -91);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "([Ltw;I)I", line = 52)
    public final int method1323(class186[] arg0, int arg1) {
        if (arg1 <= 69) {
            return 106;
        } else {
            ++field4688;
            return this.method1798(super.field4047 >> class588.field8259, arg0, super.field4042 >> class588.field8259, -9609);
        }
    }

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "(I)V", line = 68)
    public final void method227(int arg0) {
        ++field4693;
        if (arg0 >= -115) {
            field4699 = 120;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "(I)Z", line = 79)
    public final boolean method215(int arg0) {
        if (arg0 <= 49) {
            field4694 = -3;
        }
        ++field4692;
        return false;
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(IIIIIII)V", line = 93)
    public class353(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super.field4052 = arg1;
        super.field4042 = arg0;
        super.field4053 = (byte) arg3;
        super.field4050 = (byte) arg4;
        this.field4697 = (short) arg5;
        super.field4047 = arg2;
        this.field4696 = (short) arg6;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lvv;IIZLr;II)V", line = 107)
    public final void method223(class295 arg0, int arg1, int arg2, boolean arg3, class166 arg4, int arg5, int arg6) {
        if (arg6 == 0) {
            ++field4687;
            throw new IllegalStateException();
        }
    }
}
