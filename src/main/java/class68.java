import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("YLJOEYBF")
public class class68 extends class53 {

    @OriginalMember(owner = "YLJOEYBF", name = "g", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "YLJOEYBF", name = "e", descriptor = "LYLJOEYBF;")
    public class68 field1543;

    @OriginalMember(owner = "YLJOEYBF", name = "f", descriptor = "LYLJOEYBF;")
    public class68 field1544;

    @OriginalMember(owner = "YLJOEYBF", name = "b", descriptor = "()V")
    public void method545() {
        if (this.field1544 != null) {
            this.field1544.field1543 = this.field1543;
            this.field1543.field1544 = this.field1544;
            this.field1543 = null;
            this.field1544 = null;
        }
    }
}
