import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class383 extends class422 {

    @OriginalMember(owner = "client!eb", name = "C", descriptor = "B")
    public byte field5370 = 5;

    @OriginalMember(owner = "client!eb", name = "y", descriptor = "I")
    public static int field5366 = 0;

    @OriginalMember(owner = "client!eb", name = "G", descriptor = "[Lok;")
    public static class61[] field5374 = new class61[14];

    @OriginalMember(owner = "client!eb", name = "x", descriptor = "I")
    public int field5365;

    @OriginalMember(owner = "client!eb", name = "z", descriptor = "I")
    public int field5367;

    @OriginalMember(owner = "client!eb", name = "A", descriptor = "I")
    public int field5368;

    @OriginalMember(owner = "client!eb", name = "B", descriptor = "I")
    public static int field5369;

    @OriginalMember(owner = "client!eb", name = "D", descriptor = "I")
    public int field5371;

    @OriginalMember(owner = "client!eb", name = "E", descriptor = "I")
    public int field5372;

    @OriginalMember(owner = "client!eb", name = "H", descriptor = "I")
    public static int field5375;

    @OriginalMember(owner = "client!eb", name = "I", descriptor = "I")
    public int field5376;

    @OriginalMember(owner = "client!eb", name = "F", descriptor = "Lpo;")
    public static class204 field5373;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(Z)V")
    public static final void method2375(boolean arg0) {
        if (arg0) {
            field5366 = -59;
        }
        field5375++;
        class151.field2308.method2533(0);
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(B)V")
    public static void method2376(byte arg0) {
        if (arg0 == 5) {
            field5373 = null;
            field5374 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BLrk;)V")
    public static final void method2377(byte arg0, class427 arg1) {
        if (arg0 != 5) {
            field5366 = 91;
        }
        field5369++;
        class426.field6029 = arg1;
    }
}
