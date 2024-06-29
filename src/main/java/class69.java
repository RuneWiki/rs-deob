import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mia")
public class class69 {

    @OriginalMember(owner = "client!mia", name = "b", descriptor = "Ljb;")
    public static class519 field953 = new class519(124, 10);

    @OriginalMember(owner = "client!mia", name = "d", descriptor = "I")
    public static int field955 = -50;

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!mia", name = "c", descriptor = "Lsaa;")
    public static class345 field954;

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(I)V", line = 7)
    public static final void method578(int arg0) {
        class250.field3499 = true;
        if (arg0 == 10) {
            field952++;
        }
    }

    @OriginalMember(owner = "client!mia", name = "b", descriptor = "(I)V", line = 23)
    public static void method579(int arg0) {
        field954 = null;
        field953 = null;
        if (arg0 != -50) {
            field953 = null;
        }
    }
}
