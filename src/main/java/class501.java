import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nha")
public class class501 implements class370 {

    @OriginalMember(owner = "client!nha", name = "b", descriptor = "I")
    public int field7063;

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "Z")
    public static boolean field7062 = true;

    @OriginalMember(owner = "client!nha", name = "d", descriptor = "I")
    public static int field7065 = 0;

    @OriginalMember(owner = "client!nha", name = "c", descriptor = "I")
    public static int field7064;

    @OriginalMember(owner = "client!nha", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class501(String arg0, int arg1) {
        this.field7063 = arg1;
    }

    @OriginalMember(owner = "client!nha", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7064++;
        throw new IllegalStateException();
    }
}
