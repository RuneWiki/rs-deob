import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class19 {

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    public int field290;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    public int field289;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    public int field291;

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V", line = 5)
    public class19() {
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lma;)V", line = 7)
    public class19(class19 arg0) {
        this.field290 = arg0.field290;
        this.field289 = arg0.field289;
        this.field291 = arg0.field291;
    }
}
