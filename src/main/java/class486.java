import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class486 {

    @OriginalMember(owner = "client!hr", name = "e", descriptor = "Lvn;")
    public class283 field6680 = null;

    @OriginalMember(owner = "client!hr", name = "g", descriptor = "Lla;")
    public class417 field6682 = null;

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "Z")
    public static boolean field6678 = false;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "I")
    public static int field6676;

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "I")
    public static int field6677;

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "I")
    public static int field6679;

    @OriginalMember(owner = "client!hr", name = "f", descriptor = "I")
    public static int field6681;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)V", line = 3)
    public static final void method2762(int arg0) {
        field6676++;
        class610.field8463.method105(((float) class366.field4875.field9345 * 0.1F + 0.7F) * 1.1523438F);
        class610.field8463.method117(class657.field9136, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
        class610.field8463.method131(class45.field544, -1, arg0);
        class610.field8463.method128(class405.field5678);
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(I)V", line = 24)
    public static final void method2763(int arg0) {
        class306.field4232 = new class499(class65.field792.method555(class697.field9900, true), "", class112.field1563, (short) arg0, -1, 0L, 0, 0, true, false);
        field6677++;
    }

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "(I)V", line = 32)
    public static final void method2764(int arg0) {
        class137.field1948 = arg0;
        field6681++;
        class588.field8265.method1444(arg0 ^ 0xFFFF9465);
        class541.field7327 = false;
    }

    @OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lla;)V", line = 48)
    public class486(class417 arg0) {
        this.field6682 = arg0;
    }

    @OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lla;Lvn;)V", line = 58)
    public class486(class417 arg0, class283 arg1) {
        this.field6680 = arg1;
        this.field6682 = arg0;
    }
}
