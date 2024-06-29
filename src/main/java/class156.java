import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class156 extends class151 {

    @OriginalMember(owner = "client!qg", name = "s", descriptor = "[I")
    public static int[] field2045 = new int[2];

    @OriginalMember(owner = "client!qg", name = "v", descriptor = "I")
    public static int field2048 = 0;

    @OriginalMember(owner = "client!qg", name = "u", descriptor = "I")
    public static int field2047 = 0;

    @OriginalMember(owner = "client!qg", name = "t", descriptor = "Lqj;")
    public static class238 field2046;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(B)V", line = 10)
    public static void method999(byte arg0) {
        field2045 = null;
        field2046 = null;
        if (arg0 != 41) {
            method999((byte) 95);
        }
    }
}
