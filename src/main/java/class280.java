import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public abstract class class280 extends class167 {

    @OriginalMember(owner = "client!cl", name = "M", descriptor = "S")
    public short field4134;

    @OriginalMember(owner = "client!cl", name = "K", descriptor = "S")
    public short field4132;

    @OriginalMember(owner = "client!cl", name = "F", descriptor = "Lmga;")
    public static class739 field4127 = new class739(38, -1);

    @OriginalMember(owner = "client!cl", name = "O", descriptor = "Ljw;")
    public static class581 field4136 = new class581(74, 0);

    @OriginalMember(owner = "client!cl", name = "P", descriptor = "Ljw;")
    public static class581 field4137 = new class581(106, 10);

    @OriginalMember(owner = "client!cl", name = "R", descriptor = "[I")
    public static int[] field4139 = new int[3];

    @OriginalMember(owner = "client!cl", name = "Q", descriptor = "Ltm;")
    public static class412 field4138 = new class412();

    @OriginalMember(owner = "client!cl", name = "G", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!cl", name = "H", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!cl", name = "I", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!cl", name = "J", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!cl", name = "L", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!cl", name = "N", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!cl", name = "S", descriptor = "[I")
    public static int[] field4140;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lha;Lwea;ZIIII)V")
    public final void method60(class65 arg0, class167 arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4135;
        if (arg3 >= -16) {
            this.method45(124);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "(I)Z")
    public final boolean method59(int arg0) {
        if (arg0 != -1) {
            return true;
        } else {
            ++field4129;
            return false;
        }
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(ILha;)Z")
    public final boolean method41(int arg0, class65 arg1) {
        if (arg0 != 101) {
            this.method66(27);
        }
        ++field4133;
        return class709.method3971(this.method24(748449288), super.field2259 >> class26.field388, super.field2257 >> class26.field388, super.field2244, (byte) -34);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(B[Luca;)I")
    public final int method43(byte arg0, class540[] arg1) {
        ++field4128;
        if (arg0 > -20) {
            field4138 = null;
        }
        return this.method1200(super.field2259 >> class26.field388, arg1, super.field2257 >> class26.field388, (byte) 36);
    }

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "(I)V")
    public final void method66(int arg0) {
        if (arg0 != -13514) {
            this.method66(37);
        }
        ++field4131;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "(I)Z")
    public final boolean method45(int arg0) {
        ++field4130;
        return arg0 <= 103 ? false : class79.field1122[(super.field2257 >> class26.field388) + -class331.field4776 + class174.field2337][(super.field2259 >> class26.field388) + -class76.field1102 + class174.field2337];
    }

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "(I)V")
    public static void method1809(int arg0) {
        field4138 = null;
        field4127 = null;
        field4140 = null;
        field4136 = null;
        if (arg0 > -49) {
            field4138 = null;
        }
        field4139 = null;
        field4137 = null;
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(IIIIIII)V")
    public class280(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super.field2250 = (byte) arg3;
        super.field2244 = (byte) arg4;
        this.field4134 = (short) arg6;
        super.field2246 = arg1;
        super.field2257 = arg0;
        super.field2259 = arg2;
        this.field4132 = (short) arg5;
    }
}
