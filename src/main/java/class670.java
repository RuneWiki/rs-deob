import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class670 {

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public int field9444;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public static int field9446 = 0;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public static int field9443;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public static int field9445;

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 8)
    public class670(String arg0, int arg1) {
        this.field9444 = arg1;
    }

    @OriginalMember(owner = "client!cc", name = "toString", descriptor = "()Ljava/lang/String;", line = 23)
    public final String toString() {
        field9443++;
        throw new IllegalStateException();
    }
}
