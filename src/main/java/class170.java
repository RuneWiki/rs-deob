import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class170 {

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "Z")
    public static boolean field2655 = false;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "Lmia;")
    public static class63 field2654 = new class63(13, 8);

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V", line = 6)
    public static void method1228(int arg0) {
        if (arg0 >= -9) {
            method1228(15);
        }
        field2654 = null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V", line = 17)
    public static final void method1229(byte arg0) {
        class729.field10214.method484(((float) class63.field916.field10190.method1967(17503) * 0.1F + 0.7F) * class698.field9624);
        int var1 = 78 % ((arg0 - 3) / 42);
        field2653++;
        class729.field10214.method460(class9.field135, class225.field3313, class444.field6599, (float) (class449.field6655 << 2), (float) (class586.field8314 << 2), (float) (class393.field5906 << 2));
        class729.field10214.method440(class633.field8865);
    }
}
