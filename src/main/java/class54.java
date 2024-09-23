import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("OWNYSRQV")
public class class54 {

    @OriginalMember(owner = "OWNYSRQV", name = "a", descriptor = "J")
    public long field1298;

    @OriginalMember(owner = "OWNYSRQV", name = "b", descriptor = "LOWNYSRQV;")
    public class54 field1299;

    @OriginalMember(owner = "OWNYSRQV", name = "c", descriptor = "LOWNYSRQV;")
    public class54 field1300;

    @OriginalMember(owner = "OWNYSRQV", name = "d", descriptor = "Z")
    public static boolean field1301;

    @OriginalMember(owner = "OWNYSRQV", name = "a", descriptor = "()V")
    public void method334() {
        if (this.field1300 != null) {
            this.field1300.field1299 = this.field1299;
            this.field1299.field1300 = this.field1300;
            this.field1299 = null;
            this.field1300 = null;
        }
    }
}
