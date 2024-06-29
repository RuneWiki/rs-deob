import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!PFQOGDTY")
public class class48 extends class57 {

    @OriginalMember(owner = "client!PFQOGDTY", name = "f", descriptor = "Z")
    private boolean field1413 = true;

    @OriginalMember(owner = "client!PFQOGDTY", name = "i", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!PFQOGDTY", name = "g", descriptor = "LPFQOGDTY;")
    public class48 field1414;

    @OriginalMember(owner = "client!PFQOGDTY", name = "h", descriptor = "LPFQOGDTY;")
    public class48 field1415;

    @OriginalMember(owner = "client!PFQOGDTY", name = "b", descriptor = "()V")
    public void method423() {
        if (this.field1415 != null) {
            this.field1415.field1414 = this.field1414;
            this.field1414.field1415 = this.field1415;
            this.field1414 = null;
            this.field1415 = null;
        }
    }
}
