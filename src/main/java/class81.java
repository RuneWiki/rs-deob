import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class81 {

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
    public static int field1464 = 99;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IZ)I")
    public static final int method660(int arg0, boolean arg1) {
        if (arg1) {
            field1464 = -120;
        }
        field1465++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V")
    public static final void method661(int arg0) {
        int var1 = 19 / ((arg0 + 47) / 32);
        field1466++;
        class205.field3613.method1122(10);
        client.field2720.method1122(10);
        class142.field2560.method1122(10);
    }
}
