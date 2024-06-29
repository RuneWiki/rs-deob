import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class309 {

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "Z")
    public static boolean field4235 = false;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "Z")
    public static boolean field4238 = false;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "Ljava/lang/String;")
    public static String field4239 = "Loading sprites - ";

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "[I")
    public static int[] field4242 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "Lqj;")
    public static class296 field4240;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "[Z")
    public static boolean[] field4241;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V", line = 3)
    public static void method1959(int arg0) {
        field4239 = null;
        field4240 = null;
        field4242 = null;
        field4241 = null;
        if (arg0 != 20883) {
            method1960((byte) -57);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V", line = 16)
    public static final void method1960(byte arg0) {
        int var1 = -117 % ((arg0 + 26) / 38);
        field4237++;
        class176.field2485.method1243(1000);
        class248.field3438.method1243(1000);
    }
}
