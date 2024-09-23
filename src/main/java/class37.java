import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("NTGUDCTQ")
public class class37 extends class1 {

    @OriginalMember(owner = "NTGUDCTQ", name = "g", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "NTGUDCTQ", name = "e", descriptor = "LNTGUDCTQ;")
    public class37 field1156;

    @OriginalMember(owner = "NTGUDCTQ", name = "f", descriptor = "LNTGUDCTQ;")
    public class37 field1157;

    @OriginalMember(owner = "NTGUDCTQ", name = "b", descriptor = "()V")
    public void method409() {
        if (this.field1157 != null) {
            this.field1157.field1156 = this.field1156;
            this.field1156.field1157 = this.field1157;
            this.field1156 = null;
            this.field1157 = null;
        }
    }
}
