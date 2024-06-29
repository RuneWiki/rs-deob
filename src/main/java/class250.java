import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class250 extends class184 {

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "S")
    public short field3618;

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "Lhda;")
    public static class752 field3616;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
    public static void method1649(boolean arg0) {
        if (!arg0) {
            method1649(true);
        }
        field3616 = null;
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "()V")
    public class250() {
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(S)V")
    public class250(short arg0) {
        this.field3618 = arg0;
    }
}
