import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("WLTWEDNK")
public class class61 extends class64 {

    @OriginalMember(owner = "WLTWEDNK", name = "e", descriptor = "Z")
    private boolean field1565 = true;

    @OriginalMember(owner = "WLTWEDNK", name = "h", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "WLTWEDNK", name = "f", descriptor = "LWLTWEDNK;")
    public class61 field1566;

    @OriginalMember(owner = "WLTWEDNK", name = "g", descriptor = "LWLTWEDNK;")
    public class61 field1567;

    @OriginalMember(owner = "WLTWEDNK", name = "b", descriptor = "()V")
    public void method524() {
        if (this.field1567 != null) {
            this.field1567.field1566 = this.field1566;
            this.field1566.field1567 = this.field1567;
            this.field1566 = null;
            this.field1567 = null;
        }
    }
}
