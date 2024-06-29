import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class222 {

    @OriginalMember(owner = "client!er", name = "b", descriptor = "Lwga;")
    public static class506 field2913 = new class506();

    @OriginalMember(owner = "client!er", name = "d", descriptor = "Lus;")
    public static class328 field2915 = new class328(62, 3);

    @OriginalMember(owner = "client!er", name = "a", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!er", name = "c", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(III)I")
    public static final int method1440(int arg0, int arg1, int arg2) {
        field2914++;
        int var3 = arg0 - 1 & arg1 >> 31;
        return arg2 == -31781 ? ((arg1 >>> 31) + arg1) % arg0 + var3 : 2;
    }

    @OriginalMember(owner = "client!er", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2912++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(B)V")
    public static void method1441(byte arg0) {
        if (arg0 == -88) {
            field2915 = null;
            field2913 = null;
        }
    }
}
