import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class229 implements class269 {

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "I")
    public int field2987;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!ej", name = "toString", descriptor = "()Ljava/lang/String;", line = 3)
    public final String toString() {
        field2986++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 23)
    public class229(String arg0, int arg1) {
        this.field2987 = arg1;
    }
}
