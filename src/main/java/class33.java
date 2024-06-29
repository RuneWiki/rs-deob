import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!KGLULAMW")
public class class33 extends class67 {

    @OriginalMember(owner = "client!KGLULAMW", name = "e", descriptor = "Z")
    private boolean field1133 = false;

    @OriginalMember(owner = "client!KGLULAMW", name = "h", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!KGLULAMW", name = "f", descriptor = "LKGLULAMW;")
    public class33 field1134;

    @OriginalMember(owner = "client!KGLULAMW", name = "g", descriptor = "LKGLULAMW;")
    public class33 field1135;

    @OriginalMember(owner = "client!KGLULAMW", name = "b", descriptor = "()V")
    public void method373() {
        if (this.field1135 != null) {
            this.field1135.field1134 = this.field1134;
            this.field1134.field1135 = this.field1135;
            this.field1134 = null;
            this.field1135 = null;
        }
    }
}
