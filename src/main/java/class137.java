import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class137 {

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "[I")
    public static int[] field2330;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(III)Z", line = 3)
    public static final boolean method1184(int arg0, int arg1, int arg2) {
        field2331++;
        if (arg0 == 1024) {
            return (arg2 & 0x400) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V", line = 16)
    public static void method1185(byte arg0) {
        field2330 = null;
        if (arg0 <= 117) {
            field2330 = null;
        }
    }
}
