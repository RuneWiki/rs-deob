import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class303 {

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "I")
    public static int field4545 = 205;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "I")
    public int field4541;

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "I")
    public int field4543;

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!rp", name = "f", descriptor = "I")
    public int field4546;

    @OriginalMember(owner = "client!rp", name = "g", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(ILnn;Z)V")
    private final void method1939(int arg0, class289 arg1, boolean arg2) {
        field4547++;
        if (arg2 && arg0 == 1) {
            this.field4541 = arg1.method1841((byte) -122);
            this.field4546 = arg1.method1858(-3256);
            this.field4543 = arg1.method1858(-3256);
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(BLnn;)V")
    public final void method1940(byte arg0, class289 arg1) {
        if (arg0 != 82) {
            this.method1940((byte) -117, null);
        }
        while (true) {
            int var3 = arg1.method1858(-3256);
            if (var3 == 0) {
                field4542++;
                return;
            }
            this.method1939(var3, arg1, true);
        }
    }
}
