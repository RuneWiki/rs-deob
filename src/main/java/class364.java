import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class364 {

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
    public int field5113;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    public int field5115;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    public int field5114;

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V", line = 5)
    public class364() {
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lrg;)V", line = 7)
    public class364(class364 arg0) {
        this.field5113 = arg0.field5113;
        this.field5115 = arg0.field5115;
        this.field5114 = arg0.field5114;
    }
}
