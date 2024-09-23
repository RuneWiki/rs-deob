import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("IHAIACWA")
public class class33 {

    @OriginalMember(owner = "IHAIACWA", name = "a", descriptor = "Z")
    private boolean field1005 = true;

    @OriginalMember(owner = "IHAIACWA", name = "b", descriptor = "J")
    public long field1006;

    @OriginalMember(owner = "IHAIACWA", name = "c", descriptor = "LIHAIACWA;")
    public class33 field1007;

    @OriginalMember(owner = "IHAIACWA", name = "d", descriptor = "LIHAIACWA;")
    public class33 field1008;

    @OriginalMember(owner = "IHAIACWA", name = "e", descriptor = "Z")
    public static boolean field1009;

    @OriginalMember(owner = "IHAIACWA", name = "a", descriptor = "()V")
    public void method379() {
        if (this.field1008 != null) {
            this.field1008.field1007 = this.field1007;
            this.field1007.field1008 = this.field1008;
            this.field1007 = null;
            this.field1008 = null;
        }
    }
}
