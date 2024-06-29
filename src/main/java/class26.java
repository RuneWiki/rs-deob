import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public class class26 {

    @OriginalMember(owner = "client!qaa", name = "b", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "Lck;")
    public static class595 field417;

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(IBI)Z")
    public static final boolean method420(int arg0, byte arg1, int arg2) {
        field418++;
        if (arg1 > -56) {
            method421(56);
        }
        return class396.method2558((byte) -18, arg0, arg2) | (arg0 & 0x40000) != 0 || class136.method1170(18, arg2, arg0);
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(I)V")
    public static void method421(int arg0) {
        if (arg0 != 0) {
            field417 = null;
        }
        field417 = null;
    }
}
