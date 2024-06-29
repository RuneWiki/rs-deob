import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class346 {

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public int field5134;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public int field5135;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public int field5136;

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V", line = 5)
    public class346() {
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lce;)V", line = 7)
    public class346(class346 arg0) {
        this.field5134 = arg0.field5134;
        this.field5135 = arg0.field5135;
        this.field5136 = arg0.field5136;
    }
}
