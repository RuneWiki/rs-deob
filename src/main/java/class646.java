import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public class class646 {

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "I")
    public int field9392;

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "I")
    public int field9391;

    @OriginalMember(owner = "client!eca", name = "c", descriptor = "I")
    public int field9393;

    @OriginalMember(owner = "client!eca", name = "<init>", descriptor = "()V", line = 5)
    public class646() {
    }

    @OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(Leca;)V", line = 7)
    public class646(class646 arg0) {
        this.field9392 = arg0.field9392;
        this.field9391 = arg0.field9391;
        this.field9393 = arg0.field9393;
    }
}
