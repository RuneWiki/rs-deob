import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class316 extends class214 {

    @OriginalMember(owner = "client!uq", name = "G", descriptor = "Z")
    public static boolean field4739 = false;

    @OriginalMember(owner = "client!uq", name = "D", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!uq", name = "E", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!uq", name = "F", descriptor = "Lfga;")
    public static class274 field4738;

    @OriginalMember(owner = "client!uq", name = "<init>", descriptor = "()V", line = 6)
    public class316() {
        super(0, true);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IB)[I", line = 17)
    public final int[] method64(int arg0, byte arg1) {
        if (arg1 == 5) {
            field4736++;
            return class592.field8328;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(Z)V", line = 28)
    public static void method2075(boolean arg0) {
        if (arg0) {
            method2075(true);
        }
        field4738 = null;
    }
}
