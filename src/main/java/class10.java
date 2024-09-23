import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("CYIKEZWP")
public class class10 extends class33 {

    @OriginalMember(owner = "CYIKEZWP", name = "h", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "CYIKEZWP", name = "f", descriptor = "LCYIKEZWP;")
    public class10 field595;

    @OriginalMember(owner = "CYIKEZWP", name = "g", descriptor = "LCYIKEZWP;")
    public class10 field596;

    @OriginalMember(owner = "CYIKEZWP", name = "b", descriptor = "()V")
    public void method177() {
        if (this.field596 != null) {
            this.field596.field595 = this.field595;
            this.field595.field596 = this.field596;
            this.field595 = null;
            this.field596 = null;
        }
    }
}
