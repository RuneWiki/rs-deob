import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!USMRNXZO")
public class class57 extends class27 {

    @OriginalMember(owner = "client!USMRNXZO", name = "g", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!USMRNXZO", name = "e", descriptor = "LUSMRNXZO;")
    public class57 field1486;

    @OriginalMember(owner = "client!USMRNXZO", name = "f", descriptor = "LUSMRNXZO;")
    public class57 field1487;

    @OriginalMember(owner = "client!USMRNXZO", name = "b", descriptor = "()V")
    public void method531() {
        if (this.field1487 != null) {
            this.field1487.field1486 = this.field1486;
            this.field1486.field1487 = this.field1487;
            this.field1486 = null;
            this.field1487 = null;
        }
    }
}
