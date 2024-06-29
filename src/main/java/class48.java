import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class48 {

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    public static int field629 = 765;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "Lpn;")
    public static class72 field627 = new class72(77, 4);

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public static int field630 = 205;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
    public static final void method252(int arg0) {
        class244.method1332((byte) -59, class184.field2400);
        field628++;
        class153.field1838++;
        class230.field3185.method909(arg0, -1);
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V")
    public static void method253(int arg0) {
        field627 = null;
        if (arg0 != 4) {
            method253(72);
        }
    }
}
