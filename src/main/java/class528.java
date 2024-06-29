import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!efa")
public class class528 {

    @OriginalMember(owner = "client!efa", name = "c", descriptor = "I")
    public static int field7378 = 1;

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "[I")
    public static int[] field7376 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!efa", name = "b", descriptor = "I")
    public static int field7377;

    @OriginalMember(owner = "client!efa", name = "d", descriptor = "I")
    public static int field7379;

    @OriginalMember(owner = "client!efa", name = "e", descriptor = "I")
    public static int field7380;

    @OriginalMember(owner = "client!efa", name = "toString", descriptor = "()Ljava/lang/String;", line = 7)
    public final String toString() {
        field7377++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(I)V", line = 26)
    public static void method3138(int arg0) {
        field7376 = null;
        if (arg0 != -28651) {
            method3138(116);
        }
    }
}
