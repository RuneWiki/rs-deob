import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class246 extends class14 {

    @OriginalMember(owner = "client!mn", name = "J", descriptor = "I")
    public static int field3275 = -1;

    @OriginalMember(owner = "client!mn", name = "L", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!mn", name = "K", descriptor = "[Lf;")
    public static class529[] field3276;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IB)[I", line = 3)
    public final int[] method140(int arg0, byte arg1) {
        if (arg1 >= -2) {
            this.method140(119, (byte) 68);
        }
        field3277++;
        return class195.field2715;
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "()V", line = 14)
    public class246() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "(B)V", line = 17)
    public static void method1497(byte arg0) {
        field3276 = null;
        if (arg0 != -99) {
            method1497((byte) -4);
        }
    }
}
