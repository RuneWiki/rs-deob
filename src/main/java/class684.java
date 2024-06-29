import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class684 {

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public static int field9355;

    @OriginalMember(owner = "client!fj", name = "toString", descriptor = "()Ljava/lang/String;", line = 9)
    public final String toString() {
        field9355++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(II)V", line = 16)
    public class684(int arg0, int arg1) {
    }
}
