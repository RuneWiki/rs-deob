import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ZAQWNGNJ")
public class class70 extends class15 {

    @OriginalMember(owner = "ZAQWNGNJ", name = "e", descriptor = "I")
    private int field1636 = 2;

    @OriginalMember(owner = "ZAQWNGNJ", name = "h", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "ZAQWNGNJ", name = "f", descriptor = "LZAQWNGNJ;")
    public class70 field1637;

    @OriginalMember(owner = "ZAQWNGNJ", name = "g", descriptor = "LZAQWNGNJ;")
    public class70 field1638;

    @OriginalMember(owner = "ZAQWNGNJ", name = "b", descriptor = "()V")
    public void method537() {
        if (this.field1638 != null) {
            this.field1638.field1637 = this.field1637;
            this.field1637.field1638 = this.field1638;
            this.field1637 = null;
            this.field1638 = null;
        }
    }
}
