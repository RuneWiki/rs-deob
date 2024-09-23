import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("EWMBJETC")
public class class13 extends class40 {

    @OriginalMember(owner = "EWMBJETC", name = "e", descriptor = "Z")
    private boolean field708 = true;

    @OriginalMember(owner = "EWMBJETC", name = "h", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "EWMBJETC", name = "f", descriptor = "LEWMBJETC;")
    public class13 field709;

    @OriginalMember(owner = "EWMBJETC", name = "g", descriptor = "LEWMBJETC;")
    public class13 field710;

    @OriginalMember(owner = "EWMBJETC", name = "b", descriptor = "()V")
    public void method209() {
        if (this.field710 != null) {
            this.field710.field709 = this.field709;
            this.field709.field710 = this.field710;
            this.field709 = null;
            this.field710 = null;
        }
    }
}
