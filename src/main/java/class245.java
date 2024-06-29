import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class245 {

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public static int field4123 = 0;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "Lve;")
    public static class255 field4124 = class87.method607(88, "(U5");

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "[I")
    public static int[] field4120;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V", line = 5)
    public static void method1693(int arg0) {
        field4120 = null;
        int var1 = -46 / ((-arg0 - 76) / 38);
        field4124 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)V", line = 40)
    public static final void method1694(int arg0, int arg1) {
        if (arg1 < 8) {
            field4120 = (int[]) null;
        }
        class53 var2 = class303.method2112(-1155040160, arg0, 9);
        var2.method326(-128);
        field4121++;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V", line = 82)
    public static final void method1695(int arg0) {
        class86.method599();
        field4122++;
        class145.field2426 = new class21[7];
        class145.field2426[1] = new class171();
        class145.field2426[2] = new class138();
        class145.field2426[3] = new class134();
        class145.field2426[4] = new class182();
        class145.field2426[5] = new class314();
        class145.field2426[arg0] = new class161();
    }
}
