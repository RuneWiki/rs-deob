import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class476 {

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "Lrr;")
    public static class280 field7042 = new class280(7, 0, 1, 1);

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "Lnk;")
    public static class326 field7043 = new class326(12, 12);

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
    public static int field7041;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
    public static void method2810(int arg0) {
        field7043 = null;
        if (arg0 != -23229) {
            field7042 = null;
        }
        field7042 = null;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V")
    public static final void method2811(int arg0) {
        for (int var1 = arg0; var1 < class86.field1471; var1++) {
            int var2 = class371.field5734[var1];
            class505 var3 = (class505) class147.field2396.method2516((long) var2, -1);
            if (var3 != null) {
                class265 var4 = var3.field7355;
                class49.method353(0, var4, var4.field4430.field7416);
            }
        }
        field7041++;
    }
}
