import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("UXRJCYSS")
public class class60 extends class67 {

    @OriginalMember(owner = "UXRJCYSS", name = "g", descriptor = "Z")
    private boolean field1521 = true;

    @OriginalMember(owner = "UXRJCYSS", name = "j", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "UXRJCYSS", name = "h", descriptor = "LUXRJCYSS;")
    public class60 field1522;

    @OriginalMember(owner = "UXRJCYSS", name = "i", descriptor = "LUXRJCYSS;")
    public class60 field1523;

    @OriginalMember(owner = "UXRJCYSS", name = "b", descriptor = "()V")
    public void method564() {
        if (this.field1523 != null) {
            this.field1523.field1522 = this.field1522;
            this.field1522.field1523 = this.field1523;
            this.field1522 = null;
            this.field1523 = null;
        }
    }
}
