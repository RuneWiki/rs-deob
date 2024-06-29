import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class380 {

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "I")
    public int field5441;

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "I")
    public int field5442;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "I")
    public int field5440;

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "()V")
    public class380() {
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lpm;)V")
    public class380(class380 arg0) {
        this.field5441 = arg0.field5441;
        this.field5442 = arg0.field5442;
        this.field5440 = arg0.field5440;
    }
}
