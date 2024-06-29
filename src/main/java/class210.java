import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class210 {

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public int field2994;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    public int field2995;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
    public int field2996;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
    public int field2993;

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V", line = 6)
    public class210() {
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lob;)V", line = 8)
    public class210(class210 arg0) {
        this.field2994 = arg0.field2994;
        this.field2995 = arg0.field2995;
        this.field2996 = arg0.field2996;
        this.field2993 = arg0.field2993;
    }
}
