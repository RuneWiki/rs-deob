import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!KWULTEKW")
public class class28 extends class34 {

    @OriginalMember(owner = "client!KWULTEKW", name = "g", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!KWULTEKW", name = "e", descriptor = "LKWULTEKW;")
    public class28 field1034;

    @OriginalMember(owner = "client!KWULTEKW", name = "f", descriptor = "LKWULTEKW;")
    public class28 field1035;

    @OriginalMember(owner = "client!KWULTEKW", name = "b", descriptor = "()V")
    public void method330() {
        if (this.field1035 != null) {
            this.field1035.field1034 = this.field1034;
            this.field1034.field1035 = this.field1035;
            this.field1034 = null;
            this.field1035 = null;
        }
    }
}
