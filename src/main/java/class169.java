import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public abstract class class169 {

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    public static int field2443 = 0;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "[I")
    public static int[] field2444;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Ldg;B)Ldg;")
    public abstract class283 method1118(class283 arg0, byte arg1);

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)V")
    public static void method1119(byte arg0) {
        field2444 = null;
        if (arg0 < 50) {
            method1119((byte) -64);
        }
    }
}
