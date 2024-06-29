import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class305 {

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
    public int field3890;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "I")
    public int field3889;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
    public int field3888;

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "()V", line = 5)
    public class305() {
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Lll;)V", line = 7)
    public class305(class305 arg0) {
        this.field3890 = arg0.field3890;
        this.field3889 = arg0.field3889;
        this.field3888 = arg0.field3888;
    }
}
