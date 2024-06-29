import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!JRQYDGTL")
public class class27 extends class16 {

    @OriginalMember(owner = "client!JRQYDGTL", name = "l", descriptor = "Z")
    private boolean field905 = true;

    @OriginalMember(owner = "client!JRQYDGTL", name = "m", descriptor = "I")
    public int field906;

    @OriginalMember(owner = "client!JRQYDGTL", name = "n", descriptor = "I")
    public int field907;

    @OriginalMember(owner = "client!JRQYDGTL", name = "a", descriptor = "(Z)LWRJMHIDY;")
    public final class61 method174(boolean arg0) {
        if (arg0) {
            this.field905 = !this.field905;
        }
        class51 var2 = class51.method433(this.field906);
        return var2.method427(this.field907);
    }
}
