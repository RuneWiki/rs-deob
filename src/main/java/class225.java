import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class225 {

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public int field3178;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public int field3177;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public int field3176;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    public int field3179;

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V")
    public class225() {
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lhf;)V")
    public class225(class225 arg0) {
        this.field3178 = arg0.field3178;
        this.field3177 = arg0.field3177;
        this.field3176 = arg0.field3176;
        this.field3179 = arg0.field3179;
    }
}
