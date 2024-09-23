import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("RZDMTEAZ")
public class class49 extends class8 {

    @OriginalMember(owner = "RZDMTEAZ", name = "e", descriptor = "I")
    private int field1413 = -173;

    @OriginalMember(owner = "RZDMTEAZ", name = "h", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "RZDMTEAZ", name = "f", descriptor = "LRZDMTEAZ;")
    public class49 field1414;

    @OriginalMember(owner = "RZDMTEAZ", name = "g", descriptor = "LRZDMTEAZ;")
    public class49 field1415;

    @OriginalMember(owner = "RZDMTEAZ", name = "b", descriptor = "()V")
    public void method495() {
        if (this.field1415 != null) {
            this.field1415.field1414 = this.field1414;
            this.field1414.field1415 = this.field1415;
            this.field1414 = null;
            this.field1415 = null;
        }
    }
}
