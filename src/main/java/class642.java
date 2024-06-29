import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class642 {

    @OriginalMember(owner = "client!or", name = "a", descriptor = "I")
    public int field8905;

    @OriginalMember(owner = "client!or", name = "c", descriptor = "I")
    public int field8907;

    @OriginalMember(owner = "client!or", name = "d", descriptor = "I")
    public int field8908;

    @OriginalMember(owner = "client!or", name = "b", descriptor = "I")
    public int field8906;

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "()V")
    public class642() {
    }

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lor;)V")
    public class642(class642 arg0) {
        this.field8905 = arg0.field8905;
        this.field8907 = arg0.field8907;
        this.field8908 = arg0.field8908;
        this.field8906 = arg0.field8906;
    }
}
