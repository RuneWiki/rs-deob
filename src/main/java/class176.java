import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dfa")
public class class176 {

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "Ljb;")
    public static class519 field2324 = new class519(79, 10);

    @OriginalMember(owner = "client!dfa", name = "c", descriptor = "Ltca;")
    public static class184 field2326 = new class184(64);

    @OriginalMember(owner = "client!dfa", name = "b", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(I)V", line = 5)
    public static void method1209(int arg0) {
        if (arg0 != -5458) {
            method1209(-57);
        }
        field2324 = null;
        field2326 = null;
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(B)V", line = 18)
    public static final void method1210(byte arg0) {
        field2325++;
        if (class389.field5637 == 1 || class389.field5637 == 3 || class46.field478 != class389.field5637 && (class389.field5637 == 0 || class46.field478 == 0)) {
            class181.field2380 = 0;
            class178.field2352 = 0;
            field2326.method1244(30407);
        }
        int var1 = 86 / ((arg0 + 60) / 34);
        class46.field478 = class389.field5637;
    }
}
