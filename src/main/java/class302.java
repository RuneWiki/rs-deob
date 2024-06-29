import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class302 {

    @OriginalMember(owner = "client!da", name = "c", descriptor = "Z")
    public static boolean field4416 = true;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "Ljava/lang/String;")
    public static String field4414 = "slide:";

    @OriginalMember(owner = "client!da", name = "b", descriptor = "Ljava/lang/String;")
    public static String field4415 = null;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
    public static final void method2069(int arg0) {
        if (arg0 != -26053) {
            return;
        }
        field4418++;
        class199.field2904.method112(0);
        class450.field6534.method112(arg0 + 26053);
        class209.field3044.method112(0);
        class306.field4467.method112(0);
        class72.field1206.method112(0);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[Lof;)V")
    public static final void method2070(int arg0, class421[] arg1) {
        field4417++;
        class452.field6568 = arg1.length;
        class377.field5341 = new int[class452.field6568 + 10];
        class28.field415 = new class421[class452.field6568 + 10];
        class82.method635(arg1, 0, class28.field415, 0, class452.field6568);
        for (int var2 = 0; var2 < class452.field6568; var2++) {
            class377.field5341[var2] = class28.field415[var2].method1463();
        }
        int var3 = -31 / ((arg0 - 74) / 52);
        for (int var4 = class452.field6568; var4 < class28.field415.length; var4++) {
            class377.field5341[var4] = 12;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)V")
    public static void method2071(boolean arg0) {
        field4414 = null;
        if (!arg0) {
            field4415 = null;
        }
    }
}
