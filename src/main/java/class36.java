import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("NFNHZJTP")
public class class36 extends class2 {

    @OriginalMember(owner = "NFNHZJTP", name = "h", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "NFNHZJTP", name = "f", descriptor = "LNFNHZJTP;")
    public class36 field1131;

    @OriginalMember(owner = "NFNHZJTP", name = "g", descriptor = "LNFNHZJTP;")
    public class36 field1132;

    @OriginalMember(owner = "NFNHZJTP", name = "b", descriptor = "()V")
    public void method348() {
        if (this.field1132 != null) {
            this.field1132.field1131 = this.field1131;
            this.field1131.field1132 = this.field1132;
            this.field1131 = null;
            this.field1132 = null;
        }
    }
}
