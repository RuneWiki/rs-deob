import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!YCAZQYJA")
public class class68 extends class13 {

    @OriginalMember(owner = "client!YCAZQYJA", name = "e", descriptor = "I")
    private int field1704 = 11419;

    @OriginalMember(owner = "client!YCAZQYJA", name = "h", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!YCAZQYJA", name = "f", descriptor = "LYCAZQYJA;")
    public class68 field1705;

    @OriginalMember(owner = "client!YCAZQYJA", name = "g", descriptor = "LYCAZQYJA;")
    public class68 field1706;

    @OriginalMember(owner = "client!YCAZQYJA", name = "b", descriptor = "()V")
    public void method583() {
        if (this.field1706 != null) {
            this.field1706.field1705 = this.field1705;
            this.field1705.field1706 = this.field1706;
            this.field1705 = null;
            this.field1706 = null;
        }
    }
}
