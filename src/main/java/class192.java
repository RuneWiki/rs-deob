import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class192 implements class684 {

    @OriginalMember(owner = "client!br", name = "a", descriptor = "I")
    public int field2654;

    @OriginalMember(owner = "client!br", name = "b", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!br", name = "c", descriptor = "Lba;")
    public static class661 field2656;

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 11)
    public class192(String arg0, int arg1) {
        this.field2654 = arg1;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(I)V", line = 24)
    public static void method1261(int arg0) {
        int var1 = 67 / ((arg0 + 10) / 61);
        field2656 = null;
    }

    @OriginalMember(owner = "client!br", name = "toString", descriptor = "()Ljava/lang/String;", line = 33)
    public final String toString() {
        field2655++;
        throw new IllegalStateException();
    }
}
