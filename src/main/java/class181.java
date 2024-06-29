import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class181 {

    @OriginalMember(owner = "client!up", name = "b", descriptor = "[I")
    public static int[] field2392 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!up", name = "a", descriptor = "Ldq;")
    public static class493 field2391 = new class493(76, 7);

    @OriginalMember(owner = "client!up", name = "c", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!up", name = "d", descriptor = "Ldq;")
    public static class493 field2394;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(B)V")
    public static void method1154(byte arg0) {
        field2392 = null;
        if (arg0 != -58) {
            method1154((byte) -85);
        }
        field2391 = null;
        field2394 = null;
    }

    @OriginalMember(owner = "client!up", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2393++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!up", name = "<init>", descriptor = "(II)V")
    public class181(int arg0, int arg1) {
    }
}
