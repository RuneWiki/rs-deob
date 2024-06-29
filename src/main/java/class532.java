import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class532 {

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "I")
    public int field7619;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "I")
    public int field7617;

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "I")
    public int field7618;

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "()V")
    public class532() {
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lpm;)V")
    public class532(class532 arg0) {
        this.field7619 = arg0.field7619;
        this.field7617 = arg0.field7617;
        this.field7618 = arg0.field7618;
    }
}
