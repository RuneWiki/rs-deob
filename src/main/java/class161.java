import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public class class161 {

    @OriginalMember(owner = "client!dca", name = "c", descriptor = "Lhga;")
    public static class158 field2738 = new class158(15, 7);

    @OriginalMember(owner = "client!dca", name = "d", descriptor = "Lws;")
    public static class328 field2739 = new class328(14, 4);

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!dca", name = "b", descriptor = "Lsw;")
    public static class701 field2737;

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(B)V")
    public static void method1321(byte arg0) {
        field2738 = null;
        int var1 = 90 / ((4 - arg0) / 50);
        field2739 = null;
        field2737 = null;
    }

    @OriginalMember(owner = "client!dca", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2736++;
        throw new IllegalStateException();
    }
}
