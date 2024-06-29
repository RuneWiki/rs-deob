import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class4 {

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "I")
    public int field19;

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "Z")
    public static boolean field20 = false;

    @OriginalMember(owner = "client!ft", name = "d", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "[Lio;")
    public static class308[] field21;

    @OriginalMember(owner = "client!ft", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field22++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(II)V")
    public class4(int arg0, int arg1) {
        this.field19 = arg0;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)V")
    public static void method11(int arg0) {
        if (arg0 != -4330) {
            method11(-15);
        }
        field21 = null;
    }
}
