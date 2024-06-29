import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class339 {

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public int field5254;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public int field5252;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public int field5255;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public int field5253;

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V", line = 6)
    public class339() {
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Lfe;)V", line = 8)
    public class339(class339 arg0) {
        this.field5254 = arg0.field5254;
        this.field5252 = arg0.field5252;
        this.field5255 = arg0.field5255;
        this.field5253 = arg0.field5253;
    }
}
