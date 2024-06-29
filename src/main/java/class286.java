import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class286 {

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "Lpu;")
    public static class522 field4266;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "[Lrga;")
    public static class215[] field4268;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)I", line = 10)
    public static final int method1838(int arg0, int arg1) {
        if (arg0 > -21) {
            return -49;
        } else {
            field4267++;
            return arg1 >>> 8;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V", line = 22)
    public static void method1839(byte arg0) {
        field4266 = null;
        if (arg0 != 1) {
            method1839((byte) -19);
        }
        field4268 = null;
    }
}
