import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class26 {

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "I")
    public int field276;

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "I")
    public int field278;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "I")
    public int field275;

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "I")
    public int field277;

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "()V")
    public class26() {
    }

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Lir;)V")
    public class26(class26 arg0) {
        this.field276 = arg0.field276;
        this.field278 = arg0.field278;
        this.field275 = arg0.field275;
        this.field277 = arg0.field277;
    }
}
