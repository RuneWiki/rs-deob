import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class721 {

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "Ljw;")
    public static class581 field10049 = new class581(40, 2);

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "I")
    public static int field10050;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(III)Z", line = 3)
    public static final boolean method4023(int arg0, int arg1, int arg2) {
        if (arg1 != 2) {
            field10049 = null;
        }
        field10050++;
        return class648.method3622((byte) -80, arg2, arg0) || class647.method3617(arg2, arg0, (byte) -49);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)V", line = 14)
    public static void method4024(byte arg0) {
        if (arg0 == -33) {
            field10049 = null;
        }
    }
}
