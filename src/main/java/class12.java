import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class12 {

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "I")
    public int field137;

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "I")
    public int field139;

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "I")
    public int field138;

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "I")
    public int field140;

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "()V")
    public class12() {
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Lfo;)V")
    public class12(class12 arg0) {
        this.field137 = arg0.field137;
        this.field139 = arg0.field139;
        this.field138 = arg0.field138;
        this.field140 = arg0.field140;
    }
}
