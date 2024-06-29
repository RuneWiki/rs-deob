import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class309 {

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "Lok;")
    private class74 field4632;

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "I")
    public int field4636;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "Ljo;")
    public static class382 field4635 = new class382(8);

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "I")
    public static int field4633;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V")
    public static void method1927(int arg0) {
        field4635 = null;
        if (arg0 != 15) {
            method1928(false, -37);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZI)Z")
    public static final boolean method1928(boolean arg0, int arg1) {
        if (arg0) {
            field4634 = -40;
        }
        field4633++;
        return arg1 != 1 && arg1 != 7;
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lkr;ILok;)V")
    public class309(class262 arg0, int arg1, class74 arg2) {
        new class382(64);
        this.field4632 = arg2;
        this.field4636 = this.field4632.method536(false, 15);
    }
}
