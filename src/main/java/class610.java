import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class610 {

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "I")
    public static int field8306;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "Ldr;")
    public static class675 field8305;

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "[I")
    public static int[] field8307;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIB)Z", line = 11)
    public static final boolean method3423(int arg0, int arg1, byte arg2) {
        if (arg2 == -59) {
            field8306++;
            return (arg0 & 0x70000) != 0 | class253.method1525(arg0, arg1, (byte) 106) || class632.method3547((byte) 104, arg0, arg1);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)V", line = 24)
    public static void method3424(int arg0) {
        if (arg0 == -13226) {
            field8307 = null;
            field8305 = null;
        }
    }
}
