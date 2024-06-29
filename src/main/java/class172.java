import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class172 {

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "Lpg;")
    public static class492 field2484 = new class492(87, -1);

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(III)V")
    public static final void method1206(int arg0, int arg1, int arg2) {
        class276.field3835 = arg2 - class135.field1974;
        class145.field2089 = arg0 - class135.field1969;
        field2483++;
        if (arg1 <= 28) {
            method1208(43, 105, -113);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
    public static void method1207(int arg0) {
        field2484 = null;
        if (arg0 != -5153) {
            method1206(115, 37, -62);
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(III)Z")
    public static final boolean method1208(int arg0, int arg1, int arg2) {
        if (arg2 == -6118) {
            field2485++;
            return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
        } else {
            return false;
        }
    }
}
