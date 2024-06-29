import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class125 extends class287 {

    @OriginalMember(owner = "client!cl", name = "s", descriptor = "[B")
    public byte[] field2100;

    @OriginalMember(owner = "client!cl", name = "u", descriptor = "Lmh;")
    private static class128 field2102 = class22.method156(122, "Connecting to update server");

    @OriginalMember(owner = "client!cl", name = "w", descriptor = "Lmh;")
    public static class128 field2104 = field2102;

    @OriginalMember(owner = "client!cl", name = "r", descriptor = "[I")
    public static int[] field2099 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!cl", name = "x", descriptor = "Lmh;")
    public static class128 field2105 = class22.method156(122, "Weiter");

    @OriginalMember(owner = "client!cl", name = "t", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!cl", name = "v", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!cl", name = "y", descriptor = "[I")
    public static int[] field2106;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)Z", line = 10)
    public static final boolean method767(int arg0, int arg1) {
        field2101++;
        if (arg1 == 16711935) {
            return ((arg0 & 0x2F053A3E) >> 29) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "([B)V", line = 20)
    public class125(byte[] arg0) {
        this.field2100 = arg0;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(B)V", line = 34)
    public static void method768(byte arg0) {
        int var1 = -20 / ((arg0 + 28) / 58);
        field2106 = null;
        field2105 = null;
        field2099 = null;
        field2102 = null;
        field2104 = null;
    }
}
