import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class105 {

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
    public static int field1460 = 0;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
    public static int field1458 = 0;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "I")
    public static int field1462 = 1;

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "[I")
    public static int[] field1464 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIZIIII)V")
    public static final void method685(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        class217.field3282 = arg0;
        if (arg1 < 107) {
            method686((byte) -50);
        }
        class290.field4577 = arg4;
        class188.field2600 = arg5;
        field1465++;
        class15.field155 = arg3;
        class221.field3324 = arg6;
        if (arg2 && class221.field3324 >= 100) {
            class89.field1252 = class188.field2600 * 128 + 64;
            class41.field618 = class290.field4577 * 128 + 64;
            class246.field3773 = class275.method1836(class295.field4642, class89.field1252, class41.field618, 32) - class217.field3282;
        }
        class51.field734 = 2;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V")
    public static void method686(byte arg0) {
        field1464 = null;
        int var1 = 116 / ((arg0 + 79) / 42);
    }
}
