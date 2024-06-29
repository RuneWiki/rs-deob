import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hfa")
public class class283 {

    @OriginalMember(owner = "client!hfa", name = "b", descriptor = "I")
    public static int field3848 = 0;

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "I")
    public static int field3847 = 1;

    @OriginalMember(owner = "client!hfa", name = "c", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(I)V")
    public static final void method1700(int arg0) {
        field3849++;
        class49.field822++;
        class543 var1 = class299.method1780(class84.field1196, class475.field6654, 50);
        if (arg0 != 0) {
            field3847 = 75;
        }
        var1.field7872.method2281((byte) 58, class158.method996(arg0 ^ 0x3));
        var1.field7872.method2261((byte) 48, class467.field6533);
        var1.field7872.method2261((byte) 77, class300.field4038);
        var1.field7872.method2281((byte) 58, class221.field2851.field4152);
        class511.method3028(arg0 ^ 0x1D3A, var1);
    }
}
