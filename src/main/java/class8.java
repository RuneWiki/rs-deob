import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("BIJRHVKA")
public class class8 extends class30 {

    @OriginalMember(owner = "BIJRHVKA", name = "g", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "BIJRHVKA", name = "e", descriptor = "LBIJRHVKA;")
    public class8 field149;

    @OriginalMember(owner = "BIJRHVKA", name = "f", descriptor = "LBIJRHVKA;")
    public class8 field150;

    @OriginalMember(owner = "BIJRHVKA", name = "b", descriptor = "()V")
    public void method35() {
        if (this.field150 != null) {
            this.field150.field149 = this.field149;
            this.field149.field150 = this.field150;
            this.field149 = null;
            this.field150 = null;
        }
    }
}
