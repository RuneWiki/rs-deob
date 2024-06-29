import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class36 {

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "I")
    public int field494;

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "I")
    public int field496;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "I")
    public int field493;

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "I")
    public int field495;

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "()V", line = 6)
    public class36() {
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Ldm;)V", line = 8)
    public class36(class36 arg0) {
        this.field494 = arg0.field494;
        this.field496 = arg0.field496;
        this.field493 = arg0.field493;
        this.field495 = arg0.field495;
    }
}
