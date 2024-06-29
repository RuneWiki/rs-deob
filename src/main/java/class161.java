import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class161 {

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "[[B")
    public static byte[][] field2454 = new byte[50][];

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "Z")
    public static boolean field2455 = false;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "Z")
    public static boolean field2456 = false;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
    public static void method1173(byte arg0) {
        if (arg0 != 39) {
            method1173((byte) 65);
        }
        field2454 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IB)V")
    public static final void method1174(int arg0, byte arg1) {
        field2453++;
        int var2 = 123 / ((arg1 + 40) / 47);
        class275 var3 = class213.method1433((byte) 121, 12, arg0);
        var3.method1774((byte) -42);
    }
}
