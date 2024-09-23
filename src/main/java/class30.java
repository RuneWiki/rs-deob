import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("LMGYBGQR")
public class class30 extends class47 {

    @OriginalMember(owner = "LMGYBGQR", name = "h", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "LMGYBGQR", name = "f", descriptor = "LLMGYBGQR;")
    public class30 field1017;

    @OriginalMember(owner = "LMGYBGQR", name = "g", descriptor = "LLMGYBGQR;")
    public class30 field1018;

    @OriginalMember(owner = "LMGYBGQR", name = "b", descriptor = "()V")
    public void method357() {
        if (this.field1018 != null) {
            this.field1018.field1017 = this.field1017;
            this.field1017.field1018 = this.field1018;
            this.field1017 = null;
            this.field1018 = null;
        }
    }
}
