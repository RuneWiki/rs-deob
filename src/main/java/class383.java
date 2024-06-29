import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class383 {

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "Lvq;")
    public static class24 field5614 = new class24(67, 3);

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public static int field5615 = -1;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    public static int field5616 = 0;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "Lil;")
    public static class274 field5619 = new class274(11, 4);

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "Z")
    public static boolean field5620 = false;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    public static int field5612;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public static int field5613;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    public static int field5617;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "Lct;")
    public static class104 field5618;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V", line = 7)
    public static void method2424(byte arg0) {
        field5619 = null;
        if (arg0 != 63) {
            field5620 = true;
        }
        field5618 = null;
        field5614 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)Lsn;", line = 21)
    public static final class463 method2425(int arg0) {
        if (arg0 != -1) {
            field5618 = null;
        }
        field5613++;
        class463 var1 = (class463) class129.field1719.method2025(-65536);
        if (var1 == null) {
            return new class463();
        } else {
            class32.field443--;
            return var1;
        }
    }
}
