import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("CJDGAOKT")
public class class6 extends class72 {

    @OriginalMember(owner = "CJDGAOKT", name = "e", descriptor = "Z")
    private boolean field102 = true;

    @OriginalMember(owner = "CJDGAOKT", name = "h", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "CJDGAOKT", name = "f", descriptor = "LCJDGAOKT;")
    public class6 field103;

    @OriginalMember(owner = "CJDGAOKT", name = "g", descriptor = "LCJDGAOKT;")
    public class6 field104;

    @OriginalMember(owner = "CJDGAOKT", name = "b", descriptor = "()V")
    public void method37() {
        if (this.field104 != null) {
            this.field104.field103 = this.field103;
            this.field103.field104 = this.field104;
            this.field103 = null;
            this.field104 = null;
        }
    }
}
