import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class276 {

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "[I")
    public static int[] field4643 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2 };

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "Z")
    public static boolean field4642 = false;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "Lej;")
    public static class204 field4640 = new class204(4);

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "Z")
    public static boolean field4647 = false;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "Luf;")
    public static class168 field4646 = class148.method1019(-1720, "Wordpack geladen)3");

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
    public static int field4648 = 0;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "Lfj;")
    public static class283 field4644;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "[Lha;")
    public static class49[] field4645;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V", line = 6)
    public static final void method1904(int arg0) {
        field4639++;
        class259.field4390 = new class80(arg0);
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)V", line = 52)
    public static void method1905(int arg0) {
        field4646 = null;
        field4640 = null;
        field4644 = null;
        if (arg0 != 30557) {
            method1904(96);
        }
        field4643 = null;
        field4645 = null;
    }
}
