import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!YPOWJZIQ")
public class class64 extends class34 {

    @OriginalMember(owner = "client!YPOWJZIQ", name = "f", descriptor = "Z")
    private boolean field1551 = false;

    @OriginalMember(owner = "client!YPOWJZIQ", name = "i", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!YPOWJZIQ", name = "g", descriptor = "LYPOWJZIQ;")
    public class64 field1552;

    @OriginalMember(owner = "client!YPOWJZIQ", name = "h", descriptor = "LYPOWJZIQ;")
    public class64 field1553;

    @OriginalMember(owner = "client!YPOWJZIQ", name = "b", descriptor = "()V")
    public void method499() {
        if (this.field1553 != null) {
            this.field1553.field1552 = this.field1552;
            this.field1552.field1553 = this.field1553;
            this.field1552 = null;
            this.field1553 = null;
        }
    }
}
