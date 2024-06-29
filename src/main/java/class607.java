import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class607 implements class84 {

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "I")
    public int field8509;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "Z")
    public static boolean field8507 = false;

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "I")
    public static int field8508;

    @OriginalMember(owner = "client!ht", name = "toString", descriptor = "()Ljava/lang/String;", line = 14)
    public final String toString() {
        field8508++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 28)
    public class607(String arg0, int arg1) {
        this.field8509 = arg1;
    }
}
