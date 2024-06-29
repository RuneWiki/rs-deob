import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!OHSXMHUZ")
public class class42 extends class3 {

    @OriginalMember(owner = "client!OHSXMHUZ", name = "g", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!OHSXMHUZ", name = "e", descriptor = "LOHSXMHUZ;")
    public class42 field1259;

    @OriginalMember(owner = "client!OHSXMHUZ", name = "f", descriptor = "LOHSXMHUZ;")
    public class42 field1260;

    @OriginalMember(owner = "client!OHSXMHUZ", name = "b", descriptor = "()V")
    public void method432() {
        if (this.field1260 != null) {
            this.field1260.field1259 = this.field1259;
            this.field1259.field1260 = this.field1260;
            this.field1259 = null;
            this.field1260 = null;
        }
    }
}
