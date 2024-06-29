import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class357 {

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "Lcu;")
    public static class206 field4837 = new class206(78, 1);

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "I")
    public static int field4836;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V", line = 7)
    public static void method2107(int arg0) {
        if (arg0 == -6596) {
            field4837 = null;
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IB)V", line = 21)
    public static final void method2108(int arg0, byte arg1) {
        if (arg0 < 0 || arg0 > 2) {
            arg0 = 0;
        }
        field4836++;
        int var2 = 63 / ((-arg1 - 14) / 34);
        class671.field9506 = arg0;
        class158.field2495 = new class485[class416.field5684[class671.field9506] + 1];
        class84.field1293 = 0;
        client.field3892 = 0;
    }
}
