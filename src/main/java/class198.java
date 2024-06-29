import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public abstract class class198 {

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V")
    public static final void method1096(byte arg0) {
        if (arg0 == -53) {
            field2358++;
            class525.method2916(70);
            class83.field1156 = false;
            class640.method3603(class116.field1526, arg0 ^ 0x34, class33.field341, class729.field10174, class475.field6566);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B[B)V")
    public abstract void method1097(byte arg0, byte[] arg1);

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIZ)[B")
    public abstract byte[] method1098(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Z)[B")
    public abstract byte[] method1099(boolean arg0);
}
