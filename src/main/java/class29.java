import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!KIFEZIQJ")
public class class29 extends class45 {

    @OriginalMember(owner = "client!KIFEZIQJ", name = "g", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!KIFEZIQJ", name = "e", descriptor = "LKIFEZIQJ;")
    public class29 field1003;

    @OriginalMember(owner = "client!KIFEZIQJ", name = "f", descriptor = "LKIFEZIQJ;")
    public class29 field1004;

    @OriginalMember(owner = "client!KIFEZIQJ", name = "b", descriptor = "()V")
    public void method352() {
        if (this.field1004 != null) {
            this.field1004.field1003 = this.field1003;
            this.field1003.field1004 = this.field1004;
            this.field1003 = null;
            this.field1004 = null;
        }
    }
}
