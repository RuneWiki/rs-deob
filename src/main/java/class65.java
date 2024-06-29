import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!YBEHHNFF")
public class class65 extends class8 {

    @OriginalMember(owner = "client!YBEHHNFF", name = "g", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!YBEHHNFF", name = "e", descriptor = "LYBEHHNFF;")
    public class65 field1704;

    @OriginalMember(owner = "client!YBEHHNFF", name = "f", descriptor = "LYBEHHNFF;")
    public class65 field1705;

    @OriginalMember(owner = "client!YBEHHNFF", name = "b", descriptor = "()V")
    public void method567() {
        if (this.field1705 != null) {
            this.field1705.field1704 = this.field1704;
            this.field1704.field1705 = this.field1705;
            this.field1704 = null;
            this.field1705 = null;
        }
    }
}
