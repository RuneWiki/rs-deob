import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!UCIRENXU")
public class class55 extends class35 {

    @OriginalMember(owner = "client!UCIRENXU", name = "f", descriptor = "Z")
    private boolean field1259 = false;

    @OriginalMember(owner = "client!UCIRENXU", name = "i", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!UCIRENXU", name = "g", descriptor = "LUCIRENXU;")
    public class55 field1260;

    @OriginalMember(owner = "client!UCIRENXU", name = "h", descriptor = "LUCIRENXU;")
    public class55 field1261;

    @OriginalMember(owner = "client!UCIRENXU", name = "b", descriptor = "()V")
    public void method456() {
        if (this.field1261 != null) {
            this.field1261.field1260 = this.field1260;
            this.field1260.field1261 = this.field1261;
            this.field1260 = null;
            this.field1261 = null;
        }
    }
}
