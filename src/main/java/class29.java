import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class29 extends class626 {

    @OriginalMember(owner = "client!o", name = "i", descriptor = "Ljava/lang/String;")
    public String field399;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "Z")
    public static boolean field398 = false;

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V", line = 12)
    public class29() {
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 14)
    public class29(String arg0, int arg1) {
        this.field399 = arg0;
    }
}
