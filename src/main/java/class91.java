import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class91 extends class498 {

    @OriginalMember(owner = "client!er", name = "D", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!er", name = "E", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!er", name = "F", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(II)Lmp;", line = 3)
    public static final class706 method770(int arg0, int arg1) {
        if (arg1 != 21768) {
            return null;
        } else {
            ++field1491;
            class706 var2 = (class706) class102.field1605.method1097((long) arg0, (byte) -121);
            if (var2 != null) {
                return var2;
            } else {
                byte[] var3 = class518.field7311.method3007(arg0, 0, arg1 + -21763);
                if (var3 != null && var3.length > 1) {
                    class706 var4 = class511.method2927(110, var3);
                    class102.field1605.method1095((long) arg0, (byte) -114, var4);
                    return var4;
                } else {
                    return null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "(IIIIIF)V", line = 30)
    public class91(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(BF)V", line = 34)
    public final void method771(byte arg0, float arg1) {
        int var3 = -69 % ((-46 - arg0) / 52);
        ++field1490;
        super.field7057 = arg1;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IIII)V", line = 44)
    public final void method772(int arg0, int arg1, int arg2, int arg3) {
        ++field1489;
        if (arg3 >= 36) {
            super.field7049 = arg2;
            super.field7059 = arg0;
            super.field7064 = arg1;
        }
    }
}
