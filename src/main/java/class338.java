import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class338 {

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public int field4951;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "[Lfq;")
    public static class463[] field4948 = new class463[14];

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "Lcb;")
    public static class318 field4950 = new class318(63, 7);

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
    public static int field4949;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)V", line = 9)
    public static void method2150(byte arg0) {
        if (arg0 != 53) {
            method2150((byte) 29);
        }
        field4950 = null;
        field4948 = null;
    }

    @OriginalMember(owner = "client!aj", name = "toString", descriptor = "()Ljava/lang/String;", line = 24)
    public final String toString() {
        field4949++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(II)V", line = 35)
    public class338(int arg0, int arg1) {
        this.field4951 = arg0;
    }
}
