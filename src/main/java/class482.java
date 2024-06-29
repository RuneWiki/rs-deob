import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class482 {

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public int field6767;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public int field6768;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public int field6769;

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V", line = 5)
    public class482() {
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Llc;)V", line = 7)
    public class482(class482 arg0) {
        this.field6767 = arg0.field6767;
        this.field6768 = arg0.field6768;
        this.field6769 = arg0.field6769;
    }
}
