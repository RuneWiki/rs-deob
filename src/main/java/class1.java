import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class1 extends class401 {

    @OriginalMember(owner = "client!us", name = "j", descriptor = "S")
    public short field1;

    @OriginalMember(owner = "client!us", name = "l", descriptor = "I")
    public static int field3 = -1;

    @OriginalMember(owner = "client!us", name = "k", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!us", name = "m", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!us", name = "<init>", descriptor = "()V", line = 4)
    public class1() {
    }

    @OriginalMember(owner = "client!us", name = "<init>", descriptor = "(S)V", line = 6)
    public class1(short arg0) {
        this.field1 = arg0;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IB)Lrn;", line = 15)
    public static final class243 method1(int arg0, byte arg1) {
        field4++;
        class243 var2 = (class243) class188.field2719.method3747((byte) -66, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class636.field8791.method3654(-15615, 0, arg0);
        class243 var4 = new class243();
        if (arg1 != -21) {
            method1(124, (byte) 104);
        }
        if (var3 != null) {
            var4.method1505(new class501(var3), (byte) -79, arg0);
        }
        class188.field2719.method3748((long) arg0, var4, 12537);
        return var4;
    }
}
