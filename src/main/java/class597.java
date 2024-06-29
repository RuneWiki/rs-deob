import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class597 {

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "[I")
    public static int[] field8426 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "I")
    public static int field8425;

    @OriginalMember(owner = "client!cr", name = "toString", descriptor = "()Ljava/lang/String;", line = 4)
    public final String toString() {
        field8425++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)V", line = 12)
    public static void method3452(int arg0) {
        if (arg0 != 36070) {
            field8426 = null;
        }
        field8426 = null;
    }
}
