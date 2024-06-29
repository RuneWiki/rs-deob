import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class90 extends class226 {

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "I")
    public static int field1630 = 0;

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "Lll;")
    public static class135 field1628;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)V")
    public static final void method516(int arg0) {
        class287.field5030.method823(true);
        field1629++;
        class4.field61.method823(true);
        if (arg0 < 110) {
            field1630 = -100;
        }
    }

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "(I)V")
    public static void method517(int arg0) {
        if (arg0 != 0) {
            method517(31);
        }
        field1628 = null;
    }
}
