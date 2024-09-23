import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("JJFDBATQ")
public class class30 extends class72 {

    @OriginalMember(owner = "JJFDBATQ", name = "h", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "JJFDBATQ", name = "f", descriptor = "LJJFDBATQ;")
    public class30 field945;

    @OriginalMember(owner = "JJFDBATQ", name = "g", descriptor = "LJJFDBATQ;")
    public class30 field946;

    @OriginalMember(owner = "JJFDBATQ", name = "b", descriptor = "()V")
    public void method278() {
        if (this.field946 != null) {
            this.field946.field945 = this.field945;
            this.field945.field946 = this.field946;
            this.field945 = null;
            this.field946 = null;
        }
    }
}
