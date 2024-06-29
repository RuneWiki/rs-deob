import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!EDVKOEOK")
public class class9 extends class41 {

    @OriginalMember(owner = "client!EDVKOEOK", name = "h", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!EDVKOEOK", name = "f", descriptor = "LEDVKOEOK;")
    public class9 field571;

    @OriginalMember(owner = "client!EDVKOEOK", name = "g", descriptor = "LEDVKOEOK;")
    public class9 field572;

    @OriginalMember(owner = "client!EDVKOEOK", name = "b", descriptor = "()V")
    public void method188() {
        if (this.field572 != null) {
            this.field572.field571 = this.field571;
            this.field571.field572 = this.field572;
            this.field571 = null;
            this.field572 = null;
        }
    }
}
